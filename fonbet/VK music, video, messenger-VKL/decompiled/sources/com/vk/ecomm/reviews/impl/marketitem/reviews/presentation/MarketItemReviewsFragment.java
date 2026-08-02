package com.vk.ecomm.reviews.impl.marketitem.reviews.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.components.topbar.VkTopBar$Middle$Cell$Middle$Text;
import com.vk.core.view.interop.model.ContentScale;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.reviews.api.model.MarketItemReviewsArguments;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.model.CreateMarketItemReviewResult;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.imageloader.view.VKImageView;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.movika.sdk.base.observable.e0;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.sharing.api.dto.Target;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.Cnew;
import xsna.a410;
import xsna.a510;
import xsna.ao50;
import xsna.b410;
import xsna.bhg0;
import xsna.blk;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c410;
import xsna.cn70;
import xsna.cty;
import xsna.cww;
import xsna.dhr0;
import xsna.djg0;
import xsna.dko;
import xsna.e2g0;
import xsna.ef90;
import xsna.eig0;
import xsna.f410;
import xsna.f4z;
import xsna.fnj;
import xsna.fpf0;
import xsna.fy2;
import xsna.gko;
import xsna.gxh;
import xsna.gzv;
import xsna.h410;
import xsna.hoz;
import xsna.hvt0;
import xsna.iah0;
import xsna.ies;
import xsna.iid;
import xsna.izs;
import xsna.j410;
import xsna.j4x;
import xsna.jf90;
import xsna.jjc;
import xsna.k7p0;
import xsna.k7y;
import xsna.km50;
import xsna.l310;
import xsna.l6u;
import xsna.m1k;
import xsna.m410;
import xsna.m7m;
import xsna.mfy;
import xsna.mk50;
import xsna.msy;
import xsna.mzp0;
import xsna.n310;
import xsna.n5i;
import xsna.o210;
import xsna.o3w;
import xsna.owv;
import xsna.oz50;
import xsna.qob;
import xsna.r410;
import xsna.rvq;
import xsna.rzp0;
import xsna.s3q0;
import xsna.snx;
import xsna.tlo0;
import xsna.tr0;
import xsna.tzv;
import xsna.ubw;
import xsna.ugm;
import xsna.vk50;
import xsna.vlw;
import xsna.wd2;
import xsna.xn50;
import xsna.y410;
import xsna.yw90;
import xsna.z8f;
import xsna.zrd0;

/* compiled from: MarketItemReviewsFragment.kt */
/* loaded from: classes.dex */
public final class MarketItemReviewsFragment extends MviImplFragment<a410, y410, l310> implements ies {
    public static final /* synthetic */ int w0 = 0;
    public final mfy Q;
    public e2g0 R;
    public GestureDetector S;
    public final b T;
    public final c410 U;
    public final bpn0 V;
    public final jf90 W;
    public final Object X;
    public final d Y;
    public WriteBar Z;
    public RecyclerView a0;
    public VkSpinner b0;
    public VkTopBar c0;
    public LinearLayout d0;
    public VkButton e0;
    public ComposeView f0;
    public SwipeRefreshLayout g0;
    public NestedScrollView h0;
    public VkPlaceholder i0;
    public View j0;
    public VKImageView k0;
    public TextView l0;
    public TextView m0;
    public TextView n0;
    public TextView o0;
    public VkButton p0;
    public ImageView q0;
    public TextView r0;
    public ComposeView s0;
    public wd2 t0;
    public final djg0 u0;
    public VkContextMenu v0;

    /* compiled from: MarketItemReviewsFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
        public a(MarketItemReviewsArguments marketItemReviewsArguments) {
            super(MarketItemReviewsFragment.class, null, null);
            this.j.putParcelable(fpf0.a(MarketItemReviewsArguments.class).l(), marketItemReviewsArguments);
        }
    }

    /* compiled from: MarketItemReviewsFragment.kt */
    /* loaded from: classes18.dex */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (jjc.b()) {
                return true;
            }
            l310.q.f fVar = l310.q.f.b;
            MarketItemReviewsFragment marketItemReviewsFragment = MarketItemReviewsFragment.this;
            marketItemReviewsFragment.getClass();
            xn50.a.c(marketItemReviewsFragment, fVar);
            return true;
        }
    }

    /* compiled from: MarketItemReviewsFragment.kt */
    /* loaded from: classes18.dex */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<l310, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(l310 l310Var) {
            MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) this.receiver;
            marketItemReviewsFragment.getClass();
            xn50.a.c(marketItemReviewsFragment, l310Var);
            return s3q0.a;
        }
    }

    /* compiled from: MarketItemReviewsFragment.kt */
    /* loaded from: classes18.dex */
    public static final class d implements dhr0.e {
        public d() {
        }

        @Override // xsna.dhr0.e
        public final void sb(VKTheme vKTheme) {
            int i;
            VkPlaceholder vkPlaceholder = MarketItemReviewsFragment.this.i0;
            if (vkPlaceholder == null) {
                vkPlaceholder = null;
            }
            if (dhr0.M()) {
                gko.b bVar = gko.Companion;
                i = R.drawable.vk_icon_illustration_antenna_dark_56;
            } else {
                gko.b bVar2 = gko.Companion;
                i = R.drawable.vk_icon_illustration_antenna_light_56;
            }
            vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(i), null, null, 30));
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [xsna.c410, xsna.eig0] */
    public MarketItemReviewsFragment() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        int i = 0;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MARKET_ITEM_REVIEW_LIST, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.MARKET_ITEM_REVIEW_LIST).j();
        yw90Var.init();
        this.L = yw90Var;
        this.Q = new mfy();
        this.T = new b();
        ?? r0 = new eig0() { // from class: xsna.c410
            @Override // xsna.eig0
            public final void a(Object obj) {
                bhg0 bhg0Var = (bhg0) obj;
                int i2 = MarketItemReviewsFragment.w0;
                boolean z = bhg0Var instanceof chg0;
                MarketItemReviewsFragment marketItemReviewsFragment = MarketItemReviewsFragment.this;
                if (z) {
                    xn50.a.c(marketItemReviewsFragment, l310.d.b);
                    return;
                }
                if (bhg0Var instanceof dhg0) {
                    xn50.a.c(marketItemReviewsFragment, new l310.n(((dhg0) bhg0Var).a));
                    VkContextMenu vkContextMenu = marketItemReviewsFragment.v0;
                    if (vkContextMenu != null) {
                        vkContextMenu.b();
                        return;
                    }
                    return;
                }
                if (bhg0Var instanceof bhg0.c) {
                    xn50.a.c(marketItemReviewsFragment, l310.l.b);
                } else if (bhg0Var instanceof bhg0.h) {
                    bhg0.h hVar = (bhg0.h) bhg0Var;
                    xn50.a.c(marketItemReviewsFragment, new l310.q.i(hVar.a, hVar.b));
                }
            }
        };
        this.U = r0;
        this.V = new bpn0(new cty(this, 5));
        this.W = new jf90(new n5i(this, 29));
        this.X = msy.a(LazyThreadSafetyMode.NONE, new b410(this, i));
        this.Y = new d();
        this.t0 = new wd2(this, 7);
        this.u0 = new djg0(r0);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.market_item_reviews_fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        VkTopBar.c.f fVar;
        int i;
        y410 y410Var = (y410) ao50Var;
        this.Q.a(kn());
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.topbar);
        this.c0 = vkTopBar;
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        int i2 = 7;
        int i3 = 6;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (fnj.c(requireContext)) {
            dko.a.a(R.drawable.vk_icon_arrow_left_outline_28);
            fVar = new VkTopBar.c.f(gko.c(R.drawable.vk_icon_arrow_left_outline_28), null, new gzv(this, i3), null, com.vk.core.compose.component.semantics.b.a(null, new rvq(i2), 3), 26);
        } else {
            fVar = null;
        }
        vkTopBar.setBefore(fVar);
        ComposeView composeView = (ComposeView) hvt0.c(R.id.screen_spinner, view);
        composeView.setContent(blk.c);
        this.s0 = composeView;
        this.h0 = (NestedScrollView) view.findViewById(R.id.dummy_sv);
        VkPlaceholder vkPlaceholder = (VkPlaceholder) view.findViewById(R.id.error_placeholder);
        if (dhr0.M()) {
            i = R.drawable.vk_icon_illustration_antenna_dark_56;
            dko.a.a(R.drawable.vk_icon_illustration_antenna_dark_56);
        } else {
            i = R.drawable.vk_icon_illustration_antenna_light_56;
            dko.a.a(R.drawable.vk_icon_illustration_antenna_light_56);
        }
        vkPlaceholder.setTop(new VkPlaceholder.c.b(gko.c(i), null, null, 30));
        tlo0.Companion.getClass();
        vkPlaceholder.setMiddle(new VkPlaceholder.b((tlo0) (objArr3 == true ? 1 : 0), (tlo0) tlo0.a.b(R.string.market_item_error_text), (com.vk.core.compose.component.semantics.a) (objArr2 == true ? 1 : 0), 11));
        vkPlaceholder.setBottom(new VkPlaceholder.a(new VkPlaceholder.a.C0854a(tlo0.a.b(R.string.community_reviews_error_retry_btn), new Cnew(this, 4), null, null, null, VkButton.Mode.Link, VkButton.Appearance.Accent, false, null, 1660), (VkPlaceholder.a.C0854a) (objArr == true ? 1 : 0), i3));
        this.i0 = vkPlaceholder;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.market_item_reviews_list);
        if (recyclerView != null) {
            recyclerView.setAdapter((n310) this.V.getValue());
            recyclerView.addOnScrollListener(new ef90(this.W));
        } else {
            recyclerView = null;
        }
        this.a0 = recyclerView;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.action_button_ll);
        this.d0 = linearLayout;
        bwt0.i0(linearLayout, new z8f(this, 28));
        this.e0 = (VkButton) view.findViewById(R.id.action_button);
        this.f0 = (ComposeView) view.findViewById(R.id.show_all_btn_compose_view);
        this.b0 = (VkSpinner) view.findViewById(R.id.spinner);
        this.g0 = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.j0 = view.findViewById(R.id.empty_list_layout);
        this.k0 = (VKImageView) view.findViewById(R.id.item_iv);
        this.l0 = (TextView) view.findViewById(R.id.item_title_good_tv);
        this.m0 = (TextView) view.findViewById(R.id.item_name_group_tv);
        this.n0 = (TextView) view.findViewById(R.id.item_reviewed_title_tv);
        this.p0 = (VkButton) view.findViewById(R.id.create_review_button);
        this.o0 = (TextView) view.findViewById(R.id.item_reviewed_description_tv);
        this.q0 = (ImageView) view.findViewById(R.id.faq_iv);
        this.r0 = (TextView) view.findViewById(R.id.faq_tv);
        SwipeRefreshLayout swipeRefreshLayout = this.g0;
        if (swipeRefreshLayout == null) {
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.g410
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                int i4 = MarketItemReviewsFragment.w0;
                l310.o oVar = l310.o.b;
                MarketItemReviewsFragment marketItemReviewsFragment = MarketItemReviewsFragment.this;
                marketItemReviewsFragment.getClass();
                xn50.a.c(marketItemReviewsFragment, oVar);
            }
        });
        VkButton vkButton = this.p0;
        if (vkButton == null) {
            vkButton = null;
        }
        int i4 = 5;
        bwt0.i0(vkButton, new owv(this, i4));
        ImageView imageView = this.q0;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.i0(imageView, new l6u(this, 10));
        dhr0.f(this.Y);
        WriteBar writeBar = (WriteBar) view.findViewById(R.id.comment_bar);
        this.Z = writeBar;
        e2g0 e2g0Var = writeBar != null ? new e2g0(writeBar, requireContext(), null, 10) : null;
        this.R = e2g0Var;
        if (e2g0Var != null) {
            e2g0Var.e();
            e2g0Var.m(new tzv(this, i3));
            e2g0Var.k(new k7y(this, i4));
            e2g0Var.l(new ubw(this, i2));
            e2g0Var.r(new j410(this));
        }
        this.S = new GestureDetector(getActivity(), this.T);
        RecyclerView recyclerView2 = this.a0;
        if (recyclerView2 != null) {
            recyclerView2.addOnItemTouchListener(new h410(this));
        }
        xn50.a.b(this, y410Var.d(), new m1k(this, 23));
        xn50.a.b(this, y410Var.a(), new o3w(this, 8));
        xn50.a.b(this, y410Var.b(), new j4x(this, i3));
        xn50.a.b(this, y410Var.c(), new ugm(this, 17));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        a410 a410Var = (a410) vk50Var;
        ((f4z) a410Var.U()).a(new cww(this, 5), this);
        ((f4z) a410Var.V()).a(new f410(this, 0), this);
    }

    public final void fo(k7p0 k7p0Var) {
        String str;
        VkTopBar vkTopBar = this.c0;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        Image a2 = k7p0Var.a();
        if (a2 != null) {
            Serializer.c<Owner> cVar = Owner.CREATOR;
            str = Owner.a.a(cn70.b(28), a2);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        com.vk.core.view.components.topbar.b bVar = new com.vk.core.view.components.topbar.b(new snx(new snx.b.c(new vlw(str), ContentScale.Crop, null, 10)), com.vk.core.compose.component.semantics.b.a(null, new e0(24), 3), 2);
        tlo0.a aVar = tlo0.Companion;
        String b2 = k7p0Var.b();
        aVar.getClass();
        vkTopBar.setMiddle(new VkTopBar.Middle.a(bVar, new VkTopBar$Middle$Cell$Middle$Text(new VkTopBar$Middle$Cell$Middle$Text.Title(tlo0.a.d(b2), null, com.vk.core.compose.component.semantics.b.a(null, new tr0(25), 3), 30), null, 6)));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcelable parcelable;
        Object parcelableExtra;
        Bundle bundleExtra;
        Bundle bundleExtra2;
        Parcelable parcelable2;
        Object parcelable3;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 111722) {
            if (intent == null || (bundleExtra2 = intent.getBundleExtra("create_market_item_result")) == null) {
                return;
            }
            String l = fpf0.a(CreateMarketItemReviewResult.class).l();
            if (l == null) {
                l = "";
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable3 = bundleExtra2.getParcelable(l, CreateMarketItemReviewResult.class);
                parcelable2 = (Parcelable) parcelable3;
            } else {
                Parcelable parcelable4 = bundleExtra2.getParcelable(l);
                parcelable2 = (CreateMarketItemReviewResult) (parcelable4 instanceof CreateMarketItemReviewResult ? parcelable4 : null);
            }
            CreateMarketItemReviewResult createMarketItemReviewResult = (CreateMarketItemReviewResult) parcelable2;
            if (createMarketItemReviewResult == null || !createMarketItemReviewResult.g()) {
                return;
            }
            xn50.a.c(this, l310.p.b);
            return;
        }
        if (i2 == -1 && i == 44) {
            if (intent == null || (bundleExtra = intent.getBundleExtra("market_item_review_replies_extra")) == null || !bundleExtra.getBoolean("reply_list_was_changed_extra")) {
                return;
            }
            xn50.a.c(this, l310.p.b);
            return;
        }
        if (i == 4332 && i2 == -1 && intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("result_target", Target.class);
                parcelable = (Parcelable) parcelableExtra;
            } else {
                Parcelable parcelableExtra2 = intent.getParcelableExtra("result_target");
                parcelable = (Target) (parcelableExtra2 instanceof Target ? parcelableExtra2 : null);
            }
            Target target = (Target) parcelable;
            if (target != null) {
                xn50.a.c(this, new l310.q.c(target.c));
            }
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xn50.a.c(this, l310.e.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ComposeView composeView;
        FragmentActivity kn = kn();
        this.Q.getClass();
        mfy.b(kn);
        dhr0.a.getClass();
        dhr0.X(this.Y);
        wd2 wd2Var = this.t0;
        if (wd2Var != null && (composeView = this.s0) != null) {
            composeView.removeCallbacks(wd2Var);
        }
        this.t0 = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [android.os.Parcelable] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        gxh D = ((DataRepositoryComponent) m7m.d(this).a(fpf0.a(DataRepositoryComponent.class))).D();
        iid iidVar = new iid(((AttachmentMappersComponent) m7m.d(this).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3());
        o210 o210Var = new o210(iidVar);
        qob qobVar = new qob(iidVar);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String l = fpf0.a(MarketItemReviewsArguments.class).l();
            if (l == null) {
                l = "";
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable(l, MarketItemReviewsArguments.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable3 = arguments.getParcelable(l);
                parcelable = parcelable3 instanceof MarketItemReviewsArguments ? parcelable3 : null;
            }
            r2 = (MarketItemReviewsArguments) parcelable;
        }
        return new a410(r2, new m410(((ReviewsComponent) m7m.d(this).a(fpf0.a(ReviewsComponent.class))).C6(), new hoz(o210Var, qobVar), new fy2(D), o210Var), ((ReviewsComponent) m7m.d(this).a(fpf0.a(ReviewsComponent.class))).e7(), new r410(new a510(((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).p().a())), this.J, ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).s());
    }
}
