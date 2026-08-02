package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lip3;", "Lbuc;", "Lkp3;", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ip3 extends buc {
    public final nt9 a;
    public final apf b;
    public final hj0 c;
    public final Function1 d;
    public final Function1 e;
    public final io f;
    public final op3 g;
    public final float h;
    public final dk0 i;
    public final String j;

    public ip3(nt9 nt9Var, apf apfVar, hj0 hj0Var, Function1 function1, Function1 function12, io ioVar, op3 op3Var, float f, dk0 dk0Var, String str) {
        this.a = nt9Var;
        this.b = apfVar;
        this.c = hj0Var;
        this.d = function1;
        this.e = function12;
        this.f = ioVar;
        this.g = op3Var;
        this.h = f;
        this.i = dk0Var;
        this.j = str;
    }

    @Override // defpackage.buc
    public final wtc c() {
        hj0 hj0Var = this.c;
        apf apfVar = this.b;
        nt9 nt9Var = this.a;
        ij0 ij0Var = new ij0(apfVar, nt9Var, hj0Var);
        yj0 yj0Var = new yj0(ij0Var);
        yj0Var.m = this.d;
        yj0Var.n = this.e;
        yj0Var.o = this.g;
        yj0Var.p = 1;
        yj0Var.q = this.i;
        yj0Var.m(ij0Var);
        gkh gkhVar = nt9Var.s;
        return new kp3(yj0Var, this.f, this.g, this.h, this.j, gkhVar instanceof fn3 ? (fn3) gkhVar : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ip3) {
            ip3 ip3Var = (ip3) obj;
            if (this.a.equals(ip3Var.a) && this.b == ip3Var.b && Intrinsics.c(this.c, ip3Var.c) && Intrinsics.c(this.d, ip3Var.d) && Intrinsics.c(this.e, ip3Var.e) && Intrinsics.c(this.f, ip3Var.f) && Intrinsics.c(this.g, ip3Var.g) && Float.compare(this.h, ip3Var.h) == 0 && Intrinsics.c(this.i, ip3Var.i) && Intrinsics.c(this.j, ip3Var.j)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        kp3 kp3Var = (kp3) wtcVar;
        long i = kp3Var.u.i();
        fn3 fn3Var = kp3Var.t;
        hj0 hj0Var = this.c;
        apf apfVar = this.b;
        nt9 nt9Var = this.a;
        ij0 ij0Var = new ij0(apfVar, nt9Var, hj0Var);
        yj0 yj0Var = kp3Var.u;
        yj0Var.m = this.d;
        yj0Var.n = this.e;
        op3 op3Var = this.g;
        yj0Var.o = op3Var;
        yj0Var.p = 1;
        yj0Var.q = this.i;
        yj0Var.m(ij0Var);
        boolean c = njh.c(i, yj0Var.i());
        kp3Var.o = this.f;
        gkh gkhVar = nt9Var.s;
        kp3Var.t = gkhVar instanceof fn3 ? (fn3) gkhVar : null;
        kp3Var.p = op3Var;
        kp3Var.q = this.h;
        kp3Var.r = true;
        String str = kp3Var.s;
        String str2 = this.j;
        if (!Intrinsics.c(str, str2)) {
            kp3Var.s = str2;
            sea.p(kp3Var);
        }
        boolean c2 = Intrinsics.c(fn3Var, kp3Var.t);
        if (!c || !c2) {
            y6a.E(kp3Var);
        }
        n9e.E(kp3Var);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        Function1 function1 = this.e;
        int e = dmi.e(fc6.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + wv8.a(1, (hashCode + (function1 == null ? 0 : function1.hashCode())) * 31, 31)) * 31)) * 31, 961), 31, true);
        dk0 dk0Var = this.i;
        int hashCode2 = (e + (dk0Var == null ? 0 : dk0Var.hashCode())) * 31;
        String str = this.j;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.a);
        sb.append(", imageLoader=");
        sb.append(this.b);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.c);
        sb.append(", transform=");
        sb.append(this.d);
        sb.append(", onState=");
        sb.append(this.e);
        sb.append(", filterQuality=");
        sb.append("Low");
        sb.append(", alignment=");
        sb.append(this.f);
        sb.append(", contentScale=");
        sb.append(this.g);
        sb.append(", alpha=");
        sb.append(this.h);
        sb.append(", colorFilter=null, clipToBounds=true, previewHandler=");
        sb.append(this.i);
        sb.append(", contentDescription=");
        return mz1.o(sb, this.j, ")");
    }
}
