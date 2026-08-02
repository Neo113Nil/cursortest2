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
import com.vkontakte.android.R;
import xsna.b04;
import xsna.bnn0;
import xsna.f5z;
import xsna.g3a;
import xsna.ltz;
import xsna.m7m;
import xsna.nda;
import xsna.o5a;
import xsna.qc;
import xsna.swp;
import xsna.tfc;
import xsna.u4a;

/* compiled from: AudioBookGenreCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class AudioBookGenreCatalogRootVh extends CatalogRootViewHolder implements CatalogVh, SwitchCatalogVh.b, CatalogStatesViewHolder {
    public final g3a p;
    public final TabsOrListVh q;
    public final SwitchCatalogVh r;
    public final tfc s;

    public AudioBookGenreCatalogRootVh() {
        throw null;
    }

    public AudioBookGenreCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        u4a u4aVar = this.m;
        g3a S = u4aVar.b.s.S(u4aVar, null);
        this.p = S;
        ErrorStateVh errorStateVh = new ErrorStateVh(this, new qc(this, 1));
        ProgressVh progressVh = new ProgressVh((Object) null);
        u4a u4aVar2 = this.m;
        u4a.a aVar = u4aVar2.b;
        TabsOrListVh tabsOrListVh = new TabsOrListVh(u4aVar2, new ToolbarVh(aVar.b, aVar.e, null, 0, false, null, null, null, null, null, null, 4194300), 0, null, false, S, N(), null, null, null, false, null, 261372);
        this.q = tabsOrListVh;
        this.r = new SwitchCatalogVh(tabsOrListVh, null, errorStateVh, progressVh, this, R.layout.catalog_root_vh_layout_no_behaviour, null, null, false, false, null, 1986);
        this.s = new tfc(m7m.f(this));
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.r.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.s.c();
        this.r.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = this.r.k5(layoutInflater, viewGroup, null);
        k5.post(new b04(this, 1));
        i8(ltz.a);
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.r.L();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.r.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        SwitchCatalogVh switchCatalogVh = this.r;
        if (bnn0Var.equals(switchCatalogVh.r)) {
            return;
        }
        switchCatalogVh.i8(bnn0Var);
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.r.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.s.d();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.s.e();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.q.y(uiTrackingScreen);
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
