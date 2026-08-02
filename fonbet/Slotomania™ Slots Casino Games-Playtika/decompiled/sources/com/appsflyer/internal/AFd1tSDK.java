package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.ironsource.X3;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.sse.ServerSentEventKt;
import io.sentry.SentryEvent;
import io.sentry.protocol.App;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFd1tSDK implements AFd1sSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int AFAdRevenueData;
    private static int component3 = 0;
    private static int copydefault = 0;
    private static int equals = 1;
    private final AFc1fSDK areAllFieldsValid;
    private List<String> getMediationNetwork = new ArrayList();
    private boolean getRevenue = true;
    private final Map<String, Object> getCurrencyIso4217Code = new HashMap();
    private SecureRandom component1 = new SecureRandom();
    private boolean component4 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMonetizationNetwork = 0;
    private boolean component2 = false;

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (i * 273) + (i2 * (-271)) + (((~((~i2) | i4 | (~i3))) | (~(i | i2 | i3))) * (-272)) + (((~(i4 | i3)) | (~(i4 | i2))) * (-272)) + (((~(i | i3)) | i2) * 272);
        if (i5 == 1) {
            return getMonetizationNetwork(objArr);
        }
        if (i5 == 2) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i5 == 3) {
            return getMediationNetwork(objArr);
        }
        AFd1tSDK aFd1tSDK = (AFd1tSDK) objArr[0];
        int i6 = 2 % 2;
        int i7 = copydefault + 15;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            aFd1tSDK.component4 = true;
            return null;
        }
        aFd1tSDK.component4 = false;
        return null;
    }

    static {
        component4();
        AFAdRevenueData = 98166;
        int i = equals + 99;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public AFd1tSDK(AFc1fSDK aFc1fSDK) {
        this.areAllFieldsValid = aFc1fSDK;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFd1tSDK aFd1tSDK = (AFd1tSDK) objArr[0];
        int i = 2 % 2;
        int i2 = equals + 17;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            aFd1tSDK.getMonetizationNetwork((AFh1bSDK) getRevenue(new Object[]{aFd1tSDK.areAllFieldsValid.component4().getMonetizationNetwork.getMediationNetwork}, -778147058, 778147060, (int) System.currentTimeMillis()), (AFh1bSDK) getRevenue(new Object[]{aFd1tSDK.areAllFieldsValid.component4().getMonetizationNetwork.AFAdRevenueData}, -778147058, 778147060, (int) System.currentTimeMillis()));
            throw null;
        }
        boolean monetizationNetwork = aFd1tSDK.getMonetizationNetwork((AFh1bSDK) getRevenue(new Object[]{aFd1tSDK.areAllFieldsValid.component4().getMonetizationNetwork.getMediationNetwork}, -778147058, 778147060, (int) System.currentTimeMillis()), (AFh1bSDK) getRevenue(new Object[]{aFd1tSDK.areAllFieldsValid.component4().getMonetizationNetwork.AFAdRevenueData}, -778147058, 778147060, (int) System.currentTimeMillis()));
        if (monetizationNetwork) {
            aFd1tSDK.component2();
        } else {
            aFd1tSDK.getMonetizationNetwork();
            aFd1tSDK.AFAdRevenueData();
            int i3 = equals + 61;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
        return Boolean.valueOf(monetizationNetwork);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r8.component2 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r8.component2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        getMediationNetwork("r_debugging_on", new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", java.util.Locale.ENGLISH).format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r1 = com.appsflyer.internal.AFd1tSDK.equals + 65;
        com.appsflyer.internal.AFd1tSDK.copydefault = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if ((r1 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.e(com.appsflyer.internal.AFh1zSDK.PROXY, "Error while starting remote debugger", r0, true, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x001f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x001c, code lost:
    
        if (r8.component2 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void component2() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1sSDK
    public final synchronized void AFAdRevenueData() {
        int i = 2 % 2;
        if (!this.component2) {
            int i2 = equals;
            int i3 = i2 + 95;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (!this.getRevenue) {
                int i4 = i2 + 3;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
        }
        this.component2 = false;
        this.getRevenue = false;
        try {
            getMediationNetwork("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
        }
    }

    private static void a(boolean z, String str, int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5 = 2 % 2;
        int i6 = $11 + 89;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr3 = new char[i3];
        aFk1qSDK.getRevenue = 0;
        int i8 = $11 + 103;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        while (aFk1qSDK.getRevenue < i3) {
            aFk1qSDK.getMediationNetwork = cArr2[aFk1qSDK.getRevenue];
            cArr3[aFk1qSDK.getRevenue] = (char) (aFk1qSDK.getMediationNetwork + i);
            int i10 = aFk1qSDK.getRevenue;
            cArr3[i10] = (char) (cArr3[i10] - ((int) (component3 ^ 6822747700087044992L)));
            aFk1qSDK.getRevenue++;
        }
        if (i2 > 0) {
            aFk1qSDK.getMonetizationNetwork = i2;
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr3, 0, cArr4, 0, i3);
            System.arraycopy(cArr4, 0, cArr3, i3 - aFk1qSDK.getMonetizationNetwork, aFk1qSDK.getMonetizationNetwork);
            System.arraycopy(cArr4, aFk1qSDK.getMonetizationNetwork, cArr3, 0, i3 - aFk1qSDK.getMonetizationNetwork);
        }
        if (z) {
            char[] cArr5 = new char[i3];
            aFk1qSDK.getRevenue = 0;
            while (aFk1qSDK.getRevenue < i3) {
                int i11 = $10 + 67;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr5[aFk1qSDK.getRevenue] = cArr3[i3 >> aFk1qSDK.getRevenue];
                    i4 = aFk1qSDK.getRevenue;
                } else {
                    cArr5[aFk1qSDK.getRevenue] = cArr3[(i3 - aFk1qSDK.getRevenue) - 1];
                    i4 = aFk1qSDK.getRevenue + 1;
                }
                aFk1qSDK.getRevenue = i4;
            }
            cArr3 = cArr5;
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.appsflyer.internal.AFd1sSDK
    public final synchronized void getMediationNetwork() {
        int i = 2 % 2;
        int i2 = equals + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.getCurrencyIso4217Code.clear();
        this.getMediationNetwork.clear();
        this.getMonetizationNetwork = 0;
        int i4 = equals + 41;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1sSDK
    public final void o_(String str, PackageManager packageManager) {
        int i = 2 % 2;
        int i2 = equals + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        copydefault = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                final AFd1qSDK revenue = this.areAllFieldsValid.getMediationNetwork().getRevenue(p_(str, packageManager), this.areAllFieldsValid.AFKeystoreWrapper().getRevenue());
                if (revenue == null) {
                    AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                    int i3 = equals + 65;
                    copydefault = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 98 / 0;
                        return;
                    }
                    return;
                }
                ExecutorService AFAdRevenueData2 = this.areAllFieldsValid.AFAdRevenueData();
                Objects.requireNonNull(revenue);
                AFAdRevenueData2.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1tSDK$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFd1qSDK.this.getCurrencyIso4217Code();
                    }
                });
                return;
            }
            this.areAllFieldsValid.getMediationNetwork().getRevenue(p_(str, packageManager), this.areAllFieldsValid.AFKeystoreWrapper().getRevenue());
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    @Override // com.appsflyer.internal.AFd1sSDK
    public final void AFAdRevenueData(String str, String... strArr) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        equals = i2 % 128;
        int i3 = i2 % 2;
        getMediationNetwork("public_api_call", str, strArr);
        int i4 = equals + 13;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFd1sSDK
    public final void AFAdRevenueData(Throwable th) {
        StackTraceElement[] stackTrace;
        int i = 2 % 2;
        int i2 = equals + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        if (cause == null) {
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
            int i4 = equals + 19;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 5;
            }
        }
        getMediationNetwork(SentryEvent.JsonKeys.EXCEPTION, simpleName, getMonetizationNetwork(message, stackTrace));
    }

    @Override // com.appsflyer.internal.AFd1sSDK
    public final void getCurrencyIso4217Code(String str, String str2) {
        int i = 2 % 2;
        int i2 = equals + 105;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            getMediationNetwork("server_request", str, strArr);
        } else {
            getMediationNetwork("server_request", str, str2);
        }
        int i3 = copydefault + 19;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 43 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1sSDK
    public final void getMonetizationNetwork(String str, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = copydefault + 111;
        equals = i3 % 128;
        int i4 = i3 % 2;
        getMediationNetwork("server_response", str, String.valueOf(i), str2);
        int i5 = equals + 9;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1sSDK
    public final void getMonetizationNetwork(String str, String str2) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            getMediationNetwork(null, str, str2);
        } else {
            getMediationNetwork(null, str, str2);
        }
        int i3 = equals + 87;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1sSDK
    public final synchronized void getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = equals + 11;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.getRevenue = true;
            getMediationNetwork();
        } else {
            this.getRevenue = false;
            getMediationNetwork();
        }
        copy();
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1tSDK aFd1tSDK = (AFd1tSDK) objArr[0];
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean z = aFd1tSDK.component2;
        int i5 = i2 + 97;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private float component3() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        equals = i2 % 128;
        int i3 = i2 % 2;
        float nextFloat = this.component1.nextFloat();
        int i4 = copydefault + 83;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return nextFloat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Map<String, Object> p_(String str, PackageManager packageManager) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            q_(str, packageManager, this.areAllFieldsValid.AFKeystoreWrapper(), this.areAllFieldsValid.afErrorLog());
            Map<String, Object> copydefault2 = copydefault();
            int i3 = copydefault + 109;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return copydefault2;
        }
        q_(str, packageManager, this.areAllFieldsValid.AFKeystoreWrapper(), this.areAllFieldsValid.afErrorLog());
        copydefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
        int i5 = i2 + 61;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return "6.16.2";
    }

    private boolean equals() {
        int i = 2 % 2;
        if (!this.component4) {
            return false;
        }
        if (!this.getRevenue) {
            int i2 = equals + 53;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            if (!this.component2) {
                return false;
            }
        }
        int i4 = copydefault + 81;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r12.length() > 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3) {
        int i = 2 % 2;
        try {
            Map<String, Object> map = this.getCurrencyIso4217Code;
            Object[] objArr = new Object[1];
            a(false, "\u0007�\ufffb\u000b\ufffa", 198 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2, 4 - Process.getGidForName(""), objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.getCurrencyIso4217Code.put("model", Build.MODEL);
            this.getCurrencyIso4217Code.put("platform", X3.d);
            this.getCurrencyIso4217Code.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                int i2 = copydefault + 49;
                equals = i2 % 128;
                int i3 = i2 % 2;
                if (str.length() > 0) {
                    int i4 = copydefault + 83;
                    equals = i4 % 128;
                    if (i4 % 2 == 0) {
                        this.getCurrencyIso4217Code.put("advertiserId", str);
                        throw null;
                    }
                    this.getCurrencyIso4217Code.put("advertiserId", str);
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.getCurrencyIso4217Code.put("imei", str2);
            }
            if (str3 != null) {
                int i5 = equals + 99;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 21 / 0;
                    if (str3.length() > 0) {
                        int i7 = equals + 49;
                        copydefault = i7 % 128;
                        int i8 = i7 % 2;
                        this.getCurrencyIso4217Code.put("android_id", str3);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void getMonetizationNetwork(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        equals = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                this.getCurrencyIso4217Code.put("sdk_version", str);
                throw null;
            }
            this.getCurrencyIso4217Code.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                int i3 = copydefault + 25;
                equals = i3 % 128;
                if (i3 % 2 == 0) {
                    this.getCurrencyIso4217Code.put("devkey", str2);
                    obj.hashCode();
                    throw null;
                }
                this.getCurrencyIso4217Code.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                int i4 = equals + 3;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                this.getCurrencyIso4217Code.put("originalAppsFlyerId", str3);
                int i6 = 2 % 2;
            }
            if (str4 != null && str4.length() > 0) {
                this.getCurrencyIso4217Code.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        if (r4.length() > 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        try {
            if (str != null) {
                int i2 = equals + 59;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 62 / 0;
                    if (str.length() > 0) {
                        this.getCurrencyIso4217Code.put("app_id", str);
                        int i4 = 2 % 2;
                    }
                }
            }
            if (str2 != null) {
                int i5 = copydefault + 5;
                equals = i5 % 128;
                int i6 = i5 % 2;
                if (str2.length() > 0) {
                    int i7 = copydefault + 11;
                    equals = i7 % 128;
                    if (i7 % 2 == 0) {
                        this.getCurrencyIso4217Code.put(App.JsonKeys.APP_VERSION, str2);
                        int i8 = 76 / 0;
                    } else {
                        this.getCurrencyIso4217Code.put(App.JsonKeys.APP_VERSION, str2);
                    }
                }
            }
            if (str3 != null && str3.length() > 0) {
                this.getCurrencyIso4217Code.put(AppsFlyerProperties.CHANNEL, str3);
            }
            if (str4 != null && str4.length() > 0) {
                int i9 = equals + 75;
                copydefault = i9 % 128;
                if (i9 % 2 != 0) {
                    this.getCurrencyIso4217Code.put("preInstall", str4);
                    throw null;
                }
                this.getCurrencyIso4217Code.put("preInstall", str4);
                int i10 = equals + 21;
                copydefault = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 2 % 3;
                } else {
                    int i12 = 2 % 2;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void getMediationNetwork(String str, String str2, String... strArr) {
        String obj;
        int i = 2 % 2;
        int i2 = copydefault + 95;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (equals()) {
            int i4 = copydefault + 63;
            equals = i4 % 128;
            int i5 = i4 % 2;
            if (this.getMonetizationNetwork < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        obj = new StringBuilder().append(currentTimeMillis).append(ServerSentEventKt.SPACE).append(Thread.currentThread().getId()).append(" _/AppsFlyer_6.16.2 [").append(str).append("] ").append(str2).append(ServerSentEventKt.SPACE).append(join).toString();
                    } else {
                        obj = new StringBuilder().append(currentTimeMillis).append(ServerSentEventKt.SPACE).append(Thread.currentThread().getId()).append(ServerSentEventKt.SPACE).append(str2).append("/AppsFlyer_6.16.2 ").append(join).toString();
                        int i6 = equals + 71;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                        int i8 = 2 % 2;
                    }
                    int length = this.getMonetizationNetwork + (obj.length() << 1);
                    int i9 = AFAdRevenueData;
                    boolean z = false;
                    if (length > i9) {
                        obj = obj.substring(0, (i9 - this.getMonetizationNetwork) / 2);
                        int i10 = equals + 95;
                        copydefault = i10 % 128;
                        int i11 = i10 % 2;
                        int i12 = 2 % 2;
                        z = true;
                    }
                    this.getMediationNetwork.add(obj);
                    this.getMonetizationNetwork += obj.length() << 1;
                    if (z) {
                        int i13 = equals + 89;
                        copydefault = i13 % 128;
                        if (i13 % 2 != 0) {
                            this.getMediationNetwork.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            this.getMonetizationNetwork >>= 24906;
                        } else {
                            this.getMediationNetwork.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            this.getMonetizationNetwork += 138;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private synchronized Map<String, Object> copydefault() {
        Map<String, Object> map;
        int i = 2 % 2;
        int i2 = equals + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.getCurrencyIso4217Code.put("data", this.getMediationNetwork);
        copy();
        map = this.getCurrencyIso4217Code;
        int i4 = equals + 33;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    private synchronized void q_(String str, PackageManager packageManager, AFf1iSDK aFf1iSDK, AFc1oSDK aFc1oSDK) {
        int i = 2 % 2;
        int i2 = equals + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        this.getCurrencyIso4217Code.clear();
        if (string != null) {
            try {
                this.getCurrencyIso4217Code.putAll(AFg1mSDK.getMonetizationNetwork(new JSONObject(string)));
            } catch (Throwable unused) {
            }
        } else {
            AFa1zSDK monetizationNetwork = AFa1zSDK.getMonetizationNetwork();
            getCurrencyIso4217Code(AFa1zSDK.getMonetizationNetwork().AFAdRevenueData().getRevenue().getCurrencyIso4217Code(), aFf1iSDK.AFAdRevenueData(), aFc1oSDK.getCurrencyIso4217Code);
            getMonetizationNetwork(new StringBuilder("6.16.2.").append(AFa1zSDK.getMonetizationNetwork).toString(), monetizationNetwork.AFAdRevenueData().AFKeystoreWrapper().getRevenue(), appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                int i4 = packageManager.getPackageInfo(str, 0).versionCode;
                getCurrencyIso4217Code(str, String.valueOf(i4), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                int i5 = 2 % 2;
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getCurrencyIso4217Code).toString());
            int i6 = equals + 19;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
        }
        this.getCurrencyIso4217Code.put("launch_counter", String.valueOf(this.areAllFieldsValid.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0)));
    }

    private static String[] getMonetizationNetwork(String str, StackTraceElement[] stackTraceElementArr) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 1;
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        while (i4 < stackTraceElementArr.length) {
            int i5 = copydefault + 33;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                strArr[i4] = stackTraceElementArr[i4].toString();
                i4 += 104;
            } else {
                strArr[i4] = stackTraceElementArr[i4].toString();
                i4++;
            }
        }
        int i6 = equals + 81;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return strArr;
    }

    private synchronized void copy() {
        int i = 2 % 2;
        this.getMediationNetwork = new ArrayList();
        this.getMonetizationNetwork = 0;
        int i2 = equals + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private synchronized boolean getMonetizationNetwork(AFh1bSDK aFh1bSDK, AFh1bSDK aFh1bSDK2) {
        int i = 2 % 2;
        if (aFh1bSDK == null) {
            registerClient();
            return false;
        }
        if (!aFh1bSDK.getCurrencyIso4217Code()) {
            int i2 = equals + 21;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.areAllFieldsValid.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0) > aFh1bSDK.getMediationNetwork) {
            int i4 = copydefault;
            int i5 = i4 + 13;
            equals = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 63;
            equals = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i8 = 2 % 2;
        if (!AFAdRevenueData(aFh1bSDK, aFh1bSDK2)) {
            int i9 = equals + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!getCurrencyIso4217Code(aFh1bSDK.getCurrencyIso4217Code)) {
            int i11 = copydefault + 67;
            equals = i11 % 128;
            return i11 % 2 == 0;
        }
        if (getMonetizationNetwork(aFh1bSDK.getRevenue)) {
            return true;
        }
        int i12 = equals + 63;
        copydefault = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    private boolean AFAdRevenueData(AFh1bSDK aFh1bSDK, AFh1bSDK aFh1bSDK2) {
        boolean AFLogger;
        int i = 2 % 2;
        if (!aFh1bSDK.equals(aFh1bSDK2)) {
            AFLogger = AFAdRevenueData(aFh1bSDK.getMonetizationNetwork);
            getCurrencyIso4217Code(AFLogger);
        } else {
            int i2 = copydefault + 115;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                AFLogger = AFLogger();
            } else {
                AFLogger();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i3 = copydefault + 107;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return AFLogger;
    }

    private static boolean getMonetizationNetwork(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            if (AFj1eSDK.AFAdRevenueData(str)) {
                return true;
            }
            new AFd1rSDK();
            boolean AFAdRevenueData2 = AFd1rSDK.AFAdRevenueData(component1(), str);
            int i3 = copydefault + 7;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return AFAdRevenueData2;
        }
        AFj1eSDK.AFAdRevenueData(str);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (com.appsflyer.internal.AFj1eSDK.AFAdRevenueData(r5) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (com.appsflyer.internal.AFj1eSDK.AFAdRevenueData(r5) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r0 = r4.areAllFieldsValid.getRevenue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        return r5.equals(com.appsflyer.internal.AFj1nSDK.getCurrencyIso4217Code(r0.AFAdRevenueData.getMonetizationNetwork, r0.AFAdRevenueData.getMonetizationNetwork.getPackageName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        r5 = com.appsflyer.internal.AFd1tSDK.equals + 69;
        com.appsflyer.internal.AFd1tSDK.copydefault = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean getCurrencyIso4217Code(String str) {
        int i = 2 % 2;
        int i2 = equals + 39;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 11 / 0;
        }
    }

    private boolean AFAdRevenueData(float f) {
        int i = 2 % 2;
        double d = f;
        if (d >= 1.0d) {
            int i2 = copydefault + 67;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (d > 0.0d) {
            return component3() <= f;
        }
        int i3 = equals + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r5 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r5 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        return r5.getRevenue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFh1iSDK aFh1iSDK;
        AFi1zSDK aFi1zSDK = (AFi1zSDK) objArr[0];
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (aFi1zSDK != null) {
            int i4 = i2 + 69;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                aFh1iSDK = aFi1zSDK.getRevenue;
                int i5 = 96 / 0;
            } else {
                aFh1iSDK = aFi1zSDK.getRevenue;
            }
        }
        int i6 = equals + 59;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
        return null;
    }

    private void registerClient() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.areAllFieldsValid.component1().getMediationNetwork("participantInProxy");
        int i4 = copydefault + 41;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private void getCurrencyIso4217Code(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.areAllFieldsValid.component1().getCurrencyIso4217Code("participantInProxy", z);
        int i4 = copydefault + 49;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private boolean AFLogger() {
        AFc1sSDK component1;
        boolean z;
        int i = 2 % 2;
        int i2 = equals + 33;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            component1 = this.areAllFieldsValid.component1();
            z = true;
        } else {
            component1 = this.areAllFieldsValid.component1();
            z = false;
        }
        return component1.AFAdRevenueData("participantInProxy", z);
    }

    static void component4() {
        component3 = 2144156640;
    }

    private static AFh1bSDK getMediationNetwork(AFi1zSDK aFi1zSDK) {
        return (AFh1bSDK) getRevenue(new Object[]{aFi1zSDK}, -778147058, 778147060, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFd1sSDK
    public final boolean areAllFieldsValid() {
        return ((Boolean) getRevenue(new Object[]{this}, -1674862948, 1674862949, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.internal.AFd1sSDK
    public final void getRevenue() {
        getRevenue(new Object[]{this}, 2011204770, -2011204770, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1sSDK
    public final boolean getCurrencyIso4217Code() {
        return ((Boolean) getRevenue(new Object[]{this}, 1641812601, -1641812598, System.identityHashCode(this))).booleanValue();
    }
}
