package com.vk.search.ui.impl.catalog.roots;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.dto.music.SearchSuggestion;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import com.vk.search.ui.impl.catalog.MusicDiscoverSearchCatalogFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.ok.android.utils.Logger;
import xsna.Cnew;
import xsna.b5a;
import xsna.b9q0;
import xsna.bn40;
import xsna.bpn0;
import xsna.c120;
import xsna.cfp0;
import xsna.cqm0;
import xsna.d120;
import xsna.dh40;
import xsna.f550;
import xsna.fpf0;
import xsna.gym;
import xsna.i440;
import xsna.iw3;
import xsna.izs;
import xsna.jz;
import xsna.k7m;
import xsna.kca;
import xsna.ln40;
import xsna.lwf0;
import xsna.m130;
import xsna.m7m;
import xsna.mhy;
import xsna.msy;
import xsna.nuj;
import xsna.o5a;
import xsna.p010;
import xsna.pr6;
import xsna.q130;
import xsna.q3a;
import xsna.r250;
import xsna.s3q0;
import xsna.u0a;
import xsna.uha;
import xsna.wh1;
import xsna.x3i;
import xsna.yp70;
import xsna.yv2;
import xsna.zqh0;

/* compiled from: MusicSearchCatalogRootVh.kt */
/* loaded from: classes5.dex */
public final class MusicSearchCatalogRootVh extends GlobalSearchFeatureCatalogRootVh implements View.OnTouchListener {
    public final bpn0 A;
    public final bpn0 u;
    public final kca v;
    public final Object w;
    public final CatalogGetAudioSearchRequestFactory x;
    public final ln40 y;
    public final Object z;

    /* compiled from: MusicSearchCatalogRootVh.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    /* compiled from: MusicSearchCatalogRootVh.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    public MusicSearchCatalogRootVh() {
        throw null;
    }

    public MusicSearchCatalogRootVh(FragmentActivity fragmentActivity, o5a o5aVar, zqh0 zqh0Var, Bundle bundle, MusicDiscoverSearchCatalogFragment musicDiscoverSearchCatalogFragment) {
        super(bundle, fragmentActivity, o5aVar, zqh0Var, musicDiscoverSearchCatalogFragment);
        this.u = new bpn0(new m130(this, 7));
        kca kcaVar = new kca(new bpn0(new pr6(20)));
        this.v = kcaVar;
        i440 i440Var = new i440(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, i440Var);
        this.w = a2;
        this.x = new CatalogGetAudioSearchRequestFactory(this.m.b.s.N(), new yv2(22), new r250(kcaVar), (yp70) a2.getValue(), new gym(0, this, MusicSearchCatalogRootVh.class, "isObjectSearchHistoryEnabled", "isObjectSearchHistoryEnabled()Z", 0, 1));
        this.y = new ln40(fragmentActivity, ((MusicPrefsComponent) ((k7m) m7m.f(this)).a(fpf0.a(MusicPrefsComponent.class))).Q0());
        SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
        searchStatInfoProvider.getClass();
        searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
        this.z = msy.a(lazyThreadSafetyMode, new x3i(this, 27));
        this.A = new bpn0(new f550(this, 0));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final uha P() {
        return (uha) this.A.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 20);
        super.S(cfp0Var);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CatalogConfiguration catalogConfiguration = this.m.b.s;
        MusicSearchCatalogConfiguration musicSearchCatalogConfiguration = catalogConfiguration instanceof MusicSearchCatalogConfiguration ? (MusicSearchCatalogConfiguration) catalogConfiguration : null;
        if (musicSearchCatalogConfiguration != null) {
            musicSearchCatalogConfiguration.F = this.y;
            musicSearchCatalogConfiguration.P = new Cnew(this, 13);
        }
        View X = super.X(layoutInflater, viewGroup, null);
        k0().setOnTouchListener(this);
        return X;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c g0(b5a b5aVar) {
        f<u0a> fVar = b5aVar.a;
        iw3 iw3Var = new iw3(new wh1(29), 25);
        fVar.getClass();
        return new i0(fVar, iw3Var).subscribe(new dh40(new p010(this, 12), 2), new d120(new a(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 4));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c h0(q3a q3aVar) {
        return q3aVar.a().b0(lwf0.class).subscribe(new jz(new q130(this, 6), 29), new c120(new b(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 7));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh
    public final SearchRequestFactory i0() {
        return this.x;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen l0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MUSIC;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        super.onResume();
        String str = this.x.e;
        if (str == null || str.length() == 0) {
            ((yp70) this.w.getValue()).a(new nuj(this, 25));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str = this.x.e;
        if (str == null) {
            return false;
        }
        this.v.a(str);
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        SearchSuggestion searchSuggestion;
        if (i != R.id.search_suggestion) {
            if ((uIBlock != null ? uIBlock.e : null) == CatalogDataType.DATA_TYPE_AUDIO_SEARCH_RECENTS) {
                mhy.d(this.q);
                return;
            } else {
                this.m.b.b.c(false);
                return;
            }
        }
        UIBlockSearchSuggestion uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
        if (uIBlockSearchSuggestion == null || (searchSuggestion = uIBlockSearchSuggestion.y) == null) {
            return;
        }
        this.p.e(new SearchQuery(searchSuggestion.c, SearchInputMethod.Suggest, cqm0.a(searchSuggestion.f), cqm0.a(((UIBlockSearchSuggestion) uIBlock).y.k)), b9q0.a.a);
    }
}
