package com.vk.profile.community.catalog.impl.communities;

import android.graphics.RectF;
import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.group.FriendCommunitiesCatalogRootVh;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.profile.core.onboarding.model.ContentHintOnboardingResource;
import com.vkontakte.android.R;
import defpackage.e0;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import xsna.aes;
import xsna.bpn0;
import xsna.f1;
import xsna.fdi;
import xsna.l7v;
import xsna.lbs;
import xsna.m2g;
import xsna.msy;
import xsna.mzp0;
import xsna.o25;
import xsna.o5a;
import xsna.oba;
import xsna.pla;
import xsna.qhh0;
import xsna.rda;
import xsna.rzp0;
import xsna.sx6;
import xsna.tx6;
import xsna.v6j;
import xsna.vq6;
import xsna.wng;
import xsna.xng;
import xsna.yw90;
import xsna.zrd0;

/* compiled from: CommunitiesCatalogFragment.kt */
/* loaded from: classes.dex */
public final class CommunitiesCatalogFragment extends BaseCatalogFragment implements aes, qhh0 {
    public static final /* synthetic */ int T = 0;
    public final Object Q;
    public final bpn0 R;
    public final fdi S;

    /* compiled from: CommunitiesCatalogFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a extends BaseCatalogFragment.b {
        public a() {
            super(CommunitiesCatalogFragment.class, null, null);
        }
    }

    public CommunitiesCatalogFragment() {
        super(CommunitiesCatalogRootVh.class, false);
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.COMMUNITIES_CATALOG, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.COMMUNITIES_CATALOG).j();
        yw90Var.init();
        this.L = yw90Var;
        this.Q = msy.a(LazyThreadSafetyMode.NONE, new m2g(this, 2));
        this.R = new bpn0(new f1(this, 28));
        this.S = new fdi();
    }

    public static final ContentHintOnboardingResource.Contents.ServicesContents ho(Hint hint, String str, String str2) {
        String str3;
        String title = hint.getTitle();
        String str4 = "";
        if (title == null) {
            title = "";
        }
        String description = hint.getDescription();
        if (description == null) {
            description = "";
        }
        Map<String, String> zb = hint.zb();
        if (zb != null && (str3 = zb.get(str2)) != null) {
            str4 = str3;
        }
        return new ContentHintOnboardingResource.Contents.ServicesContents(Collections.singletonList(new ContentHintOnboardingResource.RemoteContentResource(title, description, new ContentHintOnboardingResource.ContentUrl.Video(str4), str)));
    }

    @Override // xsna.aes
    public final void A0() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        CommunitiesCatalogRootVh communitiesCatalogRootVh = catalogRootViewHolder instanceof CommunitiesCatalogRootVh ? (CommunitiesCatalogRootVh) catalogRootViewHolder : null;
        if (communitiesCatalogRootVh == null) {
            return;
        }
        communitiesCatalogRootVh.A0();
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        CommunitiesCatalogRootVh communitiesCatalogRootVh = catalogRootViewHolder instanceof CommunitiesCatalogRootVh ? (CommunitiesCatalogRootVh) catalogRootViewHolder : null;
        return communitiesCatalogRootVh != null ? communitiesCatalogRootVh.k0() : super.a0();
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        UserId userId;
        boolean l = lbs.l(this);
        this.S.getClass();
        boolean k = fdi.k(bundle, l);
        wng wngVar = new wng(k, this);
        e0 e0Var = new e0(5, this, bundle);
        Bundle arguments = getArguments();
        return (arguments == null || (userId = (UserId) arguments.getParcelable("owner_id")) == null) ? false : userId.equals(o25.a().c()) ^ true ? new FriendCommunitiesCatalogRootVh(getArguments(), kn(), this, new o5a(this), o25.a(), k, wngVar, e0Var, new sx6(this)) : new CommunitiesCatalogRootVh(getArguments(), kn(), this, new o5a(this), o25.a(), k, wngVar, e0Var, new tx6(this), new xng(this), this.J, 4097);
    }

    public final boolean go(HintId hintId) {
        l7v b = pla.e().b();
        Hint p = b.p(hintId.getId());
        if (p == null || !b.m(hintId)) {
            return false;
        }
        String string = requireContext().getString(R.string.community_catalog_redesign_onboarding_cool);
        new oba.a(requireContext(), new ContentHintOnboardingResource(ho(p, string, "page1_animation_dark_android"), ho(p, string, "page1_animation_light_android")), new vq6(3, b, hintId)).I0(null);
        return true;
    }

    @Override // xsna.aes
    public final void h7(v6j v6jVar) {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        CommunitiesCatalogRootVh communitiesCatalogRootVh = catalogRootViewHolder instanceof CommunitiesCatalogRootVh ? (CommunitiesCatalogRootVh) catalogRootViewHolder : null;
        if (communitiesCatalogRootVh == null) {
            return;
        }
        communitiesCatalogRootVh.j0(v6jVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Boolean valueOf = Boolean.valueOf(lbs.l(this));
        lbs.m(this);
        Boolean bool = Boolean.FALSE;
        Boolean valueOf2 = Boolean.valueOf(lbs.q(this));
        this.S.getClass();
        fdi.H(bundle, valueOf, bool, valueOf2);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (go(HintId.GROUP_CATALOG_REDESIGN_ONBOARDING_V2)) {
            return;
        }
        go(HintId.GROUP_CATALOG_REDESIGN_ONBOARDING);
    }

    @Override // xsna.aes
    public final RectF p1() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        CommunitiesCatalogRootVh communitiesCatalogRootVh = catalogRootViewHolder instanceof CommunitiesCatalogRootVh ? (CommunitiesCatalogRootVh) catalogRootViewHolder : null;
        if (communitiesCatalogRootVh != null) {
            return communitiesCatalogRootVh.p1();
        }
        return null;
    }

    @Override // xsna.qhh0
    public final boolean s() {
        CatalogVh catalogVh = this.P;
        rda rdaVar = catalogVh instanceof rda ? (rda) catalogVh : null;
        if (rdaVar == null) {
            return false;
        }
        rdaVar.s();
        return true;
    }
}
