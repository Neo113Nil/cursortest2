package com.vk.superapp.browser.internal.ui.menu.action;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.hints.HintId;
import com.vk.superapp.browser.internal.ui.banner.PersonalBannerView;
import com.vk.superapp.browser.internal.ui.menu.action.b;
import com.vk.superapp.browser.internal.ui.menu.action.j;
import com.vk.superapp.browser.internal.ui.menu.action.l;
import com.vk.superapp.browser.internal.ui.menu.action.n;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.cp2;
import xsna.e370;
import xsna.epx;
import xsna.f4m;
import xsna.fnj;
import xsna.iah0;
import xsna.k1u0;
import xsna.khp;
import xsna.ni0;
import xsna.oq;
import xsna.pla;
import xsna.tlo0;
import xsna.tq;
import xsna.x7g;

/* compiled from: ActionMenuAdapter.kt */
/* loaded from: classes6.dex */
public final class a extends RecyclerView.Adapter<RecyclerView.e0> {
    public final c c;
    public final n.b d;
    public List<? extends b> e = EmptyList.b;

    public a(c cVar, n.b bVar) {
        this.c = cVar;
        this.d = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (i >= this.e.size()) {
            return 10;
        }
        return this.e.get(i).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (i >= this.e.size()) {
            return;
        }
        b bVar = this.e.get(i);
        if (bVar instanceof b.C1871b) {
            if (e0Var instanceof m) {
                m mVar = (m) e0Var;
                b.C1871b c1871b = (b.C1871b) bVar;
                View view = mVar.o;
                TextView textView = mVar.m;
                boolean z = c1871b.d;
                mVar.l = z;
                VKImageController<View> vKImageController = mVar.p;
                vKImageController.f(c1871b.c, new VKImageController.b(8.0f, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65534));
                mVar.n.setText(c1871b.b);
                if (!z) {
                    textView.setVisibility(8);
                    float f = 10;
                    f4m.t(iah0.a(f), vKImageController.getView());
                    f4m.t(iah0.a(f), view);
                    return;
                }
                textView.setVisibility(0);
                mVar.itemView.setClickable(true);
                float f2 = 16;
                f4m.t(iah0.a(f2), vKImageController.getView());
                f4m.t(iah0.a(f2), view);
                return;
            }
            return;
        }
        if (bVar instanceof b.e) {
            if (e0Var instanceof j) {
                j jVar = (j) e0Var;
                b.e eVar = (b.e) bVar;
                j.b bVar2 = jVar.l;
                VkGroupHeader vkGroupHeader = jVar.n;
                ShimmerFrameLayout shimmerFrameLayout = jVar.m;
                List<i> list = eVar.c;
                String str = eVar.b;
                if (str == null) {
                    shimmerFrameLayout.setVisibility(0);
                    shimmerFrameLayout.c();
                } else {
                    shimmerFrameLayout.d();
                    shimmerFrameLayout.setVisibility(8);
                    vkGroupHeader.setVisibility(0);
                    vkGroupHeader.setTitle(new VkGroupHeader.d(oq.d(tlo0.Companion, str), null, null, null, 0, 510));
                    vkGroupHeader.setSize(VkGroupHeader.Size.Small);
                }
                if (epx.f(list, bVar2.d)) {
                    return;
                }
                bVar2.d = list;
                bVar2.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (bVar instanceof b.c) {
            if (e0Var instanceof l) {
                List<HorizontalAction> list2 = ((b.c) bVar).b;
                l.b bVar3 = ((l) e0Var).l;
                if (epx.f(list2, bVar3.d)) {
                    return;
                }
                bVar3.d = list2;
                bVar3.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (!(bVar instanceof b.d)) {
            if (!(bVar instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (e0Var instanceof h) {
                h hVar = (h) e0Var;
                ((PersonalBannerView) hVar.itemView).P4(((b.a) bVar).b, PersonalBannerView.Source.ACTION_MENU, new g(hVar));
                cp2.c(hVar.itemView, 0L, 0L, null, null, 15);
                return;
            }
            return;
        }
        if (e0Var instanceof e) {
            e eVar2 = (e) e0Var;
            b.d dVar = (b.d) bVar;
            VkCell vkCell = eVar2.o;
            OtherAction otherAction = dVar.b;
            if (dVar.c) {
                Object[] objArr = otherAction == OtherAction.ALLOW_BADGES || otherAction == OtherAction.DISALLOW_BADGES;
                boolean z2 = e370.s != null && pla.e().b().m(HintId.INFO_MINI_APPS_BADGES_ACTION_MENU);
                if (objArr != false && z2) {
                    f4m.a(eVar2.itemView, new ni0(11, eVar2, otherAction));
                }
            }
            eVar2.n = otherAction;
            vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, otherAction.j()), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) (0 == true ? 1 : 0), 14));
            vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(otherAction.i(), VkCell.Left.Main.Size.Medium, (k1u0) new k1u0.a(new x7g(otherAction.h())), (tlo0.h) (0 == true ? 1 : 0), 8), null));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        c cVar = this.c;
        if (i == 0) {
            return new m(cVar, from, viewGroup);
        }
        if (i == 1) {
            return new j(cVar, from, viewGroup);
        }
        if (i == 2) {
            return new l(cVar, from, viewGroup);
        }
        if (i == 3) {
            return new e(cVar, this.d, from, viewGroup);
        }
        if (i == 4) {
            return new h(cVar, viewGroup.getContext());
        }
        if (i != 10) {
            throw new IllegalStateException();
        }
        khp khpVar = new khp(from.inflate(R.layout.vk_action_menu_empty_space, viewGroup, false));
        View view = khpVar.itemView;
        Context context = view.getContext();
        HashSet hashSet = iah0.a;
        f4m.n(fnj.a(context), view);
        return khpVar;
    }
}
