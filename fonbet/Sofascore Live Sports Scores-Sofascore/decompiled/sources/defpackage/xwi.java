package defpackage;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.e;
import com.sofascore.model.mvvm.model.Team;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lxwi;", "Lq8;", "uwi", "twi", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class xwi extends q8 {
    public final j0j e;
    public final cg4 f;
    public final Team g;
    public final boolean h;
    public final yzc i;
    public final lec j;
    public final yzc k;
    public final yzc l;
    public final fdi m;
    public final jof n;
    public final fdi o;
    public final jof p;
    public final e1d q;
    public yyi r;
    public g9i s;
    public g9i t;
    public g9i u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwi(Application application, fqg fqgVar, j0j j0jVar, cg4 cg4Var) {
        super(application);
        fqgVar.getClass();
        j0jVar.getClass();
        cg4Var.getClass();
        this.e = j0jVar;
        this.f = cg4Var;
        Object a = fqgVar.a("TEAM");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        Team team = (Team) a;
        this.g = team;
        this.h = tz9.G(ccd.A(team.getId(), i()));
        yzc yzcVar = new yzc();
        this.i = yzcVar;
        this.j = waa.w(yzcVar);
        yzc yzcVar2 = new yzc();
        this.k = yzcVar2;
        this.l = yzcVar2;
        fdi a2 = gdi.a(null);
        this.m = a2;
        this.n = un0.u(a2);
        fdi a3 = gdi.a(null);
        this.o = a3;
        this.p = un0.u(a3);
        this.q = e.f(null);
        this.r = yyi.d;
    }

    public final Object k(YearMonth yearMonth, hoi hoiVar) {
        Object r = s9a.r(new cce(this, yearMonth, (rq3) null, 24), hoiVar);
        return r == lu3.a ? r : Unit.a;
    }

    public final void l() {
        g9i g9iVar = this.t;
        rq3 rq3Var = null;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.t = xw3.L(un0.z(this), null, null, new wwi(this, rq3Var, 0), 3);
    }

    public final void m(YearMonth yearMonth) {
        fdi fdiVar;
        Object value;
        lwi lwiVar;
        Context i;
        int id;
        String sportSlug;
        int p;
        String format;
        rq3 rq3Var;
        yearMonth.getClass();
        do {
            fdiVar = this.o;
            value = fdiVar.getValue();
            lwiVar = (lwi) value;
            i = i();
            Team team = this.g;
            id = team.getId();
            sportSlug = team.getSportSlug();
            p = ug5.p(i);
            LocalDate atDay = yearMonth.atDay(1);
            atDay.getClass();
            bi4 bi4Var = bi4.PATTERN_MMMMY;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            format = atDay.format(hk4.a(bi4Var.d()));
            format.getClass();
            rq3Var = null;
        } while (!fdiVar.k(value, new lwi(yearMonth, format, l6g.W(tba.l(p)), l6g.W(tba.k(i, yearMonth, p, km5.a, id, sportSlug)), true, lwiVar != null ? lwiVar.f : null, lwiVar != null ? lwiVar.g : null)));
        g9i g9iVar = this.u;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.u = xw3.L(un0.z(this), null, null, new vki(this, yearMonth, rq3Var, 9), 3);
    }
}
