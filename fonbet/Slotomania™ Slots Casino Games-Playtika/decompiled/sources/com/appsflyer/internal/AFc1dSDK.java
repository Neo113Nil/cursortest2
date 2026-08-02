package com.appsflyer.internal;

import android.os.Build;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1bSDK;
import com.google.common.net.HttpHeaders;
import com.vungle.ads.internal.protos.Sdk;
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

/* loaded from: classes2.dex */
public final class AFc1dSDK implements AFc1bSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long copy = -5804734778320964624L;
    private static char copydefault = 46064;
    private static int equals = 347067139;
    private static int hashCode = 0;
    private static int toString = 1;
    private final Lazy AFAdRevenueData;
    private final String areAllFieldsValid;
    private AFc1bSDK.AFa1vSDK component1;
    private final Lazy component2;
    private final Lazy component3;
    private final Lazy component4;
    private final Lazy getCurrencyIso4217Code;
    private final Lazy getMediationNetwork;
    private AFc1fSDK getMonetizationNetwork;
    private final Lazy getRevenue;

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~(i5 | i);
        int i7 = (i * 399) + (i2 * 399) + ((i4 | i6 | (~(i5 | i3))) * 398) + ((i | i2) * (-1194)) + (((~((~i3) | i5)) | i4 | i6) * 398);
        if (i7 == 1) {
            return getRevenue(objArr);
        }
        if (i7 == 2) {
            return getMonetizationNetwork(objArr);
        }
        if (i7 != 3) {
            return i7 != 4 ? AFAdRevenueData(objArr) : getCurrencyIso4217Code(objArr);
        }
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        AFh1gSDK aFh1gSDK = (AFh1gSDK) objArr[1];
        int i8 = 2 % 2;
        int i9 = toString + 91;
        hashCode = i9 % 128;
        int i10 = i9 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        long mediationNetwork = aFc1dSDK.component4().getMediationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1gSDK.getMediationNetwork < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
            return false;
        }
        if (mediationNetwork != -1) {
            int i11 = hashCode + 55;
            toString = i11 % 128;
            int i12 = i11 % 2;
            if (mediationNetwork >= currentTimeMillis) {
                return Boolean.valueOf(aFc1dSDK.getMediationNetwork(aFh1gSDK));
            }
        }
        int i13 = toString + 13;
        hashCode = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public AFc1dSDK(AFc1fSDK aFc1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        this.getMonetizationNetwork = aFc1fSDK;
        this.AFAdRevenueData = LazyKt.lazy(new Function0<AFf1mSDK>() { // from class: com.appsflyer.internal.AFc1dSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFf1mSDK invoke() {
                AFf1mSDK component4 = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).component4();
                Intrinsics.checkNotNullExpressionValue(component4, "");
                return component4;
            }

            {
                super(0);
            }
        });
        this.getMediationNetwork = LazyKt.lazy(new Function0<AFc1kSDK>() { // from class: com.appsflyer.internal.AFc1dSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFc1kSDK invoke() {
                AFc1kSDK revenue = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).getRevenue();
                Intrinsics.checkNotNullExpressionValue(revenue, "");
                return revenue;
            }

            {
                super(0);
            }
        });
        this.getRevenue = LazyKt.lazy(new Function0<AFc1sSDK>() { // from class: com.appsflyer.internal.AFc1dSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFc1sSDK invoke() {
                AFc1sSDK component1 = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).component1();
                Intrinsics.checkNotNullExpressionValue(component1, "");
                return component1;
            }

            {
                super(0);
            }
        });
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<AFf1iSDK>() { // from class: com.appsflyer.internal.AFc1dSDK.8
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFf1iSDK invoke() {
                AFf1iSDK AFKeystoreWrapper = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).AFKeystoreWrapper();
                Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
                return AFKeystoreWrapper;
            }

            {
                super(0);
            }
        });
        this.component2 = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFc1dSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService AFAdRevenueData = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).AFAdRevenueData();
                Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
                return AFAdRevenueData;
            }

            {
                super(0);
            }
        });
        this.areAllFieldsValid = "6.16.2";
        this.component4 = LazyKt.lazy(new Function0<AFd1zSDK>() { // from class: com.appsflyer.internal.AFc1dSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFd1zSDK invoke() {
                AFc1hSDK AFLogger = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).AFLogger();
                Intrinsics.checkNotNullExpressionValue(AFLogger, "");
                return new AFd1zSDK(AFLogger);
            }

            {
                super(0);
            }
        });
        this.component3 = LazyKt.lazy(new Function0<AFd1wSDK>() { // from class: com.appsflyer.internal.AFc1dSDK.10
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFd1wSDK invoke() {
                return new AFd1wSDK(AFc1dSDK.this.AFAdRevenueData());
            }

            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ AFc1fSDK getCurrencyIso4217Code(AFc1dSDK aFc1dSDK) {
        int i = 2 % 2;
        int i2 = toString + 37;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        AFc1fSDK aFc1fSDK = aFc1dSDK.getMonetizationNetwork;
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return aFc1fSDK;
    }

    private final AFf1mSDK getRevenue() {
        int i = 2 % 2;
        int i2 = toString + 99;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        AFf1mSDK aFf1mSDK = (AFf1mSDK) this.AFAdRevenueData.getValue();
        int i4 = hashCode + 15;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            return aFf1mSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        int i = 2 % 2;
        int i2 = hashCode + 33;
        toString = i2 % 128;
        int i3 = i2 % 2;
        AFc1kSDK aFc1kSDK = (AFc1kSDK) aFc1dSDK.getMediationNetwork.getValue();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = toString + 47;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return aFc1kSDK;
    }

    private final AFc1sSDK component4() {
        int i = 2 % 2;
        int i2 = toString + 27;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        AFc1sSDK aFc1sSDK = (AFc1sSDK) this.getRevenue.getValue();
        int i4 = toString + 81;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return aFc1sSDK;
        }
        throw null;
    }

    private final AFf1iSDK areAllFieldsValid() {
        int i = 2 % 2;
        int i2 = toString + 63;
        hashCode = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        AFf1iSDK aFf1iSDK = (AFf1iSDK) this.getCurrencyIso4217Code.getValue();
        int i3 = toString + 41;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            return aFf1iSDK;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        int i = 2 % 2;
        int i2 = hashCode + 17;
        toString = i2 % 128;
        int i3 = i2 % 2;
        ExecutorService executorService = (ExecutorService) aFc1dSDK.component2.getValue();
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return executorService;
    }

    private final AFh1gSDK component3() {
        int i = 2 % 2;
        AFi1zSDK aFi1zSDK = getRevenue().getMonetizationNetwork.getMediationNetwork;
        if (aFi1zSDK == null) {
            return null;
        }
        int i2 = toString + 93;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        AFh1iSDK aFh1iSDK = aFi1zSDK.getRevenue;
        if (aFh1iSDK == null) {
            return null;
        }
        int i4 = toString + 43;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return aFh1iSDK.getMediationNetwork;
    }

    public final AFc1aSDK AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = hashCode + 81;
        toString = i2 % 128;
        int i3 = i2 % 2;
        AFc1aSDK aFc1aSDK = (AFc1aSDK) this.component4.getValue();
        if (i3 != 0) {
            return aFc1aSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AFd1vSDK component2() {
        int i = 2 % 2;
        int i2 = toString + 101;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        AFd1vSDK aFd1vSDK = (AFd1vSDK) this.component3.getValue();
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return aFd1vSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFc1dSDK aFc1dSDK, Throwable th, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1gSDK component3 = aFc1dSDK.component3();
        boolean z = false;
        if (component3 != null) {
            int i2 = hashCode + 53;
            toString = i2 % 128;
            if (i2 % 2 != 0 ? !aFc1dSDK.AFAdRevenueData(component3) : !aFc1dSDK.AFAdRevenueData(component3)) {
                int i3 = toString + 81;
                hashCode = i3 % 128;
                int i4 = i3 % 2;
            } else {
                z = true;
            }
        }
        if (z) {
            aFc1dSDK.AFAdRevenueData().getCurrencyIso4217Code(th, str);
            int i5 = toString + 55;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final void getRevenue(final Throwable th, final String str) {
        int i = 2 % 2;
        int i2 = hashCode + 55;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new Runnable() { // from class: com.appsflyer.internal.AFc1dSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFc1dSDK.getMonetizationNetwork(AFc1dSDK.this, th, str);
                }
            });
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new Runnable() { // from class: com.appsflyer.internal.AFc1dSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFc1dSDK.getMonetizationNetwork(AFc1dSDK.this, th, str);
                }
            });
            int i3 = 49 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFc1dSDK aFc1dSDK) {
        int i = 2 % 2;
        int i2 = toString + 9;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFc1dSDK, "");
            aFc1dSDK.equals();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        aFc1dSDK.equals();
        int i3 = toString + 105;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final void getMediationNetwork(AFc1bSDK.AFa1vSDK aFa1vSDK) {
        int i = 2 % 2;
        int i2 = hashCode + 79;
        toString = i2 % 128;
        int i3 = i2 % 2;
        this.component1 = aFa1vSDK;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new Runnable() { // from class: com.appsflyer.internal.AFc1dSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFc1dSDK.getMonetizationNetwork(AFc1dSDK.this);
            }
        });
        int i4 = toString + 41;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        int i = 2 % 2;
        int i2 = hashCode + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        toString = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFc1dSDK, "");
            aFc1dSDK.copydefault();
            return null;
        }
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        aFc1dSDK.copydefault();
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final void getMediationNetwork() {
        int i = 2 % 2;
        int i2 = hashCode + 33;
        toString = i2 % 128;
        int i3 = i2 % 2;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new Runnable() { // from class: com.appsflyer.internal.AFc1dSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFc1dSDK.getMediationNetwork(AFc1dSDK.this);
            }
        });
        int i4 = hashCode + 97;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFc1dSDK aFc1dSDK) {
        int i = 2 % 2;
        int i2 = toString + 35;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFc1dSDK, "");
            aFc1dSDK.copy();
            int i3 = 9 / 0;
        } else {
            Intrinsics.checkNotNullParameter(aFc1dSDK, "");
            aFc1dSDK.copy();
        }
        int i4 = hashCode + 101;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final void getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = toString + 87;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new Runnable() { // from class: com.appsflyer.internal.AFc1dSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFc1dSDK.getRevenue(AFc1dSDK.this);
                }
            });
            int i3 = 89 / 0;
        } else {
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new Runnable() { // from class: com.appsflyer.internal.AFc1dSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFc1dSDK.getRevenue(AFc1dSDK.this);
                }
            });
        }
    }

    private static void a(String str, String str2, String str3, int i, char c, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2 = 2 % 2;
        if (str3 != null) {
            cArr = str3.toCharArray();
            int i3 = $11 + 15;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 2;
            }
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        if (str2 != null) {
            cArr2 = str2.toCharArray();
            int i5 = $10 + 31;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 4;
            }
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = charArray.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(cArr3, 0, cArr5, 0, length);
        System.arraycopy(charArray, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr4.length;
        char[] cArr7 = new char[length3];
        aFk1oSDK.getCurrencyIso4217Code = 0;
        while (aFk1oSDK.getCurrencyIso4217Code < length3) {
            int i7 = (aFk1oSDK.getCurrencyIso4217Code + 2) % 4;
            int i8 = (aFk1oSDK.getCurrencyIso4217Code + 3) % 4;
            aFk1oSDK.getRevenue = (char) (((cArr5[aFk1oSDK.getCurrencyIso4217Code % 4] * 32718) + cArr6[i7]) % 65535);
            cArr6[i8] = (char) (((cArr5[i8] * 32718) + cArr6[i7]) / 65535);
            cArr5[i8] = aFk1oSDK.getRevenue;
            cArr7[aFk1oSDK.getCurrencyIso4217Code] = (char) ((((cArr5[i8] ^ cArr4[aFk1oSDK.getCurrencyIso4217Code]) ^ (copy ^ (-5804734778320964624L))) ^ ((int) (equals ^ (-5804734778320964624L)))) ^ ((char) (copydefault ^ (-5804734778320964624L))));
            aFk1oSDK.getCurrencyIso4217Code++;
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f7, code lost:
    
        if (r1 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00ba, code lost:
    
        if (r7 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        if (r7 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r7 = kotlin.text.StringsKt.toIntOrNull(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        if (r7 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
    
        r7 = r7.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ee, code lost:
    
        if (r1 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f9, code lost:
    
        r1 = r1.intValue();
        r7 = 2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014e, code lost:
    
        if (r1.intValue() == (-1)) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00f3 A[Catch: all -> 0x01f7, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x0018, B:9:0x0026, B:13:0x0047, B:15:0x004f, B:17:0x0056, B:19:0x005d, B:21:0x0061, B:23:0x0075, B:25:0x007f, B:27:0x0085, B:29:0x008b, B:30:0x0091, B:32:0x009f, B:34:0x00aa, B:39:0x00bc, B:41:0x00c2, B:42:0x00c8, B:44:0x00d6, B:46:0x00dc, B:48:0x00e7, B:53:0x00f9, B:54:0x0101, B:55:0x0104, B:56:0x0115, B:58:0x011b, B:60:0x011f, B:61:0x012e, B:63:0x0134, B:65:0x0141, B:69:0x0152, B:70:0x01d1, B:72:0x01d5, B:74:0x01db, B:75:0x01df, B:78:0x01e4, B:87:0x01f6, B:89:0x0162, B:91:0x018b, B:92:0x01b0, B:93:0x014a, B:99:0x00f2, B:100:0x00f3, B:105:0x00b5, B:106:0x00b6, B:111:0x0109, B:112:0x01c1, B:51:0x00ed, B:37:0x00b0, B:83:0x01f1, B:84:0x01f4), top: B:3:0x0002, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7 A[Catch: all -> 0x01f7, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x0018, B:9:0x0026, B:13:0x0047, B:15:0x004f, B:17:0x0056, B:19:0x005d, B:21:0x0061, B:23:0x0075, B:25:0x007f, B:27:0x0085, B:29:0x008b, B:30:0x0091, B:32:0x009f, B:34:0x00aa, B:39:0x00bc, B:41:0x00c2, B:42:0x00c8, B:44:0x00d6, B:46:0x00dc, B:48:0x00e7, B:53:0x00f9, B:54:0x0101, B:55:0x0104, B:56:0x0115, B:58:0x011b, B:60:0x011f, B:61:0x012e, B:63:0x0134, B:65:0x0141, B:69:0x0152, B:70:0x01d1, B:72:0x01d5, B:74:0x01db, B:75:0x01df, B:78:0x01e4, B:87:0x01f6, B:89:0x0162, B:91:0x018b, B:92:0x01b0, B:93:0x014a, B:99:0x00f2, B:100:0x00f3, B:105:0x00b5, B:106:0x00b6, B:111:0x0109, B:112:0x01c1, B:51:0x00ed, B:37:0x00b0, B:83:0x01f1, B:84:0x01f4), top: B:3:0x0002, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152 A[Catch: all -> 0x01f7, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x0018, B:9:0x0026, B:13:0x0047, B:15:0x004f, B:17:0x0056, B:19:0x005d, B:21:0x0061, B:23:0x0075, B:25:0x007f, B:27:0x0085, B:29:0x008b, B:30:0x0091, B:32:0x009f, B:34:0x00aa, B:39:0x00bc, B:41:0x00c2, B:42:0x00c8, B:44:0x00d6, B:46:0x00dc, B:48:0x00e7, B:53:0x00f9, B:54:0x0101, B:55:0x0104, B:56:0x0115, B:58:0x011b, B:60:0x011f, B:61:0x012e, B:63:0x0134, B:65:0x0141, B:69:0x0152, B:70:0x01d1, B:72:0x01d5, B:74:0x01db, B:75:0x01df, B:78:0x01e4, B:87:0x01f6, B:89:0x0162, B:91:0x018b, B:92:0x01b0, B:93:0x014a, B:99:0x00f2, B:100:0x00f3, B:105:0x00b5, B:106:0x00b6, B:111:0x0109, B:112:0x01c1, B:51:0x00ed, B:37:0x00b0, B:83:0x01f1, B:84:0x01f4), top: B:3:0x0002, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0162 A[Catch: all -> 0x01f7, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x0018, B:9:0x0026, B:13:0x0047, B:15:0x004f, B:17:0x0056, B:19:0x005d, B:21:0x0061, B:23:0x0075, B:25:0x007f, B:27:0x0085, B:29:0x008b, B:30:0x0091, B:32:0x009f, B:34:0x00aa, B:39:0x00bc, B:41:0x00c2, B:42:0x00c8, B:44:0x00d6, B:46:0x00dc, B:48:0x00e7, B:53:0x00f9, B:54:0x0101, B:55:0x0104, B:56:0x0115, B:58:0x011b, B:60:0x011f, B:61:0x012e, B:63:0x0134, B:65:0x0141, B:69:0x0152, B:70:0x01d1, B:72:0x01d5, B:74:0x01db, B:75:0x01df, B:78:0x01e4, B:87:0x01f6, B:89:0x0162, B:91:0x018b, B:92:0x01b0, B:93:0x014a, B:99:0x00f2, B:100:0x00f3, B:105:0x00b5, B:106:0x00b6, B:111:0x0109, B:112:0x01c1, B:51:0x00ed, B:37:0x00b0, B:83:0x01f1, B:84:0x01f4), top: B:3:0x0002, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014a A[Catch: all -> 0x01f7, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x0018, B:9:0x0026, B:13:0x0047, B:15:0x004f, B:17:0x0056, B:19:0x005d, B:21:0x0061, B:23:0x0075, B:25:0x007f, B:27:0x0085, B:29:0x008b, B:30:0x0091, B:32:0x009f, B:34:0x00aa, B:39:0x00bc, B:41:0x00c2, B:42:0x00c8, B:44:0x00d6, B:46:0x00dc, B:48:0x00e7, B:53:0x00f9, B:54:0x0101, B:55:0x0104, B:56:0x0115, B:58:0x011b, B:60:0x011f, B:61:0x012e, B:63:0x0134, B:65:0x0141, B:69:0x0152, B:70:0x01d1, B:72:0x01d5, B:74:0x01db, B:75:0x01df, B:78:0x01e4, B:87:0x01f6, B:89:0x0162, B:91:0x018b, B:92:0x01b0, B:93:0x014a, B:99:0x00f2, B:100:0x00f3, B:105:0x00b5, B:106:0x00b6, B:111:0x0109, B:112:0x01c1, B:51:0x00ed, B:37:0x00b0, B:83:0x01f1, B:84:0x01f4), top: B:3:0x0002, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void equals() {
        long j;
        Integer num;
        Pair<Integer, Integer> pair;
        Pair<Integer, Integer> pair2;
        String str;
        String str2;
        int i;
        MatchGroup matchGroup;
        String value;
        int i2;
        Integer intOrNull;
        String value2;
        String value3;
        Integer intOrNull2;
        int i3 = 2 % 2;
        AFh1gSDK component3 = component3();
        if (component3 != null) {
            int i4 = hashCode + 39;
            toString = i4 % 128;
            int i5 = i4 % 2;
            j = component3.getMediationNetwork;
        } else {
            j = -1;
        }
        if (j < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
            component4().getMediationNetwork("af_send_exc_to_server_window");
            AFAdRevenueData().getMonetizationNetwork();
            return;
        }
        AFh1gSDK component32 = component3();
        Object obj = null;
        if (component32 == null || !getMediationNetwork(component32)) {
            component4().getMediationNetwork("af_send_exc_to_server_window");
            AFAdRevenueData().getMonetizationNetwork();
        } else {
            AFh1gSDK component33 = component3();
            if (component33 == null || (str2 = component33.getRevenue) == null) {
                int i6 = toString + 19;
                hashCode = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                num = null;
            } else {
                Intrinsics.checkNotNullParameter(str2, "");
                MatchResult matchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str2);
                if (matchEntire != null) {
                    MatchGroup matchGroup2 = matchEntire.getGroups().get(1);
                    int intValue = ((matchGroup2 == null || (value3 = matchGroup2.getValue()) == null || (intOrNull2 = StringsKt.toIntOrNull(value3)) == null) ? 0 : intOrNull2.intValue()) * 1000000;
                    MatchGroup matchGroup3 = matchEntire.getGroups().get(2);
                    if (matchGroup3 != null) {
                        int i9 = toString + 109;
                        hashCode = i9 % 128;
                        if (i9 % 2 != 0) {
                            value2 = matchGroup3.getValue();
                            int i10 = 65 / 0;
                        } else {
                            value2 = matchGroup3.getValue();
                        }
                        int i11 = intValue + (r7 * 1000);
                        matchGroup = matchEntire.getGroups().get(3);
                        if (matchGroup != null && (value = matchGroup.getValue()) != null) {
                            i2 = hashCode + 61;
                            toString = i2 % 128;
                            if (i2 % 2 != 0) {
                                intOrNull = StringsKt.toIntOrNull(value);
                                int i12 = 64 / 0;
                            } else {
                                intOrNull = StringsKt.toIntOrNull(value);
                            }
                            i = i11 + r1;
                        }
                        int i13 = 0;
                        i = i11 + i13;
                    }
                    int i14 = 0;
                    int i112 = intValue + (i14 * 1000);
                    matchGroup = matchEntire.getGroups().get(3);
                    if (matchGroup != null) {
                        i2 = hashCode + 61;
                        toString = i2 % 128;
                        if (i2 % 2 != 0) {
                        }
                        i = i112 + i13;
                    }
                    int i132 = 0;
                    i = i112 + i132;
                } else {
                    i = -1;
                }
                num = Integer.valueOf(i);
            }
            AFh1gSDK component34 = component3();
            if (component34 == null || (str = component34.getRevenue) == null) {
                pair = null;
            } else {
                int i15 = toString + 5;
                hashCode = i15 % 128;
                int i16 = i15 % 2;
                pair = AFd1pSDK.getRevenue(str);
            }
            AFh1gSDK component35 = component3();
            if (component35 != null) {
                int i17 = hashCode + 35;
                toString = i17 % 128;
                int i18 = i17 % 2;
                String str3 = component35.getRevenue;
                if (str3 != null) {
                    pair2 = AFd1pSDK.getCurrencyIso4217Code(str3);
                    if (num != null) {
                    }
                    if (pair == null) {
                        AFAdRevenueData().getRevenue(this.areAllFieldsValid);
                    }
                    if (pair == null) {
                        AFAdRevenueData().getMediationNetwork(pair.getFirst().intValue(), pair.getSecond().intValue());
                        int i19 = toString + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                        hashCode = i19 % 128;
                        int i20 = i19 % 2;
                        int i21 = 2 % 2;
                    } else if (pair2 != null) {
                        int i22 = hashCode + 81;
                        toString = i22 % 128;
                        int i23 = i22 % 2;
                        AFAdRevenueData().getMediationNetwork(pair2.getFirst().intValue(), pair2.getSecond().intValue());
                    } else {
                        component4().getMediationNetwork("af_send_exc_to_server_window");
                        AFAdRevenueData().getMonetizationNetwork();
                    }
                }
            }
            pair2 = null;
            if (num != null) {
            }
            if (pair == null) {
            }
            if (pair == null) {
            }
        }
        AFc1bSDK.AFa1vSDK aFa1vSDK = this.component1;
        if (aFa1vSDK != null) {
            AFh1gSDK component36 = component3();
            aFa1vSDK.onConfigurationChanged(component36 != null ? AFAdRevenueData(component36) : false);
            return;
        }
        int i24 = hashCode + 43;
        toString = i24 % 128;
        if (i24 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void copydefault() {
        int i = 2 % 2;
        int i2 = hashCode + 65;
        toString = i2 % 128;
        int i3 = i2 % 2;
        AFh1gSDK component3 = component3();
        if (component3 != null) {
            if (!(!getCurrencyIso4217Code(component3))) {
                String revenue = areAllFieldsValid().getRevenue();
                if (revenue != null) {
                    String jSONObject = new JSONObject(getMediationNetwork((Map) getCurrencyIso4217Code(new Object[]{this, component3}, -1662256862, 1662256866, System.identityHashCode(this)), AFAdRevenueData().getCurrencyIso4217Code())).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                    Intrinsics.checkNotNullExpressionValue(revenue, "");
                    getRevenue(jSONObject, revenue);
                    return;
                }
                int i4 = hashCode + 89;
                toString = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
        }
    }

    private final synchronized void copy() {
        int i = 2 % 2;
        AFh1gSDK component3 = component3();
        boolean z = false;
        if (component3 != null) {
            int i2 = toString + 103;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            if (component3.getCurrencyIso4217Code == -1) {
                component4().getMediationNetwork("af_send_exc_to_server_window");
            } else {
                if (component4().getMediationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                    int i4 = toString + 51;
                    hashCode = i4 % 128;
                    if (i4 % 2 != 0) {
                        getMonetizationNetwork(component3);
                        int i5 = 6 / 0;
                    } else {
                        getMonetizationNetwork(component3);
                    }
                }
                z = AFAdRevenueData(component3);
            }
            int i6 = 2 % 2;
            z = AFAdRevenueData(component3);
        } else {
            int i7 = 2 % 2;
        }
        AFc1bSDK.AFa1vSDK aFa1vSDK = this.component1;
        if (aFa1vSDK != null) {
            aFa1vSDK.onConfigurationChanged(z);
        }
    }

    private final void getMonetizationNetwork(AFh1gSDK aFh1gSDK) {
        int i = 2 % 2;
        int i2 = hashCode + 7;
        toString = i2 % 128;
        int i3 = i2 % 2;
        int i4 = aFh1gSDK.AFAdRevenueData;
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1gSDK.getCurrencyIso4217Code);
        AFc1sSDK component4 = component4();
        component4.AFAdRevenueData("af_send_exc_to_server_window", currentTimeMillis);
        component4.getMonetizationNetwork("af_send_exc_min", i4);
        int i5 = hashCode + 45;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        AFh1gSDK aFh1gSDK = (AFh1gSDK) objArr[1];
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "\ua4cc\ude37㘛툓䁡", "ꊀ喂ʙ輌", (ViewConfiguration.getWindowTouchSlop() >> 8) - 1722449246, (char) (AndroidCharacter.getMirror('0') + 3026), objArr2);
        Map mapOf = MapsKt.mapOf(TuplesKt.to(((String) objArr2[0]).intern(), Build.BRAND), TuplesKt.to("model", Build.MODEL), TuplesKt.to("app_id", ((AFc1kSDK) getCurrencyIso4217Code(new Object[]{aFc1dSDK}, 652478680, -652478680, System.identityHashCode(aFc1dSDK))).AFAdRevenueData.getMonetizationNetwork.getPackageName()), TuplesKt.to("p_ex", new AFa1ySDK().getMediationNetwork()), TuplesKt.to("api", String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to("sdk", aFc1dSDK.areAllFieldsValid), TuplesKt.to("uid", AFb1kSDK.getMonetizationNetwork(((AFc1kSDK) getCurrencyIso4217Code(new Object[]{aFc1dSDK}, 652478680, -652478680, System.identityHashCode(aFc1dSDK))).getRevenue)), TuplesKt.to("exc_config", aFh1gSDK.getMediationNetwork()));
        int i2 = hashCode + 53;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return mapOf;
        }
        throw null;
    }

    private static Map<String, Object> getMediationNetwork(Map<String, ? extends Object> map, List<AFc1cSDK> list) {
        Map<String, Object> mapOf;
        int i = 2 % 2;
        int i2 = hashCode + 91;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            Pair[] pairArr = new Pair[5];
            pairArr[1] = TuplesKt.to("deviceInfo", map);
            pairArr[0] = TuplesKt.to("excs", AFd1xSDK.AFAdRevenueData(list));
            mapOf = MapsKt.mapOf(pairArr);
        } else {
            mapOf = MapsKt.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFd1xSDK.AFAdRevenueData(list)));
        }
        int i3 = hashCode + 35;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return mapOf;
    }

    private final void getRevenue(String str, String str2) {
        int i = 2 % 2;
        int i2 = hashCode + 81;
        toString = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        component2().getMonetizationNetwork(bytes, MapsKt.mapOf(TuplesKt.to(HttpHeaders.AUTHORIZATION, AFj1hSDK.AFAdRevenueData(str, str2))), 2000);
        int i4 = toString + 29;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean getCurrencyIso4217Code(AFh1gSDK aFh1gSDK) {
        int AFAdRevenueData;
        int i = 2 % 2;
        int i2 = hashCode + 13;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long mediationNetwork = component4().getMediationNetwork("af_send_exc_to_server_window", -1L);
            if (aFh1gSDK.getMediationNetwork >= TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis) && mediationNetwork != -1) {
                int i3 = hashCode + 67;
                toString = i3 % 128;
                int i4 = i3 % 2;
                if (mediationNetwork >= currentTimeMillis && (AFAdRevenueData = component4().AFAdRevenueData("af_send_exc_min", -1)) != -1 && AFAdRevenueData().getMediationNetwork() >= AFAdRevenueData) {
                    return getMediationNetwork(aFh1gSDK);
                }
            }
            return false;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        component4().getMediationNetwork("af_send_exc_to_server_window", -1L);
        long j = aFh1gSDK.getMediationNetwork;
        TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean getMediationNetwork(AFh1gSDK aFh1gSDK) {
        int i = 2 % 2;
        new AFd1rSDK();
        String str = this.areAllFieldsValid;
        String str2 = aFh1gSDK.getRevenue;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean AFAdRevenueData = AFd1rSDK.AFAdRevenueData(str, str2);
        int i2 = toString + 13;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return AFAdRevenueData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFc1dSDK aFc1dSDK) {
        getCurrencyIso4217Code(new Object[]{aFc1dSDK}, 983518343, -983518342, (int) System.currentTimeMillis());
    }

    private final boolean AFAdRevenueData(AFh1gSDK aFh1gSDK) {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this, aFh1gSDK}, 943546209, -943546206, System.identityHashCode(this))).booleanValue();
    }

    private final Map<String, String> getRevenue(AFh1gSDK aFh1gSDK) {
        return (Map) getCurrencyIso4217Code(new Object[]{this, aFh1gSDK}, -1662256862, 1662256866, System.identityHashCode(this));
    }

    private final ExecutorService component1() {
        return (ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this));
    }

    private final AFc1kSDK getMonetizationNetwork() {
        return (AFc1kSDK) getCurrencyIso4217Code(new Object[]{this}, 652478680, -652478680, System.identityHashCode(this));
    }
}
