package com.vk.stickers.details.fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.CommonVasStat$TypeIvasItemViews;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.details.AuthorSubscriptionRef;
import com.vk.stickers.details.fragment.StickerDetailsFragment;
import com.vk.stickers.details.holders.PackStylesListHolder;
import com.vk.stickers.views.LongtapRecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a5l0;
import xsna.a790;
import xsna.acf0;
import xsna.bbf0;
import xsna.bpn0;
import xsna.c5g;
import xsna.cvk;
import xsna.d120;
import xsna.d790;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.f3l0;
import xsna.g2v;
import xsna.g3l0;
import xsna.hg1;
import xsna.hzp0;
import xsna.i3l0;
import xsna.ies;
import xsna.iki0;
import xsna.ikv0;
import xsna.j3l0;
import xsna.j5g;
import xsna.kcl0;
import xsna.msy;
import xsna.oz50;
import xsna.p690;
import xsna.pbw0;
import xsna.qai0;
import xsna.r3l0;
import xsna.rdf0;
import xsna.s3l0;
import xsna.sdf0;
import xsna.smg;
import xsna.t3l0;
import xsna.t6g0;
import xsna.u690;
import xsna.ucl0;
import xsna.wug0;
import xsna.xqi0;
import xsna.y1l0;
import xsna.y5l0;
import xsna.y690;
import xsna.y6l0;
import xsna.y9l0;
import xsna.zl2;

/* compiled from: StickerDetailsFragment.kt */
/* loaded from: classes6.dex */
public final class StickerDetailsFragment extends BaseMvpFragment<i3l0> implements j3l0, ies {
    public static final /* synthetic */ int h0 = 0;
    public rdf0 U;
    public boolean V;
    public LongtapRecyclerView W;
    public f3l0 X;
    public t3l0 Z;
    public r3l0 a0;
    public View b0;
    public StickerStockItem c0;
    public ContextUser d0;
    public ucl0 f0;
    public final b T = new b();
    public final Bundle Y = new Bundle();
    public GiftData e0 = GiftData.d;
    public final Object g0 = msy.a(LazyThreadSafetyMode.NONE, new xqi0(1));

    /* compiled from: StickerDetailsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: StickerDetailsFragment.kt */
    public static final class b implements g3l0 {
        public b() {
        }

        @Override // xsna.g3l0
        public final void B(StickerStockItem stickerStockItem) {
            i3l0 i3l0Var = (i3l0) StickerDetailsFragment.this.S;
            if (i3l0Var != null) {
                i3l0Var.B(stickerStockItem);
            }
        }

        @Override // xsna.g3l0
        public final void N(StickerStockItem stickerStockItem, AuthorSubscriptionRef authorSubscriptionRef) {
            i3l0 i3l0Var = (i3l0) StickerDetailsFragment.this.S;
            if (i3l0Var != null) {
                i3l0Var.N(stickerStockItem, authorSubscriptionRef);
            }
        }

        @Override // xsna.g3l0
        public final void R(StickerStockItem stickerStockItem) {
            i3l0 i3l0Var = (i3l0) StickerDetailsFragment.this.S;
            if (i3l0Var != null) {
                i3l0Var.R(stickerStockItem);
            }
        }

        @Override // xsna.g3l0
        public final void e() {
            i3l0 i3l0Var = (i3l0) StickerDetailsFragment.this.S;
            if (i3l0Var != null) {
                i3l0Var.N0();
            }
        }

        @Override // xsna.g3l0
        public final void j0(StickerStockItem stickerStockItem) {
            i3l0 i3l0Var = (i3l0) StickerDetailsFragment.this.S;
            if (i3l0Var != null) {
                i3l0Var.j0(stickerStockItem);
            }
        }

        @Override // xsna.g3l0
        public final void k0(boolean z) {
            StickerDetailsFragment stickerDetailsFragment = StickerDetailsFragment.this;
            i3l0 i3l0Var = (i3l0) stickerDetailsFragment.S;
            if (i3l0Var != null) {
                i3l0Var.c5(stickerDetailsFragment.getActivity(), z);
            }
        }

        @Override // xsna.g3l0
        public final void l0(StickerStockItem stickerStockItem) {
            r3l0 r3l0Var = StickerDetailsFragment.this.a0;
            if (r3l0Var != null) {
                r3l0Var.Dk(stickerStockItem, null);
            }
        }

        @Override // xsna.g3l0
        public final void m0(long j, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action) {
            ucl0 ucl0Var = StickerDetailsFragment.this.f0;
            if (ucl0Var != null) {
                ucl0Var.a(j, action);
            }
        }
    }

    /* compiled from: StickerDetailsFragment.kt */
    public static final class c extends GridLayoutManager.c {
        public final /* synthetic */ f3l0 d;
        public final /* synthetic */ GridLayoutManager e;

        public c(f3l0 f3l0Var, GridLayoutManager gridLayoutManager) {
            this.d = f3l0Var;
            this.e = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            if (this.d.J0(i)) {
                return 1;
            }
            return this.e.s;
        }
    }

    public final void Ij() {
        cvk.u(R.string.error, false);
    }

    public final void jo(d790 d790Var, VmojiAvatarModel vmojiAvatarModel, Boolean bool, ArrayList arrayList, PackStylesListHolder.State state, int i, int i2, f3l0.a aVar) {
        boolean z;
        StickerStockItem stickerStockItem = d790Var.a;
        f3l0 f3l0Var = this.X;
        if (f3l0Var != null) {
            bpn0 bpn0Var = f3l0Var.p;
            kcl0 kcl0Var = f3l0Var.k;
            ArrayList arrayList2 = new ArrayList();
            StickerStockItem stickerStockItem2 = d790Var.a;
            arrayList2.add(new p690(stickerStockItem2, stickerStockItem2.R, stickerStockItem2.S));
            if (!stickerStockItem2.J.isEmpty()) {
                ArrayList arrayList3 = arrayList;
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    qai0 qai0Var = (qai0) it.next();
                    arrayList4.add(new qai0(qai0Var.a, qai0Var.b, true));
                }
                arrayList2.add(new a790(state, arrayList4, i, i2));
                ArrayList arrayList5 = new ArrayList();
                for (StickerStockItem stickerStockItem3 : d790Var.b) {
                    arrayList5.add(iki0.b);
                    arrayList5.add(new y690(stickerStockItem3, z, stickerStockItem3.R));
                    for (StickerItem stickerItem : stickerStockItem3.g) {
                        if (stickerItem.g.V0() && kcl0Var.K0() && ((Boolean) bpn0Var.getValue()).booleanValue()) {
                            arrayList5.add(new zl2(stickerItem, stickerStockItem3));
                        } else {
                            arrayList5.add(new y1l0(stickerItem, stickerStockItem3));
                        }
                    }
                    arrayList5.add(new u690(stickerStockItem3));
                    z = true;
                }
                iki0 iki0Var = iki0.b;
                arrayList5.add(iki0Var);
                arrayList2.addAll(arrayList5);
                arrayList2.add(iki0Var);
            }
            if (vmojiAvatarModel != null && stickerStockItem2.Q) {
                ContextUser contextUser = f3l0Var.m;
                if ((contextUser != null ? contextUser.f : null) != null && !epx.f(contextUser.f, vmojiAvatarModel.b.Ab())) {
                    arrayList2.add(new pbw0(vmojiAvatarModel, epx.f(bool, Boolean.TRUE)));
                    arrayList2.add(iki0.b);
                }
            }
            arrayList2.add(new y690(d790Var.a));
            for (StickerItem stickerItem2 : stickerStockItem2.g) {
                if (stickerItem2.g.V0() && kcl0Var.K0() && ((Boolean) bpn0Var.getValue()).booleanValue()) {
                    arrayList2.add(new zl2(stickerItem2, stickerStockItem2));
                } else {
                    arrayList2.add(new y1l0(stickerItem2, stickerStockItem2));
                }
            }
            arrayList2.add(new u690(stickerStockItem2));
            if (aVar instanceof f3l0.a.C2847a) {
                int i3 = 0;
                for (Object obj : ((f3l0.a.C2847a) aVar).a) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    arrayList2.add(iki0.b);
                    arrayList2.add(new bbf0((StickerPackRecommendationBlock) obj, stickerStockItem2, stickerStockItem2.S, i4));
                    i3 = i4;
                }
            } else {
                if (!epx.f(aVar, f3l0.a.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList2.add(acf0.b);
            }
            f3l0Var.setItems(arrayList2);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((qai0) obj2).b) {
                arrayList6.add(obj2);
            }
        }
        StickerStockItem stickerStockItem4 = arrayList6.isEmpty() ? stickerStockItem : arrayList6.size() == 1 ? ((qai0) j5g.Y(arrayList6)).a : null;
        t3l0 t3l0Var = this.Z;
        if (t3l0Var != null) {
            if (stickerStockItem4 != null) {
                stickerStockItem = stickerStockItem4;
            }
            t3l0Var.Oh(stickerStockItem, d790Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void ko(final boolean z) {
        FragmentActivity activity = getActivity();
        Context h = activity != null ? e3m.h(activity) : null;
        final AppCompatActivity appCompatActivity = h instanceof AppCompatActivity ? (AppCompatActivity) h : null;
        ((Handler) this.g0.getValue()).postDelayed(new Runnable() { // from class: xsna.k3l0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.fragment.app.d dVar;
                Window window;
                FragmentManager supportFragmentManager;
                List<Fragment> f;
                Object obj;
                int i = StickerDetailsFragment.h0;
                AppCompatActivity appCompatActivity2 = AppCompatActivity.this;
                if (appCompatActivity2 == null || (supportFragmentManager = appCompatActivity2.getSupportFragmentManager()) == null || (f = supportFragmentManager.c.f()) == null) {
                    dVar = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : f) {
                        if (obj2 instanceof androidx.fragment.app.d) {
                            arrayList.add(obj2);
                        }
                    }
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj = null;
                            break;
                        }
                        obj = listIterator.previous();
                        androidx.fragment.app.d dVar2 = (androidx.fragment.app.d) obj;
                        Dialog dialog = dVar2.s;
                        boolean z2 = true;
                        if (!(dialog != null ? dialog.isShowing() : true) || !dVar2.isAdded() || dVar2.isHidden() || dVar2.isRemoving()) {
                            z2 = false;
                        }
                        if (z2) {
                            break;
                        }
                    }
                    dVar = (androidx.fragment.app.d) obj;
                }
                Dialog dialog2 = dVar != null ? dVar.s : null;
                if (dialog2 == null || (window = dialog2.getWindow()) == null) {
                    window = appCompatActivity2 != null ? appCompatActivity2.getWindow() : null;
                }
                boolean z3 = z;
                StickerDetailsFragment stickerDetailsFragment = this;
                String string = z3 ? stickerDetailsFragment.getString(R.string.stickers_subscribed_to_author_message) : stickerDetailsFragment.getString(R.string.stickers_unsubscribed_to_author_message);
                if (window != null) {
                    ikv0.a aVar = new ikv0.a(stickerDetailsFragment.requireContext());
                    aVar.u = new ikv0.d(new ikv0.d.c(string), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar.t = ikv0.c.f.a;
                    aVar.e = 2000L;
                    aVar.p(window);
                }
            }
        }, 200L);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        GiftData giftData;
        super.onCreate(bundle);
        if (getParentFragment() instanceof t3l0) {
            this.Z = (t3l0) getParentFragment();
        }
        if (getParentFragment() instanceof r3l0) {
            this.a0 = (r3l0) getParentFragment();
        }
        this.U = getParentFragment() instanceof sdf0 ? ((sdf0) getParentFragment()).ii() : new rdf0();
        Bundle arguments = getArguments();
        this.c0 = arguments != null ? (StickerStockItem) arguments.getParcelable("sticker_pack_data") : null;
        Bundle arguments2 = getArguments();
        this.d0 = arguments2 != null ? (ContextUser) arguments2.getParcelable("key_context_user") : null;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (giftData = (GiftData) arguments3.getParcelable("key_gift_data")) == null) {
            giftData = GiftData.d;
        }
        this.e0 = giftData;
        Bundle arguments4 = getArguments();
        SearchStatsLoggingInfo searchStatsLoggingInfo = arguments4 != null ? (SearchStatsLoggingInfo) arguments4.getParcelable("search_stats_logging_info") : null;
        StickerStockItem stickerStockItem = this.c0;
        String str = searchStatsLoggingInfo != null ? searchStatsLoggingInfo.f : null;
        if (stickerStockItem != null && str != null) {
            this.f0 = new ucl0(str, stickerStockItem.b);
        }
        rdf0 rdf0Var = this.U;
        this.S = new s3l0(this, rdf0Var != null ? rdf0Var : null);
        hg1.a(y9l0.a.subscribe(new d120(new wug0(this, 6), 16)), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f3l0 f3l0Var;
        View inflate = layoutInflater.inflate(R.layout.sticker_details_layout, viewGroup, false);
        LongtapRecyclerView longtapRecyclerView = (LongtapRecyclerView) inflate.findViewById(R.id.longtap_recycler);
        this.W = longtapRecyclerView;
        if (longtapRecyclerView != null) {
            smg smgVar = new smg(g2v.d().a(), g2v.d().e(kn()));
            t6g0 t6g0Var = t6g0.b;
            kcl0 d = t6g0.d();
            rdf0 rdf0Var = this.U;
            f3l0 f3l0Var2 = new f3l0(this.T, smgVar, d, rdf0Var == null ? null : rdf0Var, this.d0, this.e0);
            this.X = f3l0Var2;
            longtapRecyclerView.setAdapter(f3l0Var2);
            LongtapRecyclerView longtapRecyclerView2 = this.W;
            if (longtapRecyclerView2 != null) {
                getActivity();
                GridLayoutManager gridLayoutManager = new GridLayoutManager(4, 1);
                gridLayoutManager.x = new c(f3l0Var2, gridLayoutManager);
                longtapRecyclerView2.setLayoutManager(gridLayoutManager);
            }
            longtapRecyclerView.setLongtapListener(new a5l0(f3l0Var2, (y5l0) this.S, new y6l0(inflate.getContext(), false)));
        }
        this.b0 = inflate.findViewById(R.id.stickerpack_load_progress);
        i3l0 i3l0Var = (i3l0) this.S;
        if ((i3l0Var != null && !i3l0Var.T1()) || this.V) {
            this.V = false;
            StickerStockItem stickerStockItem = this.c0;
            if (stickerStockItem != null) {
                VmojiAvatarModel p = stickerStockItem.Q ? t6g0.d().p() : null;
                i3l0 i3l0Var2 = (i3l0) this.S;
                if (i3l0Var2 != null) {
                    i3l0Var2.g1(stickerStockItem, p);
                }
            }
        }
        Bundle bundle2 = this.Y;
        if (!bundle2.isEmpty() && (f3l0Var = this.X) != null) {
            f3l0Var.o = bundle2;
            Iterator it = f3l0Var.r.iterator();
            while (it.hasNext()) {
                ((f3l0.c) it.next()).d(bundle2);
            }
        }
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        f3l0 f3l0Var = this.X;
        if (f3l0Var != null) {
            Iterator it = f3l0Var.r.iterator();
            while (it.hasNext()) {
                ((f3l0.c) it.next()).b2(this.Y);
            }
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UserId userId;
        super.onViewCreated(view, bundle);
        StickerStockItem stickerStockItem = this.c0;
        if (stickerStockItem != null) {
            ArrayList arrayList = new ArrayList();
            CommonVasStat$TypeIvasItemViews.BlockType blockType = CommonVasStat$TypeIvasItemViews.BlockType.SCREEN;
            arrayList.add(Integer.valueOf(stickerStockItem.b));
            String str = stickerStockItem.O;
            Long l = null;
            CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = str != null ? new CommonStat$TypeTrackCodeItem(str) : null;
            ContextUser contextUser = this.d0;
            if (contextUser != null && (userId = contextUser.b) != null) {
                l = Long.valueOf(userId.b);
            }
            new hzp0.w(new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, null, null, 62, null), new CommonVasStat$TypeIvasItemViews(CommonVasStat$TypeIvasItemViews.ItemType.STICKER_PACK, arrayList, null, blockType, null, null, commonStat$TypeTrackCodeItem, null, l, null, null, null, 3600, null)).a();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        if (this.c0 != null) {
            uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, Long.valueOf(r0.b), null, null, null, null, 60, null);
        }
    }
}
