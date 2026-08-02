package com.vk.newsfeed.impl.postmodal.reactions.tabs;

import android.text.TextUtils;
import android.util.Size;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.user.ReactionUserProfile;
import com.vk.lists.c;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.b;
import com.vk.toggle.d;
import com.vk.toggle.features.ClipsFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.cn70;
import xsna.dko;
import xsna.dqz0;
import xsna.enj;
import xsna.gko;
import xsna.gzs;
import xsna.izq0;
import xsna.k1u0;
import xsna.kr5;
import xsna.lhg;
import xsna.oq;
import xsna.q030;
import xsna.ru1;
import xsna.s3q0;
import xsna.su1;
import xsna.tlo0;
import xsna.uh20;
import xsna.x7g;
import xsna.zoj0;

/* compiled from: ModalPostReactionsAdapter.kt */
/* loaded from: classes4.dex */
public final class a extends zoj0<b, RecyclerView.e0> implements c.i {
    @Override // com.vk.lists.c.i
    public final boolean I() {
        return getItemCount() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        b bVar = (b) this.c.c(i);
        if (bVar instanceof b.a) {
            return 1;
        }
        if (bVar instanceof b.c) {
            return 2;
        }
        if (bVar instanceof b.C1398b) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x011c, code lost:
    
        if (com.vk.toggle.b.A.a(r4) != false) goto L34;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        b bVar = (b) this.c.c(i);
        boolean z = e0Var instanceof izq0;
        int i2 = R.drawable.user_placeholder_icon;
        if (z && (bVar instanceof b.c)) {
            izq0 izq0Var = (izq0) e0Var;
            b.c cVar = (b.c) bVar;
            VkCell vkCell = izq0Var.l;
            izq0Var.m = cVar;
            ReactionUserProfile reactionUserProfile = cVar.a;
            if (reactionUserProfile.C()) {
                i2 = R.drawable.group_placeholder;
            }
            kr5.a aVar = new kr5.a(new dqz0(reactionUserProfile));
            aVar.b(i2);
            s3q0 s3q0Var = s3q0.a;
            vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new izq0.c(aVar.a()), VkCell.Left.Main.Size.Medium)));
            vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, reactionUserProfile.e), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
            return;
        }
        if ((e0Var instanceof uh20) && (bVar instanceof b.C1398b)) {
            uh20 uh20Var = (uh20) e0Var;
            uh20Var.l.setText(enj.f(R.plurals.post_reactions_modal_messenger_reposts, ((b.C1398b) bVar).a, uh20Var.itemView.getContext()));
            return;
        }
        if ((e0Var instanceof su1) && (bVar instanceof b.a)) {
            su1 su1Var = (su1) e0Var;
            b.a aVar2 = (b.a) bVar;
            su1Var.m = aVar2;
            ReactionUserProfile reactionUserProfile2 = aVar2.a;
            q030 q030Var = aVar2.b;
            VkCell vkCell2 = su1Var.l;
            if (reactionUserProfile2.C()) {
                i2 = R.drawable.group_placeholder;
            }
            kr5.a aVar3 = new kr5.a(new dqz0(reactionUserProfile2));
            aVar3.b(i2);
            s3q0 s3q0Var2 = s3q0.a;
            kr5 a = aVar3.a();
            ReactionMeta reactionMeta = reactionUserProfile2.h0;
            vkCell2.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new su1.c(a, reactionMeta != null ? reactionMeta.e(cn70.b(20)) : null), VkCell.Left.Main.Size.Small)));
            vkCell2.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, reactionUserProfile2.e), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
            if (reactionUserProfile2.j) {
                if (!d.M()) {
                    ClipsFeatures clipsFeatures = ClipsFeatures.CLIPS_FRIENDS_ACTIVITIES;
                    clipsFeatures.getClass();
                }
                gko.b bVar2 = gko.Companion;
                vkCell2.setRight(new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_message_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_accent_themed)), (Size) null, (tlo0) new tlo0.f(R.string.post_reactions_modal_cell_message_icon_description), false, (gzs) new ru1(su1Var, reactionUserProfile2, q030Var, 0), 20), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
                vkCell2.setTag(R.id.reaction_list_item_tag, reactionUserProfile2.e);
            }
            vkCell2.setRight((VkCell.Right.d) null);
            vkCell2.setTag(R.id.reaction_list_item_tag, reactionUserProfile2.e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new su1(viewGroup);
        }
        if (i == 2) {
            return new izq0(viewGroup);
        }
        if (i == 3) {
            return new uh20(viewGroup);
        }
        throw new IllegalStateException(lhg.a(i, "Unsupported view type: "));
    }
}
