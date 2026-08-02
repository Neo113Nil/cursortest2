package com.appsflyer.internal;

import android.graphics.PointF;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.m0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFd1wSDK implements AFd1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static char copy = 10357;
    private static int copydefault = 0;
    private static char equals = 787;
    private static char hashCode = 7956;
    private static char toString = 48673;

    @NotNull
    private AFd1zSDK AFAdRevenueData;

    @NotNull
    private final gf.i areAllFieldsValid;

    @Nullable
    private AFd1xSDK.AFa1vSDK component1;

    @NotNull
    private final gf.i component2;

    @NotNull
    private final gf.i component3;

    @NotNull
    private final String component4;

    @NotNull
    private final gf.i getCurrencyIso4217Code;

    @NotNull
    private final gf.i getMediationNetwork;

    @NotNull
    private final gf.i getMonetizationNetwork;

    @NotNull
    private final gf.i getRevenue;

    public AFd1wSDK(@NotNull AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.AFAdRevenueData = aFd1zSDK;
        this.getRevenue = gf.k.b(new Function0<AFf1kSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFf1kSDK invoke() {
                AFf1kSDK component1 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component1();
                Intrinsics.checkNotNullExpressionValue(component1, "");
                return component1;
            }
        });
        this.getMediationNetwork = gf.k.b(new Function0<AFc1oSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFc1oSDK invoke() {
                AFc1oSDK AFAdRevenueData = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFAdRevenueData();
                Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
                return AFAdRevenueData;
            }
        });
        this.getMonetizationNetwork = gf.k.b(new Function0<AFc1qSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFc1qSDK invoke() {
                AFc1qSDK component4 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component4();
                Intrinsics.checkNotNullExpressionValue(component4, "");
                return component4;
            }
        });
        this.getCurrencyIso4217Code = gf.k.b(new Function0<AFf1eSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFf1eSDK invoke() {
                AFf1eSDK AFInAppEventType = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventType();
                Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
                return AFInAppEventType;
            }
        });
        this.component2 = gf.k.b(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1wSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService monetizationNetwork = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).getMonetizationNetwork();
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                return monetizationNetwork;
            }
        });
        this.component4 = "6.17.5";
        this.component3 = gf.k.b(new Function0<AFd1ySDK>() { // from class: com.appsflyer.internal.AFd1wSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFd1ySDK invoke() {
                AFc1hSDK AFInAppEventParameterName = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventParameterName();
                Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
                return new AFd1ySDK(AFInAppEventParameterName);
            }
        });
        this.areAllFieldsValid = gf.k.b(new Function0<AFd1vSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFd1vSDK invoke() {
                return new AFd1vSDK(AFd1wSDK.this.getRevenue());
            }
        });
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFi1zSDK aFi1zSDK;
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        AFKeystoreWrapper = (copydefault + 77) % 128;
        AFi1vSDK aFi1vSDK = aFd1wSDK.getCurrencyIso4217Code().AFAdRevenueData.getCurrencyIso4217Code;
        if (aFi1vSDK == null || (aFi1zSDK = aFi1vSDK.getMonetizationNetwork) == null) {
            return null;
        }
        int i5 = AFKeystoreWrapper + 109;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return aFi1zSDK.getCurrencyIso4217Code;
        }
        AFh1aSDK aFh1aSDK = aFi1zSDK.getCurrencyIso4217Code;
        throw null;
    }

    private final ExecutorService areAllFieldsValid() {
        copydefault = (AFKeystoreWrapper + 53) % 128;
        ExecutorService executorService = (ExecutorService) this.component2.getValue();
        AFKeystoreWrapper = (copydefault + 119) % 128;
        return executorService;
    }

    private final AFf1eSDK component1() {
        AFKeystoreWrapper = (copydefault + 109) % 128;
        AFf1eSDK aFf1eSDK = (AFf1eSDK) this.getCurrencyIso4217Code.getValue();
        copydefault = (AFKeystoreWrapper + 117) % 128;
        return aFf1eSDK;
    }

    private final AFc1qSDK component2() {
        return (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
    }

    @NotNull
    private AFd1uSDK component3() {
        copydefault = (AFKeystoreWrapper + 75) % 128;
        AFd1uSDK aFd1uSDK = (AFd1uSDK) this.areAllFieldsValid.getValue();
        int i5 = copydefault + 77;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 15 / 0;
        }
        return aFd1uSDK;
    }

    private final AFh1aSDK component4() {
        return (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (getMediationNetwork(r0) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        com.appsflyer.internal.AFd1wSDK.copydefault = (com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 121) % 128;
        r5 = component1().getMediationNetwork();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r0 = new org.json.JSONObject(getMonetizationNetwork(getRevenue(r0), getRevenue().getRevenue())).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        getMediationNetwork(new java.lang.Object[]{r10, r0, r5}, -1856843688, 1856843689, java.lang.System.identityHashCode(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        com.appsflyer.internal.AFh1ySDK.v$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0095, code lost:
    
        r0 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 3;
        com.appsflyer.internal.AFd1wSDK.copydefault = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x009d, code lost:
    
        if ((r0 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x009f, code lost:
    
        r0 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a2, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copy() {
        AFh1aSDK aFh1aSDK;
        int i5 = copydefault + 15;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            int i10 = 33 / 0;
        } else {
            aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0133, code lost:
    
        if (r10 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013a, code lost:
    
        r10 = com.appsflyer.internal.AFd1rSDK.getMonetizationNetwork(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0138, code lost:
    
        if (r10 != null) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015f A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0021, B:6:0x0029, B:8:0x003d, B:12:0x0065, B:14:0x0075, B:16:0x007b, B:19:0x008e, B:21:0x0092, B:23:0x00a4, B:25:0x00ac, B:27:0x00b0, B:29:0x00be, B:30:0x00c4, B:32:0x00d0, B:34:0x00d4, B:36:0x00da, B:38:0x00e5, B:39:0x00ee, B:41:0x00fa, B:43:0x00fe, B:45:0x0104, B:46:0x010a, B:47:0x010d, B:48:0x0113, B:50:0x0123, B:52:0x012e, B:56:0x013a, B:57:0x0140, B:59:0x0150, B:61:0x0154, B:63:0x015f, B:64:0x0164, B:67:0x016b, B:70:0x018b, B:71:0x01f2, B:73:0x01f6, B:75:0x0206, B:76:0x020a, B:82:0x01a5, B:83:0x01bd, B:85:0x0173, B:86:0x0136, B:96:0x00ec, B:97:0x01d8, B:54:0x0132, B:65:0x0167, B:90:0x00ea), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0021, B:6:0x0029, B:8:0x003d, B:12:0x0065, B:14:0x0075, B:16:0x007b, B:19:0x008e, B:21:0x0092, B:23:0x00a4, B:25:0x00ac, B:27:0x00b0, B:29:0x00be, B:30:0x00c4, B:32:0x00d0, B:34:0x00d4, B:36:0x00da, B:38:0x00e5, B:39:0x00ee, B:41:0x00fa, B:43:0x00fe, B:45:0x0104, B:46:0x010a, B:47:0x010d, B:48:0x0113, B:50:0x0123, B:52:0x012e, B:56:0x013a, B:57:0x0140, B:59:0x0150, B:61:0x0154, B:63:0x015f, B:64:0x0164, B:67:0x016b, B:70:0x018b, B:71:0x01f2, B:73:0x01f6, B:75:0x0206, B:76:0x020a, B:82:0x01a5, B:83:0x01bd, B:85:0x0173, B:86:0x0136, B:96:0x00ec, B:97:0x01d8, B:54:0x0132, B:65:0x0167, B:90:0x00ea), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018b A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0021, B:6:0x0029, B:8:0x003d, B:12:0x0065, B:14:0x0075, B:16:0x007b, B:19:0x008e, B:21:0x0092, B:23:0x00a4, B:25:0x00ac, B:27:0x00b0, B:29:0x00be, B:30:0x00c4, B:32:0x00d0, B:34:0x00d4, B:36:0x00da, B:38:0x00e5, B:39:0x00ee, B:41:0x00fa, B:43:0x00fe, B:45:0x0104, B:46:0x010a, B:47:0x010d, B:48:0x0113, B:50:0x0123, B:52:0x012e, B:56:0x013a, B:57:0x0140, B:59:0x0150, B:61:0x0154, B:63:0x015f, B:64:0x0164, B:67:0x016b, B:70:0x018b, B:71:0x01f2, B:73:0x01f6, B:75:0x0206, B:76:0x020a, B:82:0x01a5, B:83:0x01bd, B:85:0x0173, B:86:0x0136, B:96:0x00ec, B:97:0x01d8, B:54:0x0132, B:65:0x0167, B:90:0x00ea), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void copydefault() {
        Integer num;
        Pair<Integer, Integer> pair;
        AFh1aSDK aFh1aSDK;
        String str;
        int i5;
        String str2;
        String str3;
        int i10;
        int i11;
        MatchGroup a7;
        int i12;
        String str4;
        Integer intOrNull;
        String str5;
        Integer intOrNull2;
        String str6;
        try {
            copydefault = (AFKeystoreWrapper + 13) % 128;
            AFh1aSDK aFh1aSDK2 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if ((aFh1aSDK2 != null ? aFh1aSDK2.getMonetizationNetwork : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                getRevenue().getCurrencyIso4217Code();
                return;
            }
            AFh1aSDK aFh1aSDK3 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if (aFh1aSDK3 == null || !getMonetizationNetwork(aFh1aSDK3)) {
                ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                getRevenue().getCurrencyIso4217Code();
            } else {
                AFh1aSDK aFh1aSDK4 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                Pair<Integer, Integer> pair2 = null;
                if (aFh1aSDK4 == null || (str3 = aFh1aSDK4.getRevenue) == null) {
                    num = null;
                } else {
                    Intrinsics.checkNotNullParameter(str3, "");
                    kotlin.text.n c2 = new Regex("(\\d+).(\\d+).(\\d+).*").c(str3);
                    if (c2 != null) {
                        MatchGroup a10 = c2.f19282c.a(1);
                        if (a10 != null && (str6 = a10.f19244a) != null) {
                            copydefault = (AFKeystoreWrapper + 109) % 128;
                            Integer intOrNull3 = StringsKt.toIntOrNull(str6);
                            if (intOrNull3 != null) {
                                i11 = intOrNull3.intValue();
                                int i13 = i11 * 1000000;
                                a7 = c2.f19282c.a(2);
                                if (a7 != null || (str5 = a7.f19244a) == null || (intOrNull2 = StringsKt.toIntOrNull(str5)) == null) {
                                    i12 = 0;
                                } else {
                                    int i14 = copydefault + 123;
                                    AFKeystoreWrapper = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        throw null;
                                    }
                                    i12 = intOrNull2.intValue();
                                }
                                int i15 = (i12 * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + i13;
                                MatchGroup a11 = c2.f19282c.a(3);
                                i10 = i15 + ((a11 != null || (str4 = a11.f19244a) == null || (intOrNull = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull.intValue());
                            }
                        }
                        i11 = 0;
                        int i132 = i11 * 1000000;
                        a7 = c2.f19282c.a(2);
                        if (a7 != null) {
                        }
                        i12 = 0;
                        int i152 = (i12 * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + i132;
                        MatchGroup a112 = c2.f19282c.a(3);
                        i10 = i152 + ((a112 != null || (str4 = a112.f19244a) == null || (intOrNull = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull.intValue());
                    } else {
                        i10 = -1;
                    }
                    num = Integer.valueOf(i10);
                }
                AFh1aSDK aFh1aSDK5 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                if (aFh1aSDK5 != null) {
                    int i16 = copydefault + 15;
                    AFKeystoreWrapper = i16 % 128;
                    if (i16 % 2 == 0) {
                        str2 = aFh1aSDK5.getRevenue;
                        int i17 = 29 / 0;
                    } else {
                        str2 = aFh1aSDK5.getRevenue;
                    }
                    aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                    if (aFh1aSDK != null && (str = aFh1aSDK.getRevenue) != null) {
                        i5 = AFKeystoreWrapper + 99;
                        copydefault = i5 % 128;
                        if (i5 % 2 == 0) {
                            AFd1rSDK.AFAdRevenueData(str);
                            throw null;
                        }
                        pair2 = AFd1rSDK.AFAdRevenueData(str);
                    }
                    if ((num == null || num.intValue() != -1) && pair == null) {
                        AFKeystoreWrapper = (copydefault + 59) % 128;
                        getRevenue().getMonetizationNetwork(this.component4);
                    } else if (pair != null) {
                        getRevenue().getCurrencyIso4217Code(((Number) pair.f19192a).intValue(), ((Number) pair.f19193b).intValue());
                    } else if (pair2 != null) {
                        getRevenue().getCurrencyIso4217Code(((Number) pair2.f19192a).intValue(), ((Number) pair2.f19193b).intValue());
                    } else {
                        ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                        getRevenue().getCurrencyIso4217Code();
                    }
                }
                pair = null;
                aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                if (aFh1aSDK != null) {
                    i5 = AFKeystoreWrapper + 99;
                    copydefault = i5 % 128;
                    if (i5 % 2 == 0) {
                    }
                }
                if (num == null) {
                    if (pair != null) {
                    }
                }
                if (pair != null) {
                }
            }
            AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                AFh1aSDK aFh1aSDK6 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                aFa1vSDK.onConfigurationChanged(aFh1aSDK6 != null ? AFAdRevenueData(aFh1aSDK6) : false);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void equals() {
        try {
            copydefault = (AFKeystoreWrapper + 119) % 128;
            boolean z5 = false;
            AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if (aFh1aSDK != null) {
                if (aFh1aSDK.getMediationNetwork == -1) {
                    ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                } else if (((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                    AFKeystoreWrapper = (copydefault + 21) % 128;
                    getCurrencyIso4217Code(aFh1aSDK);
                }
                z5 = AFAdRevenueData(aFh1aSDK);
            }
            AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                aFa1vSDK.onConfigurationChanged(z5);
                int i5 = AFKeystoreWrapper + 111;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                } else {
                    throw null;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1wSDK aFd1wSDK, Throwable th2, String str) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{aFd1wSDK}, -2108652204, 2108652208, System.identityHashCode(aFd1wSDK));
        if (aFh1aSDK != null) {
            int i5 = copydefault + 99;
            AFKeystoreWrapper = i5 % 128;
            if (i5 % 2 != 0 ? !aFd1wSDK.AFAdRevenueData(aFh1aSDK) : aFd1wSDK.AFAdRevenueData(aFh1aSDK)) {
                AFKeystoreWrapper = (copydefault + 49) % 128;
            } else {
                AFKeystoreWrapper = (copydefault + 91) % 128;
                aFd1wSDK.getRevenue().AFAdRevenueData(th2, str);
            }
        }
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i5, int i10, int i11) {
        int i12 = ~((~i5) | (~i10));
        int i13 = ~i11;
        int i14 = ((i5 | i10 | i11) * 220) + (((~(i13 | i10)) | i5) * (-440)) + ((i12 | (~(i13 | i5 | i10))) * 220) + (i10 * (-219)) + (i5 * 221);
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? getMonetizationNetwork(objArr) : AFAdRevenueData(objArr) : getMediationNetwork(objArr) : getRevenue(objArr) : getCurrencyIso4217Code(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1wSDK aFd1wSDK) {
        int i5 = copydefault + 13;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.copydefault();
        } else {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.copydefault();
            throw null;
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i5 = copydefault + 25;
        AFKeystoreWrapper = i5 % 128;
        int i10 = i5 % 2;
        AFc1qSDK aFc1qSDK = (AFc1qSDK) aFd1wSDK.getMonetizationNetwork.getValue();
        if (i10 == 0) {
            int i11 = 60 / 0;
        }
        AFKeystoreWrapper = (copydefault + 51) % 128;
        return aFc1qSDK;
    }

    private static void a(String str, int i5, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 51) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr3 = new char[cArr2.length];
        aFk1qSDK.getRevenue = 0;
        char[] cArr4 = new char[2];
        while (true) {
            int i10 = aFk1qSDK.getRevenue;
            if (i10 >= cArr2.length) {
                break;
            }
            cArr4[0] = cArr2[i10];
            cArr4[1] = cArr2[i10 + 1];
            int i11 = 58224;
            for (int i12 = 0; i12 < 16; i12++) {
                char c2 = cArr4[1];
                char c8 = cArr4[0];
                char c10 = (char) (c2 - (((c8 + i11) ^ ((c8 << 4) + ((char) (toString ^ (-1199070254561146252L))))) ^ ((c8 >>> 5) + ((char) (copy ^ (-1199070254561146252L))))));
                cArr4[1] = c10;
                cArr4[0] = (char) (c8 - (((c10 >>> 5) + ((char) (hashCode ^ (-1199070254561146252L)))) ^ ((c10 + i11) ^ ((c10 << 4) + ((char) (equals ^ (-1199070254561146252L)))))));
                i11 -= 40503;
            }
            int i13 = aFk1qSDK.getRevenue;
            cArr3[i13] = cArr4[0];
            cArr3[i13 + 1] = cArr4[1];
            aFk1qSDK.getRevenue = i13 + 2;
        }
        String str2 = new String(cArr3, 0, i5);
        int i14 = $10 + 97;
        $11 = i14 % 128;
        if (i14 % 2 != 0) {
            objArr[0] = str2;
        } else {
            int i15 = 2 / 0;
            objArr[0] = str2;
        }
    }

    private final AFc1oSDK getMediationNetwork() {
        copydefault = (AFKeystoreWrapper + 9) % 128;
        AFc1oSDK aFc1oSDK = (AFc1oSDK) this.getMediationNetwork.getValue();
        copydefault = (AFKeystoreWrapper + 21) % 128;
        return aFc1oSDK;
    }

    @NotNull
    public final AFc1cSDK getRevenue() {
        copydefault = (AFKeystoreWrapper + 93) % 128;
        AFc1cSDK aFc1cSDK = (AFc1cSDK) this.component3.getValue();
        int i5 = copydefault + 121;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 3 / 0;
        }
        return aFc1cSDK;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        Throwable th2 = (Throwable) objArr[1];
        String str = (String) objArr[2];
        AFKeystoreWrapper = (copydefault + 49) % 128;
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        aFd1wSDK.areAllFieldsValid().execute(new androidx.fragment.app.d(aFd1wSDK, th2, str, 5));
        int i5 = copydefault + 41;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1wSDK aFd1wSDK) {
        int i5 = AFKeystoreWrapper + 61;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.equals();
            copydefault = (AFKeystoreWrapper + 99) % 128;
        } else {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.equals();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1wSDK aFd1wSDK) {
        AFKeystoreWrapper = (copydefault + 83) % 128;
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.copy();
        AFKeystoreWrapper = (copydefault + 45) % 128;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(@Nullable AFd1xSDK.AFa1vSDK aFa1vSDK) {
        int i5 = AFKeystoreWrapper + 31;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new j(this, 0));
        } else {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new j(this, 0));
            throw null;
        }
    }

    public static final /* synthetic */ AFd1zSDK getCurrencyIso4217Code(AFd1wSDK aFd1wSDK) {
        int i5 = copydefault + 101;
        AFKeystoreWrapper = i5 % 128;
        int i10 = i5 % 2;
        AFd1zSDK aFd1zSDK = aFd1wSDK.AFAdRevenueData;
        if (i10 != 0) {
            return aFd1zSDK;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFAdRevenueData() {
        int i5 = AFKeystoreWrapper + 97;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            areAllFieldsValid().execute(new j(this, 1));
            int i10 = 82 / 0;
        } else {
            areAllFieldsValid().execute(new j(this, 1));
        }
        copydefault = (AFKeystoreWrapper + 119) % 128;
    }

    private final AFf1kSDK getCurrencyIso4217Code() {
        copydefault = (AFKeystoreWrapper + 1) % 128;
        AFf1kSDK aFf1kSDK = (AFf1kSDK) this.getRevenue.getValue();
        int i5 = AFKeystoreWrapper + 1;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return aFf1kSDK;
        }
        throw null;
    }

    private final Map<String, String> getRevenue(AFh1aSDK aFh1aSDK) {
        Object[] objArr = new Object[1];
        a("炜桪ꪴ鐅⠖ᰫ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr);
        Map<String, String> e7 = n0.e(new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair(CommonUrlParts.MODEL, Build.MODEL), new Pair(CommonUrlParts.APP_ID, getMediationNetwork().getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()), new Pair("p_ex", new AFa1uSDK().AFAdRevenueData()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", this.component4), new Pair("uid", AFb1kSDK.getCurrencyIso4217Code(getMediationNetwork().getMediationNetwork)), new Pair("exc_config", aFh1aSDK.AFAdRevenueData()));
        int i5 = AFKeystoreWrapper + 111;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return e7;
        }
        throw null;
    }

    private final void getCurrencyIso4217Code(AFh1aSDK aFh1aSDK) {
        copydefault = (AFKeystoreWrapper + 97) % 128;
        int i5 = aFh1aSDK.getCurrencyIso4217Code;
        long millis = TimeUnit.DAYS.toMillis(aFh1aSDK.getMediationNetwork) + System.currentTimeMillis();
        AFc1qSDK aFc1qSDK = (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
        aFc1qSDK.AFAdRevenueData("af_send_exc_to_server_window", millis);
        aFc1qSDK.getMediationNetwork("af_send_exc_min", i5);
        int i10 = AFKeystoreWrapper + 17;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0081, code lost:
    
        if (r1 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
    
        r2 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 31;
        com.appsflyer.internal.AFd1wSDK.copydefault = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008d, code lost:
    
        if ((r2 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008f, code lost:
    
        r3 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009a, code lost:
    
        if (getRevenue().getMediationNetwork() >= r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ac, code lost:
    
        return getMonetizationNetwork(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        if (getRevenue().getMediationNetwork() >= r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
    
        r0 = com.appsflyer.internal.AFd1wSDK.copydefault + 63;
        com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        if ((r0 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r18.getMonetizationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r9)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if (r18.getMonetizationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r9)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0065, code lost:
    
        if (r11 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        if (r11 >= r9) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006c, code lost:
    
        r1 = ((com.appsflyer.internal.AFc1qSDK) getMediationNetwork(new java.lang.Object[]{r17}, 1891172040, -1891172038, java.lang.System.identityHashCode(r17))).getRevenue("af_send_exc_min", -1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMediationNetwork(AFh1aSDK aFh1aSDK) {
        long currentTimeMillis;
        long monetizationNetwork;
        int i5 = copydefault + 19;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            currentTimeMillis = System.currentTimeMillis();
            monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
            int i10 = 9 / 0;
        } else {
            currentTimeMillis = System.currentTimeMillis();
            monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
        }
    }

    private final boolean AFAdRevenueData(AFh1aSDK aFh1aSDK) {
        AFKeystoreWrapper = (copydefault + 29) % 128;
        long currentTimeMillis = System.currentTimeMillis();
        long monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1aSDK.getMonetizationNetwork >= TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis) && monetizationNetwork != -1) {
            AFKeystoreWrapper = (copydefault + 123) % 128;
            if (monetizationNetwork >= currentTimeMillis) {
                return getMonetizationNetwork(aFh1aSDK);
            }
        }
        return false;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i5 = AFKeystoreWrapper + 77;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            aFd1wSDK.areAllFieldsValid().execute(new j(aFd1wSDK, 2));
            int i10 = 69 / 0;
            return null;
        }
        aFd1wSDK.areAllFieldsValid().execute(new j(aFd1wSDK, 2));
        return null;
    }

    private static Map<String, Object> getMonetizationNetwork(Map<String, ? extends Object> map, List<AFc1aSDK> list) {
        AFKeystoreWrapper = (copydefault + 121) % 128;
        Map<String, Object> e7 = n0.e(new Pair("deviceInfo", map), new Pair("excs", AFd1qSDK.getMediationNetwork(list)));
        copydefault = (AFKeystoreWrapper + 15) % 128;
        return e7;
    }

    private static Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        copydefault = (AFKeystoreWrapper + 61) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        aFd1wSDK.component3().getMonetizationNetwork(bytes, m0.b(new Pair("Authorization", AFj1dSDK.getMonetizationNetwork(str, str2))), 2000);
        int i5 = AFKeystoreWrapper + 69;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 36 / 0;
        }
        return null;
    }

    private final boolean getMonetizationNetwork(AFh1aSDK aFh1aSDK) {
        new AFd1pSDK();
        String str = this.component4;
        String str2 = aFh1aSDK.getRevenue;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean currencyIso4217Code = AFd1pSDK.getCurrencyIso4217Code(str, str2);
        int i5 = copydefault + 97;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 79 / 0;
        }
        return currencyIso4217Code;
    }

    private final void getMediationNetwork(String str, String str2) {
        getMediationNetwork(new Object[]{this, str, str2}, -1856843688, 1856843689, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork() {
        getMediationNetwork(new Object[]{this}, 452613973, -452613973, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(@NotNull Throwable th2, @NotNull String str) {
        getMediationNetwork(new Object[]{this, th2, str}, -1045855402, 1045855405, System.identityHashCode(this));
    }
}
