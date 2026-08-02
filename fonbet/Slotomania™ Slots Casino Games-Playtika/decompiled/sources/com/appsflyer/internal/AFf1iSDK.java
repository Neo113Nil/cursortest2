package com.appsflyer.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1lSDK;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class AFf1iSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 586908573;
    private static int component4 = -2033323395;
    private static byte[] copy = {-101, -126, 109, -103, -116, -106, -102, -107, -75, -111, -123, -107};
    private static short[] copydefault = null;
    private static int equals = 1;
    private static int hashCode = 0;
    private static int toString = 1998795834;
    private final AFf1lSDK AFAdRevenueData;
    private volatile String areAllFieldsValid;
    private volatile String component2;
    private final AFc1hSDK getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;
    private long getRevenue;
    private boolean getMonetizationNetwork = false;
    private volatile boolean component3 = false;

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i * 491) + (i2 * (-489));
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = i4 + ((i5 | i6 | (~i3)) * (-490)) + (((~(i | i6)) | (~(i6 | i3))) * 490) + (i5 * 490);
        return i7 != 1 ? i7 != 2 ? getMonetizationNetwork(objArr) : getCurrencyIso4217Code(objArr) : getMediationNetwork(objArr);
    }

    public AFf1iSDK(AFc1hSDK aFc1hSDK, AFf1lSDK aFf1lSDK) {
        this.getCurrencyIso4217Code = aFc1hSDK;
        this.AFAdRevenueData = aFf1lSDK;
    }

    public final void getRevenue(String str) {
        int i = 2 % 2;
        int i2 = equals + 59;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        this.areAllFieldsValid = str;
        int i4 = equals + 29;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getRevenue() {
        int i = 2 % 2;
        int i2 = equals + 37;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        int i4 = hashCode + 45;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFf1iSDK aFf1iSDK = (AFf1iSDK) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = equals + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            aFf1iSDK.component2 = str;
            int i3 = 14 / 0;
        } else {
            aFf1iSDK.component2 = str;
        }
        int i4 = equals + 9;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final boolean getMediationNetwork() {
        int i = 2 % 2;
        int i2 = hashCode + 43;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.component3;
        int i3 = hashCode + 77;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 88 / 0;
        }
        return z;
    }

    public final void getRevenue(boolean z) {
        int i = 2 % 2;
        int i2 = hashCode + 73;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.component3 = z;
        int i4 = hashCode + 27;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = hashCode + 23;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String str = this.areAllFieldsValid;
        int i4 = equals + 79;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (getRevenue(r2) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        r2 = (android.telephony.TelephonyManager) r2.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        r1 = (java.lang.String) r2.getClass().getMethod("getDeviceId", new java.lang.Class[0]).invoke(r2, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("use cached IMEI: ".concat(java.lang.String.valueOf(r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (r7 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("use cached IMEI: ".concat(java.lang.String.valueOf(r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(new java.lang.StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ").append(r1.getMessage()).toString(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (r7 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("use cached IMEI: ".concat(java.lang.String.valueOf(r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(new java.lang.StringBuilder("WARNING: Can't collect IMEI: other reason: ").append(r1.getMessage()).toString(), r1);
        r0 = com.appsflyer.internal.AFf1iSDK.hashCode + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        com.appsflyer.internal.AFf1iSDK.equals = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0040, code lost:
    
        if (com.appsflyer.internal.AFj1eSDK.getCurrencyIso4217Code(r2.areAllFieldsValid) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (com.appsflyer.internal.AFj1eSDK.getCurrencyIso4217Code(r2.areAllFieldsValid) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        r2 = r2.getCurrencyIso4217Code.getMonetizationNetwork;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r2 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String str;
        AFf1iSDK aFf1iSDK = (AFf1iSDK) objArr[0];
        AFc1sSDK aFc1sSDK = (AFc1sSDK) objArr[1];
        int i = 2 % 2;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        Object obj = null;
        String AFAdRevenueData = aFc1sSDK.AFAdRevenueData("imeiCached", (String) null);
        if (z) {
            int i2 = hashCode + 105;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 30 / 0;
            }
            if (AFj1eSDK.getCurrencyIso4217Code(str)) {
                aFc1sSDK.getRevenue("imeiCached", str);
                return str;
            }
            AFLogger.afInfoLog("IMEI was not collected.");
            return null;
        }
        if (aFf1iSDK.areAllFieldsValid != null) {
            int i4 = hashCode + 37;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                String str2 = aFf1iSDK.areAllFieldsValid;
                obj.hashCode();
                throw null;
            }
            str = aFf1iSDK.areAllFieldsValid;
            if (AFj1eSDK.getCurrencyIso4217Code(str)) {
            }
        }
        str = null;
        if (AFj1eSDK.getCurrencyIso4217Code(str)) {
        }
        str = AFAdRevenueData;
        if (AFj1eSDK.getCurrencyIso4217Code(str)) {
        }
    }

    public final Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        int i = 2 % 2;
        AFc1jSDK aFc1jSDK = new AFc1jSDK(map, this.getCurrencyIso4217Code.getMonetizationNetwork);
        int i2 = hashCode + 39;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return aFc1jSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, Object> getRevenue(Map<String, Object> map) {
        int i = 2 % 2;
        try {
            try {
                Object[] objArr = {map, this.getCurrencyIso4217Code.getMonetizationNetwork};
                Object obj = AFa1gSDK.e.get(-2122095116);
                if (obj == null) {
                    obj = ((Class) AFa1gSDK.getMonetizationNetwork(TextUtils.getOffsetAfter("", 0) + 37, 123 - MotionEvent.axisFromString(""), (char) Gravity.getAbsoluteGravity(0, 0))).getDeclaredConstructor(Map.class, Context.class);
                    AFa1gSDK.e.put(-2122095116, obj);
                }
                Map<String, Object> map2 = (Map) ((Constructor) obj).newInstance(objArr);
                int i2 = equals + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                hashCode = i2 % 128;
                if (i2 % 2 == 0) {
                    return map2;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th2);
            return new HashMap();
        }
    }

    public static void getMonetizationNetwork(AFh1tSDK aFh1tSDK) {
        int i = 2 % 2;
        try {
            new AFb1sSDK(aFh1tSDK).afInfoLog();
            int i2 = equals + 99;
            hashCode = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        com.appsflyer.internal.AFc1kSDK.AFAdRevenueData();
        r13 = null;
        r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r14.getCurrencyIso4217Code = r1.substring(0, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (com.appsflyer.internal.AFj1eSDK.getCurrencyIso4217Code(r1) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (com.appsflyer.internal.AFj1eSDK.getCurrencyIso4217Code(r1) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        r1 = com.appsflyer.internal.AFf1iSDK.hashCode + 47;
        com.appsflyer.internal.AFf1iSDK.equals = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        r1 = com.appsflyer.internal.AFc1kSDK.AFAdRevenueData();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void getRevenue(Map<String, Object> map, AFc1kSDK aFc1kSDK) {
        String currencyIso4217Code;
        int i = 2 % 2;
        if (!(!AFj1eSDK.getCurrencyIso4217Code(aFc1kSDK.getCurrencyIso4217Code))) {
            int i2 = equals + 57;
            hashCode = i2 % 128;
            if (i2 % 2 != 0) {
                currencyIso4217Code = aFc1kSDK.getCurrencyIso4217Code("com.appsflyer.security.uuid");
                int i3 = 10 / 0;
            } else {
                currencyIso4217Code = aFc1kSDK.getCurrencyIso4217Code("com.appsflyer.security.uuid");
            }
        }
        String str = aFc1kSDK.getCurrencyIso4217Code;
        try {
            Object[] objArr = new Object[1];
            a((-1440266062) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1539935768 - View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (short) ((-11) - View.MeasureSpec.getMode(0)), objArr);
            long parseLong = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
            char[] charArray = str.toCharArray();
            int i4 = ((int) (parseLong % 94)) + 33;
            for (int i5 = 0; i5 < charArray.length; i5++) {
                int i6 = hashCode + 97;
                equals = i6 % 128;
                int i7 = i6 % 2;
                charArray[i5] = (char) (charArray[i5] ^ i4);
            }
            map.put("sbid", new String(charArray));
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "Exception occurred while generating sbid ", e);
        }
    }

    public final Map<String, Object> getCurrencyIso4217Code() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        if (!component4()) {
            if (this.getMonetizationNetwork) {
                this.getMediationNetwork = new HashMap();
                component2();
                this.getMediationNetwork.put("error", "pending LVL response");
                hashMap.put("lvl", this.getMediationNetwork);
            }
        } else {
            int i2 = hashCode + 5;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                hashMap.put("lvl", this.getMediationNetwork);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            hashMap.put("lvl", this.getMediationNetwork);
        }
        int i3 = equals + 47;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        return hashMap;
    }

    private boolean component4() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 37;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.getMediationNetwork;
        if (map != null) {
            int i5 = i2 + 115;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            if (!map.isEmpty()) {
                int i7 = equals + 31;
                hashCode = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
        }
        int i9 = hashCode + 79;
        equals = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public final boolean getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = hashCode + 45;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (!this.getMonetizationNetwork || component4()) {
            return false;
        }
        int i4 = equals + 21;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static void a(int i, int i2, int i3, byte b, short s, Object[] objArr) {
        boolean z;
        boolean z2;
        char c;
        int i4 = 2 % 2;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        StringBuilder sb = new StringBuilder();
        int i5 = i3 + ((int) (component1 ^ (-1123129136953719915L)));
        if (i5 == -1) {
            int i6 = $11 + 9;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr = copy;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i8 = 0; i8 < length; i8++) {
                    bArr2[i8] = (byte) (bArr[i8] ^ (-1123129136953719915L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i5 = (byte) (((byte) (copy[((int) (component4 ^ (-1123129136953719915L))) + i2] ^ (-1123129136953719915L))) + ((int) (component1 ^ (-1123129136953719915L))));
                int i9 = $11 + 73;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            } else {
                i5 = (short) (((short) (copydefault[((int) (component4 ^ (-1123129136953719915L))) + i2] ^ (-1123129136953719915L))) + ((int) (component1 ^ (-1123129136953719915L))));
            }
        }
        if (i5 > 0) {
            aFk1pSDK.getCurrencyIso4217Code = ((i2 + i5) - 2) + ((int) (component4 ^ (-1123129136953719915L))) + (!(z ^ true) ? 1 : 0);
            aFk1pSDK.AFAdRevenueData = (char) (i + ((int) (toString ^ (-1123129136953719915L))));
            sb.append(aFk1pSDK.AFAdRevenueData);
            aFk1pSDK.getMonetizationNetwork = aFk1pSDK.AFAdRevenueData;
            byte[] bArr3 = copy;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    bArr4[i11] = (byte) (bArr3[i11] ^ (-1123129136953719915L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i12 = $11 + 29;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            aFk1pSDK.getMediationNetwork = 1;
            while (aFk1pSDK.getMediationNetwork < i5) {
                int i14 = $10;
                int i15 = i14 + 23;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                if (!z2) {
                    short[] sArr = copydefault;
                    aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getCurrencyIso4217Code - 1;
                    aFk1pSDK.AFAdRevenueData = (char) (aFk1pSDK.getMonetizationNetwork + (((short) (((short) (sArr[r4] ^ (-1123129136953719915L))) + s)) ^ b));
                } else {
                    int i17 = i14 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        byte[] bArr5 = copy;
                        aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getCurrencyIso4217Code + 1;
                        c = (char) (aFk1pSDK.getMonetizationNetwork << (((byte) (((byte) (bArr5[r4] - (-1123129136953719915L))) >> s)) ^ b));
                    } else {
                        byte[] bArr6 = copy;
                        aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getCurrencyIso4217Code - 1;
                        c = (char) (aFk1pSDK.getMonetizationNetwork + (((byte) (((byte) (bArr6[r4] ^ (-1123129136953719915L))) + s)) ^ b));
                    }
                    aFk1pSDK.AFAdRevenueData = c;
                }
                sb.append(aFk1pSDK.AFAdRevenueData);
                aFk1pSDK.getMonetizationNetwork = aFk1pSDK.AFAdRevenueData;
                aFk1pSDK.getMediationNetwork++;
            }
        }
        objArr[0] = sb.toString();
    }

    public final void getCurrencyIso4217Code(AFc1kSDK aFc1kSDK) {
        int i = 2 % 2;
        this.getRevenue = System.currentTimeMillis();
        this.getMonetizationNetwork = this.AFAdRevenueData.AFAdRevenueData(getRevenue(aFc1kSDK), this.getCurrencyIso4217Code.getMonetizationNetwork, new AFf1lSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFf1iSDK.1
            @Override // com.appsflyer.internal.AFf1lSDK.AFa1vSDK
            public final void AFAdRevenueData(String str, String str2) {
                AFf1iSDK.this.getMediationNetwork = new ConcurrentHashMap();
                AFf1iSDK.this.getMediationNetwork.put("signedData", str);
                AFf1iSDK.this.getMediationNetwork.put(InAppPurchaseMetaData.KEY_SIGNATURE, str2);
                AFf1iSDK.this.component2();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFf1lSDK.AFa1vSDK
            public final void getMediationNetwork(String str, Exception exc) {
                AFf1iSDK.this.getMediationNetwork = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1iSDK.this.component2();
                AFf1iSDK.this.getMediationNetwork.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        int i2 = equals + 69;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 7 / 0;
        }
    }

    private long getRevenue(AFc1kSDK aFc1kSDK) {
        int i = 2 % 2;
        long monetizationNetwork = AFj1hSDK.getMonetizationNetwork(AFj1hSDK.getMediationNetwork(new StringBuilder().append(AFb1kSDK.getMonetizationNetwork(aFc1kSDK.getRevenue)).append(((Long) AFAdRevenueData(new Object[]{this}, -2122128656, 2122128657, System.identityHashCode(this))).longValue()).toString()));
        int i2 = hashCode + 111;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return monetizationNetwork;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1iSDK aFf1iSDK = (AFf1iSDK) objArr[0];
        int i = 2 % 2;
        int i2 = hashCode + 51;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.valueOf(aFf1iSDK.getRevenue);
        }
        long j = aFf1iSDK.getRevenue;
        throw null;
    }

    final void component2() {
        Map<String, Object> map;
        Object AFAdRevenueData;
        int i = 2 % 2;
        int i2 = hashCode + 79;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() ^ this.getRevenue));
            map = this.getMediationNetwork;
            AFAdRevenueData = AFAdRevenueData(new Object[]{this}, -2122128656, 2122128657, System.identityHashCode(this));
        } else {
            this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getRevenue));
            map = this.getMediationNetwork;
            AFAdRevenueData = AFAdRevenueData(new Object[]{this}, -2122128656, 2122128657, System.identityHashCode(this));
        }
        map.put("lvl_timestamp", Long.valueOf(((Long) AFAdRevenueData).longValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean getRevenue(Context context) {
        boolean z;
        int i = 2 % 2;
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            int i2 = hashCode + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            equals = i2 % 128;
            if (i2 % 2 != 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                z = false;
                if (!z) {
                    AFa1zSDK.getMonetizationNetwork();
                    if (AFa1zSDK.getMonetizationNetwork(context)) {
                        int i3 = hashCode + 15;
                        equals = i3 % 128;
                        int i4 = i3 % 2;
                        return false;
                    }
                }
                return true;
            }
        }
        z = true;
        if (!z) {
        }
        return true;
    }

    private long component3() {
        return ((Long) AFAdRevenueData(new Object[]{this}, -2122128656, 2122128657, System.identityHashCode(this))).longValue();
    }

    public final String getCurrencyIso4217Code(AFc1sSDK aFc1sSDK) {
        return (String) AFAdRevenueData(new Object[]{this, aFc1sSDK}, 527487030, -527487030, System.identityHashCode(this));
    }

    public final void AFAdRevenueData(String str) {
        AFAdRevenueData(new Object[]{this, str}, 99232209, -99232207, System.identityHashCode(this));
    }
}
