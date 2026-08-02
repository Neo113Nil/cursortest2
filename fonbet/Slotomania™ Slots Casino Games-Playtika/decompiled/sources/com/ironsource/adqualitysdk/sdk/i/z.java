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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.ba;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class z<T> extends u<WebView, T> implements View.OnLayoutChangeListener {

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f3300 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f3301 = 125;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f3302;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private Map<WebView, kd> f3303 = new WeakHashMap();

    /* renamed from: ﱡ, reason: contains not printable characters */
    private List<jy> f3304 = new ArrayList();

    /* renamed from: ﻏ, reason: contains not printable characters */
    private jz f3305;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f3306;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private kd f3307;

    /* renamed from: ｋ, reason: contains not printable characters */
    private List<String> f3308;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f3309;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f3310;

    /* renamed from: ﻛ */
    abstract T mo5775(WebView webView);

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ ba.d m8721(z zVar) {
        int i = 2 % 2;
        int i2 = f3300 + 85;
        f3302 = i2 % 128;
        int i3 = i2 % 2;
        ba.d m8720 = zVar.m8720();
        int i4 = f3302 + 51;
        f3300 = i4 % 128;
        if (i4 % 2 != 0) {
            return m8720;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m8722(String str) {
        int i = 2 % 2;
        int i2 = f3302 + 73;
        f3300 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m8723 = m8723(str);
        int i4 = f3302 + 115;
        f3300 = i4 % 128;
        int i5 = i4 % 2;
        return m8723;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m8724(z zVar) {
        int i = 2 % 2;
        int i2 = f3302 + 21;
        f3300 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = zVar.f3310;
        if (i3 != 0) {
            return z;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m8725(z zVar, WebView webView) {
        int i = 2 % 2;
        int i2 = f3300 + 83;
        f3302 = i2 % 128;
        int i3 = i2 % 2;
        zVar.m8719(webView);
        int i4 = f3302 + 103;
        f3300 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ List m8728(z zVar) {
        int i = 2 % 2;
        int i2 = f3302 + 105;
        int i3 = i2 % 128;
        f3300 = i3;
        int i4 = i2 % 2;
        List<String> list = zVar.f3308;
        int i5 = i3 + 29;
        f3302 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ﻐ */
    public final /* synthetic */ void mo5820(JSONObject jSONObject, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = f3300 + 53;
        f3302 = i2 % 128;
        int i3 = i2 % 2;
        m8726(jSONObject, (WebView) obj, (WebView) obj2);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f3300 + 45;
        f3302 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ｋ */
    public final /* synthetic */ void mo5823(JSONObject jSONObject, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = f3300 + 35;
        f3302 = i2 % 128;
        int i3 = i2 % 2;
        m8734(jSONObject, (WebView) obj, (WebView) obj2);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final void m8732(String str, List<String> list, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        this.f3306 = z;
        this.f3305 = new jz(str, z3);
        this.f3310 = z2;
        this.f3308 = list;
        int i2 = f3300 + 15;
        f3302 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8735() {
        int i = 2 % 2;
        Iterator<WebView> it = this.f3303.keySet().iterator();
        while (it.hasNext()) {
            int i2 = f3302 + 65;
            f3300 = i2 % 128;
            if (i2 % 2 == 0) {
                WebView next = it.next();
                next.removeOnLayoutChangeListener(this);
                this.f3303.get(next);
                this.f3304.iterator();
                throw null;
            }
            WebView next2 = it.next();
            next2.removeOnLayoutChangeListener(this);
            kd kdVar = this.f3303.get(next2);
            Iterator<jy> it2 = this.f3304.iterator();
            while (it2.hasNext()) {
                kdVar.m8345(it2.next());
                int i3 = f3300 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f3302 = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        this.f3304.clear();
        this.f3307 = null;
        this.f3303.clear();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final WebView m8731() {
        int i = 2 % 2;
        kd kdVar = this.f3307;
        Object obj = null;
        if (kdVar != null) {
            int i2 = f3300 + 99;
            f3302 = i2 % 128;
            if (i2 % 2 == 0) {
                return kdVar.m8350();
            }
            kdVar.m8350();
            throw null;
        }
        int i3 = f3302 + 27;
        f3300 = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ba.d m8720() {
        int i = 2 % 2;
        int i2 = f3302 + 19;
        f3300 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        kd kdVar = this.f3307;
        if (kdVar == null) {
            return null;
        }
        ba.d m8349 = kdVar.m8349();
        int i3 = f3300 + 99;
        f3302 = i3 % 128;
        int i4 = i3 % 2;
        return m8349;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8736(WebView webView) {
        int i = 2 % 2;
        int i2 = f3300;
        int i3 = i2 + 71;
        f3302 = i3 % 128;
        int i4 = i3 % 2;
        if (webView != null) {
            int i5 = i2 + 81;
            f3302 = i5 % 128;
            int i6 = i5 % 2;
            if (this.f3303.containsKey(webView)) {
                return;
            }
            kd m8344 = kd.m8344(webView, m8718(TextUtils.getCapsMode("", 0, 0) + 9, false, ((byte) KeyEvent.getModifierMetaStateMask()) + 210, "ￛ\r\u0010\u000f\u0018\u000e\u0017￦ￛ", Color.red(0) + 1).intern());
            if (this.f3307 == null) {
                this.f3307 = m8344;
            }
            this.f3303.put(webView, m8344);
            jy m8727 = m8727();
            this.f3304.add(m8727);
            m8344.m8348(m8727);
            m8719(webView);
            webView.addOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = f3300 + 79;
        int i11 = i10 % 128;
        f3302 = i11;
        int i12 = i10 % 2;
        try {
            if (view instanceof WebView) {
                int i13 = i11 + 115;
                f3300 = i13 % 128;
                if (i13 % 2 != 0) {
                    WebView webView = (WebView) view;
                    if (this.f3303.containsKey(webView)) {
                        m8719(webView);
                        return;
                    }
                    return;
                }
                this.f3303.containsKey((WebView) view);
                throw null;
            }
        } catch (Throwable th) {
            kl.m8458(m8718(Color.blue(0) + 16, true, 223 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\b\ufff5\u0001\u0004\ufff6\u0011\u0004\u000b\u0003\r\u0000\uffe7\u0003￠\u0016\u0004", TextUtils.indexOf((CharSequence) "", '0') + 6).intern(), m8718(23 - Color.alpha(0), true, 222 - KeyEvent.keyCodeFromString(""), "\u0018\u0000￫\r\u000e\uffbf\r\b\uffbf\u0011\u000e\u0011\u0011￤\u0004\u0006\r\u0000\u0007￢\u0013\u0014\u000e", ExpandableListView.getPackedPositionType(0L) + 14).intern(), th, false);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8733(List<WebView> list) {
        int i = 2 % 2;
        int i2 = f3300 + 51;
        f3302 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (list != null) {
            Iterator<WebView> it = list.iterator();
            while (it.hasNext()) {
                m8736(it.next());
                int i3 = f3302 + 89;
                f3300 = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.z$3, reason: invalid class name */
    final class AnonymousClass3 implements jy {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f3311 = 0;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f3312 = 1;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static byte[] f3313 = {-53, 37, -38, 37, -54, 37, -53, 51, -50, 49, -34, 49, -56, 108, -121, -54, 2, -16, Ascii.CR, -5, -54, 78, -72, -72, -76};

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static short[] f3314 = null;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f3315 = -994685928;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f3316 = -1935763430;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f3317 = 59;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static long f3318 = -3430038402762217348L;

        AnonymousClass3() {
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ void m8738(AnonymousClass3 anonymousClass3, WebView webView, String str, boolean z) {
            int i = 2 % 2;
            int i2 = f3312 + 89;
            f3311 = i2 % 128;
            int i3 = i2 % 2;
            anonymousClass3.m8740(webView, str, z);
            int i4 = f3312 + 87;
            f3311 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 65 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jy
        /* renamed from: ﻛ */
        public final void mo8321(WebView webView, String str, String str2) {
            int i = 2 % 2;
            String substring = str2.substring(0, str2.indexOf(63));
            String substring2 = str2.substring(str2.indexOf(63) + 1);
            if (substring.equals(m8741("\ue80f鉵᳤蝨ǩ豨", (ViewConfiguration.getScrollBarSize() >> 8) + 31357).intern())) {
                z.m8725(z.this, webView);
                return;
            }
            if (substring.equals(m8739((short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 994686043 - Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) - 59, 1935763430 - (Process.myPid() >> 22), (byte) (36 - View.combineMeasuredStates(0, 0))).intern())) {
                int i2 = f3311 + 69;
                f3312 = i2 % 128;
                if (i2 % 2 != 0) {
                    JSONObject m8722 = z.m8722(substring2);
                    z zVar = z.this;
                    zVar.m8734(m8722, webView, (WebView) zVar.mo5775(webView));
                    return;
                } else {
                    JSONObject m87222 = z.m8722(substring2);
                    z zVar2 = z.this;
                    zVar2.m8734(m87222, webView, (WebView) zVar2.mo5775(webView));
                    int i3 = 92 / 0;
                    return;
                }
            }
            if (!(!substring.equals(m8741("\ue80f⇣篈뗞쾱ᦊ", TextUtils.lastIndexOf("", '0', 0) + 51692).intern()))) {
                JSONObject m87223 = z.m8722(substring2);
                z zVar3 = z.this;
                zVar3.mo5821(m87223, webView, z.m8721(zVar3), z.this.mo5775(webView));
                int i4 = f3312 + 65;
                f3311 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            if (substring.equals(m8741("\ue80f㹩䓜欼놙쟺", ImageFormat.getBitsPerPixel(0) + 54882).intern())) {
                JSONObject m87224 = z.m8722(substring2);
                m87224.remove(is.f2629);
                z zVar4 = z.this;
                zVar4.mo5826(m87224, webView, zVar4.mo5775(webView));
                return;
            }
            if (!(!substring.equals(m8739((short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 994686043 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (-59) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1935763435 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (48 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern()))) {
                JSONObject m87225 = z.m8722(substring2);
                kl.m8456(m87225.optString(m8739((short) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 994686044 - View.MeasureSpec.makeMeasureSpec(0, 0), (-61) - TextUtils.lastIndexOf("", '0'), Process.getGidForName("") + 1935763443, (byte) (105 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern()), m87225.optString(m8739((short) TextUtils.getOffsetAfter("", 0), 994686028 - MotionEvent.axisFromString(""), (-60) - (ViewConfiguration.getWindowTouchSlop() >> 8), 1935763445 - View.resolveSize(0, 0), (byte) ((-10) - TextUtils.indexOf("", "", 0, 0))).intern()), m87225.optString(m8741("\ue819曥\uf5c9䓒펴⊎", 36586 - TextUtils.lastIndexOf("", '0', 0)).intern()), m87225.optString(m8739((short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 994686029, (ViewConfiguration.getLongPressTimeout() >> 16) - 60, 1935763451 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 71)).intern()));
                int i6 = f3311 + 73;
                f3312 = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jy
        /* renamed from: ﾒ */
        public final void mo8322(final WebView webView, final String str, final boolean z) {
            int i = 2 % 2;
            p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.z.3.5
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    if (z.m8724(z.this)) {
                        if (z.m8728(z.this) == null || z.m8728(z.this).isEmpty()) {
                            AnonymousClass3.m8738(AnonymousClass3.this, webView, str, z);
                            return;
                        }
                        Iterator it = z.m8728(z.this).iterator();
                        while (it.hasNext()) {
                            if (str.startsWith((String) it.next())) {
                                AnonymousClass3.m8738(AnonymousClass3.this, webView, str, z);
                                return;
                            }
                        }
                    }
                }
            });
            int i2 = f3312 + 33;
            f3311 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jy
        /* renamed from: ﻐ */
        public final void mo8319(WebView webView) {
            int i = 2 % 2;
            int i2 = f3311 + 49;
            f3312 = i2 % 128;
            int i3 = i2 % 2;
            z.m8725(z.this, webView);
            int i4 = f3312 + 105;
            f3311 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 20 / 0;
            }
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private void m8740(final WebView webView, final String str, final boolean z) {
            int i = 2 % 2;
            p.m8549(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.z.3.2
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    final String originalUrl = webView.getOriginalUrl();
                    final Object mo5775 = z.this.mo5775(webView);
                    p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.z.3.2.4

                        /* renamed from: ﮐ, reason: contains not printable characters */
                        private static int f3324 = 1;

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static int f3325 = 0;

                        /* renamed from: ﾇ, reason: contains not printable characters */
                        private static int f3326 = 41;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            int i2 = 2 % 2;
                            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                            try {
                                jsonObjectInit.put(is.f2620, str);
                                jsonObjectInit.put(is.f2622, m8742(TextUtils.getTrimmedLength("") + 3, true, 154 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\ufff3\u0006\u0007", (Process.myTid() >> 22) + 3).intern());
                                jsonObjectInit.put(is.f2631, originalUrl);
                                if (z) {
                                    int i3 = f3324 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                                    f3325 = i3 % 128;
                                    jsonObjectInit.put(i3 % 2 != 0 ? is.f2632 : is.f2632, true);
                                }
                            } catch (JSONException e) {
                                m.m8527(m8742(16 - TextUtils.getOffsetBefore("", 0), false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "\u0000\r\u0003\u000b\u0004\u0011\ufff6\u0004\u0001\ufff5\b\u0004\u0016￠\u0003\uffe7", Color.blue(0) + 6).intern(), new StringBuilder().append(m8742(View.getDefaultSize(0, 0) + 27, false, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 134, "\u000f\f\u0006\u000eￃ\r\u0016\u0012\u0011\uffddￃ￨\u0015\u0015\u0012\u0015ￃ\u0006\u0015\b\u0004\u0017\f\u0011\nￃ\u0006", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11).intern()).append(e.getLocalizedMessage()).toString());
                            }
                            z.this.mo5824(jsonObjectInit, webView, z.m8721(z.this), mo5775);
                        }

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static String m8742(int i2, boolean z2, int i3, String str2, int i4) {
                            String str3;
                            char[] cArr = str2;
                            if (str2 != null) {
                                cArr = str2.toCharArray();
                            }
                            char[] cArr2 = cArr;
                            synchronized (d.f1644) {
                                char[] cArr3 = new char[i2];
                                d.f1641 = 0;
                                while (d.f1641 < i2) {
                                    d.f1643 = cArr2[d.f1641];
                                    cArr3[d.f1641] = (char) (d.f1643 + i3);
                                    int i5 = d.f1641;
                                    cArr3[i5] = (char) (cArr3[i5] - f3326);
                                    d.f1641++;
                                }
                                if (i4 > 0) {
                                    d.f1642 = i4;
                                    char[] cArr4 = new char[i2];
                                    System.arraycopy(cArr3, 0, cArr4, 0, i2);
                                    System.arraycopy(cArr4, 0, cArr3, i2 - d.f1642, d.f1642);
                                    System.arraycopy(cArr4, d.f1642, cArr3, 0, i2 - d.f1642);
                                }
                                if (z2) {
                                    char[] cArr5 = new char[i2];
                                    d.f1641 = 0;
                                    while (d.f1641 < i2) {
                                        cArr5[d.f1641] = cArr3[(i2 - d.f1641) - 1];
                                        d.f1641++;
                                    }
                                    cArr3 = cArr5;
                                }
                                str3 = new String(cArr3);
                            }
                            return str3;
                        }
                    });
                }
            });
            int i2 = f3311 + 23;
            f3312 = i2 % 128;
            int i3 = i2 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jy
        /* renamed from: ﻛ */
        public final void mo8320(WebView webView, String str) {
            int i = 2 % 2;
            try {
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                jsonObjectInit.put(is.f2628, str);
                jsonObjectInit.put(is.f2623, is.f2626);
                JSONObject jsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
                jsonObjectInit2.put(is.f2630, jsonObjectInit);
                z zVar = z.this;
                zVar.mo5827(jsonObjectInit2, webView, this, zVar.mo5775(webView));
                int i2 = f3311 + 103;
                f3312 = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e) {
                kl.m8458(m8741("\ue82b襒⪈쯋洹\u0e6e꿉䄰\ue240莗⓳옫果ᣟ먃孫", View.MeasureSpec.getSize(0) + 24907).intern(), m8741("\ue839珋\udf84㭜蜚\ue285亁ꩭ㘱釰ﶺ奢ꔮĚ沚좀呏뀊ᮆ枆썮⼰諼ᚻ爤\ude2b㨍藔\ue19e", AndroidCharacter.getMirror('0') + 39829).intern(), (Throwable) e, false);
            }
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m8741(String str, int i) {
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
                    cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f3318);
                    i.f2453++;
                }
                str2 = new String(cArr3);
            }
            return str2;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static String m8739(short s, int i, int i2, int i3, byte b) {
            String obj;
            synchronized (n.f3088) {
                StringBuilder sb = new StringBuilder();
                int i4 = f3317;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f3313;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f3316 + i3] + i4);
                    } else {
                        i5 = (short) (f3314[f3316 + i3] + i4);
                    }
                }
                if (i5 > 0) {
                    n.f3090 = ((i3 + i5) - 2) + f3316 + i6;
                    n.f3091 = b;
                    n.f3092 = (char) (i + f3315);
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089 = 1;
                    while (n.f3089 < i5) {
                        byte[] bArr2 = f3313;
                        if (bArr2 != null) {
                            int i7 = n.f3090;
                            n.f3090 = i7 - 1;
                            n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                        } else {
                            short[] sArr = f3314;
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    private jy m8727() {
        int i = 2 % 2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        int i2 = f3300 + 69;
        f3302 = i2 % 128;
        if (i2 % 2 == 0) {
            return anonymousClass3;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m8719(WebView webView) {
        int i = 2 % 2;
        int i2 = f3300 + 41;
        f3302 = i2 % 128;
        int i3 = i2 % 2;
        kd kdVar = this.f3303.get(webView);
        if (!this.f3306) {
            return;
        }
        int i4 = f3300 + 109;
        f3302 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
            if (!kdVar.m8346()) {
                return;
            }
        } else if (!kdVar.m8346()) {
            return;
        }
        if (!ko.m8484(webView)) {
            int i6 = f3302 + 107;
            f3300 = i6 % 128;
            int i7 = i6 % 2;
            kdVar.m8347();
        }
        m8729(webView);
        int i8 = f3300 + 3;
        f3302 = i8 % 128;
        int i9 = i8 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m8729(WebView webView) {
        int i = 2 % 2;
        int i2 = f3300 + 7;
        f3302 = i2 % 128;
        int i3 = i2 % 2;
        this.f3305.m8329(webView);
        int i4 = f3300 + 79;
        f3302 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m8723(String str) {
        String decode;
        int i = 2 % 2;
        int i2 = f3302 + 25;
        f3300 = i2 % 128;
        int i3 = i2 % 2;
        try {
            decode = URLDecoder.decode(str, m8718(4 - ((byte) KeyEvent.getModifierMetaStateMask()), true, 193 - TextUtils.getCapsMode("", 0, 0), "\u0002\u0010\u0011\ufff4￩", 3 - View.resolveSize(0, 0)).intern());
        } catch (Exception e) {
            m.m8535(m8718(17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, View.MeasureSpec.getMode(0) + Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, "\b\ufff5\u0001\u0004\ufff6\u0011\u0004\u000b\u0003\r\u0000\uffe7\u0003￠\u0016\u0004", Color.green(0) + 5).intern(), m8718((ViewConfiguration.getJumpTapTimeout() >> 16) + 18, false, ((Process.getThreadPriority(0) + 20) >> 6) + Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, "\uffbf\u0006\u0004\u0013\u0013\b\r\u0006\uffbf\u0003\u0000\u0013\u0000￤\u0011\u0011\u000e\u0011", Drawable.resolveOpacity(0, 0) + 13).intern(), e);
        }
        if (!TextUtils.isEmpty(decode)) {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(decode);
            int i4 = f3300 + 7;
            f3302 = i4 % 128;
            if (i4 % 2 == 0) {
                return jsonObjectInit;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = f3300 + 67;
        f3302 = i5 % 128;
        int i6 = i5 % 2;
        return IronSourceNetworkBridge.jsonObjectInit();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8737(String str) {
        int i = 2 % 2;
        int i2 = f3300;
        int i3 = i2 + 49;
        f3302 = i3 % 128;
        int i4 = i3 % 2;
        this.f3309 = str;
        int i5 = i2 + 81;
        f3302 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.u
    /* renamed from: ﾒ */
    public final String mo5818(T t) {
        int i = 2 % 2;
        int i2 = f3300;
        int i3 = i2 + 5;
        f3302 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f3309;
        int i4 = i2 + 79;
        f3302 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m8730(JSONObject jSONObject, WebView webView) {
        int i = 2 % 2;
        int i2 = f3300 + 27;
        f3302 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (webView != null) {
            try {
                String str = is.f2589;
                boolean z = false;
                if (webView.getWindowToken() != null) {
                    int i3 = f3302 + 79;
                    f3300 = i3 % 128;
                    if (i3 % 2 != 0) {
                        z = true;
                    }
                } else {
                    int i4 = f3300 + 5;
                    f3302 = i4 % 128;
                    int i5 = i4 % 2;
                }
                jSONObject.put(str, z);
                int i6 = f3300 + 109;
                f3302 = i6 % 128;
                int i7 = i6 % 2;
                return;
            } catch (JSONException unused) {
            }
        }
        int i8 = f3302 + 57;
        f3300 = i8 % 128;
        int i9 = i8 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8734(JSONObject jSONObject, WebView webView, T t) {
        int i = 2 % 2;
        int i2 = f3300 + 109;
        f3302 = i2 % 128;
        int i3 = i2 % 2;
        m8730(jSONObject, webView);
        super.mo5823(jSONObject, webView, t);
        int i4 = f3302 + 79;
        f3300 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m8726(JSONObject jSONObject, WebView webView, T t) {
        int i = 2 % 2;
        int i2 = f3302 + 87;
        f3300 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObject.remove(is.f2629);
            super.mo5820(jSONObject, webView, t);
            int i3 = f3300 + 17;
            f3302 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        jSONObject.remove(is.f2629);
        super.mo5820(jSONObject, webView, t);
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m8718(int i, boolean z, int i2, String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f3301);
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
