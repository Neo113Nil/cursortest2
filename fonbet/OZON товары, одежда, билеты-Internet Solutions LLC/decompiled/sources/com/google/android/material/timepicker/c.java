package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: classes9.dex */
final class c implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ GestureDetector f58835a;

    c(GestureDetector gestureDetector) {
        this.f58835a = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f58835a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
