package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class r9n extends i7n {
    public final y9n a;
    public y9n b;

    public r9n(y9n y9nVar) {
        this.a = y9nVar;
        if (y9nVar.k()) {
            a70.p("Default instance must be immutable.");
            throw null;
        }
        this.b = y9nVar.m();
    }

    @Override // defpackage.i7n
    /* renamed from: a */
    public final r9n clone() {
        r9n r9nVar = (r9n) this.a.r(5);
        boolean k = this.b.k();
        y9n y9nVar = this.b;
        if (k) {
            y9nVar.getClass();
            gcn.c.a(y9nVar.getClass()).c(y9nVar);
            y9nVar.l();
            y9nVar = this.b;
        }
        r9nVar.b = y9nVar;
        return r9nVar;
    }

    public final void b() {
        if (this.b.k()) {
            return;
        }
        y9n m = this.a.m();
        gcn.c.a(m.getClass()).a(m, this.b);
        this.b = m;
    }

    public final y9n c() {
        boolean k = this.b.k();
        y9n y9nVar = this.b;
        if (k) {
            y9nVar.getClass();
            gcn.c.a(y9nVar.getClass()).c(y9nVar);
            y9nVar.l();
            y9nVar = this.b;
        }
        y9nVar.getClass();
        if (y9n.p(y9nVar, true)) {
            return y9nVar;
        }
        throw new cdn();
    }

    @Override // defpackage.i7n
    public final Object clone() {
        r9n r9nVar = (r9n) this.a.r(5);
        boolean k = this.b.k();
        y9n y9nVar = this.b;
        if (k) {
            y9nVar.getClass();
            gcn.c.a(y9nVar.getClass()).c(y9nVar);
            y9nVar.l();
            y9nVar = this.b;
        }
        r9nVar.b = y9nVar;
        return r9nVar;
    }

    public final void d(y9n y9nVar) {
        y9n y9nVar2 = this.a;
        if (y9nVar2.equals(y9nVar)) {
            return;
        }
        if (!this.b.k()) {
            y9n m = y9nVar2.m();
            gcn.c.a(m.getClass()).a(m, this.b);
            this.b = m;
        }
        y9n y9nVar3 = this.b;
        gcn.c.a(y9nVar3.getClass()).a(y9nVar3, y9nVar);
    }

    public final void e(byte[] bArr, int i, z8n z8nVar) {
        if (!this.b.k()) {
            y9n m = this.a.m();
            gcn.c.a(m.getClass()).a(m, this.b);
            this.b = m;
        }
        try {
            gcn.c.a(this.b.getClass()).f(this.b, bArr, 0, i, new p7n(z8nVar));
        } catch (lan e) {
            throw e;
        } catch (IOException e2) {
            vp2.e("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
