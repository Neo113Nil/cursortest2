package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bcj implements b9j {
    public final deh a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public long d = 0;
    public k69 e = k69.c;
    public boolean f = true;
    public ilg g = k03.f;
    public final /* synthetic */ lcj h;

    public bcj(lcj lcjVar, deh dehVar) {
        this.h = lcjVar;
        this.a = dehVar;
    }

    @Override // defpackage.b9j
    public final void a(long j, ilg ilgVar) {
        lcj lcjVar = this.h;
        boolean z = lcjVar.i;
        jwj jwjVar = lcjVar.a;
        cej cejVar = lcjVar.b;
        if (z) {
            lcjVar.A(this.e, j);
            lcjVar.w(false);
            ((eoh) lcjVar.q).setValue(acj.b);
            this.c = j;
            this.d = 0L;
            lcjVar.v = -1;
            this.f = true;
            this.g = ilgVar;
            if (cejVar.c() == null) {
                return;
            }
            if (cejVar.f(j)) {
                if (jwjVar.d().c.length() == 0) {
                    return;
                }
                int d = cejVar.d(j, true);
                long B = lcjVar.B(new m9j(lcjVar.a.d(), pej.b, null, null, null, null, 60), d, d, false, this.g, false, false, new a79(0));
                jwjVar.j(B);
                lcjVar.x(gfj.c);
                this.b = (int) (B >> 32);
                return;
            }
            int d2 = cejVar.d(j, true);
            z69 z69Var = lcjVar.j;
            if (z69Var != null) {
                ((kie) z69Var).a(0);
            }
            jwjVar.getClass();
            jwjVar.j(t6a.g(d2, d2));
            lcjVar.w(true);
            this.f = false;
            lcjVar.x(gfj.b);
        }
    }

    @Override // defpackage.b9j
    public final void d(long j) {
        int intValue;
        int d;
        ilg ilgVar;
        q80 q80Var;
        lcj lcjVar = this.h;
        boolean z = lcjVar.i;
        jwj jwjVar = lcjVar.a;
        cej cejVar = lcjVar.b;
        if (!z || cejVar.c() == null || jwjVar.d().c.length() == 0) {
            return;
        }
        long i = dnd.i(this.d, j);
        this.d = i;
        long i2 = dnd.i(this.c, i);
        if (this.b >= 0 || cejVar.f(i2)) {
            aej c = cejVar.c();
            int length = (c == null || (q80Var = c.a.a) == null) ? 0 : q80Var.b.length();
            int i3 = this.b;
            Integer valueOf = Integer.valueOf(i3);
            if (i3 < 0 || i3 > length) {
                valueOf = null;
            }
            intValue = valueOf != null ? valueOf.intValue() : cejVar.d(this.c, false);
            d = cejVar.d(i2, false);
            if (this.b < 0 && intValue == d) {
                return;
            }
            ilgVar = this.g;
            lcjVar.x(gfj.c);
        } else {
            intValue = cejVar.d(this.c, true);
            d = cejVar.d(i2, true);
            ilgVar = intValue == d ? k03.f : this.g;
        }
        ilg ilgVar2 = ilgVar;
        int i4 = intValue;
        int i5 = d;
        long j2 = jwjVar.d().d;
        long B = lcjVar.B(lcjVar.a.d(), i4, i5, false, ilgVar2, false, false, new a79(9));
        if (this.b == -1 && !pej.d(B)) {
            this.b = (int) (B >> 32);
        }
        if (pej.h(B)) {
            B = t6a.g((int) (B & 4294967295L), (int) (B >> 32));
        }
        if (!pej.c(B, j2)) {
            int i6 = (int) (B >> 32);
            int i7 = (int) (j2 >> 32);
            this.e = (i6 == i7 || ((int) (B & 4294967295L)) != ((int) (j2 & 4294967295L))) ? (i6 != i7 || ((int) (B & 4294967295L)) == ((int) (j2 & 4294967295L))) ? ((float) (i6 + ((int) (B & 4294967295L)))) / 2.0f > ((float) (i7 + ((int) (j2 & 4294967295L)))) / 2.0f ? k69.c : k69.b : k69.c : k69.b;
            this.f = false;
        }
        if (pej.d(j2) || !pej.d(B)) {
            jwjVar.j(B);
        }
        lcjVar.A(this.e, i2);
    }

    public final void e() {
        if ((this.c & 9223372034707292159L) != 9205357640488583168L) {
            lcj lcjVar = this.h;
            lcjVar.b();
            this.b = -1;
            this.c = 9205357640488583168L;
            this.d = 0L;
            lcjVar.v = -1;
            this.g = k03.f;
            ((eoh) lcjVar.q).setValue(acj.a);
            this.a.invoke();
            if (this.f) {
                lcjVar.r();
            }
        }
    }

    @Override // defpackage.b9j
    public final void onCancel() {
        e();
    }

    @Override // defpackage.b9j
    public final void onStop() {
        e();
    }

    @Override // defpackage.b9j
    public final void b() {
    }

    @Override // defpackage.b9j
    public final void c() {
    }
}
