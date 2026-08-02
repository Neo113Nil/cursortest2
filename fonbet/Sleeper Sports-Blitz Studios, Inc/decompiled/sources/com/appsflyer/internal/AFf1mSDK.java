package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1bSDK;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import com.turboimage.events.SuccessEvent;
import io.sentry.clientreport.DiscardedEvent;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\r\u0010\u0012J\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\u000f\u0010\r\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\r\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0018J\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u001a*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u000b\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0016\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u001b\u0010'\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\tR\u0014\u0010\u001f\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0015\u0010\"\u001a\u00020\u00138BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010%"}, d2 = {"Lcom/appsflyer/internal/AFf1mSDK;", "Lcom/appsflyer/internal/AFe1bSDK;", "Lcom/appsflyer/internal/AFh1pSDK;", "Lcom/appsflyer/internal/AFd1kSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFd1kSDK;)V", "", "equals", "()Z", "", "getCurrencyIso4217Code", "(I)Z", "getMediationNetwork", "getMonetizationNetwork", "Landroid/content/Context;", "Lcom/appsflyer/internal/AFf1mSDK$AFa1uSDK;", "p1", "(Landroid/content/Context;Lcom/appsflyer/internal/AFf1mSDK$AFa1uSDK;)Z", "", "()J", "Lcom/appsflyer/internal/AFe1dSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFe1dSDK;", "(Landroid/content/Context;)I", "", "", "(Lcom/appsflyer/internal/AFh1pSDK;Ljava/lang/String;)V", "component4", "Lcom/appsflyer/internal/AFh1pSDK;", "Lcom/appsflyer/internal/AFd1lSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFd1lSDK;", "Lcom/appsflyer/internal/AFd1rSDK;", "component3", "Lcom/appsflyer/internal/AFd1rSDK;", InAppPurchaseConstants.METHOD_TO_STRING, "Lkotlin/Lazy;", "component1", "getRevenue", "Lcom/appsflyer/internal/AFd1tSDK;", "component2", "Lcom/appsflyer/internal/AFd1tSDK;", "AFa1ySDK", "AFa1uSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AFf1mSDK extends AFe1bSDK<AFh1pSDK> {

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    private final AFd1lSDK AFAdRevenueData;

    /* renamed from: component1, reason: from kotlin metadata */
    private final Lazy component3;

    /* renamed from: component2, reason: from kotlin metadata */
    private final AFd1tSDK areAllFieldsValid;

    /* renamed from: component3, reason: from kotlin metadata */
    private final AFd1rSDK getMediationNetwork;

    /* renamed from: component4, reason: from kotlin metadata */
    private final AFh1pSDK getMonetizationNetwork;

    /* renamed from: toString, reason: from kotlin metadata */
    private final Lazy getRevenue;

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1mSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1wSDK.FETCH_ADVERTISING_ID, new AFf1wSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        AFd1lSDK AFInAppEventParameterName = aFd1kSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        this.AFAdRevenueData = AFInAppEventParameterName;
        AFd1rSDK currencyIso4217Code = aFd1kSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        this.getMediationNetwork = currencyIso4217Code;
        AFd1tSDK e = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(e, "");
        this.areAllFieldsValid = e;
        this.getMonetizationNetwork = new AFh1pSDK(null, null, null, null, null, null, null, null, 255, null);
        this.component3 = LazyKt.lazy(new Function0<Long>() { // from class: com.appsflyer.internal.AFf1mSDK.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                Long longOrNull;
                String monetizationNetwork = AFf1mSDK.this.getMediationNetwork.getMonetizationNetwork("com.appsflyer.fetch_ids.timeout");
                return Long.valueOf((monetizationNetwork == null || (longOrNull = StringsKt.toLongOrNull(monetizationNetwork)) == null) ? 1000L : longOrNull.longValue());
            }
        });
        this.getRevenue = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1mSDK.3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1mSDK.this.getMediationNetwork.getMonetizationNetwork("com.appsflyer.enable_instant_plays")));
            }
        });
    }

    private final boolean component1() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }

    private static boolean areAllFieldsValid() {
        String str;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            if (th instanceof ClassNotFoundException) {
                str = "CloudDevSdk not found";
            } else {
                str = "Unexpected exception while checking if running in cloud environment: " + th.getMessage();
            }
            AFh1wSDK.e$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFe1dSDK AFAdRevenueData() {
        AFe1dSDK aFe1dSDK;
        if (this.areAllFieldsValid.getMediationNetwork()) {
            AFh1wSDK.v$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1dSDK.FAILURE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(equals()), Boolean.FALSE, Boolean.FALSE}).contains(Boolean.TRUE)) {
            aFe1dSDK = AFe1dSDK.SUCCESS;
        } else {
            aFe1dSDK = AFe1dSDK.FAILURE;
        }
        AFd1tSDK aFd1tSDK = this.areAllFieldsValid;
        AFe1mSDK aFe1mSDK = new AFe1mSDK(System.currentTimeMillis() - currentTimeMillis);
        AFh1wSDK.v$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFe1mSDK.getCurrencyIso4217Code + "ms", false, 4, null);
        aFd1tSDK.getCurrencyIso4217Code(aFe1mSDK);
        return aFe1dSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b A[LOOP:0: B:2:0x0003->B:10:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e A[EDGE_INSN: B:11:0x004e->B:12:0x004e BREAK  A[LOOP:0: B:2:0x0003->B:10:0x004b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean equals() {
        boolean z = false;
        for (int i = 2; i > 0; i--) {
            if (component1() && getMonetizationNetwork(i)) {
                AFh1wSDK.v$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else if (getCurrencyIso4217Code(i)) {
                AFh1wSDK.v$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
            } else {
                AFh1wSDK.v$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                z = false;
                if (!z) {
                    break;
                }
            }
            z = true;
            if (!z) {
            }
        }
        this.areAllFieldsValid.areAllFieldsValid = this.getMonetizationNetwork;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getCurrencyIso4217Code(int p0) {
        boolean z;
        String obj;
        String str;
        AFh1wSDK.i$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        AFa1uSDK aFa1uSDK = new AFa1uSDK(null, null, false, null, 15, null);
        Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
        Intrinsics.checkNotNull(context);
        int mediationNetwork = getMediationNetwork(context);
        Context context2 = this.AFAdRevenueData.getCurrencyIso4217Code;
        Intrinsics.checkNotNull(context2);
        if (!getMonetizationNetwork(context2, aFa1uSDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.AFAdRevenueData.getCurrencyIso4217Code;
                Intrinsics.checkNotNull(context3);
                if (getMediationNetwork(context3, aFa1uSDK)) {
                    z = true;
                    obj = aFa1uSDK.getGaidError().toString();
                    str = obj;
                    if (str != null && !StringsKt.isBlank(str)) {
                        obj = mediationNetwork + ": " + StringsKt.trim((CharSequence) str).toString();
                    }
                    getCurrencyIso4217Code(this.getMonetizationNetwork, obj);
                    if (!z) {
                        return false;
                    }
                }
            }
            z = false;
            obj = aFa1uSDK.getGaidError().toString();
            str = obj;
            if (str != null) {
                obj = mediationNetwork + ": " + StringsKt.trim((CharSequence) str).toString();
            }
            getCurrencyIso4217Code(this.getMonetizationNetwork, obj);
            if (!z) {
            }
        }
        AFh1pSDK aFh1pSDK = this.getMonetizationNetwork;
        aFh1pSDK.getMediationNetwork = aFa1uSDK.getAdvertisingId();
        aFh1pSDK.component1 = aFa1uSDK.isLimitAdTrackingEnabled();
        aFh1pSDK.getMonetizationNetwork = aFa1uSDK.isLimitAdTrackingEnabled() != null ? Boolean.valueOf(!r1.booleanValue()) : null;
        aFh1pSDK.AFAdRevenueData = Boolean.valueOf(aFa1uSDK.getAdvertisingIdWithGps());
        aFh1pSDK.getCurrencyIso4217Code = Boolean.FALSE;
        aFh1pSDK.areAllFieldsValid = Boolean.valueOf(p0 != 2);
        return true;
    }

    private static int getMediationNetwork(Context p0) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(p0);
        } catch (Throwable th) {
            AFh1wSDK.e$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    private final boolean getMediationNetwork(Context p0, AFa1uSDK p1) throws IllegalStateException {
        try {
            AFa1bSDK.AFa1ySDK revenue = AFa1bSDK.getRevenue(p0);
            p1.setAdvertisingId(revenue.getMediationNetwork);
            p1.setLimitAdTrackingEnabled(Boolean.valueOf(revenue.getRevenue()));
            String advertisingId = p1.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                p1.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.INSTANCE != null) {
                return true;
            }
            AFf1mSDK aFf1mSDK = this;
            p1.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)".toString());
        } catch (Throwable th) {
            AFh1wSDK.e$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "Failed to fetch GAID: " + th.getMessage(), th, true, false, false, false, 64, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFh1wSDK.i$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, localizedMessage, false, 4, null);
            return false;
        }
    }

    private final boolean getMonetizationNetwork(Context p0, AFa1uSDK p1) throws IllegalStateException {
        Unit unit;
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p0);
            if (advertisingIdInfo != null) {
                p1.setAdvertisingId(advertisingIdInfo.getId());
                p1.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p1.setAdvertisingIdWithGps(true);
                String advertisingId = p1.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    p1.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            AFf1mSDK aFf1mSDK = this;
            p1.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null".toString());
        } catch (Throwable th) {
            AFh1wSDK.e$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "Google Play Services is missing " + th.getMessage(), th, false, false, false, false, 88, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFh1wSDK.i$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    private final boolean getMonetizationNetwork(int p0) {
        return getMediationNetwork(p0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d6, code lost:
    
        r0 = r4.getAdvertisingId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00dc, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e2, code lost:
    
        if (r0.length() != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e5, code lost:
    
        r0 = r16.getMonetizationNetwork;
        r0.getMediationNetwork = r4.getAdvertisingId();
        r0.component1 = java.lang.Boolean.FALSE;
        r0.getMonetizationNetwork = java.lang.Boolean.TRUE;
        r0.AFAdRevenueData = java.lang.Boolean.FALSE;
        r0.getCurrencyIso4217Code = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0100, code lost:
    
        if (r17 == 2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0102, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0103, code lost:
    
        r0.areAllFieldsValid = java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0109, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        if (r4.getGaidError().length() <= 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMediationNetwork(int p0) {
        String str;
        AFh1wSDK.i$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        boolean z = false;
        if (areAllFieldsValid()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.AFAdRevenueData.getCurrencyIso4217Code;
            Intrinsics.checkNotNull(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1uSDK aFa1uSDK = new AFa1uSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.AFAdRevenueData.getCurrencyIso4217Code;
                    Intrinsics.checkNotNull(context2);
                    cloudDevSdk2.request(context2, CollectionsKt.listOf("gaid"), new AFa1zSDK(aFa1uSDK, countDownLatch));
                    countDownLatch.await(((Number) this.component3.getValue()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th.getMessage();
                        }
                        AFh1wSDK.e$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
                        StringBuilder gaidError = aFa1uSDK.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
                    } finally {
                        if (aFa1uSDK.getGaidError().length() > 0) {
                            getCurrencyIso4217Code(this.getMonetizationNetwork, aFa1uSDK.getGaidError().toString());
                        }
                    }
                }
            }
        }
        AFh1wSDK.i$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", DiscardedEvent.JsonKeys.REASON, "", SuccessEvent.EVENT_NAME, "kinds", "", "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1zSDK implements CloudDevCallback {
        final /* synthetic */ AFa1uSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        AFa1zSDK(AFa1uSDK aFa1uSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1uSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFh1wSDK.w$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: " + reason, false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFh1wSDK.v$default(AFLogger.INSTANCE, AFh1xSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFf1mSDK$AFa1uSDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFf1mSDK$AFa1uSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", InAppPurchaseConstants.METHOD_TO_STRING, "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class AFa1uSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1uSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1uSDK copy$default(AFa1uSDK aFa1uSDK, String str, Boolean bool, boolean z, StringBuilder sb, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aFa1uSDK.advertisingId;
            }
            if ((i & 2) != 0) {
                bool = aFa1uSDK.isLimitAdTrackingEnabled;
            }
            if ((i & 4) != 0) {
                z = aFa1uSDK.advertisingIdWithGps;
            }
            if ((i & 8) != 0) {
                sb = aFa1uSDK.gaidError;
            }
            return aFa1uSDK.copy(str, bool, z, sb);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        /* renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        public final AFa1uSDK copy(String advertisingId, Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1uSDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) other;
            return Intrinsics.areEqual(this.advertisingId, aFa1uSDK.advertisingId) && Intrinsics.areEqual(this.isLimitAdTrackingEnabled, aFa1uSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1uSDK.advertisingIdWithGps && Intrinsics.areEqual(this.gaidError, aFa1uSDK.gaidError);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.advertisingId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z = this.advertisingIdWithGps;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((hashCode2 + i) * 31) + this.gaidError.hashCode();
        }

        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public AFa1uSDK(String str, Boolean bool, boolean z, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z;
            this.gaidError = gaidError;
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        public final void setAdvertisingIdWithGps(boolean z) {
            this.advertisingIdWithGps = z;
        }

        public /* synthetic */ AFa1uSDK(String str, Boolean bool, boolean z, StringBuilder sb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new StringBuilder() : sb);
        }

        public final StringBuilder getGaidError() {
            return this.gaidError;
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final long getMediationNetwork() {
        return ((Number) this.component3.getValue()).longValue();
    }

    private static void getCurrencyIso4217Code(AFh1pSDK aFh1pSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1pSDK.getRevenue;
        if (str2 != null) {
            String str3 = str2 + " | " + str;
            if (str3 != null) {
                str = str3;
            }
        }
        aFh1pSDK.getRevenue = str;
    }
}
