package com.vk.catalog.mvi.block.music.impl.di;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.music.api.di.CatalogMusicViewComponent;
import com.vk.catalog.mvi.block.music.impl.artists.mix.ArtistMix$ArtistMixState;
import com.vk.catalog.mvi.block.music.impl.artists.slider.entity.ArtistSliderState;
import com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton;
import com.vk.catalog.mvi.block.music.impl.buttons.b;
import com.vk.catalog.mvi.block.music.impl.buttons.c;
import com.vk.catalog.mvi.block.music.impl.buttons.g;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.block.music.impl.filters.MusicTabsFiltersView;
import com.vk.catalog.mvi.block.music.impl.recommended.entity.RecommendedPlaylistState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import com.vk.catalog.mvi.section.domain.CatalogFilterOptionDo;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.dto.common.Image;
import com.vk.dto.music.Artist;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.music.mix.MixSettingsComponent;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.aba;
import xsna.as3;
import xsna.b1h0;
import xsna.bba;
import xsna.bs3;
import xsna.c8m;
import xsna.cba;
import xsna.dba;
import xsna.ds3;
import xsna.ep;
import xsna.f1u;
import xsna.f2a;
import xsna.fef0;
import xsna.fl4;
import xsna.fp;
import xsna.fpf0;
import xsna.fs3;
import xsna.g8a;
import xsna.g8m;
import xsna.gs3;
import xsna.gt3;
import xsna.hef0;
import xsna.hpf0;
import xsna.is3;
import xsna.it3;
import xsna.j90;
import xsna.jef0;
import xsna.jt3;
import xsna.kef0;
import xsna.kt3;
import xsna.lef0;
import xsna.m7a;
import xsna.msy;
import xsna.nwy;
import xsna.o8a;
import xsna.ps3;
import xsna.pwj0;
import xsna.q4v0;
import xsna.qcy;
import xsna.qs3;
import xsna.s950;
import xsna.tdf0;
import xsna.ts3;
import xsna.u2b0;
import xsna.uaa;
import xsna.udf0;
import xsna.us3;
import xsna.v950;
import xsna.vaa;
import xsna.waa;
import xsna.wdf0;
import xsna.ws3;
import xsna.wzs;
import xsna.xaa;
import xsna.xdf0;
import xsna.yaa;
import xsna.yf40;
import xsna.yr3;
import xsna.zaa;
import xsna.zdf0;
import xsna.zr3;

/* compiled from: CatalogMusicViewComponentImpl.kt */
/* loaded from: classes.dex */
public final class CatalogMusicViewComponentImpl implements CatalogMusicViewComponent {
    public static final /* synthetic */ qcy<Object>[] i;
    public final AudioModelsComponent a;
    public final MixSettingsComponent b;
    public final Object c;
    public final nwy d;
    public final nwy e;
    public final nwy f;
    public final nwy g;
    public final nwy h;

    /* compiled from: CatalogMusicViewComponentImpl.kt */
    public static final class a implements c8m<CatalogMusicViewComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            zaa zaaVar = new zaa(g8mVar, 0);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            return new CatalogMusicViewComponentImpl(msy.a(lazyThreadSafetyMode, zaaVar), msy.a(lazyThreadSafetyMode, new aba(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new bba(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new cba(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new dba(g8mVar, 0)), (AudioModelsComponent) g8mVar.a(fpf0.a(AudioModelsComponent.class)), (MixSettingsComponent) g8mVar.a(fpf0.a(MixSettingsComponent.class)), msy.a(lazyThreadSafetyMode, new j90(g8mVar, 1)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CatalogMusicViewComponentImpl.class, "globalCatalogBlockRegister", "getGlobalCatalogBlockRegister()Lcom/vk/catalog/mvi/register/GlobalCatalogBlockRegister;", 0);
        hpf0 hpf0Var = fpf0.a;
        i = new qcy[]{propertyReference1Impl, fp.c(0, CatalogMusicViewComponentImpl.class, "catalogInteractor", "getCatalogInteractor()Lcom/vk/catalog/mvi/section/domain/CatalogInteractor;", hpf0Var), ep.a(0, CatalogMusicViewComponentImpl.class, "legacyCatalogBlockRegister", "getLegacyCatalogBlockRegister()Lcom/vk/catalog/mvi/legacy/api/CatalogLegacyBlockRegister;", hpf0Var), ep.a(0, CatalogMusicViewComponentImpl.class, "applicationContext", "getApplicationContext()Landroid/content/Context;", hpf0Var), ep.a(0, CatalogMusicViewComponentImpl.class, "audioBridge", "getAudioBridge()Lcom/vk/bridges/AudioBridge;", hpf0Var)};
    }

    public CatalogMusicViewComponentImpl(Lazy<? extends CatalogComponent> lazy, Lazy<? extends CatalogInteractorComponent> lazy2, Lazy<? extends CatalogLegacyComponent> lazy3, Lazy<AppContextDiComponent> lazy4, Lazy<? extends BridgeComponent> lazy5, AudioModelsComponent audioModelsComponent, MixSettingsComponent mixSettingsComponent, Lazy<? extends MusicAnalyticsComponent> lazy6) {
        this.a = audioModelsComponent;
        this.b = mixSettingsComponent;
        this.c = lazy6;
        this.d = new nwy(new uaa(lazy, 0));
        this.e = new nwy(new vaa(lazy2, 0));
        this.f = new nwy(new waa(lazy3, 0));
        this.g = new nwy(new xaa(lazy4, 0));
        this.h = new nwy(new yaa(lazy5, 0));
    }

    public final fl4 Df() {
        qcy<Object> qcyVar = i[4];
        return (fl4) this.h.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f1u Ef() {
        qcy<Object> qcyVar = i[0];
        return (f1u) this.d.c();
    }

    public final com.vk.catalog.mvi.legacy.api.a Ff() {
        qcy<Object> qcyVar = i[2];
        return (com.vk.catalog.mvi.legacy.api.a) this.f.c();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog.mvi.block.music.api.di.CatalogMusicViewComponent
    public final yf40 H5() {
        return new yf40(((MusicAnalyticsComponent) this.c.getValue()).Bd());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog.mvi.block.music.api.di.CatalogMusicViewComponent
    public final void Q() {
        f1u Ef = Ef();
        AudioModelsComponent audioModelsComponent = this.a;
        final u2b0 r = audioModelsComponent.r();
        q4v0 af = this.b.af();
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.ArtistMixBlurred;
        f2a<?> f2aVar = new f2a() { // from class: xsna.cs3
            @Override // xsna.f2a
            public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant2) {
                List<CatalogButtonDto> e = catalogBlockDto.e();
                if (e == null) {
                    return EmptyList.b;
                }
                List<CatalogButtonDto> list = e;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (CatalogButtonDto catalogButtonDto : list) {
                    List<BaseImageDto> u = catalogButtonDto.u();
                    Image s = u != null ? fvr.s(u) : null;
                    List<BaseImageDto> n = catalogButtonDto.n();
                    Image s2 = n != null ? fvr.s(n) : null;
                    String id = catalogBlockDto.getId();
                    String id2 = catalogBlockDto.getId();
                    String W = catalogButtonDto.W();
                    String str = W == null ? "" : W;
                    String B = catalogButtonDto.B();
                    String str2 = B == null ? "" : B;
                    String title = catalogButtonDto.getTitle();
                    ArtistMix$ArtistMixState.ArtistMixPlayParams artistMixPlayParams = new ArtistMix$ArtistMixState.ArtistMixPlayParams(id2, str, str2, title == null ? "" : title, catalogButtonDto.getId(), catalogButtonDto.l(), catalogButtonDto.C());
                    String id3 = catalogButtonDto.getId();
                    if (id3 == null) {
                        id3 = "";
                    }
                    u2b0 u2b0Var = u2b0.this;
                    StartPlaySource j = u2b0Var.j();
                    StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
                    PlayingState playingState = !id3.equals(startPlayVkMixSource != null ? startPlayVkMixSource.getId() : null) ? PlayingState.NONE : u2b0Var.m0().h() ? PlayingState.PLAYING : PlayingState.PAUSED;
                    String title2 = catalogButtonDto.getTitle();
                    arrayList.add(new ArtistMix$ArtistMixState(BlockId.Simple.a(id), catalogBlockVariant2, artistMixPlayParams, title2 == null ? "" : title2, playingState, catalogButtonDto.getDescription(), s, s2, catalogBlockDto.getId()));
                }
                return arrayList;
            }
        };
        yr3 yr3Var = new yr3(0, af, r);
        as3 as3Var = new as3();
        fs3 fs3Var = new fs3();
        Ef.a(catalogBlockVariant, f2aVar);
        Ef.c(ArtistMix$ArtistMixState.class, new gs3(yr3Var));
        Ef.h(ArtistMix$ArtistMixState.class, as3Var);
        Ef.g(ds3.class, fs3Var);
        f1u Ef2 = Ef();
        qcy<Object>[] qcyVarArr = i;
        qcy<Object> qcyVar = qcyVarArr[3];
        Context context = (Context) this.g.c();
        u2b0 r2 = audioModelsComponent.r();
        fl4 Df = Df();
        CatalogBlockVariant catalogBlockVariant2 = CatalogBlockVariant.RecommendedPlaylistBlurred;
        jef0 jef0Var = new jef0(r2);
        udf0 udf0Var = new udf0(r2, Df);
        lef0 lef0Var = new lef0(context);
        wdf0 wdf0Var = new wdf0(new fef0(Df));
        Ef2.a(catalogBlockVariant2, jef0Var);
        Ef2.c(RecommendedPlaylistState.class, new xdf0(udf0Var));
        Ef2.h(RecommendedPlaylistState.class, lef0Var);
        Ef2.g(kef0.class, wdf0Var);
        f1u Ef3 = Ef();
        fl4 Df2 = Df();
        u2b0 r3 = audioModelsComponent.r();
        CatalogBlockVariant catalogBlockVariant3 = CatalogBlockVariant.PlaylistWithArtistsBlurred;
        it3 it3Var = new it3(r3);
        ps3 ps3Var = new ps3(r3, 0);
        kt3 kt3Var = new kt3();
        ts3 ts3Var = new ts3(new gt3(Df2));
        Ef3.a(catalogBlockVariant3, it3Var);
        Ef3.c(ArtistSliderState.class, new us3(ps3Var));
        Ef3.h(ArtistSliderState.class, kt3Var);
        Ef3.g(jt3.class, ts3Var);
        f1u Ef4 = Ef();
        qcy<Object> qcyVar2 = qcyVarArr[1];
        MusicTabsFiltersView.a(Ef4, (m7a) this.e.c());
        SavePlaylistByFilterButton.a(Ef());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog.mvi.block.music.api.di.CatalogMusicViewComponent
    public final void y() {
        com.vk.catalog.mvi.legacy.api.a Ff = Ff();
        AudioModelsComponent audioModelsComponent = this.a;
        u2b0 r = audioModelsComponent.r();
        q4v0 af = this.b.af();
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.ArtistMixBlurred;
        Ff.b(catalogBlockVariant, new is3(catalogBlockVariant, new o8a(new bs3(r, 0)), new zr3(r, af), new as3(), new fs3(), new g8a(false)));
        com.vk.catalog.mvi.legacy.api.a Ff2 = Ff();
        qcy<Object>[] qcyVarArr = i;
        qcy<Object> qcyVar = qcyVarArr[3];
        Context context = (Context) this.g.c();
        u2b0 r2 = audioModelsComponent.r();
        fl4 Df = Df();
        CatalogBlockVariant catalogBlockVariant2 = CatalogBlockVariant.RecommendedPlaylistBlurred;
        Ff2.b(catalogBlockVariant2, new zdf0(catalogBlockVariant2, new hef0(r2), new tdf0(r2, Df), new lef0(context), new wdf0(new fef0(Df)), new g8a(false)));
        com.vk.catalog.mvi.legacy.api.a Ff3 = Ff();
        fl4 Df2 = Df();
        final u2b0 r3 = audioModelsComponent.r();
        CatalogBlockVariant catalogBlockVariant3 = CatalogBlockVariant.PlaylistWithArtistsBlurred;
        Ff3.b(catalogBlockVariant3, new ws3(catalogBlockVariant3, new o8a(new wzs() { // from class: xsna.rs3
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                CatalogBlockVariant catalogBlockVariant4 = (CatalogBlockVariant) obj;
                UIBlock uIBlock = (UIBlock) obj2;
                if (!(uIBlock instanceof UIBlockMusicPlaylist)) {
                    return null;
                }
                String w = uIBlock.w();
                UIBlockMusicPlaylist uIBlockMusicPlaylist = (UIBlockMusicPlaylist) uIBlock;
                PlayingState h = uzp.h(uIBlockMusicPlaylist.Ub(), u2b0.this);
                String Jb = uIBlock.Jb();
                List<Artist> Pb = uIBlockMusicPlaylist.Pb();
                if (Pb == null) {
                    Pb = EmptyList.b;
                }
                List<Artist> list = Pb;
                return new ArtistSliderState(BlockId.Simple.a(w), catalogBlockVariant4, h, uIBlockMusicPlaylist.Ub(), list, uIBlock.v0(), Jb);
            }
        }), new qs3(r3, 0), new kt3(), new ts3(new gt3(Df2)), new g8a(false)));
        com.vk.catalog.mvi.legacy.api.a Ff4 = Ff();
        qcy<Object> qcyVar2 = qcyVarArr[1];
        m7a m7aVar = (m7a) this.e.c();
        final MusicTabsFiltersView.TabsState.EditModeState editModeState = new MusicTabsFiltersView.TabsState.EditModeState(false, 1, null);
        CatalogBlockVariant catalogBlockVariant4 = CatalogBlockVariant.MusicHorizontalTabsFilters;
        Ff4.b(catalogBlockVariant4, new v950(catalogBlockVariant4, new o8a(new wzs() { // from class: com.vk.catalog.mvi.block.music.impl.filters.c
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                CatalogFilterData Sb;
                CatalogBlockVariant catalogBlockVariant5 = (CatalogBlockVariant) obj;
                UIBlock uIBlock = (UIBlock) obj2;
                UIBlockButtons uIBlockButtons = uIBlock instanceof UIBlockButtons ? (UIBlockButtons) uIBlock : null;
                if (uIBlockButtons == null) {
                    return null;
                }
                String w = uIBlockButtons.w();
                ArrayList<UIBlock> Pb = uIBlockButtons.Pb();
                ArrayList arrayList = new ArrayList();
                for (UIBlock uIBlock2 : Pb) {
                    UIBlockActionFilter uIBlockActionFilter = uIBlock2 instanceof UIBlockActionFilter ? (UIBlockActionFilter) uIBlock2 : null;
                    CatalogFilterOptionDo catalogFilterOptionDo = (uIBlockActionFilter == null || (Sb = uIBlockActionFilter.Sb()) == null) ? null : new CatalogFilterOptionDo(Sb.getText(), Sb.Bb(), Sb.Ab());
                    if (catalogFilterOptionDo != null) {
                        arrayList.add(catalogFilterOptionDo);
                    }
                }
                return new MusicTabsFiltersView.TabsState(w, catalogBlockVariant5, arrayList, MusicTabsFiltersView.TabsState.EditModeState.this, null);
            }
        }), new s950(m7aVar), new com.vk.catalog.mvi.block.music.impl.filters.a(), new MusicTabsFiltersView.a(), new g8a(false)));
        com.vk.catalog.mvi.legacy.api.a Ff5 = Ff();
        CatalogBlockVariant catalogBlockVariant5 = CatalogBlockVariant.MusicSavePlaylistByFilterButton;
        Ff5.b(catalogBlockVariant5, new b1h0(catalogBlockVariant5, new o8a(new c()), g.b, new b(), new SavePlaylistByFilterButton.a(), new g8a(false)));
    }
}
