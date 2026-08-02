package com.facebook.appevents.iap;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.microsoft.codepush.react.CodePushConstants;
import io.radar.sdk.RadarTripOptions;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InAppPurchaseManager.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0002JB\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\n\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0007JF\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0 2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001b2\u001c\u0010#\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f0 H\u0007J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0004H\u0003J\b\u0010&\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R<\u0010\b\u001a0\u0012\u0004\u0012\u00020\n\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\r\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f0\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R<\u0010\u0010\u001a0\u0012\u0004\u0012\u00020\n\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\r\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f0\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseManager;", "", "()V", "GOOGLE_BILLINGCLIENT_VERSION", "", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "specificBillingLibraryVersion", "timesOfImplicitPurchases", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/facebook/appevents/iap/InAppPurchase;", "", "Lkotlin/Pair;", "", "Landroid/os/Bundle;", "Lcom/facebook/appevents/OperationalData;", "timesOfManualPurchases", "enableAutoLogging", "", "getBillingClientVersion", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "getDedupeParameter", "newPurchaseParameters", "newPurchaseOperationalData", "oldPurchaseParameters", "oldPurchaseOperationalData", "dedupingWithImplicitlyLoggedHistory", "", "withTestDedupeKeys", "getSpecificBillingLibraryVersion", "performDedupe", "purchases", "", CodePushConstants.LATEST_ROLLBACK_TIME_KEY, "isImplicitlyLogged", "purchaseParameters", "setSpecificBillingLibraryVersion", "version", RadarTripOptions.KEY_START_TRACKING, "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppPurchaseManager {
    private static final String GOOGLE_BILLINGCLIENT_VERSION = "com.google.android.play.billingclient.version";
    private static String specificBillingLibraryVersion;
    public static final InAppPurchaseManager INSTANCE = new InAppPurchaseManager();
    private static final ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> timesOfManualPurchases = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> timesOfImplicitPurchases = new ConcurrentHashMap<>();
    private static final AtomicBoolean enabled = new AtomicBoolean(false);

    /* compiled from: InAppPurchaseManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppPurchaseUtils.BillingClientVersion.values().length];
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V2_V4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V5_V7.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private InAppPurchaseManager() {
    }

    @JvmStatic
    public static final void enableAutoLogging() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return;
        }
        try {
            if (!AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
                InAppPurchaseLoggerManager.updateLatestPossiblePurchaseTime();
            } else {
                enabled.set(true);
                startTracking();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
        }
    }

    @JvmStatic
    public static final void startTracking() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return;
        }
        try {
            if (enabled.get()) {
                InAppPurchaseUtils.BillingClientVersion billingClientVersion = INSTANCE.getBillingClientVersion();
                int i = WhenMappings.$EnumSwitchMapping$0[billingClientVersion.ordinal()];
                if (i == 2) {
                    InAppPurchaseActivityLifecycleTracker.startIapLogging(InAppPurchaseUtils.BillingClientVersion.V1);
                    return;
                }
                if (i == 3) {
                    if (FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib2)) {
                        InAppPurchaseAutoLogger.startIapLogging(FacebookSdk.getApplicationContext(), billingClientVersion);
                        return;
                    } else {
                        InAppPurchaseActivityLifecycleTracker.startIapLogging(InAppPurchaseUtils.BillingClientVersion.V2_V4);
                        return;
                    }
                }
                if (i == 4 && FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib5To7)) {
                    InAppPurchaseAutoLogger.startIapLogging(FacebookSdk.getApplicationContext(), billingClientVersion);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
        }
    }

    @JvmStatic
    private static final void setSpecificBillingLibraryVersion(String version) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return;
        }
        try {
            specificBillingLibraryVersion = version;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
        }
    }

    @JvmStatic
    public static final String getSpecificBillingLibraryVersion() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return null;
        }
        try {
            return specificBillingLibraryVersion;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
            return null;
        }
    }

    private final InAppPurchaseUtils.BillingClientVersion getBillingClientVersion() {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.g…TA_DATA\n                )");
                String string = applicationInfo.metaData.getString(GOOGLE_BILLINGCLIENT_VERSION);
                if (string == null) {
                    return InAppPurchaseUtils.BillingClientVersion.NONE;
                }
                List split$default = StringsKt.split$default((CharSequence) string, new String[]{"."}, false, 3, 2, (Object) null);
                if (string.length() == 0) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                setSpecificBillingLibraryVersion("GPBL." + string);
                Integer intOrNull = StringsKt.toIntOrNull((String) split$default.get(0));
                if (intOrNull == null) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                int intValue = intOrNull.intValue();
                if (intValue == 1) {
                    return InAppPurchaseUtils.BillingClientVersion.V1;
                }
                if (intValue < 5) {
                    return InAppPurchaseUtils.BillingClientVersion.V2_V4;
                }
                return InAppPurchaseUtils.BillingClientVersion.V5_V7;
            } catch (Exception unused) {
                return InAppPurchaseUtils.BillingClientVersion.V5_V7;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a2 A[Catch: all -> 0x0271, TryCatch #0 {all -> 0x0271, blocks: (B:22:0x0072, B:24:0x0085, B:25:0x0096, B:27:0x009b, B:30:0x00a3, B:31:0x00ac, B:33:0x00b2, B:37:0x00e9, B:40:0x00f1, B:45:0x010c, B:57:0x0127, B:58:0x012c, B:61:0x013c, B:63:0x0143, B:64:0x014e, B:68:0x0167, B:70:0x016f, B:71:0x017c, B:73:0x0184, B:75:0x01c8, B:79:0x019a, B:81:0x01a2, B:82:0x01af, B:84:0x01b7, B:90:0x008e, B:98:0x01d2, B:99:0x01d8, B:101:0x01de, B:103:0x01e6, B:106:0x0202, B:107:0x0207, B:109:0x020d, B:113:0x022d, B:126:0x0235, B:132:0x023b, B:129:0x0245, B:116:0x0251, B:123:0x0257, B:119:0x0262, B:138:0x01f3), top: B:21:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7 A[Catch: all -> 0x0271, TryCatch #0 {all -> 0x0271, blocks: (B:22:0x0072, B:24:0x0085, B:25:0x0096, B:27:0x009b, B:30:0x00a3, B:31:0x00ac, B:33:0x00b2, B:37:0x00e9, B:40:0x00f1, B:45:0x010c, B:57:0x0127, B:58:0x012c, B:61:0x013c, B:63:0x0143, B:64:0x014e, B:68:0x0167, B:70:0x016f, B:71:0x017c, B:73:0x0184, B:75:0x01c8, B:79:0x019a, B:81:0x01a2, B:82:0x01af, B:84:0x01b7, B:90:0x008e, B:98:0x01d2, B:99:0x01d8, B:101:0x01de, B:103:0x01e6, B:106:0x0202, B:107:0x0207, B:109:0x020d, B:113:0x022d, B:126:0x0235, B:132:0x023b, B:129:0x0245, B:116:0x0251, B:123:0x0257, B:119:0x0262, B:138:0x01f3), top: B:21:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized Bundle performDedupe(List<InAppPurchase> purchases, long time, boolean isImplicitlyLogged, List<Pair<Bundle, OperationalData>> purchaseParameters) {
        Bundle bundle;
        List<Pair<Long, Pair<Bundle, OperationalData>>> list;
        List<Pair<Long, Pair<Bundle, OperationalData>>> list2;
        ?? r6;
        Long l;
        ?? r11;
        boolean z;
        ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> concurrentHashMap;
        List<Pair<Long, Pair<Bundle, OperationalData>>> list3;
        List<InAppPurchase> purchases2 = purchases;
        List<Pair<Bundle, OperationalData>> purchaseParameters2 = purchaseParameters;
        synchronized (InAppPurchaseManager.class) {
            Bundle bundle2 = null;
            if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(purchases2, "purchases");
                Intrinsics.checkNotNullParameter(purchaseParameters2, "purchaseParameters");
                if (purchaseParameters2.isEmpty()) {
                    return null;
                }
                if (purchases2.size() != purchaseParameters2.size()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int size = purchases2.size();
                ?? r8 = 0;
                int i = 0;
                while (i < size) {
                    InAppPurchase inAppPurchase = purchases2.get(i);
                    Pair<Bundle, OperationalData> pair = purchaseParameters2.get(i);
                    Bundle component1 = pair.component1();
                    OperationalData component2 = pair.component2();
                    bundle = bundle2;
                    try {
                        int i2 = i;
                        InAppPurchase inAppPurchase2 = new InAppPurchase(inAppPurchase.getEventName(), new BigDecimal(String.valueOf(inAppPurchase.getAmount())).setScale(2, RoundingMode.HALF_UP).doubleValue(), inAppPurchase.getCurrency());
                        if (isImplicitlyLogged) {
                            list2 = timesOfManualPurchases.get(inAppPurchase2);
                        } else {
                            list2 = timesOfImplicitPurchases.get(inAppPurchase2);
                        }
                        List<Pair<Long, Pair<Bundle, OperationalData>>> list4 = list2;
                        if (list4 != null && !list4.isEmpty()) {
                            r6 = bundle;
                            l = r6;
                            r11 = l;
                            z = false;
                            for (Pair<Long, Pair<Bundle, OperationalData>> pair2 : list2) {
                                long longValue = pair2.getFirst().longValue();
                                Pair<Bundle, OperationalData> second = pair2.getSecond();
                                Bundle component12 = second.component1();
                                OperationalData component22 = second.component2();
                                if (Math.abs(time - longValue) <= InAppPurchaseDedupeConfig.INSTANCE.getDedupeWindow() && (l == null || longValue < l.longValue())) {
                                    InAppPurchaseManager inAppPurchaseManager = INSTANCE;
                                    r11 = getDedupeParameter$default(inAppPurchaseManager, component1, component2, component12, component22, !isImplicitlyLogged, false, 32, null);
                                    String dedupeParameter = inAppPurchaseManager.getDedupeParameter(component1, component2, component12, component22, !isImplicitlyLogged, true);
                                    r6 = r6;
                                    if (dedupeParameter != null) {
                                        r6 = dedupeParameter;
                                    }
                                    if (r11 != 0) {
                                        l = Long.valueOf(longValue);
                                        arrayList.add(new Pair(inAppPurchase2, Long.valueOf(longValue)));
                                        z = true;
                                    }
                                }
                            }
                            if (r6 != 0) {
                                if (r8 == 0) {
                                    r8 = new Bundle();
                                }
                                r8.putString(Constants.IAP_TEST_DEDUP_RESULT, "1");
                                r8.putString(Constants.IAP_TEST_DEDUP_KEY_USED, r6);
                            }
                            if (z) {
                                if (r8 == 0) {
                                    r8 = new Bundle();
                                }
                                r8.putString(Constants.IAP_NON_DEDUPED_EVENT_TIME, String.valueOf(l != null ? l.longValue() / 1000 : 0L));
                                r8.putString(Constants.IAP_ACTUAL_DEDUP_RESULT, "1");
                                r8.putString(Constants.IAP_ACTUAL_DEDUP_KEY_USED, r11);
                            }
                            if (!isImplicitlyLogged && !z) {
                                ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> concurrentHashMap2 = timesOfImplicitPurchases;
                                if (concurrentHashMap2.get(inAppPurchase2) == null) {
                                    concurrentHashMap2.put(inAppPurchase2, new ArrayList());
                                }
                                List<Pair<Long, Pair<Bundle, OperationalData>>> list5 = concurrentHashMap2.get(inAppPurchase2);
                                if (list5 != null) {
                                    list5.add(new Pair<>(Long.valueOf(time), new Pair(component1, component2)));
                                }
                            } else if (!isImplicitlyLogged && !z) {
                                concurrentHashMap = timesOfManualPurchases;
                                if (concurrentHashMap.get(inAppPurchase2) == null) {
                                    concurrentHashMap.put(inAppPurchase2, new ArrayList());
                                }
                                list3 = concurrentHashMap.get(inAppPurchase2);
                                if (list3 == null) {
                                    list3.add(new Pair<>(Long.valueOf(time), new Pair(component1, component2)));
                                }
                            }
                            i = i2 + 1;
                            purchases2 = purchases;
                            purchaseParameters2 = purchaseParameters;
                            bundle2 = bundle;
                            r8 = r8;
                        }
                        r6 = bundle;
                        l = r6;
                        r11 = l;
                        z = false;
                        if (r6 != 0) {
                        }
                        if (z) {
                        }
                        if (!isImplicitlyLogged) {
                        }
                        if (!isImplicitlyLogged) {
                            concurrentHashMap = timesOfManualPurchases;
                            if (concurrentHashMap.get(inAppPurchase2) == null) {
                            }
                            list3 = concurrentHashMap.get(inAppPurchase2);
                            if (list3 == null) {
                            }
                        }
                        i = i2 + 1;
                        purchases2 = purchases;
                        purchaseParameters2 = purchaseParameters;
                        bundle2 = bundle;
                        r8 = r8;
                    } catch (Throwable th) {
                        th = th;
                        CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
                        return bundle;
                    }
                }
                bundle = bundle2;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair3 = (Pair) it.next();
                    if (isImplicitlyLogged) {
                        list = timesOfManualPurchases.get(pair3.getFirst());
                    } else {
                        list = timesOfImplicitPurchases.get(pair3.getFirst());
                    }
                    if (list != null) {
                        Iterator<Pair<Long, Pair<Bundle, OperationalData>>> it2 = list.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            int i4 = i3 + 1;
                            if (it2.next().getFirst().longValue() == ((Number) pair3.getSecond()).longValue()) {
                                list.remove(i3);
                                break;
                            }
                            i3 = i4;
                        }
                        if (isImplicitlyLogged) {
                            if (list.isEmpty()) {
                                timesOfManualPurchases.remove(pair3.getFirst());
                            } else {
                                timesOfManualPurchases.put(pair3.getFirst(), list);
                            }
                        } else if (list.isEmpty()) {
                            timesOfImplicitPurchases.remove(pair3.getFirst());
                        } else {
                            timesOfImplicitPurchases.put(pair3.getFirst(), list);
                        }
                    }
                }
                return r8;
            } catch (Throwable th2) {
                th = th2;
                bundle = bundle2;
            }
        }
    }

    public static /* synthetic */ String getDedupeParameter$default(InAppPurchaseManager inAppPurchaseManager, Bundle bundle, OperationalData operationalData, Bundle bundle2, OperationalData operationalData2, boolean z, boolean z2, int i, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return null;
        }
        try {
            return inAppPurchaseManager.getDedupeParameter(bundle, operationalData, bundle2, operationalData2, z, (i & 32) != 0 ? false : z2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
            return null;
        }
    }

    public final String getDedupeParameter(Bundle newPurchaseParameters, OperationalData newPurchaseOperationalData, Bundle oldPurchaseParameters, OperationalData oldPurchaseOperationalData, boolean dedupingWithImplicitlyLoggedHistory, boolean withTestDedupeKeys) {
        List<Pair<String, List<String>>> dedupeParameters;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (withTestDedupeKeys) {
                dedupeParameters = InAppPurchaseDedupeConfig.INSTANCE.getTestDedupeParameters(dedupingWithImplicitlyLoggedHistory);
            } else {
                dedupeParameters = InAppPurchaseDedupeConfig.INSTANCE.getDedupeParameters(dedupingWithImplicitlyLoggedHistory);
            }
            if (dedupeParameters == null) {
                return null;
            }
            for (Pair<String, List<String>> pair : dedupeParameters) {
                Object parameter = OperationalData.INSTANCE.getParameter(OperationalDataEnum.IAPParameters, pair.getFirst(), newPurchaseParameters, newPurchaseOperationalData);
                String str = parameter instanceof String ? (String) parameter : null;
                String str2 = str;
                if (str2 != null && str2.length() != 0) {
                    for (String str3 : pair.getSecond()) {
                        Object parameter2 = OperationalData.INSTANCE.getParameter(OperationalDataEnum.IAPParameters, str3, oldPurchaseParameters, oldPurchaseOperationalData);
                        String str4 = parameter2 instanceof String ? (String) parameter2 : null;
                        String str5 = str4;
                        if (str5 != null && str5.length() != 0 && Intrinsics.areEqual(str4, str)) {
                            return dedupingWithImplicitlyLoggedHistory ? pair.getFirst() : str3;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
