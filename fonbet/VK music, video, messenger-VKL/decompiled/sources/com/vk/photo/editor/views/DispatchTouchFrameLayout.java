package com.vk.photo.editor.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import xsna.izs;

/* compiled from: DispatchTouchFrameLayout.kt */
/* loaded from: classes4.dex */
public final class DispatchTouchFrameLayout extends FrameLayout {
    public izs<? super MotionEvent, Boolean> b;
    public boolean c;

    public DispatchTouchFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        izs<? super MotionEvent, Boolean> izsVar = this.b;
        this.c = izsVar != null ? izsVar.invoke(motionEvent).booleanValue() : false;
        return super.dispatchTouchEvent(motionEvent);
    }

    public final izs<MotionEvent, Boolean> getOnDispatch$api_release() {
        return this.b;
    }

    public final boolean getShouldProcess$api_release() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        izs<? super MotionEvent, Boolean> izsVar = this.b;
        if (izsVar != null) {
            izsVar.invoke(motionEvent);
        }
        return this.c;
    }

    public final void setDispatchListener(izs<? super MotionEvent, Boolean> izsVar) {
        this.b = izsVar;
    }

    public final void setOnDispatch$api_release(izs<? super MotionEvent, Boolean> izsVar) {
        this.b = izsVar;
    }

    public final void setShouldProcess$api_release(boolean z) {
        this.c = z;
    }
}
