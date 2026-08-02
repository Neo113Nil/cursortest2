package com.vk.core.ui.themes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: VKReplacerView.kt */
/* loaded from: classes.dex */
public final class VKReplacerView extends View {
    public boolean b;
    public View c;

    public VKReplacerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean a(View view) {
        if (this.b) {
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeView(this);
                this.b = false;
                this.c = view;
                view.setId(getId());
                view.setVisibility(getVisibility());
                if (view.getContentDescription() == null) {
                    view.setContentDescription(getContentDescription());
                }
                if (view.getBackground() == null) {
                    view.setBackground(getBackground());
                }
                view.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
                viewGroup.addView(view, indexOfChild, layoutParams);
                return true;
            }
        }
        return false;
    }

    public final View getView() {
        return this.c;
    }

    public VKReplacerView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = true;
        this.c = this;
    }
}
