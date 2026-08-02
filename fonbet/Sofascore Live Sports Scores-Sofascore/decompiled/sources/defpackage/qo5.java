package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqo5;", "Lbuc;", "Lyo5;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class qo5 extends buc {
    public final axj a;
    public final pwj b;
    public final pwj c;
    public final pwj d;
    public final zo5 e;
    public final of6 f;
    public final Function0 g;
    public final ro5 h;

    public qo5(axj axjVar, pwj pwjVar, pwj pwjVar2, pwj pwjVar3, zo5 zo5Var, of6 of6Var, Function0 function0, ro5 ro5Var) {
        this.a = axjVar;
        this.b = pwjVar;
        this.c = pwjVar2;
        this.d = pwjVar3;
        this.e = zo5Var;
        this.f = of6Var;
        this.g = function0;
        this.h = ro5Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new yo5(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qo5)) {
            return false;
        }
        qo5 qo5Var = (qo5) obj;
        return qo5Var.a == this.a && Intrinsics.c(qo5Var.b, this.b) && Intrinsics.c(qo5Var.c, this.c) && Intrinsics.c(qo5Var.d, this.d) && qo5Var.e.equals(this.e) && Intrinsics.c(qo5Var.f, this.f) && qo5Var.g == this.g && Intrinsics.c(qo5Var.h, this.h);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        yo5 yo5Var = (yo5) wtcVar;
        yo5Var.p = this.a;
        yo5Var.q = this.b;
        yo5Var.r = this.c;
        yo5Var.s = this.d;
        yo5Var.t = this.e;
        yo5Var.u = this.f;
        yo5Var.v = this.g;
        yo5Var.w = this.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pwj pwjVar = this.b;
        int hashCode2 = (hashCode + (pwjVar != null ? pwjVar.hashCode() : 0)) * 31;
        pwj pwjVar2 = this.c;
        int hashCode3 = (hashCode2 + (pwjVar2 != null ? pwjVar2.hashCode() : 0)) * 31;
        pwj pwjVar3 = this.d;
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.a.hashCode() + ((this.e.a.hashCode() + ((hashCode3 + (pwjVar3 != null ? pwjVar3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
