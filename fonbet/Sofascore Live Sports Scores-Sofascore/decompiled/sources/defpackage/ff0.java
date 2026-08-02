package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lff0;", "Lbuc;", "Ldt3;", "Ln3h;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ff0 extends buc implements n3h {
    public final boolean a;
    public final Function1 b;

    public ff0(Function1 function1, boolean z) {
        this.a = z;
        this.b = function1;
    }

    @Override // defpackage.n3h
    public final l3h V0() {
        l3h l3hVar = new l3h();
        l3hVar.c = this.a;
        this.b.invoke(l3hVar);
        return l3hVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new dt3(this.b, this.a, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff0)) {
            return false;
        }
        ff0 ff0Var = (ff0) obj;
        return this.a == ff0Var.a && this.b == ff0Var.b;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        dt3 dt3Var = (dt3) wtcVar;
        dt3Var.o = this.a;
        dt3Var.q = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
