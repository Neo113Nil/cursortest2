package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lew2;", "Lbuc;", "Ldt3;", "Ln3h;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ew2 extends buc implements n3h {
    public final Function1 a;

    public ew2(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.n3h
    public final l3h V0() {
        l3h l3hVar = new l3h();
        l3hVar.c = false;
        l3hVar.d = true;
        this.a.invoke(l3hVar);
        return l3hVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new dt3(this.a, false, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ew2) {
            return this.a == ((ew2) obj).a;
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((dt3) wtcVar).q = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
