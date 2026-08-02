package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.DbMyPlayer;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.statistics.BaseballSeasonPitchesPerspective;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wve {
    public final aoe a;
    public final NetworkCoroutineAPI b;

    public wve(aoe aoeVar, NetworkCoroutineAPI networkCoroutineAPI) {
        networkCoroutineAPI.getClass();
        this.a = aoeVar;
        this.b = networkCoroutineAPI;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, sq3 sq3Var) {
        eve eveVar;
        int i2;
        if (sq3Var instanceof eve) {
            eveVar = (eve) sq3Var;
            int i3 = eveVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eveVar.t = i3 - Integer.MIN_VALUE;
                Object obj = eveVar.r;
                lu3 lu3Var = lu3.a;
                i2 = eveVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    eveVar.t = 1;
                    obj = gz8.U(eveVar, this.a.a, false, true, new bvb(i, 14));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            }
        }
        eveVar = new eve(this, sq3Var);
        Object obj2 = eveVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = eveVar.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, int i2, int i3, BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective, Season.SubSeasonType subSeasonType, sq3 sq3Var) {
        fve fveVar;
        int i4;
        if (sq3Var instanceof fve) {
            fveVar = (fve) sq3Var;
            int i5 = fveVar.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fveVar.t = i5 - Integer.MIN_VALUE;
                Object obj = fveVar.r;
                lu3 lu3Var = lu3.a;
                i4 = fveVar.t;
                if (i4 != 0) {
                    y6a.M(obj);
                    gve gveVar = new gve(this, i, i2, i3, baseballSeasonPitchesPerspective, subSeasonType, null);
                    fveVar.t = 1;
                    obj = yaa.P(gveVar, fveVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        fveVar = new fve(this, sq3Var);
        Object obj2 = fveVar.r;
        lu3 lu3Var2 = lu3.a;
        i4 = fveVar.t;
        if (i4 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, sq3 sq3Var) {
        hve hveVar;
        int i2;
        if (sq3Var instanceof hve) {
            hveVar = (hve) sq3Var;
            int i3 = hveVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hveVar.t = i3 - Integer.MIN_VALUE;
                Object obj = hveVar.r;
                lu3 lu3Var = lu3.a;
                i2 = hveVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    ive iveVar = new ive(this, i, rq3Var, 0);
                    hveVar.t = 1;
                    obj = yaa.P(iveVar, hveVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        hveVar = new hve(this, sq3Var);
        Object obj2 = hveVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = hveVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(sq3 sq3Var) {
        jve jveVar;
        int i;
        if (sq3Var instanceof jve) {
            jveVar = (jve) sq3Var;
            int i2 = jveVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jveVar.t = i2 - Integer.MIN_VALUE;
                Object obj = jveVar.r;
                lu3 lu3Var = lu3.a;
                i = jveVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    jveVar.t = 1;
                    obj = gz8.U(jveVar, this.a.a, true, false, new jie(4));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return CollectionsKt.Q0((Iterable) obj);
            }
        }
        jveVar = new jve(this, sq3Var);
        Object obj2 = jveVar.r;
        lu3 lu3Var2 = lu3.a;
        i = jveVar.t;
        if (i != 0) {
        }
        return CollectionsKt.Q0((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[LOOP:0: B:14:0x005f->B:16:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(sq3 sq3Var) {
        kve kveVar;
        int i;
        int c;
        if (sq3Var instanceof kve) {
            kveVar = (kve) sq3Var;
            int i2 = kveVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kveVar.t = i2 - Integer.MIN_VALUE;
                Object obj = kveVar.r;
                lu3 lu3Var = lu3.a;
                i = kveVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    kveVar.t = 1;
                    obj = gz8.U(kveVar, this.a.a, true, false, new jie(4));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterable<DbMyPlayer> iterable = (Iterable) obj;
                c = sub.c(k13.r(iterable, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (DbMyPlayer dbMyPlayer : iterable) {
                    linkedHashMap.put(new Integer(dbMyPlayer.getPlayerId()), Boolean.valueOf(dbMyPlayer.getNotificationsEnabled()));
                }
                return new LinkedHashMap(linkedHashMap);
            }
        }
        kveVar = new kve(this, sq3Var);
        Object obj2 = kveVar.r;
        lu3 lu3Var2 = lu3.a;
        i = kveVar.t;
        if (i != 0) {
        }
        Iterable<DbMyPlayer> iterable2 = (Iterable) obj2;
        c = sub.c(k13.r(iterable2, 10));
        if (c < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c);
        while (r4.hasNext()) {
        }
        return new LinkedHashMap(linkedHashMap2);
    }

    public final a76 f() {
        int i = 5;
        return new a76(zm2.s(this.a.a, false, new String[]{"players", "my_teams", "teams"}, new jie(i)), i);
    }

    public final nb8 g() {
        aoe aoeVar = this.a;
        return zm2.s(aoeVar.a, false, new String[]{"players"}, new mme(aoeVar, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i, String str, sq3 sq3Var) {
        mve mveVar;
        int i2;
        if (sq3Var instanceof mve) {
            mveVar = (mve) sq3Var;
            int i3 = mveVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mveVar.t = i3 - Integer.MIN_VALUE;
                Object obj = mveVar.r;
                lu3 lu3Var = lu3.a;
                i2 = mveVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    c64 c64Var = new c64(this, i, str, (rq3) null, 15);
                    mveVar.t = 1;
                    obj = yaa.P(c64Var, mveVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        mveVar = new mve(this, sq3Var);
        Object obj2 = mveVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = mveVar.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final Object i(int i, sq3 sq3Var) {
        return yaa.P(new ive(this, i, null, 3), sq3Var);
    }

    public final Object j(int i, int i2, sq3 sq3Var) {
        return yaa.P(new ni5(this, i, i2, null, 3), sq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(int i, int i2, sq3 sq3Var, String str) {
        nve nveVar;
        int i3;
        if (sq3Var instanceof nve) {
            nveVar = (nve) sq3Var;
            int i4 = nveVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nveVar.t = i4 - Integer.MIN_VALUE;
                Object obj = nveVar.r;
                lu3 lu3Var = lu3.a;
                i3 = nveVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    ove oveVar = new ove(this, i, i2, str, null, 0);
                    nveVar.t = 1;
                    obj = yaa.P(oveVar, nveVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        nveVar = new nve(this, sq3Var);
        Object obj2 = nveVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = nveVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(int i, sq3 sq3Var) {
        pve pveVar;
        int i2;
        if (sq3Var instanceof pve) {
            pveVar = (pve) sq3Var;
            int i3 = pveVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pveVar.t = i3 - Integer.MIN_VALUE;
                Object obj = pveVar.r;
                lu3 lu3Var = lu3.a;
                i2 = pveVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    ive iveVar = new ive(this, i, rq3Var, 5);
                    pveVar.t = 1;
                    obj = yaa.P(iveVar, pveVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        pveVar = new pve(this, sq3Var);
        Object obj2 = pveVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = pveVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(int i, int i2, sq3 sq3Var, String str) {
        rve rveVar;
        int i3;
        if (sq3Var instanceof rve) {
            rveVar = (rve) sq3Var;
            int i4 = rveVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rveVar.t = i4 - Integer.MIN_VALUE;
                Object obj = rveVar.r;
                lu3 lu3Var = lu3.a;
                i3 = rveVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    ove oveVar = new ove(this, i, i2, str, null, 1);
                    rveVar.t = 1;
                    obj = yaa.P(oveVar, rveVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        rveVar = new rve(this, sq3Var);
        Object obj2 = rveVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = rveVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(int i, sq3 sq3Var) {
        tve tveVar;
        int i2;
        if (sq3Var instanceof tve) {
            tveVar = (tve) sq3Var;
            int i3 = tveVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tveVar.t = i3 - Integer.MIN_VALUE;
                Object obj = tveVar.r;
                lu3 lu3Var = lu3.a;
                i2 = tveVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    ive iveVar = new ive(this, i, rq3Var, 7);
                    tveVar.t = 1;
                    obj = yaa.P(iveVar, tveVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        tveVar = new tve(this, sq3Var);
        Object obj2 = tveVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = tveVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(int i, sq3 sq3Var) {
        uve uveVar;
        int i2;
        if (sq3Var instanceof uve) {
            uveVar = (uve) sq3Var;
            int i3 = uveVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uveVar.t = i3 - Integer.MIN_VALUE;
                Object obj = uveVar.r;
                lu3 lu3Var = lu3.a;
                i2 = uveVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    uveVar.t = 1;
                    obj = gz8.U(uveVar, this.a.a, true, false, new bvb(i, 12));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            }
        }
        uveVar = new uve(this, sq3Var);
        Object obj2 = uveVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = uveVar.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Context context, int i, sq3 sq3Var) {
        vve vveVar;
        int i2;
        if (sq3Var instanceof vve) {
            vveVar = (vve) sq3Var;
            int i3 = vveVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vveVar.t = i3 - Integer.MIN_VALUE;
                Object obj = vveVar.r;
                lu3 lu3Var = lu3.a;
                i2 = vveVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    c64 c64Var = new c64(context, this, i, (rq3) null, 16);
                    vveVar.t = 1;
                    obj = yaa.P(c64Var, vveVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        vveVar = new vve(this, sq3Var);
        Object obj2 = vveVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = vveVar.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final Object q(int i, sq3 sq3Var) {
        aoe aoeVar = this.a;
        return gz8.T(sq3Var, aoeVar.a, new xr2(aoeVar, i, null, 2));
    }
}
