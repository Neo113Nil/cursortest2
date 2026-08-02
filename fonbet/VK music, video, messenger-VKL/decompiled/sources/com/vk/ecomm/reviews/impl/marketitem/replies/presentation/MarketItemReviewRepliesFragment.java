package com.vk.ecomm.reviews.impl.marketitem.replies.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.ironsource.X3;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.StickersBridgeComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.ecomm.reviews.api.model.MarketItemReviewRepliesArgs;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.sharing.api.dto.Target;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.aqw;
import xsna.bgy;
import xsna.bt3;
import xsna.bv9;
import xsna.d310;
import xsna.dhr0;
import xsna.e2g0;
import xsna.ehp;
import xsna.eig0;
import xsna.epx;
import xsna.fd4;
import xsna.flu;
import xsna.fnj;
import xsna.fpf0;
import xsna.g0t;
import xsna.gko;
import xsna.hd4;
import xsna.iah0;
import xsna.ies;
import xsna.ify;
import xsna.jcr;
import xsna.jjc;
import xsna.k7m;
import xsna.ku1;
import xsna.kwh;
import xsna.l2g0;
import xsna.lwh;
import xsna.m1y;
import xsna.m7m;
import xsna.mfy;
import xsna.mhy;
import xsna.msy;
import xsna.nuv;
import xsna.nzw;
import xsna.oz50;
import xsna.qcy;
import xsna.s3q0;
import xsna.t210;
import xsna.tlo0;
import xsna.tq;
import xsna.u210;
import xsna.ul50;
import xsna.v210;
import xsna.w1g0;
import xsna.w210;
import xsna.w8i;
import xsna.wsg0;
import xsna.xa2;
import xsna.xis;
import xsna.xzs;
import xsna.z3i;

/* compiled from: MarketItemReviewRepliesFragment.kt */
/* loaded from: classes18.dex */
public final class MarketItemReviewRepliesFragment extends FragmentImpl implements w8i, ies {
    public static final /* synthetic */ qcy<Object>[] b0;
    public WriteBar S;
    public RepliesView T;
    public VkSpinner U;
    public NestedScrollView V;
    public ComposeView W;
    public e2g0 Y;
    public GestureDetector Z;
    public final jcr N = new jcr();
    public final com.vk.ecomm.reviews.impl.marketitem.replies.presentation.c O = new com.vk.ecomm.reviews.impl.marketitem.replies.presentation.c(0);
    public final nzw P = new nzw(fpf0.d(d310.class).toString(), this, new nuv(this, 5));
    public final Object Q = msy.a(LazyThreadSafetyMode.NONE, new u210(this, 0));
    public bv9 R = new bv9(this, 4);
    public final mfy X = new mfy();
    public final b a0 = new b();

    /* compiled from: MarketItemReviewRepliesFragment.kt */
    public static final class a extends oz50 {
        public a(MarketItemReviewRepliesArgs marketItemReviewRepliesArgs) {
            super(MarketItemReviewRepliesFragment.class, null, null);
            this.j.putParcelable(fpf0.a(MarketItemReviewRepliesArgs.class).l(), marketItemReviewRepliesArgs);
        }
    }

    /* compiled from: MarketItemReviewRepliesFragment.kt */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (jjc.b()) {
                return true;
            }
            w1g0.i iVar = w1g0.i.b;
            qcy<Object>[] qcyVarArr = MarketItemReviewRepliesFragment.b0;
            MarketItemReviewRepliesFragment.this.eo(iVar);
            return true;
        }
    }

    /* compiled from: MarketItemReviewRepliesFragment.kt */
    public static final /* synthetic */ class c implements eig0, g0t {
        public c() {
        }

        @Override // xsna.eig0
        public final void a(Object obj) {
            qcy<Object>[] qcyVarArr = MarketItemReviewRepliesFragment.b0;
            MarketItemReviewRepliesFragment.this.eo((w1g0) obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof eig0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, MarketItemReviewRepliesFragment.this, MarketItemReviewRepliesFragment.class, "sendAction", "sendAction(Lcom/vk/ecomm/reviews/impl/replies/presentation/RepliesAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MarketItemReviewRepliesFragment.class, X3.i.U, "getStore()Lcom/vk/ecomm/reviews/impl/marketitem/replies/presentation/MarketItemReviewRepliesStore;", 0);
        fpf0.a.getClass();
        b0 = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        e2g0 e2g0Var = this.Y;
        if (e2g0Var != null && e2g0Var.b()) {
            return true;
        }
        int i = ify.a;
        if (ify.e(ify.c)) {
            mhy.b(requireContext());
            return true;
        }
        eo(w1g0.b.b);
        return true;
    }

    public final void eo(w1g0 w1g0Var) {
        qcy<Object> qcyVar = b0[0];
        ((d310) this.P.getValue()).b(w1g0Var);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcelable parcelable;
        Object parcelableExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 4332 && i2 == -1 && intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("result_target", Target.class);
                parcelable = (Parcelable) parcelableExtra;
            } else {
                Parcelable parcelableExtra2 = intent.getParcelableExtra("result_target");
                if (!(parcelableExtra2 instanceof Target)) {
                    parcelableExtra2 = null;
                }
                parcelable = (Target) parcelableExtra2;
            }
            Target target = (Target) parcelable;
            if (target != null) {
                eo(new w1g0.g(target.c));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.market_item_review_replies_fragment, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ComposeView composeView;
        this.O.clear();
        FragmentActivity kn = kn();
        this.X.getClass();
        mfy.b(kn);
        e2g0 e2g0Var = this.Y;
        if (e2g0Var != null) {
            e2g0Var.f();
        }
        bv9 bv9Var = this.R;
        if (bv9Var != null && (composeView = this.W) != null) {
            composeView.removeCallbacks(bv9Var);
        }
        this.R = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        e2g0 e2g0Var = this.Y;
        if (e2g0Var != null) {
            e2g0Var.g();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        e2g0 e2g0Var = this.Y;
        if (e2g0Var != null) {
            e2g0Var.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.X.a(kn());
        this.U = (VkSpinner) requireView().findViewById(R.id.spinner);
        ComposeView composeView = (ComposeView) requireView().findViewById(R.id.screen_spinner);
        composeView.setContent(aqw.d);
        this.W = composeView;
        VkTopBar vkTopBar = (VkTopBar) requireView().findViewById(R.id.topbar);
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (fnj.c(requireContext)) {
            vkTopBar.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_arrow_left_outline_28), null, new flu(this, 14), null, null, 58));
        } else {
            vkTopBar.setBefore(null);
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.reviews_replies_toolbar_title), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        this.V = (NestedScrollView) requireView().findViewById(R.id.dummy_sv);
        VkPlaceholder vkPlaceholder = (VkPlaceholder) requireView().findViewById(R.id.error_placeholder);
        if (dhr0.M()) {
            gko.b bVar = gko.Companion;
            i = R.drawable.vk_icon_illustration_antenna_dark_56;
        } else {
            gko.b bVar2 = gko.Companion;
            i = R.drawable.vk_icon_illustration_antenna_light_56;
        }
        vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(i), null, null, 30));
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new tlo0.f(R.string.market_item_review_replies_error_title), new tlo0.f(R.string.market_item_review_replies_error_description), (com.vk.core.compose.component.semantics.a) null, 10));
        int i2 = 6;
        vkPlaceholder.setBottom(new VkPlaceholder.a(new VkPlaceholder.a.C0854a(new tlo0.f(R.string.community_reviews_error_retry_btn), new t210(this, 0), null, null, null, VkButton.Mode.Link, VkButton.Appearance.Accent, false, null, 1660), (VkPlaceholder.a.C0854a) null, 6));
        WriteBar writeBar = (WriteBar) requireView().findViewById(R.id.comment_bar);
        this.S = writeBar;
        if (writeBar != null) {
            writeBar.setResultFragment(this);
        }
        WriteBar writeBar2 = this.S;
        e2g0 e2g0Var = writeBar2 != null ? new e2g0(writeBar2, requireContext(), ((StickersBridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(StickersBridgeComponent.class))).R().a(), 2) : null;
        this.Y = e2g0Var;
        int i3 = 3;
        if (e2g0Var != null) {
            e2g0Var.e();
            e2g0Var.r(new w210(this));
            e2g0Var.m(new xis(this, 15));
            e2g0Var.k(new m1y(this, i3));
            e2g0Var.l(new z3i(this, 25));
        }
        View view2 = getView();
        RepliesView repliesView = view2 != null ? (RepliesView) view2.findViewById(R.id.replies) : null;
        this.T = repliesView;
        if (repliesView != null) {
            repliesView.setEventSupplier(new kwh(1, this));
        }
        RepliesView repliesView2 = this.T;
        if (repliesView2 != null) {
            repliesView2.setStickerAttachmentClickListener(new l2g0(new lwh(this, 24), new bt3(this, 9)));
        }
        this.Z = new GestureDetector(getActivity(), this.a0);
        RepliesView repliesView3 = this.T;
        if (repliesView3 != null) {
            repliesView3.a(new v210(this));
        }
        m mVar = new m(((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).p().a());
        com.vk.mvi.binder.a aVar = new com.vk.mvi.binder.a(getLifecycle(), Lifecycle.State.RESUMED);
        ku1 ku1Var = new ku1(17, this, mVar);
        wsg0 wsg0Var = new wsg0(ehp.a);
        s3q0 s3q0Var = s3q0.a;
        ArrayList arrayList = wsg0Var.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((io.reactivex.rxjava3.disposables.c) it.next()).dispose();
        }
        arrayList.clear();
        wsg0Var.b = aVar;
        ku1Var.invoke(wsg0Var);
        s3q0 s3q0Var2 = s3q0.a;
        com.vk.ecomm.reviews.impl.marketitem.replies.presentation.c cVar = this.O;
        ul50<s3q0, State>.a aVar2 = cVar.b.g;
        ul50.this.e = new xa2(this, 7);
        aVar2.a(new bgy(this, i3));
        ul50.this.e = new fd4(this, i2);
        ul50.this.e = new hd4(this, i3);
    }
}
