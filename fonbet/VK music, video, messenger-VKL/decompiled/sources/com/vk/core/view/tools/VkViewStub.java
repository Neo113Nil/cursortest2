package com.vk.core.view.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import xsna.gzs;

/* compiled from: VkViewStub.kt */
/* loaded from: classes17.dex */
public final class VkViewStub extends View {
    public View b;
    public boolean c;
    public gzs<? extends View> d;

    public VkViewStub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a() {
        gzs<? extends View> gzsVar = this.d;
        if (gzsVar == null || this.c) {
            return;
        }
        this.b = gzsVar.invoke();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeView(this);
        this.c = true;
        View view = this.b;
        this.b = view;
        view.setId(getId());
        this.b.setVisibility(getVisibility());
        this.b.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        viewGroup.addView(this.b, indexOfChild, layoutParams);
    }

    public final View getView() {
        return this.b;
    }

    public final void setViewFactory(gzs<? extends View> gzsVar) {
        this.d = gzsVar;
    }

    public VkViewStub(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = this;
    }
}
