package com.appsflyer.internal;

import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1cSDK;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFd1fSDK implements AFd1cSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static int equals;
    private final Lazy AFAdRevenueData;
    private final Lazy areAllFieldsValid;
    private final Lazy component1;
    private AFd1cSDK.AFa1zSDK component2;
    private final Lazy component3;
    private final String component4;
    private final Lazy getCurrencyIso4217Code;
    private AFd1kSDK getMediationNetwork;
    private final Lazy getMonetizationNetwork;
    private final Lazy getRevenue;
    private static char[] hashCode = {34824, 34840, 34825, 34836, 34830};
    private static int toString = -272398166;
    private static boolean copy = true;
    private static boolean copydefault = true;

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i * 784) + (i2 * (-782)) + ((~i2) * (-783));
        int i5 = ~i;
        int i6 = ~i3;
        int i7 = i4 + ((~(i5 | i6 | i2)) * (-783)) + ((i5 | (~(i2 | i6))) * 783);
        if (i7 != 1) {
            if (i7 != 2) {
                return i7 != 3 ? i7 != 4 ? AFAdRevenueData(objArr) : getRevenue(objArr) : getCurrencyIso4217Code(objArr);
            }
            final AFd1fSDK aFd1fSDK = (AFd1fSDK) objArr[0];
            int i8 = 2 % 2;
            int i9 = equals + 39;
            AFKeystoreWrapper = i9 % 128;
            int i10 = i9 % 2;
            aFd1fSDK.component1().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1fSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1fSDK.getCurrencyIso4217Code(AFd1fSDK.this);
                }
            });
            int i11 = AFKeystoreWrapper + 81;
            equals = i11 % 128;
            int i12 = i11 % 2;
            return null;
        }
        int i13 = 2 % 2;
        AFi1ySDK aFi1ySDK = ((AFd1fSDK) objArr[0]).getCurrencyIso4217Code().getMediationNetwork.getMonetizationNetwork;
        if (aFi1ySDK != null) {
            int i14 = AFKeystoreWrapper + 35;
            equals = i14 % 128;
            int i15 = i14 % 2;
            AFh1dSDK aFh1dSDK = aFi1ySDK.getRevenue;
            if (aFh1dSDK != null) {
                AFh1bSDK aFh1bSDK = aFh1dSDK.getCurrencyIso4217Code;
                int i16 = equals + 119;
                AFKeystoreWrapper = i16 % 128;
                int i17 = i16 % 2;
                return aFh1bSDK;
            }
        }
        return null;
    }

    public AFd1fSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.getMediationNetwork = aFd1kSDK;
        this.getMonetizationNetwork = LazyKt.lazy(new Function0<AFg1xSDK>() { // from class: com.appsflyer.internal.AFd1fSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFg1xSDK invoke() {
                AFg1xSDK component1 = AFd1fSDK.getRevenue(AFd1fSDK.this).component1();
                Intrinsics.checkNotNullExpressionValue(component1, "");
                return component1;
            }

            {
                super(0);
            }
        });
        this.getRevenue = LazyKt.lazy(new Function0<AFd1rSDK>() { // from class: com.appsflyer.internal.AFd1fSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFd1rSDK invoke() {
                AFd1rSDK currencyIso4217Code = AFd1fSDK.getRevenue(AFd1fSDK.this).getCurrencyIso4217Code();
                Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
                return currencyIso4217Code;
            }

            {
                super(0);
            }
        });
        this.AFAdRevenueData = LazyKt.lazy(new Function0<AFd1pSDK>() { // from class: com.appsflyer.internal.AFd1fSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFd1pSDK invoke() {
                AFd1pSDK mediationNetwork = AFd1fSDK.getRevenue(AFd1fSDK.this).getMediationNetwork();
                Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
                return mediationNetwork;
            }

            {
                super(0);
            }
        });
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<AFg1uSDK>() { // from class: com.appsflyer.internal.AFd1fSDK.8
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFg1uSDK invoke() {
                AFg1uSDK AFInAppEventType = AFd1fSDK.getRevenue(AFd1fSDK.this).AFInAppEventType();
                Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
                return AFInAppEventType;
            }

            {
                super(0);
            }
        });
        this.areAllFieldsValid = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1fSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService monetizationNetwork = AFd1fSDK.getRevenue(AFd1fSDK.this).getMonetizationNetwork();
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                return monetizationNetwork;
            }

            {
                super(0);
            }
        });
        this.component4 = "6.15.1";
        this.component3 = LazyKt.lazy(new Function0<AFd1iSDK>() { // from class: com.appsflyer.internal.AFd1fSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFd1iSDK invoke() {
                AFd1lSDK AFInAppEventParameterName = AFd1fSDK.getRevenue(AFd1fSDK.this).AFInAppEventParameterName();
                Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
                return new AFd1iSDK(AFInAppEventParameterName);
            }

            {
                super(0);
            }
        });
        this.component1 = LazyKt.lazy(new Function0<AFd1eSDK>() { // from class: com.appsflyer.internal.AFd1fSDK.6
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFd1eSDK invoke() {
                return new AFd1eSDK(AFd1fSDK.this.getRevenue());
            }

            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ AFd1kSDK getRevenue(AFd1fSDK aFd1fSDK) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 3;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        AFd1kSDK aFd1kSDK = aFd1fSDK.getMediationNetwork;
        if (i4 == 0) {
            int i5 = 30 / 0;
        }
        int i6 = i2 + 67;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 85 / 0;
        }
        return aFd1kSDK;
    }

    private final AFg1xSDK getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = equals + 109;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        AFg1xSDK aFg1xSDK = (AFg1xSDK) this.getMonetizationNetwork.getValue();
        int i4 = AFKeystoreWrapper + 83;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return aFg1xSDK;
    }

    private final AFd1rSDK getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 99;
        equals = i2 % 128;
        int i3 = i2 % 2;
        AFd1rSDK aFd1rSDK = (AFd1rSDK) this.getRevenue.getValue();
        int i4 = equals + 89;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        return aFd1rSDK;
    }

    private final AFd1pSDK areAllFieldsValid() {
        AFd1pSDK aFd1pSDK;
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 81;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            aFd1pSDK = (AFd1pSDK) this.AFAdRevenueData.getValue();
            int i3 = 37 / 0;
        } else {
            aFd1pSDK = (AFd1pSDK) this.AFAdRevenueData.getValue();
        }
        int i4 = AFKeystoreWrapper + 49;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return aFd1pSDK;
        }
        throw null;
    }

    private final AFg1uSDK component3() {
        int i = 2 % 2;
        int i2 = equals + 91;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        AFg1uSDK aFg1uSDK = (AFg1uSDK) this.getCurrencyIso4217Code.getValue();
        int i4 = AFKeystoreWrapper + 101;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return aFg1uSDK;
    }

    private final ExecutorService component1() {
        int i = 2 % 2;
        int i2 = equals + 105;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        ExecutorService executorService = (ExecutorService) this.areAllFieldsValid.getValue();
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return executorService;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFd1fSDK aFd1fSDK = (AFd1fSDK) objArr[0];
        int i = 2 % 2;
        int i2 = equals + 71;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        AFd1gSDK aFd1gSDK = (AFd1gSDK) aFd1fSDK.component3.getValue();
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        int i5 = AFKeystoreWrapper + 123;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return aFd1gSDK;
    }

    private AFd1aSDK component4() {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 63;
        equals = i2 % 128;
        int i3 = i2 % 2;
        AFd1aSDK aFd1aSDK = (AFd1aSDK) this.component1.getValue();
        int i4 = AFKeystoreWrapper + 73;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return aFd1aSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1fSDK aFd1fSDK, Throwable th, String str) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 15;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1bSDK aFh1bSDK = (AFh1bSDK) getMediationNetwork(new Object[]{aFd1fSDK}, 1978259294, -1978259293, System.identityHashCode(aFd1fSDK));
        if (aFh1bSDK != null) {
            int i4 = AFKeystoreWrapper + 61;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                if (aFd1fSDK.getRevenue(aFh1bSDK)) {
                    return;
                }
            } else if (!aFd1fSDK.getRevenue(aFh1bSDK)) {
                return;
            }
            int i5 = AFKeystoreWrapper + 19;
            equals = i5 % 128;
            int i6 = i5 % 2;
            ((AFd1gSDK) getMediationNetwork(new Object[]{aFd1fSDK}, -1185215534, 1185215534, System.identityHashCode(aFd1fSDK))).getCurrencyIso4217Code(th, str);
        }
    }

    @Override // com.appsflyer.internal.AFd1cSDK
    public final void getMediationNetwork(final Throwable th, final String str) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 45;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        component1().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1fSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFd1fSDK.getMonetizationNetwork(AFd1fSDK.this, th, str);
            }
        });
        int i4 = AFKeystoreWrapper + 5;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1fSDK aFd1fSDK) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 99;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1fSDK, "");
            aFd1fSDK.copy();
        } else {
            Intrinsics.checkNotNullParameter(aFd1fSDK, "");
            aFd1fSDK.copy();
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1cSDK
    public final void getCurrencyIso4217Code(AFd1cSDK.AFa1zSDK aFa1zSDK) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 113;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.component2 = aFa1zSDK;
        component1().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1fSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFd1fSDK.AFAdRevenueData(AFd1fSDK.this);
            }
        });
        int i4 = AFKeystoreWrapper + 3;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1fSDK aFd1fSDK) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 17;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        aFd1fSDK.copydefault();
        int i4 = equals + 83;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1cSDK
    public final void AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = equals + 21;
        AFKeystoreWrapper = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            component1().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1fSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1fSDK.getMediationNetwork(AFd1fSDK.this);
                }
            });
            int i3 = equals + 79;
            AFKeystoreWrapper = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        component1().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1fSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFd1fSDK.getMediationNetwork(AFd1fSDK.this);
            }
        });
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1fSDK aFd1fSDK) {
        int i = 2 % 2;
        int i2 = equals + 41;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        aFd1fSDK.equals();
        int i4 = AFKeystoreWrapper + 89;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0182, code lost:
    
        if (r1.intValue() == (-1)) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0186 A[Catch: all -> 0x0286, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x001a, B:7:0x001f, B:9:0x0033, B:13:0x005e, B:15:0x006f, B:17:0x0076, B:19:0x0088, B:21:0x008c, B:23:0x00a0, B:25:0x00b3, B:27:0x00b9, B:29:0x00bf, B:31:0x00ca, B:35:0x00d8, B:37:0x00e6, B:39:0x00ec, B:41:0x00f2, B:42:0x00f8, B:44:0x0106, B:46:0x0115, B:48:0x011b, B:49:0x0121, B:50:0x0124, B:51:0x012a, B:53:0x013a, B:55:0x0147, B:56:0x014f, B:58:0x015f, B:60:0x0163, B:62:0x016e, B:66:0x0186, B:68:0x0191, B:69:0x025c, B:71:0x0260, B:73:0x0270, B:74:0x027f, B:77:0x027e, B:80:0x01aa, B:82:0x01c5, B:84:0x01ed, B:85:0x021c, B:86:0x017e, B:88:0x0173, B:91:0x0179, B:92:0x014c, B:96:0x0178, B:97:0x00d2, B:101:0x0237, B:102:0x0242, B:34:0x00d0, B:89:0x0176), top: B:3:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0260 A[Catch: all -> 0x0286, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x001a, B:7:0x001f, B:9:0x0033, B:13:0x005e, B:15:0x006f, B:17:0x0076, B:19:0x0088, B:21:0x008c, B:23:0x00a0, B:25:0x00b3, B:27:0x00b9, B:29:0x00bf, B:31:0x00ca, B:35:0x00d8, B:37:0x00e6, B:39:0x00ec, B:41:0x00f2, B:42:0x00f8, B:44:0x0106, B:46:0x0115, B:48:0x011b, B:49:0x0121, B:50:0x0124, B:51:0x012a, B:53:0x013a, B:55:0x0147, B:56:0x014f, B:58:0x015f, B:60:0x0163, B:62:0x016e, B:66:0x0186, B:68:0x0191, B:69:0x025c, B:71:0x0260, B:73:0x0270, B:74:0x027f, B:77:0x027e, B:80:0x01aa, B:82:0x01c5, B:84:0x01ed, B:85:0x021c, B:86:0x017e, B:88:0x0173, B:91:0x0179, B:92:0x014c, B:96:0x0178, B:97:0x00d2, B:101:0x0237, B:102:0x0242, B:34:0x00d0, B:89:0x0176), top: B:3:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0284 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c5 A[Catch: all -> 0x0286, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x001a, B:7:0x001f, B:9:0x0033, B:13:0x005e, B:15:0x006f, B:17:0x0076, B:19:0x0088, B:21:0x008c, B:23:0x00a0, B:25:0x00b3, B:27:0x00b9, B:29:0x00bf, B:31:0x00ca, B:35:0x00d8, B:37:0x00e6, B:39:0x00ec, B:41:0x00f2, B:42:0x00f8, B:44:0x0106, B:46:0x0115, B:48:0x011b, B:49:0x0121, B:50:0x0124, B:51:0x012a, B:53:0x013a, B:55:0x0147, B:56:0x014f, B:58:0x015f, B:60:0x0163, B:62:0x016e, B:66:0x0186, B:68:0x0191, B:69:0x025c, B:71:0x0260, B:73:0x0270, B:74:0x027f, B:77:0x027e, B:80:0x01aa, B:82:0x01c5, B:84:0x01ed, B:85:0x021c, B:86:0x017e, B:88:0x0173, B:91:0x0179, B:92:0x014c, B:96:0x0178, B:97:0x00d2, B:101:0x0237, B:102:0x0242, B:34:0x00d0, B:89:0x0176), top: B:3:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017e A[Catch: all -> 0x0286, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x001a, B:7:0x001f, B:9:0x0033, B:13:0x005e, B:15:0x006f, B:17:0x0076, B:19:0x0088, B:21:0x008c, B:23:0x00a0, B:25:0x00b3, B:27:0x00b9, B:29:0x00bf, B:31:0x00ca, B:35:0x00d8, B:37:0x00e6, B:39:0x00ec, B:41:0x00f2, B:42:0x00f8, B:44:0x0106, B:46:0x0115, B:48:0x011b, B:49:0x0121, B:50:0x0124, B:51:0x012a, B:53:0x013a, B:55:0x0147, B:56:0x014f, B:58:0x015f, B:60:0x0163, B:62:0x016e, B:66:0x0186, B:68:0x0191, B:69:0x025c, B:71:0x0260, B:73:0x0270, B:74:0x027f, B:77:0x027e, B:80:0x01aa, B:82:0x01c5, B:84:0x01ed, B:85:0x021c, B:86:0x017e, B:88:0x0173, B:91:0x0179, B:92:0x014c, B:96:0x0178, B:97:0x00d2, B:101:0x0237, B:102:0x0242, B:34:0x00d0, B:89:0x0176), top: B:3:0x0002, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void copy() {
        AFd1cSDK.AFa1zSDK aFa1zSDK;
        Integer num;
        Pair<Integer, Integer> pair;
        AFh1bSDK aFh1bSDK;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        Integer intOrNull;
        String value;
        Integer intOrNull2;
        String value2;
        Integer intOrNull3;
        int i4 = 2 % 2;
        AFh1bSDK aFh1bSDK2 = (AFh1bSDK) getMediationNetwork(new Object[]{this}, 1978259294, -1978259293, System.identityHashCode(this));
        if ((aFh1bSDK2 != null ? aFh1bSDK2.getCurrencyIso4217Code : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
            AFh1wSDK.v$default(AFLogger.INSTANCE, AFh1xSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
            areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window");
            ((AFd1gSDK) getMediationNetwork(new Object[]{this}, -1185215534, 1185215534, System.identityHashCode(this))).getMediationNetwork();
            return;
        }
        AFh1bSDK aFh1bSDK3 = (AFh1bSDK) getMediationNetwork(new Object[]{this}, 1978259294, -1978259293, System.identityHashCode(this));
        boolean z = false;
        if (aFh1bSDK3 != null) {
            if (AFAdRevenueData(aFh1bSDK3)) {
                AFh1bSDK aFh1bSDK4 = (AFh1bSDK) getMediationNetwork(new Object[]{this}, 1978259294, -1978259293, System.identityHashCode(this));
                Pair<Integer, Integer> pair2 = null;
                if (aFh1bSDK4 == null || (str2 = aFh1bSDK4.AFAdRevenueData) == null) {
                    num = null;
                } else {
                    Intrinsics.checkNotNullParameter(str2, "");
                    MatchResult matchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str2);
                    if (matchEntire != null) {
                        int i5 = AFKeystoreWrapper + 93;
                        equals = i5 % 128;
                        int i6 = i5 % 2;
                        MatchGroup matchGroup = matchEntire.getGroups().get(1);
                        if (matchGroup == null || (value2 = matchGroup.getValue()) == null || (intOrNull3 = StringsKt.toIntOrNull(value2)) == null) {
                            i2 = 0;
                        } else {
                            int i7 = equals + 95;
                            AFKeystoreWrapper = i7 % 128;
                            if (i7 % 2 == 0) {
                                i2 = intOrNull3.intValue();
                                int i8 = 28 / 0;
                            } else {
                                i2 = intOrNull3.intValue();
                            }
                        }
                        int i9 = i2 * 1000000;
                        MatchGroup matchGroup2 = matchEntire.getGroups().get(2);
                        int intValue = i9 + (((matchGroup2 == null || (value = matchGroup2.getValue()) == null || (intOrNull2 = StringsKt.toIntOrNull(value)) == null) ? 0 : intOrNull2.intValue()) * 1000);
                        MatchGroup matchGroup3 = matchEntire.getGroups().get(3);
                        if (matchGroup3 != null) {
                            int i10 = equals + 115;
                            AFKeystoreWrapper = i10 % 128;
                            int i11 = i10 % 2;
                            String value3 = matchGroup3.getValue();
                            if (value3 != null && (intOrNull = StringsKt.toIntOrNull(value3)) != null) {
                                i3 = intOrNull.intValue();
                                i = intValue + i3;
                            }
                        }
                        i3 = 0;
                        i = intValue + i3;
                    } else {
                        i = -1;
                    }
                    num = Integer.valueOf(i);
                }
                AFh1bSDK aFh1bSDK5 = (AFh1bSDK) getMediationNetwork(new Object[]{this}, 1978259294, -1978259293, System.identityHashCode(this));
                if (aFh1bSDK5 != null) {
                    int i12 = equals + 35;
                    AFKeystoreWrapper = i12 % 128;
                    int i13 = i12 % 2;
                    String str3 = aFh1bSDK5.AFAdRevenueData;
                    if (str3 != null) {
                        pair = AFe1ySDK.getMonetizationNetwork(str3);
                        aFh1bSDK = (AFh1bSDK) getMediationNetwork(new Object[]{this}, 1978259294, -1978259293, System.identityHashCode(this));
                        if (aFh1bSDK != null || (str = aFh1bSDK.AFAdRevenueData) == null) {
                            int i14 = 2 % 2;
                        } else {
                            int i15 = AFKeystoreWrapper + 115;
                            equals = i15 % 128;
                            if (i15 % 2 != 0) {
                                AFe1ySDK.getCurrencyIso4217Code(str);
                                throw null;
                            }
                            pair2 = AFe1ySDK.getCurrencyIso4217Code(str);
                        }
                        if (num != null) {
                        }
                        if (pair == null) {
                            int i16 = equals + 55;
                            AFKeystoreWrapper = i16 % 128;
                            if (i16 % 2 == 0) {
                                ((AFd1gSDK) getMediationNetwork(new Object[]{this}, -1185215534, 1185215534, System.identityHashCode(this))).getCurrencyIso4217Code(this.component4);
                            } else {
                                ((AFd1gSDK) getMediationNetwork(new Object[]{this}, -1185215534, 1185215534, System.identityHashCode(this))).getCurrencyIso4217Code(this.component4);
                            }
                            aFa1zSDK = this.component2;
                            if (aFa1zSDK == null) {
                                AFh1bSDK aFh1bSDK6 = (AFh1bSDK) getMediationNetwork(new Object[]{this}, 1978259294, -1978259293, System.identityHashCode(this));
                                if (aFh1bSDK6 != null) {
                                    int i17 = equals + 53;
                                    AFKeystoreWrapper = i17 % 128;
                                    int i18 = i17 % 2;
                                    z = getRevenue(aFh1bSDK6);
                                } else {
                                    int i19 = 2 % 2;
                                }
                                aFa1zSDK.onConfigurationChanged(z);
                                return;
                            }
                            return;
                        }
                        if (pair == null) {
                            ((AFd1gSDK) getMediationNetwork(new Object[]{this}, -1185215534, 1185215534, System.identityHashCode(this))).AFAdRevenueData(pair.getFirst().intValue(), pair.getSecond().intValue());
                        } else if (pair2 != null) {
                            int i20 = AFKeystoreWrapper + 5;
                            equals = i20 % 128;
                            int i21 = i20 % 2;
                            ((AFd1gSDK) getMediationNetwork(new Object[]{this}, -1185215534, 1185215534, System.identityHashCode(this))).AFAdRevenueData(pair2.getFirst().intValue(), pair2.getSecond().intValue());
                        } else {
                            areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window");
                            ((AFd1gSDK) getMediationNetwork(new Object[]{this}, -1185215534, 1185215534, System.identityHashCode(this))).getMediationNetwork();
                        }
                        aFa1zSDK = this.component2;
                        if (aFa1zSDK == null) {
                        }
                    }
                }
                int i22 = 2 % 2;
                pair = null;
                aFh1bSDK = (AFh1bSDK) getMediationNetwork(new Object[]{this}, 1978259294, -1978259293, System.identityHashCode(this));
                if (aFh1bSDK != null) {
                }
                int i142 = 2 % 2;
                if (num != null) {
                }
                if (pair == null) {
                }
                if (pair == null) {
                }
                aFa1zSDK = this.component2;
                if (aFa1zSDK == null) {
                }
            } else {
                int i23 = AFKeystoreWrapper + 89;
                equals = i23 % 128;
                int i24 = i23 % 2;
                int i25 = 2 % 2;
            }
        }
        areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window");
        ((AFd1gSDK) getMediationNetwork(new Object[]{this}, -1185215534, 1185215534, System.identityHashCode(this))).getMediationNetwork();
        aFa1zSDK = this.component2;
        if (aFa1zSDK == null) {
        }
    }

    private final void copydefault() {
        int i = 2 % 2;
        int i2 = equals + 123;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        AFh1bSDK aFh1bSDK = (AFh1bSDK) getMediationNetwork(new Object[]{this}, 1978259294, -1978259293, System.identityHashCode(this));
        if (aFh1bSDK != null) {
            int i4 = AFKeystoreWrapper + 121;
            equals = i4 % 128;
            int i5 = i4 % 2;
            if (!getMediationNetwork(aFh1bSDK)) {
                AFh1wSDK.v$default(AFLogger.INSTANCE, AFh1xSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                return;
            }
            int i6 = AFKeystoreWrapper + 121;
            equals = i6 % 128;
            int i7 = i6 % 2;
            String str = component3().component2;
            if (str != null) {
                String jSONObject = new JSONObject((Map) getMediationNetwork(new Object[]{(Map) getMediationNetwork(new Object[]{this, aFh1bSDK}, -959178268, 959178272, System.identityHashCode(this)), ((AFd1gSDK) getMediationNetwork(new Object[]{this}, -1185215534, 1185215534, System.identityHashCode(this))).getCurrencyIso4217Code()}, 1640024436, -1640024433, (int) System.currentTimeMillis())).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                Intrinsics.checkNotNullExpressionValue(str, "");
                getRevenue(jSONObject, str);
            }
        }
    }

    private static void a(String str, String str2, int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        char[] cArr = str2;
        if (str2 != null) {
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1uSDK aFk1uSDK = new AFk1uSDK();
        char[] cArr3 = hashCode;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr4[i3] = (char) (cArr3[i3] ^ (-6776211671728551741L));
            }
            int i4 = $11 + 53;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3 = cArr4;
        }
        int i6 = (int) ((-6776211671728551741L) ^ toString);
        if (copydefault) {
            aFk1uSDK.getRevenue = bArr2.length;
            char[] cArr5 = new char[aFk1uSDK.getRevenue];
            aFk1uSDK.getMonetizationNetwork = 0;
            while (aFk1uSDK.getMonetizationNetwork < aFk1uSDK.getRevenue) {
                cArr5[aFk1uSDK.getMonetizationNetwork] = (char) (cArr3[bArr2[(aFk1uSDK.getRevenue - 1) - aFk1uSDK.getMonetizationNetwork] + i] - i6);
                aFk1uSDK.getMonetizationNetwork++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (copy) {
            aFk1uSDK.getRevenue = cArr2.length;
            char[] cArr6 = new char[aFk1uSDK.getRevenue];
            aFk1uSDK.getMonetizationNetwork = 0;
            while (aFk1uSDK.getMonetizationNetwork < aFk1uSDK.getRevenue) {
                cArr6[aFk1uSDK.getMonetizationNetwork] = (char) (cArr3[cArr2[(aFk1uSDK.getRevenue - 1) - aFk1uSDK.getMonetizationNetwork] - i] - i6);
                aFk1uSDK.getMonetizationNetwork++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        aFk1uSDK.getRevenue = iArr.length;
        char[] cArr7 = new char[aFk1uSDK.getRevenue];
        aFk1uSDK.getMonetizationNetwork = 0;
        int i7 = $10 + 105;
        $11 = i7 % 128;
        while (true) {
            int i8 = i7 % 2;
            if (aFk1uSDK.getMonetizationNetwork >= aFk1uSDK.getRevenue) {
                break;
            }
            cArr7[aFk1uSDK.getMonetizationNetwork] = (char) (cArr3[iArr[(aFk1uSDK.getRevenue - 1) - aFk1uSDK.getMonetizationNetwork] - i] - i6);
            aFk1uSDK.getMonetizationNetwork++;
            i7 = $11 + 99;
            $10 = i7 % 128;
        }
        String str3 = new String(cArr7);
        int i9 = $11 + 37;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str3;
    }

    private final synchronized void equals() {
        int i = 2 % 2;
        int i2 = equals + 35;
        AFKeystoreWrapper = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        AFh1bSDK aFh1bSDK = (AFh1bSDK) getMediationNetwork(new Object[]{this}, 1978259294, -1978259293, System.identityHashCode(this));
        boolean z = false;
        if (aFh1bSDK != null) {
            if (aFh1bSDK.getMonetizationNetwork == -1) {
                int i3 = AFKeystoreWrapper + 71;
                equals = i3 % 128;
                if (i3 % 2 != 0) {
                    areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window");
                    int i4 = 12 / 0;
                } else {
                    areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window");
                }
            } else if (areAllFieldsValid().getRevenue("af_send_exc_to_server_window", -1L) == -1) {
                int i5 = AFKeystoreWrapper + 17;
                equals = i5 % 128;
                int i6 = i5 % 2;
                getMonetizationNetwork(aFh1bSDK);
                int i7 = equals + 25;
                AFKeystoreWrapper = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
            }
            z = getRevenue(aFh1bSDK);
        }
        AFd1cSDK.AFa1zSDK aFa1zSDK = this.component2;
        if (aFa1zSDK != null) {
            int i9 = AFKeystoreWrapper + 83;
            equals = i9 % 128;
            if (i9 % 2 == 0) {
                aFa1zSDK.onConfigurationChanged(z);
                return;
            } else {
                aFa1zSDK.onConfigurationChanged(z);
                throw null;
            }
        }
        return;
    }

    private final void getMonetizationNetwork(AFh1bSDK aFh1bSDK) {
        int i = 2 % 2;
        int i2 = equals + 115;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        int i4 = aFh1bSDK.getRevenue;
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1bSDK.getMonetizationNetwork);
        AFd1pSDK areAllFieldsValid = areAllFieldsValid();
        areAllFieldsValid.AFAdRevenueData("af_send_exc_to_server_window", currentTimeMillis);
        areAllFieldsValid.getRevenue("af_send_exc_min", i4);
        int i5 = AFKeystoreWrapper + 65;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1fSDK aFd1fSDK = (AFd1fSDK) objArr[0];
        AFh1bSDK aFh1bSDK = (AFh1bSDK) objArr[1];
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a("\u0085\u0084\u0083\u0082\u0081", null, null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
        AFd1rSDK monetizationNetwork = aFd1fSDK.getMonetizationNetwork();
        Map mapOf = MapsKt.mapOf(TuplesKt.to(((String) objArr2[0]).intern(), Build.BRAND), TuplesKt.to("model", Build.MODEL), TuplesKt.to("app_id", aFd1fSDK.getMonetizationNetwork().getMonetizationNetwork.getCurrencyIso4217Code.getPackageName()), TuplesKt.to("p_ex", new AFb1cSDK().getRevenue()), TuplesKt.to(MetricTracker.Place.API, String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to("sdk", aFd1fSDK.component4), TuplesKt.to("uid", AFb1mSDK.getMediationNetwork(monetizationNetwork.getMonetizationNetwork, monetizationNetwork.getRevenue)), TuplesKt.to("exc_config", aFh1bSDK.getMonetizationNetwork()));
        int i2 = AFKeystoreWrapper + 105;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 64 / 0;
        }
        return mapOf;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        Map map = (Map) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = equals + 83;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        Map mapOf = MapsKt.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFe1xSDK.getMediationNetwork(list)));
        int i4 = equals + 113;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 != 0) {
            return mapOf;
        }
        throw null;
    }

    private final void getRevenue(String str, String str2) {
        int i = 2 % 2;
        int i2 = equals + 53;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        component4().AFAdRevenueData(bytes, MapsKt.mapOf(TuplesKt.to("Authorization", AFb1kSDK.getCurrencyIso4217Code(str, str2))), 2000);
        int i4 = AFKeystoreWrapper + 59;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if (r1 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        r2 = com.appsflyer.internal.AFd1fSDK.AFKeystoreWrapper + 7;
        com.appsflyer.internal.AFd1fSDK.equals = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007f, code lost:
    
        if (((com.appsflyer.internal.AFd1gSDK) getMediationNetwork(new java.lang.Object[]{r12}, -1185215534, 1185215534, java.lang.System.identityHashCode(r12))).getMonetizationNetwork() >= r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        return AFAdRevenueData(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r13.getCurrencyIso4217Code < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r6)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r13.getCurrencyIso4217Code < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r6)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        if (r1 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if (r1 >= r6) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        r1 = areAllFieldsValid().AFAdRevenueData("af_send_exc_min", -1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMediationNetwork(AFh1bSDK aFh1bSDK) {
        long currentTimeMillis;
        long revenue;
        int i = 2 % 2;
        int i2 = equals + 61;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            currentTimeMillis = System.currentTimeMillis();
            revenue = areAllFieldsValid().getRevenue("af_send_exc_to_server_window", -1L);
            int i3 = 12 / 0;
        } else {
            currentTimeMillis = System.currentTimeMillis();
            revenue = areAllFieldsValid().getRevenue("af_send_exc_to_server_window", -1L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        return AFAdRevenueData(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        r13 = com.appsflyer.internal.AFd1fSDK.AFKeystoreWrapper + 119;
        com.appsflyer.internal.AFd1fSDK.equals = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if ((r13 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        r13 = null;
        r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r13.getCurrencyIso4217Code < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r6)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r13.getCurrencyIso4217Code < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r6)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        if (r1 == (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        r4 = com.appsflyer.internal.AFd1fSDK.equals + 59;
        com.appsflyer.internal.AFd1fSDK.AFKeystoreWrapper = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0057, code lost:
    
        if (r1 >= r6) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getRevenue(AFh1bSDK aFh1bSDK) {
        long currentTimeMillis;
        long revenue;
        int i = 2 % 2;
        int i2 = equals + 99;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            currentTimeMillis = System.currentTimeMillis();
            revenue = areAllFieldsValid().getRevenue("af_send_exc_to_server_window", -1L);
            int i3 = 16 / 0;
        } else {
            currentTimeMillis = System.currentTimeMillis();
            revenue = areAllFieldsValid().getRevenue("af_send_exc_to_server_window", -1L);
        }
    }

    private final boolean AFAdRevenueData(AFh1bSDK aFh1bSDK) {
        int i = 2 % 2;
        new AFe1wSDK();
        String str = this.component4;
        String str2 = aFh1bSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean revenue = AFe1wSDK.getRevenue(str, str2);
        int i2 = equals + 109;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    private static Map<String, Object> getCurrencyIso4217Code(Map<String, ? extends Object> map, List<AFd1jSDK> list) {
        return (Map) getMediationNetwork(new Object[]{map, list}, 1640024436, -1640024433, (int) System.currentTimeMillis());
    }

    private final Map<String, String> getCurrencyIso4217Code(AFh1bSDK aFh1bSDK) {
        return (Map) getMediationNetwork(new Object[]{this, aFh1bSDK}, -959178268, 959178272, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1cSDK
    public final void getMediationNetwork() {
        getMediationNetwork(new Object[]{this}, 1290137280, -1290137278, System.identityHashCode(this));
    }

    public final AFd1gSDK getRevenue() {
        return (AFd1gSDK) getMediationNetwork(new Object[]{this}, -1185215534, 1185215534, System.identityHashCode(this));
    }

    private final AFh1bSDK component2() {
        return (AFh1bSDK) getMediationNetwork(new Object[]{this}, 1978259294, -1978259293, System.identityHashCode(this));
    }
}
