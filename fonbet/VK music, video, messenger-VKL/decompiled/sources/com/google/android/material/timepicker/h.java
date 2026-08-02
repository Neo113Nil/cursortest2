package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: TimePickerView.java */
/* loaded from: classes13.dex */
public final class h extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView b;

    public h(TimePickerView timePickerView) {
        this.b = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        b bVar = this.b.A;
        if (bVar == null) {
            return false;
        }
        bVar.Q = 1;
        bVar.Fn(bVar.O);
        bVar.E.b();
        return true;
    }
}
