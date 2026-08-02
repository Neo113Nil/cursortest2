package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h68 implements jwc {
    public boolean a;
    public long b;
    public int c;
    public Object d;
    public Object e;

    @Override // defpackage.jwc
    public boolean a(long j, ilg ilgVar) {
        lcj lcjVar = (lcj) this.e;
        cej cejVar = lcjVar.b;
        jwj jwjVar = lcjVar.a;
        aej c = cejVar.c();
        if (!lcjVar.i || c == null || jwjVar.d().c.length() == 0) {
            return false;
        }
        if (pej.c(jwjVar.d().d, d(j, ilgVar, c, false))) {
            return true;
        }
        this.a = false;
        return true;
    }

    @Override // defpackage.jwc
    public void b() {
        lcj lcjVar = (lcj) this.e;
        ((eoh) lcjVar.q).setValue(acj.a);
        if (this.a) {
            lcjVar.r();
        }
    }

    @Override // defpackage.jwc
    public boolean c(long j, ilg ilgVar, int i) {
        lcj lcjVar = (lcj) this.e;
        aej c = lcjVar.b.c();
        if (!lcjVar.i || c == null || lcjVar.a.d().c.length() == 0) {
            return false;
        }
        this.a = i >= 2;
        ((eoh) lcjVar.q).setValue(acj.c);
        ((deh) this.d).invoke();
        lcjVar.v = -1;
        this.c = -1;
        this.b = j;
        this.c = (int) (d(j, ilgVar, c, true) >> 32);
        return true;
    }

    public long d(long j, ilg ilgVar, aej aejVar, boolean z) {
        lcj lcjVar = (lcj) this.e;
        int length = aejVar.a.a.b.length();
        int i = this.c;
        if (i < 0 || i > length) {
            i = lcjVar.b.d(this.b, false);
        }
        int i2 = i;
        long B = lcjVar.B(lcjVar.a.d(), i2, lcjVar.b.d(j, false), false, ilgVar, false, z, null);
        if (this.c == -1 && !pej.d(B)) {
            this.c = (int) (B >> 32);
        }
        if (pej.h(B)) {
            B = t6a.g((int) (4294967295L & B), (int) (B >> 32));
        }
        lcjVar.a.j(B);
        lcjVar.x(gfj.c);
        return B;
    }

    @Override // defpackage.jwc
    public boolean e(long j) {
        return true;
    }

    @Override // defpackage.jwc
    public boolean g(long j) {
        lcj lcjVar = (lcj) this.e;
        aej c = lcjVar.b.c();
        if (!lcjVar.i || c == null || lcjVar.a.d().c.length() == 0) {
            return false;
        }
        this.a = false;
        ((deh) this.d).invoke();
        d(j, k03.f, c, false);
        return true;
    }
}
