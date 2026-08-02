package com.vk.common.view;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: DotsIndicatorSwipeDetector.kt */
/* loaded from: classes17.dex */
public final class b extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return motionEvent.getPointerCount() == 1;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        int pointerId = motionEvent.getPointerId(0);
        a aVar = this.b;
        aVar.e = pointerId;
        aVar.c = true;
        aVar.d = 0;
        aVar.f = motionEvent.getX();
        aVar.g = motionEvent.getY();
        aVar.a.a();
    }
}
