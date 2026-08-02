package com.vk.video.playlist.playlistscreen.catalog;

import com.vk.catalog.mvi.section.domain.CatalogFilterDo;
import com.vk.video.playlist.playlistscreen.catalog.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.b2a;
import xsna.c5g;
import xsna.e43;
import xsna.izs;
import xsna.j5g;
import xsna.u1a;

/* compiled from: PlaylistHorizontalFiltersWithScrollView.kt */
/* loaded from: classes6.dex */
public final class m extends u1a<PlaylistHorizontalFiltersWithScrollView$State, j> {
    @Override // xsna.u1a
    public final void g(j jVar) {
        String str;
        final j jVar2 = jVar;
        if (!(jVar2 instanceof j.a)) {
            throw new NoWhenBranchMatchedException();
        }
        m(new izs() { // from class: com.vk.video.playlist.playlistscreen.catalog.l
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                PlaylistHorizontalFiltersWithScrollView$State playlistHorizontalFiltersWithScrollView$State = (PlaylistHorizontalFiltersWithScrollView$State) obj;
                j.a aVar = (j.a) j.this;
                int i = aVar.c;
                List<CatalogFilterDo> list = playlistHorizontalFiltersWithScrollView$State.d;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    CatalogFilterDo catalogFilterDo = (CatalogFilterDo) obj2;
                    arrayList.add(new CatalogFilterDo(catalogFilterDo.b, aVar.c == i2, catalogFilterDo.d, catalogFilterDo.e, catalogFilterDo.f));
                    i2 = i3;
                }
                return new PlaylistHorizontalFiltersWithScrollView$State(playlistHorizontalFiltersWithScrollView$State.b, playlistHorizontalFiltersWithScrollView$State.c, arrayList, i, null);
            }
        });
        CatalogFilterDo catalogFilterDo = (CatalogFilterDo) j5g.b0(((j.a) jVar2).c, ((PlaylistHorizontalFiltersWithScrollView$State) ((b2a) this.b.b).getCurrentState()).d);
        if (catalogFilterDo == null || (str = catalogFilterDo.e) == null) {
            return;
        }
        s(Collections.singletonList(str));
    }
}
