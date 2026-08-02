package com.vk.ecomm.reviews.impl.allreviews;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import com.vk.ecomm.reviews.impl.allreviews.presentation.d;
import com.vk.ecomm.reviews.impl.allreviews.presentation.e;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.model.CreateMarketItemReviewResult;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.b9;
import xsna.cs00;
import xsna.d2y;
import xsna.dhr0;
import xsna.dko;
import xsna.ds00;
import xsna.ef90;
import xsna.enh;
import xsna.f4z;
import xsna.flu;
import xsna.fnj;
import xsna.fpf0;
import xsna.ft00;
import xsna.g1j;
import xsna.gko;
import xsna.hvt0;
import xsna.iah0;
import xsna.jf90;
import xsna.js00;
import xsna.jt00;
import xsna.k5h;
import xsna.k7y;
import xsna.kj50;
import xsna.km50;
import xsna.ls00;
import xsna.lxz;
import xsna.mk50;
import xsna.msy;
import xsna.mzp0;
import xsna.owv;
import xsna.oz50;
import xsna.pb00;
import xsna.rzp0;
import xsna.smg;
import xsna.sop;
import xsna.tlo0;
import xsna.tzv;
import xsna.ubw;
import xsna.vk50;
import xsna.wr00;
import xsna.xn50;
import xsna.yw90;
import xsna.zrd0;
import xsna.zs00;

/* compiled from: MarketAllReviewsFragment.kt */
/* loaded from: classes.dex */
public final class MarketAllReviewsFragment extends MviImplFragment<com.vk.ecomm.reviews.impl.allreviews.presentation.b, e, com.vk.ecomm.reviews.impl.allreviews.presentation.a> {
    public static final /* synthetic */ int d0 = 0;
    public SwipeRefreshLayout Q;
    public RecyclerView R;
    public VkSpinner S;
    public VkPlaceholder T;
    public NestedScrollView U;
    public wr00 V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final jt00 a0;
    public final b b0;
    public final c c0;

    /* compiled from: MarketAllReviewsFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
        public a() {
            super(MarketAllReviewsFragment.class, null, null);
        }
    }

    /* compiled from: MarketAllReviewsFragment.kt */
    /* loaded from: classes18.dex */
    public static final class b implements ds00<cs00> {
        public b() {
        }

        @Override // xsna.ds00
        public final void a(cs00 cs00Var) {
            com.vk.ecomm.reviews.impl.allreviews.presentation.a[] aVarArr;
            MarketAllReviewsFragment marketAllReviewsFragment = MarketAllReviewsFragment.this;
            marketAllReviewsFragment.a0.getClass();
            if (cs00Var instanceof cs00.a) {
                cs00.a aVar = (cs00.a) cs00Var;
                aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.q(aVar.a, aVar.b, aVar.c)};
            } else if (cs00Var instanceof cs00.b) {
                aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.f(((cs00.b) cs00Var).a)};
            } else if (cs00Var instanceof cs00.h) {
                aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.i(((cs00.h) cs00Var).a)};
            } else {
                boolean z = cs00Var instanceof cs00.k;
                if (z) {
                    aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.d(((cs00.k) cs00Var).a)};
                } else if (z) {
                    aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.d(((cs00.k) cs00Var).a)};
                } else if (cs00Var instanceof cs00.g) {
                    cs00.g gVar = (cs00.g) cs00Var;
                    aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.e.b(gVar.a, gVar.b)};
                } else if (cs00Var instanceof cs00.c) {
                    cs00.c cVar = (cs00.c) cs00Var;
                    aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.e.C1005a(cVar.a, cVar.b)};
                } else if (cs00Var instanceof cs00.d) {
                    cs00.d dVar = (cs00.d) cs00Var;
                    aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.g.c(dVar.a, dVar.b)};
                } else if (cs00Var instanceof cs00.i) {
                    cs00.i iVar = (cs00.i) cs00Var;
                    aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.j.c(iVar.b, iVar.a)};
                } else if (cs00Var instanceof cs00.e) {
                    aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.g.b(((cs00.e) cs00Var).a)};
                } else if (cs00Var instanceof cs00.m) {
                    aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.g.d(((cs00.m) cs00Var).a)};
                } else if (cs00Var instanceof cs00.n) {
                    aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.j.d(((cs00.n) cs00Var).a)};
                } else if (cs00Var instanceof cs00.j) {
                    aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.b(((cs00.j) cs00Var).a)};
                } else if (cs00Var instanceof cs00.f) {
                    aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.C1004a(((cs00.f) cs00Var).a)};
                } else if (cs00Var instanceof cs00.o) {
                    aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{new a.o(((cs00.o) cs00Var).a)};
                } else {
                    if (!(cs00Var instanceof cs00.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVarArr = new com.vk.ecomm.reviews.impl.allreviews.presentation.a[]{a.l.b};
                }
            }
            xn50.a.d(marketAllReviewsFragment, (kj50[]) Arrays.copyOf(aVarArr, aVarArr.length));
        }
    }

    /* compiled from: MarketAllReviewsFragment.kt */
    /* loaded from: classes18.dex */
    public static final class c implements dhr0.e {
        public c() {
        }

        @Override // xsna.dhr0.e
        public final void sb(VKTheme vKTheme) {
            VkPlaceholder vkPlaceholder = MarketAllReviewsFragment.this.T;
            if (vkPlaceholder != null) {
                MarketAllReviewsFragment.fo(vkPlaceholder);
            }
        }
    }

    public MarketAllReviewsFragment() {
        tzv tzvVar = new tzv(this, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.W = msy.a(lazyThreadSafetyMode, tzvVar);
        this.X = msy.a(lazyThreadSafetyMode, new k7y(this, 4));
        this.Y = msy.a(lazyThreadSafetyMode, new ubw(this, 6));
        this.Z = msy.a(lazyThreadSafetyMode, new enh(this, 25));
        this.a0 = new jt00();
        this.b0 = new b();
        this.c0 = new c();
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MARKET_REVIEWS_SECTION, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.MARKET_REVIEWS_SECTION).j();
        yw90Var.init();
        this.L = yw90Var;
    }

    public static void fo(VkPlaceholder vkPlaceholder) {
        int i;
        if (dhr0.M()) {
            i = R.drawable.vk_icon_illustration_antenna_dark_56;
            dko.a.a(R.drawable.vk_icon_illustration_antenna_dark_56);
        } else {
            i = R.drawable.vk_icon_illustration_antenna_light_56;
            dko.a.a(R.drawable.vk_icon_illustration_antenna_light_56);
        }
        vkPlaceholder.setTop(new VkPlaceholder.c.b(gko.c(i), null, null, 30));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.market_all_reviews_fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        VkTopBar.c.f fVar;
        e eVar = (e) ao50Var;
        dhr0.f(this.c0);
        this.S = (VkSpinner) hvt0.c(R.id.spinner, view);
        this.U = (NestedScrollView) hvt0.c(R.id.dummy_sv, view);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.topbar);
        tlo0.Companion.getClass();
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tlo0.a.b(R.string.market_all_reviews_toolbar_title), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        VkPlaceholder vkPlaceholder = null;
        if (fnj.c(requireContext)) {
            dko.a.a(R.drawable.vk_icon_arrow_left_outline_28);
            fVar = new VkTopBar.c.f(gko.c(R.drawable.vk_icon_arrow_left_outline_28), null, new k5h(this, 28), null, null, 58);
        } else {
            fVar = null;
        }
        vkTopBar.setBefore(fVar);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.reviews_swipe_container);
        this.Q = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.is00
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                int i = MarketAllReviewsFragment.d0;
                a.n nVar = a.n.b;
                MarketAllReviewsFragment marketAllReviewsFragment = MarketAllReviewsFragment.this;
                marketAllReviewsFragment.getClass();
                xn50.a.c(marketAllReviewsFragment, nVar);
            }
        });
        this.R = (RecyclerView) view.findViewById(R.id.reviews_rv);
        wr00 wr00Var = new wr00(getViewLifecycleOwner(), this.b0);
        this.V = wr00Var;
        RecyclerView recyclerView = this.R;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(wr00Var);
        RecyclerView recyclerView2 = this.R;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.addOnScrollListener(new ef90(new jf90(new flu(this, 12))));
        RecyclerView recyclerView3 = this.R;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(new ls00(this));
        VkPlaceholder vkPlaceholder2 = (VkPlaceholder) hvt0.c(R.id.error_placeholder, view);
        if (vkPlaceholder2 != null) {
            fo(vkPlaceholder2);
            vkPlaceholder = vkPlaceholder2;
        }
        this.T = vkPlaceholder;
        xn50.a.b(this, eVar.a(), new js00(0, this, view));
        xn50.a.b(this, eVar.c(), new g1j(this, 22));
        xn50.a.b(this, eVar.d(), new lxz(this, 1));
        xn50.a.b(this, eVar.e(), new sop(this, 24));
        xn50.a.b(this, eVar.b(), new owv(this, 3));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        com.vk.ecomm.reviews.impl.allreviews.presentation.b bVar = (com.vk.ecomm.reviews.impl.allreviews.presentation.b) vk50Var;
        ((f4z) bVar.V()).a(new d2y(this, 4), this);
        bVar.U().a(new pb00(this, 2), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        Parcelable parcelable;
        Object parcelable2;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || i != 111722 || intent == null || (bundleExtra = intent.getBundleExtra("create_market_item_result")) == null) {
            return;
        }
        String l = fpf0.a(CreateMarketItemReviewResult.class).l();
        if (l == null) {
            l = "";
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundleExtra.getParcelable(l, CreateMarketItemReviewResult.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundleExtra.getParcelable(l);
            if (!(parcelable3 instanceof CreateMarketItemReviewResult)) {
                parcelable3 = null;
            }
            parcelable = (CreateMarketItemReviewResult) parcelable3;
        }
        CreateMarketItemReviewResult createMarketItemReviewResult = (CreateMarketItemReviewResult) parcelable;
        if (createMarketItemReviewResult == null || createMarketItemReviewResult.d() == null || createMarketItemReviewResult.e() == null) {
            return;
        }
        xn50.a.c(this, new a.k(createMarketItemReviewResult.d().longValue(), createMarketItemReviewResult.e().floatValue(), createMarketItemReviewResult.g(), createMarketItemReviewResult.f()));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getChildFragmentManager().l0("create_community_review_result", this, new b9(this, 21));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dhr0.a.getClass();
        dhr0.X(this.c0);
        super.onDestroyView();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new com.vk.ecomm.reviews.impl.allreviews.presentation.b(new d(new ft00(0)), new smg(new zs00()), this.J);
    }
}
