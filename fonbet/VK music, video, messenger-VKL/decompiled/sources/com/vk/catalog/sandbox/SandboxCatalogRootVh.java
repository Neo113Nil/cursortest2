package com.vk.catalog.sandbox;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.TabsOrListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.core.ui.themes.VKTheme;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.f5z;
import xsna.g3a;
import xsna.nda;
import xsna.nu4;
import xsna.rda;
import xsna.u4a;

/* compiled from: SandboxCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class SandboxCatalogRootVh extends CatalogRootViewHolder implements CatalogVh, dhr0.e, rda {
    public final g3a p;
    public final TabsOrListVh q;

    public SandboxCatalogRootVh(FragmentActivity fragmentActivity, nda ndaVar, Bundle bundle) {
        super(bundle, (Class) null, (Activity) fragmentActivity, ndaVar, false, (f5z) null, 112);
        u4a.a aVar = this.m.b;
        ToolbarVh toolbarVh = new ToolbarVh(aVar.b, aVar.e, null, 0, false, null, null, null, null, null, null, 4194300);
        u4a u4aVar = this.m;
        g3a S = u4aVar.b.s.S(u4aVar, null);
        this.p = S;
        this.q = new TabsOrListVh(this.m, toolbarVh, R.layout.catalog_stickers_fragment, Integer.valueOf(R.layout.catalog_stickers_tab_layout), true, S, N(), null, null, null, false, null, 261296);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.q.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockCatalog) {
            this.q.N6(uIBlock);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean W() {
        return this.q.a0();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = this.q.k5(layoutInflater, viewGroup, null);
        k5.post(new nu4(this, 8));
        dhr0.f(this);
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.q.L();
        this.p.b();
        dhr0.a.getClass();
        dhr0.X(this);
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.q.A.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        this.q.rg(th);
    }

    @Override // xsna.rda
    public final void s() {
        this.q.s();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        this.q.ya();
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        if (i == R.id.toolbar) {
            s();
        } else {
            this.m.b.b.c(false);
        }
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
