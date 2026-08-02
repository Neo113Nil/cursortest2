package com.vk.core.view.links;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import com.vk.core.view.components.text.links.VkLinkedText;
import xsna.ozl;

/* compiled from: LinkedTextView.kt */
@ozl
/* loaded from: classes17.dex */
public class LinkedTextView extends VkLinkedText {
    public LinkedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public LinkedTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, R.attr.textViewStyle);
    }
}
