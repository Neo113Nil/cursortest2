package com.vk.friends.impl.cleanup.presentation.fragment;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.subscription.api.di.SubscriptionComponent;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ao50;
import xsna.asu0;
import xsna.ayn0;
import xsna.cnh;
import xsna.cos;
import xsna.cwg;
import xsna.e3m;
import xsna.ef90;
import xsna.eph;
import xsna.ff3;
import xsna.fpf0;
import xsna.frg;
import xsna.gko;
import xsna.gm50;
import xsna.gns;
import xsna.gzs;
import xsna.iah0;
import xsna.iw3;
import xsna.kf90;
import xsna.km50;
import xsna.m7m;
import xsna.mk50;
import xsna.mms;
import xsna.mre;
import xsna.msy;
import xsna.nb;
import xsna.nwk;
import xsna.omf;
import xsna.ots;
import xsna.oz50;
import xsna.pms;
import xsna.pns;
import xsna.qns;
import xsna.ri0;
import xsna.sop;
import xsna.tlo0;
import xsna.tms;
import xsna.tq;
import xsna.ums;
import xsna.vk50;
import xsna.vns;
import xsna.wje;
import xsna.wms;
import xsna.wpg;
import xsna.x5i;
import xsna.xms;
import xsna.xns;
import xsna.yms;
import xsna.yns;
import xsna.zoo;

/* compiled from: FriendsCleanupFragment.kt */
/* loaded from: classes15.dex */
public final class FriendsCleanupFragment extends MviImplFragment<xms, cos, mms> {
    public static final /* synthetic */ int W = 0;
    public ayn0 Q;
    public pms R;
    public wms T;
    public xns V;
    public final kf90 S = new kf90(new x5i(this, 20));
    public final iw3 U = new iw3(this, 12);

    /* compiled from: FriendsCleanupFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(FriendsCleanupFragment.class, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.friends_cleanup_fragment, (ViewGroup) null, false);
        this.V = new xns(inflate);
        fo().c.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) tq.h(tlo0.Companion, R.string.vk_common_retry), (gzs) new nwk(this, 8), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, VkButton.Mode.Tertiary, VkButton.Appearance.Accent, false, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE), null, null, null, 8));
        RecyclerView recyclerView = fo().e;
        pms pmsVar = new pms(this.U);
        this.R = pmsVar;
        recyclerView.setAdapter(pmsVar);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.addOnScrollListener(new ef90(this.S));
        this.Q = new ayn0(recyclerView, new yms(0, this, FriendsCleanupFragment.class, "isTabletUi", "isTabletUi()Z", 0), 12);
        recyclerView.setBackground(new InsetDrawable((Drawable) new zoo(R.attr.vk_ui_background_content), recyclerView.getPaddingLeft(), 0, recyclerView.getPaddingRight(), 0));
        ayn0 ayn0Var = this.Q;
        (ayn0Var != null ? ayn0Var : null).b();
        recyclerView.addItemDecoration(new ums(new wpg(this, 15), e3m.a(R.dimen.post_side_padding, requireContext()), iah0.a(4)));
        VkTopBar vkTopBar = fo().f;
        vkTopBar.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_arrow_left_outline_28), new tlo0.f(R.string.accessibility_back), new cwg(this, 21), null, null, 56));
        tlo0.f fVar = new tlo0.f(R.string.friends_cleanup_toolbar_title);
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(fVar, null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        cos cosVar = (cos) ao50Var;
        gm50.a.b(this, cosVar.c, new frg(this, 12));
        gm50.a.b(this, cosVar.a, new wje(this, 21));
        gm50.a.b(this, cosVar.b, new eph(this, 18));
        gm50.a.b(this, cosVar.d, new sop(this, 8));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        xms xmsVar = (xms) vk50Var;
        xmsVar.j.a(new ri0(16, xmsVar, this), this);
        xmsVar.k.a(new mre(xmsVar, 21), this);
        wms wmsVar = this.T;
        if (wmsVar != null) {
            xmsVar.e.b(wmsVar.b.a().a0(asu0.a.d()).subscribe(new ff3(new omf(wmsVar, 18), 15)));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        this.U.a(yns.a.a);
        return true;
    }

    public final xns fo() {
        xns xnsVar = this.V;
        if (xnsVar != null) {
            return xnsVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.V = null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, xsna.vk50, xsna.xms] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        BridgeComponent bridgeComponent = (BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class));
        SubscriptionComponent subscriptionComponent = (SubscriptionComponent) m7m.d(this).mo408a(fpf0.a(SubscriptionComponent.class));
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? xmsVar = new xms(new pns(), new vns(msy.a(LazyThreadSafetyMode.NONE, new cnh(subscriptionComponent, 10))), new tms(new nb(ref$ObjectRef, 18)), new gns(bridgeComponent.id().b(null), this), new qns(new ots(), bridgeComponent.s(), t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_CLEANUP)));
        ref$ObjectRef.element = xmsVar;
        this.T = new wms(xmsVar.k, subscriptionComponent.T().m());
        return xmsVar;
    }
}
