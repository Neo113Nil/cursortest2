package com.inmobi.media;

import android.view.MotionEvent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Uk {
    public final GestureDetectorOnGestureListenerC3889xi a;

    public Uk(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        this.a = gestureDetectorOnGestureListenerC3889xi;
    }

    public final void a(MotionEvent motionEvent) {
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a.a(motionEvent.getX(), motionEvent.getY());
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.a.b(motionEvent.getX(), motionEvent.getY());
        }
    }
}
