package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import androidx.appcompat.widget.c1;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1rSDK;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u001e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Lcom/appsflyer/internal/AFf1wSDK;", "Lcom/appsflyer/internal/AFe1mSDK;", "", "Lcom/appsflyer/internal/AFe1rSDK;", "p0", "Ljava/util/concurrent/Executor;", "p1", "Lcom/appsflyer/internal/AFc1oSDK;", "p2", "Lcom/appsflyer/internal/AFc1hSDK;", "p3", "Lcom/appsflyer/internal/AFg1nSDK;", "p4", "Lcom/appsflyer/internal/AFf1eSDK;", "p5", "Lkotlin/Function1;", "Lcom/appsflyer/internal/AFe1uSDK;", "p6", "<init>", "(Lcom/appsflyer/internal/AFe1rSDK;Ljava/util/concurrent/Executor;Lcom/appsflyer/internal/AFc1oSDK;Lcom/appsflyer/internal/AFc1hSDK;Lcom/appsflyer/internal/AFg1nSDK;Lcom/appsflyer/internal/AFf1eSDK;Lkotlin/jvm/functions/Function1;)V", "", "AFAdRevenueData", "()J", "getRevenue", "()Lcom/appsflyer/internal/AFe1uSDK;", "getCurrencyIso4217Code", "()V", "", "getMonetizationNetwork", "()Z", "component3", "Ljava/util/concurrent/Executor;", "component4", "Lcom/appsflyer/internal/AFc1hSDK;", "getMediationNetwork", "component2", "Lcom/appsflyer/internal/AFe1rSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFg1nSDK;", "component1", "Lcom/appsflyer/internal/AFc1oSDK;", "equals", "Lkotlin/jvm/functions/Function1;", "toString", "Lcom/appsflyer/internal/AFf1eSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegisterTriggerTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegisterTriggerTask.kt\ncom/appsflyer/internal/components/queue/tasks/RegisterTriggerTask\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,169:1\n215#2,2:170\n*S KotlinDebug\n*F\n+ 1 RegisterTriggerTask.kt\ncom/appsflyer/internal/components/queue/tasks/RegisterTriggerTask\n*L\n163#1:170,2\n*E\n"})
/* loaded from: classes.dex */
public final class AFf1wSDK extends AFe1mSDK<Unit> {

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    public AFg1nSDK getRevenue;

    /* renamed from: component1, reason: from kotlin metadata */
    @NotNull
    public AFc1oSDK AFAdRevenueData;

    /* renamed from: component2, reason: from kotlin metadata */
    @NotNull
    public AFe1rSDK getMonetizationNetwork;

    /* renamed from: component3, reason: from kotlin metadata */
    @NotNull
    public Executor getCurrencyIso4217Code;

    /* renamed from: component4, reason: from kotlin metadata */
    @NotNull
    public AFc1hSDK getMediationNetwork;

    /* renamed from: equals, reason: from kotlin metadata */
    @NotNull
    public Function1<AFe1uSDK, Unit> areAllFieldsValid;

    /* renamed from: toString, reason: from kotlin metadata */
    @NotNull
    public AFf1eSDK component3;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class AFa1uSDK implements OutcomeReceiver {
        private /* synthetic */ Ref.ObjectRef<AFe1uSDK> AFAdRevenueData;
        private /* synthetic */ CountDownLatch getCurrencyIso4217Code;
        private /* synthetic */ AFf1wSDK getRevenue;

        public AFa1uSDK(Ref.ObjectRef<AFe1uSDK> objectRef, CountDownLatch countDownLatch, AFf1wSDK aFf1wSDK) {
            this.AFAdRevenueData = objectRef;
            this.getCurrencyIso4217Code = countDownLatch;
            this.getRevenue = aFf1wSDK;
        }

        public final /* synthetic */ void onError(Throwable th2) {
            Exception exc = (Exception) th2;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1wSDK.getMediationNetwork(exc);
            this.getCurrencyIso4217Code.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.appsflyer.internal.AFe1uSDK] */
        public final void onResult(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.AFAdRevenueData.element = AFe1uSDK.SUCCESS;
            AFLogger.INSTANCE.d(AFg1cSDK.PRIVACY_SANDBOX, "Privacy Sandbox trigger has been registered successfully. ", true);
            this.getCurrencyIso4217Code.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFf1wSDK(@NotNull AFe1rSDK aFe1rSDK, @NotNull Executor executor, @NotNull AFc1oSDK aFc1oSDK, @NotNull AFc1hSDK aFc1hSDK, @NotNull AFg1nSDK aFg1nSDK, @NotNull AFf1eSDK aFf1eSDK, @NotNull Function1<? super AFe1uSDK, Unit> function1) {
        super(AFe1pSDK.REGISTER_TRIGGER, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, null);
        Intrinsics.checkNotNullParameter(aFe1rSDK, "");
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFg1nSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.getMonetizationNetwork = aFe1rSDK;
        this.getCurrencyIso4217Code = executor;
        this.AFAdRevenueData = aFc1oSDK;
        this.getMediationNetwork = aFc1hSDK;
        this.getRevenue = aFg1nSDK;
        this.component3 = aFf1eSDK;
        this.areAllFieldsValid = function1;
        if (aFe1rSDK instanceof AFe1rSDK.AFa1tSDK) {
            this.AFAdRevenueData.add(AFe1pSDK.CONVERSION);
        }
        if (this.getMonetizationNetwork instanceof AFe1rSDK.AFa1uSDK) {
            this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
        }
        if (this.getMonetizationNetwork instanceof AFe1rSDK.AFa1zSDK) {
            this.getCurrencyIso4217Code.add(AFe1pSDK.INAPP);
        }
    }

    public static final /* synthetic */ void getMediationNetwork(Throwable th2) {
        AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, c1.m("Error occurred: ", th2.getMessage()), th2, false, false, false, true);
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFe1uSDK aFe1uSDK = this.getMonetizationNetwork;
        if (aFe1uSDK != null) {
            this.areAllFieldsValid.invoke(aFe1uSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.appsflyer.internal.AFe1uSDK] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.appsflyer.internal.AFe1uSDK] */
    @Override // com.appsflyer.internal.AFe1mSDK
    @SuppressLint({"NewApi"})
    @NotNull
    public final AFe1uSDK getRevenue() {
        MeasurementManager c2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = AFe1uSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.getMediationNetwork.getMonetizationNetwork;
            if (context != null && (c2 = com.google.firebase.messaging.k.c(context.getSystemService(com.google.firebase.messaging.k.i()))) != null) {
                new AFj1cSDK(this.AFAdRevenueData, null, 2, null);
                Uri.Builder buildUpon = Uri.parse(AFj1cSDK.getMediationNetwork()).buildUpon();
                String areAllFieldsValid = this.AFAdRevenueData.areAllFieldsValid();
                if (areAllFieldsValid == null) {
                    areAllFieldsValid = "";
                }
                LinkedHashMap f6 = n0.f(new Pair("event_name", this.getMonetizationNetwork.getMediationNetwork), new Pair(CommonUrlParts.APP_ID, this.AFAdRevenueData.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()), new Pair("app_version", this.AFAdRevenueData.n_().versionName), new Pair("sdk_version", AFc1oSDK.getMonetizationNetwork()), new Pair("api_version", AFc1oSDK.getCurrencyIso4217Code()), new Pair("timestamp", String.valueOf(this.getRevenue.getCurrencyIso4217Code())), new Pair(CommonUrlParts.REQUEST_ID, AFc1oSDK.getMediationNetwork()), new Pair("gaid", areAllFieldsValid));
                String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.AFAdRevenueData.getMediationNetwork);
                if (currencyIso4217Code != null) {
                    f6.put("appsflyer_id", currencyIso4217Code);
                }
                Long monetizationNetwork = this.getRevenue.getMonetizationNetwork();
                if (monetizationNetwork != null) {
                    f6.put("install_time", String.valueOf(monetizationNetwork.longValue()));
                }
                AFe1rSDK aFe1rSDK = this.getMonetizationNetwork;
                if (aFe1rSDK instanceof AFe1rSDK.AFa1zSDK) {
                    Float f10 = ((AFe1rSDK.AFa1zSDK) aFe1rSDK).getCurrencyIso4217Code;
                    if (f10 != null) {
                        f6.put("event_revenue", String.valueOf(f10.floatValue()));
                    }
                    Integer num = ((AFe1rSDK.AFa1zSDK) this.getMonetizationNetwork).AFAdRevenueData;
                    if (num != null) {
                        f6.put("event_count", String.valueOf(num.intValue()));
                    }
                }
                for (Map.Entry entry : f6.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri build = buildUpon.build();
                Intrinsics.checkNotNullExpressionValue(build, "");
                c2.registerTrigger(build, this.getCurrencyIso4217Code, new AFa1uSDK(objectRef, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            objectRef.element = AFe1uSDK.TIMEOUT;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, c1.m("Error occurred: ", th2.getMessage()), th2, false, false, false, true);
        }
        return (AFe1uSDK) objectRef.element;
    }
}
