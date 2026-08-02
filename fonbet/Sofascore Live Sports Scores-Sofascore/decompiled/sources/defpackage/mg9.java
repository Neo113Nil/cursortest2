package defpackage;

import java.io.EOFException;
import java.net.ProtocolException;
import java.net.Proxy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class mg9 implements ie6 {
    public static final q89 f;
    public final jod a;
    public final he6 b;
    public final sx2 c;
    public int d;
    public final am0 e;

    static {
        q89 q89Var = q89.b;
        f = ktm.F("OkHttp-Response-Body", "Truncated");
    }

    public mg9(jod jodVar, he6 he6Var, sx2 sx2Var) {
        sx2Var.getClass();
        this.a = jodVar;
        this.b = he6Var;
        this.c = sx2Var;
        this.e = new am0((lof) sx2Var.b);
    }

    @Override // defpackage.ie6
    public final void a() {
        ((kof) this.c.c).flush();
    }

    @Override // defpackage.ie6
    public final ejh b(qzf qzfVar, long j) {
        qzfVar.getClass();
        yzf yzfVar = qzfVar.d;
        if (yzfVar != null && yzfVar.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(qzfVar.c.a("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new ig9(this);
            }
            ilg.e(this.d, "state: ");
            return null;
        }
        if (j == -1) {
            a70.r("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = 2;
            return new hv4(this);
        }
        ilg.e(this.d, "state: ");
        return null;
    }

    @Override // defpackage.ie6
    public final void c(qzf qzfVar) {
        qzfVar.getClass();
        Proxy.Type type = this.b.f().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(qzfVar.b);
        sb.append(' ');
        jl9 jl9Var = qzfVar.a;
        if (jl9Var.f() || type != Proxy.Type.HTTP) {
            String b = jl9Var.b();
            String d = jl9Var.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        } else {
            sb.append(jl9Var);
        }
        sb.append(" HTTP/1.1");
        l(qzfVar.c, sb.toString());
    }

    @Override // defpackage.ie6
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.ie6
    public final cwh d(d2g d2gVar) {
        boolean a = yi9.a(d2gVar);
        qzf qzfVar = d2gVar.a;
        if (!a) {
            return k(qzfVar.a, 0L);
        }
        String a2 = d2gVar.f.a("Transfer-Encoding");
        if (a2 == null) {
            a2 = null;
        }
        if ("chunked".equalsIgnoreCase(a2)) {
            jl9 jl9Var = qzfVar.a;
            if (this.d == 4) {
                this.d = 5;
                return new jg9(this, jl9Var);
            }
            ilg.e(this.d, "state: ");
            return null;
        }
        long e = yol.e(d2gVar);
        if (e != -1) {
            return k(qzfVar.a, e);
        }
        jl9 jl9Var2 = qzfVar.a;
        if (this.d != 4) {
            ilg.e(this.d, "state: ");
            return null;
        }
        this.d = 5;
        this.b.a();
        jl9Var2.getClass();
        return new lg9(this, jl9Var2);
    }

    @Override // defpackage.ie6
    public final boolean e() {
        return this.d == 6;
    }

    @Override // defpackage.ie6
    public final long f(d2g d2gVar) {
        if (!yi9.a(d2gVar)) {
            return 0L;
        }
        String a = d2gVar.f.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        if ("chunked".equalsIgnoreCase(a)) {
            return -1L;
        }
        return yol.e(d2gVar);
    }

    @Override // defpackage.ie6
    public final b2g g(boolean z) {
        am0 am0Var = this.e;
        lof lofVar = (lof) am0Var.c;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            ilg.e(this.d, "state: ");
            return null;
        }
        try {
            String n = lofVar.n(am0Var.b);
            am0Var.b -= n.length();
            b10 D = aba.D(n);
            int i2 = D.b;
            b2g b2gVar = new b2g();
            b2gVar.b = (qff) D.c;
            b2gVar.c = i2;
            b2gVar.d = (String) D.d;
            ef0 ef0Var = new ef0(1);
            while (true) {
                String n2 = lofVar.n(am0Var.b);
                am0Var.b -= n2.length();
                if (n2.length() == 0) {
                    break;
                }
                ef0Var.c(n2);
            }
            b2gVar.f = vha.k(vha.i(ef0Var));
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return b2gVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return b2gVar;
            }
            this.d = 3;
            return b2gVar;
        } catch (EOFException e) {
            cp4.i("unexpected end of stream on ".concat(this.b.f().a.h.h()), e);
            return null;
        }
    }

    @Override // defpackage.ie6
    public final void h() {
        ((kof) this.c.c).flush();
    }

    @Override // defpackage.ie6
    public final ooh i() {
        return this.c;
    }

    @Override // defpackage.ie6
    public final he6 j() {
        return this.b;
    }

    public final kg9 k(jl9 jl9Var, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new kg9(this, jl9Var, j);
        }
        ilg.e(this.d, "state: ");
        return null;
    }

    public final void l(q89 q89Var, String str) {
        if (this.d != 0) {
            ilg.e(this.d, "state: ");
            return;
        }
        sx2 sx2Var = this.c;
        kof kofVar = (kof) sx2Var.c;
        kofVar.S(str);
        kofVar.S("\r\n");
        int size = q89Var.size();
        int i = 0;
        while (true) {
            kof kofVar2 = (kof) sx2Var.c;
            if (i >= size) {
                kofVar2.S("\r\n");
                this.d = 1;
                return;
            } else {
                kofVar2.S(vha.j(q89Var, i));
                kofVar2.S(": ");
                kofVar2.S(vha.l(q89Var, i));
                kofVar2.S("\r\n");
                i++;
            }
        }
    }
}
