package com.inmobi.media;

import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.ljg;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.y7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3904y7 {
    public static final C3826v7 k = new C3826v7();
    public final byte a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final InterfaceC3880x9 f;
    public R8 g;
    public C3310b8 h;
    public final LinkedHashMap i = new LinkedHashMap();
    public final C3852w7 j = new C3852w7(this);

    public C3904y7(byte b, String str, int i, int i2, int i3, InterfaceC3880x9 interfaceC3880x9) {
        this.a = b;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = interfaceC3880x9;
    }

    public final void a(View view) {
        R8 r8;
        view.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (Intrinsics.c(this.b, "video") || Intrinsics.c(this.b, "audio") || (r8 = this.g) == null) {
            return;
        }
        view.getClass();
        r8.a.remove(view);
        r8.b.remove(view);
        r8.c.a(view);
        if (r8.a.isEmpty()) {
            InterfaceC3880x9 interfaceC3880x92 = this.f;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("HtmlAdTracker", "Impression tracker is free, removing it");
            }
            R8 r82 = this.g;
            if (r82 != null) {
                r82.a.clear();
                r82.b.clear();
                r82.c.a();
                r82.e.removeMessages(0);
                r82.c.b();
            }
            this.g = null;
        }
    }

    public final void b(View view) {
        view.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        C3310b8 c3310b8 = this.h;
        if (c3310b8 != null) {
            c3310b8.a(view);
            if (c3310b8.a.isEmpty()) {
                InterfaceC3880x9 interfaceC3880x92 = this.f;
                if (interfaceC3880x92 != null) {
                    ((C3906y9) interfaceC3880x92).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                C3310b8 c3310b82 = this.h;
                if (c3310b82 != null) {
                    c3310b82.b();
                }
                this.h = null;
            }
        }
        this.i.remove(view);
    }

    public final void a(View view, View view2, InterfaceC3584lo interfaceC3584lo, AdConfig.ViewabilityConfig viewabilityConfig, boolean z) {
        int i;
        C3310b8 c3310b8;
        view.getClass();
        view2.getClass();
        interfaceC3584lo.getClass();
        viewabilityConfig.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("HtmlAdTracker", "startTrackingForVisibility");
        }
        C3310b8 c3310b82 = this.h;
        if (c3310b82 == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.f;
            if (z) {
                c3310b8 = new C3280a4(viewabilityConfig, interfaceC3880x92);
            } else {
                c3310b8 = new C3310b8(viewabilityConfig, (byte) 1, interfaceC3880x92);
            }
            c3310b82 = c3310b8;
            this.h = c3310b82;
        }
        C3878x7 c3878x7 = new C3878x7(this);
        InterfaceC3880x9 interfaceC3880x93 = c3310b82.d;
        if (interfaceC3880x93 != null) {
            ((C3906y9) interfaceC3880x93).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        c3310b82.h = c3878x7;
        this.i.put(view, interfaceC3584lo);
        if (z) {
            i = viewabilityConfig.getCompanionVisibilityMinPercentageViewed();
        } else {
            i = this.e;
        }
        view.getClass();
        c3310b82.a(view, view, view2, i);
    }

    public final void a() {
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("HtmlAdTracker", "onActivityStarted");
        }
        R8 r8 = this.g;
        if (r8 != null) {
            r8.d.getClass();
            for (Map.Entry entry : r8.a.entrySet()) {
                View view = (View) entry.getKey();
                P8 p8 = (P8) entry.getValue();
                C3310b8 c3310b8 = r8.c;
                View view2 = p8.a;
                int i = p8.b;
                c3310b8.getClass();
                view.getClass();
                c3310b8.a(view, view, view2, i);
            }
            if (!r8.e.hasMessages(0)) {
                r8.e.postDelayed(r8.f, r8.g);
            }
            r8.c.f();
        }
        C3310b8 c3310b82 = this.h;
        if (c3310b82 != null) {
            c3310b82.f();
        }
    }

    public final R8 a(byte b, AdConfig.ViewabilityConfig viewabilityConfig) {
        R8 r8 = this.g;
        if (r8 != null) {
            return r8;
        }
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("HtmlAdTracker", ljg.j(b, "creating Visibility Tracker for "));
        }
        C3310b8 c3310b8 = new C3310b8(viewabilityConfig, b, this.f);
        InterfaceC3880x9 interfaceC3880x92 = this.f;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).c("HtmlAdTracker", ljg.j(b, "creating Impression Tracker for "));
        }
        R8 r82 = new R8(viewabilityConfig, c3310b8, this.j);
        this.g = r82;
        return r82;
    }
}
