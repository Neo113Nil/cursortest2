package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.MyTargetView;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.BaseAd;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetActivity;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.AudioData;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class bx extends be {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1130 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1133 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f1132 = {689601762, -1277100120, -281143982, -1156504622, 238593772, -198375059, 1013839357, 1589690308, 2120731109, 946026255, 760377391, 795206931, 1653368566, -673882726, -1705730843, 1529726615, -1702140236, 1916411391};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1129 = {'^', 39579, 13802, 53262, 27456, 1415, 41092, 15148, 54803, 28835, 2978, 42665, 16863, 56108, 29768, 37286, 11004, 17430, 57693, 31383, 38891, 12558, 18976, 59254, Typography.degree, 40416, 14084, 20546, 'c', 39592, 13795, 53371, 27505, 1434, 41092, 15109, 54873, 28813, 2977, 42728, 16672, 56373, 30337, 4550, 44061, 18266, 57745, 31915, 6050, 45598, 19811, 59317, 33481, 7453, 47185, 21144, 60848, 35018, 9009, 48749, 22665, 62417, 36359, 10561, 50053, 'A', 39588, 13818, 53308, 27498, 1418, 41182, 15112, 54909, 28817, 2977, 42724, 16698, 56446, 16827, 56159, 29700, 37321, 10916, 17534, 59595, 29235, 56695, 14509, 33774, 60730, 18518, 54168, 16068, 42756, 15844, 37559, 30589, 52259, 41693, 1939, 40021, 28929, 55259, 44266, 428, 58968, 31538, 23389, 49580, 28387, 35647, 12397, 24208, 64484, 24590, 36180, 11136, 20661, 64992, 'g', 39586, 13818, 53255, 27513, 1428, 41163, 15107, 54876, 28843, 3007, 42749, 16689};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f1131 = 8810574367127935687L;

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6842(Reward reward) {
        int i = 2 % 2;
        int i2 = f1130 + 47;
        f1133 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m6843(reward);
            throw null;
        }
        String m6843 = m6843(reward);
        int i3 = f1130 + 99;
        f1133 = i3 % 128;
        if (i3 % 2 != 0) {
            return m6843;
        }
        super.hashCode();
        throw null;
    }

    public bx(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f1130 + 55;
        f1133 = i2 % 128;
        Object obj = null;
        try {
            try {
                String str = (String) (i2 % 2 == 0 ? MyTargetVersion.class.getDeclaredField(m6844(new int[]{1474588934, 1582562142, -1585304736, 730377449}, 67 << (Process.myPid() - 20)).intern()) : MyTargetVersion.class.getDeclaredField(m6844(new int[]{1474588934, 1582562142, -1585304736, 730377449}, (Process.myPid() >> 22) + 7).intern())).get(null);
                int i3 = f1133 + 13;
                f1130 = i3 % 128;
                if (i3 % 2 == 0) {
                    return str;
                }
                super.hashCode();
                throw null;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return id.m7937().m7939().m8046(MyTargetVersion.class, m6841((char) View.getDefaultSize(0, 0), Color.green(0), 12 - Gravity.getAbsoluteGravity(0, 0)).intern());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02ae, code lost:
    
        if (r15.equals(m6844(new int[]{-10492910, -1238144348, -1828223440, 1707645211, -772946493, 1272819193, -1499716068, -1522152396}, (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 14).intern()) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02f2, code lost:
    
        if (r15.equals(m6844(new int[]{-317800345, -1152835345, 94707775, 378420810, 752317342, 2067299973}, 9 - android.view.Gravity.getAbsoluteGravity(0, 0)).intern()) != false) goto L72;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Class mo6356(String str) {
        char c = 2;
        int i = 2 % 2;
        int i2 = f1133 + 61;
        f1130 = i2 % 128;
        int i3 = i2 % 2;
        char c2 = 1;
        switch (str.hashCode()) {
            case -2103294848:
                c2 = '\t';
                break;
            case -1850459313:
                if (str.equals(m6844(new int[]{-153319598, 1658343455, -1541621282, -2143702998}, 6 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1766129765:
                break;
            case -1282477456:
                if (str.equals(m6844(new int[]{-10492910, -1238144348, -1828223440, 1707645211, -2092440046, 233855287, -934867188, 2116826225}, 15 - Color.blue(0)).intern())) {
                    int i4 = f1133 + 69;
                    f1130 = i4 % 128;
                    int i5 = i4 % 2;
                    c = c2;
                    break;
                }
                c = 65535;
                break;
            case -958537051:
                if (str.equals(m6841((char) (59550 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 85 - Color.alpha(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (str.equals(m6844(new int[]{-153319598, 1658343455, 354582153, 1037562381, -1366016672, 842694264}, 10 - View.getDefaultSize(0, 0)).intern())) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -498709917:
                if (str.equals(m6844(new int[]{2115787400, 710096637, 454003386, -143888625, -291411254, 1033769524, 204648814, 1085899693, -474109877, -652852596, 254797340, 1047664225}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22).intern())) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -393802555:
                if (str.equals(m6844(new int[]{-153319598, 1658343455, 354582153, 1037562381, 204648814, 1085899693, -474109877, -652852596, 254797340, 1047664225}, (KeyEvent.getMaxKeyCode() >> 16) + 18).intern())) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 65555862:
                if (str.equals(m6844(new int[]{-10492910, -1238144348, -1828223440, 1707645211, 2105397609, -1609780875, -1276589018, 1154658745, 1256080549, -771916619}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 21).intern())) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(m6841((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 42830), ((byte) KeyEvent.getModifierMetaStateMask()) + 95, KeyEvent.normalizeMetaState(0) + 14).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 421929408:
                if (str.equals(m6844(new int[]{753093367, -472953115, 2115787400, 710096637, 454003386, -143888625, -291411254, 1033769524, -1366016672, 842694264}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 448638071:
                if (str.equals(m6841((char) (Color.green(0) + 23326), ImageFormat.getBitsPerPixel(0) + 109, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 487251537:
                if (str.equals(m6841((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 65 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                    int i6 = f1133 + 15;
                    f1130 = i6 % 128;
                    if (i6 % 2 == 0) {
                        c = 5;
                        break;
                    }
                }
                c = 65535;
                break;
            case 544598087:
                if (str.equals(m6841((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Color.red(0) + 28, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37).intern())) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1125320581:
                if (str.equals(m6844(new int[]{1397497268, 1019934822, 821784069, 1566051368, 752317342, 2067299973}, ImageFormat.getBitsPerPixel(0) + 10).intern())) {
                    int i7 = f1133 + 91;
                    f1130 = i7 % 128;
                    if (i7 % 2 == 0) {
                        c = '\b';
                        break;
                    } else {
                        c = '\\';
                        break;
                    }
                }
                c = 65535;
                break;
            case 1146816194:
                if (str.equals(m6844(new int[]{-10492910, -1238144348, -1828223440, 1707645211, 2105397609, -1609780875}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11).intern())) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1413638316:
                if (str.equals(m6841((char) (16786 - (ViewConfiguration.getEdgeSlop() >> 16)), 12 - ((Process.getThreadPriority(0) + 20) >> 6), 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1955824356:
                if (str.equals(m6844(new int[]{-1464044265, -1198341345, 1630936190, 1511848414}, 6 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1982630644:
                if (str.equals(m6841((char) ((-16760327) - Color.rgb(0, 0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 79, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6).intern())) {
                    int i8 = f1133 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                    f1130 = i8 % 128;
                    int i9 = i8 % 2;
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2040577055:
                if (str.equals(m6844(new int[]{-10492910, -1238144348, -1828223440, 1707645211, -630535255, -547522206, 196906593, 1689111315}, 14 - Color.alpha(0)).intern())) {
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
                return MyTargetConfig.class;
            case 1:
                return MyTargetManager.class;
            case 2:
                return MyTargetVersion.class;
            case 3:
            case 4:
                return MyTargetActivity.class;
            case 5:
                return MyTargetActivity.ActivityEngine.class;
            case 6:
                return BaseAd.class;
            case 7:
                return VideoData.class;
            case '\b':
                return ImageData.class;
            case '\t':
                return AudioData.class;
            case '\n':
                return BaseInterstitialAd.class;
            case 11:
                return InterstitialAd.class;
            case '\f':
                return InterstitialAd.InterstitialAdListener.class;
            case '\r':
                return Reward.class;
            case 14:
                return RewardedAd.class;
            case 15:
                return RewardedAd.RewardedAdListener.class;
            case 16:
                return CustomParams.class;
            case 17:
                return MyTargetView.class;
            case 18:
                return MyTargetView.AdSize.class;
            case 19:
                return MyTargetView.MyTargetViewListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6841((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 120 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 13).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bx.m6842((Reward) list.get(0));
            }
        });
        int i2 = f1133 + 3;
        f1130 = i2 % 128;
        if (i2 % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6843(Reward reward) {
        int i = 2 % 2;
        int i2 = f1133 + 111;
        f1130 = i2 % 128;
        int i3 = i2 % 2;
        String str = reward.type;
        int i4 = f1130 + 57;
        f1133 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m6844(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1132.clone();
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

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6841(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f1129[c.f1198 + i] ^ (c.f1198 * f1131)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
