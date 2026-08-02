package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.DbMyUniqueTournament;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.UniqueTournamentPlayerTransactionsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w3b {
    public final irj a;
    public final NetworkCoroutineAPI b;
    public final NetworkCoroutineAPI c;

    public w3b(irj irjVar, NetworkCoroutineAPI networkCoroutineAPI, NetworkCoroutineAPI networkCoroutineAPI2) {
        networkCoroutineAPI.getClass();
        networkCoroutineAPI2.getClass();
        this.a = irjVar;
        this.b = networkCoroutineAPI;
        this.c = networkCoroutineAPI2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(int i, int i2, sq3 sq3Var) {
        d1b d1bVar;
        int i3;
        if (sq3Var instanceof d1b) {
            d1bVar = (d1b) sq3Var;
            int i4 = d1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                d1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = d1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = d1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 6);
                    d1bVar.t = 1;
                    obj = yaa.P(zzaVar, d1bVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        d1bVar = new d1b(this, sq3Var);
        Object obj2 = d1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = d1bVar.t;
        if (i3 != 0) {
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
    public final Object A0(int i, int i2, Round round, sq3 sq3Var) {
        f3b f3bVar;
        int i3;
        if (sq3Var instanceof f3b) {
            f3bVar = (f3b) sq3Var;
            int i4 = f3bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                f3bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = f3bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = f3bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    lh7 lh7Var = new lh7(round, this, i, i2, (rq3) null, 2);
                    f3bVar.t = 1;
                    obj = yaa.P(lh7Var, f3bVar);
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
        f3bVar = new f3b(this, sq3Var);
        Object obj2 = f3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = f3bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(int i, sq3 sq3Var) {
        e1b e1bVar;
        int i2;
        if (sq3Var instanceof e1b) {
            e1bVar = (e1b) sq3Var;
            int i3 = e1bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e1bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = e1bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = e1bVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    e1bVar.t = 1;
                    obj = gz8.U(e1bVar, this.a.a, true, false, new kwi(i, 7));
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
        e1bVar = new e1b(this, sq3Var);
        Object obj2 = e1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = e1bVar.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B0(int i, int i2, int i3, String str, String str2, String str3, int i4, sq3 sq3Var) {
        g3b g3bVar;
        int i5;
        if (sq3Var instanceof g3b) {
            g3bVar = (g3b) sq3Var;
            int i6 = g3bVar.t;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                g3bVar.t = i6 - Integer.MIN_VALUE;
                Object obj = g3bVar.r;
                lu3 lu3Var = lu3.a;
                i5 = g3bVar.t;
                if (i5 != 0) {
                    y6a.M(obj);
                    h3b h3bVar = new h3b(str, str2, this, i, i2, i3, str3, i4, null);
                    g3bVar.t = 1;
                    obj = yaa.P(h3bVar, g3bVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        g3bVar = new g3b(this, sq3Var);
        Object obj2 = g3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i5 = g3bVar.t;
        if (i5 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(int i, int i2, sq3 sq3Var, String str) {
        f1b f1bVar;
        int i3;
        if (sq3Var instanceof f1b) {
            f1bVar = (f1b) sq3Var;
            int i4 = f1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                f1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = f1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = f1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    b0b b0bVar = new b0b(this, i, i2, str, (rq3) null, 5);
                    f1bVar.t = 1;
                    obj = yaa.P(b0bVar, f1bVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        f1bVar = new f1b(this, sq3Var);
        Object obj2 = f1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = f1bVar.t;
        if (i3 != 0) {
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
    public final Object C0(int i, int i2, sq3 sq3Var) {
        i3b i3bVar;
        int i3;
        if (sq3Var instanceof i3b) {
            i3bVar = (i3b) sq3Var;
            int i4 = i3bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                i3bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = i3bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = i3bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 27);
                    i3bVar.t = 1;
                    obj = yaa.P(zzaVar, i3bVar);
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
        i3bVar = new i3b(this, sq3Var);
        Object obj2 = i3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = i3bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(int i, int i2, sq3 sq3Var, String str) {
        g1b g1bVar;
        int i3;
        if (sq3Var instanceof g1b) {
            g1bVar = (g1b) sq3Var;
            int i4 = g1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                g1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = g1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = g1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    b0b b0bVar = new b0b(this, i, i2, str, (rq3) null, 6);
                    g1bVar.t = 1;
                    obj = yaa.P(b0bVar, g1bVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        g1bVar = new g1b(this, sq3Var);
        Object obj2 = g1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = g1bVar.t;
        if (i3 != 0) {
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
    public final Object D0(int i, String str, sq3 sq3Var) {
        j3b j3bVar;
        int i2;
        if (sq3Var instanceof j3b) {
            j3bVar = (j3b) sq3Var;
            int i3 = j3bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j3bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = j3bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = j3bVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    f0b f0bVar = new f0b(this, i, str, null, 3);
                    j3bVar.t = 1;
                    obj = yaa.P(f0bVar, j3bVar);
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
        j3bVar = new j3b(this, sq3Var);
        Object obj2 = j3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = j3bVar.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(int i, int i2, sq3 sq3Var, String str) {
        h1b h1bVar;
        int i3;
        if (sq3Var instanceof h1b) {
            h1bVar = (h1b) sq3Var;
            int i4 = h1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                h1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = h1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = h1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    b0b b0bVar = new b0b(this, i, i2, str, (rq3) null, 7);
                    h1bVar.t = 1;
                    obj = yaa.P(b0bVar, h1bVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        h1bVar = new h1b(this, sq3Var);
        Object obj2 = h1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = h1bVar.t;
        if (i3 != 0) {
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
    public final Object E0(int i, int i2, sq3 sq3Var) {
        k3b k3bVar;
        int i3;
        if (sq3Var instanceof k3b) {
            k3bVar = (k3b) sq3Var;
            int i4 = k3bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                k3bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = k3bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = k3bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 28);
                    k3bVar.t = 1;
                    obj = yaa.P(zzaVar, k3bVar);
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
        k3bVar = new k3b(this, sq3Var);
        Object obj2 = k3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = k3bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(int i, sq3 sq3Var) {
        i1b i1bVar;
        int i2;
        if (sq3Var instanceof i1b) {
            i1bVar = (i1b) sq3Var;
            int i3 = i1bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i1bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = i1bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = i1bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 5, rq3Var, this);
                    i1bVar.t = 1;
                    obj = yaa.P(d0bVar, i1bVar);
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
        i1bVar = new i1b(this, sq3Var);
        Object obj2 = i1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = i1bVar.t;
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
    public final Object F0(int i, sq3 sq3Var) {
        l3b l3bVar;
        int i2;
        if (sq3Var instanceof l3b) {
            l3bVar = (l3b) sq3Var;
            int i3 = l3bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l3bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = l3bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = l3bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 18, rq3Var, this);
                    l3bVar.t = 1;
                    obj = yaa.P(d0bVar, l3bVar);
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
        l3bVar = new l3b(this, sq3Var);
        Object obj2 = l3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = l3bVar.t;
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
    public final Object G(int i, sq3 sq3Var) {
        j1b j1bVar;
        int i2;
        if (sq3Var instanceof j1b) {
            j1bVar = (j1b) sq3Var;
            int i3 = j1bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j1bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = j1bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = j1bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 6, rq3Var, this);
                    j1bVar.t = 1;
                    obj = yaa.P(d0bVar, j1bVar);
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
        j1bVar = new j1b(this, sq3Var);
        Object obj2 = j1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = j1bVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G0(String str, String str2, sq3 sq3Var) {
        m3b m3bVar;
        int i;
        if (sq3Var instanceof m3b) {
            m3bVar = (m3b) sq3Var;
            int i2 = m3bVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m3bVar.t = i2 - Integer.MIN_VALUE;
                Object obj = m3bVar.r;
                lu3 lu3Var = lu3.a;
                i = m3bVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    yw ywVar = new yw(str2, this, str, null, 7);
                    m3bVar.t = 1;
                    obj = yaa.P(ywVar, m3bVar);
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
                List list = (List) yaa.x((x2g) obj);
                return list != null ? km5.a : list;
            }
        }
        m3bVar = new m3b(this, sq3Var);
        Object obj2 = m3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i = m3bVar.t;
        if (i != 0) {
        }
        List list2 = (List) yaa.x((x2g) obj2);
        if (list2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(int i, int i2, sq3 sq3Var) {
        k1b k1bVar;
        int i3;
        if (sq3Var instanceof k1b) {
            k1bVar = (k1b) sq3Var;
            int i4 = k1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                k1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = k1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = k1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 7);
                    k1bVar.t = 1;
                    obj = yaa.P(zzaVar, k1bVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        k1bVar = new k1b(this, sq3Var);
        Object obj2 = k1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = k1bVar.t;
        if (i3 != 0) {
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
    public final Object H0(int i, int i2, int i3, String str, int i4, sq3 sq3Var) {
        n3b n3bVar;
        int i5;
        if (sq3Var instanceof n3b) {
            n3bVar = (n3b) sq3Var;
            int i6 = n3bVar.t;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                n3bVar.t = i6 - Integer.MIN_VALUE;
                Object obj = n3bVar.r;
                lu3 lu3Var = lu3.a;
                i5 = n3bVar.t;
                if (i5 != 0) {
                    y6a.M(obj);
                    o3b o3bVar = new o3b(this, i, i2, i3, str, i4, null, 0);
                    n3bVar.t = 1;
                    obj = yaa.P(o3bVar, n3bVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        n3bVar = new n3b(this, sq3Var);
        Object obj2 = n3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i5 = n3bVar.t;
        if (i5 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(int i, int i2, sq3 sq3Var, String str) {
        l1b l1bVar;
        int i3;
        if (sq3Var instanceof l1b) {
            l1bVar = (l1b) sq3Var;
            int i4 = l1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                l1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = l1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = l1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    b0b b0bVar = new b0b(this, i, i2, str, (rq3) null, 8);
                    l1bVar.t = 1;
                    obj = yaa.P(b0bVar, l1bVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        l1bVar = new l1b(this, sq3Var);
        Object obj2 = l1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = l1bVar.t;
        if (i3 != 0) {
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
    public final Object I0(int i, int i2, sq3 sq3Var) {
        p3b p3bVar;
        int i3;
        if (sq3Var instanceof p3b) {
            p3bVar = (p3b) sq3Var;
            int i4 = p3bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                p3bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = p3bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = p3bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 29);
                    p3bVar.t = 1;
                    obj = yaa.P(zzaVar, p3bVar);
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
        p3bVar = new p3b(this, sq3Var);
        Object obj2 = p3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = p3bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(int i, int i2, sq3 sq3Var) {
        m1b m1bVar;
        int i3;
        if (sq3Var instanceof m1b) {
            m1bVar = (m1b) sq3Var;
            int i4 = m1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                m1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = m1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = m1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 8);
                    m1bVar.t = 1;
                    obj = yaa.P(zzaVar, m1bVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        m1bVar = new m1b(this, sq3Var);
        Object obj2 = m1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = m1bVar.t;
        if (i3 != 0) {
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
    public final Object J0(int i, int i2, sq3 sq3Var) {
        q3b q3bVar;
        int i3;
        if (sq3Var instanceof q3b) {
            q3bVar = (q3b) sq3Var;
            int i4 = q3bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                q3bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = q3bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = q3bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    r3b r3bVar = new r3b(this, i, i2, null, 0);
                    q3bVar.t = 1;
                    obj = yaa.P(r3bVar, q3bVar);
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
        q3bVar = new q3b(this, sq3Var);
        Object obj2 = q3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = q3bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object K(int i, int i2, sq3 sq3Var, String str) {
        n1b n1bVar;
        int i3;
        if (sq3Var instanceof n1b) {
            n1bVar = (n1b) sq3Var;
            int i4 = n1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                n1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = n1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = n1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    b0b b0bVar = new b0b(this, i, i2, str, (rq3) null, 9);
                    n1bVar.t = 1;
                    obj = yaa.P(b0bVar, n1bVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        n1bVar = new n1b(this, sq3Var);
        Object obj2 = n1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = n1bVar.t;
        if (i3 != 0) {
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
    public final Object K0(int i, int i2, int i3, String str, int i4, sq3 sq3Var) {
        s3b s3bVar;
        int i5;
        if (sq3Var instanceof s3b) {
            s3bVar = (s3b) sq3Var;
            int i6 = s3bVar.t;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                s3bVar.t = i6 - Integer.MIN_VALUE;
                Object obj = s3bVar.r;
                lu3 lu3Var = lu3.a;
                i5 = s3bVar.t;
                if (i5 != 0) {
                    y6a.M(obj);
                    o3b o3bVar = new o3b(this, i, i2, i3, str, i4, null, 1);
                    s3bVar.t = 1;
                    obj = yaa.P(o3bVar, s3bVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        s3bVar = new s3b(this, sq3Var);
        Object obj2 = s3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i5 = s3bVar.t;
        if (i5 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(int i, int i2, sq3 sq3Var) {
        o1b o1bVar;
        int i3;
        if (sq3Var instanceof o1b) {
            o1bVar = (o1b) sq3Var;
            int i4 = o1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                o1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = o1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = o1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 9);
                    o1bVar.t = 1;
                    obj = yaa.P(zzaVar, o1bVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        o1bVar = new o1b(this, sq3Var);
        Object obj2 = o1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = o1bVar.t;
        if (i3 != 0) {
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
    public final Object L0(int i, int i2, sq3 sq3Var) {
        t3b t3bVar;
        int i3;
        if (sq3Var instanceof t3b) {
            t3bVar = (t3b) sq3Var;
            int i4 = t3bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                t3bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = t3bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = t3bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    r3b r3bVar = new r3b(this, i, i2, null, 1);
                    t3bVar.t = 1;
                    obj = yaa.P(r3bVar, t3bVar);
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
        t3bVar = new t3b(this, sq3Var);
        Object obj2 = t3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = t3bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(int i, int i2, sq3 sq3Var) {
        p1b p1bVar;
        int i3;
        if (sq3Var instanceof p1b) {
            p1bVar = (p1b) sq3Var;
            int i4 = p1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                p1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = p1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = p1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 10);
                    p1bVar.t = 1;
                    obj = yaa.P(zzaVar, p1bVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        p1bVar = new p1b(this, sq3Var);
        Object obj2 = p1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = p1bVar.t;
        if (i3 != 0) {
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
    public final Object M0(int i, sq3 sq3Var) {
        u3b u3bVar;
        int i2;
        if (sq3Var instanceof u3b) {
            u3bVar = (u3b) sq3Var;
            int i3 = u3bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u3bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = u3bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = u3bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 19, rq3Var, this);
                    u3bVar.t = 1;
                    obj = yaa.P(d0bVar, u3bVar);
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
        u3bVar = new u3b(this, sq3Var);
        Object obj2 = u3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = u3bVar.t;
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
    public final Object N(int i, int i2, sq3 sq3Var, String str) {
        q1b q1bVar;
        int i3;
        if (sq3Var instanceof q1b) {
            q1bVar = (q1b) sq3Var;
            int i4 = q1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                q1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = q1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = q1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    b0b b0bVar = new b0b(this, i, i2, str, (rq3) null, 10);
                    q1bVar.t = 1;
                    obj = yaa.P(b0bVar, q1bVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        q1bVar = new q1b(this, sq3Var);
        Object obj2 = q1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = q1bVar.t;
        if (i3 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N0(UniqueTournament uniqueTournament, sq3 sq3Var) {
        v3b v3bVar;
        int i;
        if (sq3Var instanceof v3b) {
            v3bVar = (v3b) sq3Var;
            int i2 = v3bVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v3bVar.t = i2 - Integer.MIN_VALUE;
                Object obj = v3bVar.r;
                lu3 lu3Var = lu3.a;
                i = v3bVar.t;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    v3bVar.t = 1;
                    irj irjVar = this.a;
                    obj = gz8.U(v3bVar, irjVar.a, false, true, new drj(irjVar, uniqueTournament, i3));
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
        v3bVar = new v3b(this, sq3Var);
        Object obj2 = v3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i = v3bVar.t;
        int i32 = 1;
        if (i != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(int i, String str, sq3 sq3Var) {
        r1b r1bVar;
        int i2;
        if (sq3Var instanceof r1b) {
            r1bVar = (r1b) sq3Var;
            int i3 = r1bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r1bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = r1bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = r1bVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    f0b f0bVar = new f0b(this, i, str, null, 2);
                    r1bVar.t = 1;
                    obj = yaa.P(f0bVar, r1bVar);
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
        r1bVar = new r1b(this, sq3Var);
        Object obj2 = r1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = r1bVar.t;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    public final Object O0(ArrayList arrayList, sq3 sq3Var) {
        irj irjVar = this.a;
        Object T = gz8.T(sq3Var, irjVar.a, new fzh(irjVar, arrayList, null, 7));
        lu3 lu3Var = lu3.a;
        if (T != lu3Var) {
            T = Unit.a;
        }
        return T == lu3Var ? T : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P(int i, int i2, sq3 sq3Var) {
        s1b s1bVar;
        int i3;
        if (sq3Var instanceof s1b) {
            s1bVar = (s1b) sq3Var;
            int i4 = s1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = s1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = s1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 11);
                    s1bVar.t = 1;
                    obj = yaa.P(zzaVar, s1bVar);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        s1bVar = new s1b(this, sq3Var);
        Object obj2 = s1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = s1bVar.t;
        if (i3 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(ArrayList arrayList, sq3 sq3Var) {
        w1b w1bVar;
        int i;
        int length;
        int i2;
        if (sq3Var instanceof w1b) {
            w1bVar = (w1b) sq3Var;
            int i3 = w1bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w1bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = w1bVar.r;
                lu3 lu3Var = lu3.a;
                i = w1bVar.t;
                boolean z = true;
                if (i != 0) {
                    y6a.M(obj);
                    w1bVar.t = 1;
                    obj = irj.d(this.a, arrayList, w1bVar);
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
                long[] jArr = (long[]) obj;
                length = jArr.length;
                i2 = 0;
                while (true) {
                    if (i2 < length) {
                        z = false;
                        break;
                    }
                    if (jArr[i2] != -1) {
                        break;
                    }
                    i2++;
                }
                return Boolean.valueOf(z);
            }
        }
        w1bVar = new w1b(this, sq3Var);
        Object obj2 = w1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i = w1bVar.t;
        boolean z2 = true;
        if (i != 0) {
        }
        long[] jArr2 = (long[]) obj2;
        length = jArr2.length;
        i2 = 0;
        while (true) {
            if (i2 < length) {
            }
            i2++;
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(UniqueTournament uniqueTournament, String str, int i, sq3 sq3Var) {
        x1b x1bVar;
        lu3 lu3Var;
        int i2;
        int i3;
        Object U;
        if (sq3Var instanceof x1b) {
            x1bVar = (x1b) sq3Var;
            int i4 = x1bVar.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x1bVar.v = i4 - Integer.MIN_VALUE;
                Object obj = x1bVar.t;
                lu3Var = lu3.a;
                i2 = x1bVar.v;
                irj irjVar = this.a;
                int i5 = -1;
                if (i2 != 0) {
                    y6a.M(obj);
                    if (i <= -1) {
                        if (str == null || str.length() == 0) {
                            x1bVar.r = uniqueTournament;
                            x1bVar.s = i;
                            x1bVar.v = 1;
                            obj = gz8.U(x1bVar, irjVar.a, true, false, new aqj(29));
                        } else {
                            x1bVar.r = uniqueTournament;
                            x1bVar.s = i;
                            x1bVar.v = 2;
                            obj = gz8.U(x1bVar, irjVar.a, true, false, new cfi(str, 5));
                        }
                        return lu3Var;
                    }
                    i3 = i;
                    PinnedTournament pinnedTournament = new PinnedTournament(uniqueTournament, i);
                    x1bVar.r = null;
                    x1bVar.s = i3;
                    x1bVar.v = 3;
                    U = gz8.U(x1bVar, irjVar.a, false, true, new dvi(24, irjVar, pinnedTournament));
                    if (U != lu3Var) {
                        U = Unit.a;
                    }
                } else if (i2 == 1) {
                    i = x1bVar.s;
                    uniqueTournament = x1bVar.r;
                    y6a.M(obj);
                    Integer num = (Integer) obj;
                    if (num != null) {
                        i5 = num.intValue();
                    }
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = x1bVar.s;
                    uniqueTournament = x1bVar.r;
                    y6a.M(obj);
                    Integer num2 = (Integer) obj;
                    if (num2 != null) {
                        i5 = num2.intValue();
                    }
                }
                int i6 = i;
                i = i5 + 1;
                i3 = i6;
                PinnedTournament pinnedTournament2 = new PinnedTournament(uniqueTournament, i);
                x1bVar.r = null;
                x1bVar.s = i3;
                x1bVar.v = 3;
                U = gz8.U(x1bVar, irjVar.a, false, true, new dvi(24, irjVar, pinnedTournament2));
                if (U != lu3Var) {
                }
            }
        }
        x1bVar = new x1b(this, sq3Var);
        Object obj2 = x1bVar.t;
        lu3Var = lu3.a;
        i2 = x1bVar.v;
        irj irjVar2 = this.a;
        int i52 = -1;
        if (i2 != 0) {
        }
        int i62 = i;
        i = i52 + 1;
        i3 = i62;
        PinnedTournament pinnedTournament22 = new PinnedTournament(uniqueTournament, i);
        x1bVar.r = null;
        x1bVar.s = i3;
        x1bVar.v = 3;
        U = gz8.U(x1bVar, irjVar2.a, false, true, new dvi(24, irjVar2, pinnedTournament22));
        if (U != lu3Var) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r13 != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f A[LOOP:0: B:21:0x0079->B:23:0x007f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(List list, sq3 sq3Var) {
        y1b y1bVar;
        int i;
        List<UniqueTournament> list2;
        dsf dsfVar;
        dsf dsfVar2;
        if (sq3Var instanceof y1b) {
            y1bVar = (y1b) sq3Var;
            int i2 = y1bVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y1bVar.w = i2 - Integer.MIN_VALUE;
                Object obj = y1bVar.u;
                lu3 lu3Var = lu3.a;
                i = y1bVar.w;
                irj irjVar = this.a;
                if (i != 0) {
                    y6a.M(obj);
                    dsf dsfVar3 = new dsf();
                    y1bVar.r = list;
                    y1bVar.s = dsfVar3;
                    y1bVar.t = dsfVar3;
                    y1bVar.w = 1;
                    Object U = gz8.U(y1bVar, irjVar.a, true, false, new crj(4));
                    if (U != lu3Var) {
                        list2 = list;
                        dsfVar = dsfVar3;
                        obj = U;
                        dsfVar2 = dsfVar;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Boolean.valueOf((((long[]) obj).length == 0 ? 1 : 0) ^ 1);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dsfVar = y1bVar.t;
                dsfVar2 = y1bVar.s;
                list2 = y1bVar.r;
                y6a.M(obj);
                dsfVar.a = ((Number) obj).intValue();
                ArrayList arrayList = new ArrayList(k13.r(list2, 10));
                for (UniqueTournament uniqueTournament : list2) {
                    int i3 = dsfVar2.a;
                    dsfVar2.a = i3 + 1;
                    arrayList.add(new PinnedTournament(uniqueTournament, i3));
                }
                y1bVar.r = null;
                y1bVar.s = null;
                y1bVar.t = null;
                y1bVar.w = 2;
                obj = gz8.U(y1bVar, irjVar.a, false, true, new arj(irjVar, arrayList, r5));
            }
        }
        y1bVar = new y1b(this, sq3Var);
        Object obj2 = y1bVar.u;
        lu3 lu3Var2 = lu3.a;
        i = y1bVar.w;
        irj irjVar2 = this.a;
        if (i != 0) {
        }
        dsfVar.a = ((Number) obj2).intValue();
        ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
        while (r13.hasNext()) {
        }
        y1bVar.r = null;
        y1bVar.s = null;
        y1bVar.t = null;
        y1bVar.w = 2;
        obj2 = gz8.U(y1bVar, irjVar2.a, false, true, new arj(irjVar2, arrayList2, r5));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(int i, int i2, sq3 sq3Var, String str, String str2) {
        z1b z1bVar;
        int i3;
        if (sq3Var instanceof z1b) {
            z1bVar = (z1b) sq3Var;
            int i4 = z1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                z1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = z1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = z1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    a2b a2bVar = new a2b(str2, this, i, i2, str, null, 0);
                    z1bVar.t = 1;
                    obj = yaa.P(a2bVar, z1bVar);
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
        z1bVar = new z1b(this, sq3Var);
        Object obj2 = z1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = z1bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(int i, int i2, sq3 sq3Var, String str, String str2) {
        b2b b2bVar;
        int i3;
        if (sq3Var instanceof b2b) {
            b2bVar = (b2b) sq3Var;
            int i4 = b2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                b2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = b2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = b2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    a2b a2bVar = new a2b(str2, this, i, i2, str, null, 1);
                    b2bVar.t = 1;
                    obj = yaa.P(a2bVar, b2bVar);
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
        b2bVar = new b2b(this, sq3Var);
        Object obj2 = b2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = b2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object V(int i, int i2, sq3 sq3Var, String str) {
        c2b c2bVar;
        int i3;
        if (sq3Var instanceof c2b) {
            c2bVar = (c2b) sq3Var;
            int i4 = c2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = c2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = c2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    b0b b0bVar = new b0b(this, i, i2, str, (rq3) null, 11);
                    c2bVar.t = 1;
                    obj = yaa.P(b0bVar, c2bVar);
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
        c2bVar = new c2b(this, sq3Var);
        Object obj2 = c2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = c2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object W(int i, int i2, sq3 sq3Var, String str, String str2) {
        d2b d2bVar;
        int i3;
        if (sq3Var instanceof d2b) {
            d2bVar = (d2b) sq3Var;
            int i4 = d2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                d2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = d2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = d2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    a2b a2bVar = new a2b(this, i, i2, str, str2, null);
                    d2bVar.t = 1;
                    obj = yaa.P(a2bVar, d2bVar);
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
        d2bVar = new d2b(this, sq3Var);
        Object obj2 = d2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = d2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object X(int i, sq3 sq3Var) {
        e2b e2bVar;
        int i2;
        if (sq3Var instanceof e2b) {
            e2bVar = (e2b) sq3Var;
            int i3 = e2bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e2bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = e2bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = e2bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 10, rq3Var, this);
                    e2bVar.t = 1;
                    obj = yaa.P(d0bVar, e2bVar);
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
        e2bVar = new e2b(this, sq3Var);
        Object obj2 = e2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = e2bVar.t;
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
    public final Object Y(Context context, int i, sq3 sq3Var) {
        f2b f2bVar;
        int i2;
        if (sq3Var instanceof f2b) {
            f2bVar = (f2b) sq3Var;
            int i3 = f2bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f2bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = f2bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = f2bVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    c64 c64Var = new c64(context, this, i, (rq3) null, 13);
                    f2bVar.t = 1;
                    obj = yaa.P(c64Var, f2bVar);
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
        f2bVar = new f2b(this, sq3Var);
        Object obj2 = f2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = f2bVar.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z(int i, int i2, sq3 sq3Var) {
        g2b g2bVar;
        int i3;
        if (sq3Var instanceof g2b) {
            g2bVar = (g2b) sq3Var;
            int i4 = g2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                g2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = g2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = g2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 13);
                    g2bVar.t = 1;
                    obj = yaa.P(zzaVar, g2bVar);
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
        g2bVar = new g2b(this, sq3Var);
        Object obj2 = g2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = g2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, sq3 sq3Var) {
        vza vzaVar;
        int i2;
        if (sq3Var instanceof vza) {
            vzaVar = (vza) sq3Var;
            int i3 = vzaVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vzaVar.t = i3 - Integer.MIN_VALUE;
                Object obj = vzaVar.r;
                lu3 lu3Var = lu3.a;
                i2 = vzaVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    vzaVar.t = 1;
                    obj = gz8.U(vzaVar, this.a.a, false, true, new kwi(i, 6));
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
        vzaVar = new vza(this, sq3Var);
        Object obj2 = vzaVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = vzaVar.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a0(int i, int i2, sq3 sq3Var) {
        h2b h2bVar;
        int i3;
        if (sq3Var instanceof h2b) {
            h2bVar = (h2b) sq3Var;
            int i4 = h2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                h2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = h2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = h2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 14);
                    h2bVar.t = 1;
                    obj = yaa.P(zzaVar, h2bVar);
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
        h2bVar = new h2b(this, sq3Var);
        Object obj2 = h2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = h2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        wza wzaVar;
        int i;
        if (sq3Var instanceof wza) {
            wzaVar = (wza) sq3Var;
            int i2 = wzaVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wzaVar.t = i2 - Integer.MIN_VALUE;
                Object obj = wzaVar.r;
                lu3 lu3Var = lu3.a;
                i = wzaVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    wzaVar.t = 1;
                    obj = gz8.U(wzaVar, this.a.a, true, false, new crj(5));
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
                return CollectionsKt.W0((Iterable) obj);
            }
        }
        wzaVar = new wza(this, sq3Var);
        Object obj2 = wzaVar.r;
        lu3 lu3Var2 = lu3.a;
        i = wzaVar.t;
        if (i != 0) {
        }
        return CollectionsKt.W0((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b0(int i, int i2, int i3, sq3 sq3Var) {
        i2b i2bVar;
        int i4;
        if (sq3Var instanceof i2b) {
            i2bVar = (i2b) sq3Var;
            int i5 = i2bVar.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                i2bVar.t = i5 - Integer.MIN_VALUE;
                Object obj = i2bVar.r;
                lu3 lu3Var = lu3.a;
                i4 = i2bVar.t;
                if (i4 != 0) {
                    y6a.M(obj);
                    v0b v0bVar = new v0b(this, i, i2, i3, null, 1);
                    i2bVar.t = 1;
                    obj = yaa.P(v0bVar, i2bVar);
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
        i2bVar = new i2b(this, sq3Var);
        Object obj2 = i2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i4 = i2bVar.t;
        if (i4 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, int i2, sq3 sq3Var) {
        yza yzaVar;
        int i3;
        if (sq3Var instanceof yza) {
            yzaVar = (yza) sq3Var;
            int i4 = yzaVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                yzaVar.t = i4 - Integer.MIN_VALUE;
                Object obj = yzaVar.r;
                lu3 lu3Var = lu3.a;
                i3 = yzaVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 0);
                    yzaVar.t = 1;
                    obj = yaa.P(zzaVar, yzaVar);
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
        yzaVar = new yza(this, sq3Var);
        Object obj2 = yzaVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = yzaVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(int i, int i2, sq3 sq3Var) {
        j2b j2bVar;
        int i3;
        if (sq3Var instanceof j2b) {
            j2bVar = (j2b) sq3Var;
            int i4 = j2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                j2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = j2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = j2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 15);
                    j2bVar.t = 1;
                    obj = yaa.P(zzaVar, j2bVar);
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
        j2bVar = new j2b(this, sq3Var);
        Object obj2 = j2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = j2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, int i2, sq3 sq3Var, String str) {
        a0b a0bVar;
        int i3;
        if (sq3Var instanceof a0b) {
            a0bVar = (a0b) sq3Var;
            int i4 = a0bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                a0bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = a0bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = a0bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    b0b b0bVar = new b0b(this, i, str, i2, (rq3) null, 0);
                    a0bVar.t = 1;
                    obj = yaa.P(b0bVar, a0bVar);
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
        a0bVar = new a0b(this, sq3Var);
        Object obj2 = a0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = a0bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d0(int i, int i2, int i3, sq3 sq3Var) {
        k2b k2bVar;
        int i4;
        if (sq3Var instanceof k2b) {
            k2bVar = (k2b) sq3Var;
            int i5 = k2bVar.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                k2bVar.t = i5 - Integer.MIN_VALUE;
                Object obj = k2bVar.r;
                lu3 lu3Var = lu3.a;
                i4 = k2bVar.t;
                if (i4 != 0) {
                    y6a.M(obj);
                    v0b v0bVar = new v0b(this, i, i2, i3, null, 2);
                    k2bVar.t = 1;
                    obj = yaa.P(v0bVar, k2bVar);
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
        k2bVar = new k2b(this, sq3Var);
        Object obj2 = k2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i4 = k2bVar.t;
        if (i4 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, sq3 sq3Var) {
        c0b c0bVar;
        int i2;
        if (sq3Var instanceof c0b) {
            c0bVar = (c0b) sq3Var;
            int i3 = c0bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = c0bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = c0bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 0, rq3Var, this);
                    c0bVar.t = 1;
                    obj = yaa.P(d0bVar, c0bVar);
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
        c0bVar = new c0b(this, sq3Var);
        Object obj2 = c0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = c0bVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final Object e0(int i, sq3 sq3Var) {
        irj irjVar = this.a;
        return gz8.T(sq3Var, irjVar.a, new xr2(irjVar, i, null, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, String str, sq3 sq3Var) {
        e0b e0bVar;
        int i2;
        if (sq3Var instanceof e0b) {
            e0bVar = (e0b) sq3Var;
            int i3 = e0bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e0bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = e0bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = e0bVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    f0b f0bVar = new f0b(this, i, str, null, 0);
                    e0bVar.t = 1;
                    obj = yaa.P(f0bVar, e0bVar);
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
        e0bVar = new e0b(this, sq3Var);
        Object obj2 = e0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = e0bVar.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final Object f0(int i, sq3 sq3Var) {
        Object U = gz8.U(sq3Var, this.a.a, false, true, new kwi(i, 4));
        lu3 lu3Var = lu3.a;
        if (U != lu3Var) {
            U = Unit.a;
        }
        return U == lu3Var ? U : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(sq3 sq3Var) {
        g0b g0bVar;
        int i;
        if (sq3Var instanceof g0b) {
            g0bVar = (g0b) sq3Var;
            int i2 = g0bVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0bVar.t = i2 - Integer.MIN_VALUE;
                Object obj = g0bVar.r;
                lu3 lu3Var = lu3.a;
                i = g0bVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    g0bVar.t = 1;
                    obj = gz8.U(g0bVar, this.a.a, true, false, new crj(6));
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
        g0bVar = new g0b(this, sq3Var);
        Object obj2 = g0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i = g0bVar.t;
        if (i != 0) {
        }
        return CollectionsKt.Q0((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g0(int i, int i2, sq3 sq3Var) {
        l2b l2bVar;
        int i3;
        if (sq3Var instanceof l2b) {
            l2bVar = (l2b) sq3Var;
            int i4 = l2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                l2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = l2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = l2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 16);
                    l2bVar.t = 1;
                    obj = yaa.P(zzaVar, l2bVar);
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
        l2bVar = new l2b(this, sq3Var);
        Object obj2 = l2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = l2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(sq3 sq3Var) {
        h0b h0bVar;
        int i;
        if (sq3Var instanceof h0b) {
            h0bVar = (h0b) sq3Var;
            int i2 = h0bVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0bVar.t = i2 - Integer.MIN_VALUE;
                Object obj = h0bVar.r;
                lu3 lu3Var = lu3.a;
                i = h0bVar.t;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    h0bVar.t = 1;
                    obj = gz8.U(h0bVar, this.a.a, true, false, new crj(i3));
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
        h0bVar = new h0b(this, sq3Var);
        Object obj2 = h0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i = h0bVar.t;
        int i32 = 1;
        if (i != 0) {
        }
        return CollectionsKt.Q0((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h0(int i, int i2, sq3 sq3Var) {
        m2b m2bVar;
        int i3;
        if (sq3Var instanceof m2b) {
            m2bVar = (m2b) sq3Var;
            int i4 = m2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                m2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = m2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = m2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 17);
                    m2bVar.t = 1;
                    obj = yaa.P(zzaVar, m2bVar);
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
        m2bVar = new m2b(this, sq3Var);
        Object obj2 = m2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = m2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[LOOP:0: B:14:0x005f->B:16:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable i(sq3 sq3Var) {
        i0b i0bVar;
        int i;
        int c;
        if (sq3Var instanceof i0b) {
            i0bVar = (i0b) sq3Var;
            int i2 = i0bVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i0bVar.t = i2 - Integer.MIN_VALUE;
                Object obj = i0bVar.r;
                lu3 lu3Var = lu3.a;
                i = i0bVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    i0bVar.t = 1;
                    obj = gz8.U(i0bVar, this.a.a, true, false, new crj(6));
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
                Iterable<DbMyUniqueTournament> iterable = (Iterable) obj;
                c = sub.c(k13.r(iterable, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (DbMyUniqueTournament dbMyUniqueTournament : iterable) {
                    linkedHashMap.put(new Integer(dbMyUniqueTournament.getUniqueTournamentId()), Boolean.valueOf(dbMyUniqueTournament.getNotificationsEnabled()));
                }
                return new LinkedHashMap(linkedHashMap);
            }
        }
        i0bVar = new i0b(this, sq3Var);
        Object obj2 = i0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i = i0bVar.t;
        if (i != 0) {
        }
        Iterable<DbMyUniqueTournament> iterable2 = (Iterable) obj2;
        c = sub.c(k13.r(iterable2, 10));
        if (c < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c);
        while (r4.hasNext()) {
        }
        return new LinkedHashMap(linkedHashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i0(int i, int i2, sq3 sq3Var) {
        n2b n2bVar;
        int i3;
        if (sq3Var instanceof n2b) {
            n2bVar = (n2b) sq3Var;
            int i4 = n2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                n2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = n2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = n2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 18);
                    n2bVar.t = 1;
                    obj = yaa.P(zzaVar, n2bVar);
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
        n2bVar = new n2b(this, sq3Var);
        Object obj2 = n2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = n2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable j(sq3 sq3Var) {
        j0b j0bVar;
        int i;
        if (sq3Var instanceof j0b) {
            j0bVar = (j0b) sq3Var;
            int i2 = j0bVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j0bVar.t = i2 - Integer.MIN_VALUE;
                Object obj = j0bVar.r;
                lu3 lu3Var = lu3.a;
                i = j0bVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    j0bVar.t = 1;
                    obj = gz8.U(j0bVar, this.a.a, true, false, new crj(0));
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
        j0bVar = new j0b(this, sq3Var);
        Object obj2 = j0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i = j0bVar.t;
        if (i != 0) {
        }
        return CollectionsKt.Q0((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j0(int i, sq3 sq3Var) {
        o2b o2bVar;
        int i2;
        if (sq3Var instanceof o2b) {
            o2bVar = (o2b) sq3Var;
            int i3 = o2bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o2bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = o2bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = o2bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 12, rq3Var, this);
                    o2bVar.t = 1;
                    obj = yaa.P(d0bVar, o2bVar);
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
        o2bVar = new o2b(this, sq3Var);
        Object obj2 = o2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = o2bVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final Object k(hoi hoiVar) {
        irj irjVar = this.a;
        return gz8.U(hoiVar, irjVar.a, true, false, new brj(irjVar, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k0(int i, int i2, sq3 sq3Var, String str) {
        p2b p2bVar;
        int i3;
        if (sq3Var instanceof p2b) {
            p2bVar = (p2b) sq3Var;
            int i4 = p2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                p2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = p2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = p2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    b0b b0bVar = new b0b(this, i, str, i2, (rq3) null, 12);
                    p2bVar.t = 1;
                    obj = yaa.P(b0bVar, p2bVar);
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
        p2bVar = new p2b(this, sq3Var);
        Object obj2 = p2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = p2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final nb8 l() {
        irj irjVar = this.a;
        return zm2.s(irjVar.a, false, new String[]{"leagues"}, new brj(irjVar, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l0(int i, int i2, sq3 sq3Var) {
        q2b q2bVar;
        int i3;
        if (sq3Var instanceof q2b) {
            q2bVar = (q2b) sq3Var;
            int i4 = q2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                q2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = q2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = q2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 19);
                    q2bVar.t = 1;
                    obj = yaa.P(zzaVar, q2bVar);
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
        q2bVar = new q2b(this, sq3Var);
        Object obj2 = q2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = q2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, sq3 sq3Var) {
        l0b l0bVar;
        int i;
        if (sq3Var instanceof l0b) {
            l0bVar = (l0b) sq3Var;
            int i2 = l0bVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l0bVar.t = i2 - Integer.MIN_VALUE;
                Object obj = l0bVar.r;
                lu3 lu3Var = lu3.a;
                i = l0bVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    l0bVar.t = 1;
                    obj = gz8.U(l0bVar, this.a.a, true, false, new cfi(str, 6));
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
                return CollectionsKt.W0((Iterable) obj);
            }
        }
        l0bVar = new l0b(this, sq3Var);
        Object obj2 = l0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i = l0bVar.t;
        if (i != 0) {
        }
        return CollectionsKt.W0((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m0(int i, int i2, int i3, sq3 sq3Var, String str) {
        r2b r2bVar;
        int i4;
        if (sq3Var instanceof r2b) {
            r2bVar = (r2b) sq3Var;
            int i5 = r2bVar.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                r2bVar.t = i5 - Integer.MIN_VALUE;
                Object obj = r2bVar.r;
                lu3 lu3Var = lu3.a;
                i4 = r2bVar.t;
                if (i4 != 0) {
                    y6a.M(obj);
                    sve sveVar = new sve(this, i, i2, str, null, i3);
                    r2bVar.t = 1;
                    obj = yaa.P(sveVar, r2bVar);
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
        r2bVar = new r2b(this, sq3Var);
        Object obj2 = r2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i4 = r2bVar.t;
        if (i4 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(int i, int i2, sq3 sq3Var, Integer num, String str) {
        m0b m0bVar;
        int i3;
        List<Transfer> transfers;
        if (sq3Var instanceof m0b) {
            m0bVar = (m0b) sq3Var;
            int i4 = m0bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                m0bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = m0bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = m0bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    n0b n0bVar = new n0b(num, this, str, i2, i, (rq3) null);
                    m0bVar.t = 1;
                    obj = yaa.P(n0bVar, m0bVar);
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
                UniqueTournamentPlayerTransactionsResponse uniqueTournamentPlayerTransactionsResponse = (UniqueTournamentPlayerTransactionsResponse) yaa.x((x2g) obj);
                return (uniqueTournamentPlayerTransactionsResponse != null || (transfers = uniqueTournamentPlayerTransactionsResponse.getTransfers()) == null) ? km5.a : transfers;
            }
        }
        m0bVar = new m0b(this, sq3Var);
        Object obj2 = m0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = m0bVar.t;
        if (i3 != 0) {
        }
        UniqueTournamentPlayerTransactionsResponse uniqueTournamentPlayerTransactionsResponse2 = (UniqueTournamentPlayerTransactionsResponse) yaa.x((x2g) obj2);
        if (uniqueTournamentPlayerTransactionsResponse2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n0(int i, sq3 sq3Var) {
        s2b s2bVar;
        int i2;
        if (sq3Var instanceof s2b) {
            s2bVar = (s2b) sq3Var;
            int i3 = s2bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s2bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = s2bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = s2bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 13, rq3Var, this);
                    s2bVar.t = 1;
                    obj = yaa.P(d0bVar, s2bVar);
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
        s2bVar = new s2b(this, sq3Var);
        Object obj2 = s2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = s2bVar.t;
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
    public final Object o(int i, sq3 sq3Var) {
        o0b o0bVar;
        int i2;
        if (sq3Var instanceof o0b) {
            o0bVar = (o0b) sq3Var;
            int i3 = o0bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o0bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = o0bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = o0bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 2, rq3Var, this);
                    o0bVar.t = 1;
                    obj = yaa.P(d0bVar, o0bVar);
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
        o0bVar = new o0b(this, sq3Var);
        Object obj2 = o0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = o0bVar.t;
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
    public final Object o0(int i, int i2, sq3 sq3Var) {
        t2b t2bVar;
        int i3;
        if (sq3Var instanceof t2b) {
            t2bVar = (t2b) sq3Var;
            int i4 = t2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                t2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = t2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = t2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 20);
                    t2bVar.t = 1;
                    obj = yaa.P(zzaVar, t2bVar);
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
        t2bVar = new t2b(this, sq3Var);
        Object obj2 = t2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = t2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(int i, String str, String str2, sq3 sq3Var) {
        p0b p0bVar;
        int i2;
        if (sq3Var instanceof p0b) {
            p0bVar = (p0b) sq3Var;
            int i3 = p0bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p0bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = p0bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = p0bVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    bs2 bs2Var = new bs2(this, i, str, str2, null, 5);
                    p0bVar.t = 1;
                    obj = yaa.P(bs2Var, p0bVar);
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
        p0bVar = new p0b(this, sq3Var);
        Object obj2 = p0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = p0bVar.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p0(int i, int i2, sq3 sq3Var) {
        u2b u2bVar;
        int i3;
        if (sq3Var instanceof u2b) {
            u2bVar = (u2b) sq3Var;
            int i4 = u2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                u2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = u2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = u2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 21);
                    u2bVar.t = 1;
                    obj = yaa.P(zzaVar, u2bVar);
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
        u2bVar = new u2b(this, sq3Var);
        Object obj2 = u2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = u2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(int i, String str, sq3 sq3Var) {
        q0b q0bVar;
        int i2;
        if (sq3Var instanceof q0b) {
            q0bVar = (q0b) sq3Var;
            int i3 = q0bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q0bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = q0bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = q0bVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    f0b f0bVar = new f0b(this, i, str, null, 1);
                    q0bVar.t = 1;
                    obj = yaa.P(f0bVar, q0bVar);
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
        q0bVar = new q0b(this, sq3Var);
        Object obj2 = q0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = q0bVar.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q0(int i, rq3 rq3Var) {
        v2b v2bVar;
        int i2;
        if (rq3Var instanceof v2b) {
            v2bVar = (v2b) rq3Var;
            int i3 = v2bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v2bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = v2bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = v2bVar.t;
                rq3 rq3Var2 = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 14, rq3Var2, this);
                    v2bVar.t = 1;
                    obj = yaa.P(d0bVar, v2bVar);
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
        v2bVar = new v2b(this, rq3Var);
        Object obj2 = v2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = v2bVar.t;
        rq3 rq3Var22 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(int i, int i2, sq3 sq3Var, String str) {
        r0b r0bVar;
        int i3;
        if (sq3Var instanceof r0b) {
            r0bVar = (r0b) sq3Var;
            int i4 = r0bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                r0bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = r0bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = r0bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    b0b b0bVar = new b0b(this, i, i2, str, (rq3) null, 1);
                    r0bVar.t = 1;
                    obj = yaa.P(b0bVar, r0bVar);
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
        r0bVar = new r0b(this, sq3Var);
        Object obj2 = r0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = r0bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r0(int i, int i2, sq3 sq3Var) {
        w2b w2bVar;
        int i3;
        if (sq3Var instanceof w2b) {
            w2bVar = (w2b) sq3Var;
            int i4 = w2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                w2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = w2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = w2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 22);
                    w2bVar.t = 1;
                    obj = yaa.P(zzaVar, w2bVar);
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
        w2bVar = new w2b(this, sq3Var);
        Object obj2 = w2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = w2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(int i, int i2, sq3 sq3Var, String str) {
        s0b s0bVar;
        int i3;
        if (sq3Var instanceof s0b) {
            s0bVar = (s0b) sq3Var;
            int i4 = s0bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s0bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = s0bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = s0bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    b0b b0bVar = new b0b(this, i, i2, str, (rq3) null, 2);
                    s0bVar.t = 1;
                    obj = yaa.P(b0bVar, s0bVar);
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
        s0bVar = new s0b(this, sq3Var);
        Object obj2 = s0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = s0bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s0(int i, int i2, sq3 sq3Var) {
        x2b x2bVar;
        int i3;
        if (sq3Var instanceof x2b) {
            x2bVar = (x2b) sq3Var;
            int i4 = x2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = x2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = x2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 23);
                    x2bVar.t = 1;
                    obj = yaa.P(zzaVar, x2bVar);
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
        x2bVar = new x2b(this, sq3Var);
        Object obj2 = x2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = x2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(int i, sq3 sq3Var) {
        t0b t0bVar;
        int i2;
        if (sq3Var instanceof t0b) {
            t0bVar = (t0b) sq3Var;
            int i3 = t0bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t0bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = t0bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = t0bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 3, rq3Var, this);
                    t0bVar.t = 1;
                    obj = yaa.P(d0bVar, t0bVar);
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
        t0bVar = new t0b(this, sq3Var);
        Object obj2 = t0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = t0bVar.t;
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
    public final Object t0(int i, sq3 sq3Var) {
        y2b y2bVar;
        int i2;
        if (sq3Var instanceof y2b) {
            y2bVar = (y2b) sq3Var;
            int i3 = y2bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y2bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = y2bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = y2bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 15, rq3Var, this);
                    y2bVar.t = 1;
                    obj = yaa.P(d0bVar, y2bVar);
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
        y2bVar = new y2b(this, sq3Var);
        Object obj2 = y2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = y2bVar.t;
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
    public final Object u(int i, int i2, int i3, sq3 sq3Var) {
        u0b u0bVar;
        int i4;
        if (sq3Var instanceof u0b) {
            u0bVar = (u0b) sq3Var;
            int i5 = u0bVar.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                u0bVar.t = i5 - Integer.MIN_VALUE;
                Object obj = u0bVar.r;
                lu3 lu3Var = lu3.a;
                i4 = u0bVar.t;
                if (i4 != 0) {
                    y6a.M(obj);
                    v0b v0bVar = new v0b(this, i, i2, i3, null, 0);
                    u0bVar.t = 1;
                    obj = yaa.P(v0bVar, u0bVar);
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
        u0bVar = new u0b(this, sq3Var);
        Object obj2 = u0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i4 = u0bVar.t;
        if (i4 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u0(int i, int i2, sq3 sq3Var) {
        z2b z2bVar;
        int i3;
        if (sq3Var instanceof z2b) {
            z2bVar = (z2b) sq3Var;
            int i4 = z2bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                z2bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = z2bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = z2bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 24);
                    z2bVar.t = 1;
                    obj = yaa.P(zzaVar, z2bVar);
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
        z2bVar = new z2b(this, sq3Var);
        Object obj2 = z2bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = z2bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(int i, int i2, sq3 sq3Var) {
        x0b x0bVar;
        int i3;
        if (sq3Var instanceof x0b) {
            x0bVar = (x0b) sq3Var;
            int i4 = x0bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x0bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = x0bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = x0bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 1);
                    x0bVar.t = 1;
                    obj = yaa.P(zzaVar, x0bVar);
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
        x0bVar = new x0b(this, sq3Var);
        Object obj2 = x0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = x0bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v0(int i, int i2, sq3 sq3Var, Integer num, String str) {
        a3b a3bVar;
        int i3;
        if (sq3Var instanceof a3b) {
            a3bVar = (a3b) sq3Var;
            int i4 = a3bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                a3bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = a3bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = a3bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    n0b n0bVar = new n0b(num, this, i, str, i2, (rq3) null);
                    a3bVar.t = 1;
                    obj = yaa.P(n0bVar, a3bVar);
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
        a3bVar = new a3b(this, sq3Var);
        Object obj2 = a3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = a3bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(int i, int i2, sq3 sq3Var, String str) {
        y0b y0bVar;
        int i3;
        if (sq3Var instanceof y0b) {
            y0bVar = (y0b) sq3Var;
            int i4 = y0bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                y0bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = y0bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = y0bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    b0b b0bVar = new b0b(this, i, i2, str, (rq3) null, 3);
                    y0bVar.t = 1;
                    obj = yaa.P(b0bVar, y0bVar);
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
        y0bVar = new y0b(this, sq3Var);
        Object obj2 = y0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = y0bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w0(int i, int i2, sq3 sq3Var) {
        c3b c3bVar;
        int i3;
        if (sq3Var instanceof c3b) {
            c3bVar = (c3b) sq3Var;
            int i4 = c3bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c3bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = c3bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = c3bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 25);
                    c3bVar.t = 1;
                    obj = yaa.P(zzaVar, c3bVar);
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
        c3bVar = new c3b(this, sq3Var);
        Object obj2 = c3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = c3bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(int i, int i2, sq3 sq3Var, String str) {
        z0b z0bVar;
        int i3;
        if (sq3Var instanceof z0b) {
            z0bVar = (z0b) sq3Var;
            int i4 = z0bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                z0bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = z0bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = z0bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    b0b b0bVar = new b0b(this, i, i2, str, (rq3) null, 4);
                    z0bVar.t = 1;
                    obj = yaa.P(b0bVar, z0bVar);
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
        z0bVar = new z0b(this, sq3Var);
        Object obj2 = z0bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = z0bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x0(int i, sq3 sq3Var) {
        b3b b3bVar;
        int i2;
        if (sq3Var instanceof b3b) {
            b3bVar = (b3b) sq3Var;
            int i3 = b3bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b3bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = b3bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = b3bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 16, rq3Var, this);
                    b3bVar.t = 1;
                    obj = yaa.P(d0bVar, b3bVar);
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
        b3bVar = new b3b(this, sq3Var);
        Object obj2 = b3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = b3bVar.t;
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
    public final Object y(int i, sq3 sq3Var) {
        a1b a1bVar;
        int i2;
        if (sq3Var instanceof a1b) {
            a1bVar = (a1b) sq3Var;
            int i3 = a1bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a1bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = a1bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = a1bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 4, rq3Var, this);
                    a1bVar.t = 1;
                    obj = yaa.P(d0bVar, a1bVar);
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
        a1bVar = new a1b(this, sq3Var);
        Object obj2 = a1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = a1bVar.t;
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
    public final Object y0(int i, int i2, sq3 sq3Var) {
        d3b d3bVar;
        int i3;
        if (sq3Var instanceof d3b) {
            d3bVar = (d3b) sq3Var;
            int i4 = d3bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                d3bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = d3bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = d3bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 26);
                    d3bVar.t = 1;
                    obj = yaa.P(zzaVar, d3bVar);
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
        d3bVar = new d3b(this, sq3Var);
        Object obj2 = d3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = d3bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(int i, int i2, sq3 sq3Var) {
        b1b b1bVar;
        int i3;
        if (sq3Var instanceof b1b) {
            b1bVar = (b1b) sq3Var;
            int i4 = b1bVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                b1bVar.t = i4 - Integer.MIN_VALUE;
                Object obj = b1bVar.r;
                lu3 lu3Var = lu3.a;
                i3 = b1bVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this, i, i2, null, 2);
                    b1bVar.t = 1;
                    obj = yaa.P(zzaVar, b1bVar);
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
        b1bVar = new b1b(this, sq3Var);
        Object obj2 = b1bVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = b1bVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z0(int i, sq3 sq3Var) {
        e3b e3bVar;
        int i2;
        if (sq3Var instanceof e3b) {
            e3bVar = (e3b) sq3Var;
            int i3 = e3bVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e3bVar.t = i3 - Integer.MIN_VALUE;
                Object obj = e3bVar.r;
                lu3 lu3Var = lu3.a;
                i2 = e3bVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    d0b d0bVar = new d0b(i, 17, rq3Var, this);
                    e3bVar.t = 1;
                    obj = yaa.P(d0bVar, e3bVar);
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
        e3bVar = new e3b(this, sq3Var);
        Object obj2 = e3bVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = e3bVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }
}
