package defpackage;

import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.fantasy.FantasyUserCompetitionsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lx6 {
    public final bfk a;
    public final wi7 b;

    public lx6(bfk bfkVar, wi7 wi7Var) {
        bfkVar.getClass();
        wi7Var.getClass();
        this.a = bfkVar;
        this.b = wi7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[LOOP:0: B:22:0x008c->B:24:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Integer num, sq3 sq3Var) {
        jx6 jx6Var;
        int i;
        ?? r3;
        x2g x2gVar;
        FantasyUserCompetitionsResponse fantasyUserCompetitionsResponse;
        List<FantasyUserCompetition> competitions;
        Iterator it;
        if (sq3Var instanceof jx6) {
            jx6Var = (jx6) sq3Var;
            int i2 = jx6Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jx6Var.u = i2 - Integer.MIN_VALUE;
                Object obj = jx6Var.s;
                lu3 lu3Var = lu3.a;
                i = jx6Var.u;
                r3 = 0;
                r3 = 0;
                if (i != 0) {
                    y6a.M(obj);
                    UserAccount b = this.a.b();
                    if (!b.getFantasyUser()) {
                        return new hx6(num);
                    }
                    if (num != null) {
                        String id = b.getId();
                        jx6Var.r = num;
                        jx6Var.u = 1;
                        wi7 wi7Var = this.b;
                        wi7Var.getClass();
                        obj = yaa.P(new ug7(wi7Var, id, r3, 4), jx6Var);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return ex6.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                num = jx6Var.r;
                y6a.M(obj);
                x2gVar = (x2g) obj;
                if ((x2gVar instanceof t2g) || (x2gVar instanceof r2g)) {
                    fantasyUserCompetitionsResponse = (FantasyUserCompetitionsResponse) yaa.x(x2gVar);
                    if (fantasyUserCompetitionsResponse != null && (competitions = fantasyUserCompetitionsResponse.getCompetitions()) != null) {
                        r3 = new ArrayList(k13.r(competitions, 10));
                        it = competitions.iterator();
                        while (it.hasNext()) {
                            w1l.A(r3, ((FantasyUserCompetition) it.next()).getFantasyCompetition().getId());
                        }
                    }
                    if (r3 == 0) {
                        r3 = km5.a;
                    }
                    return !r3.contains(num) ? new fx6(num.intValue()) : new gx6(num.intValue());
                }
                return ex6.a;
            }
        }
        jx6Var = new jx6(this, sq3Var);
        Object obj2 = jx6Var.s;
        lu3 lu3Var2 = lu3.a;
        i = jx6Var.u;
        r3 = 0;
        r3 = 0;
        if (i != 0) {
        }
        x2gVar = (x2g) obj2;
        if (x2gVar instanceof t2g) {
        }
        fantasyUserCompetitionsResponse = (FantasyUserCompetitionsResponse) yaa.x(x2gVar);
        if (fantasyUserCompetitionsResponse != null) {
            r3 = new ArrayList(k13.r(competitions, 10));
            it = competitions.iterator();
            while (it.hasNext()) {
            }
        }
        if (r3 == 0) {
        }
        if (!r3.contains(num)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, sq3 sq3Var) {
        kx6 kx6Var;
        int i2;
        if (sq3Var instanceof kx6) {
            kx6Var = (kx6) sq3Var;
            int i3 = kx6Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kx6Var.u = i3 - Integer.MIN_VALUE;
                Object obj = kx6Var.s;
                Object obj2 = lu3.a;
                i2 = kx6Var.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    String c = dv3.c();
                    kx6Var.r = i;
                    kx6Var.u = 1;
                    obj = this.b.L(c, kx6Var);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = kx6Var.r;
                    y6a.M(obj);
                }
                Map map = (Map) obj;
                Integer num = map != null ? (Integer) me4.f(i, map) : null;
                kx6Var.r = i;
                kx6Var.u = 2;
                Object a = a(num, kx6Var);
                return a != obj2 ? obj2 : a;
            }
        }
        kx6Var = new kx6(this, sq3Var);
        Object obj3 = kx6Var.s;
        Object obj22 = lu3.a;
        i2 = kx6Var.u;
        if (i2 != 0) {
        }
        Map map2 = (Map) obj3;
        if (map2 != null) {
        }
        kx6Var.r = i;
        kx6Var.u = 2;
        Object a2 = a(num, kx6Var);
        if (a2 != obj22) {
        }
    }
}
