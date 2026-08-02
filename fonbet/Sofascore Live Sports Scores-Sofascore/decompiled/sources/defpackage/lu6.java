package defpackage;

import com.sofascore.model.fantasy.FantasyUserSquad;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementLocation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lu6 extends hoi implements Function2 {
    public final /* synthetic */ ho7 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ gv9 C;
    public final /* synthetic */ gv9 D;
    public final /* synthetic */ gv9 E;
    public final /* synthetic */ gv9 F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ u77 I;
    public final /* synthetic */ rx6 J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ pu6 r;
    public final /* synthetic */ List s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ ho7 w;
    public final /* synthetic */ FantasyUserSquad x;
    public final /* synthetic */ List y;
    public final /* synthetic */ do7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu6(pu6 pu6Var, List list, boolean z, boolean z2, boolean z3, ho7 ho7Var, FantasyUserSquad fantasyUserSquad, List list2, do7 do7Var, ho7 ho7Var2, boolean z4, gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, gv9 gv9Var4, boolean z5, boolean z6, u77 u77Var, rx6 rx6Var, boolean z7, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = pu6Var;
        this.s = list;
        this.t = z;
        this.u = z2;
        this.v = z3;
        this.w = ho7Var;
        this.x = fantasyUserSquad;
        this.y = list2;
        this.z = do7Var;
        this.A = ho7Var2;
        this.B = z4;
        this.C = gv9Var;
        this.D = gv9Var2;
        this.E = gv9Var3;
        this.F = gv9Var4;
        this.G = z5;
        this.H = z6;
        this.I = u77Var;
        this.J = rx6Var;
        this.K = z7;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new lu6(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lu6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        pu6 pu6Var = this.r;
        hu6 l = pu6Var.l();
        uj7 uj7Var = uj7.c;
        gv9 W = l6g.W(this.s);
        boolean z = this.t;
        boolean z2 = z && this.u;
        boolean z3 = z && this.v;
        boolean z4 = z && !this.w.a.d();
        FantasyUserSquad fantasyUserSquad = this.x;
        Double d = fantasyUserSquad != null ? new Double(fantasyUserSquad.getRemainingBudget()) : null;
        List list = this.y;
        gv9 W2 = list != null ? l6g.W(list) : null;
        FantasyRemoteAnnouncement B = rfo.B(j58.e(), FantasyRemoteAnnouncementLocation.MY_TEAM, Integer.valueOf(pu6Var.m().c.c), dv3.c(), pu6Var.i);
        vl7 vl7Var = pu6Var.l().o;
        boolean z5 = this.K;
        if (z5) {
            vl7Var = null;
        }
        ho7 ho7Var = this.A;
        do7 do7Var = this.z;
        if (vl7Var == null) {
            vl7Var = pu6.y(do7Var.c, ho7Var, do7Var.k);
        }
        vl7 vl7Var2 = vl7Var;
        vl7 vl7Var3 = pu6Var.l().p;
        if (z5) {
            vl7Var3 = null;
        }
        boolean z6 = this.B;
        if (vl7Var3 == null) {
            vl7Var3 = pu6.o(do7Var.c, ho7Var, z6, do7Var.j);
        }
        vl7 vl7Var4 = vl7Var3;
        vl7 vl7Var5 = z5 ? null : pu6Var.l().q;
        if (vl7Var5 == null) {
            vl7Var5 = pu6.t(do7Var.c, ho7Var, z6, do7Var.i);
        }
        pu6Var.x(hu6.a(l, uj7Var, this.z, this.A, this.C, this.D, W, this.E, this.F, d, z2, z3, Boolean.valueOf(this.G), this.H, z4, vl7Var2, vl7Var4, vl7Var5, false, false, this.I, W2, this.J, B, null, 8781824));
        return Unit.a;
    }
}
