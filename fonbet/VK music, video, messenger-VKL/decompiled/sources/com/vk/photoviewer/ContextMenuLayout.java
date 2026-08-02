package com.vk.photoviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.HorizontalScrollView;

/* compiled from: ContextMenuLayout.kt */
/* loaded from: classes3.dex */
public final class ContextMenuLayout extends HorizontalScrollView {
    public View.OnKeyListener b;

    public ContextMenuLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        View.OnKeyListener onKeyListener = this.b;
        if (onKeyListener != null) {
            return onKeyListener.onKey(this, keyEvent != null ? keyEvent.getKeyCode() : 0, keyEvent);
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        super.setOnKeyListener(onKeyListener);
        this.b = onKeyListener;
    }
}
