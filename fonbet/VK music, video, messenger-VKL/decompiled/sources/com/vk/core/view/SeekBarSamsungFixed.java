package com.vk.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatSeekBar;

/* loaded from: classes17.dex */
public class SeekBarSamsungFixed extends AppCompatSeekBar {
    public boolean c;

    public SeekBarSamsungFixed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = true;
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.c = z;
    }
}
