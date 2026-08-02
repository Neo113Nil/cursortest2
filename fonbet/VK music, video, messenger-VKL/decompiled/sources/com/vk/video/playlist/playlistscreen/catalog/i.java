package com.vk.video.playlist.playlistscreen.catalog;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.section.domain.CatalogFilterDo;
import com.vk.video.playlist.playlistscreen.catalog.n;
import java.util.ArrayList;
import java.util.List;
import xsna.c5g;
import xsna.r2a;
import xsna.s2a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class i implements s2a {
    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        PlaylistHorizontalFiltersWithScrollView$State playlistHorizontalFiltersWithScrollView$State = (PlaylistHorizontalFiltersWithScrollView$State) catalogBlockState;
        String str = playlistHorizontalFiltersWithScrollView$State.b;
        List<CatalogFilterDo> list = playlistHorizontalFiltersWithScrollView$State.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (CatalogFilterDo catalogFilterDo : list) {
            arrayList.add(new n.a(catalogFilterDo.b, catalogFilterDo.c));
        }
        return new n(str, arrayList, playlistHorizontalFiltersWithScrollView$State.e);
    }
}
