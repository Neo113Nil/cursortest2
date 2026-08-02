package com.unity3d.services.core.request.metrics;

import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* compiled from: MetricSender.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1", f = "MetricSender.kt", i = {0}, l = {66, 66}, m = "invokeSuspend", n = {"request"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class MetricSender$sendMetrics$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Metric> $metrics;
    Object L$0;
    int label;
    final /* synthetic */ MetricSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MetricSender$sendMetrics$1(MetricSender metricSender, List<Metric> list, Continuation<? super MetricSender$sendMetrics$1> continuation) {
        super(2, continuation);
        this.this$0 = metricSender;
        this.$metrics = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MetricSender$sendMetrics$1(this.this$0, this.$metrics, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MetricSender$sendMetrics$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
    
        if (r2 == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r2 == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        MetricCommonTags metricCommonTags;
        String str2;
        HttpRequest httpRequest;
        HttpClientProvider httpClientProvider;
        Object invoke;
        Object execute$default;
        Logger logger;
        Logger logger2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            str = this.this$0.metricSampleRate;
            metricCommonTags = this.this$0.commonTags;
            List<Metric> list = this.$metrics;
            str2 = this.this$0.sessionToken;
            String jSONObject = new JSONObject(new MetricsContainer(str, metricCommonTags, list, str2).toMap()).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(container.toMap()).toString()");
            String metricEndPoint = this.this$0.getMetricEndPoint();
            if (metricEndPoint == null) {
                metricEndPoint = "";
            }
            httpRequest = new HttpRequest(metricEndPoint, null, RequestType.POST, jSONObject, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131058, null);
            httpClientProvider = this.this$0.httpClientProvider;
            this.L$0 = httpRequest;
            this.label = 1;
            invoke = httpClientProvider.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                execute$default = obj;
                HttpResponse httpResponse = (HttpResponse) execute$default;
                if (httpResponse.getStatusCode() / 100 == 2) {
                    logger2 = this.this$0.logger;
                    logger2.debug("Metric " + this.$metrics + " sent to " + this.this$0.getMetricEndPoint());
                } else {
                    logger = this.this$0.logger;
                    Logger.DefaultImpls.trace$default(logger, "Metric " + this.$metrics + " failed to send with response code: " + httpResponse.getStatusCode(), null, 2, null);
                }
                return Unit.INSTANCE;
            }
            HttpRequest httpRequest2 = (HttpRequest) this.L$0;
            ResultKt.throwOnFailure(obj);
            httpRequest = httpRequest2;
            invoke = obj;
        }
        this.L$0 = null;
        this.label = 2;
        execute$default = HttpClient.DefaultImpls.execute$default((HttpClient) invoke, httpRequest, false, this, 2, null);
    }
}
