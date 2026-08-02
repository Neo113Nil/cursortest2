package com.vk.profile.questions.impl;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.divider.VkDivider;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.profile.questions.impl.d;
import com.vkontakte.android.R;
import xsna.cn70;
import xsna.qqe0;
import xsna.sch;
import xsna.tlo0;
import xsna.tq;
import xsna.vfz;

/* compiled from: QuestionsAdapter.kt */
/* loaded from: classes5.dex */
public final class i extends vfz<d.a> {
    public final qqe0 l;
    public final VkButton m;
    public final VkCell n;

    public i(ViewGroup viewGroup, QuestionsListFragment.b bVar) {
        super(R.layout.pds_item_removed_all_questions, viewGroup);
        this.l = bVar;
        this.m = (VkButton) this.itemView.findViewById(R.id.remove_all_question_button);
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.removed_cell);
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.questions_question_removed), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
        this.n = vkCell;
        ((VkDivider) this.itemView.findViewById(R.id.question_separator)).setDividerHeight(cn70.c(1));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(d.a aVar) {
        d.a aVar2 = aVar;
        int i = aVar2.d ? R.string.questions_remove_all_questions_anonymous : R.string.questions_remove_all_questions;
        VkButton vkButton = this.m;
        vkButton.setText(i);
        this.n.setRight(VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.b(tq.h(tlo0.Companion, R.string.questions_cancel), new com.vk.newsfeed.common.recycler.holders.attachments.a(29, this, aVar2), VkButton.Appearance.Accent, VkButton.Mode.Link, VkButton.Size.Small, null, null, null, 2016), null, null, null, 30));
        vkButton.setOnClickListener(new sch(6, this, aVar2));
    }
}
