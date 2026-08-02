package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.Country;
import com.sofascore.model.database.MediaReactionType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmy7;", "Lltk;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class my7 extends ltk {
    public final m7c b;
    public final u8c c;
    public final qw7 d;
    public final ith e;
    public final Context f;
    public final fdi g;
    public final jof h;
    public final g62 i;
    public final nn2 j;
    public final koh k;
    public final fdi l;
    public final fdi m;
    public final jof n;
    public final aeh o;
    public final hof p;

    public my7(m7c m7cVar, u8c u8cVar, qw7 qw7Var, ith ithVar, SharedPreferences sharedPreferences, Context context) {
        m7cVar.getClass();
        u8cVar.getClass();
        qw7Var.getClass();
        ithVar.getClass();
        sharedPreferences.getClass();
        this.b = m7cVar;
        this.c = u8cVar;
        this.d = qw7Var;
        this.e = ithVar;
        this.f = context;
        fdi a = gdi.a(rm5.a);
        this.g = a;
        this.h = un0.u(a);
        int i = 0;
        rq3 rq3Var = null;
        g62 g = ml4.g(0, 7, null);
        this.i = g;
        this.j = f5p.J(g);
        this.k = new koh();
        this.l = gdi.a(jca.E(context));
        ArrayList arrayList = dv3.a;
        String d = dv3.d(Integer.valueOf(ke0.c));
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences2 = a5f.d(applicationContext);
                uic.j = sharedPreferences2;
            }
            sharedPreferences2.getClass();
        }
        boolean z = sharedPreferences2.getBoolean("media_show_welcome", true);
        boolean V = jca.V(context);
        boolean U = jca.U(context);
        yea yeaVar = j58.a;
        boolean B = fn0.B("is_feed_under_maintenance");
        k6c E = jca.E(context);
        String string = sharedPreferences.getString("PREF_FEED_COUNTRY", d);
        String str = string == null ? d : string;
        kp5 kp5Var = k6c.h;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : kp5Var) {
            if (((k6c) obj) == k6c.f) {
                yea yeaVar2 = j58.a;
                if (fn0.B("should_show_feed_national_filter")) {
                    Country e = dv3.e();
                    if ((e != null ? e.getIso2Alpha() : null) != null) {
                    }
                }
            }
            arrayList2.add(obj);
        }
        fdi a2 = gdi.a(new dy7(false, z, V, U, B, E, l6g.W(arrayList2), str, false, null));
        this.m = a2;
        this.n = un0.u(a2);
        aeh b = beh.b(0, 0, null, 7);
        this.o = b;
        z88[] z88VarArr = {this.l, b};
        int i2 = la8.a;
        this.p = pco.w(la8.a(new sn2(new nh0(z88VarArr, i), g.a, -2, a62.a, 1), new tl(rq3Var, this, 10)), un0.z(this));
    }

    public final void f(int i, boolean z) {
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i);
        koh kohVar = this.k;
        x43 x43Var = (x43) kohVar.get(valueOf2);
        kohVar.put(valueOf, x43Var != null ? x43.a(x43Var, null, 0, 0, Boolean.valueOf(z), 15) : new x43((MediaReactionType) null, 0, 0, Boolean.valueOf(z), 15));
    }

    public final void g() {
        Object value;
        fdi fdiVar = this.m;
        do {
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, dy7.a((dy7) value, false, false, null, null, false, null, 1015)));
        Context context = this.f;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "PRIMARY_TAB_PROMPT_DISMISSED", true);
        Unit unit = Unit.a;
        i.apply();
    }

    public final void h() {
        fdi fdiVar;
        Object value;
        do {
            fdiVar = this.m;
            value = fdiVar.getValue();
            yea yeaVar = j58.a;
        } while (!fdiVar.k(value, dy7.a((dy7) value, false, fn0.B("is_feed_under_maintenance"), null, null, false, null, 1007)));
        this.d.a((k6c) this.l.getValue());
        xw3.L(un0.z(this), null, null, new ky7(this, null, 0), 3);
    }
}
