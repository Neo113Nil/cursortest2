package com.vk.catalog2.feature.music.ui.holder;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.container.SingleCatalogRootVh;
import com.vk.music.fragment.impl.MusicCatalogFragment;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.m7m;
import xsna.msy;
import xsna.qb8;
import xsna.r1d;
import xsna.tfc;
import xsna.ufk;
import xsna.uha;
import xsna.w950;
import xsna.zd40;

/* compiled from: MusicSingleCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class MusicSingleCatalogRootVh extends SingleCatalogRootVh {
    public final Object u;
    public final zd40 v;
    public final tfc w;

    public MusicSingleCatalogRootVh(Class cls, Bundle bundle, FragmentActivity fragmentActivity, MusicCatalogFragment.a aVar, r1d r1dVar) {
        super(cls, bundle, fragmentActivity, aVar, r1dVar);
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new ufk(this, 19));
        this.u = a;
        this.v = new zd40(this.m.b.f, (w950) a.getValue(), new qb8(10), 4);
        this.w = new tfc(m7m.f(this));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.SingleCatalogRootVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        this.w.c();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.SingleCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final uha P() {
        return this.v;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.SingleCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.w.d();
        super.onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.SingleCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        super.onResume();
        this.w.e();
    }
}
