package com.vk.core.view.components.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import xsna.atj0;
import xsna.bd0;
import xsna.hcw0;

/* compiled from: VkSearchView.kt */
/* loaded from: classes17.dex */
public class VkSearchView extends BaseVkSearchView {
    public View.OnClickListener Q;
    public atj0 R;
    public hcw0 S;

    public VkSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // com.vk.core.view.components.search.BaseVkSearchView
    public final boolean Z4() {
        hcw0 hcw0Var = this.S;
        if (hcw0Var != null) {
            return hcw0Var.d();
        }
        return false;
    }

    public final View.OnClickListener getActionClickListener() {
        return this.Q;
    }

    public final View.OnClickListener getVoiceButtonOnClickListener() {
        return new bd0(this, 19);
    }

    public final atj0 getVoiceSearchCallback() {
        return this.R;
    }

    public final void k5() {
        hcw0 hcw0Var = this.S;
        if (hcw0Var != null) {
            hcw0Var.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hcw0 hcw0Var = this.S;
        if (hcw0Var != null) {
            hcw0Var.onDetachedFromWindow();
        }
    }

    public final void setActionClickListener(View.OnClickListener onClickListener) {
        this.Q = onClickListener;
    }

    @Override // com.vk.core.view.components.search.BaseVkSearchView
    public void setUpVoiceInput(ImageView imageView) {
        hcw0 hcw0Var = this.S;
        if (hcw0Var != null) {
            hcw0Var.b(imageView);
        }
    }

    public final void setVoiceActionDelegate(hcw0 hcw0Var) {
        this.S = hcw0Var;
        i5(true);
    }

    public final void setVoiceSearchCallback(atj0 atj0Var) {
        this.R = atj0Var;
    }

    public VkSearchView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
