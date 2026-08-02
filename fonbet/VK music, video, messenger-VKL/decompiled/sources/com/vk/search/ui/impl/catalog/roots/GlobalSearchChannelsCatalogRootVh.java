package com.vk.search.ui.impl.catalog.roots;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.log.L;
import com.vk.search.ui.impl.catalog.SearchChannelsFeatureCatalogFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import defpackage.x;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.subjects.f;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.utils.Logger;
import xsna.a1w;
import xsna.bpn0;
import xsna.c40;
import xsna.cfp0;
import xsna.dhh;
import xsna.dnh;
import xsna.eoh;
import xsna.m3a;
import xsna.msy;
import xsna.o5a;
import xsna.o6a;
import xsna.om1;
import xsna.p5h;
import xsna.q1w;
import xsna.zqh0;
import xsna.zxo;

/* compiled from: GlobalSearchChannelsCatalogRootVh.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchChannelsCatalogRootVh extends GlobalSearchFeatureCatalogRootVh {
    public final bpn0 u;
    public final Object v;
    public final b w;

    public GlobalSearchChannelsCatalogRootVh() {
        throw null;
    }

    public GlobalSearchChannelsCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, SearchChannelsFeatureCatalogFragment searchChannelsFeatureCatalogFragment, o5a o5aVar, zqh0 zqh0Var) {
        super(bundle, fragmentActivity, o5aVar, zqh0Var, searchChannelsFeatureCatalogFragment);
        this.u = new bpn0(new dnh(this, 26));
        this.v = msy.a(LazyThreadSafetyMode.NONE, new p5h(this, 19));
        b bVar = new b();
        this.w = bVar;
        a1w a1wVar = q1w.a;
        bVar.b((a1wVar == null ? null : a1wVar).l.a().subscribe(new om1(new dhh(this, 18), 23), new c40(new eoh(1, L.a, L.class, Logger.METHOD_W, "w(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0, 2), 22)));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_CHANNELS, 12);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.w.e();
        super.Y();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c f0(m3a m3aVar) {
        return ((f) m3aVar.b).subscribe(new x(new zxo(this, 12), 25));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh
    public final SearchRequestFactory i0() {
        return (o6a) this.u.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen l0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_CHANNELS;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_CHANNELS;
    }
}
