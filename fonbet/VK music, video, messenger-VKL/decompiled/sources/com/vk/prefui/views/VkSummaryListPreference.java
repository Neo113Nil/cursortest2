package com.vk.prefui.views;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.cell.VkCell;
import xsna.gzs;
import xsna.tlo0;
import xsna.tyc0;
import xsna.u11;
import xsna.zcl;

/* compiled from: VkSummaryListPreference.kt */
/* loaded from: classes5.dex */
public final class VkSummaryListPreference extends ListPreference {
    public boolean b0;

    public VkSummaryListPreference(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // androidx.preference.Preference
    public final void s(tyc0 tyc0Var) {
        VkCell.Middle.e eVar;
        VkCell.Middle.d dVar;
        super.s(tyc0Var);
        VkCell vkCell = (VkCell) tyc0Var.itemView;
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        CharSequence charSequence = this.j;
        if (charSequence != null) {
            eVar = new VkCell.Middle.e(u11.f(tlo0.Companion, charSequence), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62);
        } else {
            eVar = null;
        }
        CharSequence P = P();
        if (P != null) {
            dVar = new VkCell.Middle.d(u11.f(tlo0.Companion, P), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62);
        } else {
            dVar = null;
        }
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, eVar, dVar, null, 12));
        if (this.b0) {
            vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.C0822a(VkBadge.Appearance.Design.Accent), null, null, null, 30));
        } else {
            vkCell.setRight((VkCell.Right.d) null);
        }
    }

    public VkSummaryListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ VkSummaryListPreference(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.preferenceStyle : i);
    }

    public VkSummaryListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = com.vkontakte.android.R.layout.vk_preference_layout;
    }
}
