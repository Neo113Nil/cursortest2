package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqnd;", "Lbuc;", "Lrnd;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class qnd extends buc {
    public final Function1 a;
    public final boolean b;
    public final Function1 c;

    public qnd(Function1 function1, Function1 function12, boolean z) {
        this.a = function1;
        this.b = z;
        this.c = function12;
    }

    @Override // defpackage.buc
    public final wtc c() {
        rnd rndVar = new rnd();
        rndVar.o = this.a;
        rndVar.p = this.b;
        return rndVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        qnd qndVar = obj instanceof qnd ? (qnd) obj : null;
        return qndVar != null && this.a == qndVar.a && this.b == qndVar.b;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        rnd rndVar = (rnd) wtcVar;
        Function1 function1 = rndVar.o;
        Function1 function12 = this.a;
        boolean z = this.b;
        if (function1 != function12 || rndVar.p != z) {
            c6o.c0(rndVar).U(false);
        }
        rndVar.o = function12;
        rndVar.p = z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.a);
        sb.append(", rtlAware=");
        return lnb.r(sb, this.b, ')');
    }
}
