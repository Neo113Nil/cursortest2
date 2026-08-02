package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.NetworkClientBuilder;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f15181a;

    /* renamed from: b, reason: collision with root package name */
    public final InterruptionSafeThread f15182b;

    /* renamed from: c, reason: collision with root package name */
    public final f f15183c;

    public h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, f fVar) {
        this.f15181a = networkTask;
        this.f15182b = interruptionSafeThread;
        this.f15183c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        byte[] postData;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f15181a.getExponentialBackoffPolicy();
        boolean canBeExecuted = this.f15181a.getConnectionExecutionPolicy().canBeExecuted();
        boolean canBeExecuted2 = this.f15181a.getExponentialBackoffPolicy().canBeExecuted(this.f15181a.getRetryPolicyConfig());
        if (!this.f15182b.isRunning() || !canBeExecuted || !canBeExecuted2) {
            this.f15181a.onShouldNotExecute();
            return;
        }
        boolean onCreateNetworkTask = this.f15181a.onCreateNetworkTask();
        Boolean bool = null;
        while (this.f15182b.isRunning() && onCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f15181a.getRetryPolicyConfig())) {
            f fVar = this.f15183c;
            NetworkTask networkTask = this.f15181a;
            fVar.getClass();
            boolean z7 = false;
            if (networkTask.onPerformRequest()) {
                String url = networkTask.getUrl();
                if (url == null || TextUtils.isEmpty(StringsKt.Z(url).toString())) {
                    StringBuilder sb2 = new StringBuilder("Task ");
                    sb2.append(networkTask.description());
                    sb2.append(" url is `");
                    sb2.append(url);
                    sb2.append("`. All hosts = ");
                    List<String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                    sb2.append(allHosts != null ? allHosts.toString() : null);
                    networkTask.onRequestError(new IllegalArgumentException(sb2.toString()));
                } else {
                    Request.Builder addHeader = new Request.Builder(url).addHeader("Accept", "application/json").addHeader("User-Agent", networkTask.getUserAgent());
                    RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                    Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        addHeader.addHeader((String) entry.getKey(), CollectionsKt.J((Iterable) entry.getValue(), StringUtils.COMMA, null, null, null, 62));
                    }
                    if (NetworkTask.Method.POST == requestDataHolder.getMethod() && (postData = requestDataHolder.getPostData()) != null) {
                        if (!(postData.length == 0)) {
                            addHeader.withMethod(Request.Method.POST);
                            addHeader.withBody(postData);
                            Long sendTimestamp = requestDataHolder.getSendTimestamp();
                            if (sendTimestamp != null) {
                                addHeader.addHeader("Send-Timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(sendTimestamp.longValue())));
                            }
                            Integer sendTimezoneSec = requestDataHolder.getSendTimezoneSec();
                            if (sendTimezoneSec != null) {
                                addHeader.addHeader("Send-Timezone", String.valueOf(sendTimezoneSec.intValue()));
                            }
                        }
                    }
                    NetworkClientBuilder networkClientBuilder = new NetworkClientBuilder();
                    NetworkClientSettings.Builder builder = new NetworkClientSettings.Builder();
                    int i5 = b.f15177a;
                    Response execute = networkClientBuilder.withSettings(builder.withConnectTimeout(i5).withReadTimeout(i5).withSslSocketFactory(networkTask.getSslSocketFactory()).build()).build().newCall(addHeader.build()).execute();
                    int code = execute.getCode();
                    ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
                    responseDataHolder.setResponseCode(code);
                    responseDataHolder.setResponseHeaders(CollectionUtils.convertMapKeysToLowerCase(execute.getHeaders()));
                    if (responseDataHolder.isValidResponse()) {
                        responseDataHolder.setResponseData(execute.getResponseData());
                    }
                    if (execute.getIsCompleted()) {
                        z5 = networkTask.onRequestComplete();
                        bool = Boolean.valueOf(z5);
                        if (!z5 && this.f15181a.shouldTryNextHost()) {
                            z7 = true;
                        }
                        exponentialBackoffPolicy.onHostAttemptFinished(z5);
                        onCreateNetworkTask = z7;
                    } else {
                        networkTask.onRequestError(execute.getException());
                    }
                }
            } else {
                networkTask.onRequestError(null);
            }
            z5 = false;
            bool = Boolean.valueOf(z5);
            if (!z5) {
                z7 = true;
            }
            exponentialBackoffPolicy.onHostAttemptFinished(z5);
            onCreateNetworkTask = z7;
        }
        exponentialBackoffPolicy.onAllHostsAttemptsFinished(Intrinsics.areEqual(bool, Boolean.TRUE));
    }
}
