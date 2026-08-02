package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.adqualitysdk.sdk.i.ht;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes5.dex */
public final class jq {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2875 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2876 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2877 = -1991614651872506965L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static jq f2878;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private jv f2880;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Map<RelativeLayout, Object> f2879 = new WeakHashMap();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private it f2881 = new it(-1, -1, -1, -1);

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m8270(View view, ht.e eVar) {
        int i = 2 % 2;
        int i2 = f2876 + 83;
        f2875 = i2 % 128;
        int i3 = i2 % 2;
        m8279(view, eVar);
        int i4 = f2876 + 23;
        f2875 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m8272(jq jqVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = 2 % 2;
        int i2 = f2875 + 91;
        f2876 = i2 % 128;
        int i3 = i2 % 2;
        jqVar.m8280(viewGroup, onLayoutChangeListener);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        int i5 = f2875 + 67;
        f2876 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ View.OnLayoutChangeListener m8273(jq jqVar, ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = f2875 + 83;
        f2876 = i2 % 128;
        int i3 = i2 % 2;
        View.OnLayoutChangeListener m8267 = jqVar.m8267(viewGroup);
        int i4 = f2875 + 59;
        f2876 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return m8267;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ ViewGroup m8274(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i = 2 % 2;
        int i2 = f2876 + 67;
        f2875 = i2 % 128;
        if (i2 % 2 == 0) {
            return m8268(viewGroup, viewGroup2);
        }
        m8268(viewGroup, viewGroup2);
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m8277(jq jqVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = 2 % 2;
        int i2 = f2875 + 53;
        f2876 = i2 % 128;
        int i3 = i2 % 2;
        jqVar.m8276(viewGroup, onLayoutChangeListener);
        if (i3 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m8281(jq jqVar, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = f2876 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2875 = i2 % 128;
        int i3 = i2 % 2;
        jqVar.m8282(motionEvent);
        if (i3 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m8283(jq jqVar, it itVar) {
        int i = 2 % 2;
        int i2 = f2876 + 89;
        f2875 = i2 % 128;
        int i3 = i2 % 2;
        jqVar.m8278(itVar);
        int i4 = f2875 + 29;
        f2876 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized jq m8269() {
        jq jqVar;
        synchronized (jq.class) {
            int i = 2 % 2;
            int i2 = f2876 + 23;
            f2875 = i2 % 128;
            if (i2 % 2 == 0) {
                if (f2878 == null) {
                    f2878 = new jq();
                    int i3 = f2875 + 25;
                    f2876 = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 2 % 2;
                }
                jqVar = f2878;
            } else {
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }
        return jqVar;
    }

    private jq() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r3.f2880 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        r3.f2880 = new com.ironsource.adqualitysdk.sdk.i.jq.AnonymousClass4(r3);
        com.ironsource.adqualitysdk.sdk.i.jp.m8258().m8266(r3.f2880);
        r1 = 2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x001c, code lost:
    
        if (r3.f2880 == null) goto L15;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m8285() {
        int i = 2 % 2;
        int i2 = f2876 + 3;
        f2875 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
        }
        int i4 = f2875 + 111;
        f2876 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m8286() {
        int i = 2 % 2;
        if (this.f2880 != null) {
            int i2 = f2875 + 73;
            f2876 = i2 % 128;
            int i3 = i2 % 2;
            for (RelativeLayout relativeLayout : this.f2879.keySet()) {
                int i4 = f2875 + 87;
                f2876 = i4 % 128;
                int i5 = i4 % 2;
                ViewParent parent = relativeLayout.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(relativeLayout);
                }
                int i6 = 2 % 2;
            }
            this.f2879.clear();
            jp.m8258().m8265(this.f2880);
            this.f2880 = null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized it m8287() {
        it itVar;
        int i = 2 % 2;
        int i2 = f2875 + 67;
        int i3 = i2 % 128;
        f2876 = i3;
        int i4 = i2 % 2;
        itVar = this.f2881;
        int i5 = i3 + 41;
        f2875 = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return itVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m8278(it itVar) {
        int i = 2 % 2;
        int i2 = f2875;
        int i3 = i2 + 23;
        f2876 = i3 % 128;
        int i4 = i3 % 2;
        this.f2881 = itVar;
        int i5 = i2 + 49;
        f2876 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static ViewGroup m8268(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i = 2 % 2;
        int i2 = f2876 + 109;
        f2875 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
            if (viewGroup2 == null) {
                return viewGroup;
            }
        } else if (viewGroup2 == null) {
            return viewGroup;
        }
        ViewGroup viewGroup3 = viewGroup2;
        while (true) {
            if (viewGroup2 == null) {
                break;
            }
            int i4 = f2876 + 11;
            f2875 = i4 % 128;
            int i5 = i4 % 2;
            ViewParent parent = viewGroup2.getParent();
            if (parent != viewGroup) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                viewGroup3 = viewGroup2;
                viewGroup2 = (ViewGroup) parent;
            } else {
                int i6 = f2876 + 63;
                int i7 = i6 % 128;
                f2875 = i7;
                Object obj = null;
                if (i6 % 2 != 0) {
                    super.hashCode();
                    throw null;
                }
                if (viewGroup3 != viewGroup2) {
                    return viewGroup3;
                }
                int i8 = i7 + 29;
                f2876 = i8 % 128;
                if (i8 % 2 == 0) {
                    super.hashCode();
                    throw null;
                }
            }
        }
        return viewGroup2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private View.OnLayoutChangeListener m8267(final ViewGroup viewGroup) {
        int i = 2 % 2;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.jq.1

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static long f2882 = 4055067002018937706L;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f2883 = 1;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f2884;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = 2 % 2;
                int i11 = f2884 + 3;
                f2883 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 62 / 0;
                    if (s.m8592().m8616()) {
                        return;
                    }
                } else if (s.m8592().m8616()) {
                    return;
                }
                try {
                    jq.m8277(jq.this, viewGroup, this);
                    int i13 = f2883 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                    f2884 = i13 % 128;
                    int i14 = i13 % 2;
                } catch (Throwable th) {
                    kl.m8458(m8288("㬭䎫쩟儏\ud9bf恧\uef30瞾ﹷԜ跀ᑉ錟ᯐꉨ⤬뇔㡲䜲쿮嚋\udd29旂\uec88欱\uf3ea", TextUtils.lastIndexOf("", '0', 0, 0) + 30894).intern(), m8288("㬯獳ꯎ\ue244᪴兝要쇩砒냆\uef2a➿帏陼컟՚붮\uf432Ⲅ擺鍘쯊Ƚ", 18539 - View.getDefaultSize(0, 0)).intern(), th, false);
                }
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m8288(String str, int i2) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (i.f2454) {
                    i.f2455 = i2;
                    char[] cArr3 = new char[cArr2.length];
                    i.f2453 = 0;
                    while (i.f2453 < cArr2.length) {
                        cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f2882);
                        i.f2453++;
                    }
                    str2 = new String(cArr3);
                }
                return str2;
            }
        };
        int i2 = f2876 + 109;
        f2875 = i2 % 128;
        if (i2 % 2 == 0) {
            return onLayoutChangeListener;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m8276(ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = 2 % 2;
        if (viewGroup != null) {
            int i2 = f2876 + 89;
            f2875 = i2 % 128;
            int i3 = i2 % 2;
            if (m8284(viewGroup)) {
                return;
            }
            Activity m8509 = kq.m8509(viewGroup);
            if (jw.m8308().m8314(m8509)) {
                if (viewGroup.findViewById(160766228) == null) {
                    m8271(viewGroup, onLayoutChangeListener);
                }
            } else if (jw.m8308().m8313(m8509)) {
                m8280(viewGroup, onLayoutChangeListener);
                int i4 = f2876 + 85;
                f2875 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m8271(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext()) { // from class: com.ironsource.adqualitysdk.sdk.i.jq.3
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent me2) {
                DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me2);
                return super.dispatchTouchEvent(me2);
            }

            @Override // android.widget.RelativeLayout, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                }
            }

            @Override // android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                jq.m8281(jq.this, motionEvent);
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        relativeLayout.setAlpha(0.0f);
        synchronized (this) {
            this.f2879.put(relativeLayout, new Object());
        }
        relativeLayout.setId(160766228);
        new Handler(Looper.getMainLooper()).post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jq.2
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m8280(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = 2 % 2;
        final ht.e eVar = new ht.e() { // from class: com.ironsource.adqualitysdk.sdk.i.jq.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ht.e
            /* renamed from: ﻛ */
            public final boolean mo7411(ht htVar, View view, MotionEvent motionEvent) {
                jq.m8281(jq.this, motionEvent);
                return true;
            }
        };
        new Handler(Looper.getMainLooper()).post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jq.8
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                jq.m8270(viewGroup, eVar);
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof ViewGroup) {
                        jq.m8272(jq.this, (ViewGroup) childAt, onLayoutChangeListener);
                    } else {
                        jq.m8270(childAt, eVar);
                    }
                }
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
        int i2 = f2876 + 39;
        f2875 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m8279(View view, ht.e eVar) {
        int i = 2 % 2;
        int i2 = f2875 + 103;
        f2876 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ki.m8400(view, eVar);
        if (i3 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f2876 + 33;
        f2875 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m8282(MotionEvent motionEvent) {
        int i = 2 % 2;
        try {
            final MotionEvent obtain = MotionEvent.obtain(motionEvent);
            p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jq.10

                /* renamed from: ｋ, reason: contains not printable characters */
                private static int f2887 = 124;

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static int f2888 = 0;

                /* renamed from: ﾒ, reason: contains not printable characters */
                private static int f2889 = 1;

                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    int i2 = 2 % 2;
                    int i3 = f2889 + 39;
                    f2888 = i3 % 128;
                    int i4 = i3 % 2;
                    try {
                        int round = Math.round(obtain.getRawX());
                        int round2 = Math.round(obtain.getRawY());
                        if (kf.m8384(round, round2)) {
                            jq.m8283(jq.this, new it(round, round2, ke.m8357(), ke.m8359()));
                            return;
                        }
                        m.m8527(m8289(TextUtils.indexOf("", "") + 26, true, 226 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\ufffb￼\t\u0006￡\uffff�\u0003\u0010\f\uffff￭\f\uffff\b\uffff\u000e\r\u0003￦\u0002�\u000f\t￮\u0006", 5 - ExpandableListView.getPackedPositionGroup(0L)).intern(), new StringBuilder().append(m8289(49 - Color.blue(0), false, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, "\uffc1\u0003\u0010\u0016\u000f\u0005\u0014\uffc1\u0004\u0010\u0010\u0013\u0005\n\u000f\u0002\u0015\u0006\u0014ￛ\uffc1\u001c\ufff5\u0010\u0016\u0004\t\uffc1\u0006\u0017\u0006\u000f\u0015\uffc1\u0013\u0006\u0004\u0006\n\u0017\u0006\u0005\uffc1\u0010\u0016\u0015\uffc1\u0010\u0007", (Process.myPid() >> 22) + 22).intern()).append(round).append(m8289(1 - TextUtils.lastIndexOf("", '0', 0), true, 162 - Gravity.getAbsoluteGravity(0, 0), "\ufffa\u0006", View.getDefaultSize(0, 0) + 2).intern()).append(round2).append(m8289(-((byte) KeyEvent.getModifierMetaStateMask()), true, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 249, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, Color.rgb(0, 0, 0) + 16777217).intern()).toString());
                        int i5 = f2889 + 51;
                        f2888 = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 52 / 0;
                        }
                    } catch (Throwable th) {
                        kl.m8458(m8289(25 - MotionEvent.axisFromString(""), true, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, "\ufffb￼\t\u0006￡\uffff�\u0003\u0010\f\uffff￭\f\uffff\b\uffff\u000e\r\u0003￦\u0002�\u000f\t￮\u0006", (-16777211) - Color.rgb(0, 0, 0)).intern(), m8289(16 - (ViewConfiguration.getJumpTapTimeout() >> 16), true, 219 - ImageFormat.getBitsPerPixel(0), "\u000e\t\uffc0\u0012\u000f\u0012\u0012￥\b\u0003\u0015\u000f\ufff4\u000e\u000f\uffc0", (ViewConfiguration.getWindowTouchSlop() >> 8) + 8).intern(), th, false);
                    }
                }

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static String m8289(int i2, boolean z, int i3, String str, int i4) {
                    String str2;
                    char[] cArr = str;
                    if (str != null) {
                        cArr = str.toCharArray();
                    }
                    char[] cArr2 = cArr;
                    synchronized (d.f1644) {
                        char[] cArr3 = new char[i2];
                        d.f1641 = 0;
                        while (d.f1641 < i2) {
                            d.f1643 = cArr2[d.f1641];
                            cArr3[d.f1641] = (char) (d.f1643 + i3);
                            int i5 = d.f1641;
                            cArr3[i5] = (char) (cArr3[i5] - f2887);
                            d.f1641++;
                        }
                        if (i4 > 0) {
                            d.f1642 = i4;
                            char[] cArr4 = new char[i2];
                            System.arraycopy(cArr3, 0, cArr4, 0, i2);
                            System.arraycopy(cArr4, 0, cArr3, i2 - d.f1642, d.f1642);
                            System.arraycopy(cArr4, d.f1642, cArr3, 0, i2 - d.f1642);
                        }
                        if (z) {
                            char[] cArr5 = new char[i2];
                            d.f1641 = 0;
                            while (d.f1641 < i2) {
                                cArr5[d.f1641] = cArr3[(i2 - d.f1641) - 1];
                                d.f1641++;
                            }
                            cArr3 = cArr5;
                        }
                        str2 = new String(cArr3);
                    }
                    return str2;
                }
            });
            int i2 = f2876 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f2875 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            kl.m8458(m8275("⧨앍⦯힀캊睯삹同ܥｶ釖⚭瓅갭ꍆ\uf77aꖅ劑璮\ud80f錶ͳ״ꪍ샑〸흄筛ㆃ\ue69b", 1 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), m8275("\uea7e᠌\uea3b⦘Ꮥ⍛㺼5쒠≻濽犓띒煻嵟ꍬ昝较誶谱傻\ude34ﯶﻊ͐\ued6a⥝⽞\uf256㯐ڴᡲ겸䨲知䪷", 1 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), th, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m8284(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = f2875 + 103;
        f2876 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                if (viewGroup.getChildCount() == 0) {
                    return false;
                }
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    int i4 = f2875 + 37;
                    f2876 = i4 % 128;
                    int i5 = i4 % 2;
                    if (!(viewGroup.getChildAt(i3) instanceof TextView)) {
                        int i6 = f2875 + 15;
                        f2876 = i6 % 128;
                        if (i6 % 2 != 0) {
                            return false;
                        }
                        throw null;
                    }
                }
                return true;
            }
            viewGroup.getChildCount();
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            m.m8535(m8275("⧨앍⦯힀캊睯삹同ܥｶ釖⚭瓅갭ꍆ\uf77aꖅ劑璮\ud80f錶ͳ״ꪍ샑〸흄筛ㆃ\ue69b", 1 - View.combineMeasuredStates(0, 0)).intern(), m8275("䛊㪫䚏縆ㅲꆹ椢苗栔Ü㡧\uf07c\u1bf7友ૃ↉쪠굣\udd7c໕ﰜﳐ걖籡꿳쿛绳궖庭ᥭ儨骐\u001d梛\u2062졸㏋믉\uf2de㦫\ue2e6镳씊曘鐋\ue4e8鑜呥䟖㟐曪薵皿ŧ㤓", View.MeasureSpec.makeMeasureSpec(0, 0) + 1).intern(), th);
            return false;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m8275(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2877, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2877));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
