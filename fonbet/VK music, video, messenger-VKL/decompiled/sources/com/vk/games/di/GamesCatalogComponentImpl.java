package com.vk.games.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.act;
import xsna.b63;
import xsna.bb3;
import xsna.c8m;
import xsna.cuq;
import xsna.duq;
import xsna.ehs;
import xsna.ep;
import xsna.ewy;
import xsna.fat;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gat;
import xsna.hpf0;
import xsna.hu2;
import xsna.j90;
import xsna.kdt;
import xsna.lbt;
import xsna.nwy;
import xsna.ps0;
import xsna.pwj0;
import xsna.qct;
import xsna.qcy;
import xsna.qx2;
import xsna.qy8;
import xsna.rx2;
import xsna.sx2;
import xsna.vbp;
import xsna.via;
import xsna.yg9;
import xsna.z9t;
import xsna.zg9;

/* compiled from: GamesCatalogComponentImpl.kt */
/* loaded from: classes.dex */
public final class GamesCatalogComponentImpl implements GamesCatalogComponent {
    public static final /* synthetic */ qcy<Object>[] s;
    public final ewy a = new ewy(new ps0(3));
    public final ewy b = new ewy(new hu2(4));
    public final ewy c = new ewy(new yg9(this, 2));
    public final nwy d = new nwy(new zg9(3));
    public final ewy e = new ewy(new b63(3));
    public final ewy f = new ewy(new qx2(this, 2));
    public final ewy g = new ewy(new rx2(this, 3));
    public final ewy h = new ewy(new sx2(this, 1));
    public final ewy i = new ewy(new via(2));
    public final ewy j = new ewy(new cuq(this, 1));
    public final ewy k = new ewy(new duq(this, 1));
    public final ewy l = new ewy(new fat(this, 0));
    public final ewy m = new ewy(new gat(this, 0));
    public final ewy n = new ewy(new qy8(this, 2));
    public final ewy o = new ewy(new j90(this, 2));
    public final ewy p = new ewy(new ehs(this, 1));
    public final ewy q = new ewy(new bb3(4));
    public final nwy r = new nwy(new vbp(this, 1));

    /* compiled from: GamesCatalogComponentImpl.kt */
    public static final class a implements c8m<GamesCatalogComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new GamesCatalogComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(GamesCatalogComponentImpl.class, "gamesCatalogPWAModalBottomSheetMapper", "getGamesCatalogPWAModalBottomSheetMapper()Lcom/vk/games/data/mapper/GamesCatalogPWAModalBottomSheetMapper;", 0);
        hpf0 hpf0Var = fpf0.a;
        s = new qcy[]{propertyReference1Impl, fp.c(0, GamesCatalogComponentImpl.class, "gamesCatalogAchievementsModalBottomSheetMapper", "getGamesCatalogAchievementsModalBottomSheetMapper()Lcom/vk/games/data/mapper/GamesCatalogAchievementsModalBottomSheetMapper;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "gamesCatalogPageMapper", "getGamesCatalogPageMapper()Lcom/vk/games/data/mapper/GamesCatalogPageMapper;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "gamesCatalogInMemoryCache", "getGamesCatalogInMemoryCache()Lcom/vk/games/data/repository/GamesCatalogInMemoryCache;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "commonMapper", "getCommonMapper()Lcom/vk/superapp/api/contract/mappers/CommonMapper;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "appMapper", "getAppMapper()Lcom/vk/superapp/api/contract/mappers/AppMapper;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "gamesCatalogSectionMapper", "getGamesCatalogSectionMapper()Lcom/vk/games/data/mapper/GamesCatalogSectionMapper;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "gamesCatalogAppMapper", "getGamesCatalogAppMapper()Lcom/vk/games/data/mapper/GamesCatalogAppMapper;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "gamesCatalogHeaderMapper", "getGamesCatalogHeaderMapper()Lcom/vk/games/data/mapper/GamesCatalogHeaderMapper;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "gamesCatalogBannersMapper", "getGamesCatalogBannersMapper()Lcom/vk/games/data/mapper/GamesCatalogBannersMapper;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "gamesCatalogCollectionsMapper", "getGamesCatalogCollectionsMapper()Lcom/vk/games/data/mapper/GamesCatalogCollectionsMapper;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "gamesCatalogHorizontalListMapper", "getGamesCatalogHorizontalListMapper()Lcom/vk/games/data/mapper/GamesCatalogHorizontalListMapper;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "gamesCatalogVerticalListMapper", "getGamesCatalogVerticalListMapper()Lcom/vk/games/data/mapper/GamesCatalogVerticalListMapper;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "gamesCatalogLootBoxListMapper", "getGamesCatalogLootBoxListMapper()Lcom/vk/games/data/mapper/GamesAchievementBlockMapper;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "gamesCatalogRandomGameMapper", "getGamesCatalogRandomGameMapper()Lcom/vk/games/data/mapper/GamesCatalogRandomGameMapper;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "repository", "getRepository()Lcom/vk/games/repository/GamesCatalogRepository;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "navigatorProvider", "getNavigatorProvider()Lcom/vk/games/nav/GamesCatalogNavigatorProvider;", hpf0Var), ep.a(0, GamesCatalogComponentImpl.class, "eventBus", "getEventBus()Lcom/vk/games/event/GamesCatalogEventBus;", hpf0Var)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final z9t Df() {
        qcy<Object> qcyVar = s[7];
        return (z9t) this.h.c();
    }

    @Override // com.vk.games.di.GamesCatalogComponent
    public final qct E() {
        qcy<Object> qcyVar = s[16];
        return (qct) this.q.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final act Ef() {
        qcy<Object> qcyVar = s[8];
        return (act) this.i.c();
    }

    @Override // com.vk.games.di.GamesCatalogComponent
    public final lbt V9() {
        qcy<Object> qcyVar = s[17];
        return (lbt) this.r.c();
    }

    @Override // com.vk.games.di.GamesCatalogComponent
    public final kdt c() {
        qcy<Object> qcyVar = s[15];
        return (kdt) this.p.c();
    }
}
