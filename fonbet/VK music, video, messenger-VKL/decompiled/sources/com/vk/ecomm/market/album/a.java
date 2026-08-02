package com.vk.ecomm.market.album;

import com.vk.core.view.components.tabs.VkTabs;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import io.reactivex.rxjava3.disposables.c;
import xsna.tx00;

/* compiled from: MarketEditAlbumGoodsFragment.kt */
/* loaded from: classes18.dex */
public final class a implements VkTabs.b {
    public final /* synthetic */ MarketEditAlbumGoodsFragment a;

    public a(MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment) {
        this.a = marketEditAlbumGoodsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void c(VkTabs.c cVar) {
        MarketEditAlbumGoodsFragment.b bVar = (MarketEditAlbumGoodsFragment.b) MarketEditAlbumGoodsFragment.b.h().get(cVar.b);
        MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = this.a;
        marketEditAlbumGoodsFragment.b1 = bVar;
        c cVar2 = marketEditAlbumGoodsFragment.i0;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        tx00 tx00Var = marketEditAlbumGoodsFragment.Z0;
        MarketEditAlbumGoodsFragment.b bVar2 = MarketEditAlbumGoodsFragment.b.SELECTED;
        tx00Var.notifyDataSetChanged();
        marketEditAlbumGoodsFragment.W0.l(bVar == bVar2 ? marketEditAlbumGoodsFragment.n0 : null);
        marketEditAlbumGoodsFragment.v0.clear();
        marketEditAlbumGoodsFragment.qo();
    }

    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void b() {
    }

    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void a(VkTabs.c cVar) {
    }
}
