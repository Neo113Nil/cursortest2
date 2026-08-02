package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class jg extends BroadcastReceiver {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2696 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2697 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String f2698;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2699;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Context f2700;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f2701 = false;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Set<jb> f2702 = new HashSet();

    /* renamed from: ﻏ, reason: contains not printable characters */
    static void m8149() {
        f2699 = PsExtractor.PRIVATE_STREAM_1;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m8153(jg jgVar, Context context) {
        int i = 2 % 2;
        int i2 = f2696 + 3;
        f2697 = i2 % 128;
        int i3 = i2 % 2;
        boolean m8152 = m8152(context);
        int i4 = f2696 + 3;
        f2697 = i4 % 128;
        int i5 = i4 % 2;
        return m8152;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m8154() {
        int i = 2 % 2;
        int i2 = f2697 + 111;
        int i3 = i2 % 128;
        f2696 = i3;
        int i4 = i2 % 2;
        String str = f2698;
        int i5 = i3 + 51;
        f2697 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m8156(jg jgVar, boolean z) {
        int i = 2 % 2;
        int i2 = f2696 + 27;
        f2697 = i2 % 128;
        int i3 = i2 % 2;
        jgVar.m8155(z);
        int i4 = f2696 + 3;
        f2697 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
    }

    static {
        m8149();
        f2698 = m8151(TextUtils.lastIndexOf("", '0') + 21, true, 293 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "�\f\ufff9\f￫\u0003\n\u0007\u000f\f�￦\n�\u000e\u0001�\ufffb�￪", 12 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern();
        int i = f2696 + 85;
        f2697 = i % 128;
        int i2 = i % 2;
    }

    public jg(Context context) {
        this.f2700 = context.getApplicationContext();
        m.m8520(f2698, m8151(TextUtils.indexOf("", "", 0) + 30, true, 285 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\t\u0005\u0003\u0005\u0012\uffc0\u0014\u0013\u0001\u0003\u0004\u0001\u000f\u0012\u0002\uffc0\u0010\u0015\uffc0\u0007\u000e\t\u0014\u0014\u0005\ufff3ￎ\u0012\u0005\u0016", 26 - Color.red(0)).intern());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m8151((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36, true, Process.getGidForName("") + 275, "\uffff\ufff4\u0001\ufff4\uffff￮\ufff0\ufff9\ufff9\ufffa￮\uffd9\u0019\u0019\u001a\u000e\uffd9\u001f\u0010\u0019\uffd9\u000f\u0014\u001a\u001d\u000f\u0019\f\ufff0\ufff2\ufff9￬\ufff3￮\n\u0004", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28).intern());
        this.f2700.registerReceiver(this, intentFilter);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8161() {
        int i = 2 % 2;
        int i2 = f2697 + 109;
        f2696 = i2 % 128;
        int i3 = i2 % 2;
        this.f2700.unregisterReceiver(this);
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m8160(jb jbVar) {
        int i = 2 % 2;
        int i2 = f2697 + 99;
        f2696 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.f2702.add(jbVar);
            throw null;
        }
        this.f2702.add(jbVar);
        int i3 = f2697 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2696 = i3 % 128;
        if (i3 % 2 != 0) {
            super.hashCode();
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m8162(jb jbVar) {
        int i = 2 % 2;
        int i2 = f2696 + 27;
        f2697 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f2702.remove(jbVar);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f2702.remove(jbVar);
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private synchronized Set<jb> m8148() {
        HashSet hashSet;
        int i = 2 % 2;
        hashSet = new HashSet(this.f2702);
        int i2 = f2696 + 23;
        f2697 = i2 % 128;
        int i3 = i2 % 2;
        return hashSet;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8157() {
        int i = 2 % 2;
        Iterator<jb> it = m8148().iterator();
        while (it.hasNext()) {
            int i2 = f2697 + 55;
            f2696 = i2 % 128;
            int i3 = i2 % 2;
            it.next().mo5981();
        }
        int i4 = f2696 + 9;
        f2697 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8159() {
        int i = 2 % 2;
        int i2 = f2696 + 111;
        f2697 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<jb> it = m8148().iterator();
        while (!(!it.hasNext())) {
            it.next();
        }
        int i4 = f2697 + 51;
        f2696 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        int i = 2 % 2;
        p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f2703 = 0;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f2704 = 1;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f2705 = {14198, 6651, 27255, 48355, 36208, 57332, 8319, 29367, 17257, 38368, 58999, 51375, 6508, 27618, 48229, 36583, 57113, 8694, 29308, 17663, 38257, 59384, 51320, 6893, 27502, 48627, 36458, 53493, 8566, 29682, 17512, 38625, 59158, 51611, 6676, 27796, 21898, 31523, 2228, 56885, 61347, 48444, 17059, 4202, 8631, 63289, 33982, 43580, 31673, 2365, 57004, 60467, 48530, 17167, 4244, 9755, 63436, 34061, 43648, 30731, 2458, 57105, 60565, 'n', 12013, 23879, 35817, 47718, 59620, 5993, 17901, 29796, 41723, 53602, 65535, 11884, 23779, 'T', 12010, 23905, 35828, 47725, 59565, 6015, 17838, 29822, 41725, 53556, 65528, 11901, 23790, 35691, 47601, 59474, 5833, 17668, 29637, 41543, 53444, 65346, 11723, 23635, 35526, 47453, 59328, 5713, 17614, 29509, 31103, 22474, 9292, 62163, 49984, 37264, 28255, 15578, 3338, 56263, 43072, 34558, 22343, 9667, 62019, 49357, 37228, 28669};

            /* renamed from: ｋ, reason: contains not printable characters */
            private static long f2706 = 8260748659738685058L;

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                int i2 = 2 % 2;
                int i3 = f2703 + 15;
                f2704 = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        if (!intent.getAction().equals(m8163((char) (8465 >> (ViewConfiguration.getFadingEdgeLength() >> 51)), TextUtils.indexOf("", "", 1, 1), 13 >> (ViewConfiguration.getScrollDefaultDelay() >> 47)).intern())) {
                            return;
                        }
                    } else if (!intent.getAction().equals(m8163((char) (14103 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.indexOf("", "", 0, 0), 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                        return;
                    }
                    int i4 = f2703 + 59;
                    f2704 = i4 % 128;
                    int i5 = i4 % 2;
                    m.m8519(jg.m8154(), m8163((char) (21956 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 36, Process.getGidForName("") + 28).intern());
                    if (!intent.getBooleanExtra(m8163((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), MotionEvent.axisFromString("") + 64, 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), false)) {
                        if (jg.m8153(jg.this, context)) {
                            p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2.4
                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* renamed from: ｋ */
                                public final void mo5828() {
                                    jg.m8156(jg.this, true);
                                    jg.this.m8157();
                                }
                            });
                            return;
                        } else {
                            p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2.2
                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* renamed from: ｋ */
                                public final void mo5828() {
                                    jg.m8156(jg.this, false);
                                    jg.this.m8159();
                                }
                            });
                            return;
                        }
                    }
                    m.m8519(jg.m8154(), m8163((char) TextUtils.indexOf("", "", 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 78, 31 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                    p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            jg.this.m8159();
                            jg.m8156(jg.this, false);
                        }
                    });
                    int i6 = f2703 + 3;
                    f2704 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Exception e) {
                    kl.m8458(jg.m8154(), m8163((char) (TextUtils.lastIndexOf("", '0', 0) + 31035), MotionEvent.axisFromString("") + 109, 18 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), (Throwable) e, false);
                }
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private static String m8163(char c, int i2, int i3) {
                String str;
                synchronized (c.f1197) {
                    char[] cArr = new char[i3];
                    c.f1198 = 0;
                    while (c.f1198 < i3) {
                        cArr[c.f1198] = (char) ((f2705[c.f1198 + i2] ^ (c.f1198 * f2706)) ^ c);
                        c.f1198++;
                    }
                    str = new String(cArr);
                }
                return str;
            }
        });
        int i2 = f2696 + 23;
        f2697 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m8158() {
        boolean z;
        int i = 2 % 2;
        int i2 = f2697 + 73;
        int i3 = i2 % 128;
        f2696 = i3;
        int i4 = i2 % 2;
        z = this.f2701;
        int i5 = i3 + 35;
        f2697 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        return z;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m8155(boolean z) {
        int i = 2 % 2;
        int i2 = f2697;
        int i3 = i2 + 15;
        f2696 = i3 % 128;
        if (i3 % 2 != 0) {
            this.f2701 = z;
            int i4 = 17 / 0;
        } else {
            this.f2701 = z;
        }
        int i5 = i2 + 27;
        f2696 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m8152(Context context) {
        int i = 2 % 2;
        int i2 = f2697 + 51;
        f2696 = i2 % 128;
        if (i2 % 2 == 0) {
            NetworkInfo m8150 = m8150(context);
            if (m8150 == null || !m8150.isConnected()) {
                int i3 = f2696 + 79;
                f2697 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 61 / 0;
                }
                return false;
            }
            m.m8519(f2698, new StringBuilder().append(m8151(TextUtils.lastIndexOf("", '0', 0) + 9, true, 286 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\uffbf\n\u0011\u000e\u0016\u0013\u0004￭", Color.blue(0) + 8).intern()).append(m8150.getTypeName()).append(m8151(10 - TextUtils.indexOf((CharSequence) "", '0'), true, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 281, "\u0012\u0006ￃ\uffd1\u0007\b\u0017\u0006\b\u0011\u0011", View.getDefaultSize(0, 0) + 3).intern()).toString());
            return true;
        }
        m8150(context);
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static NetworkInfo m8150(Context context) {
        int i = 2 % 2;
        if (context != null) {
            int i2 = f2696 + 9;
            f2697 = i2 % 128;
            return ((ConnectivityManager) context.getSystemService((i2 % 2 == 0 ? m8151(77 << (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), false, 3911 >> ExpandableListView.getPackedPositionType(0L), "\ufff6\f\u0007￼\t￼\u0007\ufff6\ufff8\u0001\u0001\u0002", 1 >> (ViewConfiguration.getLongPressTimeout() + 6)) : m8151(13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, 298 - ExpandableListView.getPackedPositionType(0L), "\ufff6\f\u0007￼\t￼\u0007\ufff6\ufff8\u0001\u0001\u0002", (ViewConfiguration.getLongPressTimeout() >> 16) + 1)).intern())).getActiveNetworkInfo();
        }
        int i3 = f2696 + 37;
        f2697 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m8151(int i, boolean z, int i2, String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f2699);
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
