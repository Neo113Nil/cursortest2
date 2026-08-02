package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.FeaturedEventResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.io.Serializable;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j0j {
    public final fvi a;
    public final NetworkCoroutineAPI b;

    public j0j(fvi fviVar, NetworkCoroutineAPI networkCoroutineAPI) {
        networkCoroutineAPI.getClass();
        this.a = fviVar;
        this.b = networkCoroutineAPI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(int i, String str, sq3 sq3Var) {
        zzi zziVar;
        int i2;
        if (sq3Var instanceof zzi) {
            zziVar = (zzi) sq3Var;
            int i3 = zziVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zziVar.t = i3 - Integer.MIN_VALUE;
                Object obj = zziVar.r;
                lu3 lu3Var = lu3.a;
                i2 = zziVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    lzi lziVar = new lzi(this, i, str, null, 2);
                    zziVar.t = 1;
                    obj = yaa.P(lziVar, zziVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        zziVar = new zzi(this, sq3Var);
        Object obj2 = zziVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = zziVar.t;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(int i, String str, sq3 sq3Var) {
        a0j a0jVar;
        int i2;
        if (sq3Var instanceof a0j) {
            a0jVar = (a0j) sq3Var;
            int i3 = a0jVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a0jVar.t = i3 - Integer.MIN_VALUE;
                Object obj = a0jVar.r;
                lu3 lu3Var = lu3.a;
                i2 = a0jVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    lzi lziVar = new lzi(this, i, str, null, 3);
                    a0jVar.t = 1;
                    obj = yaa.P(lziVar, a0jVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        a0jVar = new a0j(this, sq3Var);
        Object obj2 = a0jVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = a0jVar.t;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(int i, sq3 sq3Var) {
        b0j b0jVar;
        int i2;
        if (sq3Var instanceof b0j) {
            b0jVar = (b0j) sq3Var;
            int i3 = b0jVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b0jVar.t = i3 - Integer.MIN_VALUE;
                Object obj = b0jVar.r;
                lu3 lu3Var = lu3.a;
                i2 = b0jVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    azi aziVar = new azi(this, i, rq3Var, 25);
                    b0jVar.t = 1;
                    obj = yaa.P(aziVar, b0jVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        b0jVar = new b0j(this, sq3Var);
        Object obj2 = b0jVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = b0jVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(int i, sq3 sq3Var) {
        c0j c0jVar;
        int i2;
        if (sq3Var instanceof c0j) {
            c0jVar = (c0j) sq3Var;
            int i3 = c0jVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0jVar.t = i3 - Integer.MIN_VALUE;
                Object obj = c0jVar.r;
                lu3 lu3Var = lu3.a;
                i2 = c0jVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    azi aziVar = new azi(this, i, rq3Var, 26);
                    c0jVar.t = 1;
                    obj = yaa.P(aziVar, c0jVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        c0jVar = new c0j(this, sq3Var);
        Object obj2 = c0jVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = c0jVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(int i, sq3 sq3Var) {
        d0j d0jVar;
        int i2;
        if (sq3Var instanceof d0j) {
            d0jVar = (d0j) sq3Var;
            int i3 = d0jVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d0jVar.t = i3 - Integer.MIN_VALUE;
                Object obj = d0jVar.r;
                lu3 lu3Var = lu3.a;
                i2 = d0jVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    azi aziVar = new azi(this, i, rq3Var, 27);
                    d0jVar.t = 1;
                    obj = yaa.P(aziVar, d0jVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        d0jVar = new d0j(this, sq3Var);
        Object obj2 = d0jVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = d0jVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(int i, int i2, int i3, sq3 sq3Var, String str) {
        e0j e0jVar;
        int i4;
        if (sq3Var instanceof e0j) {
            e0jVar = (e0j) sq3Var;
            int i5 = e0jVar.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                e0jVar.t = i5 - Integer.MIN_VALUE;
                Object obj = e0jVar.r;
                lu3 lu3Var = lu3.a;
                i4 = e0jVar.t;
                if (i4 != 0) {
                    y6a.M(obj);
                    gzi gziVar = new gzi(this, i, i2, i3, str, null, 4);
                    e0jVar.t = 1;
                    obj = yaa.P(gziVar, e0jVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        e0jVar = new e0j(this, sq3Var);
        Object obj2 = e0jVar.r;
        lu3 lu3Var2 = lu3.a;
        i4 = e0jVar.t;
        if (i4 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(int i, sq3 sq3Var) {
        f0j f0jVar;
        int i2;
        if (sq3Var instanceof f0j) {
            f0jVar = (f0j) sq3Var;
            int i3 = f0jVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f0jVar.t = i3 - Integer.MIN_VALUE;
                Object obj = f0jVar.r;
                lu3 lu3Var = lu3.a;
                i2 = f0jVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    azi aziVar = new azi(this, i, rq3Var, 28);
                    f0jVar.t = 1;
                    obj = yaa.P(aziVar, f0jVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        f0jVar = new f0j(this, sq3Var);
        Object obj2 = f0jVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = f0jVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(Context context, int i, sq3 sq3Var) {
        g0j g0jVar;
        int i2;
        if (sq3Var instanceof g0j) {
            g0jVar = (g0j) sq3Var;
            int i3 = g0jVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g0jVar.t = i3 - Integer.MIN_VALUE;
                Object obj = g0jVar.r;
                lu3 lu3Var = lu3.a;
                i2 = g0jVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    c64 c64Var = new c64(context, this, i, (rq3) null, 19);
                    g0jVar.t = 1;
                    obj = yaa.P(c64Var, g0jVar);
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
        g0jVar = new g0j(this, sq3Var);
        Object obj2 = g0jVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = g0jVar.t;
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
    public final Object I(int i, sq3 sq3Var) {
        h0j h0jVar;
        int i2;
        if (sq3Var instanceof h0j) {
            h0jVar = (h0j) sq3Var;
            int i3 = h0jVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h0jVar.t = i3 - Integer.MIN_VALUE;
                Object obj = h0jVar.r;
                lu3 lu3Var = lu3.a;
                i2 = h0jVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    h0jVar.t = 1;
                    obj = gz8.U(h0jVar, this.a.a, false, true, new bvb(i, 23));
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
        h0jVar = new h0j(this, sq3Var);
        Object obj2 = h0jVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = h0jVar.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(Team team, sq3 sq3Var) {
        i0j i0jVar;
        int i;
        if (sq3Var instanceof i0j) {
            i0jVar = (i0j) sq3Var;
            int i2 = i0jVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i0jVar.t = i2 - Integer.MIN_VALUE;
                Object obj = i0jVar.r;
                lu3 lu3Var = lu3.a;
                i = i0jVar.t;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    i0jVar.t = 1;
                    fvi fviVar = this.a;
                    obj = gz8.U(i0jVar, fviVar.a, false, true, new cvi(fviVar, team, i3));
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
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            }
        }
        i0jVar = new i0j(this, sq3Var);
        Object obj2 = i0jVar.r;
        lu3 lu3Var2 = lu3.a;
        i = i0jVar.t;
        int i32 = 1;
        if (i != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, sq3 sq3Var) {
        zyi zyiVar;
        int i2;
        if (sq3Var instanceof zyi) {
            zyiVar = (zyi) sq3Var;
            int i3 = zyiVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zyiVar.t = i3 - Integer.MIN_VALUE;
                Object obj = zyiVar.r;
                lu3 lu3Var = lu3.a;
                i2 = zyiVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    zyiVar.t = 1;
                    obj = gz8.U(zyiVar, this.a.a, false, true, new bvb(i, 26));
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
        zyiVar = new zyi(this, sq3Var);
        Object obj2 = zyiVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = zyiVar.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    public final nb8 b(int i) {
        return zm2.s(this.a.a, false, new String[]{"my_teams"}, new bvb(i, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(sq3 sq3Var) {
        czi cziVar;
        int i;
        if (sq3Var instanceof czi) {
            cziVar = (czi) sq3Var;
            int i2 = cziVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cziVar.t = i2 - Integer.MIN_VALUE;
                Object obj = cziVar.r;
                lu3 lu3Var = lu3.a;
                i = cziVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    cziVar.t = 1;
                    obj = gz8.U(cziVar, this.a.a, true, false, new rfi(19));
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
        cziVar = new czi(this, sq3Var);
        Object obj2 = cziVar.r;
        lu3 lu3Var2 = lu3.a;
        i = cziVar.t;
        if (i != 0) {
        }
        return CollectionsKt.Q0((Iterable) obj2);
    }

    public final nb8 d() {
        fvi fviVar = this.a;
        return zm2.s(fviVar.a, false, new String[]{"my_teams", "teams"}, new bvi(fviVar, 0));
    }

    public final z88 e(int i) {
        fvi fviVar = this.a;
        return hkg.H(zm2.s(fviVar.a, false, new String[]{"teams"}, new tj(i, fviVar, 12)));
    }

    public final Object f(hoi hoiVar) {
        fvi fviVar = this.a;
        return gz8.U(hoiVar, fviVar.a, true, false, new bvi(fviVar, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(sq3 sq3Var) {
        ezi eziVar;
        int i;
        if (sq3Var instanceof ezi) {
            eziVar = (ezi) sq3Var;
            int i2 = eziVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eziVar.t = i2 - Integer.MIN_VALUE;
                Object obj = eziVar.r;
                lu3 lu3Var = lu3.a;
                i = eziVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    eziVar.t = 1;
                    obj = gz8.U(eziVar, this.a.a, true, false, new rfi(20));
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
        eziVar = new ezi(this, sq3Var);
        Object obj2 = eziVar.r;
        lu3 lu3Var2 = lu3.a;
        i = eziVar.t;
        if (i != 0) {
        }
        return CollectionsKt.Q0((Iterable) obj2);
    }

    public final nb8 h() {
        fvi fviVar = this.a;
        return zm2.s(fviVar.a, false, new String[]{"my_teams", "teams"}, new bvi(fviVar, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(int i, int i2, int i3, sq3 sq3Var, String str) {
        fzi fziVar;
        int i4;
        if (sq3Var instanceof fzi) {
            fziVar = (fzi) sq3Var;
            int i5 = fziVar.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fziVar.t = i5 - Integer.MIN_VALUE;
                Object obj = fziVar.r;
                lu3 lu3Var = lu3.a;
                i4 = fziVar.t;
                if (i4 != 0) {
                    y6a.M(obj);
                    gzi gziVar = new gzi(this, i, i2, i3, str, null, 0);
                    fziVar.t = 1;
                    obj = yaa.P(gziVar, fziVar);
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
        fziVar = new fzi(this, sq3Var);
        Object obj2 = fziVar.r;
        lu3 lu3Var2 = lu3.a;
        i4 = fziVar.t;
        if (i4 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(int i, sq3 sq3Var) {
        izi iziVar;
        int i2;
        if (sq3Var instanceof izi) {
            iziVar = (izi) sq3Var;
            int i3 = iziVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iziVar.t = i3 - Integer.MIN_VALUE;
                Object obj = iziVar.r;
                lu3 lu3Var = lu3.a;
                i2 = iziVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    azi aziVar = new azi(this, i, rq3Var, 6);
                    iziVar.t = 1;
                    obj = yaa.P(aziVar, iziVar);
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
        iziVar = new izi(this, sq3Var);
        Object obj2 = iziVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = iziVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final Object k(int i, sq3 sq3Var) {
        return yaa.P(new azi(this, i, null, 8), sq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(int i, String str, sq3 sq3Var) {
        kzi kziVar;
        int i2;
        if (sq3Var instanceof kzi) {
            kziVar = (kzi) sq3Var;
            int i3 = kziVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kziVar.t = i3 - Integer.MIN_VALUE;
                Object obj = kziVar.r;
                lu3 lu3Var = lu3.a;
                i2 = kziVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    lzi lziVar = new lzi(this, i, str, null, 0);
                    kziVar.t = 1;
                    obj = yaa.P(lziVar, kziVar);
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
        kziVar = new kzi(this, sq3Var);
        Object obj2 = kziVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = kziVar.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m(int i, sq3 sq3Var) {
        mzi mziVar;
        int i2;
        FeaturedEventResponse featuredEventResponse;
        if (sq3Var instanceof mzi) {
            mziVar = (mzi) sq3Var;
            int i3 = mziVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mziVar.t = i3 - Integer.MIN_VALUE;
                Object obj = mziVar.r;
                lu3 lu3Var = lu3.a;
                i2 = mziVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    azi aziVar = new azi(this, i, rq3Var, 10);
                    mziVar.t = 1;
                    obj = yaa.P(aziVar, mziVar);
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
                featuredEventResponse = (FeaturedEventResponse) yaa.x((x2g) obj);
                if (featuredEventResponse == null) {
                    return featuredEventResponse.getFeaturedEvent();
                }
                return null;
            }
        }
        mziVar = new mzi(this, sq3Var);
        Object obj2 = mziVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = mziVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        featuredEventResponse = (FeaturedEventResponse) yaa.x((x2g) obj2);
        if (featuredEventResponse == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(int i, int i2, int i3, sq3 sq3Var, String str) {
        nzi nziVar;
        int i4;
        if (sq3Var instanceof nzi) {
            nziVar = (nzi) sq3Var;
            int i5 = nziVar.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                nziVar.t = i5 - Integer.MIN_VALUE;
                Object obj = nziVar.r;
                lu3 lu3Var = lu3.a;
                i4 = nziVar.t;
                if (i4 != 0) {
                    y6a.M(obj);
                    gzi gziVar = new gzi(this, i, i2, i3, str, null, 1);
                    nziVar.t = 1;
                    obj = yaa.P(gziVar, nziVar);
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
        nziVar = new nzi(this, sq3Var);
        Object obj2 = nziVar.r;
        lu3 lu3Var2 = lu3.a;
        i4 = nziVar.t;
        if (i4 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(int i, sq3 sq3Var) {
        ozi oziVar;
        int i2;
        if (sq3Var instanceof ozi) {
            oziVar = (ozi) sq3Var;
            int i3 = oziVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oziVar.t = i3 - Integer.MIN_VALUE;
                Object obj = oziVar.r;
                lu3 lu3Var = lu3.a;
                i2 = oziVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    azi aziVar = new azi(this, i, rq3Var, 12);
                    oziVar.t = 1;
                    obj = yaa.P(aziVar, oziVar);
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
        oziVar = new ozi(this, sq3Var);
        Object obj2 = oziVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = oziVar.t;
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
    public final Object p(int i, int i2, sq3 sq3Var) {
        pzi pziVar;
        int i3;
        if (sq3Var instanceof pzi) {
            pziVar = (pzi) sq3Var;
            int i4 = pziVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pziVar.t = i4 - Integer.MIN_VALUE;
                Object obj = pziVar.r;
                lu3 lu3Var = lu3.a;
                i3 = pziVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    hzi hziVar = new hzi(this, i, i2, null, 1);
                    pziVar.t = 1;
                    obj = yaa.P(hziVar, pziVar);
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
        pziVar = new pzi(this, sq3Var);
        Object obj2 = pziVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = pziVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final Object q(int i, int i2, int i3, String str, String str2, sq3 sq3Var) {
        return s9a.r(new eqe(str2, this, i, i3, i2, str, null), sq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(int i, int i2, int i3, sq3 sq3Var, String str) {
        qzi qziVar;
        int i4;
        if (sq3Var instanceof qzi) {
            qziVar = (qzi) sq3Var;
            int i5 = qziVar.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                qziVar.t = i5 - Integer.MIN_VALUE;
                Object obj = qziVar.r;
                lu3 lu3Var = lu3.a;
                i4 = qziVar.t;
                if (i4 != 0) {
                    y6a.M(obj);
                    gzi gziVar = new gzi(this, i, i2, i3, str, null, 2);
                    qziVar.t = 1;
                    obj = yaa.P(gziVar, qziVar);
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
        qziVar = new qzi(this, sq3Var);
        Object obj2 = qziVar.r;
        lu3 lu3Var2 = lu3.a;
        i4 = qziVar.t;
        if (i4 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(int i, sq3 sq3Var) {
        rzi rziVar;
        int i2;
        if (sq3Var instanceof rzi) {
            rziVar = (rzi) sq3Var;
            int i3 = rziVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rziVar.t = i3 - Integer.MIN_VALUE;
                Object obj = rziVar.r;
                lu3 lu3Var = lu3.a;
                i2 = rziVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    azi aziVar = new azi(this, i, rq3Var, 15);
                    rziVar.t = 1;
                    obj = yaa.P(aziVar, rziVar);
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
        rziVar = new rzi(this, sq3Var);
        Object obj2 = rziVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = rziVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(int i, sq3 sq3Var) {
        szi sziVar;
        int i2;
        if (sq3Var instanceof szi) {
            sziVar = (szi) sq3Var;
            int i3 = sziVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sziVar.t = i3 - Integer.MIN_VALUE;
                Object obj = sziVar.r;
                lu3 lu3Var = lu3.a;
                i2 = sziVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    azi aziVar = new azi(this, i, rq3Var, 16);
                    sziVar.t = 1;
                    obj = yaa.P(aziVar, sziVar);
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
        sziVar = new szi(this, sq3Var);
        Object obj2 = sziVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = sziVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(int i, sq3 sq3Var) {
        tzi tziVar;
        int i2;
        if (sq3Var instanceof tzi) {
            tziVar = (tzi) sq3Var;
            int i3 = tziVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tziVar.t = i3 - Integer.MIN_VALUE;
                Object obj = tziVar.r;
                lu3 lu3Var = lu3.a;
                i2 = tziVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    azi aziVar = new azi(this, i, rq3Var, 21);
                    tziVar.t = 1;
                    obj = yaa.P(aziVar, tziVar);
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
        tziVar = new tzi(this, sq3Var);
        Object obj2 = tziVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = tziVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(int i, String str, sq3 sq3Var) {
        uzi uziVar;
        int i2;
        x2g x2gVar;
        if (sq3Var instanceof uzi) {
            uziVar = (uzi) sq3Var;
            int i3 = uziVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uziVar.t = i3 - Integer.MIN_VALUE;
                Object obj = uziVar.r;
                lu3 lu3Var = lu3.a;
                i2 = uziVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    lzi lziVar = new lzi(this, i, str, null, 1);
                    uziVar.t = 1;
                    obj = yaa.P(lziVar, uziVar);
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
                x2gVar = (x2g) obj;
                if (!(x2gVar instanceof v2g)) {
                    return ((v2g) x2gVar).a;
                }
                lm5 lm5Var = lm5.a;
                lm5Var.getClass();
                return lm5Var;
            }
        }
        uziVar = new uzi(this, sq3Var);
        Object obj2 = uziVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = uziVar.t;
        if (i2 != 0) {
        }
        x2gVar = (x2g) obj2;
        if (!(x2gVar instanceof v2g)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(int i, sq3 sq3Var) {
        vzi vziVar;
        int i2;
        if (sq3Var instanceof vzi) {
            vziVar = (vzi) sq3Var;
            int i3 = vziVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vziVar.t = i3 - Integer.MIN_VALUE;
                Object obj = vziVar.r;
                lu3 lu3Var = lu3.a;
                i2 = vziVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    azi aziVar = new azi(this, i, rq3Var, 22);
                    vziVar.t = 1;
                    obj = yaa.P(aziVar, vziVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        vziVar = new vzi(this, sq3Var);
        Object obj2 = vziVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = vziVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(int i, sq3 sq3Var) {
        wzi wziVar;
        int i2;
        if (sq3Var instanceof wzi) {
            wziVar = (wzi) sq3Var;
            int i3 = wziVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wziVar.t = i3 - Integer.MIN_VALUE;
                Object obj = wziVar.r;
                lu3 lu3Var = lu3.a;
                i2 = wziVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    azi aziVar = new azi(this, i, rq3Var, 23);
                    wziVar.t = 1;
                    obj = yaa.P(aziVar, wziVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        wziVar = new wzi(this, sq3Var);
        Object obj2 = wziVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = wziVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(int i, sq3 sq3Var) {
        xzi xziVar;
        int i2;
        if (sq3Var instanceof xzi) {
            xziVar = (xzi) sq3Var;
            int i3 = xziVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xziVar.t = i3 - Integer.MIN_VALUE;
                Object obj = xziVar.r;
                lu3 lu3Var = lu3.a;
                i2 = xziVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    xziVar.t = 1;
                    obj = gz8.U(xziVar, this.a.a, true, false, new bvb(i, 21));
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
        xziVar = new xzi(this, sq3Var);
        Object obj2 = xziVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = xziVar.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(int i, sq3 sq3Var) {
        yzi yziVar;
        int i2;
        if (sq3Var instanceof yzi) {
            yziVar = (yzi) sq3Var;
            int i3 = yziVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yziVar.t = i3 - Integer.MIN_VALUE;
                Object obj = yziVar.r;
                lu3 lu3Var = lu3.a;
                i2 = yziVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    azi aziVar = new azi(this, i, rq3Var, 24);
                    yziVar.t = 1;
                    obj = yaa.P(aziVar, yziVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        yziVar = new yzi(this, sq3Var);
        Object obj2 = yziVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = yziVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }
}
