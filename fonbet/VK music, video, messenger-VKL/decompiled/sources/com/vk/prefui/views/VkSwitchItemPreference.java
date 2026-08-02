package com.vk.prefui.views;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.SwitchPreferenceCompat;
import com.vk.core.view.components.p003switch.VkSwitchItem;
import xsna.hl30;
import xsna.tlo0;
import xsna.tyc0;
import xsna.u11;
import xsna.zcl;

/* compiled from: VkSwitchItemPreference.kt */
/* loaded from: classes5.dex */
public final class VkSwitchItemPreference extends SwitchPreferenceCompat {
    public VkSwitchItemPreference(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void s(tyc0 tyc0Var) {
        super.s(tyc0Var);
        VkSwitchItem vkSwitchItem = (VkSwitchItem) tyc0Var.itemView;
        CharSequence charSequence = this.j;
        vkSwitchItem.setTitle(charSequence != null ? u11.f(tlo0.Companion, charSequence) : null);
        CharSequence m = m();
        vkSwitchItem.setSubtitle(m != null ? u11.f(tlo0.Companion, m) : null);
        vkSwitchItem.setChecked(this.Q);
        vkSwitchItem.setAlignSwitchToEnd(true);
        vkSwitchItem.setListener(new hl30(this, 23));
    }

    public VkSwitchItemPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ VkSwitchItemPreference(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.preferenceStyle : i);
    }

    public VkSwitchItemPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = com.vkontakte.android.R.layout.vk_switch_item_preference_layout;
    }
}
