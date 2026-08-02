package com.vk.video.playlist.playlistscreen.catalog;

import com.vk.api.generated.catalog.dto.CatalogBadgeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.video.dto.VideoVideoSeasonDto;
import com.vk.api.generated.video.dto.VideoVideoSeriesObjectDto;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.List;
import java.util.Map;
import xsna.arm0;
import xsna.cab0;
import xsna.cg50;
import xsna.dab0;
import xsna.dg50;
import xsna.eab0;
import xsna.epx;
import xsna.f1u;
import xsna.f2a;
import xsna.fab0;
import xsna.fks0;
import xsna.g2a;
import xsna.j5g;
import xsna.k2a;
import xsna.m2a;
import xsna.r2a;
import xsna.s2a;
import xsna.t1a;
import xsna.yzs;

/* compiled from: PlaylistCatalogBlockRegister.kt */
/* loaded from: classes6.dex */
public final class a implements cg50 {
    public final /* synthetic */ dg50 a;

    public a(f1u f1uVar, final fks0 fks0Var) {
        this.a = new dg50(f1uVar, true);
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.Header;
        g2a g2aVar = new g2a(new yzs() { // from class: com.vk.video.playlist.playlistscreen.catalog.c
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v5 */
            /* JADX WARN: Type inference failed for: r9v6 */
            /* JADX WARN: Type inference failed for: r9v8 */
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ?? r9;
                boolean z;
                String d;
                Integer m;
                VideoVideoAlbumFullDto videoVideoAlbumFullDto;
                VideoVideoSeriesObjectDto k;
                List<VideoVideoSeasonDto> d2;
                CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
                CatalogBlockVariant catalogBlockVariant2 = (CatalogBlockVariant) obj3;
                boolean C1 = fks0.this.C1();
                List<VideoVideoAlbumFullDto> list = ((CatalogExtraResponseObjectDto) obj).o;
                Boolean valueOf = (list == null || (videoVideoAlbumFullDto = (VideoVideoAlbumFullDto) j5g.a0(list)) == null || (k = videoVideoAlbumFullDto.k()) == null || (d2 = k.d()) == null) ? null : Boolean.valueOf(d2.isEmpty());
                String id = catalogBlockDto.getId();
                String title = catalogBlockDto.getTitle();
                if (title == null) {
                    title = "";
                }
                CatalogBadgeDto D = catalogBlockDto.D();
                String d3 = D != null ? D.d() : null;
                boolean z2 = true;
                if (C1 && epx.f(valueOf, Boolean.FALSE)) {
                    r9 = 1;
                    z2 = false;
                } else {
                    r9 = 1;
                }
                CatalogBadgeDto D2 = catalogBlockDto.D();
                if (D2 == null || (d = D2.d()) == null || (m = arm0.m(10, d)) == null) {
                    z = r9;
                } else {
                    z = m.intValue() <= r9 ? r9 : false;
                }
                return new PlaylistHeaderView$State(id, catalogBlockVariant2, title, d3, z2, z, null);
            }
        });
        dab0 dab0Var = dab0.b;
        b bVar = new b();
        f fVar = new f();
        a(catalogBlockVariant, g2aVar);
        c(PlaylistHeaderView$State.class, new cab0(dab0Var));
        h(PlaylistHeaderView$State.class, bVar);
        g(PlaylistHeaderView$ViewState.class, fVar);
        CatalogBlockVariant catalogBlockVariant2 = CatalogBlockVariant.HorizontalFiltersWithScroll;
        g2a g2aVar2 = new g2a(new h());
        fab0 fab0Var = fab0.b;
        i iVar = new i();
        k kVar = new k();
        a(catalogBlockVariant2, g2aVar2);
        c(PlaylistHorizontalFiltersWithScrollView$State.class, new eab0(fab0Var));
        h(PlaylistHorizontalFiltersWithScrollView$State.class, iVar);
        g(n.class, kVar);
    }

    @Override // xsna.cg50
    public final void a(CatalogBlockVariant catalogBlockVariant, f2a<?> f2aVar) {
        this.a.a(catalogBlockVariant, f2aVar);
    }

    @Override // xsna.cg50
    public final Map<CatalogBlockVariant, f2a<?>> b() {
        return this.a.b;
    }

    @Override // xsna.cg50
    public final void c(Class<? extends CatalogBlockState> cls, t1a<? super CatalogBlockState> t1aVar) {
        this.a.c(cls, t1aVar);
    }

    @Override // xsna.cg50
    public final Map<Class<? extends CatalogBlockState>, s2a<? super CatalogBlockState, ?>> d() {
        return this.a.d;
    }

    @Override // xsna.cg50
    public final Map<Class<? extends r2a>, k2a> e() {
        return this.a.e;
    }

    @Override // xsna.cg50
    public final Map<Class<? extends CatalogBlockState>, t1a<? super CatalogBlockState>> f() {
        return this.a.c;
    }

    @Override // xsna.cg50
    public final void g(Class cls, m2a m2aVar) {
        this.a.g(cls, m2aVar);
    }

    @Override // xsna.cg50
    public final void h(Class<? extends CatalogBlockState> cls, s2a<? super CatalogBlockState, ?> s2aVar) {
        this.a.h(cls, s2aVar);
    }
}
