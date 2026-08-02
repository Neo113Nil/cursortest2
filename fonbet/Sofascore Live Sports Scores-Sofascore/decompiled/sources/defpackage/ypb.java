package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.local_persistance.UserAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lypb;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ypb extends q8 {
    public final bfk e;
    public final cg4 f;
    public final ru6 g;
    public final wi7 h;
    public final fdi i;
    public final jof j;
    public final aeh k;
    public final hof l;
    public final fdi m;
    public final jof n;
    public final fdi o;
    public final jof p;
    public final String q;
    public g9i r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypb(Application application, bfk bfkVar, cg4 cg4Var, ru6 ru6Var, wi7 wi7Var) {
        super(application);
        SharedPreferences d;
        bfkVar.getClass();
        cg4Var.getClass();
        ru6Var.getClass();
        wi7Var.getClass();
        this.e = bfkVar;
        this.f = cg4Var;
        this.g = ru6Var;
        this.h = wi7Var;
        UserAccount b = bfkVar.b();
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
        fdi a = gdi.a(!sharedPreferences.getBoolean("PREF_HAS_FANTASY_MIN_VERSION", false) ? rpb.a : b.getFantasyUser() ? opb.a : new spb(b.getIsLoggedIn()));
        this.i = a;
        this.j = un0.u(a);
        aeh b2 = beh.b(0, 0, null, 7);
        this.k = b2;
        this.l = un0.t(b2);
        Boolean bool = Boolean.FALSE;
        fdi a2 = gdi.a(bool);
        this.m = a2;
        this.n = un0.u(a2);
        fdi a3 = gdi.a(bool);
        this.o = a3;
        this.p = un0.u(a3);
        this.q = dv3.c();
    }

    public static void m(ypb ypbVar, Function1 function1) {
        Object value;
        tpb tpbVar;
        fdi fdiVar = ypbVar.i;
        do {
            value = fdiVar.getValue();
            tpbVar = (tpb) value;
            ppb ppbVar = tpbVar instanceof ppb ? (ppb) tpbVar : null;
            ppb ppbVar2 = ppbVar != null ? ppbVar : null;
            if (ppbVar2 != null) {
                tpbVar = (tpb) function1.invoke(ppbVar2);
            }
        } while (!fdiVar.k(value, tpbVar));
    }

    public final void k() {
        Object value;
        UserAccount b;
        SharedPreferences sharedPreferences;
        SharedPreferences d;
        g9i g9iVar = this.r;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        fdi fdiVar = this.i;
        do {
            value = fdiVar.getValue();
            b = this.e.b();
            Context i = i();
            sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = i.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
        } while (!fdiVar.k(value, !sharedPreferences.getBoolean("PREF_HAS_FANTASY_MIN_VERSION", false) ? rpb.a : b.getFantasyUser() ? opb.a : new spb(b.getIsLoggedIn())));
    }

    public final Object l(hoi hoiVar) {
        hs4 hs4Var = z45.a;
        Object R = xw3.R(hq4.c, new qj7(this, null), hoiVar);
        return R == lu3.a ? R : Unit.a;
    }
}
