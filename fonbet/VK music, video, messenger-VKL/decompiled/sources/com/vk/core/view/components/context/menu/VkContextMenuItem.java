package com.vk.core.view.components.context.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: VkContextMenuItem.kt */
/* loaded from: classes17.dex */
public final class VkContextMenuItem extends FrameLayout {
    public VkContextMenuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        e3m.b(context).inflate(R.layout.ds_internal_actions_popup_item, (ViewGroup) this, true);
    }
}
