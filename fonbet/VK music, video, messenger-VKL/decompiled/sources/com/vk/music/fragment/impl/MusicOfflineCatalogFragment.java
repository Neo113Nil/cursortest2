package com.vk.music.fragment.impl;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.LruCache;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.fragment.impl.MusicOfflineShowAllFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.a040;
import xsna.aes;
import xsna.bpn0;
import xsna.cfl;
import xsna.cn;
import xsna.dgm;
import xsna.dw20;
import xsna.fdi;
import xsna.g950;
import xsna.gzs;
import xsna.hlu0;
import xsna.jlu0;
import xsna.k850;
import xsna.lbs;
import xsna.lpg0;
import xsna.msy;
import xsna.mzp0;
import xsna.o0r0;
import xsna.o25;
import xsna.o5a;
import xsna.oz50;
import xsna.p6y;
import xsna.qhh0;
import xsna.rda;
import xsna.rzp0;
import xsna.s3q0;
import xsna.sq40;
import xsna.uq40;
import xsna.v6j;
import xsna.w100;
import xsna.xk40;
import xsna.xwk;
import xsna.zhf0;
import xsna.zjq;

/* compiled from: MusicOfflineCatalogFragment.kt */
/* loaded from: classes3.dex */
public final class MusicOfflineCatalogFragment extends BaseCatalogFragment implements aes, qhh0 {
    public static final /* synthetic */ int X = 0;
    public final Object Q;
    public final bpn0 R;
    public final Object S;
    public final Object T;
    public final uq40 U;
    public final fdi V;
    public final Object W;

    /* compiled from: MusicOfflineCatalogFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(MusicOfflineCatalogFragment.class, null, null);
        }

        public static void y(a aVar, String str) {
            Bundle bundle = aVar.j;
            if (str == null) {
                return;
            }
            bundle.putString("key_url", str);
            bundle.putBoolean("is_single_section", false);
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            boolean booleanExtra = intent.getBooleanExtra("key_include_offline_mode", false);
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(booleanExtra ? UiMeasuringScreen.MUSIC_OFFLINE_MY_MUSIC : UiMeasuringScreen.MUSIC_OFFLINE_LIBRARY, null, false, 62);
            UUID uuid = (UUID) c.d();
            ((mzp0) c.g()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
            }
        }
    }

    /* compiled from: MusicOfflineCatalogFragment.kt */
    public static final class b extends o5a implements sq40 {
        public final /* synthetic */ sq40 d;
        public final xk40 e;

        public b(MusicOfflineCatalogFragment musicOfflineCatalogFragment, uq40 uq40Var, xk40 xk40Var) {
            super(musicOfflineCatalogFragment);
            this.d = uq40Var;
            this.e = xk40Var;
        }

        @Override // xsna.o5a, xsna.nda
        public final void d(Context context, CatalogConfiguration catalogConfiguration, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo, lpg0 lpg0Var) {
            int length = str.length();
            FragmentImpl fragmentImpl = this.b;
            if (length <= 0) {
                if (fragmentImpl.getParentFragment() instanceof MusicContainerFragment) {
                    ((MusicContainerFragment) fragmentImpl.getParentFragment()).jo();
                    return;
                } else {
                    this.e.builder().B(context);
                    fragmentImpl.finish();
                    return;
                }
            }
            MusicOfflineShowAllFragment.a aVar = new MusicOfflineShowAllFragment.a();
            Bundle r = catalogConfiguration.r();
            Bundle bundle = aVar.j;
            bundle.putBundle("catalog_state", r);
            aVar.C(str);
            bundle.putString("title", str2);
            bundle.putString(TtmlNode.TAG_LAYOUT, null);
            aVar.B(this.a);
            bundle.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
            Bundle arguments = fragmentImpl.getArguments();
            String string = arguments != null ? arguments.getString("key_url") : null;
            if (string != null) {
                bundle.putString("key_url", string);
            }
            aVar.k(context);
        }
    }

    /* compiled from: MusicOfflineCatalogFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            MusicOfflineCatalogFragment musicOfflineCatalogFragment = (MusicOfflineCatalogFragment) this.receiver;
            int i = MusicOfflineCatalogFragment.X;
            musicOfflineCatalogFragment.getClass();
            cn o = o25.a().o();
            xwk.e().m(musicOfflineCatalogFragment.requireContext(), o.a, new o0r0.a(false, null, null, null, null, o.b, o.c, o.j, false, false, false, null, null, null, 65311));
            return s3q0.a;
        }
    }

    /* compiled from: MusicOfflineCatalogFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.gzs
        public final s3q0 invoke() {
            MusicOfflineCatalogFragment musicOfflineCatalogFragment = (MusicOfflineCatalogFragment) this.receiver;
            if (((hlu0) musicOfflineCatalogFragment.Q.getValue()).a()) {
                ((jlu0) musicOfflineCatalogFragment.R.getValue()).e(musicOfflineCatalogFragment, MultiAccountEntryPoint.LongTap.d);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MusicOfflineCatalogFragment.kt */
    public static final /* synthetic */ class e extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Boolean.valueOf(lbs.q((FragmentImpl) this.receiver));
        }
    }

    /* compiled from: MusicOfflineCatalogFragment.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(((MusicOfflineCatalogFragment) this.receiver).isResumed());
        }
    }

    public MusicOfflineCatalogFragment() {
        super(MusicOfflineCatalogRootVh.class, false);
        w100 w100Var = new w100(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, w100Var);
        this.R = new bpn0(new a040(this, 3));
        this.S = msy.a(lazyThreadSafetyMode, new p6y(this, 11));
        this.T = msy.a(lazyThreadSafetyMode, new dgm(this, 25));
        this.U = new uq40();
        this.V = new fdi();
        this.W = msy.a(lazyThreadSafetyMode, new cfl(this, 25));
    }

    @Override // xsna.aes
    public final void A0() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        MusicOfflineCatalogRootVh musicOfflineCatalogRootVh = catalogRootViewHolder instanceof MusicOfflineCatalogRootVh ? (MusicOfflineCatalogRootVh) catalogRootViewHolder : null;
        if (musicOfflineCatalogRootVh == null || musicOfflineCatalogRootVh.j0()) {
            return;
        }
        musicOfflineCatalogRootVh.D.m();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        boolean l = lbs.l(this);
        this.V.getClass();
        boolean k = fdi.k(bundle, l);
        gzs y = fdi.y(bundle, new e(this, lbs.class, "isNeedShowProfileInHeader", "isNeedShowProfileInHeader(Lcom/vk/core/fragments/FragmentImpl;)Z", 1), new f(0, this, MusicOfflineCatalogFragment.class, "isResumed", "isResumed()Z", 0));
        return new MusicOfflineCatalogRootVh(kn(), new b(this, this.U, (xk40) this.W.getValue()), getArguments(), y, new c(0, this, MusicOfflineCatalogFragment.class, "onAvatarClickAction", "onAvatarClickAction()V", 0), new d(0, this, MusicOfflineCatalogFragment.class, "onAvatarLongClickAction", "onAvatarLongClickAction()V", 0), k, (k850) this.S.getValue(), (g950) this.T.getValue());
    }

    @Override // xsna.aes
    public final void h7(v6j v6jVar) {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        MusicOfflineCatalogRootVh musicOfflineCatalogRootVh = catalogRootViewHolder instanceof MusicOfflineCatalogRootVh ? (MusicOfflineCatalogRootVh) catalogRootViewHolder : null;
        if (musicOfflineCatalogRootVh == null || musicOfflineCatalogRootVh.j0()) {
            return;
        }
        musicOfflineCatalogRootVh.D.getClass();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        uq40 uq40Var = this.U;
        dw20 dw20Var = uq40Var.a;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        uq40Var.a = null;
        super.onDetach();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Boolean valueOf = Boolean.valueOf(lbs.l(this));
        lbs.m(this);
        fdi.I(this.V, bundle, valueOf, Boolean.FALSE, 8);
    }

    @Override // xsna.aes
    public final RectF p1() {
        zhf0 zhf0Var;
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        MusicOfflineCatalogRootVh musicOfflineCatalogRootVh = catalogRootViewHolder instanceof MusicOfflineCatalogRootVh ? (MusicOfflineCatalogRootVh) catalogRootViewHolder : null;
        if (musicOfflineCatalogRootVh == null || musicOfflineCatalogRootVh.j0()) {
            return null;
        }
        VkTopBar vkTopBar = musicOfflineCatalogRootVh.D.n;
        if (vkTopBar == null || (zhf0Var = vkTopBar.getLeftAvatarRect()) == null) {
            zhf0Var = zhf0.e;
        }
        return zjq.o(zhf0Var);
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

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        Bundle arguments = getArguments();
        uiTrackingScreen.a = arguments != null ? arguments.getBoolean("key_include_offline_mode", false) : false ? MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_MY_MUSIC : MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY;
        super.y(uiTrackingScreen);
    }
}
