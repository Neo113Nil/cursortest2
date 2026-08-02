package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.cdma.CdmaCellLocation;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.vungle.ads.internal.protos.Sdk;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class AFf1vSDK extends AFf1tSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 1;
    private static int AFInAppEventType;
    private static char[] AFKeystoreWrapper = {33841, 33847, 45515, 45518, 33844, 45533, 33846, 45505, 45517};
    private static char registerClient = 33846;
    private final AFg1tSDK AFLogger;
    private final AFc1hSDK copy;
    private final AFc1kSDK copydefault;
    private final String equals;

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i, int i2, int i3) {
        return getRevenue(objArr);
    }

    public AFf1vSDK(String str, AFc1fSDK aFc1fSDK) {
        super(new AFg1xSDK(), aFc1fSDK, str);
        this.copydefault = aFc1fSDK.getRevenue();
        this.copy = aFc1fSDK.AFLogger();
        this.equals = str;
        this.AFLogger = aFc1fSDK.component3();
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final void getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 101;
        AFInAppEventParameterName = i2 % 128;
        int i3 = i2 % 2;
        super.getCurrencyIso4217Code();
        ResponseNetwork responseNetwork = ((AFe1kSDK) this).component2;
        Object obj = null;
        if (responseNetwork != null) {
            int i4 = AFInAppEventType + 11;
            AFInAppEventParameterName = i4 % 128;
            if (i4 % 2 != 0) {
                if (responseNetwork.isSuccessful()) {
                    equals();
                }
            } else {
                responseNetwork.isSuccessful();
                throw null;
            }
        }
        int i5 = AFInAppEventType + 47;
        AFInAppEventParameterName = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    protected final void getRevenue(AFh1tSDK aFh1tSDK) {
        int i = 2 % 2;
        super.getRevenue(aFh1tSDK);
        Context context = this.copy.getMonetizationNetwork;
        AFa1zSDK monetizationNetwork = AFa1zSDK.getMonetizationNetwork();
        if (context == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (monetizationNetwork.getCurrencyIso4217Code()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            aFh1tSDK.getMonetizationNetwork("app_version_code", Integer.toString(packageInfo.versionCode));
            aFh1tSDK.getMonetizationNetwork("app_version_name", packageInfo.versionName);
            aFh1tSDK.getMonetizationNetwork("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFh1tSDK.getMonetizationNetwork("installDate", AFa1zSDK.getMediationNetwork(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        this.AFLogger.getRevenue(aFh1tSDK.getMonetizationNetwork);
        aFh1tSDK.getMonetizationNetwork.remove("ivc");
        String str = (String) AFa1zSDK.AFAdRevenueData(new Object[0], -775349742, 775349749, (int) System.currentTimeMillis());
        if (str != null) {
            aFh1tSDK.getMonetizationNetwork("appUserId", str);
        }
        try {
            aFh1tSDK.getMonetizationNetwork("model", Build.MODEL);
            Object[] objArr = new Object[1];
            a("\u0002\b\u0004\u0006㘕", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 5, (byte) (23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr);
            aFh1tSDK.getMonetizationNetwork(((String) objArr[0]).intern(), Build.BRAND);
            int i2 = AFInAppEventType + 43;
            AFInAppEventParameterName = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            aFh1tSDK.getMonetizationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        AFb1lSDK k_ = AFb1iSDK.k_(context.getContentResolver());
        if (k_ != null) {
            int i4 = AFInAppEventParameterName + 113;
            AFInAppEventType = i4 % 128;
            int i5 = i4 % 2;
            aFh1tSDK.getMonetizationNetwork("amazon_aid", k_.getMonetizationNetwork);
            aFh1tSDK.getMonetizationNetwork("amazon_aid_limit", String.valueOf(k_.getCurrencyIso4217Code));
        }
        aFh1tSDK.getMonetizationNetwork("devkey", ((AFe1kSDK) this).component4.getRevenue());
        aFh1tSDK.getMonetizationNetwork("uid", AFb1kSDK.getMonetizationNetwork(this.toString));
        aFh1tSDK.getMonetizationNetwork("af_gcm_token", this.equals);
        aFh1tSDK.getMonetizationNetwork("launch_counter", Integer.toString(this.toString.AFAdRevenueData("appsFlyerCount", 0)));
        aFh1tSDK.getMonetizationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String component1 = this.copydefault.component1();
        if (component1 != null) {
            int i6 = AFInAppEventType + 81;
            AFInAppEventParameterName = i6 % 128;
            if (i6 % 2 == 0) {
                aFh1tSDK.getMonetizationNetwork(AppsFlyerProperties.CHANNEL, component1);
                int i7 = 82 / 0;
            } else {
                aFh1tSDK.getMonetizationNetwork(AppsFlyerProperties.CHANNEL, component1);
            }
        }
        int i8 = AFInAppEventParameterName + 67;
        AFInAppEventType = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    protected final void component3(AFh1tSDK aFh1tSDK) {
        int i = 2 % 2;
        String currencyIso4217Code = this.copydefault.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            int i2 = AFInAppEventParameterName + 11;
            AFInAppEventType = i2 % 128;
            int i3 = i2 % 2;
            aFh1tSDK.getMonetizationNetwork("advertiserId", currencyIso4217Code);
        }
        int i4 = AFInAppEventType + 57;
        AFInAppEventParameterName = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFf1tSDK, com.appsflyer.internal.AFe1kSDK
    protected final boolean copydefault() {
        int i = 2 % 2;
        int i2 = AFInAppEventType;
        int i3 = i2 + 31;
        AFInAppEventParameterName = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        AFInAppEventParameterName = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private void equals() {
        AFc1sSDK aFc1sSDK;
        boolean z;
        int i = 2 % 2;
        int i2 = AFInAppEventType + 97;
        AFInAppEventParameterName = i2 % 128;
        if (i2 % 2 == 0) {
            aFc1sSDK = this.toString;
            z = false;
        } else {
            aFc1sSDK = this.toString;
            z = true;
        }
        aFc1sSDK.getCurrencyIso4217Code("sentRegisterRequestToAF", z);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    protected final void getMonetizationNetwork(AFh1tSDK aFh1tSDK) {
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 95;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    protected final void getCurrencyIso4217Code(AFh1tSDK aFh1tSDK) {
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 113;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        int i = 2 % 2;
        int i2 = AFInAppEventType + 43;
        AFInAppEventParameterName = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    protected final void getMediationNetwork(AFh1tSDK aFh1tSDK) {
        int i = 2 % 2;
        int i2 = AFInAppEventParameterName + 67;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
    }

    private static void a(String str, int i, byte b, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1rSDK aFk1rSDK = new AFk1rSDK();
        char[] cArr3 = AFKeystoreWrapper;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr4[i4] = (char) (cArr3[i4] ^ (-2775045471812025291L));
                } else {
                    cArr4[i4] = (char) (cArr3[i4] ^ (-2775045471812025291L));
                    i4++;
                }
            }
            cArr3 = cArr4;
        }
        char c = (char) ((-2775045471812025291L) ^ registerClient);
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            aFk1rSDK.getRevenue = 0;
            while (aFk1rSDK.getRevenue < i2) {
                aFk1rSDK.AFAdRevenueData = cArr2[aFk1rSDK.getRevenue];
                aFk1rSDK.getMediationNetwork = cArr2[aFk1rSDK.getRevenue + 1];
                if (aFk1rSDK.AFAdRevenueData == aFk1rSDK.getMediationNetwork) {
                    cArr5[aFk1rSDK.getRevenue] = (char) (aFk1rSDK.AFAdRevenueData - b);
                    cArr5[aFk1rSDK.getRevenue + 1] = (char) (aFk1rSDK.getMediationNetwork - b);
                } else {
                    aFk1rSDK.getMonetizationNetwork = aFk1rSDK.AFAdRevenueData / c;
                    aFk1rSDK.component3 = aFk1rSDK.AFAdRevenueData % c;
                    aFk1rSDK.getCurrencyIso4217Code = aFk1rSDK.getMediationNetwork / c;
                    aFk1rSDK.component2 = aFk1rSDK.getMediationNetwork % c;
                    if (aFk1rSDK.component3 == aFk1rSDK.component2) {
                        int i6 = $11 + 105;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        aFk1rSDK.getMonetizationNetwork = ((aFk1rSDK.getMonetizationNetwork + c) - 1) % c;
                        aFk1rSDK.getCurrencyIso4217Code = ((aFk1rSDK.getCurrencyIso4217Code + c) - 1) % c;
                        int i8 = (aFk1rSDK.getMonetizationNetwork * c) + aFk1rSDK.component3;
                        int i9 = (aFk1rSDK.getCurrencyIso4217Code * c) + aFk1rSDK.component2;
                        cArr5[aFk1rSDK.getRevenue] = cArr3[i8];
                        cArr5[aFk1rSDK.getRevenue + 1] = cArr3[i9];
                    } else if (aFk1rSDK.getMonetizationNetwork == aFk1rSDK.getCurrencyIso4217Code) {
                        int i10 = $10 + 85;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        aFk1rSDK.component3 = ((aFk1rSDK.component3 + c) - 1) % c;
                        aFk1rSDK.component2 = ((aFk1rSDK.component2 + c) - 1) % c;
                        int i12 = (aFk1rSDK.getMonetizationNetwork * c) + aFk1rSDK.component3;
                        int i13 = (aFk1rSDK.getCurrencyIso4217Code * c) + aFk1rSDK.component2;
                        cArr5[aFk1rSDK.getRevenue] = cArr3[i12];
                        cArr5[aFk1rSDK.getRevenue + 1] = cArr3[i13];
                    } else {
                        int i14 = (aFk1rSDK.getMonetizationNetwork * c) + aFk1rSDK.component2;
                        int i15 = (aFk1rSDK.getCurrencyIso4217Code * c) + aFk1rSDK.component3;
                        cArr5[aFk1rSDK.getRevenue] = cArr3[i14];
                        cArr5[aFk1rSDK.getRevenue + 1] = cArr3[i15];
                    }
                }
                aFk1rSDK.getRevenue += 2;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            cArr5[i16] = (char) (cArr5[i16] ^ 13722);
            i16++;
            int i17 = $11 + 101;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 4 / 3;
            }
        }
        objArr[0] = new String(cArr5);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    protected final void AFAdRevenueData(AFh1tSDK aFh1tSDK) {
        getMonetizationNetwork(new Object[]{this, aFh1tSDK}, -1677420347, 1677420347, System.identityHashCode(this));
    }
}
