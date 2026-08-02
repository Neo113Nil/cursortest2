package defpackage;

import androidx.compose.runtime.e;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jwj {
    public final scj a;
    public q4a b;
    public final wxf c;
    public final ay4 d;
    public final e1d e;

    public jwj(scj scjVar, q4a q4aVar, wxf wxfVar) {
        this.a = scjVar;
        this.b = q4aVar;
        this.c = wxfVar;
        this.d = wxfVar != null ? goh.b(new fej(1, this, wxfVar)) : null;
        l2l l2lVar = l2l.a;
        this.e = e.f(new j3h(l2lVar, l2lVar));
    }

    public static void h(jwj jwjVar, CharSequence charSequence, boolean z, int i) {
        haj hajVar = haj.b;
        boolean z2 = (i & 2) == 0;
        if ((i & 4) != 0) {
            hajVar = haj.a;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        scj scjVar = jwjVar.a;
        q4a q4aVar = jwjVar.b;
        scjVar.b.a().q();
        l9j l9jVar = scjVar.b;
        if (z2) {
            l9jVar.e(null);
        }
        long j = l9jVar.e;
        l9jVar.c(pej.g(j), pej.f(j), charSequence);
        int length = charSequence.length() + pej.g(j);
        cga.P(l9jVar, length, length);
        jwjVar.l(l9jVar);
        scjVar.b(q4aVar, z, hajVar);
        scjVar.e(true);
    }

    public static void i(jwj jwjVar, String str, long j, boolean z, int i) {
        haj hajVar = haj.a;
        if ((i & 8) != 0) {
            z = true;
        }
        scj scjVar = jwjVar.a;
        q4a q4aVar = jwjVar.b;
        scjVar.b.a().q();
        l9j l9jVar = scjVar.b;
        long e = jwjVar.e(j);
        l9jVar.c(pej.g(e), pej.f(e), str);
        int length = str.length() + pej.g(e);
        cga.P(l9jVar, length, length);
        jwjVar.l(l9jVar);
        scjVar.b(q4aVar, z, hajVar);
        scjVar.e(true);
    }

    public final void a() {
        q4a q4aVar = this.b;
        haj hajVar = haj.a;
        scj scjVar = this.a;
        scjVar.b.a().q();
        l9j l9jVar = scjVar.b;
        int f = pej.f(l9jVar.e);
        cga.P(l9jVar, f, f);
        scjVar.b(q4aVar, true, hajVar);
        scjVar.e(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(b40 b40Var, sq3 sq3Var) {
        iwj iwjVar;
        int i;
        if (sq3Var instanceof iwj) {
            iwjVar = (iwj) sq3Var;
            int i2 = iwjVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iwjVar.t = i2 - Integer.MIN_VALUE;
                Object obj = iwjVar.r;
                lu3 lu3Var = lu3.a;
                i = iwjVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    iwjVar.t = 1;
                    lj2 lj2Var = new lj2(1, z9a.b(iwjVar));
                    lj2Var.t();
                    this.a.g.b(b40Var);
                    lj2Var.v(new wsd(15, this, b40Var));
                    if (lj2Var.q() == lu3Var) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    y6a.M(obj);
                }
                pvd.x();
            }
        }
        iwjVar = new iwj(this, sq3Var);
        Object obj2 = iwjVar.r;
        lu3 lu3Var2 = lu3.a;
        i = iwjVar.t;
        if (i != 0) {
        }
        pvd.x();
    }

    public final void c() {
        q4a q4aVar = this.b;
        haj hajVar = haj.b;
        scj scjVar = this.a;
        scjVar.b.a().q();
        l9j l9jVar = scjVar.b;
        l9jVar.c(pej.g(l9jVar.e), pej.f(l9jVar.e), "");
        int g = pej.g(l9jVar.e);
        cga.P(l9jVar, g, g);
        l(l9jVar);
        scjVar.b(q4aVar, true, hajVar);
        scjVar.e(true);
    }

    public final m9j d() {
        hwj hwjVar;
        ay4 ay4Var = this.d;
        return (ay4Var == null || (hwjVar = (hwj) ay4Var.getValue()) == null) ? this.a.c() : hwjVar.a;
    }

    public final long e(long j) {
        hwj hwjVar;
        ay4 ay4Var = this.d;
        e7a e7aVar = (ay4Var == null || (hwjVar = (hwj) ay4Var.getValue()) == null) ? null : hwjVar.b;
        if (e7aVar == null) {
            return j;
        }
        int i = pej.c;
        long a = e7aVar.a((int) (j >> 32), false);
        long a2 = pej.d(j) ? a : e7aVar.a((int) (4294967295L & j), false);
        int min = Math.min(pej.g(a), pej.g(a2));
        int max = Math.max(pej.f(a), pej.f(a2));
        return pej.h(j) ? t6a.g(max, min) : t6a.g(min, max);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwj)) {
            return false;
        }
        jwj jwjVar = (jwj) obj;
        return Intrinsics.c(this.a, jwjVar.a) && Intrinsics.c(this.c, jwjVar.c);
    }

    public final long f(long j) {
        hwj hwjVar;
        ay4 ay4Var = this.d;
        e7a e7aVar = (ay4Var == null || (hwjVar = (hwj) ay4Var.getValue()) == null) ? null : hwjVar.b;
        return e7aVar != null ? aba.A(j, e7aVar, (j3h) ((eoh) this.e).getValue()) : j;
    }

    public final void g(CharSequence charSequence) {
        q4a q4aVar = this.b;
        haj hajVar = haj.a;
        scj scjVar = this.a;
        scjVar.b.a().q();
        l9j l9jVar = scjVar.b;
        l9jVar.c(0, l9jVar.c.length(), "");
        l9jVar.append(charSequence.toString());
        l(l9jVar);
        scjVar.b(q4aVar, true, hajVar);
        scjVar.e(true);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wxf wxfVar = this.c;
        return (hashCode + (wxfVar != null ? wxfVar.hashCode() : 0)) * 31;
    }

    public final void j(long j) {
        k(e(j));
    }

    public final void k(long j) {
        q4a q4aVar = this.b;
        haj hajVar = haj.a;
        scj scjVar = this.a;
        scjVar.b.a().q();
        l9j l9jVar = scjVar.b;
        int i = pej.c;
        cga.P(l9jVar, (int) (j >> 32), (int) (j & 4294967295L));
        scjVar.b(q4aVar, true, hajVar);
        scjVar.e(true);
    }

    public final void l(l9j l9jVar) {
        if (((i1d) l9jVar.a().b).c <= 0 || !pej.d(l9jVar.e)) {
            return;
        }
        l2l l2lVar = l2l.a;
        ((eoh) this.e).setValue(new j3h(l2lVar, l2lVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformedTextFieldState(textFieldState=");
        scj scjVar = this.a;
        sb.append(scjVar);
        sb.append(", outputTransformation=null, outputTransformedText=null, codepointTransformation=");
        sb.append(this.c);
        sb.append(", codepointTransformedText=");
        sb.append(this.d);
        sb.append(", outputText=\"");
        sb.append((Object) scjVar.c());
        sb.append("\", visualText=\"");
        sb.append((Object) d());
        sb.append("\")");
        return sb.toString();
    }
}
