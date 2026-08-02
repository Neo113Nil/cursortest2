package com.vk.catalog2.common.ui.mvp.holder.stories;

import com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh;
import com.vk.core.view.search.ModernSearchView;
import xsna.bcw0;
import xsna.vyh0;

/* compiled from: MusicSelectorCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class a extends bcw0 {
    public final /* synthetic */ MusicClipsSelectorCatalogRootVh a;

    public a(MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh) {
        this.a = musicClipsSelectorCatalogRootVh;
    }

    @Override // xsna.bcw0
    public final void a(bcw0.a aVar) {
        ModernSearchView modernSearchView;
        String str = aVar.a;
        MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh = this.a;
        MusicSelectorCatalogRootVh.a aVar2 = musicClipsSelectorCatalogRootVh.q;
        if (aVar2 != null) {
            aVar2.a(false);
        }
        if (str == null || str.length() == 0 || (modernSearchView = musicClipsSelectorCatalogRootVh.A.b.k) == null) {
            return;
        }
        modernSearchView.setQuery(str);
    }

    @Override // xsna.bcw0
    public final void b() {
        MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh = this.a;
        musicClipsSelectorCatalogRootVh.G.clear();
        musicClipsSelectorCatalogRootVh.i8(vyh0.a);
        MusicSelectorCatalogRootVh.a aVar = musicClipsSelectorCatalogRootVh.q;
        if (aVar != null) {
            aVar.a(true);
        }
    }
}
