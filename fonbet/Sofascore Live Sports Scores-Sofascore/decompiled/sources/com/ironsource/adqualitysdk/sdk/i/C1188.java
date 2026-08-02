package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾕ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1188 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static C1188 f3765;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f3766 = StringFog.decrypt("LfZZuL0IqFQf+V6WtReIXgT/RIm5FopSCf8=\n", "apo22txk/Ds=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public C0260 f3769;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final WeakHashMap f3768 = new WeakHashMap();

    /* renamed from: ｋ, reason: contains not printable characters */
    public C0520 f3767 = new C0520(-1, -1, -1, -1);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m668(C1188 c1188, ViewGroup viewGroup, ViewOnLayoutChangeListenerC0257 viewOnLayoutChangeListenerC0257) {
        boolean z;
        c1188.getClass();
        if (viewGroup != null) {
            try {
                if (viewGroup.getChildCount() != 0) {
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        if (viewGroup.getChildAt(i) instanceof TextView) {
                        }
                    }
                    return;
                }
            } catch (Throwable th) {
                String str = f3766;
                AbstractC0420.m252(str, str, StringFog.decrypt("61Pyrl2VOGTLQuuoQdJ7ZcgB1qhKwhx+wVTw4UzaNXjPSO6yD9o1YNcB1KRXwQ1ly1bz\n", "riGAwS+1Www=\n"), th, null, false);
            }
            Activity m89 = AbstractC3964b.m89(viewGroup);
            C0620 m379 = C0620.m379();
            synchronized (m379) {
                z = EnumC0623.f2057 == m379.m382(m89);
            }
            if (z) {
                if (viewGroup.findViewById(160766228) == null) {
                    c1188.m672(viewGroup, viewOnLayoutChangeListenerC0257);
                }
            } else if (C0620.m379().m381(m89)) {
                new Handler(Looper.getMainLooper()).post(new C0202(c1188, viewGroup, new C0219(c1188), viewOnLayoutChangeListenerC0257));
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m669() {
        try {
            if (this.f3769 != null) {
                for (ViewGroup viewGroup : this.f3768.keySet()) {
                    ViewParent parent = viewGroup.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(viewGroup);
                    }
                }
                this.f3768.clear();
                C1064.m629().m630(this.f3769);
                this.f3769 = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m670() {
        if (this.f3769 == null) {
            this.f3769 = new C0260(this);
            C1064.m629().m631(this.f3769);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized C0520 m671() {
        return this.f3767;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m667(C1188 c1188, MotionEvent motionEvent) {
        c1188.getClass();
        try {
            AbstractC1008.m611(new C0198(c1188, MotionEvent.obtain(motionEvent)));
        } catch (Throwable th) {
            AbstractC0356.m204(f3766, StringFog.decrypt("k/LxrLeT02mi9OqtopPAY6Pj6+O30sNU9u/x47fSw1U=\n", "1oCDw8WztAw=\n"), th, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C1188 m666() {
        C1188 c1188;
        synchronized (C1188.class) {
            c1188 = f3765;
            if (c1188 == null) {
                c1188 = new C1188();
                f3765 = c1188;
            }
        }
        return c1188;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m672(ViewGroup viewGroup, ViewOnLayoutChangeListenerC0257 viewOnLayoutChangeListenerC0257) {
        C0245 c0245 = new C0245(this, viewGroup.getContext());
        c0245.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        synchronized (this) {
            this.f3768.put(c0245, new Object());
        }
        c0245.setId(160766228);
        new Handler(Looper.getMainLooper()).post(new C0232(viewGroup, c0245, viewOnLayoutChangeListenerC0257));
    }
}
