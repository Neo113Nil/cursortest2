package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh;
import com.vk.dto.music.SearchSuggestion;
import com.vk.log.L;
import com.vk.movika.sdk.base.observable.s;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import com.vk.search.ui.impl.catalog.GlobalSearchClipsFeatureCatalogFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import defpackage.f;
import defpackage.g;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import xsna.b5a;
import xsna.b9q0;
import xsna.bpn0;
import xsna.cfp0;
import xsna.cqm0;
import xsna.e6a;
import xsna.h13;
import xsna.i70;
import xsna.j70;
import xsna.jsh0;
import xsna.jz;
import xsna.m3a;
import xsna.o5a;
import xsna.o89;
import xsna.oz;
import xsna.sok0;
import xsna.u0a;
import xsna.uw4;
import xsna.vw4;
import xsna.w8;
import xsna.x0a;
import xsna.x8;
import xsna.yh1;
import xsna.zmc;
import xsna.zqh0;

/* compiled from: ClipGlobalSearchFeatureRootVh.kt */
/* loaded from: classes16.dex */
public final class ClipGlobalSearchFeatureRootVh extends GlobalSearchFeatureCatalogRootVh {
    public final bpn0 u;
    public final zmc v;
    public final bpn0 w;

    /* compiled from: ClipGlobalSearchFeatureRootVh.kt */
    public static final class a implements sok0 {
        public final Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // xsna.sok0
        public final boolean S(UIBlockList uIBlockList) {
            return false;
        }

        @Override // xsna.sok0
        public final int getSpanCount() {
            VideoItemListSettings videoItemListSettings = VideoItemListSettings.i;
            return VideoItemListSettings.a.a(this.b);
        }

        @Override // xsna.sok0
        public final int q(UIBlock uIBlock) {
            if (uIBlock instanceof UIBlockVideo) {
                return 1;
            }
            return getSpanCount();
        }
    }

    public ClipGlobalSearchFeatureRootVh() {
        throw null;
    }

    public ClipGlobalSearchFeatureRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, zqh0 zqh0Var, GlobalSearchClipsFeatureCatalogFragment globalSearchClipsFeatureCatalogFragment) {
        super(bundle, fragmentActivity, o5aVar, zqh0Var, globalSearchClipsFeatureCatalogFragment);
        this.u = new bpn0(new h13(7));
        this.v = new zmc(new x0a(new i70(this, 19), new j70(this, 19)), new f(this, 11));
        this.w = new bpn0(new g(this, 20));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View X = super.X(layoutInflater, viewGroup, null);
        k0().setOnTouchListener(new o89(this, 1));
        return X;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c f0(m3a m3aVar) {
        return new io.reactivex.rxjava3.disposables.b(EmptyDisposable.INSTANCE, ((io.reactivex.rxjava3.subjects.f) m3aVar.b).subscribe(new jz(new uw4(1, new jsh0(this.p), jsh0.class, "onCatalogClickEvent", "onCatalogClickEvent(Lcom/vk/catalog2/common/ui/core/events/click/CatalogClickEvent;)V", 0, 4), 12)));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c g0(b5a b5aVar) {
        io.reactivex.rxjava3.disposables.f fVar = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        io.reactivex.rxjava3.subjects.f<u0a> fVar2 = b5aVar.a;
        yh1 yh1Var = new yh1(new s(15), 6);
        fVar2.getClass();
        int i = 9;
        return new io.reactivex.rxjava3.disposables.b(fVar, new i0(fVar2, yh1Var).subscribe(new x8(new w8(this, 22), i), new oz(new vw4(L.a, 2), i)));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh
    public final SearchRequestFactory i0() {
        return (e6a) this.w.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh
    public final sok0 j0() {
        return new a(this.b);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen l0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_CLIPS;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        if (i == R.id.search_suggestion) {
            if (uIBlock instanceof UIBlockSearchSuggestion) {
                UIBlockSearchSuggestion uIBlockSearchSuggestion = (UIBlockSearchSuggestion) uIBlock;
                SearchSuggestion searchSuggestion = uIBlockSearchSuggestion.y;
                this.p.e(new SearchQuery(searchSuggestion.c, SearchInputMethod.Suggest, cqm0.a(searchSuggestion.f), cqm0.a(uIBlockSearchSuggestion.y.k)), b9q0.a.a);
                return;
            }
            return;
        }
        if (i == R.id.content && (uIBlock instanceof UIBlockVideo)) {
            SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CLIP;
            String r = ((UIBlockVideo) uIBlock).B.r();
            if (r == null) {
                r = "";
            }
            this.v.a(this.b, uIBlock, searchStatInfoProvider.b(type, r, false));
        }
    }
}
