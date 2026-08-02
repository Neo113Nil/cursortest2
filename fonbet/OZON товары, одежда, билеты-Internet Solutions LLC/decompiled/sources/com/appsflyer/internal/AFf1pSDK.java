package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class AFf1pSDK extends AFe1eSDK<Unit> {

    @NotNull
    private final AFg1qSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFg1xSDK f57434d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AFd1sSDK f57435e;

    @NotNull
    private final AFd1kSDK registerClient;

    @NotNull
    private final String unregisterClient;

    public static final class AFa1ySDK implements OutcomeReceiver {
        private /* synthetic */ M<AFe1dSDK> AFInAppEventParameterName;
        private /* synthetic */ CountDownLatch AFInAppEventType;
        private /* synthetic */ AFf1pSDK values;

        AFa1ySDK(M<AFe1dSDK> m11, CountDownLatch countDownLatch, AFf1pSDK aFf1pSDK) {
            this.AFInAppEventParameterName = m11;
            this.AFInAppEventType = countDownLatch;
            this.values = aFf1pSDK;
        }

        public final /* synthetic */ void onError(Throwable th2) {
            Exception exc = (Exception) th2;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1pSDK.valueOf(exc);
            this.AFInAppEventType.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.appsflyer.internal.AFe1dSDK] */
        public final void onResult(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.AFInAppEventParameterName.f71787a = AFe1dSDK.SUCCESS;
            this.AFInAppEventType.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1pSDK(@NotNull AFd1mSDK aFd1mSDK, @NotNull String str) {
        super(AFf1zSDK.REGISTER_TRIGGER, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.CONVERSION}, "RegisterTrigger");
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.unregisterClient = str;
        AFd1sSDK AFInAppEventType = aFd1mSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.f57435e = AFInAppEventType;
        AFd1kSDK w11 = aFd1mSDK.w();
        Intrinsics.checkNotNullExpressionValue(w11, "");
        this.registerClient = w11;
        AFg1qSDK unregisterClient = aFd1mSDK.unregisterClient();
        Intrinsics.checkNotNullExpressionValue(unregisterClient, "");
        this.AFLogger = unregisterClient;
        AFg1xSDK force = aFd1mSDK.force();
        Intrinsics.checkNotNullExpressionValue(force, "");
        this.f57434d = force;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void valueOf(Throwable th2) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1gSDK aFg1gSDK = AFg1gSDK.PRIVACY_SANDBOX;
        StringBuilder sb2 = new StringBuilder("Error occurred: ");
        sb2.append(th2.getMessage());
        aFLogger.e(aFg1gSDK, sb2.toString(), th2, false, false, true, true);
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long AFInAppEventType() {
        return 20000L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.appsflyer.internal.AFe1dSDK] */
    @Override // com.appsflyer.internal.AFe1eSDK
    @SuppressLint({"NewApi"})
    @NotNull
    public final AFe1dSDK values() {
        MeasurementManager a11;
        M m11 = new M();
        m11.f71787a = AFe1dSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.registerClient.valueOf;
            if (context != null && (a11 = e.a(context.getSystemService(d.a()))) != null) {
                new AFi1eSDK(this.f57435e, null, 2, null);
                Uri.Builder buildUpon = Uri.parse(AFi1eSDK.values()).buildUpon();
                Pair pair = new Pair("event_name", this.unregisterClient);
                Pair pair2 = new Pair("app_id", this.f57435e.AFInAppEventParameterName.valueOf.getPackageName());
                Context context2 = this.f57435e.AFInAppEventParameterName.valueOf;
                LinkedHashMap l11 = U.l(pair, pair2, new Pair("app_version", AFb1uSDK.AFKeystoreWrapper(context2, context2.getPackageName())), new Pair("sdk_version", AFd1sSDK.AFInAppEventParameterName()), new Pair("api_version", AFd1sSDK.AFKeystoreWrapper()), new Pair("timestamp", String.valueOf(this.AFLogger.values())), new Pair("request_id", AFd1sSDK.values()));
                AFd1sSDK aFd1sSDK = this.f57435e;
                String AFInAppEventType = AFb1kSDK.AFInAppEventType(aFd1sSDK.AFInAppEventParameterName, aFd1sSDK.AFKeystoreWrapper);
                if (AFInAppEventType != null) {
                    l11.put("appsflyer_id", AFInAppEventType);
                }
                Long AFInAppEventParameterName = this.AFLogger.AFInAppEventParameterName();
                if (AFInAppEventParameterName != null) {
                    l11.put("install_time", String.valueOf(AFInAppEventParameterName.longValue()));
                }
                for (Map.Entry entry : l11.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri build = buildUpon.build();
                Intrinsics.checkNotNullExpressionValue(build, "");
                a11.registerTrigger(build, new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue()), new AFa1ySDK(m11, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (Throwable th2) {
            valueOf(th2);
        }
        return (AFe1dSDK) m11.f71787a;
    }
}
