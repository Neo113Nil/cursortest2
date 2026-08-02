package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.moloco.sdk.internal.services.init.i;

/* loaded from: classes3.dex */
public final class AFf1oSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getCurrencyIso4217Code = 1;
    private static int getMediationNetwork;
    private static char[] getMonetizationNetwork;
    private static long getRevenue;

    public final AFh1aSDK getMediationNetwork(AFi1zSDK aFi1zSDK, String str, String str2, String str3) {
        int i = 2 % 2;
        if (aFi1zSDK != null) {
            int i2 = getCurrencyIso4217Code + 53;
            int i3 = i2 % 128;
            getMediationNetwork = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (str2 != null && str3 != null) {
                int i4 = i3 + 61;
                getCurrencyIso4217Code = i4 % 128;
                int i5 = i4 % 2;
                AFh1aSDK monetizationNetwork = getMonetizationNetwork(aFi1zSDK, str, str2, str3);
                int i6 = getMediationNetwork + 111;
                getCurrencyIso4217Code = i6 % 128;
                if (i6 % 2 != 0) {
                    return monetizationNetwork;
                }
                throw null;
            }
        }
        return new AFh1aSDK(false, AFh1dSDK.INTERNAL_ERROR);
    }

    private static AFh1aSDK getMonetizationNetwork(AFi1zSDK aFi1zSDK, String str, String str2, String str3) {
        String str4;
        if (str == null) {
            return new AFh1aSDK(aFi1zSDK.getMonetizationNetwork == AFh1fSDK.DEFAULT, AFh1dSDK.NA);
        }
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.getMode(0), (char) (12523 - (ViewConfiguration.getPressedStateDuration() >> 16)), ExpandableListView.getPackedPositionType(0L) + 64, objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFi1zSDK.getMonetizationNetwork != AFh1fSDK.CUSTOM) {
            str4 = "";
            str3 = intern;
        } else {
            str4 = new StringBuilder(str2).reverse().toString();
        }
        boolean equals = AFAdRevenueData(new StringBuilder(str3).reverse().toString(), aFi1zSDK.getMediationNetwork, "android", i.a, str4).equals(str);
        return new AFh1aSDK(equals, equals ? AFh1dSDK.SUCCESS : AFh1dSDK.FAILURE);
    }

    private static void a(int i, char c, int i2, Object[] objArr) {
        int i3 = 2 % 2;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        long[] jArr = new long[i2];
        aFk1mSDK.AFAdRevenueData = 0;
        int i4 = $11 + 63;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (aFk1mSDK.AFAdRevenueData < i2) {
            int i6 = $11 + 83;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            jArr[aFk1mSDK.AFAdRevenueData] = (((char) (getMonetizationNetwork[aFk1mSDK.AFAdRevenueData + i] ^ (-3187824009837971604L))) ^ (aFk1mSDK.AFAdRevenueData * ((-3187824009837971604L) ^ getRevenue))) ^ c;
            aFk1mSDK.AFAdRevenueData++;
        }
        char[] cArr = new char[i2];
        aFk1mSDK.AFAdRevenueData = 0;
        int i8 = $10 + 61;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (aFk1mSDK.AFAdRevenueData < i2) {
            cArr[aFk1mSDK.AFAdRevenueData] = (char) jArr[aFk1mSDK.AFAdRevenueData];
            aFk1mSDK.AFAdRevenueData++;
        }
        objArr[0] = new String(cArr);
    }

    private static String AFAdRevenueData(String str, String str2, String str3, String str4, String str5) {
        int i = 2 % 2;
        int i2 = getCurrencyIso4217Code + 95;
        getMediationNetwork = i2 % 128;
        int i3 = i2 % 2;
        String AFAdRevenueData = AFj1hSDK.AFAdRevenueData(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (AFAdRevenueData.length() < 12) {
            return AFAdRevenueData;
        }
        String substring = AFAdRevenueData.substring(0, 12);
        int i4 = getMediationNetwork + 75;
        getCurrencyIso4217Code = i4 % 128;
        int i5 = i4 % 2;
        return substring;
    }

    static void getCurrencyIso4217Code() {
        getMonetizationNetwork = new char[]{18356, 58508, 448, 44572, 52052, 30633, 38112, 12601, 24180, 64326, 10112, 17622, 57621, 3691, 43683, 55293, 29749, 37129, 15939, 23194, 34773, 9254, 16739, 60855, 2803, 47055, 54275, 28971, 40337, 15084, 26402, 33918, 8369, 19849, 60098, 5915, 46161, 53470, 32226, 39480, 51057, 25658, 32898, 11694, 18960, 63342, 5028, 45307, 56624, 31243, 42820, 50072, 24784, 36136, 10853, 22206, 62448, 4286, 48389, 55898, 1683, 41964, 49189, 27918};
        getRevenue = 7457024925369750612L;
    }

    static {
        getCurrencyIso4217Code();
        ViewConfiguration.getPressedStateDuration();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.getCapsMode("", 0, 0);
        int i = getCurrencyIso4217Code + 97;
        getMediationNetwork = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
