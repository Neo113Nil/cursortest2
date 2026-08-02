package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import io.ktor.util.date.GMTDateParser;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public final class kg {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f3004 = {136934295, 177149977, -228372702, -659920166, -2116254203, 420315150, -904234512, -287154276, -556082825, -1560858683, 1900107094, 1932430285, -283875828, -1995212670, 1926388147, 431039938, -1661346139, 1104805391};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3005 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3006 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m8386(String str) {
        int i = 2 % 2;
        try {
            Mac mac = Mac.getInstance(new String(new char[]{'H', GMTDateParser.MINUTES, 'a', 'c', 'S', 'H', 'A', '1'}));
            mac.init(new SecretKeySpec(m8385(new int[]{1806413626, 2068907337, -1047133191, 450663253, 324727625, -1875511098, -1461430813, -783151434, 558547077, -435842307, 1713514153, -1886234662, 91873295, 1353393094, -327895077, -2084091848, 842685020, 346743968}, 34 - (ViewConfiguration.getTapTimeout() >> 16)).intern().getBytes(m8385(new int[]{-1904779879, 1069825387, -1535093355, -525644514}, Color.rgb(0, 0, 0) + 16777221).intern()), mac.getAlgorithm()));
            String m8079 = il.m8079(mac.doFinal(str.replaceAll(m8385(new int[]{-1431299200, -509694227}, 1 - TextUtils.getOffsetAfter("", 0)).intern(), "").replaceAll(m8385(new int[]{356972264, 1318647050}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), "").getBytes(m8385(new int[]{-1904779879, 1069825387, -1535093355, -525644514}, TextUtils.getOffsetBefore("", 0) + 5).intern())));
            int i2 = f3006 + 45;
            f3005 = i2 % 128;
            int i3 = i2 % 2;
            return m8079;
        } catch (Exception e) {
            m.m8527(m8385(new int[]{-226393848, 1944085175, -1212036742, -350792545, 1842113100, -455419861}, View.MeasureSpec.makeMeasureSpec(0, 0) + 9).intern(), new StringBuilder().append(m8385(new int[]{621687716, -546043472, -847725700, -405194691}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7).intern()).append(e.getLocalizedMessage()).toString());
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m8385(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f3004.clone();
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
