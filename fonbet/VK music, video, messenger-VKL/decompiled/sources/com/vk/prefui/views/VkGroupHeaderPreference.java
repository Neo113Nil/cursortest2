package com.vk.prefui.views;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.vk.core.view.components.group.header.VkGroupHeader;
import xsna.tlo0;
import xsna.tyc0;
import xsna.u11;
import xsna.zcl;

/* compiled from: VkGroupHeaderPreference.kt */
/* loaded from: classes5.dex */
public final class VkGroupHeaderPreference extends Preference {
    public VkGroupHeader.a.C0842a Q;

    public VkGroupHeaderPreference(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // androidx.preference.Preference
    public final void s(tyc0 tyc0Var) {
        tlo0 tlo0Var;
        super.s(tyc0Var);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) tyc0Var.itemView;
        CharSequence charSequence = this.j;
        if (charSequence != null) {
            tlo0Var = u11.f(tlo0.Companion, charSequence);
        } else {
            tlo0.Companion.getClass();
            tlo0Var = tlo0.c.a;
        }
        tlo0 tlo0Var2 = tlo0Var;
        CharSequence m = m();
        tlo0.h f = m != null ? u11.f(tlo0.Companion, m) : null;
        vkGroupHeader.setTitle(new VkGroupHeader.d(tlo0Var2, null, null, null, 0, 510));
        vkGroupHeader.setSubtitle(f != null ? new VkGroupHeader.c(f, null, null) : null);
        vkGroupHeader.setLeft(this.Q);
        vkGroupHeader.setRight((VkGroupHeader.Right) null);
    }

    public VkGroupHeaderPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ VkGroupHeaderPreference(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.preferenceStyle : i);
    }

    public VkGroupHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = com.vkontakte.android.R.layout.vk_group_header_preference_layout;
    }
}
