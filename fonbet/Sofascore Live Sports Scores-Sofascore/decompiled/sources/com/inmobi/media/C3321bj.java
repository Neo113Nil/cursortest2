package com.inmobi.media;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.bj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3321bj {
    public final V2 a;
    public final W2 b;
    public final X2 c;

    public C3321bj(V2 v2, W2 w2, X2 x2) {
        this.a = v2;
        this.b = w2;
        this.c = x2;
    }

    public final void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        try {
            this.b.a(i);
        } catch (Exception unused) {
        }
    }

    public final void onSessionEnded(boolean z, Bundle bundle) {
        try {
            this.c.a(z);
        } catch (Exception unused) {
        }
    }

    public final void onVerticalScrollEvent(boolean z, Bundle bundle) {
        try {
            Y2 y2 = this.a.a;
            if (y2.h) {
                return;
            }
            y2.h = true;
            C3500ii c3500ii = (C3500ii) y2.i.get();
            if (c3500ii != null) {
                GestureDetectorOnGestureListenerC3889xi.g1.getClass();
                c3500ii.a(C3372di.a("IN_NATIVE_BROWSER", "onScroll"));
            }
        } catch (Exception unused) {
        }
    }
}
