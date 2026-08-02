package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class AFf1cSDK extends AFf1gSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFInAppEventParameterName = {3298, 3257, 3255, 3257, 3258};
    private static int AFKeystoreWrapper = 0;
    private static int values = 1;
    private final AFg1iSDK AFInAppEventType;
    private final AFd1lSDK copy;
    private final AFd1rSDK copydefault;
    private final String toString;

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
        return getMonetizationNetwork(objArr);
    }

    public AFf1cSDK(String str, AFd1kSDK aFd1kSDK) {
        super(new AFg1kSDK(aFd1kSDK.AFInAppEventParameterName().getCurrencyIso4217Code), aFd1kSDK, str);
        this.copydefault = aFd1kSDK.getCurrencyIso4217Code();
        this.copy = aFd1kSDK.AFInAppEventParameterName();
        this.toString = str;
        this.AFInAppEventType = aFd1kSDK.component2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1.isSuccessful() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        copy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r1.isSuccessful() != false) goto L11;
     */
    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getCurrencyIso4217Code() {
        int i = 2 % 2;
        super.getCurrencyIso4217Code();
        ResponseNetwork responseNetwork = ((AFf1pSDK) this).areAllFieldsValid;
        if (responseNetwork != null) {
            int i2 = values + 19;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 97 / 0;
            }
        }
        int i4 = AFKeystoreWrapper + 27;
        values = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFf1cSDK aFf1cSDK = (AFf1cSDK) objArr[0];
        AFa1mSDK aFa1mSDK = (AFa1mSDK) objArr[1];
        int i = 2 % 2;
        super.getMonetizationNetwork(aFa1mSDK);
        Context context = aFf1cSDK.copy.getCurrencyIso4217Code;
        AFb1rSDK revenue = AFb1rSDK.getRevenue();
        if (context == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (revenue.AFAdRevenueData()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            aFa1mSDK.getMediationNetwork("app_version_code", Integer.toString(packageInfo.versionCode));
            aFa1mSDK.getMediationNetwork("app_version_name", packageInfo.versionName);
            aFa1mSDK.getMediationNetwork("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFa1mSDK.getMediationNetwork("installDate", AFb1rSDK.getCurrencyIso4217Code(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
            int i2 = values + 9;
            AFKeystoreWrapper = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        aFf1cSDK.AFInAppEventType.getMonetizationNetwork(aFa1mSDK.getMonetizationNetwork());
        aFa1mSDK.getMonetizationNetwork().remove("ivc");
        String str = (String) AFb1rSDK.getRevenue(new Object[0], 510568030, -510568022, (int) System.currentTimeMillis());
        if (str != null) {
            int i4 = values + 5;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
            aFa1mSDK.getMediationNetwork("appUserId", str);
        }
        try {
            aFa1mSDK.getMediationNetwork("model", Build.MODEL);
            Object[] objArr2 = new Object[1];
            a(true, "\u0000\u0000\u0001\u0001\u0000", new int[]{0, 5, 0, 5}, objArr2);
            aFa1mSDK.getMediationNetwork(((String) objArr2[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            aFa1mSDK.getMediationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        AFb1tSDK b_ = AFb1uSDK.b_(context.getContentResolver());
        if (b_ != null) {
            int i6 = values + 77;
            AFKeystoreWrapper = i6 % 128;
            if (i6 % 2 != 0) {
                aFa1mSDK.getMediationNetwork("amazon_aid", b_.getMediationNetwork);
                aFa1mSDK.getMediationNetwork("amazon_aid_limit", String.valueOf(b_.getMonetizationNetwork));
                throw null;
            }
            aFa1mSDK.getMediationNetwork("amazon_aid", b_.getMediationNetwork);
            aFa1mSDK.getMediationNetwork("amazon_aid_limit", String.valueOf(b_.getMonetizationNetwork));
        }
        aFa1mSDK.getMediationNetwork("devkey", ((AFf1pSDK) aFf1cSDK).component4.component2);
        aFa1mSDK.getMediationNetwork("uid", AFb1mSDK.getMediationNetwork(aFf1cSDK.copy, ((AFf1gSDK) aFf1cSDK).equals));
        aFa1mSDK.getMediationNetwork("af_gcm_token", aFf1cSDK.toString);
        aFa1mSDK.getMediationNetwork("launch_counter", Integer.toString(((AFf1gSDK) aFf1cSDK).equals.AFAdRevenueData("appsFlyerCount", 0)));
        aFa1mSDK.getMediationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String areAllFieldsValid = aFf1cSDK.copydefault.areAllFieldsValid();
        if (areAllFieldsValid != null) {
            aFa1mSDK.getMediationNetwork(AppsFlyerProperties.CHANNEL, areAllFieldsValid);
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    protected final void getRevenue(AFa1mSDK aFa1mSDK) {
        int i = 2 % 2;
        int i2 = values + 9;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        String currencyIso4217Code = this.copydefault.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            int i4 = AFKeystoreWrapper + 67;
            values = i4 % 128;
            if (i4 % 2 == 0) {
                aFa1mSDK.getMediationNetwork("advertiserId", currencyIso4217Code);
                int i5 = 94 / 0;
            } else {
                aFa1mSDK.getMediationNetwork("advertiserId", currencyIso4217Code);
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1gSDK, com.appsflyer.internal.AFf1pSDK
    protected final boolean copydefault() {
        int i = 2 % 2;
        int i2 = values + 13;
        AFKeystoreWrapper = i2 % 128;
        return i2 % 2 != 0;
    }

    private void copy() {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 13;
        values = i2 % 128;
        int i3 = i2 % 2;
        ((AFf1gSDK) this).equals.getMediationNetwork("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        int i4 = values + 125;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    protected final void getMediationNetwork(AFa1mSDK aFa1mSDK) {
        int i = 2 % 2;
        int i2 = values + 91;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    protected final void getCurrencyIso4217Code(AFa1mSDK aFa1mSDK) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 103;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    protected final void AFAdRevenueData(AFa1mSDK aFa1mSDK) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 7;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(boolean z, String str, int[] iArr, Object[] objArr) {
        int i;
        char[] cArr;
        char c;
        String str2 = str;
        int i2 = 2 % 2;
        int i3 = $10 + 35;
        int i4 = i3 % 128;
        $11 = i4;
        int i5 = i3 % 2;
        byte[] bArr = str2;
        if (str2 != null) {
            int i6 = i4 + 121;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        int i8 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        char[] cArr2 = AFInAppEventParameterName;
        if (cArr2 != null) {
            int i12 = $11 + 121;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                cArr3[i14] = (char) (cArr2[i14] ^ (-474294719783433008L));
                i14++;
                int i15 = $11 + 81;
                $10 = i15 % 128;
                int i16 = i15 % 2;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i9];
        System.arraycopy(cArr2, i8, cArr4, 0, i9);
        if (bArr2 != null) {
            int i17 = $10 + 89;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr = new char[i9];
                aFk1mSDK.getMonetizationNetwork = 1;
                c = 1;
            } else {
                cArr = new char[i9];
                aFk1mSDK.getMonetizationNetwork = 0;
                c = 0;
            }
            while (aFk1mSDK.getMonetizationNetwork < i9) {
                int i18 = $11 + 89;
                $10 = i18 % 128;
                if (i18 % 2 == 0 ? bArr2[aFk1mSDK.getMonetizationNetwork] != 1 : bArr2[aFk1mSDK.getMonetizationNetwork] != 0) {
                    cArr[aFk1mSDK.getMonetizationNetwork] = (char) ((cArr4[aFk1mSDK.getMonetizationNetwork] * 2) - c);
                } else {
                    cArr[aFk1mSDK.getMonetizationNetwork] = (char) (((cArr4[aFk1mSDK.getMonetizationNetwork] * 2) + 1) - c);
                }
                c = cArr[aFk1mSDK.getMonetizationNetwork];
                aFk1mSDK.getMonetizationNetwork++;
            }
            cArr4 = cArr;
        }
        if (i11 > 0) {
            char[] cArr5 = new char[i9];
            System.arraycopy(cArr4, 0, cArr5, 0, i9);
            int i19 = i9 - i11;
            System.arraycopy(cArr5, 0, cArr4, i19, i11);
            System.arraycopy(cArr5, i11, cArr4, 0, i19);
        }
        if (z) {
            char[] cArr6 = new char[i9];
            aFk1mSDK.getMonetizationNetwork = 0;
            while (aFk1mSDK.getMonetizationNetwork < i9) {
                cArr6[aFk1mSDK.getMonetizationNetwork] = cArr4[(i9 - aFk1mSDK.getMonetizationNetwork) - 1];
                aFk1mSDK.getMonetizationNetwork++;
            }
            cArr4 = cArr6;
        }
        if (i10 > 0) {
            aFk1mSDK.getMonetizationNetwork = 0;
            while (aFk1mSDK.getMonetizationNetwork < i9) {
                int i20 = $11 + 85;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr4[aFk1mSDK.getMonetizationNetwork] = (char) (cArr4[aFk1mSDK.getMonetizationNetwork] % iArr[5]);
                    i = aFk1mSDK.getMonetizationNetwork;
                } else {
                    cArr4[aFk1mSDK.getMonetizationNetwork] = (char) (cArr4[aFk1mSDK.getMonetizationNetwork] - iArr[2]);
                    i = aFk1mSDK.getMonetizationNetwork + 1;
                }
                aFk1mSDK.getMonetizationNetwork = i;
            }
        }
        String str3 = new String(cArr4);
        int i21 = $11 + 41;
        $10 = i21 % 128;
        int i22 = i21 % 2;
        objArr[0] = str3;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    protected final void getMonetizationNetwork(AFa1mSDK aFa1mSDK) {
        getCurrencyIso4217Code(new Object[]{this, aFa1mSDK}, -1620486768, 1620486768, System.identityHashCode(this));
    }
}
