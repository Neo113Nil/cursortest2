package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lmuj;", "Lynb;", "Lcuj;", "Lmtj;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class muj extends ynb {
    public final vtj l;
    public final int m;
    public final int n;
    public final String o;
    public final String p;
    public final String q;
    public final Integer r;
    public final Integer s;
    public final LinkedHashMap t;
    public g9i u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public muj(Application application, fqg fqgVar, d4a d4aVar) {
        super(application, tnb.a);
        fqgVar.getClass();
        Object a = fqgVar.a("tracker_type");
        rq3 rq3Var = null;
        if (a == null) {
            a70.p("Required value was null.");
            throw null;
        }
        juj valueOf = juj.valueOf((String) a);
        valueOf.getClass();
        vtj vtjVar = (vtj) ((awf) d4aVar.b).get(valueOf);
        if (vtjVar == null) {
            cp4.g(valueOf, "No TrackerDataProvider registered for type: ");
            throw null;
        }
        this.l = vtjVar;
        Object a2 = fqgVar.a("uniqueTournamentId");
        if (a2 == null) {
            a70.p("Required value was null.");
            throw null;
        }
        this.m = ((Number) a2).intValue();
        Object a3 = fqgVar.a("seasonId");
        if (a3 == null) {
            a70.p("Required value was null.");
            throw null;
        }
        this.n = ((Number) a3).intValue();
        String str = (String) fqgVar.a("seasonYear");
        this.o = str == null ? "" : str;
        String str2 = (String) fqgVar.a("leagueName");
        this.p = str2 == null ? "" : str2;
        String str3 = (String) fqgVar.a("sportSlug");
        this.q = str3 != null ? str3 : "";
        this.r = (Integer) fqgVar.a("teamId1");
        this.s = (Integer) fqgVar.a("teamId2");
        this.t = new LinkedHashMap();
        xw3.L(un0.z(this), null, null, new kuj(this, rq3Var, 0), 3);
    }

    public static void v(muj mujVar) {
        Integer valueOf;
        cuj cujVar = (cuj) mujVar.l().a();
        if (cujVar == null || (valueOf = cujVar.e) == null) {
            cuj cujVar2 = (cuj) mujVar.l().a();
            valueOf = cujVar2 != null ? Integer.valueOf(cujVar2.d.size()) : null;
        }
        mujVar.u(valueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r2 == null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [k0j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gv9 t(List list, Integer num, int i, List list2) {
        huj hujVar;
        huj hujVar2;
        huj hujVar3;
        gv9 gv9Var;
        tee teeVar;
        gv9 gv9Var2;
        gv9 gv9Var3;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num2 = (Integer) it.next();
            Integer num3 = null;
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue == 241802) {
                    hujVar3 = huj.c;
                } else if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            hujVar2 = 0;
                            break;
                        }
                        hujVar2 = it2.next();
                        if (((huj) hujVar2).a == intValue) {
                            break;
                        }
                    }
                    hujVar3 = hujVar2;
                } else {
                    hujVar = null;
                    xtj xtjVar = (xtj) this.t.get(Integer.valueOf(intValue));
                    if (hujVar != null) {
                        gv9 W = (xtjVar == null || (gv9Var3 = xtjVar.a) == null) ? null : l6g.W(gv9Var3);
                        if (num != null) {
                            int intValue2 = num.intValue();
                            if (xtjVar != null && (gv9Var2 = xtjVar.a) != null) {
                                num3 = (Integer) CollectionsKt.a0(intValue2 - 1, gv9Var2);
                            }
                        }
                        Integer num4 = num3;
                        if (num != null) {
                            int intValue3 = num.intValue();
                            if (xtjVar == null || (teeVar = xtjVar.b) == null || (gv9Var = (gv9) teeVar.get(Integer.valueOf(intValue3))) == null) {
                                gv9Var = rlh.b;
                            }
                        }
                        gv9Var = rlh.b;
                        num3 = new k0j(hujVar, W, num4, gv9Var, this.l.getConfig().a && xtjVar != null && xtjVar.a.size() < i);
                    }
                }
                hujVar = hujVar3;
                xtj xtjVar2 = (xtj) this.t.get(Integer.valueOf(intValue));
                if (hujVar != null) {
                }
            }
            if (num3 != null) {
                arrayList.add(num3);
            }
        }
        return l6g.W(arrayList);
    }

    public final void u(Integer num) {
        cuj cujVar = (cuj) l().a();
        if (cujVar == null) {
            return;
        }
        gv9 gv9Var = cujVar.d;
        int size = gv9Var.size();
        n(null, new xi(num, num != null ? (auj) CollectionsKt.a0(num.intValue() - 1, gv9Var) : null, t(cujVar.j, num, size, cujVar.i), this, size));
    }
}
