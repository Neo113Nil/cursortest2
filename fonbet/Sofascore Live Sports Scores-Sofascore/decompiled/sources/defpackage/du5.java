package defpackage;

import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.LineupsResponse;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class du5 extends hoi implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public av4 r;
    public zu4 s;
    public gv9 t;
    public gv9 u;
    public gv9 v;
    public gv9 w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ LineupsResponse z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du5(LineupsResponse lineupsResponse, boolean z, String str, int i, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = lineupsResponse;
        this.A = z;
        this.B = str;
        this.C = i;
        this.D = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        du5 du5Var = new du5(this.z, this.A, this.B, this.C, this.D, rq3Var);
        du5Var.y = obj;
        return du5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((du5) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ce, code lost:
    
        if (r4 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0109  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        zu4 t2;
        boolean z;
        Object w;
        Object T;
        zu4 zu4Var;
        gv9 gv9Var;
        gv9 gv9Var2;
        Object T2;
        gv9 gv9Var3;
        gv9 gv9Var4;
        boolean z2;
        ku3 ku3Var = (ku3) this.y;
        lu3 lu3Var = lu3.a;
        int i = this.x;
        boolean z3 = this.A;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            LineupsResponse lineupsResponse = this.z;
            List<PlayerData> players = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers();
            List<PlayerData> players2 = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers();
            HashSet hashSet = new HashSet();
            Iterator<T> it = players.iterator();
            while (it.hasNext()) {
                hashSet.add(new Integer(((PlayerData) it.next()).getPlayer().getId()));
            }
            hs4 hs4Var = z45.a;
            String str = this.B;
            av4 t3 = xw3.t(ku3Var, hs4Var, new bu5(str, players, z3, rq3Var, 1), 2);
            t = xw3.t(ku3Var, hs4Var, new bu5(str, players2, z3, rq3Var, 0), 2);
            t2 = xw3.t(ku3Var, hs4Var, new cu5(this.B, players, players2, this.A, hashSet, this.C, this.D, null), 2);
            this.y = null;
            this.r = t;
            this.s = t2;
            z = true;
            this.x = 1;
            w = t3.w(this);
            lu3 lu3Var2 = lu3.a;
        } else {
            if (i != 1) {
                if (i == 2) {
                    gv9Var = this.t;
                    zu4 zu4Var2 = this.s;
                    y6a.M(obj);
                    T = obj;
                    zu4Var = zu4Var2;
                    z = true;
                    gv9Var2 = (gv9) T;
                    this.y = null;
                    this.r = null;
                    this.s = null;
                    this.t = gv9Var;
                    this.u = gv9Var2;
                    this.v = gv9Var;
                    this.w = gv9Var2;
                    this.x = 3;
                    T2 = zu4Var.T(this);
                    if (T2 != lu3Var) {
                        gv9Var3 = gv9Var;
                        gv9Var4 = gv9Var2;
                        gv9 gv9Var5 = (gv9) T2;
                        if (z3) {
                        }
                        z2 = false;
                        return new n22(gv9Var3, gv9Var2, gv9Var5, z2);
                    }
                    return lu3Var;
                }
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gv9 gv9Var6 = this.w;
                gv9Var3 = this.v;
                gv9 gv9Var7 = this.u;
                gv9 gv9Var8 = this.t;
                y6a.M(obj);
                gv9Var2 = gv9Var6;
                gv9Var4 = gv9Var7;
                z = true;
                gv9Var = gv9Var8;
                T2 = obj;
                gv9 gv9Var52 = (gv9) T2;
                if (z3) {
                    if (gv9Var == null || !gv9Var.isEmpty()) {
                        Iterator<E> it2 = gv9Var.iterator();
                        loop2: while (it2.hasNext()) {
                            gv9 gv9Var9 = ((l22) it2.next()).a.b;
                            if (gv9Var9 == null || !gv9Var9.isEmpty()) {
                                Iterator<E> it3 = gv9Var9.iterator();
                                while (it3.hasNext()) {
                                    if (((ku5) it3.next()).g != null) {
                                        break loop2;
                                    }
                                }
                            }
                        }
                    }
                    if (gv9Var4 == null || !gv9Var4.isEmpty()) {
                        Iterator<E> it4 = gv9Var4.iterator();
                        loop0: while (it4.hasNext()) {
                            gv9 gv9Var10 = ((l22) it4.next()).a.b;
                            if (gv9Var10 == null || !gv9Var10.isEmpty()) {
                                Iterator<E> it5 = gv9Var10.iterator();
                                while (it5.hasNext()) {
                                    if (((ku5) it5.next()).g != null) {
                                        z2 = z;
                                    }
                                }
                            }
                        }
                    }
                }
                z2 = false;
                return new n22(gv9Var3, gv9Var2, gv9Var52, z2);
            }
            t2 = this.s;
            av4 av4Var = this.r;
            y6a.M(obj);
            w = obj;
            t = av4Var;
            z = true;
        }
        gv9 gv9Var11 = (gv9) w;
        this.y = null;
        this.r = null;
        this.s = t2;
        this.t = gv9Var11;
        this.x = 2;
        T = t.T(this);
        if (T != lu3Var) {
            zu4Var = t2;
            gv9Var = gv9Var11;
            gv9Var2 = (gv9) T;
            this.y = null;
            this.r = null;
            this.s = null;
            this.t = gv9Var;
            this.u = gv9Var2;
            this.v = gv9Var;
            this.w = gv9Var2;
            this.x = 3;
            T2 = zu4Var.T(this);
            if (T2 != lu3Var) {
            }
        }
        return lu3Var;
    }
}
