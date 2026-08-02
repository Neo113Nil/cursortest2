package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import io.sentry.protocol.App;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFb1bSDK implements AFb1aSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long component2 = 0;
    private static int component4 = 0;
    private static int copydefault = 1;
    private static int equals;
    private static final int getCurrencyIso4217Code;
    private static char toString;
    private final AFd1kSDK component1;
    private List<String> AFAdRevenueData = new ArrayList();
    private boolean getMonetizationNetwork = true;
    private final Map<String, Object> getRevenue = new HashMap();
    private boolean areAllFieldsValid = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMediationNetwork = 0;
    private boolean component3 = false;

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i * 450) + (i2 * (-448));
        int i5 = ~((~i) | i2);
        int i6 = ~i2;
        int i7 = i4 + (((~(i6 | i | i3)) | i5) * 449) + (i5 * (-1347)) + (((~(i | i6 | (~i3))) | i5) * 449);
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? getCurrencyIso4217Code(objArr) : AFAdRevenueData(objArr) : getMonetizationNetwork(objArr) : getRevenue(objArr);
    }

    static {
        areAllFieldsValid();
        getCurrencyIso4217Code = 98166;
        int i = copydefault + 79;
        equals = i % 128;
        int i2 = i % 2;
    }

    public AFb1bSDK(AFd1kSDK aFd1kSDK) {
        this.component1 = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final boolean getRevenue() {
        int i = 2 % 2;
        int i2 = equals + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean mediationNetwork = getMediationNetwork(getRevenue(this.component1.component1().getMediationNetwork.getMonetizationNetwork), getRevenue(this.component1.component1().getMediationNetwork.AFAdRevenueData));
        if (!mediationNetwork) {
            AFAdRevenueData();
            getMonetizationNetwork();
            return mediationNetwork;
        }
        int i4 = copydefault + 57;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            component4();
            return mediationNetwork;
        }
        component4();
        throw null;
    }

    private synchronized void component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 107;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this.component3) {
            int i4 = i2 + 15;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return;
        } else {
            this.component3 = true;
            try {
                getMediationNetwork("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                return;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1xSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
                return;
            }
        }
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final synchronized void getMonetizationNetwork() {
        int i = 2 % 2;
        if (!this.component3) {
            int i2 = copydefault + 123;
            equals = i2 % 128;
            int i3 = i2 % 2;
            if (!this.getMonetizationNetwork) {
                return;
            }
        }
        this.component3 = false;
        this.getMonetizationNetwork = false;
        try {
            getMediationNetwork("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            int i4 = equals + 29;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1xSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, char c, int i, String str2, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2 = 2 % 2;
        if (str3 != null) {
            cArr = str3.toCharArray();
            int i3 = $10 + 77;
            $11 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        if (str2 != 0) {
            int i5 = $10 + 51;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1vSDK aFk1vSDK = new AFk1vSDK();
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
        aFk1vSDK.AFAdRevenueData = 0;
        while (aFk1vSDK.AFAdRevenueData < length3) {
            int i7 = (aFk1vSDK.AFAdRevenueData + 2) % 4;
            int i8 = (aFk1vSDK.AFAdRevenueData + 3) % 4;
            aFk1vSDK.getRevenue = (char) (((cArr5[aFk1vSDK.AFAdRevenueData % 4] * 32718) + cArr6[i7]) % 65535);
            cArr6[i8] = (char) (((cArr5[i8] * 32718) + cArr6[i7]) / 65535);
            cArr5[i8] = aFk1vSDK.getRevenue;
            cArr7[aFk1vSDK.AFAdRevenueData] = (char) ((((cArr5[i8] ^ cArr4[aFk1vSDK.AFAdRevenueData]) ^ (component2 ^ (-7981630893436853507L))) ^ ((int) (component4 ^ (-7981630893436853507L)))) ^ ((char) (toString ^ (-7981630893436853507L))));
            aFk1vSDK.AFAdRevenueData++;
            int i9 = $11 + 41;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        String str4 = new String(cArr7);
        int i11 = $11 + 53;
        $10 = i11 % 128;
        if (i11 % 2 == 0) {
            objArr[0] = str4;
        } else {
            int i12 = 17 / 0;
            objArr[0] = str4;
        }
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final synchronized void getCurrencyIso4217Code() {
        List<String> list;
        int i = 2 % 2;
        int i2 = equals + 81;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.getRevenue.clear();
            list = this.AFAdRevenueData;
        } else {
            this.getRevenue.clear();
            list = this.AFAdRevenueData;
        }
        list.clear();
        this.getMediationNetwork = 0;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void k_(String str, PackageManager packageManager) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        equals = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                final AFe1zSDK AFAdRevenueData = this.component1.AFAdRevenueData().AFAdRevenueData((Map) getMediationNetwork(new Object[]{this, str, packageManager}, 105639659, -105639659, System.identityHashCode(this)), this.component1.AFInAppEventType().component2);
                if (AFAdRevenueData == null) {
                    AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                    return;
                }
                ExecutorService monetizationNetwork = this.component1.getMonetizationNetwork();
                Objects.requireNonNull(AFAdRevenueData);
                monetizationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1bSDK$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1zSDK.this.getMediationNetwork();
                    }
                });
                int i3 = equals + 73;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 21 / 0;
                    return;
                }
                return;
            }
            this.component1.AFAdRevenueData().AFAdRevenueData((Map) getMediationNetwork(new Object[]{this, str, packageManager}, 105639659, -105639659, System.identityHashCode(this)), this.component1.AFInAppEventType().component2);
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void getMediationNetwork(String str, String... strArr) {
        int i = 2 % 2;
        int i2 = equals + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        getMediationNetwork("public_api_call", str, strArr);
        int i4 = copydefault + 81;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void getCurrencyIso4217Code(Throwable th) {
        String message;
        int i = 2 % 2;
        int i2 = equals + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            message = th.getMessage();
            int i4 = equals + 5;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            message = cause.getMessage();
        }
        getMediationNetwork("exception", simpleName, getMonetizationNetwork(message, cause == null ? th.getStackTrace() : cause.getStackTrace()));
        int i6 = equals + 23;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void getRevenue(String str, String str2) {
        int i = 2 % 2;
        int i2 = equals + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        getMediationNetwork("server_request", str, str2);
        int i4 = copydefault + 47;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void AFAdRevenueData(String str, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = copydefault + 15;
        equals = i3 % 128;
        int i4 = i3 % 2;
        getMediationNetwork("server_response", str, String.valueOf(i), str2);
        int i5 = equals + 81;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void AFAdRevenueData(String str, String str2) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            getMediationNetwork((String) null, str, str2);
            return;
        }
        String[] strArr = new String[1];
        strArr[1] = str2;
        getMediationNetwork((String) null, str, strArr);
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final synchronized void AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = equals + 49;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.getMonetizationNetwork = true;
        } else {
            this.getMonetizationNetwork = false;
        }
        getCurrencyIso4217Code();
        equals();
        int i3 = copydefault + 89;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void getMediationNetwork() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        this.areAllFieldsValid = false;
        int i5 = i3 + 101;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final boolean component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 93;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.component3;
        int i4 = i2 + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static float component1() {
        int i = 2 % 2;
        float nextFloat = new Random().nextFloat();
        int i2 = copydefault + 57;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return nextFloat;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFb1bSDK aFb1bSDK = (AFb1bSDK) objArr[0];
        String str = (String) objArr[1];
        PackageManager packageManager = (PackageManager) objArr[2];
        int i = 2 % 2;
        int i2 = equals + 119;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            aFb1bSDK.m_(str, packageManager, aFb1bSDK.component1.AFInAppEventType(), aFb1bSDK.component1.e());
            Map<String, Object> copy = aFb1bSDK.copy();
            int i3 = 79 / 0;
            return copy;
        }
        aFb1bSDK.m_(str, packageManager, aFb1bSDK.component1.AFInAppEventType(), aFb1bSDK.component1.e());
        return aFb1bSDK.copy();
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return "6.15.1";
        }
        throw null;
    }

    private boolean copydefault() {
        int i = 2 % 2;
        if (!this.areAllFieldsValid) {
            return false;
        }
        int i2 = equals + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        if (this.getMonetizationNetwork) {
            return true;
        }
        int i5 = i3 + 115;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private synchronized void getMediationNetwork(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        equals = i2 % 128;
        int i3 = i2 % 2;
        try {
            Map<String, Object> map = this.getRevenue;
            Object[] objArr = new Object[1];
            a("\u0000\u0000\u0000\u0000", (char) (4044 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 89993985, "歇몙峸敺䝸", "Ǳ崳쬅儏", objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.getRevenue.put("model", Build.MODEL);
            this.getRevenue.put("platform", "Android");
            this.getRevenue.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                int i4 = equals + 25;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    str.length();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (str.length() > 0) {
                    int i5 = equals + 93;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    this.getRevenue.put("advertiserId", str);
                }
            }
            if (str2 != null && str2.length() > 0) {
                int i7 = copydefault + 19;
                equals = i7 % 128;
                int i8 = i7 % 2;
                this.getRevenue.put("imei", str2);
                int i9 = equals + 93;
                copydefault = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 2 % 2;
                }
            }
            if (str3 != null && str3.length() > 0) {
                int i11 = copydefault + 23;
                equals = i11 % 128;
                int i12 = i11 % 2;
                this.getRevenue.put("android_id", str3);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void getMonetizationNetwork(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        equals = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.getRevenue.put("sdk_version", str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.getRevenue.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                int i3 = equals + 61;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    this.getRevenue.put("devkey", str2);
                    int i4 = 37 / 0;
                } else {
                    this.getRevenue.put("devkey", str2);
                }
                int i5 = 2 % 2;
            }
            if (str3 != null && str3.length() > 0) {
                this.getRevenue.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                int i6 = copydefault + 89;
                equals = i6 % 128;
                int i7 = i6 % 2;
                this.getRevenue.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r5.length() > 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void getMediationNetwork(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = equals + 61;
        copydefault = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str != null && str.length() > 0) {
                this.getRevenue.put("app_id", str);
            }
            if (str2 != null) {
                int i3 = equals + 107;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 56 / 0;
                    if (str2.length() > 0) {
                        this.getRevenue.put(App.JsonKeys.APP_VERSION, str2);
                    }
                }
            }
            if (str3 != null && str3.length() > 0) {
                int i5 = copydefault + 73;
                equals = i5 % 128;
                if (i5 % 2 != 0) {
                    this.getRevenue.put(AppsFlyerProperties.CHANNEL, str3);
                    int i6 = 19 / 0;
                } else {
                    this.getRevenue.put(AppsFlyerProperties.CHANNEL, str3);
                }
            }
            if (str4 != null && str4.length() > 0) {
                int i7 = copydefault + 57;
                equals = i7 % 128;
                if (i7 % 2 != 0) {
                    this.getRevenue.put("preInstall", str4);
                    int i8 = 82 / 0;
                } else {
                    this.getRevenue.put("preInstall", str4);
                }
                int i9 = 2 % 2;
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void getMediationNetwork(String str, String str2, String... strArr) {
        String obj;
        int i = 2 % 2;
        if (copydefault()) {
            int i2 = equals + 61;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            if (this.getMediationNetwork < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(currentTimeMillis);
                        sb.append(" ");
                        sb.append(Thread.currentThread().getId());
                        sb.append(" _/AppsFlyer_6.15.1 [");
                        sb.append(str);
                        sb.append("] ");
                        sb.append(str2);
                        sb.append(" ");
                        sb.append(join);
                        obj = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" ");
                        sb2.append(str2);
                        sb2.append("/AppsFlyer_6.15.1 ");
                        sb2.append(join);
                        obj = sb2.toString();
                    }
                    int length = this.getMediationNetwork + (obj.length() << 1);
                    int i4 = getCurrencyIso4217Code;
                    boolean z = false;
                    if (length > i4) {
                        int i5 = copydefault + 47;
                        equals = i5 % 128;
                        int i6 = i5 % 2;
                        obj = obj.substring(0, (i4 - this.getMediationNetwork) / 2);
                        z = true;
                    }
                    this.AFAdRevenueData.add(obj);
                    this.getMediationNetwork += obj.length() << 1;
                    if (z) {
                        this.AFAdRevenueData.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.getMediationNetwork += 138;
                        int i7 = equals + 29;
                        copydefault = i7 % 128;
                        int i8 = i7 % 2;
                        int i9 = 2 % 2;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private synchronized Map<String, Object> copy() {
        Map<String, Object> map;
        int i = 2 % 2;
        int i2 = copydefault + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.getRevenue.put("data", this.AFAdRevenueData);
        equals();
        map = this.getRevenue;
        int i4 = copydefault + 89;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    private synchronized void m_(String str, PackageManager packageManager, AFg1uSDK aFg1uSDK, AFd1tSDK aFd1tSDK) {
        int i = 2 % 2;
        int i2 = equals + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        this.getRevenue.clear();
        if (string != null) {
            try {
                this.getRevenue.putAll(AFa1oSDK.getMonetizationNetwork(new JSONObject(string)));
            } catch (Throwable unused) {
            }
        } else {
            AFb1rSDK revenue = AFb1rSDK.getRevenue();
            AFh1pSDK aFh1pSDK = AFb1rSDK.getRevenue().getCurrencyIso4217Code().getCurrencyIso4217Code().AFAdRevenueData.areAllFieldsValid;
            AFb1tSDK aFb1tSDK = aFh1pSDK != null ? new AFb1tSDK(aFh1pSDK.getMediationNetwork, aFh1pSDK.component1) : null;
            getMediationNetwork(aFb1tSDK != null ? aFb1tSDK.getMediationNetwork : null, aFg1uSDK.areAllFieldsValid, aFd1tSDK.getMediationNetwork);
            StringBuilder sb = new StringBuilder("6.15.1.");
            sb.append(AFb1rSDK.AFAdRevenueData);
            getMonetizationNetwork(sb.toString(), revenue.getCurrencyIso4217Code().AFInAppEventType().component2, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                getMediationNetwork(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                int i4 = 2 % 2;
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getRevenue).toString());
            int i5 = equals + 3;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this.getRevenue.put("launch_counter", String.valueOf(this.component1.getCurrencyIso4217Code().getRevenue.AFAdRevenueData("appsFlyerCount", 0)));
    }

    private static String[] getMonetizationNetwork(String str, StackTraceElement[] stackTraceElementArr) {
        int i = 2 % 2;
        if (stackTraceElementArr == null) {
            int i2 = copydefault;
            int i3 = i2 + 9;
            equals = i3 % 128;
            int i4 = i3 % 2;
            String[] strArr = {str};
            int i5 = i2 + 125;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                return strArr;
            }
            throw null;
        }
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        for (int i6 = 1; i6 < stackTraceElementArr.length; i6++) {
            strArr2[i6] = stackTraceElementArr[i6].toString();
        }
        int i7 = equals + 53;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 55 / 0;
        }
        return strArr2;
    }

    private synchronized void equals() {
        int i = 2 % 2;
        this.AFAdRevenueData = new ArrayList();
        this.getMediationNetwork = 0;
        int i2 = equals + 41;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
    }

    private synchronized boolean getMediationNetwork(AFi1vSDK aFi1vSDK, AFi1vSDK aFi1vSDK2) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (aFi1vSDK == null) {
            getMediationNetwork(new Object[]{this}, 993454110, -993454108, System.identityHashCode(this));
            return false;
        }
        if (!aFi1vSDK.getCurrencyIso4217Code()) {
            return false;
        }
        if (this.component1.getCurrencyIso4217Code().getRevenue.AFAdRevenueData("appsFlyerCount", 0) > aFi1vSDK.getRevenue) {
            int i3 = equals + 95;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = equals + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        if (!getRevenue(aFi1vSDK, aFi1vSDK2)) {
            return false;
        }
        if (!getRevenue(aFi1vSDK.getCurrencyIso4217Code)) {
            return false;
        }
        if (!AFAdRevenueData(aFi1vSDK.AFAdRevenueData)) {
            return false;
        }
        int i7 = equals + 103;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private boolean getRevenue(AFi1vSDK aFi1vSDK, AFi1vSDK aFi1vSDK2) {
        int i = 2 % 2;
        int i2 = equals + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (!aFi1vSDK.equals(aFi1vSDK2)) {
            boolean monetizationNetwork = getMonetizationNetwork(aFi1vSDK.getMonetizationNetwork);
            AFAdRevenueData(monetizationNetwork);
            int i4 = copydefault + 43;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return monetizationNetwork;
        }
        int i6 = equals + 9;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return AFKeystoreWrapper();
        }
        AFKeystoreWrapper();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static boolean AFAdRevenueData(String str) {
        int i = 2 % 2;
        if (AFc1rSDK.getMonetizationNetwork(str)) {
            int i2 = copydefault + 69;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        new AFe1wSDK();
        boolean revenue = AFe1wSDK.getRevenue((String) getMediationNetwork(new Object[0], -2034519920, 2034519923, (int) System.currentTimeMillis()), str);
        int i4 = copydefault + 103;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (com.appsflyer.internal.AFc1rSDK.getMonetizationNetwork(r6) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (com.appsflyer.internal.AFc1rSDK.getMonetizationNetwork(r6) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        r0 = r1.component1.getCurrencyIso4217Code();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        return java.lang.Boolean.valueOf(r6.equals(com.appsflyer.internal.AFb1qSDK.getMediationNetwork(r0.getMonetizationNetwork.getCurrencyIso4217Code, r0.getMonetizationNetwork.getCurrencyIso4217Code.getPackageName())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r6 = com.appsflyer.internal.AFb1bSDK.equals + 5;
        com.appsflyer.internal.AFb1bSDK.copydefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFb1bSDK aFb1bSDK = (AFb1bSDK) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = equals + 109;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
    }

    private static boolean getMonetizationNetwork(float f) {
        int i = 2 % 2;
        double d = f;
        if (d >= 1.0d) {
            int i2 = copydefault + 109;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (d <= 0.0d) {
            int i4 = copydefault + 25;
            equals = i4 % 128;
            return i4 % 2 != 0;
        }
        if (component1() > f) {
            return false;
        }
        int i5 = equals + 85;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static AFi1vSDK getRevenue(AFi1ySDK aFi1ySDK) {
        AFh1dSDK aFh1dSDK;
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 75;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (aFi1ySDK == null) {
            return null;
        }
        int i5 = i2 + 85;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            aFh1dSDK = aFi1ySDK.getRevenue;
            int i6 = 66 / 0;
            if (aFh1dSDK == null) {
                return null;
            }
        } else {
            aFh1dSDK = aFi1ySDK.getRevenue;
            if (aFh1dSDK == null) {
                return null;
            }
        }
        return aFh1dSDK.getMediationNetwork;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFb1bSDK aFb1bSDK = (AFb1bSDK) objArr[0];
        int i = 2 % 2;
        int i2 = copydefault + 7;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            aFb1bSDK.component1.getMediationNetwork().getMediationNetwork("participantInProxy");
            int i3 = 10 / 0;
            return null;
        }
        aFb1bSDK.component1.getMediationNetwork().getMediationNetwork("participantInProxy");
        return null;
    }

    private void AFAdRevenueData(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.component1.getMediationNetwork().getMediationNetwork("participantInProxy", z);
        int i4 = equals + 85;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private boolean AFKeystoreWrapper() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        equals = i2 % 128;
        int i3 = i2 % 2;
        boolean AFAdRevenueData = this.component1.getMediationNetwork().AFAdRevenueData("participantInProxy");
        int i4 = equals + 37;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return AFAdRevenueData;
        }
        throw null;
    }

    static void areAllFieldsValid() {
        component2 = -7981630893436853507L;
        component4 = -1402363139;
        toString = (char) 47903;
    }

    private void AFInAppEventParameterName() {
        getMediationNetwork(new Object[]{this}, 993454110, -993454108, System.identityHashCode(this));
    }

    private boolean getRevenue(String str) {
        return ((Boolean) getMediationNetwork(new Object[]{this, str}, -520586729, 520586730, System.identityHashCode(this))).booleanValue();
    }

    private static String component3() {
        return (String) getMediationNetwork(new Object[0], -2034519920, 2034519923, (int) System.currentTimeMillis());
    }

    private Map<String, Object> l_(String str, PackageManager packageManager) {
        return (Map) getMediationNetwork(new Object[]{this, str, packageManager}, 105639659, -105639659, System.identityHashCode(this));
    }
}
