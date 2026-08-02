package com.vk.comments.impl.marketitem.commentlist.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.comments.api.model.MarketItemCommentsArgs;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.view.ColorProgressBar;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.report.api.di.ReportComponent;
import com.vk.sharing.api.dto.Target;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import xsna.a110;
import xsna.ao50;
import xsna.asp;
import xsna.bja0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cqv;
import xsna.dhr0;
import xsna.e110;
import xsna.eeg;
import xsna.ef90;
import xsna.f1j;
import xsna.f3g0;
import xsna.f5x;
import xsna.fnj;
import xsna.fpf0;
import xsna.gm50;
import xsna.h110;
import xsna.i1;
import xsna.i110;
import xsna.iah0;
import xsna.ies;
import xsna.ify;
import xsna.igh;
import xsna.j110;
import xsna.jjc;
import xsna.k010;
import xsna.kdn;
import xsna.km50;
import xsna.l010;
import xsna.l110;
import xsna.m110;
import xsna.m2g;
import xsna.m7m;
import xsna.mgz;
import xsna.mhy;
import xsna.mk50;
import xsna.msy;
import xsna.mzp0;
import xsna.n010;
import xsna.n9;
import xsna.nf90;
import xsna.oz50;
import xsna.pax0;
import xsna.rzp0;
import xsna.s1x;
import xsna.t010;
import xsna.tlo0;
import xsna.tq;
import xsna.v3n;
import xsna.vk50;
import xsna.xis;
import xsna.xn50;
import xsna.xu9;
import xsna.y0y0;
import xsna.yd10;
import xsna.yw90;
import xsna.z0y0;
import xsna.zrd0;
import xsna.zrp;

/* compiled from: MarketItemCommentsFragment.kt */
/* loaded from: classes17.dex */
public final class MarketItemCommentsFragment extends MviImplFragment<n010, l110, k010> implements ies {
    public static final /* synthetic */ int j0 = 0;
    public SwipeRefreshLayout Q;
    public RecyclerView R;
    public l010 S;
    public WriteBar T;
    public View U;
    public ColorProgressBar V;
    public View W;
    public View X;
    public NestedScrollView Y;
    public j110 Z;
    public eeg a0;
    public f3g0 b0;
    public com.vk.core.view.components.spinner.c c0;
    public final Object d0;
    public final Object e0;
    public final xu9 f0;
    public final nf90 g0;
    public GestureDetector h0;
    public final c i0;

    /* compiled from: MarketItemCommentsFragment.kt */
    public static final class a extends oz50 {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketItemCommentsFragment.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b EMPTY;
        public static final b ERROR;
        public static final b LOADING;

        static {
            b bVar = new b("LOADING", 0);
            LOADING = bVar;
            b bVar2 = new b("EMPTY", 1);
            EMPTY = bVar2;
            b bVar3 = new b("ERROR", 2);
            ERROR = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: MarketItemCommentsFragment.kt */
    public static final class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (jjc.b()) {
                return true;
            }
            k010.a aVar = k010.a.b;
            MarketItemCommentsFragment marketItemCommentsFragment = MarketItemCommentsFragment.this;
            xn50.a.c(marketItemCommentsFragment, aVar);
            eeg eegVar = marketItemCommentsFragment.a0;
            if (eegVar == null) {
                return true;
            }
            eegVar.j();
            return true;
        }
    }

    public MarketItemCommentsFragment() {
        f5x f5xVar = new f5x(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d0 = msy.a(lazyThreadSafetyMode, f5xVar);
        this.e0 = msy.a(lazyThreadSafetyMode, new v3n(this, 17));
        this.f0 = new xu9(this, 1);
        this.g0 = new nf90(new m2g(this, 29));
        this.i0 = new c();
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MARKET_ITEM_COMMENTS, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.MARKET_ITEM_COMMENTS).j();
        yw90Var.init();
        this.L = yw90Var;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.market_item_comments_fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        VkTopBar.b bVar;
        l110 l110Var = (l110) ao50Var;
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.toolbar);
        int i = 4;
        if (vkTopBar != null) {
            Context requireContext = requireContext();
            HashSet hashSet = iah0.a;
            if (fnj.d(requireContext)) {
                bVar = null;
            } else {
                bVar = new VkTopBar.b(new s1x(this, i), tq.h(tlo0.Companion, R.string.accessibility_back), null, null, null, 28);
            }
            vkTopBar.setBack(bVar);
            VkTopBar.Middle.Text.c cVar = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.market_item_comments_toolbar_title), null, null, null, null, 30), cVar, objArr, objArr2, 14));
        }
        this.Y = (NestedScrollView) view.findViewById(R.id.scroll_dummy);
        this.X = view.findViewById(R.id.empty_text);
        this.W = view.findViewById(R.id.error_layout);
        this.V = (ColorProgressBar) view.findViewById(R.id.progress_bar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        this.R = recyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new ef90(this.g0));
        }
        this.h0 = new GestureDetector(getActivity(), this.i0);
        RecyclerView recyclerView2 = this.R;
        if (recyclerView2 != null) {
            recyclerView2.addOnItemTouchListener(new t010(this));
        }
        WriteBar writeBar = (WriteBar) view.findViewById(R.id.comment_bar);
        this.T = writeBar;
        if (writeBar != null) {
            writeBar.addOnLayoutChangeListener(this.f0);
        }
        WriteBar writeBar2 = this.T;
        if (writeBar2 != null) {
            writeBar2.setLocationAllowed(false);
        }
        WriteBar writeBar3 = this.T;
        if (writeBar3 != null) {
            writeBar3.setBottomSheetContainer((ViewGroup) view.findViewById(R.id.bottom_sheet_container));
        }
        this.U = view.findViewById(R.id.comment_separator);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.Q = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.s010
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                public final void h() {
                    int i2 = MarketItemCommentsFragment.j0;
                    MarketItemCommentsFragment marketItemCommentsFragment = MarketItemCommentsFragment.this;
                    marketItemCommentsFragment.getClass();
                    xn50.a.c(marketItemCommentsFragment, k010.j.b);
                }
            });
        }
        TextView textView = (TextView) view.findViewById(R.id.error_retry);
        ImageView imageView = (ImageView) view.findViewById(R.id.error_iv);
        if (dhr0.M()) {
            imageView.setImageResource(R.drawable.vk_icon_illustration_antenna_dark_56);
        } else {
            imageView.setImageResource(R.drawable.vk_icon_illustration_antenna_light_56);
        }
        textView.setOnClickListener(new i1(this, 7));
        gm50.a.b(this, l110Var.b, new mgz(this, i));
        gm50.a.b(this, l110Var.a, new n9(13, this, view));
        gm50.a.b(this, l110Var.c, new f1j(this, 25));
        gm50.a.b(this, l110Var.d, new cqv(this, 11));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        n010 n010Var = (n010) vk50Var;
        n010Var.j.a(new kdn(this, 16), this);
        n010Var.i.a(new igh(this, 26), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        eeg eegVar = this.a0;
        if (eegVar != null) {
            eegVar.f(false);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        eeg eegVar = this.a0;
        if (eegVar != null && eegVar.f(false)) {
            return true;
        }
        int i = ify.a;
        if (!ify.e(ify.c)) {
            return false;
        }
        mhy.b(requireContext());
        return true;
    }

    public final void fo(b bVar) {
        WriteBar writeBar = this.T;
        if (writeBar != null) {
            bwt0.p0(writeBar, false);
        }
        View view = this.U;
        if (view != null) {
            bwt0.p0(view, false);
        }
        eeg eegVar = this.a0;
        if (eegVar != null) {
            eegVar.f(false);
        }
        SwipeRefreshLayout swipeRefreshLayout = this.Q;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.Q;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setEnabled(false);
        }
        NestedScrollView nestedScrollView = this.Y;
        if (nestedScrollView != null) {
            bwt0.p0(nestedScrollView, true);
        }
        RecyclerView recyclerView = this.R;
        if (recyclerView != null) {
            bwt0.p0(recyclerView, false);
        }
        View view2 = this.W;
        if (view2 != null) {
            bwt0.p0(view2, bVar == b.ERROR);
        }
        View view3 = this.X;
        if (view3 != null) {
            bwt0.p0(view3, bVar == b.EMPTY);
        }
        ColorProgressBar colorProgressBar = this.V;
        if (colorProgressBar != null) {
            bwt0.p0(colorProgressBar, bVar == b.LOADING);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        WriteBar writeBar;
        Target target;
        super.onActivityResult(i, i2, intent);
        if (i != 4331 || i2 != -1) {
            if (i <= 10000 || (writeBar = this.T) == null) {
                return;
            }
            writeBar.onActivityResult(i, i2, intent);
            return;
        }
        if (intent == null || (target = (Target) intent.getParcelableExtra("result_target")) == null) {
            return;
        }
        if (target.k) {
            eeg eegVar = this.a0;
            if (eegVar != null) {
                eegVar.l();
                return;
            }
            return;
        }
        eeg eegVar2 = this.a0;
        if (eegVar2 != null) {
            eegVar2.k(target.c, target.d);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.Z = new j110(this, (bja0) this.d0.getValue(), ((ReportComponent) m7m.d(this).mo408a(fpf0.a(ReportComponent.class))).d4());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.vk.core.view.components.spinner.c cVar = this.c0;
        if (cVar != null) {
            cVar.dismiss();
        }
        eeg eegVar = this.a0;
        if (eegVar != null) {
            eegVar.release();
        }
        this.c0 = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        WriteBar writeBar = this.T;
        if (writeBar != null) {
            writeBar.removeOnLayoutChangeListener(this.f0);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        z0y0 z0y0Var;
        super.onPause();
        WriteBar writeBar = this.T;
        if (writeBar != null) {
            y0y0 y0y0Var = writeBar.D;
            if (!y0y0Var.c(null) || (z0y0Var = y0y0Var.d) == null) {
                return;
            }
            y0y0Var.c.getInputState();
            z0y0Var.a(false, true);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WriteBar writeBar = this.T;
        if (writeBar != null) {
            kn();
            writeBar.getState().f = true;
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        bpn0 bpn0Var = new bpn0(new xis(this, 14));
        pax0 f3 = ((AttachmentMappersComponent) m7m.d(this).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
        Bundle arguments = getArguments();
        MarketItemCommentsArgs marketItemCommentsArgs = (MarketItemCommentsArgs) bpn0Var.getValue();
        UserId userId = marketItemCommentsArgs != null ? marketItemCommentsArgs.b : UserId.d;
        MarketItemCommentsArgs marketItemCommentsArgs2 = (MarketItemCommentsArgs) bpn0Var.getValue();
        return new n010(arguments, new a110(userId, marketItemCommentsArgs2 != null ? marketItemCommentsArgs2.c : 0L, new h110(new yd10(), new i110(f3))), this.J, new e110(new m110()));
    }
}
