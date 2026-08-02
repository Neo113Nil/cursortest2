package com.vk.stickers.bonus.catalog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.bonus.StickersBonusReward;
import com.vk.dto.stickers.bonus.StickersBonusRewardsCatalog;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.movika.sdk.base.ui.t;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bonus.utils.BonusCatalogScrollHelper;
import com.vk.stickers.bridge.GiftData;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.a0a;
import xsna.ak7;
import xsna.alb0;
import xsna.awt0;
import xsna.bn1;
import xsna.bpn0;
import xsna.bu0;
import xsna.bu1;
import xsna.bwt0;
import xsna.c5g;
import xsna.ck7;
import xsna.cn70;
import xsna.ds4;
import xsna.ek7;
import xsna.f4m;
import xsna.f60;
import xsna.fnj;
import xsna.fo6;
import xsna.g2v;
import xsna.ga;
import xsna.gk7;
import xsna.gko;
import xsna.hg1;
import xsna.i5s;
import xsna.iah0;
import xsna.ies;
import xsna.j5g;
import xsna.jk7;
import xsna.k00;
import xsna.kwg0;
import xsna.l00;
import xsna.n40;
import xsna.nk7;
import xsna.nl7;
import xsna.oz50;
import xsna.p1;
import xsna.p40;
import xsna.pk7;
import xsna.px0;
import xsna.qdz;
import xsna.qk7;
import xsna.qm1;
import xsna.r9;
import xsna.rsg0;
import xsna.sg0;
import xsna.sk4;
import xsna.sqe0;
import xsna.t9;
import xsna.tfx;
import xsna.tlo0;
import xsna.tq;
import xsna.tt0;
import xsna.tuz;
import xsna.v8l0;
import xsna.w40;
import xsna.w9;
import xsna.wk7;
import xsna.y9l0;
import xsna.yfb;
import xsna.yj7;
import xsna.yk7;
import xsna.za;
import xsna.zal0;
import xsna.zsw;

/* compiled from: BonusCatalogFragment.kt */
/* loaded from: classes5.dex */
public final class BonusCatalogFragment extends FragmentImpl implements ies, c.m<StickersBonusRewardsCatalog> {
    public static final /* synthetic */ int f0 = 0;
    public ContextUser O;
    public BottomSheetBehavior<View> R;
    public RecyclerPaginatedView S;
    public View T;
    public VkButton U;
    public TextView V;
    public com.vk.lists.c W;
    public BonusCatalogScrollHelper X;
    public VkCell Y;
    public final yj7 a0;
    public int b0;
    public StickersBonusReward c0;
    public final bpn0 d0;
    public final ds4 e0;
    public GiftData N = GiftData.d;
    public final bpn0 P = new bpn0(new bu0(2));
    public final bpn0 Q = new bpn0(new w9(3));
    public final bpn0 Z = new bpn0(new sk4(1));

    /* compiled from: BonusCatalogFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(BonusCatalogFragment.class, null, null);
        }
    }

    /* compiled from: BonusCatalogFragment.kt */
    public static final class b {
        public static String a() {
            return i5s.a(new StringBuilder("https://"), a0a.d, "/stickers/catalog/energy/rules");
        }
    }

    /* compiled from: BonusCatalogFragment.kt */
    public static final class c extends GridLayoutManager.c {
        public c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            BonusCatalogFragment bonusCatalogFragment = BonusCatalogFragment.this;
            if (bonusCatalogFragment.a0.h.get(i) instanceof qk7) {
                return 1;
            }
            return bonusCatalogFragment.b0;
        }
    }

    /* compiled from: BonusCatalogFragment.kt */
    public static final class d extends BottomSheetBehavior.d {
        public d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view, float f) {
            BonusCatalogFragment bonusCatalogFragment = BonusCatalogFragment.this;
            View view2 = bonusCatalogFragment.T;
            if (view2 == null) {
                view2 = null;
            }
            int height = (int) ((f + 1.0f) * view2.getHeight());
            RecyclerPaginatedView recyclerPaginatedView = bonusCatalogFragment.S;
            f4m.v(height, (recyclerPaginatedView != null ? recyclerPaginatedView : null).getRecyclerView());
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
            BonusCatalogFragment bonusCatalogFragment = BonusCatalogFragment.this;
            if (i == 5) {
                bonusCatalogFragment.c0 = null;
                bonusCatalogFragment.a0.J0(null);
            }
            int i2 = BonusCatalogFragment.f0;
            bonusCatalogFragment.fo();
        }
    }

    public BonusCatalogFragment() {
        yj7 yj7Var = new yj7();
        yj7Var.x0(ek7.class, new k00(this, 10));
        yj7Var.x0(nk7.class, new l00(this, 8));
        yj7Var.x0(pk7.class, new n40(this, 10));
        yj7Var.x0(qk7.class, new qm1(this, 7));
        yj7Var.x0(yk7.class, new p40(this, 14));
        yj7Var.x0(wk7.class, new r9(this, 7));
        yj7Var.x0(jk7.class, new com.vk.stickers.bonus.catalog.b(this, 1));
        yj7Var.x0(ak7.class, new p1(this, 12));
        yj7Var.x0(gk7.class, new t9(this, 9));
        this.a0 = yj7Var;
        this.b0 = 3;
        this.d0 = new bpn0(new w40(this, 12));
        this.e0 = new ds4(this, 1);
    }

    @Override // com.vk.lists.c.m
    public final q<StickersBonusRewardsCatalog> O9(String str, com.vk.lists.c cVar) {
        v8l0 eo = eo();
        eo.a.getClass();
        return rsg0.T(yfb.x(new tfx("store.getStickersBonusRewardsCatalog", new alb0(6), new sqe0(4)))).U(new tuz(new zsw(eo, 21), 13)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.R;
        if (bottomSheetBehavior == null) {
            return false;
        }
        if (bottomSheetBehavior == null) {
            bottomSheetBehavior = null;
        }
        if (bottomSheetBehavior.M == 5) {
            return false;
        }
        io();
        return true;
    }

    public final v8l0 eo() {
        return (v8l0) this.Z.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    public final void fo() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.R;
        if (bottomSheetBehavior == null) {
            bottomSheetBehavior = null;
        }
        if (bottomSheetBehavior.M == 5) {
            RecyclerPaginatedView recyclerPaginatedView = this.S;
            f4m.v(0, (recyclerPaginatedView != null ? recyclerPaginatedView : null).getRecyclerView());
            return;
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.S;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        RecyclerView recyclerView = recyclerPaginatedView2.getRecyclerView();
        ?? r2 = this.T;
        f4m.v((r2 != 0 ? r2 : null).getHeight(), recyclerView);
    }

    public final void go() {
        Iterable iterable;
        Collection<UserId> collection = this.N.b;
        if (collection == null || (iterable = j5g.O0(collection)) == null) {
            iterable = EmptyList.b;
        }
        zal0 a2 = g2v.d().a();
        Context requireContext = requireContext();
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((UserId) it.next()).b));
        }
        a2.u(requireContext, true, arrayList, this.O, "bonus_catalog_discount");
    }

    @Override // com.vk.lists.c.k
    public final q<StickersBonusRewardsCatalog> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    public final void ho() {
        ((qdz) this.d0.getValue()).f().a(requireContext(), b.a(), false);
    }

    public final void io() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.R;
        if (bottomSheetBehavior == null) {
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X(5);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        GiftData giftData;
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments == null || (giftData = (GiftData) arguments.getParcelable("arg_gift_data")) == null) {
            giftData = GiftData.d;
        }
        this.N = giftData;
        Bundle arguments2 = getArguments();
        this.O = arguments2 != null ? (ContextUser) arguments2.getParcelable("arg_context_user") : null;
        hg1.a(y9l0.a.subscribe(new f60(new za(this, 9), 7)), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.stickers_bonus_catalog_fragment_ds, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int i = 1;
        view.findViewById(R.id.background).setOnClickListener(new bn1(this, i));
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.toolbar);
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (!fnj.b(requireContext) && vkTopBar != null) {
            vkTopBar.setBack(new VkTopBar.b(new px0(this, 10), tq.h(tlo0.Companion, R.string.accessibility_back), null, null, null, 28));
        }
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.stickers_bonus_catalog_title), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        }
        if (vkTopBar != null) {
            vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_help_circle_outline_28), tq.h(tlo0.Companion, R.string.stickers_bonus_accessibility_help), new t(this, 11), null, null, null, 56), null, 6));
        }
        VkCell vkCell = (VkCell) view.findViewById(R.id.buy_cell);
        this.Y = vkCell;
        if (vkCell != null) {
            vkCell.setLeftMainPictureController(new nl7.b(((Number) this.Q.getValue()).floatValue()));
        }
        this.T = view.findViewById(R.id.buy_container);
        this.U = (VkButton) view.findViewById(R.id.buy_item_button);
        this.V = (TextView) view.findViewById(R.id.buy_item_offer);
        View view2 = this.T;
        if (view2 == null) {
            view2 = null;
        }
        BottomSheetBehavior<View> L = BottomSheetBehavior.L(view2);
        L.T(true);
        L.K = true;
        L.V(true);
        L.X(5);
        this.R = L;
        View view3 = this.T;
        if (view3 == null) {
            view3 = null;
        }
        view3.setOnClickListener(new sg0(this, i));
        View view4 = this.T;
        if (view4 == null) {
            view4 = null;
        }
        bwt0.h(view4, new bu1(this, 4));
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) view.findViewById(R.id.paginated_view);
        this.S = recyclerPaginatedView;
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView);
        dVar.f = 1;
        dVar.d(new tt0(this, 2));
        dVar.e = new c();
        dVar.a();
        int i2 = 0;
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.getRecyclerView().setScrollBarStyle(33554432);
        recyclerPaginatedView.getRecyclerView().addItemDecoration(new ck7());
        awt0.g(recyclerPaginatedView.getRecyclerView());
        recyclerPaginatedView.setAdapter(this.a0);
        RecyclerPaginatedView recyclerPaginatedView2 = this.S;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        this.X = new BonusCatalogScrollHelper(recyclerPaginatedView2.getRecyclerView(), cn70.b(8));
        c.h hVar = new c.h(this);
        hVar.l = false;
        hVar.m = false;
        RecyclerPaginatedView recyclerPaginatedView3 = this.S;
        if (recyclerPaginatedView3 == null) {
            recyclerPaginatedView3 = null;
        }
        com.vk.lists.c a2 = f.a(hVar, recyclerPaginatedView3);
        this.W = a2;
        a2.p(false);
        VkButton vkButton = this.U;
        if (vkButton == null) {
            vkButton = null;
        }
        bwt0.i0(vkButton, new com.vk.stickers.bonus.catalog.b(this, i2));
        BottomSheetBehavior<View> bottomSheetBehavior = this.R;
        (bottomSheetBehavior != null ? bottomSheetBehavior : null).D(new d());
        io();
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<StickersBonusRewardsCatalog> qVar, boolean z, com.vk.lists.c cVar) {
        hg1.a(qVar.subscribe(new ga(new fo6(2, cVar, this), 11), kwg0.b()), this);
    }
}
