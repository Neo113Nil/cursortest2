package com.vk.profile.questions.impl;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.profile.questions.impl.d;
import com.vkontakte.android.R;
import xsna.p5;
import xsna.qqe0;
import xsna.tlo0;
import xsna.tq;
import xsna.vfz;

/* compiled from: QuestionsAdapter.kt */
/* loaded from: classes5.dex */
public final class j extends vfz<d.b> {
    public final qqe0 l;
    public final VkCell m;

    public j(ViewGroup viewGroup, QuestionsListFragment.b bVar) {
        super(R.layout.pds_item_removed_question, viewGroup);
        this.l = bVar;
        this.m = (VkCell) this.itemView.findViewById(R.id.removed_cell);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(d.b bVar) {
        d.b bVar2 = bVar;
        VkCell.Middle.b a = VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, bVar2.d ? R.string.questions_all_question_removed : R.string.questions_question_removed), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14);
        VkCell vkCell = this.m;
        vkCell.setMiddle(a);
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.b(new tlo0.f(R.string.questions_cancel), new p5(23, bVar2, this), VkButton.Appearance.Accent, VkButton.Mode.Link, VkButton.Size.Small, null, null, null, 2016), null, null, null, 30));
    }
}
