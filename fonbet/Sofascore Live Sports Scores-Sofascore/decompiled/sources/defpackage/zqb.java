package defpackage;

import android.app.Application;
import com.sofascore.model.wc26.WorldCupRound;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lzqb;", "Lq8;", "sqb", "pqb", "qqb", "oqb", "rqb", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class zqb extends q8 {
    public final LinkedHashMap A;
    public final yzc B;
    public final yzc C;
    public final yzc D;
    public final yzc E;
    public final aeh F;
    public final hof G;
    public final hof H;
    public final zzc I;
    public final zzc J;
    public final zzc K;
    public final zzc L;
    public final zzc M;
    public final zzc N;
    public final zzc O;
    public final zzc P;
    public final zzc Q;
    public final zzc R;
    public final fu3 S;
    public final yzc T;
    public final yzc U;
    public final aeh V;
    public final hof W;
    public final yzc X;
    public final jof Y;
    public g9i Z;
    public boolean a0;
    public ct7 b0;
    public byb c0;
    public final SimpleDateFormat d0;
    public final gzh e;
    public final zzc e0;
    public final vrj f;
    public final zzc f0;
    public final qa6 g;
    public boolean g0;
    public final s96 h;
    public final yzc h0;
    public final ue9 i;
    public final yzc i0;
    public final ith j;
    public final yzc j0;
    public final cg4 k;
    public final yzc k0;
    public final yzc l;
    public final zzc l0;
    public final yzc m;
    public final zzc m0;
    public final yzc n;
    public final lec o;
    public final jof p;
    public final jof q;
    public final jof r;
    public final fdi s;
    public final fu3 t;
    public final yzc u;
    public final yzc v;
    public final lec w;
    public final yzc x;
    public final yzc y;
    public final yzc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqb(Application application, gzh gzhVar, vrj vrjVar, qa6 qa6Var, s96 s96Var, ue9 ue9Var, ith ithVar, cg4 cg4Var, w3b w3bVar, bt7 bt7Var, fqg fqgVar) {
        super(application);
        gzhVar.getClass();
        vrjVar.getClass();
        qa6Var.getClass();
        s96Var.getClass();
        ue9Var.getClass();
        ithVar.getClass();
        cg4Var.getClass();
        w3bVar.getClass();
        fqgVar.getClass();
        this.e = gzhVar;
        this.f = vrjVar;
        this.g = qa6Var;
        this.h = s96Var;
        this.i = ue9Var;
        this.j = ithVar;
        this.k = cg4Var;
        String str = (String) fqgVar.a("sport_name");
        yzc yzcVar = new yzc();
        this.l = yzcVar;
        this.m = yzcVar;
        yzc yzcVar2 = new yzc();
        this.n = yzcVar2;
        this.o = waa.w(yzcVar2);
        int i = 1;
        rq3 rq3Var = null;
        this.p = un0.K(new cz5(cg4Var.f(new e5f("WC_26_MY_TEAM_ALPHA2"), ""), i), un0.z(this), weh.a(2), null);
        zyh zyhVar = gzhVar.a;
        int i2 = 0;
        this.q = un0.K(new wj0(hkg.H(new dzh(zm2.s(zyhVar.a, false, new String[]{"sport_order"}, new z1h(23)), gzhVar, i)), 4), un0.z(this), weh.a(2), new ozh(rlh.b));
        this.r = un0.K(hkg.H(new a76(zm2.s(zyhVar.a, false, new String[]{"sport_order"}, new z1h(25)), 4)), un0.z(this), weh.a(2), null);
        fdi a = gdi.a(Boolean.FALSE);
        this.s = a;
        int i3 = 3;
        this.t = j72.t(hkg.H(new yf4(qa6Var.j(l5i.a()), a, new v24(i3, rq3Var, i), i)));
        this.u = new yzc();
        yzc yzcVar3 = new yzc();
        this.v = yzcVar3;
        this.w = waa.w(yzcVar3);
        yzc yzcVar4 = new yzc();
        this.x = yzcVar4;
        this.y = yzcVar4;
        this.z = new yzc();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A = linkedHashMap;
        yzc yzcVar5 = new yzc(linkedHashMap);
        this.B = yzcVar5;
        this.C = yzcVar5;
        new yzc();
        yzc yzcVar6 = new yzc();
        this.D = yzcVar6;
        this.E = yzcVar6;
        aeh b = beh.b(0, 0, null, 7);
        this.F = b;
        this.G = un0.t(b);
        this.H = un0.t(beh.b(0, 0, null, 7));
        zzc zzcVar = new zzc();
        this.I = zzcVar;
        this.J = zzcVar;
        zzc zzcVar2 = new zzc();
        this.K = zzcVar2;
        this.L = zzcVar2;
        zzc zzcVar3 = new zzc();
        this.M = zzcVar3;
        this.N = zzcVar3;
        zzc zzcVar4 = new zzc();
        this.O = zzcVar4;
        this.P = zzcVar4;
        zzc zzcVar5 = new zzc();
        this.Q = zzcVar5;
        this.R = zzcVar5;
        this.S = j72.t(new a76(zm2.s(w3bVar.a.a, false, new String[]{"pinned_tournaments_table"}, new crj(i3)), 2));
        yzc yzcVar7 = new yzc(km5.a);
        this.T = yzcVar7;
        this.U = yzcVar7;
        aeh b2 = beh.b(0, 0, null, 7);
        this.V = b2;
        this.W = un0.t(b2);
        yzc yzcVar8 = new yzc();
        this.X = yzcVar8;
        rv7.c.getClass();
        this.Y = un0.K(bt7Var.b(270), un0.z(this), weh.a(2), null);
        this.a0 = true;
        this.b0 = ct7.c;
        this.d0 = new SimpleDateFormat("yyyy-MM", Locale.US);
        zzc zzcVar6 = new zzc();
        this.e0 = zzcVar6;
        this.f0 = zzcVar6;
        if (str == null) {
            Calendar calendar = ke0.a;
            str = ke0.b(i());
        }
        Calendar calendar2 = ke0.a;
        ke0.d = str;
        yzcVar2.j(str);
        Application application2 = this.b;
        application2.getClass();
        yzcVar4.j(new sqb(qha.D(application2, str)));
        l(str);
        o(ke0.a);
        yea yeaVar = j58.a;
        if (fn0.B("show_world_cup_calendar")) {
            yea yeaVar2 = j58.a;
            List g = j58.g();
            WorldCupRound worldCupRound = (WorldCupRound) CollectionsKt.firstOrNull(g);
            long startTimestamp = worldCupRound != null ? worldCupRound.getStartTimestamp() : 0L;
            WorldCupRound worldCupRound2 = (WorldCupRound) CollectionsKt.j0(g);
            yzcVar8.j(new rqb(startTimestamp, worldCupRound2 != null ? worldCupRound2.getEndTimestamp() : 0L));
        }
        iz2 z = un0.z(this);
        hs4 hs4Var = z45.a;
        xw3.L(z, hq4.c, null, new va8(this, str, rq3Var, 12), 2);
        xw3.L(un0.z(this), null, null, new uqb(this, rq3Var, i2), 3);
        this.g0 = true;
        yzc yzcVar9 = new yzc();
        this.h0 = yzcVar9;
        this.i0 = yzcVar9;
        yzc yzcVar10 = new yzc();
        this.j0 = yzcVar10;
        this.k0 = yzcVar10;
        zzc zzcVar7 = new zzc();
        this.l0 = zzcVar7;
        this.m0 = zzcVar7;
    }

    public final void k(byb bybVar) {
        bybVar.getClass();
        String str = (String) this.n.d();
        if (str != null) {
            iz2 z = un0.z(this);
            hs4 hs4Var = z45.a;
            xw3.L(z, hq4.c, null, new va8(bybVar, this, str, (rq3) null, 11), 2);
        }
    }

    public final void l(String str) {
        Application application = this.b;
        application.getClass();
        str.getClass();
        this.z.j(new sqb(((Boolean) n9e.x(application, new jp1(str, 15))).booleanValue()));
    }

    public final void m() {
        this.h0.j(Boolean.TRUE);
    }

    public final void n(String str) {
        str.getClass();
        Calendar calendar = ke0.a;
        ke0.d = str;
        Application application = this.b;
        application.getClass();
        this.x.j(new sqb(qha.D(application, str)));
        l(str);
        this.n.j(str);
        LinkedHashMap linkedHashMap = this.A;
        linkedHashMap.clear();
        this.B.k(linkedHashMap);
        o(ke0.a);
        iz2 z = un0.z(this);
        hs4 hs4Var = z45.a;
        rq3 rq3Var = null;
        xw3.L(z, hq4.c, null, new va8(this, str, rq3Var, 12), 2);
        xw3.L(un0.z(this), null, null, new vqb(this, str, rq3Var, 0), 3);
    }

    public final void o(Calendar calendar) {
        calendar.getClass();
        String str = (String) this.n.d();
        if (str != null) {
            xw3.L(un0.z(this), null, null, new h10(this, calendar, str, (rq3) null, 12), 3);
        }
    }
}
