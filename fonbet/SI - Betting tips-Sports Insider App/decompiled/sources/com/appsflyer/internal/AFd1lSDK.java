package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFd1lSDK implements AFd1oSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] component3 = null;
    private static boolean copy = false;
    private static int copydefault = 1;
    private static int equals;
    private static final int getCurrencyIso4217Code;
    private static int hashCode;
    private static boolean toString;
    private final AFd1zSDK component2;
    private List<String> AFAdRevenueData = new ArrayList();
    private boolean getRevenue = true;

    @NonNull
    private final Map<String, Object> getMediationNetwork = new HashMap();
    private SecureRandom areAllFieldsValid = new SecureRandom();
    private boolean component1 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMonetizationNetwork = 0;
    private boolean component4 = false;

    static {
        component3();
        getCurrencyIso4217Code = 98166;
        equals = (copydefault + 23) % 128;
    }

    public AFd1lSDK(AFd1zSDK aFd1zSDK) {
        this.component2 = aFd1zSDK;
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i5, int i10, int i11) {
        int i12 = i5 | i10;
        int i13 = (i12 * (-502)) + (i10 * 503) + (i5 * 503);
        int i14 = ~i5;
        int i15 = ~((~i10) | i14);
        int i16 = i14 | (~i11);
        int i17 = i15 | (~i16);
        int i18 = ~(i11 | i12);
        int i19 = (((~(i16 | i10)) | i18) * 502) + ((i17 | i18) * (-502)) + i13;
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? getMonetizationNetwork(objArr) : getRevenue(objArr) : getMediationNetwork(objArr) : getCurrencyIso4217Code(objArr);
    }

    private void AFInAppEventType() {
        copydefault = (equals + 119) % 128;
        this.component2.component4().AFAdRevenueData("participantInProxy");
        int i5 = copydefault + 89;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 31 / 0;
        }
    }

    private boolean AFLogger() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, -916590221, 916590222, System.identityHashCode(this))).booleanValue();
    }

    private static void a(String str, int[] iArr, String str2, int i5, Object[] objArr) {
        int i10 = ($11 + 29) % 128;
        $10 = i10;
        char[] cArr = str2;
        if (str2 != null) {
            int i11 = i10 + 95;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr3 = component3;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i12 = 0; i12 < length; i12++) {
                cArr4[i12] = (char) (cArr3[i12] ^ 1825820251896122634L);
            }
            cArr3 = cArr4;
        }
        int i13 = (int) (1825820251896122634L ^ hashCode);
        if (copy) {
            int length2 = bArr2.length;
            aFk1oSDK.getMonetizationNetwork = length2;
            char[] cArr5 = new char[length2];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i14 = aFk1oSDK.AFAdRevenueData;
                int i15 = aFk1oSDK.getMonetizationNetwork;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i14] = (char) (cArr3[bArr2[(i15 - 1) - i14] + i5] - i13);
                    aFk1oSDK.AFAdRevenueData = i14 + 1;
                }
            }
        } else if (toString) {
            int length3 = cArr2.length;
            aFk1oSDK.getMonetizationNetwork = length3;
            char[] cArr6 = new char[length3];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i16 = aFk1oSDK.AFAdRevenueData;
                int i17 = aFk1oSDK.getMonetizationNetwork;
                if (i16 >= i17) {
                    String str3 = new String(cArr6);
                    $11 = ($10 + 51) % 128;
                    objArr[0] = str3;
                    return;
                } else {
                    int i18 = $11 + 55;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        cArr6[i16] = (char) (cArr3[cArr2[(i17 % 1) / i16] - i5] % i13);
                    } else {
                        cArr6[i16] = (char) (cArr3[cArr2[(i17 - 1) - i16] - i5] - i13);
                        i16++;
                    }
                    aFk1oSDK.AFAdRevenueData = i16;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1oSDK.getMonetizationNetwork = length4;
            char[] cArr7 = new char[length4];
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i19 = aFk1oSDK.AFAdRevenueData;
                int i20 = aFk1oSDK.getMonetizationNetwork;
                if (i19 >= i20) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i19] = (char) (cArr3[iArr[(i20 - 1) - i19] - i5] - i13);
                    aFk1oSDK.AFAdRevenueData = i19 + 1;
                }
            }
        }
    }

    private synchronized void component1() {
        int i5 = copydefault + 51;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (this.component4) {
            return;
        }
        this.component4 = true;
        try {
            getCurrencyIso4217Code("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            equals = (copydefault + 83) % 128;
            return;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while starting remote debugger", th2, true, true, true);
            return;
        }
    }

    private float component2() {
        int i5 = copydefault + 115;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return this.areAllFieldsValid.nextFloat();
        }
        this.areAllFieldsValid.nextFloat();
        throw null;
    }

    public static void component3() {
        component3 = new char[]{36322, 36338, 36333, 36350, 36320};
        hashCode = 1912311180;
        toString = true;
        copy = true;
    }

    private static String component4() {
        int i5 = equals + 83;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return "6.17.5";
        }
        throw null;
    }

    private synchronized void copy() {
        this.AFAdRevenueData = new ArrayList();
        this.getMonetizationNetwork = 0;
        copydefault = (equals + 29) % 128;
    }

    @NonNull
    private synchronized Map<String, Object> copydefault() {
        Map<String, Object> map;
        copydefault = (equals + 37) % 128;
        this.getMediationNetwork.put("data", this.AFAdRevenueData);
        copy();
        map = this.getMediationNetwork;
        copydefault = (equals + 111) % 128;
        return map;
    }

    private boolean equals() {
        if (this.component1) {
            int i5 = copydefault;
            equals = (i5 + 31) % 128;
            if (this.getRevenue) {
                return true;
            }
            int i10 = i5 + 37;
            equals = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (this.component4) {
                return true;
            }
        }
        int i11 = copydefault + 39;
        equals = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean areAllFieldsValid() {
        int i5 = copydefault + 105;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return this.component4;
        }
        int i10 = 7 / 0;
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getCurrencyIso4217Code() {
        int i5 = copydefault;
        this.component1 = false;
        equals = (i5 + 13) % 128;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getMediationNetwork() {
        if (!this.component4 && !this.getRevenue) {
            copydefault = (equals + 85) % 128;
            return;
        }
        this.component4 = false;
        this.getRevenue = false;
        try {
            getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            equals = (copydefault + 91) % 128;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th2, true, true, true);
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getMonetizationNetwork() {
        equals = (copydefault + 29) % 128;
        this.getMediationNetwork.clear();
        this.AFAdRevenueData.clear();
        this.getMonetizationNetwork = 0;
        int i5 = equals + 61;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getRevenue(String str, String... strArr) {
        int i5 = copydefault + 47;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            getCurrencyIso4217Code("public_api_call", str, strArr);
            int i10 = 67 / 0;
        } else {
            getCurrencyIso4217Code("public_api_call", str, strArr);
        }
        equals = (copydefault + 3) % 128;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void q_(String str, PackageManager packageManager) {
        int i5 = copydefault + 33;
        equals = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                this.component2.getRevenue().getMediationNetwork(AFAdRevenueData(str), this.component2.AFInAppEventType().getMediationNetwork());
                throw null;
            }
            AFd1kSDK mediationNetwork = this.component2.getRevenue().getMediationNetwork(AFAdRevenueData(str), this.component2.AFInAppEventType().getMediationNetwork());
            if (mediationNetwork == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
            } else {
                this.component2.getMonetizationNetwork().execute(new e(2, mediationNetwork));
                equals = (copydefault + 61) % 128;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th2);
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean AFAdRevenueData() {
        equals = (copydefault + 67) % 128;
        boolean monetizationNetwork = getMonetizationNetwork(getMonetizationNetwork(this.component2.component1().AFAdRevenueData.getCurrencyIso4217Code), getMonetizationNetwork(this.component2.component1().AFAdRevenueData.getMediationNetwork));
        if (monetizationNetwork) {
            equals = (copydefault + 13) % 128;
            component1();
        } else {
            getRevenue();
            getMediationNetwork();
        }
        copydefault = (equals + 119) % 128;
        return monetizationNetwork;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a("\u0085\u0084\u0083\u0082\u0081", null, null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.getMediationNetwork.put(CommonUrlParts.MODEL, Build.MODEL);
            this.getMediationNetwork.put("platform", "Android");
            this.getMediationNetwork.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                int i5 = copydefault + 19;
                equals = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                if (str.length() > 0) {
                    this.getMediationNetwork.put("advertiserId", str);
                    copydefault = (equals + 55) % 128;
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.getMediationNetwork.put("imei", str2);
            }
            if (str3 != null) {
                equals = (copydefault + 111) % 128;
                if (str3.length() > 0) {
                    this.getMediationNetwork.put("android_id", str3);
                    equals = (copydefault + 123) % 128;
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getMonetizationNetwork(String str, String str2) {
        int i5 = equals + 109;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            getCurrencyIso4217Code((String) null, str, str2);
        } else {
            getCurrencyIso4217Code((String) null, str, str2);
        }
        int i10 = equals + 125;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r2 = r4.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        r2 = r0.getMessage();
     */
    @Override // com.appsflyer.internal.AFd1oSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getRevenue(Throwable th2) {
        Throwable cause;
        String simpleName;
        String message;
        StackTraceElement[] stackTrace;
        int i5 = equals + 103;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            cause = th2.getCause();
            simpleName = th2.getClass().getSimpleName();
            int i10 = 82 / 0;
        } else {
            cause = th2.getCause();
            simpleName = th2.getClass().getSimpleName();
        }
        if (cause == null) {
            stackTrace = th2.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
            equals = (copydefault + 47) % 128;
        }
        getCurrencyIso4217Code("exception", simpleName, getCurrencyIso4217Code(message, stackTrace));
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        boolean mediationNetwork;
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        AFi1xSDK aFi1xSDK = (AFi1xSDK) objArr[1];
        AFi1xSDK aFi1xSDK2 = (AFi1xSDK) objArr[2];
        int i5 = equals + 87;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            aFi1xSDK.equals(aFi1xSDK2);
            throw null;
        }
        if (aFi1xSDK.equals(aFi1xSDK2)) {
            mediationNetwork = aFd1lSDK.AFLogger();
        } else {
            mediationNetwork = aFd1lSDK.getMediationNetwork(aFi1xSDK.getCurrencyIso4217Code);
            aFd1lSDK.getMediationNetwork(mediationNetwork);
        }
        int i10 = copydefault + 63;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            return Boolean.valueOf(mediationNetwork);
        }
        throw null;
    }

    private synchronized boolean getMonetizationNetwork(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        if (aFi1xSDK == null) {
            AFInAppEventType();
            return false;
        }
        if (!aFi1xSDK.AFAdRevenueData()) {
            return false;
        }
        if (this.component2.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0) > aFi1xSDK.getMonetizationNetwork) {
            return false;
        }
        equals = (copydefault + 113) % 128;
        if (!AFAdRevenueData(aFi1xSDK, aFi1xSDK2)) {
            return false;
        }
        if (!getMonetizationNetwork(aFi1xSDK.getMediationNetwork)) {
            return false;
        }
        if (getCurrencyIso4217Code(aFi1xSDK.getRevenue)) {
            return true;
        }
        int i5 = copydefault + 115;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void AFAdRevenueData(String str, int i5, String str2) {
        int i10 = copydefault + 3;
        equals = i10 % 128;
        if (i10 % 2 != 0) {
            String[] strArr = new String[4];
            strArr[1] = String.valueOf(i5);
            strArr[0] = str2;
            getCurrencyIso4217Code("server_response", str, strArr);
        } else {
            getCurrencyIso4217Code("server_response", str, String.valueOf(i5), str2);
        }
        int i11 = copydefault + 113;
        equals = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 72 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getRevenue(String str, String str2) {
        int i5 = equals + 19;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            getCurrencyIso4217Code("server_request", str, strArr);
        } else {
            getCurrencyIso4217Code("server_request", str, str2);
        }
        int i10 = copydefault + 115;
        equals = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private void getMediationNetwork(boolean z5) {
        int i5 = equals + 57;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            this.component2.component4().AFAdRevenueData("participantInProxy", z5);
        } else {
            this.component2.component4().AFAdRevenueData("participantInProxy", z5);
            throw null;
        }
    }

    private Map<String, Object> AFAdRevenueData(String str) {
        int i5 = equals + 7;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            AFAdRevenueData(str, this.component2.AFInAppEventType(), this.component2.force());
            return copydefault();
        }
        AFAdRevenueData(str, this.component2.AFInAppEventType(), this.component2.force());
        copydefault();
        throw null;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3, String str4) {
        try {
            int i5 = equals + 5;
            copydefault = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    this.getMediationNetwork.put("sdk_version", str);
                    if (str2 != null) {
                        equals = (copydefault + 29) % 128;
                        if (str2.length() > 0) {
                            this.getMediationNetwork.put("devkey", str2);
                        }
                    }
                    if (str3 != null && str3.length() > 0) {
                        int i10 = copydefault + 61;
                        equals = i10 % 128;
                        if (i10 % 2 == 0) {
                            this.getMediationNetwork.put("originalAppsFlyerId", str3);
                        } else {
                            this.getMediationNetwork.put("originalAppsFlyerId", str3);
                            throw null;
                        }
                    }
                    if (str4 != null) {
                        int i11 = equals + 79;
                        copydefault = i11 % 128;
                        if (i11 % 2 != 0) {
                            if (str4.length() > 0) {
                                this.getMediationNetwork.put("uid", str4);
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    this.getMediationNetwork.put("sdk_version", str);
                    throw null;
                }
            } catch (Throwable unused) {
            }
        } finally {
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getRevenue() {
        try {
            int i5 = copydefault + 23;
            equals = i5 % 128;
            if (i5 % 2 != 0) {
                this.getRevenue = false;
            } else {
                this.getRevenue = false;
            }
            getMonetizationNetwork();
            copy();
            int i10 = equals + 31;
            copydefault = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 15 / 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean getMediationNetwork(float f6) {
        return ((Boolean) AFAdRevenueData(new Object[]{this, Float.valueOf(f6)}, 1140261820, -1140261820, System.identityHashCode(this))).booleanValue();
    }

    private synchronized void AFAdRevenueData(String str, AFf1eSDK aFf1eSDK, AFc1eSDK aFc1eSDK) {
        try {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.getMediationNetwork.clear();
            if (string != null) {
                try {
                    this.getMediationNetwork.putAll(AFg1eSDK.getRevenue(new JSONObject(string)));
                } catch (Throwable unused) {
                }
            } else {
                getCurrencyIso4217Code(this.component2.AFAdRevenueData().areAllFieldsValid(), aFf1eSDK.AFAdRevenueData(), aFc1eSDK.getCurrencyIso4217Code);
                StringBuilder sb2 = new StringBuilder("6.17.5.");
                sb2.append(AFa1ySDK.getMonetizationNetwork);
                getCurrencyIso4217Code(sb2.toString(), this.component2.AFInAppEventType().getMediationNetwork(), appsFlyerProperties.getString("KSAppsFlyerId"), AFb1kSDK.getCurrencyIso4217Code(this.component2.AFAdRevenueData().getMediationNetwork));
                try {
                    int i5 = this.component2.AFAdRevenueData().n_().versionCode;
                    getRevenue(str, String.valueOf(i5), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                    copydefault = (equals + 29) % 128;
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getMediationNetwork).toString());
            }
            this.getMediationNetwork.put("launch_counter", String.valueOf(this.component2.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0)));
            copydefault = (equals + 41) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void getRevenue(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    copydefault = (equals + 65) % 128;
                    this.getMediationNetwork.put(CommonUrlParts.APP_ID, str);
                    equals = (copydefault + 37) % 128;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            int i5 = equals + 19;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                this.getMediationNetwork.put("app_version", str2);
            } else {
                this.getMediationNetwork.put("app_version", str2);
                throw null;
            }
        }
        if (str3 != null) {
            equals = (copydefault + 105) % 128;
            if (str3.length() > 0) {
                int i10 = equals + 123;
                copydefault = i10 % 128;
                if (i10 % 2 != 0) {
                    this.getMediationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
                } else {
                    this.getMediationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
                    throw null;
                }
            }
        }
        if (str4 != null && str4.length() > 0) {
            this.getMediationNetwork.put("preInstall", str4);
        }
        copydefault = (equals + 57) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        r3 = r3.equals(r2.component2.AFAdRevenueData().n_().versionName);
        com.appsflyer.internal.AFd1lSDK.copydefault = (com.appsflyer.internal.AFd1lSDK.equals + 83) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        com.appsflyer.internal.AFd1lSDK.equals = (com.appsflyer.internal.AFd1lSDK.copydefault + 89) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean getMonetizationNetwork(String str) {
        int i5 = equals + 47;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 2 / 0;
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        float floatValue = ((Number) objArr[1]).floatValue();
        double d10 = floatValue;
        if (d10 >= 1.0d) {
            int i5 = copydefault + 109;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        if (d10 <= 0.0d) {
            return Boolean.FALSE;
        }
        if (aFd1lSDK.component2() <= floatValue) {
            int i10 = equals + 47;
            copydefault = i10 % 128;
            return i10 % 2 == 0 ? Boolean.FALSE : Boolean.TRUE;
        }
        int i11 = equals + 71;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            return Boolean.FALSE;
        }
        int i12 = 5 / 0;
        return Boolean.FALSE;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String... strArr) {
        String obj;
        try {
            if (!equals() || this.getMonetizationNetwork >= 98304) {
                return;
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String join = TextUtils.join(", ", strArr);
                if (str != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(currentTimeMillis);
                    sb2.append(" ");
                    sb2.append(Thread.currentThread().getId());
                    sb2.append(" _/AppsFlyer_6.17.5 [");
                    sb2.append(str);
                    sb2.append("] ");
                    sb2.append(str2);
                    sb2.append(" ");
                    sb2.append(join);
                    obj = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(currentTimeMillis);
                    sb3.append(" ");
                    sb3.append(Thread.currentThread().getId());
                    sb3.append(" ");
                    sb3.append(str2);
                    sb3.append("/AppsFlyer_6.17.5 ");
                    sb3.append(join);
                    obj = sb3.toString();
                }
                int length = this.getMonetizationNetwork + (obj.length() << 1);
                int i5 = getCurrencyIso4217Code;
                boolean z5 = false;
                if (length > i5) {
                    copydefault = (equals + 55) % 128;
                    obj = obj.substring(0, (i5 - this.getMonetizationNetwork) / 2);
                    z5 = true;
                }
                this.AFAdRevenueData.add(obj);
                this.getMonetizationNetwork += obj.length() << 1;
                if (z5) {
                    int i10 = equals + 113;
                    copydefault = i10 % 128;
                    if (i10 % 2 == 0) {
                        this.AFAdRevenueData.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.getMonetizationNetwork *= 26120;
                    } else {
                        this.AFAdRevenueData.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.getMonetizationNetwork += 138;
                    }
                }
            } catch (Throwable unused) {
            }
        } finally {
        }
    }

    private static AFi1xSDK getMonetizationNetwork(AFi1vSDK aFi1vSDK) {
        int i5 = copydefault + 83;
        int i10 = i5 % 128;
        equals = i10;
        if (i5 % 2 != 0) {
            int i11 = 4 / 0;
            if (aFi1vSDK == null) {
                return null;
            }
        } else if (aFi1vSDK == null) {
            return null;
        }
        AFi1zSDK aFi1zSDK = aFi1vSDK.getMonetizationNetwork;
        if (aFi1zSDK == null) {
            return null;
        }
        copydefault = (i10 + 33) % 128;
        return aFi1zSDK.getMediationNetwork;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        String str = (String) objArr[0];
        int i5 = equals + 87;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            if (!AFk1wSDK.getCurrencyIso4217Code(str)) {
                new AFd1pSDK();
                return Boolean.valueOf(AFd1pSDK.getCurrencyIso4217Code(component4(), str));
            }
            int i10 = equals + 123;
            copydefault = i10 % 128;
            return Boolean.valueOf(i10 % 2 != 0);
        }
        AFk1wSDK.getCurrencyIso4217Code(str);
        throw null;
    }

    private boolean AFAdRevenueData(@NonNull AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        return ((Boolean) AFAdRevenueData(new Object[]{this, aFi1xSDK, aFi1xSDK2}, 322554097, -322554095, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r0[r2] = r4[r2].toString();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r0[r2] = r4[r2].toString();
        r2 = r2 + 43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0019, code lost:
    
        return new java.lang.String[]{r3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0013, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r2 = 1;
        r0 = new java.lang.String[r4.length + 1];
        r0[0] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r2 >= r4.length) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r3 = com.appsflyer.internal.AFd1lSDK.copydefault + 61;
        com.appsflyer.internal.AFd1lSDK.equals = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if ((r3 % 2) == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String[] getCurrencyIso4217Code(String str, StackTraceElement[] stackTraceElementArr) {
        int i5 = copydefault + 105;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 86 / 0;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        copydefault = (equals + 117) % 128;
        boolean mediationNetwork = aFd1lSDK.component2.component4().getMediationNetwork("participantInProxy", false);
        int i5 = copydefault + 37;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(mediationNetwork);
        }
        throw null;
    }

    private static boolean getCurrencyIso4217Code(String str) {
        return ((Boolean) AFAdRevenueData(new Object[]{str}, -1244422585, 1244422588, (int) System.currentTimeMillis())).booleanValue();
    }
}
