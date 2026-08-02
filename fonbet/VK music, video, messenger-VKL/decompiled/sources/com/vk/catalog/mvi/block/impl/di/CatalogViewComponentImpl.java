package com.vk.catalog.mvi.block.impl.di;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.catalog.mvi.block.api.CatalogViewComponent;
import com.vk.catalog.mvi.block.impl.HeaderView;
import com.vk.catalog.mvi.block.impl.HorizontalButtonsView;
import com.vk.catalog.mvi.block.impl.HorizontalButtonsWithScrollView;
import com.vk.catalog.mvi.block.impl.LinksSmallListVideoLibrary;
import com.vk.catalog.mvi.block.impl.LinksSmallListView;
import com.vk.catalog.mvi.block.impl.OpenSectionArrowButtonView;
import com.vk.catalog.mvi.block.impl.PlaceholderView;
import com.vk.catalog.mvi.block.impl.SeparatorTransparent;
import com.vk.catalog.mvi.block.impl.SeparatorView;
import com.vk.catalog.mvi.block.impl.albumauthor.AlbumTitleSubtitleAvatar$State;
import com.vk.catalog.mvi.block.impl.b;
import com.vk.catalog.mvi.block.impl.banner.BannerView;
import com.vk.catalog.mvi.block.impl.debug.UnknownVariantView;
import com.vk.catalog.mvi.block.impl.f;
import com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView;
import com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView;
import com.vk.catalog.mvi.block.impl.slider.SliderView;
import com.vk.catalog.mvi.block.impl.t;
import com.vk.catalog.mvi.block.impl.u;
import com.vk.catalog.mvi.block.impl.v;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import com.vk.core.serialize.Serializer;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.aba;
import xsna.al1;
import xsna.b25;
import xsna.bba;
import xsna.bl1;
import xsna.bpn0;
import xsna.c8m;
import xsna.cba;
import xsna.cir;
import xsna.dba;
import xsna.dg50;
import xsna.ep;
import xsna.f1u;
import xsna.fp;
import xsna.fpf0;
import xsna.g2a;
import xsna.g8a;
import xsna.g8m;
import xsna.gyu;
import xsna.h7v;
import xsna.hpf0;
import xsna.jyu;
import xsna.m7a;
import xsna.msy;
import xsna.nwy;
import xsna.o0r0;
import xsna.o25;
import xsna.o8a;
import xsna.oji0;
import xsna.pwj0;
import xsna.qcy;
import xsna.tk1;
import xsna.uaa;
import xsna.uia;
import xsna.vaa;
import xsna.via;
import xsna.vk1;
import xsna.waa;
import xsna.xaa;
import xsna.xk1;
import xsna.xwk;
import xsna.yr80;
import xsna.yzs;
import xsna.zaa;

/* compiled from: CatalogViewComponentImpl.kt */
/* loaded from: classes.dex */
public final class CatalogViewComponentImpl implements CatalogViewComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final nwy a;
    public final nwy b;
    public final nwy c;
    public final nwy d;
    public final nwy e;
    public final nwy f = new nwy(new via(0));

    /* compiled from: CatalogViewComponentImpl.kt */
    public static final class a implements c8m<CatalogViewComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            zaa zaaVar = new zaa(g8mVar, 1);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            return new CatalogViewComponentImpl(msy.a(lazyThreadSafetyMode, zaaVar), msy.a(lazyThreadSafetyMode, new aba(g8mVar, 1)), msy.a(lazyThreadSafetyMode, new bba(g8mVar, 1)), msy.a(lazyThreadSafetyMode, new cba(g8mVar, 1)), msy.a(lazyThreadSafetyMode, new dba(g8mVar, 1)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CatalogViewComponentImpl.class, "globalCatalogBlockRegister", "getGlobalCatalogBlockRegister()Lcom/vk/catalog/mvi/register/GlobalCatalogBlockRegister;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, CatalogViewComponentImpl.class, "catalogInteractor", "getCatalogInteractor()Lcom/vk/catalog/mvi/section/domain/CatalogInteractor;", hpf0Var), ep.a(0, CatalogViewComponentImpl.class, "legacyCatalogBlockRegister", "getLegacyCatalogBlockRegister()Lcom/vk/catalog/mvi/legacy/api/CatalogLegacyBlockRegister;", hpf0Var), ep.a(0, CatalogViewComponentImpl.class, "hintsManager", "getHintsManager()Lcom/vk/hints/api/HintsManager;", hpf0Var), ep.a(0, CatalogViewComponentImpl.class, "restrictedUserActionsRepository", "getRestrictedUserActionsRepository()Lcom/vk/video/kidsprofile/restricteduseractions/RestrictedUserActionsRepository;", hpf0Var), ep.a(0, CatalogViewComponentImpl.class, "globalSliderRegister", "getGlobalSliderRegister()Lcom/vk/catalog/mvi/register/MutableCatalogBlockRegisterImpl;", hpf0Var)};
    }

    public CatalogViewComponentImpl(Lazy<? extends CatalogComponent> lazy, Lazy<? extends CatalogInteractorComponent> lazy2, Lazy<? extends CatalogLegacyComponent> lazy3, Lazy<? extends InfoBridgeComponent> lazy4, Lazy<? extends VideoRestrictedUserActionsComponent> lazy5) {
        this.a = new nwy(new uia(lazy, 0));
        this.b = new nwy(new uaa(lazy2, 1));
        this.c = new nwy(new vaa(lazy3, 1));
        this.d = new nwy(new waa(lazy4, 1));
        this.e = new nwy(new xaa(lazy5, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f1u Df() {
        qcy<Object> qcyVar = g[0];
        return (f1u) this.a.c();
    }

    @Override // com.vk.catalog.mvi.block.api.CatalogViewComponent
    public final void K9(cir cirVar) {
        HorizontalPagerView.a(Df(), cirVar);
    }

    @Override // com.vk.catalog.mvi.block.api.CatalogViewComponent
    public final void P9(boolean z) {
        if (z) {
            UnknownVariantView.a(Df());
        }
        f1u Df = Df();
        qcy<Object>[] qcyVarArr = g;
        qcy<Object> qcyVar = qcyVarArr[1];
        nwy nwyVar = this.b;
        HeaderView.a(Df, (m7a) nwyVar.c());
        f1u Df2 = Df();
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        final b25 b25Var = (b25) bpn0Var.getValue();
        bpn0 bpn0Var2 = xwk.b;
        o0r0 o0r0Var = (o0r0) (bpn0Var2 != null ? bpn0Var2 : null).getValue();
        qcy<Object> qcyVar2 = qcyVarArr[4];
        com.vk.video.kidsprofile.restricteduseractions.a aVar = (com.vk.video.kidsprofile.restricteduseractions.a) this.e.c();
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.AlbumsTitleSubtitleAvatar;
        g2a g2aVar = new g2a(new yzs() { // from class: xsna.uk1
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Object obj4;
                UsersUserFullDto usersUserFullDto;
                GroupsGroupFullDto groupsGroupFullDto;
                Image image;
                Image a2;
                Object obj5;
                Object obj6;
                CatalogExtraResponseObjectDto catalogExtraResponseObjectDto = (CatalogExtraResponseObjectDto) obj;
                CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
                CatalogBlockVariant catalogBlockVariant2 = (CatalogBlockVariant) obj3;
                List<VideoVideoAlbumFullDto> d = catalogExtraResponseObjectDto.d();
                ArrayList arrayList = null;
                if (d == null) {
                    return null;
                }
                Iterator<T> it = d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it.next();
                    if (epx.f(((VideoVideoAlbumFullDto) obj4).q(), catalogBlockDto.n1().q())) {
                        break;
                    }
                }
                VideoVideoAlbumFullDto videoVideoAlbumFullDto = (VideoVideoAlbumFullDto) obj4;
                if (videoVideoAlbumFullDto == null) {
                    return null;
                }
                VideoAlbum a3 = b1s0.a(videoVideoAlbumFullDto);
                UserId q = a3.q();
                List<UsersUserFullDto> n = catalogExtraResponseObjectDto.n();
                if (n != null) {
                    Iterator<T> it2 = n.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj6 = null;
                            break;
                        }
                        obj6 = it2.next();
                        if (epx.f(((UsersUserFullDto) obj6).s1(), q)) {
                            break;
                        }
                    }
                    usersUserFullDto = (UsersUserFullDto) obj6;
                } else {
                    usersUserFullDto = null;
                }
                List<GroupsGroupFullDto> g2 = catalogExtraResponseObjectDto.g();
                if (g2 != null) {
                    Iterator<T> it3 = g2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj5 = null;
                            break;
                        }
                        obj5 = it3.next();
                        if (epx.f(((GroupsGroupFullDto) obj5).P0(), fkq0.a(q))) {
                            break;
                        }
                    }
                    groupsGroupFullDto = (GroupsGroupFullDto) obj5;
                } else {
                    groupsGroupFullDto = null;
                }
                if (usersUserFullDto == null && groupsGroupFullDto == null) {
                    return null;
                }
                if (epx.f(a3.q(), b25.this.c())) {
                    image = null;
                } else {
                    if (usersUserFullDto != null) {
                        Serializer.c<Image> cVar = Image.CREATOR;
                        a2 = Image.b.a(usersUserFullDto.r2());
                    } else {
                        Serializer.c<Image> cVar2 = Image.CREATOR;
                        a2 = Image.b.a(groupsGroupFullDto != null ? groupsGroupFullDto.V1() : null);
                    }
                    image = a2;
                }
                String id = catalogBlockDto.getId();
                String title = a3.getTitle();
                if (title == null) {
                    title = "";
                }
                String str = title;
                int Bb = a3.Bb();
                boolean Gb = a3.Gb();
                List<CatalogButtonDto> e = catalogBlockDto.e();
                if (e != null) {
                    List<CatalogButtonDto> list = e;
                    arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(p4a.c((CatalogButtonDto) it4.next(), catalogBlockDto));
                    }
                }
                return new AlbumTitleSubtitleAvatar$State(id, catalogBlockVariant2, str, Bb, image, Gb, q, arrayList, a3.r(), null);
            }
        });
        tk1 tk1Var = new tk1(0, o0r0Var, aVar);
        vk1 vk1Var = new vk1();
        xk1 xk1Var = new xk1();
        Df2.a(catalogBlockVariant, g2aVar);
        Df2.c(AlbumTitleSubtitleAvatar$State.class, new bl1(tk1Var));
        Df2.h(AlbumTitleSubtitleAvatar$State.class, vk1Var);
        Df2.g(al1.class, xk1Var);
        HorizontalButtonsView.b(Df());
        f1u Df3 = Df();
        qcy<Object> qcyVar3 = qcyVarArr[3];
        HorizontalButtonsWithScrollView.a(Df3, (h7v) this.d.c());
        f1u Df4 = Df();
        qcy<Object> qcyVar4 = qcyVarArr[1];
        HorizontalFiltersWithScrollView.b(Df4, (m7a) nwyVar.c());
        LinksSmallListVideoLibrary.a(Df());
        LinksSmallListView.a(Df());
        OpenSectionArrowButtonView.a(Df());
        SeparatorTransparent.a(Df());
        SeparatorView.a(Df());
        BannerView.a(Df());
        PlaceholderView.a(Df());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog.mvi.block.api.CatalogViewComponent
    public final void W6(oji0 oji0Var) {
        f1u Df = Df();
        qcy<Object> qcyVar = g[5];
        SliderView.a(Df, (dg50) this.f.c(), oji0Var);
    }

    @Override // com.vk.catalog.mvi.block.api.CatalogViewComponent
    public final void y() {
        qcy<Object>[] qcyVarArr = g;
        qcy<Object> qcyVar = qcyVarArr[2];
        nwy nwyVar = this.c;
        com.vk.catalog.mvi.legacy.api.a aVar = (com.vk.catalog.mvi.legacy.api.a) nwyVar.c();
        qcy<Object> qcyVar2 = qcyVarArr[1];
        m7a m7aVar = (m7a) this.b.c();
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.Header;
        aVar.b(catalogBlockVariant, new jyu(catalogBlockVariant, new o8a(new b()), new gyu(m7aVar, 0), new HeaderView.e(f.b), new HeaderView.a(), new g8a(false)));
        qcy<Object> qcyVar3 = qcyVarArr[2];
        com.vk.catalog.mvi.legacy.api.a aVar2 = (com.vk.catalog.mvi.legacy.api.a) nwyVar.c();
        CatalogBlockVariant catalogBlockVariant2 = CatalogBlockVariant.OpenSectionArrowButton;
        aVar2.b(catalogBlockVariant2, new yr80(catalogBlockVariant2, new o8a(new t()), v.b, new u(), new OpenSectionArrowButtonView.a(), new g8a(false)));
    }
}
