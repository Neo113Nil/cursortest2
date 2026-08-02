package com.vk.catalog2.feature.music.ui.holder;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.TabsOrListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.movika.sdk.base.logic.processor.h;
import com.vkontakte.android.R;
import xsna.bnn0;
import xsna.cs2;
import xsna.f5z;
import xsna.g3a;
import xsna.ltz;
import xsna.m7m;
import xsna.nda;
import xsna.o5a;
import xsna.swp;
import xsna.tfc;
import xsna.u4a;

/* compiled from: AudioBookPersonGenreCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class AudioBookPersonGenreCatalogRootVh extends CatalogRootViewHolder implements CatalogVh, SwitchCatalogVh.b, CatalogStatesViewHolder {
    public final g3a p;
    public final tfc q;
    public final TabsOrListVh r;
    public final SwitchCatalogVh s;

    public AudioBookPersonGenreCatalogRootVh() {
        throw null;
    }

    public AudioBookPersonGenreCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        u4a u4aVar = this.m;
        g3a S = u4aVar.b.s.S(u4aVar, null);
        this.p = S;
        this.q = new tfc(m7m.f(this));
        ErrorStateVh errorStateVh = new ErrorStateVh(this, new h(this, 5));
        ProgressVh progressVh = new ProgressVh((Object) null);
        u4a u4aVar2 = this.m;
        u4a.a aVar = u4aVar2.b;
        TabsOrListVh tabsOrListVh = new TabsOrListVh(u4aVar2, new ToolbarVh(aVar.b, aVar.e, null, 0, false, null, null, null, null, null, null, 4194300), 0, null, false, S, N(), null, null, null, false, null, 261372);
        this.r = tabsOrListVh;
        this.s = new SwitchCatalogVh(tabsOrListVh, null, errorStateVh, progressVh, this, R.layout.catalog_root_vh_layout_no_behaviour, null, null, false, false, null, 1986);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.s.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.q.c();
        this.s.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = this.s.k5(layoutInflater, viewGroup, null);
        k5.post(new cs2(this, 1));
        i8(ltz.a);
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.s.L();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.s.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        SwitchCatalogVh switchCatalogVh = this.s;
        if (bnn0Var.equals(switchCatalogVh.r)) {
            return;
        }
        switchCatalogVh.i8(bnn0Var);
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.s.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.q.d();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.q.e();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.r.y(uiTrackingScreen);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
