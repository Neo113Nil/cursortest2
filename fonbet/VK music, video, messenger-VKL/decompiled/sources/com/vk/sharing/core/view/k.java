package com.vk.sharing.core.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.button.IconBackgroundStyle;
import com.vk.core.view.components.cell.button.IconSize;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.core.view.components.tile.VkTile;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.view.b;
import com.vk.sharing.core.view.b.a;
import com.vk.sharing.core.view.grid.LayoutMode;
import com.vk.sharing.core.view.i;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwt0;
import xsna.epx;
import xsna.exi0;
import xsna.j4o0;
import xsna.k4o0;
import xsna.ngu;
import xsna.oq;
import xsna.t6s;
import xsna.te5;
import xsna.tlo0;
import xsna.ug;
import xsna.zxt0;

/* compiled from: TargetsAdapter.kt */
/* loaded from: classes5.dex */
public final class k extends RecyclerView.Adapter<RecyclerView.e0> {
    public final f c;
    public final a d;
    public final Integer e;
    public final boolean f;
    public LayoutMode g;
    public boolean h;
    public boolean i;

    /* compiled from: TargetsAdapter.kt */
    public interface a {
        void a();
    }

    /* compiled from: TargetsAdapter.kt */
    public static final class b extends m.b {
        public final List<Target> b;
        public final List<Target> c;

        public b(List<Target> list, List<Target> list2) {
            this.b = list;
            this.c = list2;
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areContentsTheSame(int i, int i2) {
            Target target = this.b.get(i);
            Target target2 = this.c.get(i2);
            return epx.f(target.d, target2.d) && target.g == target2.g && epx.f(target.i, target2.i) && epx.f(target.j, target2.j);
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areItemsTheSame(int i, int i2) {
            return epx.f(this.b.get(i), this.c.get(i2));
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getNewListSize() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getOldListSize() {
            return this.b.size();
        }
    }

    /* compiled from: TargetsAdapter.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutMode.values().length];
            try {
                iArr[LayoutMode.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutMode.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public k(f fVar, a aVar, Integer num, boolean z, LayoutMode layoutMode) {
        this.c = fVar;
        this.d = aVar;
        this.e = num;
        this.f = z;
        this.g = layoutMode;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return (x0() ? 1 : 0) + this.c.getTargets().size() + (this.i ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (x0() && i == 0) {
            return 0L;
        }
        boolean z = this.i;
        f fVar = this.c;
        if (z) {
            if (i == (x0() ? 1 : 0) + fVar.getTargets().size()) {
                return -1L;
            }
        }
        return fVar.getTargets().get(i - (x0() ? 1 : 0)).c.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (x0() && i == 0) {
            return 0;
        }
        if (this.i) {
            if (i == (x0() ? 1 : 0) + this.c.getTargets().size()) {
                return 3;
            }
        }
        int i2 = c.$EnumSwitchMapping$0[this.g.ordinal()];
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        int i2 = i - (x0() ? 1 : 0);
        boolean z = e0Var instanceof h;
        f fVar = this.c;
        if (z) {
            Target target = fVar.getTargets().get(i2);
            j jVar = ((h) e0Var).m;
            jVar.setTarget(target);
            jVar.setPosition(Integer.valueOf(i2));
            return;
        }
        if (!(e0Var instanceof i)) {
            if (e0Var instanceof com.vk.sharing.core.view.b) {
                com.vk.sharing.core.view.b bVar = (com.vk.sharing.core.view.b) e0Var;
                Target target2 = fVar.getTargets().get(i2);
                if (target2 == null) {
                    return;
                }
                VkTile vkTile = (VkTile) bVar.itemView;
                vkTile.setOnClickListener(new ngu(0, bVar, target2));
                vkTile.setTitle(new VkTile.e(oq.d(tlo0.Companion, target2.d), 2, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
                vkTile.setVisualContentController(bVar.new a(vkTile.getContext()));
                vkTile.setVisualContentParams(new b.C1781b(target2.i, target2.j, target2.g, true));
                return;
            }
            return;
        }
        i iVar = (i) e0Var;
        Target target3 = fVar.getTargets().get(i2);
        if (target3 == null) {
            return;
        }
        VkCell vkCell = iVar.m;
        vkCell.setOnClickListener(new te5(8, iVar, target3));
        vkCell.setLeftMainAvatarController(new i.b());
        VkCell.Left.a aVar = VkCell.Left.Companion;
        Dialog dialog = target3.i;
        ProfilesSimpleInfo profilesSimpleInfo = target3.j;
        i.a.C1782a c1782a = new i.a.C1782a();
        c1782a.a = dialog;
        c1782a.b = profilesSimpleInfo;
        vkCell.setLeft(VkCell.Left.a.a(aVar, new VkCell.Left.Main.a(c1782a, VkCell.Left.Main.Size.Small)));
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, target3.d), 1, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 58), null, null, 14));
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.a(4, new com.vk.movika.sdk.base.logic.processor.actions.e(20, iVar, target3), target3.g), null, 27));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        f fVar = this.c;
        if (i == 2) {
            return new com.vk.sharing.core.view.b(fVar, new VkTile(viewGroup.getContext(), null, 6));
        }
        boolean z = this.f;
        if (z && i == 0) {
            VkCellButton vkCellButton = new VkCellButton(viewGroup.getContext(), null, 6);
            bwt0.i0(vkCellButton, new exi0(this, 11));
            vkCellButton.setLayoutParams(new RecyclerView.p(-1, -2));
            vkCellButton.setTitle(R.string.sharing_action_button_label_create_chat);
            vkCellButton.setIconSize(IconSize.Small);
            vkCellButton.setIconBackgroundStyle(IconBackgroundStyle.Circle);
            vkCellButton.a(true, Integer.valueOf(R.drawable.vk_icon_add_outline_24));
            return new k4o0(vkCellButton);
        }
        if (z && i == 1) {
            return new i(fVar, View.inflate(viewGroup.getContext(), R.layout.layout_share_target_holder_v2, null));
        }
        if (i != 0) {
            return i == 3 ? new t6s(View.inflate(viewGroup.getContext(), R.layout.layout_footer_loading_holder, null)) : new h(fVar, new j(viewGroup.getContext()), this.e);
        }
        View inflate = View.inflate(viewGroup.getContext(), R.layout.layout_share_create_chat_target_view, null);
        inflate.setOnClickListener(new ug(this, 7));
        inflate.setLayoutParams(new RecyclerView.p(-1, View.MeasureSpec.makeMeasureSpec(viewGroup.getResources().getDimensionPixelSize(R.dimen.sharing_target_with_send_action_height), 1073741824)));
        return new j4o0(inflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(RecyclerView.e0 e0Var) {
        e0Var.itemView.animate().cancel();
        e0Var.itemView.setHasTransientState(false);
        e0Var.itemView.setAlpha(1.0f);
        if (!(e0Var instanceof zxt0)) {
            return true;
        }
        ((zxt0) e0Var).R4();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        super.onViewDetachedFromWindow(e0Var);
        if (e0Var instanceof zxt0) {
            ((zxt0) e0Var).R4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        super.onViewRecycled(e0Var);
        if (e0Var instanceof com.vk.sharing.core.view.b) {
            VkTile vkTile = (VkTile) ((com.vk.sharing.core.view.b) e0Var).itemView;
            vkTile.setVisualContentParams(b.C1781b.a((b.C1781b) vkTile.getVisualContentParams(), false, 14));
        }
        if (e0Var instanceof zxt0) {
            ((zxt0) e0Var).R4();
        }
    }

    public final boolean x0() {
        return this.h && this.d != null;
    }

    public final void y0(boolean z) {
        boolean z2 = this.i;
        this.i = z;
        f fVar = this.c;
        if (z && !z2) {
            notifyItemInserted((x0() ? 1 : 0) + fVar.getTargets().size());
        } else {
            if (z || !z2) {
                return;
            }
            notifyItemRemoved((x0() ? 1 : 0) + fVar.getTargets().size());
        }
    }
}
