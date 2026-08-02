package com.vk.auth.ui;

import android.R;
import android.content.Context;
import android.util.AttributeSet;

/* compiled from: VkAuthClickableTextView.kt */
/* loaded from: classes15.dex */
public final class VkAuthClickableTextView extends VkAuthTextView {
    public VkAuthClickableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }
}
