package com.appsflyer.internal;

import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class AFg1zSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int areAllFieldsValid = 1;
    private static char[] getCurrencyIso4217Code;
    private static boolean getMediationNetwork;
    private static int getMonetizationNetwork;
    private static boolean getRevenue;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r8 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r8 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r5 = AFAdRevenueData(r5, r6, r7, r8);
        r6 = com.appsflyer.internal.AFg1zSDK.areAllFieldsValid + 79;
        com.appsflyer.internal.AFg1zSDK.getMonetizationNetwork = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFi1wSDK getMonetizationNetwork(AFi1ySDK aFi1ySDK, String str, String str2, String str3) {
        int i = 2 % 2;
        if (aFi1ySDK != null && str2 != null) {
            int i2 = getMonetizationNetwork + 27;
            areAllFieldsValid = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 90 / 0;
            }
        }
        return new AFi1wSDK(false, AFi1uSDK.INTERNAL_ERROR);
    }

    private static AFi1wSDK AFAdRevenueData(AFi1ySDK aFi1ySDK, String str, String str2, String str3) {
        String str4;
        if (str == null) {
            return new AFi1wSDK(aFi1ySDK.AFAdRevenueData == AFh1aSDK.DEFAULT, AFi1uSDK.NA);
        }
        Object[] objArr = new Object[1];
        a("\u008c\u0085\u0081\u0086\u0087\u0085\u008c\u0082\u008b\u0085\u0082\u0082\u0082\u0081\u0086\u0082\u0086\u0081\u008b\u0082\u008c\u0087\u008d\u0083\u0082\u0087\u008c\u0083\u0086\u0087\u0083\u0083\u008b\u0087\u0081\u0083\u008a\u0086\u0089\u0086\u0088\u0086\u0084\u0085\u0087\u0086\u0083\u0085\u0085\u0086\u0086\u0085\u0084\u0082\u0084\u0081\u0083\u0082\u0083\u0081\u0081\u0082\u0081\u0081", null, null, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFi1ySDK.AFAdRevenueData != AFh1aSDK.CUSTOM) {
            str4 = "";
            str3 = intern;
        } else {
            str4 = new StringBuilder(str2).reverse().toString();
        }
        boolean equals = getMediationNetwork(new StringBuilder(str3).reverse().toString(), aFi1ySDK.getMonetizationNetwork, "android", "v1", str4).equals(str);
        return new AFi1wSDK(equals, equals ? AFi1uSDK.SUCCESS : AFi1uSDK.FAILURE);
    }

    private static String getMediationNetwork(String str, String str2, String str3, String str4, String str5) {
        int i = 2 % 2;
        int i2 = getMonetizationNetwork + 71;
        areAllFieldsValid = i2 % 128;
        int i3 = i2 % 2;
        String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (currencyIso4217Code.length() >= 12) {
            return currencyIso4217Code.substring(0, 12);
        }
        int i4 = getMonetizationNetwork + 53;
        areAllFieldsValid = i4 % 128;
        int i5 = i4 % 2;
        return currencyIso4217Code;
    }

    private static void a(String str, String str2, int[] iArr, int i, Object[] objArr) {
        char[] cArr;
        int i2 = 2 % 2;
        char[] cArr2 = str2;
        if (str2 != null) {
            cArr2 = str2.toCharArray();
        }
        char[] cArr3 = cArr2;
        byte[] bArr = str;
        if (str != null) {
            int i3 = $11 + 11;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1uSDK aFk1uSDK = new AFk1uSDK();
        char[] cArr4 = getCurrencyIso4217Code;
        if (cArr4 != null) {
            int i5 = $11;
            int i6 = i5 + 51;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i8 = i5 + 13;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 73;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr5[i10] = (char) (cArr4[i10] ^ (-6776211671728551741L));
                    i10 %= 1;
                } else {
                    cArr5[i10] = (char) (cArr4[i10] ^ (-6776211671728551741L));
                    i10++;
                }
            }
            cArr4 = cArr5;
        }
        int i12 = (int) ((-6776211671728551741L) ^ AFAdRevenueData);
        if (getRevenue) {
            int i13 = $10 + 39;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                aFk1uSDK.getRevenue = bArr2.length;
                cArr = new char[aFk1uSDK.getRevenue];
                aFk1uSDK.getMonetizationNetwork = 1;
            } else {
                aFk1uSDK.getRevenue = bArr2.length;
                cArr = new char[aFk1uSDK.getRevenue];
                aFk1uSDK.getMonetizationNetwork = 0;
            }
            while (aFk1uSDK.getMonetizationNetwork < aFk1uSDK.getRevenue) {
                cArr[aFk1uSDK.getMonetizationNetwork] = (char) (cArr4[bArr2[(aFk1uSDK.getRevenue - 1) - aFk1uSDK.getMonetizationNetwork] + i] - i12);
                aFk1uSDK.getMonetizationNetwork++;
            }
            objArr[0] = new String(cArr);
            return;
        }
        if (!getMediationNetwork) {
            aFk1uSDK.getRevenue = iArr.length;
            char[] cArr6 = new char[aFk1uSDK.getRevenue];
            aFk1uSDK.getMonetizationNetwork = 0;
            while (aFk1uSDK.getMonetizationNetwork < aFk1uSDK.getRevenue) {
                cArr6[aFk1uSDK.getMonetizationNetwork] = (char) (cArr4[iArr[(aFk1uSDK.getRevenue - 1) - aFk1uSDK.getMonetizationNetwork] - i] - i12);
                aFk1uSDK.getMonetizationNetwork++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        aFk1uSDK.getRevenue = cArr3.length;
        char[] cArr7 = new char[aFk1uSDK.getRevenue];
        aFk1uSDK.getMonetizationNetwork = 0;
        while (aFk1uSDK.getMonetizationNetwork < aFk1uSDK.getRevenue) {
            int i14 = $11 + 45;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr7[aFk1uSDK.getMonetizationNetwork] = (char) (cArr4[cArr3[(aFk1uSDK.getRevenue - 1) - aFk1uSDK.getMonetizationNetwork] - i] - i12);
            aFk1uSDK.getMonetizationNetwork++;
        }
        objArr[0] = new String(cArr7);
    }

    static void getMediationNetwork() {
        getCurrencyIso4217Code = new char[]{34894, 34898, 34899, 34896, 34895, 34893, 34892, 34897, 34889, 34909, 34888, 34904, 34908};
        AFAdRevenueData = -272398183;
        getMediationNetwork = true;
        getRevenue = true;
    }

    static {
        getMediationNetwork();
        TextUtils.indexOf("", "", 0, 0);
        int i = areAllFieldsValid + 109;
        getMonetizationNetwork = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
