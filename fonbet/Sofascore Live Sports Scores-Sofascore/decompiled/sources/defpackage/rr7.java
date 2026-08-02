package defpackage;

import android.app.Application;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrr7;", "Lj31;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class rr7 extends j31 {
    public final j0j i;
    public final wve j;
    public final w3b k;
    public final ct7 l;
    public final fdi m;
    public final fdi n;
    public final fu3 o;
    public final fu3 p;
    public final fdi q;
    public final jof r;
    public final z88 s;
    public final z88 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr7(Application application, j0j j0jVar, wve wveVar, w3b w3bVar, gzh gzhVar, fqg fqgVar) {
        super(application, gzhVar);
        fu3 t;
        j0jVar.getClass();
        wveVar.getClass();
        w3bVar.getClass();
        gzhVar.getClass();
        fqgVar.getClass();
        this.i = j0jVar;
        this.j = wveVar;
        this.k = w3bVar;
        ct7 ct7Var = (ct7) fqgVar.a("FAVORITES_TAB_TYPE");
        this.l = ct7Var;
        this.m = gdi.a("");
        fdi a = gdi.a(Boolean.FALSE);
        this.n = a;
        int i = 2;
        rq3 rq3Var = null;
        zn2 a2 = la8.a(new sj3(a, i), new lr7(0, rq3Var, this));
        hs4 hs4Var = z45.a;
        this.o = j72.t(hkg.H(k53.g0(a2, hs4Var)));
        int i2 = ct7Var == null ? -1 : ar7.a[ct7Var.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            t = j72.t(hkg.H(new a76(zm2.s(j0jVar.a.a, false, new String[]{"my_teams", "teams"}, new rfi(18)), 6)));
        } else if (i2 != 2) {
            t = i2 != 3 ? null : j72.t(hkg.H(new a76(zm2.s(w3bVar.a.a, false, new String[]{"leagues"}, new crj(i)), 3)));
        } else {
            t = j72.t(hkg.H(wveVar.f()));
        }
        this.p = t;
        fdi a3 = gdi.a(yq7.c);
        this.q = a3;
        this.r = un0.u(a3);
        this.s = k53.g0(dy0.q(a3, j0jVar.d(), j0jVar.h(), wveVar.g(), w3bVar.l(), new dr7(this, null)), hs4Var);
        this.t = k53.g0(la8.a(a3, new lr7(i3, rq3Var, this)), hs4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0131, code lost:
    
        if (r15 != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m(List list, List list2, String str, sq3 sq3Var) {
        gr7 gr7Var;
        int i;
        av4 t;
        Object w;
        HashSet hashSet;
        HashSet hashSet2;
        ArrayList arrayList;
        Iterator it;
        String sportSlug;
        Sport sport;
        String slug;
        String slug2;
        if (sq3Var instanceof gr7) {
            gr7Var = (gr7) sq3Var;
            int i2 = gr7Var.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gr7Var.z = i2 - Integer.MIN_VALUE;
                Object obj = gr7Var.x;
                lu3 lu3Var = lu3.a;
                i = gr7Var.z;
                int i3 = 1;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    t = xw3.t(un0.z(this), null, new hr7(this, str, rq3Var, i3), 3);
                    av4 t2 = xw3.t(un0.z(this), null, new hr7(this, str, rq3Var, 0), 3);
                    ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        w1l.A(arrayList2, ((Team) it2.next()).getId());
                    }
                    HashSet Q0 = CollectionsKt.Q0(arrayList2);
                    ArrayList arrayList3 = new ArrayList(k13.r(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        w1l.A(arrayList3, ((Player) it3.next()).getId());
                    }
                    HashSet Q02 = CollectionsKt.Q0(arrayList3);
                    gr7Var.r = str;
                    gr7Var.s = t;
                    gr7Var.t = Q0;
                    gr7Var.u = Q02;
                    gr7Var.z = 1;
                    w = t2.w(gr7Var);
                    lu3 lu3Var2 = lu3.a;
                    if (w != lu3Var) {
                        hashSet = Q0;
                        hashSet2 = Q02;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = gr7Var.w;
                    arrayList = gr7Var.v;
                    hashSet = gr7Var.t;
                    str = gr7Var.r;
                    y6a.M(obj);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : (Iterable) obj) {
                        if (!hashSet.contains(new Integer(((Team) obj2).getId()))) {
                            arrayList4.add(obj2);
                        }
                    }
                    this.getClass();
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        Team team = (Team) next;
                        Sport sport2 = team.getSport();
                        if (sport2 != null && (slug2 = sport2.getSlug()) != null && Sports.INSTANCE.getEntries().contains(slug2) && (wyh.e(slug2) || slug2.equals(Sports.MMA) || wyh.m(slug2))) {
                            if (team.getType() == 1) {
                                arrayList5.add(next);
                            }
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        Object next2 = it5.next();
                        Team team2 = (Team) next2;
                        if (str == null || ((sport = team2.getSport()) != null && (slug = sport.getSlug()) != null && j31.k(slug, str))) {
                            arrayList6.add(next2);
                        }
                    }
                    return CollectionsKt.w0(arrayList6, arrayList);
                }
                hashSet2 = gr7Var.u;
                hashSet = gr7Var.t;
                av4 av4Var = gr7Var.s;
                String str2 = gr7Var.r;
                y6a.M(obj);
                t = av4Var;
                str = str2;
                w = obj;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : (Iterable) w) {
                    if (!hashSet2.contains(new Integer(((Player) obj3).getId()))) {
                        arrayList7.add(obj3);
                    }
                }
                arrayList = new ArrayList();
                it = arrayList7.iterator();
                while (it.hasNext()) {
                    Object next3 = it.next();
                    Player player = (Player) next3;
                    if (str == null || ((sportSlug = player.getSportSlug()) != null && j31.k(sportSlug, str))) {
                        arrayList.add(next3);
                    }
                }
                gr7Var.r = str;
                gr7Var.s = null;
                gr7Var.t = hashSet;
                gr7Var.u = null;
                gr7Var.v = arrayList;
                gr7Var.w = this;
                gr7Var.z = 2;
                obj = t.T(gr7Var);
            }
        }
        gr7Var = new gr7(this, sq3Var);
        Object obj4 = gr7Var.x;
        lu3 lu3Var3 = lu3.a;
        i = gr7Var.z;
        int i32 = 1;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        ArrayList arrayList72 = new ArrayList();
        while (r2.hasNext()) {
        }
        arrayList = new ArrayList();
        it = arrayList72.iterator();
        while (it.hasNext()) {
        }
        gr7Var.r = str;
        gr7Var.s = null;
        gr7Var.t = hashSet;
        gr7Var.u = null;
        gr7Var.v = arrayList;
        gr7Var.w = this;
        gr7Var.z = 2;
        obj4 = t.T(gr7Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(List list, String str, sq3 sq3Var) {
        ir7 ir7Var;
        int i;
        HashSet hashSet;
        String str2;
        rr7 rr7Var;
        Iterable iterable;
        if (sq3Var instanceof ir7) {
            ir7Var = (ir7) sq3Var;
            int i2 = ir7Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ir7Var.w = i2 - Integer.MIN_VALUE;
                Object obj = ir7Var.u;
                lu3 lu3Var = lu3.a;
                i = ir7Var.w;
                if (i != 0) {
                    y6a.M(obj);
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        w1l.A(arrayList, ((Team) it.next()).getId());
                    }
                    HashSet Q0 = CollectionsKt.Q0(arrayList);
                    ir7Var.r = str;
                    ir7Var.s = Q0;
                    ir7Var.t = this;
                    ir7Var.w = 1;
                    j0j j0jVar = this.i;
                    j0jVar.getClass();
                    obj = yaa.P(new yw(str, j0jVar, this.f, null, 16), ir7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    hashSet = Q0;
                    str2 = str;
                    rr7Var = this;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rr7Var = ir7Var.t;
                    hashSet = ir7Var.s;
                    str2 = ir7Var.r;
                    y6a.M(obj);
                }
                iterable = (List) yaa.x((x2g) obj);
                if (iterable == null) {
                    iterable = km5.a;
                }
                d38 h = i5h.h(CollectionsKt.N(iterable), new zq7(hashSet, 0));
                rr7Var.getClass();
                return i5h.q(i5h.g(i5h.g(h, new dt(rr7Var)), new jp1(str2, this)));
            }
        }
        ir7Var = new ir7(this, sq3Var);
        Object obj2 = ir7Var.u;
        lu3 lu3Var2 = lu3.a;
        i = ir7Var.w;
        if (i != 0) {
        }
        iterable = (List) yaa.x((x2g) obj2);
        if (iterable == null) {
        }
        d38 h2 = i5h.h(CollectionsKt.N(iterable), new zq7(hashSet, 0));
        rr7Var.getClass();
        return i5h.q(i5h.g(i5h.g(h2, new dt(rr7Var)), new jp1(str2, this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[LOOP:0: B:11:0x0057->B:13:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable o(List list, String str, sq3 sq3Var) {
        jr7 jr7Var;
        int i;
        Iterator it;
        Iterator it2;
        if (sq3Var instanceof jr7) {
            jr7Var = (jr7) sq3Var;
            int i2 = jr7Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jr7Var.v = i2 - Integer.MIN_VALUE;
                Object obj = jr7Var.t;
                lu3 lu3Var = lu3.a;
                i = jr7Var.v;
                if (i != 0) {
                    y6a.M(obj);
                    jr7Var.r = list;
                    jr7Var.s = str;
                    jr7Var.v = 1;
                    obj = this.k.G0(this.f, str, jr7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = jr7Var.s;
                    list = jr7Var.r;
                    y6a.M(obj);
                }
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    w1l.A(arrayList, ((UniqueTournament) it.next()).getId());
                }
                HashSet Q0 = CollectionsKt.Q0(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (!Q0.contains(new Integer(((UniqueTournament) obj2).getId()))) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (str != null ? j31.k(((UniqueTournament) next).getSportSlug(), str) : true) {
                        arrayList3.add(next);
                    }
                }
                return arrayList3;
            }
        }
        jr7Var = new jr7(this, sq3Var);
        Object obj3 = jr7Var.t;
        lu3 lu3Var2 = lu3.a;
        i = jr7Var.v;
        if (i != 0) {
        }
        List list22 = (List) obj3;
        ArrayList arrayList4 = new ArrayList(k13.r(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
        }
        HashSet Q02 = CollectionsKt.Q0(arrayList4);
        ArrayList arrayList22 = new ArrayList();
        while (r7.hasNext()) {
        }
        ArrayList arrayList32 = new ArrayList();
        it2 = arrayList22.iterator();
        while (it2.hasNext()) {
        }
        return arrayList32;
    }
}
