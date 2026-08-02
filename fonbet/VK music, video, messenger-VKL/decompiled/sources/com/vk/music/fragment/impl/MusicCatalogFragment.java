package com.vk.music.fragment.impl;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicSingleCatalogRootVh;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.fragment.impl.MusicCatalogShowAllFragment;
import com.vk.search.ui.api.SearchInputMethod;
import kotlin.LazyThreadSafetyMode;
import xsna.aes;
import xsna.bpn0;
import xsna.cd40;
import xsna.dd40;
import xsna.ecm;
import xsna.fdi;
import xsna.g950;
import xsna.h1j;
import xsna.k840;
import xsna.l1i;
import xsna.lbs;
import xsna.ld40;
import xsna.lo10;
import xsna.lpg0;
import xsna.msy;
import xsna.o5a;
import xsna.qwh0;
import xsna.r1d;
import xsna.rda;
import xsna.snx;
import xsna.tiy;
import xsna.tr9;
import xsna.v6j;
import xsna.vds;
import xsna.vlw;
import xsna.wda;
import xsna.wzh;
import xsna.x5v0;
import xsna.zhf0;
import xsna.zjq;

/* compiled from: MusicCatalogFragment.kt */
/* loaded from: classes3.dex */
public final class MusicCatalogFragment extends BaseCatalogFragment implements aes, qwh0, vds {
    public static final /* synthetic */ int W = 0;
    public final x5v0 Q;
    public final fdi R;
    public final Object S;
    public final bpn0 T;
    public final Object U;
    public final Object V;

    /* compiled from: MusicCatalogFragment.kt */
    public static final class a extends o5a {
        @Override // xsna.o5a, xsna.nda
        public final void d(Context context, CatalogConfiguration catalogConfiguration, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo, lpg0 lpg0Var) {
            MusicCatalogShowAllFragment.a aVar = new MusicCatalogShowAllFragment.a(MusicCatalogShowAllFragment.class, null, null);
            Bundle r = catalogConfiguration.r();
            Bundle bundle = aVar.j;
            bundle.putBundle("catalog_state", r);
            bundle.putString("section", str);
            bundle.putString("title", str2);
            bundle.putString(TtmlNode.TAG_LAYOUT, str3);
            bundle.putString("entry_point", this.a);
            bundle.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
            aVar.k(context);
        }
    }

    public MusicCatalogFragment() {
        super(MusicCatalogRootVh.class, false);
        this.Q = new x5v0();
        this.R = new fdi();
        wzh wzhVar = new wzh(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, wzhVar);
        this.T = new bpn0(new l1i(this, 14));
        this.U = msy.a(lazyThreadSafetyMode, new ecm(this, 29));
        this.V = msy.a(lazyThreadSafetyMode, new lo10(this, 3));
    }

    @Override // xsna.aes
    public final void A0() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        MusicCatalogRootVh musicCatalogRootVh = catalogRootViewHolder instanceof MusicCatalogRootVh ? (MusicCatalogRootVh) catalogRootViewHolder : null;
        if (musicCatalogRootVh == null) {
            return;
        }
        VkTopBarSearchQueryVh vkTopBarSearchQueryVh = musicCatalogRootVh.C;
        vkTopBarSearchQueryVh.getClass();
        vkTopBarSearchQueryVh.k(null);
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // xsna.qwh0
    public final boolean c0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        boolean l = lbs.l(this);
        this.R.getClass();
        boolean k = fdi.k(bundle, l);
        a aVar = new a(this);
        int i = 0;
        int i2 = 0;
        return new MusicCatalogRootVh(kn(), aVar, getArguments(), new ld40(k, new cd40(this, lbs.class, "isNeedShowProfileInHeader", "isNeedShowProfileInHeader(Lcom/vk/core/fragments/FragmentImpl;)Z", 1), new dd40(i2, this, MusicCatalogFragment.class, "onAvatarClickAction", "onAvatarClickAction()V", i), new tr9(i2, this, MusicCatalogFragment.class, "onAvatarLongClickAction", "onAvatarLongClickAction()V", i, 2), new h1j(this, 27), this.Q, k840.a.d(), (g950) this.U.getValue(), On(), (tiy) this.V.getValue()));
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder fo() {
        a aVar = new a(this);
        FragmentActivity kn = kn();
        return new MusicSingleCatalogRootVh(this.N, getArguments(), kn, aVar, new r1d(4));
    }

    @Override // xsna.aes
    public final void h7(v6j v6jVar) {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        MusicCatalogRootVh musicCatalogRootVh = catalogRootViewHolder instanceof MusicCatalogRootVh ? (MusicCatalogRootVh) catalogRootViewHolder : null;
        if (musicCatalogRootVh == null) {
            return;
        }
        VkTopBarSearchQueryVh vkTopBarSearchQueryVh = musicCatalogRootVh.C;
        vkTopBarSearchQueryVh.getClass();
        String str = (String) v6jVar.b;
        if (str == null) {
            return;
        }
        vkTopBarSearchQueryVh.k(new snx(new snx.b.c(new vlw(str, null), null, null, 14)));
    }

    @Override // xsna.qwh0
    public final void j1(String str, SearchInputMethod searchInputMethod) {
        CatalogVh catalogVh = this.P;
        wda wdaVar = catalogVh instanceof wda ? (wda) catalogVh : null;
        if (wdaVar != null) {
            wda.e0(wdaVar, str, null, null, 12);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Boolean valueOf = Boolean.valueOf(lbs.l(this));
        lbs.m(this);
        fdi.I(this.R, bundle, valueOf, Boolean.FALSE, 8);
    }

    @Override // xsna.aes
    public final RectF p1() {
        zhf0 leftAvatarRect;
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        MusicCatalogRootVh musicCatalogRootVh = catalogRootViewHolder instanceof MusicCatalogRootVh ? (MusicCatalogRootVh) catalogRootViewHolder : null;
        if (musicCatalogRootVh == null) {
            return null;
        }
        VkTopBar vkTopBar = musicCatalogRootVh.C.l;
        return (vkTopBar == null || (leftAvatarRect = vkTopBar.getLeftAvatarRect()) == null) ? new RectF() : zjq.o(leftAvatarRect);
    }

    @Override // xsna.unh0
    public final void s() {
        CatalogVh catalogVh = this.P;
        rda rdaVar = catalogVh instanceof rda ? (rda) catalogVh : null;
        if (rdaVar != null) {
            rdaVar.s();
        }
    }
}
