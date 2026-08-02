package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;

/* loaded from: classes4.dex */
public final class jz {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static byte[] f2941 = {-6, 2, -24, 7, 2, 5, -36, 47, -48, 42, -21, 5, -22, Ascii.CR, 4, -9, -57, -30, 51, -35, 50, -43, -36, -49, 118, -112, -38, 117, -116, 40, 107, -104, -40, 36, -44, 48, -33, -38, -35, 36, 104, -113, 34, -36, 33, Ascii.FF, Ascii.SYN, Ascii.SO, -18, Ascii.SUB, -27, -7, Ascii.ESC, 7, -3, -31, Ascii.GS, 7, -24, -19, -22, 19, -8, Ascii.SYN, 116, 126, 125, -97, 101, -117, 118, 116, -118, 120, -100, 116, -20, -26, -27, 7, -14, 3, Ascii.DC2, Ascii.DLE, -1, 6, -20, -103, -109, -112, 114, -108, -102, 98, -120, 103, 110, -103, 102, -107, 113, -103, 2, 34, -11, Ascii.SUB, Ascii.US, Ascii.CAN, -63, 62, -1, 5, -51, 50, -21, Ascii.SUB, -93, 86, -31, -83, 74, -25, Ascii.EM, -28, -55, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f2942 = null;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2943 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2944 = -427119182;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2945 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2946 = 117;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static dp f2947 = null;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2948 = -693528821;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final boolean f2949;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final String f2950;

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m8327(jz jzVar) {
        int i = 2 % 2;
        int i2 = f2945 + 55;
        f2943 = i2 % 128;
        if (i2 % 2 == 0) {
            return jzVar.m8325();
        }
        jzVar.m8325();
        throw null;
    }

    public jz(String str, boolean z) {
        this.f2950 = str;
        this.f2949 = z;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8329(final WebView webView) {
        int i = 2 % 2;
        try {
            p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.3
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    final String m8327 = jz.m8327(jz.this);
                    p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.3.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            ko.m8491(webView, m8327);
                        }
                    });
                }
            });
            int i2 = f2943 + 97;
            f2945 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            m.m8527(m8328((short) Color.blue(0), 21205 - AndroidCharacter.getMirror('0'), TextUtils.indexOf((CharSequence) "", '0') - 99, 693528821 - TextUtils.indexOf("", "", 0), (byte) ((Process.myPid() >> 22) - 7)).intern(), new StringBuilder().append(m8328((short) (ViewConfiguration.getWindowTouchSlop() >> 8), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 427119250, (-86) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 693528837, (byte) (32 - ImageFormat.getBitsPerPixel(0))).intern()).append(e.getLocalizedMessage()).toString());
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8324(dp dpVar) {
        int i = 2 % 2;
        int i2 = f2945;
        int i3 = i2 + 15;
        f2943 = i3 % 128;
        int i4 = i3 % 2;
        f2947 = dpVar;
        if (i4 != 0) {
            int i5 = 80 / 0;
        }
        int i6 = i2 + 99;
        f2943 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String m8323() {
        int i = 2 % 2;
        int i2 = f2945 + 7;
        f2943 = i2 % 128;
        int i3 = i2 % 2;
        String m7597 = f2947.m7597();
        try {
            String replace = m7597.replace(m8328((short) TextUtils.indexOf("", "", 0), KeyEvent.getDeadChar(0, 0) + 427119273, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 98, (Process.myPid() >> 22) + 693528867, (byte) (22 - View.getDefaultSize(0, 0))).intern(), m8326()).replace(m8328((short) TextUtils.getCapsMode("", 0, 0), Drawable.resolveOpacity(0, 0) + 427119273, (-105) - ((byte) KeyEvent.getModifierMetaStateMask()), 693528884 - Process.getGidForName(""), (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 116)).intern(), f2947.m7598());
            if (this.f2949) {
                m7597 = replace.replace(m8328((short) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 427119272, Color.blue(0) - 105, 693528897 - Color.green(0), (byte) ((-21) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), f2947.m7600());
                int i4 = f2945 + 93;
                f2943 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                m7597 = replace.replace(m8328((short) View.MeasureSpec.getMode(0), 427119274 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-105) - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 693528896, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 20)).intern(), "");
            }
            return m7597.replace(m8328((short) Drawable.resolveOpacity(0, 0), View.resolveSizeAndState(0, 0, 0) + 427119273, (-100) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 693528908 - KeyEvent.normalizeMetaState(0), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 103)).intern(), this.f2950);
        } catch (Throwable th) {
            m.m8527(m8328((short) (TextUtils.lastIndexOf("", '0', 0) + 1), 427119269 - Color.red(0), View.MeasureSpec.getMode(0) - 100, 693528821 - View.resolveSizeAndState(0, 0, 0), (byte) ((-7) - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern(), new StringBuilder().append(m8328((short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 427119251 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-94) - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 693528922, (byte) ((-28) - View.MeasureSpec.getMode(0))).intern()).append(th.getLocalizedMessage()).toString());
            return m7597;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m8325() {
        int i = 2 % 2;
        int i2 = f2945 + 7;
        f2943 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
            return il.m8079(m8323().getBytes());
        }
        return il.m8079(m8323().getBytes());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8326() {
        int i = 2 % 2;
        int i2 = f2945 + 25;
        f2943 = i2 % 128;
        int i3 = i2 % 2;
        String m6038 = ar.m6041().mo6052().m6038();
        int i4 = f2945 + 5;
        f2943 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6038;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8328(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2946;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2941;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2948 + i3] + i4);
                } else {
                    i5 = (short) (f2942[f2948 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f2948 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f2944);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f2941;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f2942;
                        int i8 = n.f3090;
                        n.f3090 = i8 - 1;
                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                    }
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
