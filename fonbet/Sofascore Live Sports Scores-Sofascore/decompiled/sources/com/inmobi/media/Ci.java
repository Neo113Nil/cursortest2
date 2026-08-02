package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ci {
    public GestureDetectorOnGestureListenerC3889xi a;
    public final long b;

    public Ci(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, long j) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        this.a = gestureDetectorOnGestureListenerC3889xi;
        this.b = j;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new defpackage.y2(this, 27), this.b);
    }

    public static final void a(Ci ci) {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = ci.a;
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            gestureDetectorOnGestureListenerC3889xi.j();
        }
        ci.a = null;
    }
}
