package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import androidx.core.util.HalfKt$$ExternalSyntheticApiModelOutline0;
import androidx.transition.Transition$Impl26$$ExternalSyntheticApiModelOutline0;
import com.appsflyer.AFLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import io.sentry.protocol.App;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes6.dex */
public final class AFf1hSDK extends AFe1bSDK<Unit> {
    private final AFg1uSDK areAllFieldsValid;
    private final AFd1lSDK component1;
    private final AFd1rSDK component2;
    private final String component3;
    private final AFg1iSDK component4;

    @Override // com.appsflyer.internal.AFe1bSDK
    public final long getMediationNetwork() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1hSDK(AFd1kSDK aFd1kSDK, String str) {
        super(AFf1wSDK.REGISTER_TRIGGER, new AFf1wSDK[]{AFf1wSDK.RC_CDN, AFf1wSDK.CONVERSION}, "RegisterTrigger");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.component3 = str;
        AFd1rSDK currencyIso4217Code = aFd1kSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        this.component2 = currencyIso4217Code;
        AFd1lSDK AFInAppEventParameterName = aFd1kSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        this.component1 = AFInAppEventParameterName;
        AFg1iSDK component2 = aFd1kSDK.component2();
        Intrinsics.checkNotNullExpressionValue(component2, "");
        this.component4 = component2;
        AFg1uSDK AFInAppEventType = aFd1kSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.areAllFieldsValid = AFInAppEventType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.appsflyer.internal.AFe1dSDK] */
    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFe1dSDK AFAdRevenueData() {
        MeasurementManager m10020m;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = AFe1dSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.component1.getCurrencyIso4217Code;
            if (context != null && (m10020m = Transition$Impl26$$ExternalSyntheticApiModelOutline0.m10020m(context.getSystemService(Transition$Impl26$$ExternalSyntheticApiModelOutline0.m$1()))) != null) {
                new AFj1iSDK(this.component2, null, 2, null);
                Uri.Builder buildUpon = Uri.parse(AFj1iSDK.getMediationNetwork()).buildUpon();
                AFd1rSDK aFd1rSDK = this.component2;
                Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("event_name", this.component3), TuplesKt.to("app_id", this.component2.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName()), TuplesKt.to(App.JsonKeys.APP_VERSION, AFb1qSDK.getMediationNetwork(aFd1rSDK.getMonetizationNetwork.getCurrencyIso4217Code, aFd1rSDK.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName())), TuplesKt.to("sdk_version", AFd1rSDK.getMediationNetwork()), TuplesKt.to("api_version", AFd1rSDK.getRevenue()), TuplesKt.to("timestamp", String.valueOf(this.component4.getRevenue())), TuplesKt.to(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, AFd1rSDK.getMonetizationNetwork()));
                AFd1rSDK aFd1rSDK2 = this.component2;
                String mediationNetwork = AFb1mSDK.getMediationNetwork(aFd1rSDK2.getMonetizationNetwork, aFd1rSDK2.getRevenue);
                if (mediationNetwork != null) {
                    mutableMapOf.put("appsflyer_id", mediationNetwork);
                }
                Long currencyIso4217Code = this.component4.getCurrencyIso4217Code();
                if (currencyIso4217Code != null) {
                    mutableMapOf.put("install_time", String.valueOf(currencyIso4217Code.longValue()));
                }
                for (Map.Entry entry : mutableMapOf.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri build = buildUpon.build();
                Intrinsics.checkNotNullExpressionValue(build, "");
                m10020m.registerTrigger(build, AFd1uSDK.AFAdRevenueData(), HalfKt$$ExternalSyntheticApiModelOutline0.m9116m((Object) new AFa1tSDK(objectRef, countDownLatch, this)));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1xSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
        }
        return (AFe1dSDK) objectRef.element;
    }

    public static final class AFa1tSDK implements OutcomeReceiver<Object, Exception> {
        private /* synthetic */ CountDownLatch AFAdRevenueData;
        private /* synthetic */ AFf1hSDK getMediationNetwork;
        private /* synthetic */ Ref.ObjectRef<AFe1dSDK> getMonetizationNetwork;

        AFa1tSDK(Ref.ObjectRef<AFe1dSDK> objectRef, CountDownLatch countDownLatch, AFf1hSDK aFf1hSDK) {
            this.getMonetizationNetwork = objectRef;
            this.AFAdRevenueData = countDownLatch;
            this.getMediationNetwork = aFf1hSDK;
        }

        public final /* synthetic */ void onError(Throwable th) {
            Exception exc = (Exception) th;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1hSDK.getRevenue(exc);
            this.AFAdRevenueData.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.appsflyer.internal.AFe1dSDK] */
        public final void onResult(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.getMonetizationNetwork.element = AFe1dSDK.SUCCESS;
            this.AFAdRevenueData.countDown();
        }
    }

    public static final /* synthetic */ void getRevenue(Throwable th) {
        AFLogger.INSTANCE.e(AFh1xSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
    }
}
