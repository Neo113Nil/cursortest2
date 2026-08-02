package com.vk.core.view.components.p003switch;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.VkSwitchImpl;
import com.google.android.material.R$attr;

/* compiled from: VkSwitch.kt */
/* loaded from: classes17.dex */
public final class VkSwitch extends VkSwitchImpl {
    public VkSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public VkSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, R$attr.materialSwitchStyle);
    }
}
