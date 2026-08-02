package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryReward;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.sdk.Ogury;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bz extends be {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1188 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1189 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f1190 = 60521;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1191 = 53162;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1192 = 72;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1193 = 48456;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f1194 = 9667;

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6929(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i = 2 % 2;
        int i2 = f1189 + 17;
        f1188 = i2 % 128;
        int i3 = i2 % 2;
        m6926(oguryInterstitialAd, oguryInterstitialAdListener);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6930(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i = 2 % 2;
        int i2 = f1188 + 51;
        f1189 = i2 % 128;
        int i3 = i2 % 2;
        m6928(oguryRewardedAd, oguryRewardedAdListener);
        int i4 = f1188 + 71;
        f1189 = i4 % 128;
        int i5 = i4 % 2;
    }

    public bz(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        if (r9.equals(m6927(5 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), false, 177 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u000f￥�\u000b\b", 1 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)).intern()) != false) goto L31;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Class mo6356(String str) {
        char c = 2;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -1704786309:
                if (str.equals(m6927(19 - ExpandableListView.getPackedPositionChild(0L), true, TextUtils.lastIndexOf("", '0', 0) + 179, "\uffff\n\uffff\n\t\b\ufffb\n\u0004\uffdf\u000f\n\uffff\f\uffff\n\ufff9ￗ\u0002\ufff7", 10 - View.resolveSize(0, 0)).intern())) {
                    int i2 = f1188 + 59;
                    f1189 = i2 % 128;
                    int i3 = i2 % 2;
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -734879533:
                if (str.equals(m6925("\ud7c9ꦄ嚧ԋﲡ뛺럵塴矯嘐\udb5c텗", (ViewConfiguration.getPressedStateDuration() >> 16) + 11).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 76142724:
                break;
            case 82913255:
                if (str.equals(m6925("\ud7c9ꦄ嚧ԋ\uf5dd➈䉤ᯩ䅩\udd7e曰⣇߀킾칤厫ᨑ緞㿃꩝ⲱᵼ\udc27挝ᓐ돳\ue391쾔", 27 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 186993737:
                if (str.equals(m6925("\ud7c9ꦄ嚧ԋﲡ뛺럵塴矯嘐첾쩴潊♶㿃꩝ⲱᵼ\udc27挝ᓐ돳\ue391쾔", 23 - View.resolveSize(0, 0)).intern())) {
                    int i4 = f1189 + 39;
                    f1188 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1169123445:
                if (str.equals(m6927(14 - ExpandableListView.getPackedPositionChild(0L), false, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + TsExtractor.TS_STREAM_TYPE_AC4, "\u0011\u000e\u0015￮\u0001\u0013�\u000e\u0000\u0001\u0000\uffdd\u0000￫\u0003", (Process.myPid() >> 22) + 13).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1789379091:
                if (str.equals(m6925("\ud7c9ꦄ嚧ԋ\uf5dd➈䉤ᯩ䅩\udd7e曰⣇߀킾칤厫ᨑ緞\udb5c텗", TextUtils.indexOf("", "") + 19).intern())) {
                    int i6 = f1189 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                    f1188 = i6 % 128;
                    int i7 = i6 % 2;
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1866202823:
                if (str.equals(m6925("㈯\udd6d֯㞷\ue08a\uf36b嚧ԋ砌ᰄ軔ೆ\uf171筝䉤ᯩ䅩\udd7e曰⣇߀킾칤厫\u0dcb甄돐ᅁ勞녮䉤ᯩ䅩\udd7e曰⣇߀킾칤厫ᨑ緞ऌ買અ鞘߀킾㺏蔜", Gravity.getAbsoluteGravity(0, 0) + 49).intern())) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return InterstitialActivity.class;
            case 2:
                return Ogury.class;
            case 3:
                return OguryInterstitialAd.class;
            case 4:
                return OguryInterstitialAdListener.class;
            case 5:
                return OguryRewardedAd.class;
            case 6:
                return OguryRewardedAdListener.class;
            case 7:
                return OguryReward.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6927(Gravity.getAbsoluteGravity(0, 0) + 25, true, Process.getGidForName("") + 177, "\u0001\f\u0001\f\u000b\n�\f\u0006￡\f�\u000b\n�\u0006�\f\u000b\u0001￤￼\uffd9\u0004\ufff9", 14 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bz.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bz.m6929((OguryInterstitialAd) list.get(0), (OguryInterstitialAdListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6925("礸䭎\uf557䧒럵塴矯嘐첾쩴潊♶㿃꩝ⲱᵼ\udc27挝ᓐ돳\ue391쾔", 20 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bz.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bz.m6930((OguryRewardedAd) list.get(0), (OguryRewardedAdListener) list.get(1));
                return null;
            }
        });
        int i2 = f1189 + 93;
        f1188 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f1188 + 7;
        f1189 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                return Ogury.getSdkVersion();
            }
            int i3 = 27 / 0;
            return Ogury.getSdkVersion();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m6926(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i = 2 % 2;
        int i2 = f1189 + 111;
        f1188 = i2 % 128;
        int i3 = i2 % 2;
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        int i4 = f1189 + 95;
        f1188 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m6928(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i = 2 % 2;
        int i2 = f1189 + 35;
        f1188 = i2 % 128;
        int i3 = i2 % 2;
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        int i4 = f1188 + 105;
        f1189 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6925(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (o.f3094) {
            char[] cArr3 = new char[cArr2.length];
            o.f3095 = 0;
            char[] cArr4 = new char[2];
            while (o.f3095 < cArr2.length) {
                cArr4[0] = cArr2[o.f3095];
                cArr4[1] = cArr2[o.f3095 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1193)) ^ ((c2 >>> 5) + f1190)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f1191) ^ ((c3 + i2) ^ ((c3 << 4) + f1194))));
                    i2 -= 40503;
                }
                cArr3[o.f3095] = cArr4[0];
                cArr3[o.f3095 + 1] = cArr4[1];
                o.f3095 += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        return str2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6927(int i, boolean z, int i2, String str, int i3) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (d.f1644) {
            char[] cArr3 = new char[i];
            d.f1641 = 0;
            while (d.f1641 < i) {
                d.f1643 = cArr2[d.f1641];
                cArr3[d.f1641] = (char) (d.f1643 + i2);
                int i4 = d.f1641;
                cArr3[i4] = (char) (cArr3[i4] - f1192);
                d.f1641++;
            }
            if (i3 > 0) {
                d.f1642 = i3;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - d.f1642, d.f1642);
                System.arraycopy(cArr4, d.f1642, cArr3, 0, i - d.f1642);
            }
            if (z) {
                char[] cArr5 = new char[i];
                d.f1641 = 0;
                while (d.f1641 < i) {
                    cArr5[d.f1641] = cArr3[(i - d.f1641) - 1];
                    d.f1641++;
                }
                cArr3 = cArr5;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
