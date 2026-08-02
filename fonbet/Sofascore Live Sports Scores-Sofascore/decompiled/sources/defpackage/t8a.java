package defpackage;

import com.ironsource.U3;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t8a implements e8a {
    public final f8a a;
    public final String b;
    public final ccd c;
    public final wj9 d;
    public final fy2 e;
    public final ScheduledExecutorService f;
    public final b8a g;
    public final x6k h;
    public final ao2 i;
    public final List j;
    public final xx3 k;
    public final q8a l;
    public volatile List m;
    public bj6 n;
    public final jfi o;
    public y3g p;
    public y3g q;
    public asb r;
    public p8a u;
    public volatile p8a v;
    public xei x;
    public final ArrayList s = new ArrayList();
    public final m8a t = new m8a(this, 0);
    public volatile sk3 w = sk3.a(rk3.d);

    public t8a(List list, String str, ccd ccdVar, eh2 eh2Var, ScheduledExecutorService scheduledExecutorService, tmi tmiVar, xx3 xx3Var, wj9 wj9Var, b8a b8aVar, x6k x6kVar, jo2 jo2Var, f8a f8aVar, ao2 ao2Var, ArrayList arrayList) {
        z1a.y(list, "addressGroups");
        z1a.r("addressGroups is empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z1a.y(it.next(), "addressGroups contains null entry");
        }
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.m = unmodifiableList;
        q8a q8aVar = new q8a();
        q8aVar.a = unmodifiableList;
        this.l = q8aVar;
        this.b = str;
        this.c = ccdVar;
        this.e = eh2Var;
        this.f = scheduledExecutorService;
        this.o = (jfi) tmiVar.get();
        this.k = xx3Var;
        this.d = wj9Var;
        this.g = b8aVar;
        this.h = x6kVar;
        z1a.y(jo2Var, "channelTracer");
        z1a.y(f8aVar, "logId");
        this.a = f8aVar;
        z1a.y(ao2Var, "channelLogger");
        this.i = ao2Var;
        this.j = arrayList;
    }

    public static String g(xei xeiVar) {
        StringBuilder sb = new StringBuilder();
        vei veiVar = xeiVar.a;
        Throwable th = xeiVar.c;
        sb.append(veiVar);
        String str = xeiVar.b;
        if (str != null) {
            wt3.A("(", str, sb, ")");
        }
        if (th != null) {
            sb.append(U3.j.d);
            sb.append(th);
            sb.append(U3.j.e);
        }
        return sb.toString();
    }

    @Override // defpackage.e8a
    public final f8a b() {
        return this.a;
    }

    public final void e(rk3 rk3Var) {
        this.k.i();
        f(sk3.a(rk3Var));
    }

    public final void f(sk3 sk3Var) {
        this.k.i();
        if (this.w.a != sk3Var.a) {
            z1a.D("Cannot transition out of SHUTDOWN to " + sk3Var, this.w.a != rk3.e);
            this.w = sk3Var;
            ((efb) this.d.b).a(sk3Var);
        }
    }

    public final void h() {
        SocketAddress socketAddress;
        ki9 ki9Var;
        xx3 xx3Var = this.k;
        xx3Var.i();
        z1a.D("Should have no reconnectTask scheduled", this.p == null);
        q8a q8aVar = this.l;
        if (q8aVar.b == 0 && q8aVar.c == 0) {
            jfi jfiVar = this.o;
            jfiVar.a = false;
            jfiVar.b();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((sp5) q8aVar.a.get(q8aVar.b)).a.get(q8aVar.c);
        if (socketAddress2 instanceof ki9) {
            ki9Var = (ki9) socketAddress2;
            socketAddress = ki9Var.b;
        } else {
            socketAddress = socketAddress2;
            ki9Var = null;
        }
        sm0 sm0Var = ((sp5) q8aVar.a.get(q8aVar.b)).b;
        String str = (String) sm0Var.a.get(sp5.d);
        ey2 ey2Var = new ey2();
        ey2Var.a = "unknown-authority";
        ey2Var.b = sm0.b;
        if (str == null) {
            str = this.b;
        }
        z1a.y(str, "authority");
        ey2Var.a = str;
        ey2Var.b = sm0Var;
        ey2Var.c = ki9Var;
        s8a s8aVar = new s8a();
        s8aVar.u = this.a;
        p8a p8aVar = new p8a(this.e.d0(socketAddress, ey2Var, s8aVar), this.h);
        s8aVar.u = p8aVar.b();
        this.u = p8aVar;
        this.s.add(p8aVar);
        Runnable c = p8aVar.c(new yih(this, p8aVar));
        if (c != null) {
            xx3Var.e(c);
        }
        this.i.E("Started transport {0}", 2, s8aVar.u);
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.c(this.a.c, "logId");
        I.e(this.m, "addressGroups");
        return I.toString();
    }
}
