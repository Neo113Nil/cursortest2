package com.vk.catalog2.feature.music.ui.holder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.TabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.music.SearchSuggestion;
import com.vk.lists.c;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import java.util.HashSet;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.utils.Logger;
import xsna.aca;
import xsna.ah7;
import xsna.alj;
import xsna.b04;
import xsna.b5a;
import xsna.bbb0;
import xsna.bn40;
import xsna.bnn0;
import xsna.bpn0;
import xsna.dml;
import xsna.e43;
import xsna.f5z;
import xsna.fc;
import xsna.fnj;
import xsna.g3a;
import xsna.iah0;
import xsna.ie90;
import xsna.izs;
import xsna.kca;
import xsna.kdw;
import xsna.kea;
import xsna.ltz;
import xsna.m7m;
import xsna.nda;
import xsna.o5a;
import xsna.pb00;
import xsna.pmu;
import xsna.r010;
import xsna.r7a0;
import xsna.rx4;
import xsna.s3q0;
import xsna.swp;
import xsna.sy50;
import xsna.tfc;
import xsna.tj60;
import xsna.u0a;
import xsna.u4a;
import xsna.vd7;
import xsna.vyh0;

/* compiled from: PodcastCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class PodcastCatalogRootVh extends CatalogRootViewHolder implements CatalogVh, View.OnTouchListener, SwitchCatalogVh.b, CatalogStatesViewHolder {
    public String p;
    public String q;
    public final kca r;
    public final g3a s;
    public final ViewPagerVh t;
    public final SearchResultsImplVh u;
    public final VkSearchQueryVh v;
    public final SwitchCatalogVh w;
    public final HidingToolbarVh x;
    public final tfc y;

    /* compiled from: PodcastCatalogRootVh.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    public PodcastCatalogRootVh() {
        throw null;
    }

    public PodcastCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        this.p = "";
        kca kcaVar = new kca(new bpn0(new fc(29)));
        this.r = kcaVar;
        aca acaVar = new aca(this.m.b.s.N(), new rx4(0, kcaVar, kca.class, "loadRecentQueries", "loadRecentQueries()Lio/reactivex/rxjava3/core/Single;", 0, 1), "local_block_id", null, null, 24);
        u4a u4aVar = this.m;
        this.s = u4aVar.b.s.S(u4aVar, null);
        ErrorStateVh errorStateVh = new ErrorStateVh(this, new r010(this, 19));
        ProgressVh progressVh = new ProgressVh((Object) null);
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, false, null, false, null, null, null, N(), null, null, 7166);
        this.t = viewPagerVh;
        TabLayoutVh tabLayoutVh = new TabLayoutVh(viewPagerVh, 0, null, false, this.m.b.r, 990);
        u4a u4aVar2 = this.m;
        u4a.a aVar = u4aVar2.b;
        CatalogConfiguration catalogConfiguration = aVar.s;
        kea keaVar = new kea(acaVar, catalogConfiguration.K(u4aVar2), u4aVar2, new vd7(aVar.e), false, null, null, false, null, null, null, null, null, false, null, 131008);
        SearchResultsImplVh searchResultsImplVh = new SearchResultsImplVh(acaVar, keaVar, new VerticalListVh(catalogConfiguration, new c.h((c.m) keaVar), keaVar, u4aVar2, N(), false, R.layout.catalog_list_vertical_with_appbar_behaviour, null, 864), null, null, null, null, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        this.u = searchResultsImplVh;
        dml dmlVar = new dml(new ah7(this, 7), null, new ie90(this, 4), null, null, 0L, 58);
        VkSearchQueryVh vkSearchQueryVh = new VkSearchQueryVh(new SearchQueryVh(R.string.search, new sy50(this, 9), new bbb0(this, 1), null, dmlVar, 96), null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        this.v = vkSearchQueryVh;
        SwitchCatalogVh switchCatalogVh = new SwitchCatalogVh(viewPagerVh, searchResultsImplVh, errorStateVh, progressVh, this, R.layout.catalog_root_vh_layout_no_behaviour, null, null, false, false, null, 1984);
        this.w = switchCatalogVh;
        this.x = new HidingToolbarVh(this.m.b.e, e43.l(vkSearchQueryVh, tabLayoutVh), switchCatalogVh, null);
        this.y = new tfc(m7m.f(this));
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.w.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.y.c();
        this.x.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean W() {
        if (!(this.w.r instanceof vyh0)) {
            return false;
        }
        i8(alj.a);
        ModernSearchView modernSearchView = this.v.b.k;
        if (modernSearchView == null) {
            return true;
        }
        modernSearchView.j(false, false);
        return true;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        HidingToolbarVh hidingToolbarVh = this.x;
        View k5 = hidingToolbarVh.k5(layoutInflater, viewGroup, null);
        k5.post(new b04(this, 11));
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            HashSet hashSet = iah0.a;
            if (fnj.b(context)) {
                this.v.y8();
            }
        }
        this.u.setOnTouchListener(this);
        i8(ltz.a);
        hidingToolbarVh.a(true);
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.x.L();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c g0(b5a b5aVar) {
        f<u0a> fVar = b5aVar.a;
        tj60 tj60Var = new tj60(new kdw(15), 3);
        fVar.getClass();
        return new i0(fVar, tj60Var).subscribe(new pmu(new pb00(this, 13), 11), new r7a0(new a(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 1));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.w.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        SwitchCatalogVh switchCatalogVh = this.w;
        if (bnn0Var.equals(switchCatalogVh.r)) {
            return;
        }
        switchCatalogVh.i8(bnn0Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        ModernSearchView modernSearchView;
        boolean z = bnn0Var instanceof vyh0;
        VkSearchQueryVh vkSearchQueryVh = this.v;
        if (!z && (modernSearchView = vkSearchQueryVh.b.k) != null) {
            if (!(bnn0Var instanceof ltz)) {
                modernSearchView.a();
            }
            modernSearchView.b(50L);
        }
        if (bnn0Var instanceof swp) {
            vkSearchQueryVh.hide();
        } else {
            vkSearchQueryVh.c(false);
        }
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.x.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.y.d();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.y.e();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.r.a(this.p);
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.t.y(uiTrackingScreen);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        if (i != R.id.search_suggestion) {
            this.m.b.b.c(false);
            return;
        }
        UIBlockSearchSuggestion uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
        if (uIBlockSearchSuggestion != null) {
            SearchSuggestion searchSuggestion = uIBlockSearchSuggestion.y;
            String str = searchSuggestion.c;
            String str2 = searchSuggestion.f;
            this.p = str;
            this.q = str2;
            this.v.zf(str, false);
            SearchResultsVh.cb(this.u, str, str2, null, false, null, false, 60);
        }
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
