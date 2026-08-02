package com.vk.core.view.mediapicker.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: MediaPickerRecyclerView.kt */
/* loaded from: classes17.dex */
public final class MediaPickerRecyclerView extends RecyclerView {
    public RecyclerView.n b;
    public View.OnTouchListener c;

    public MediaPickerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.c;
        if (onTouchListener == null || !onTouchListener.onTouch(this, motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setItemDecoration(RecyclerView.n nVar) {
        RecyclerView.n nVar2 = this.b;
        if (nVar2 != null) {
            removeItemDecoration(nVar2);
            this.b = null;
        }
        if (nVar != null) {
            addItemDecoration(nVar);
            this.b = nVar;
        }
    }

    public final void setOnInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.c = onTouchListener;
    }
}
