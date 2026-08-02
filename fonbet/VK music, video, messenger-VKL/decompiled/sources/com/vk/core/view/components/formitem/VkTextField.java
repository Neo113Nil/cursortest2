package com.vk.core.view.components.formitem;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;

/* compiled from: VkTextField.kt */
/* loaded from: classes17.dex */
public final class VkTextField extends AppCompatEditText {
    public VkTextField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        InputMethodManager inputMethodManager;
        super.onFocusChanged(z, i, rect);
        if (!hasFocus() || (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getLineCount() > 8) {
            getParent().requestDisallowInterceptTouchEvent(true);
            Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction() & 255) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
