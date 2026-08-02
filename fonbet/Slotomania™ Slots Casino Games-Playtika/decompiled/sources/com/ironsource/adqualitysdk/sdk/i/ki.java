package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.VideoView;
import com.ironsource.adqualitysdk.sdk.i.hm;
import com.ironsource.adqualitysdk.sdk.i.hn;
import com.ironsource.adqualitysdk.sdk.i.ho;
import com.ironsource.adqualitysdk.sdk.i.hp;
import com.ironsource.adqualitysdk.sdk.i.hq;
import com.ironsource.adqualitysdk.sdk.i.ht;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class ki {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f3017 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f3018;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static Field f3021;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Field f3025;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Object f3026;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Field f3027;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Class f3028;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Field f3029;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int[] f3022 = {-1992325352, 1955015455, 517313671, 186703828, -727561490, -1177086777, 668105904, -565761342, 286158588, 1557318925, 486972505, 1423793213, 270630203, -1519595010, 130838156, 1539989123, -571200845, -582562086};

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f3020 = 58088;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f3024 = 41687;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static char f3019 = 52505;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f3023 = 2450;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ki.f3028 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ki.f3026 == null) goto L11;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<View> m8405() {
        int i = 2 % 2;
        int i2 = f3018 + 45;
        f3017 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                int i3 = 86 / 0;
                if (f3028 != null) {
                }
                Class<?> cls = Class.forName(m8404("䩋瘹\ude00㲚ꥯ\uf8ab㋳捔\uda76툎ㄯ蝯ፙ娂뺘풙唧食쎬劙䩋瘹呁Ჟ蛶뵶䟛蟨쒕딵びᘚ", 33 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
                f3028 = cls;
                f3026 = cls.getMethod(m8404("危褧ͯ뙚瘵萎ᶖҵﭧ屼ळ\uf1e0", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11).intern(), new Class[0]).invoke(null, new Object[0]);
                int i4 = f3017 + 67;
                f3018 = i4 % 128;
                int i5 = i4 % 2;
            }
            return m8406(f3028, f3026);
        } catch (Throwable th) {
            m.m8520(m8404("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new StringBuilder().append(m8398(new int[]{90898600, 367940862, -910603565, 209217793, -1783790534, -111845852, -1227209940, 1534421294, -464523105, 1882906361, -1376161245, -682914033, 192408266, 940389713, -990802492, 2055557116, 1669599085, -1982536227}, (ViewConfiguration.getLongPressTimeout() >> 16) + 35).intern()).append(th.getLocalizedMessage()).toString());
            return new ArrayList();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static View.OnClickListener m8403(View view) {
        try {
            Object m8402 = m8402(view);
            if (m8402 == null) {
                return null;
            }
            Class<?> cls = m8402.getClass();
            synchronized (ke.class) {
                if (f3027 == null) {
                    f3027 = m8394(cls, m8398(new int[]{-1997946794, 540414940, -969712809, -297731321, -341774595, -976532191, -1796063354, 598865851}, 16 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
                }
            }
            return (View.OnClickListener) f3027.get(m8402);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8399(View view, hp.b bVar) {
        View.OnClickListener m8403;
        int i = 2 % 2;
        int i2 = f3017 + 23;
        f3018 = i2 % 128;
        if (i2 % 2 != 0) {
            m8403 = m8403(view);
            int i3 = 22 / 0;
            if (m8403 instanceof hp) {
                return;
            }
        } else {
            m8403 = m8403(view);
            if (m8403 instanceof hp) {
                return;
            }
        }
        view.setOnClickListener(new hp(m8403, bVar));
        int i4 = f3018 + 35;
        f3017 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static View.OnTouchListener m8393(View view) {
        try {
            Object m8402 = m8402(view);
            if (m8402 == null) {
                return null;
            }
            Class<?> cls = m8402.getClass();
            synchronized (ke.class) {
                if (f3021 == null) {
                    f3021 = m8394(cls, m8404("䜤嬖յꝲ䮐汾嗂똦䤡⿈覅\u31ecᆙ\udef4蛶뵶", (-16777200) - Color.rgb(0, 0, 0)).intern());
                }
            }
            return (View.OnTouchListener) f3021.get(m8402);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static MediaPlayer m8397(VideoView videoView) {
        Field m8394;
        int i = 2 % 2;
        Object obj = null;
        try {
            m8394 = m8394(VideoView.class, m8398(new int[]{-1600987765, -1706321381, -1373456830, -1349126350, -1583703354, -252218446}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11).intern());
        } catch (Exception e) {
            kl.m8458(m8404("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", 12 - Color.argb(0, 0, 0, 0)).intern(), m8404("蛶뵶쎧㕹픺ꗾ뺘풙囫Ǚ趥\uda4eꆦ騈ꨖ娱\u0dc8隇律滲䩬泭賷\ufafd", TextUtils.indexOf("", "", 0, 0) + 23).intern(), (Throwable) e, false);
        }
        if (m8394 == null) {
            int i2 = f3018 + 19;
            f3017 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = f3017 + 113;
        f3018 = i4 % 128;
        if (i4 % 2 == 0) {
            return (MediaPlayer) m8394.get(videoView);
        }
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if ((r2 instanceof com.ironsource.adqualitysdk.sdk.i.hm) == false) goto L9;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m8407(MediaPlayer mediaPlayer, hm.e eVar) {
        Field m8394;
        MediaPlayer.OnInfoListener onInfoListener;
        int i = 2 % 2;
        int i2 = f3018 + 11;
        f3017 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m8394 = m8394(MediaPlayer.class, m8404("䜤嬖篴\uf37a谊ⱬ턐\ue73f\u0017铌䴌邟䍊\udc3a賷\ufafd", 2 - ExpandableListView.getPackedPositionGroup(0L)).intern());
                onInfoListener = (MediaPlayer.OnInfoListener) m8394.get(mediaPlayer);
                if (!(onInfoListener instanceof hm)) {
                    m8394.set(mediaPlayer, new hm(onInfoListener, eVar));
                }
                int i3 = f3017 + 81;
                f3018 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            m8394 = m8394(MediaPlayer.class, m8404("䜤嬖篴\uf37a谊ⱬ턐\ue73f\u0017铌䴌邟䍊\udc3a賷\ufafd", 15 - ExpandableListView.getPackedPositionGroup(0L)).intern());
            onInfoListener = (MediaPlayer.OnInfoListener) m8394.get(mediaPlayer);
        } catch (Exception e) {
            kl.m8458(m8404("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), m8398(new int[]{112299620, 1222218481, 1368270589, -1686330218, 957615451, -1086791011, 891541528, 739114119, 1909068952, -1594885795, 1185079797, 1125987709, 1727475890, -245698141, 1731508964, -1812778425, -1396581402, -1465590378}, 34 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), (Throwable) e, false);
        }
        kl.m8458(m8404("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), m8398(new int[]{112299620, 1222218481, 1368270589, -1686330218, 957615451, -1086791011, 891541528, 739114119, 1909068952, -1594885795, 1185079797, 1125987709, 1727475890, -245698141, 1731508964, -1812778425, -1396581402, -1465590378}, 34 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), (Throwable) e, false);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8395(MediaPlayer mediaPlayer, hn.a aVar) {
        int i = 2 % 2;
        int i2 = f3017 + 101;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Field m8394 = m8394(MediaPlayer.class, m8404("䜤嬖䱪敲媢\ud832暕ứ趥\uda4e쨂ऄ뒩툟\u0017铌䴌邟䍊\udc3a賷\ufafd", 21 - View.combineMeasuredStates(0, 0)).intern());
            MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) m8394.get(mediaPlayer);
            if (!(onCompletionListener instanceof hn)) {
                m8394.set(mediaPlayer, new hn(onCompletionListener, aVar));
            }
            int i4 = f3017 + 87;
            f3018 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            kl.m8458(m8404("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12).intern(), m8398(new int[]{112299620, 1222218481, 1368270589, -1686330218, 957615451, -1086791011, 891541528, 739114119, 1909068952, -1594885795, 1798546964, 349251406, 1087173771, -982365766, -97215694, 1122355777, -1457440469, 948447810, 1129695400, -327164504, 650717817, -1398024481}, TextUtils.indexOf("", "", 0) + 41).intern(), (Throwable) e, false);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8396(MediaPlayer mediaPlayer, ho.c cVar) {
        Field m8394;
        MediaPlayer.OnPreparedListener onPreparedListener;
        int i = 2 % 2;
        int i2 = f3018 + 55;
        f3017 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m8394 = m8394(MediaPlayer.class, m8404("䜤嬖鬚\uf3eb\ue094読\ue2e7䢿\ue094読ꘄ똉\u0017铌䴌邟䍊\udc3a賷\ufafd", 62 % (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
                onPreparedListener = (MediaPlayer.OnPreparedListener) m8394.get(mediaPlayer);
                if (onPreparedListener instanceof ho) {
                    return;
                }
            } else {
                m8394 = m8394(MediaPlayer.class, m8404("䜤嬖鬚\uf3eb\ue094読\ue2e7䢿\ue094読ꘄ똉\u0017铌䴌邟䍊\udc3a賷\ufafd", 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
                onPreparedListener = (MediaPlayer.OnPreparedListener) m8394.get(mediaPlayer);
                if (onPreparedListener instanceof ho) {
                    return;
                }
            }
            m8394.set(mediaPlayer, new ho(onPreparedListener, cVar));
            int i3 = f3018 + 99;
            f3017 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            kl.m8458(m8404("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m8398(new int[]{112299620, 1222218481, 1368270589, -1686330218, 957615451, -1086791011, 891541528, 739114119, 1909068952, -1594885795, -763171310, 77049864, -630464497, 1560284414, -492789928, -925220098, 1731508964, -1812778425, -1396581402, -1465590378}, Color.argb(0, 0, 0, 0) + 39).intern(), (Throwable) e, false);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8401(MediaPlayer mediaPlayer, hq.d dVar) {
        Field m8394;
        MediaPlayer.OnSeekCompleteListener onSeekCompleteListener;
        int i = 2 % 2;
        int i2 = f3018 + 35;
        f3017 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m8394 = m8394(MediaPlayer.class, m8398(new int[]{1825893091, 2022772609, 584643109, 441189094, 1087173771, -982365766, 1820630565, 1534501520, 1731508964, -1812778425, -1396581402, -1465590378}, 28 << TextUtils.indexOf("", "", 0)).intern());
                onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) m8394.get(mediaPlayer);
                if (onSeekCompleteListener instanceof hq) {
                    return;
                }
            } else {
                m8394 = m8394(MediaPlayer.class, m8398(new int[]{1825893091, 2022772609, 584643109, 441189094, 1087173771, -982365766, 1820630565, 1534501520, 1731508964, -1812778425, -1396581402, -1465590378}, 23 - TextUtils.indexOf("", "", 0)).intern());
                onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) m8394.get(mediaPlayer);
                if (onSeekCompleteListener instanceof hq) {
                    return;
                }
            }
            m8394.set(mediaPlayer, new hq(onSeekCompleteListener, dVar));
            int i3 = f3018 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f3017 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            kl.m8458(m8404("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", TextUtils.indexOf("", "", 0, 0) + 12).intern(), m8398(new int[]{112299620, 1222218481, 1368270589, -1686330218, 957615451, -1086791011, 891541528, 739114119, -1791020118, 1696785005, 1167105306, 82217076, 1911452360, -2018121482, 1644123070, -861872277, -838826380, 216104538, -587967512, 1619786021}, 38 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List<View> m8406(Class cls, Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = f3018 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f3017 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (f3025 == null) {
            Field declaredField = cls.getDeclaredField(m8404("핥끇▊\uf79f曐ﷵ", 6 - View.combineMeasuredStates(0, 0)).intern());
            f3025 = declaredField;
            declaredField.setAccessible(true);
        }
        Object obj2 = f3025.get(obj);
        if (obj2 instanceof List) {
            List<View> list = (List) f3025.get(obj);
            int i3 = f3018 + 65;
            f3017 = i3 % 128;
            if (i3 % 2 != 0) {
                return list;
            }
            throw null;
        }
        if (!(obj2 instanceof View[])) {
            return new ArrayList();
        }
        int i4 = f3018 + 93;
        f3017 = i4 % 128;
        int i5 = i4 % 2;
        return Arrays.asList((View[]) f3025.get(obj));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Object m8402(View view) {
        try {
            synchronized (ke.class) {
                if (f3029 == null) {
                    f3029 = m8394(View.class, m8398(new int[]{-886547505, -2003627932, 1129695400, -327164504, 1275087097, 1883371378, 1822636583, -1224507547}, ExpandableListView.getPackedPositionGroup(0L) + 13).intern());
                }
            }
            return f3029.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Field m8394(Class cls, String str) {
        int i = 2 % 2;
        int i2 = f3017 + 51;
        f3018 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            int i4 = f3018 + 55;
            f3017 = i4 % 128;
            if (i4 % 2 != 0) {
                return declaredField;
            }
            throw null;
        } catch (Exception e) {
            kl.m8458(m8404("᷎醕\ude00㲚ꥯ\uf8ab輭ᔥ\uf6b2\uf881芘雧", TextUtils.indexOf("", "", 0, 0) + 12).intern(), m8398(new int[]{112299620, 1222218481, 1368270589, -1686330218, 483371233, 334762748, -645491791, 2088852701, 983619548, -1682816402, 765674498, -467291543, 1714441902, 969006227}, (ViewConfiguration.getTouchSlop() >> 8) + 25).intern(), (Throwable) e, false);
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8400(View view, ht.e eVar) {
        int i = 2 % 2;
        int i2 = f3018 + 1;
        f3017 = i2 % 128;
        if (i2 % 2 != 0) {
            View.OnTouchListener m8393 = m8393(view);
            if (!(m8393 instanceof ht)) {
                view.setOnTouchListener(new ht(m8393, eVar));
            }
            int i3 = f3017 + 39;
            f3018 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 98 / 0;
                return;
            }
            return;
        }
        boolean z = m8393(view) instanceof ht;
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m8398(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f3022.clone();
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8404(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f3020)) ^ ((c2 >>> 5) + f3019)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f3024) ^ ((c3 + i2) ^ ((c3 << 4) + f3023))));
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
}
