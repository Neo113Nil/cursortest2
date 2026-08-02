package defpackage;

import android.app.Application;
import com.sofascore.model.fantasy.FantasyRound;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Le57;", "Lynb;", "Lz47;", "Lu47;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e57 extends ynb {
    public final wi7 l;
    public final tj7 m;
    public final j67 n;
    public final ev6 o;
    public final String p;
    public g9i q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e57(wi7 wi7Var, tj7 tj7Var, fqg fqgVar, Application application) {
        super(application, tnb.a);
        fqgVar.getClass();
        wi7Var.getClass();
        tj7Var.getClass();
        this.l = wi7Var;
        this.m = tj7Var;
        Object a = fqgVar.a("FANTASY_LEAGUE_EXTRA");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.n = (j67) a;
        Object a2 = fqgVar.a("FANTASY_COMPETITION_EXTRA");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.o = (ev6) a2;
        ia0 ia0Var = ia0.q;
        this.p = fc6.e();
    }

    public static s77 w(s77 s77Var, Map map, Integer num) {
        Integer num2 = s77Var.a;
        String str = null;
        if (num2 != null) {
            Integer num3 = (Integer) map.get(num2);
            if (num3 != null) {
                str = String.valueOf(num3.intValue());
            }
        } else if (num != null) {
            str = String.valueOf(num.intValue());
        }
        String str2 = str;
        if (str2 == null) {
            return s77Var;
        }
        Integer num4 = s77Var.a;
        String str3 = s77Var.b;
        String str4 = s77Var.c;
        String str5 = s77Var.d;
        String str6 = s77Var.e;
        str4.getClass();
        return new s77(num4, str3, str4, str5, str6, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0104, code lost:
    
        if (r0 == r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x004f, code lost:
    
        if (r0 == r7) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2 A[LOOP:2: B:34:0x009c->B:36:0x00a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7 A[LOOP:4: B:48:0x00d7->B:53:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(sq3 sq3Var) {
        b57 b57Var;
        int i;
        Iterator it;
        int i2;
        ArrayList arrayList;
        Iterator it2;
        Iterator it3;
        rq3 rq3Var;
        Object obj;
        mj7 mj7Var;
        Object value;
        Object value2;
        if (sq3Var instanceof b57) {
            b57Var = (b57) sq3Var;
            int i3 = b57Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b57Var.v = i3 - Integer.MIN_VALUE;
                b57 b57Var2 = b57Var;
                Object obj2 = b57Var2.t;
                lu3 lu3Var = lu3.a;
                i = b57Var2.v;
                fdi fdiVar = this.e;
                ev6 ev6Var = this.o;
                if (i != 0) {
                    y6a.M(obj2);
                    int i4 = ev6Var.c;
                    b57Var2.v = 1;
                    obj2 = this.l.i(i4, b57Var2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mj7Var = b57Var2.s;
                        ArrayList arrayList2 = b57Var2.r;
                        y6a.M(obj2);
                        arrayList = arrayList2;
                        mj7 mj7Var2 = mj7Var;
                        Pair pair = (Pair) obj2;
                        t77 t77Var = (t77) pair.a;
                        gv9 gv9Var = (gv9) pair.b;
                        do {
                            value2 = fdiVar.getValue();
                            ((vnb) value2).getClass();
                        } while (!fdiVar.k(value2, new unb(new z47(l6g.W(arrayList), mj7Var2, t77Var, gv9Var, false))));
                        return Unit.a;
                    }
                    y6a.M(obj2);
                }
                List H0 = CollectionsKt.H0((Iterable) obj2, new v66(16));
                it = H0.iterator();
                i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (((FantasyRound) it.next()).getId() == this.n.e) {
                        break;
                    }
                    i2++;
                }
                List subList = H0.subList(i2 >= 0 ? i2 : 0, H0.size());
                arrayList = new ArrayList(k13.r(subList, 10));
                it2 = subList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(pd0.K((FantasyRound) it2.next()));
                }
                it3 = arrayList.iterator();
                while (true) {
                    rq3Var = null;
                    if (it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (((mj7) obj).a == ev6Var.n) {
                        break;
                    }
                }
                mj7Var = (mj7) obj;
                if (mj7Var == null) {
                    mj7Var = (mj7) CollectionsKt.firstOrNull(arrayList);
                }
                if (mj7Var != null) {
                    do {
                        value = fdiVar.getValue();
                        ((vnb) value).getClass();
                    } while (!fdiVar.k(value, new snb()));
                    return Unit.a;
                }
                b57Var2.r = arrayList;
                b57Var2.s = mj7Var;
                b57Var2.v = 2;
                obj2 = s9a.r(new jk((Serializable) mj7Var, (ltk) this, (Object) this.p, rq3Var, 11), b57Var2);
            }
        }
        b57Var = new b57(this, sq3Var);
        b57 b57Var22 = b57Var;
        Object obj22 = b57Var22.t;
        lu3 lu3Var2 = lu3.a;
        i = b57Var22.v;
        fdi fdiVar2 = this.e;
        ev6 ev6Var2 = this.o;
        if (i != 0) {
        }
        List H02 = CollectionsKt.H0((Iterable) obj22, new v66(16));
        it = H02.iterator();
        i2 = 0;
        while (true) {
            if (it.hasNext()) {
            }
            i2++;
        }
        List subList2 = H02.subList(i2 >= 0 ? i2 : 0, H02.size());
        arrayList = new ArrayList(k13.r(subList2, 10));
        it2 = subList2.iterator();
        while (it2.hasNext()) {
        }
        it3 = arrayList.iterator();
        while (true) {
            rq3Var = null;
            if (it3.hasNext()) {
            }
        }
        mj7Var = (mj7) obj;
        if (mj7Var == null) {
        }
        if (mj7Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(mj7 mj7Var, sq3 sq3Var) {
        c57 c57Var;
        int i;
        e57 e57Var;
        mj7 mj7Var2;
        z47 z47Var;
        mj7 mj7Var3;
        if (sq3Var instanceof c57) {
            c57Var = (c57) sq3Var;
            int i2 = c57Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c57Var.u = i2 - Integer.MIN_VALUE;
                Object obj = c57Var.s;
                lu3 lu3Var = lu3.a;
                i = c57Var.u;
                rq3 rq3Var = null;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    c57Var.r = mj7Var;
                    c57Var.u = 1;
                    e57Var = this;
                    obj = s9a.r(new jk((Serializable) mj7Var, (ltk) e57Var, (Object) this.p, rq3Var, 11), c57Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    mj7Var2 = mj7Var;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mj7Var2 = c57Var.r;
                    y6a.M(obj);
                    e57Var = this;
                }
                Pair pair = (Pair) obj;
                t77 t77Var = (t77) pair.a;
                gv9 gv9Var = (gv9) pair.b;
                z47Var = (z47) e57Var.l().a();
                if (z47Var != null || (mj7Var3 = z47Var.b) == null || mj7Var3.a != mj7Var2.a) {
                    return Unit.a;
                }
                e57Var.n(null, new w47(i3, t77Var, gv9Var));
                return Unit.a;
            }
        }
        c57Var = new c57(this, sq3Var);
        Object obj2 = c57Var.s;
        lu3 lu3Var2 = lu3.a;
        i = c57Var.u;
        rq3 rq3Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        t77 t77Var2 = (t77) pair2.a;
        gv9 gv9Var2 = (gv9) pair2.b;
        z47Var = (z47) e57Var.l().a();
        if (z47Var != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (u(r7, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (t(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r7.Z(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(sq3 sq3Var) {
        d57 d57Var;
        int i;
        vnb l;
        if (sq3Var instanceof d57) {
            d57Var = (d57) sq3Var;
            int i2 = d57Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d57Var.t = i2 - Integer.MIN_VALUE;
                Object obj = d57Var.r;
                Object obj2 = lu3.a;
                i = d57Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    g9i g9iVar = this.q;
                    if (g9iVar != null) {
                        d57Var.t = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        if (i == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                l = l();
                if (l instanceof unb) {
                    d57Var.t = 3;
                } else {
                    mj7 mj7Var = ((z47) ((unb) l).a).b;
                    d57Var.t = 2;
                }
                return obj2;
            }
        }
        d57Var = new d57(this, sq3Var);
        Object obj3 = d57Var.r;
        Object obj22 = lu3.a;
        i = d57Var.t;
        if (i != 0) {
        }
        l = l();
        if (l instanceof unb) {
        }
        return obj22;
    }
}
