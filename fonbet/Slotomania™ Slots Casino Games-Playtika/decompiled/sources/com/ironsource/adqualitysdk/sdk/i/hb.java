package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ogury.ad.OguryReward;
import com.vungle.ads.internal.protos.Sdk;
import io.presage.Presage;

/* loaded from: classes6.dex */
public final class hb extends gt {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2296 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2297 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2298 = 1021201273010583983L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2297 + 97;
        f2296 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7826("阮ᚅ✋㐐䓉喓扂猭菠邧ꄳ븈컡\udf4b\uec1aﳅ\u0d98\u1a5f", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 61253).intern();
        int i4 = f2296 + 67;
        f2297 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2297 + 73;
        f2296 = i2 % 128;
        if (i2 % 2 == 0) {
            return Presage.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        ca caVar = new ca(mo7797());
        int i2 = f2297 + 101;
        f2296 = i2 % 128;
        int i3 = i2 % 2;
        return caVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2296 + 67;
        f2297 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7826("燎㥙磸롮ﮒ", Color.alpha(0) + 49297).intern();
        int i4 = f2296 + 113;
        f2297 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    public static class c extends gt {

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2299 = 0;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int[] f2300 = {613899058, 736598471, 1685532302, -2018251823, -1394368088, -384622278, 1198269136, 1115358555, 2104447363, -1367856471, -992554156, 664323006, -1615250304, 382556556, 224390355, -1640216454, 1235994535, 2103147639};

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2301 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final String mo7798() {
            int i = 2 % 2;
            int i2 = f2301 + 65;
            f2299 = i2 % 128;
            int i3 = i2 % 2;
            String intern = m7827(new int[]{-722803283, 1170085808, -2049172311, -1570589974, -340963459, -1787947113, 1416292450, -2142785801, -1632575675, -1283863287, -87228372, 188780785}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24).intern();
            int i4 = f2301 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f2299 = i4 % 128;
            int i5 = i4 % 2;
            return intern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻐ */
        public final Class mo7796() {
            int i = 2 % 2;
            int i2 = f2299;
            int i3 = i2 + 29;
            f2301 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f2301 = i5 % 128;
            int i6 = i5 % 2;
            return OguryReward.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﾇ */
        public final be mo7799() {
            int i = 2 % 2;
            bz bzVar = new bz(mo7797());
            int i2 = f2299 + 63;
            f2301 = i2 % 128;
            int i3 = i2 % 2;
            return bzVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻛ */
        public final String mo7797() {
            int i = 2 % 2;
            int i2 = f2299 + 53;
            f2301 = i2 % 128;
            return (i2 % 2 == 0 ? m7827(new int[]{-2049172311, -1570589974, 1127563871, -1076490597}, 3 >> TextUtils.indexOf((CharSequence) "", (char) 29, 0)) : m7827(new int[]{-2049172311, -1570589974, 1127563871, -1076490597}, 4 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern();
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m7827(int[] iArr, int i) {
            String str;
            synchronized (a.f86) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2300.clone();
                a.f83 = 0;
                while (a.f83 < iArr.length) {
                    cArr[0] = (char) (iArr[a.f83] >> 16);
                    cArr[1] = (char) iArr[a.f83];
                    cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                    cArr[3] = (char) iArr[a.f83 + 1];
                    a.f84 = (cArr[0] << 16) + cArr[1];
                    a.f85 = (cArr[2] << 16) + cArr[3];
                    a.m5773(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = a.f84 ^ iArr2[i2];
                        a.f84 = i3;
                        a.f85 = a.m5774(i3) ^ a.f85;
                        int i4 = a.f84;
                        a.f84 = a.f85;
                        a.f85 = i4;
                    }
                    int i5 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i5;
                    a.f85 = i5 ^ iArr2[16];
                    a.f84 ^= iArr2[17];
                    int i6 = a.f84;
                    int i7 = a.f85;
                    cArr[0] = (char) (a.f84 >>> 16);
                    cArr[1] = (char) a.f84;
                    cArr[2] = (char) (a.f85 >>> 16);
                    cArr[3] = (char) a.f85;
                    a.m5773(iArr2);
                    cArr2[a.f83 << 1] = cArr[0];
                    cArr2[(a.f83 << 1) + 1] = cArr[1];
                    cArr2[(a.f83 << 1) + 2] = cArr[2];
                    cArr2[(a.f83 << 1) + 3] = cArr[3];
                    a.f83 += 2;
                }
                str = new String(cArr2, 0, i);
            }
            return str;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7826(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (i.f2454) {
            i.f2455 = i;
            char[] cArr3 = new char[cArr2.length];
            i.f2453 = 0;
            while (i.f2453 < cArr2.length) {
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f2298);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
