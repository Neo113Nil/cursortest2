package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.UniqueTournament;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lla3;", "Lq8;", "ha3", "ia3", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class la3 extends q8 {
    public final bfk e;
    public final vyh f;
    public final vrj g;
    public final w3b h;
    public final dhk i;
    public String j;
    public final fdi k;
    public final jof l;
    public final aeh m;
    public final hof n;
    public final g62 o;
    public final nn2 p;
    public boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la3(Application application, bfk bfkVar, vyh vyhVar, vrj vrjVar, w3b w3bVar, dhk dhkVar) {
        super(application);
        SharedPreferences d;
        bfkVar.getClass();
        vyhVar.getClass();
        vrjVar.getClass();
        w3bVar.getClass();
        dhkVar.getClass();
        this.e = bfkVar;
        this.f = vyhVar;
        this.g = vrjVar;
        this.h = w3bVar;
        this.i = dhkVar;
        this.j = "";
        rq3 rq3Var = null;
        fdi a = gdi.a(new ha3(false, null, km5.a));
        this.k = a;
        this.l = un0.u(a);
        aeh b = beh.b(0, 0, null, 7);
        this.m = b;
        this.n = un0.t(b);
        g62 g = ml4.g(-1, 6, null);
        this.o = g;
        this.p = f5p.J(g);
        Context i = i();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = i.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        this.q = sharedPreferences.getBoolean("PINNED_RESET_DONE_V2", false);
        Calendar calendar = ke0.a;
        String b2 = ke0.b(i());
        irj irjVar = w3bVar.a;
        fcp.m0(new v98(zm2.s(irjVar.a, false, new String[]{"pinned_tournaments_table"}, new dvi(25, b2, irjVar)), new r1(this, rq3Var, 10), 3), un0.z(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [ba3] */
    /* JADX WARN: Type inference failed for: r5v7, types: [ba3] */
    public static w93 k(w93 w93Var, int i, boolean z) {
        ArrayList arrayList = w93Var.c;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        for (?? r5 : arrayList) {
            if (r5 instanceof ba3) {
                r5 = (ba3) r5;
                if (r5.a == i) {
                    r5 = ba3.a(r5, !z);
                }
            } else if (r5 instanceof x93) {
                x93 x93Var = (x93) r5;
                ArrayList arrayList3 = x93Var.d;
                ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                for (Object obj : arrayList3) {
                    if (obj instanceof ba3) {
                        ba3 ba3Var = (ba3) obj;
                        if (ba3Var.a == i) {
                            obj = ba3.a(ba3Var, !z);
                        }
                    }
                    arrayList4.add(obj);
                }
                r5 = new x93(x93Var.b, x93Var.c, new ArrayList(arrayList4), x93Var.e, x93Var.f, x93Var.g);
            }
            arrayList2.add(r5);
        }
        ArrayList arrayList5 = new ArrayList(arrayList2);
        Category category = w93Var.b;
        boolean z2 = w93Var.d;
        int i2 = w93Var.e;
        int i3 = w93Var.f;
        category.getClass();
        return new w93(category, arrayList5, z2, i2, i3);
    }

    public static ba3 l(UniqueTournament uniqueTournament, Set set, boolean z) {
        int id = uniqueTournament.getId();
        String x = tba.x(uniqueTournament);
        if (x == null) {
            x = "";
        }
        return new ba3(id, x, set.contains(Integer.valueOf(uniqueTournament.getId())), uniqueTournament.getIsActive(), z);
    }
}
