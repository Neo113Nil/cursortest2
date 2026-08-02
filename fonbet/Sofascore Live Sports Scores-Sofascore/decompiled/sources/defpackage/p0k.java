package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp0k;", "Lbuc;", "Lq0k;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class p0k extends buc {
    public final vjj a;
    public final wzc b;
    public final j1a c;
    public final boolean d;
    public final u5g e;
    public final Function0 f;

    public p0k(vjj vjjVar, wzc wzcVar, p5g p5gVar, boolean z, u5g u5gVar, Function0 function0) {
        this.a = vjjVar;
        this.b = wzcVar;
        this.c = p5gVar;
        this.d = z;
        this.e = u5gVar;
        this.f = function0;
    }

    @Override // defpackage.buc
    public final wtc c() {
        q0k q0kVar = new q0k(this.b, this.c, false, this.d, null, this.e, this.f);
        q0kVar.O = this.a;
        return q0kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p0k.class != obj.getClass()) {
            return false;
        }
        p0k p0kVar = (p0k) obj;
        return this.a == p0kVar.a && Intrinsics.c(this.b, p0kVar.b) && Intrinsics.c(this.c, p0kVar.c) && this.d == p0kVar.d && this.e.equals(p0kVar.e) && this.f == p0kVar.f;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        q0k q0kVar = (q0k) wtcVar;
        vjj vjjVar = q0kVar.O;
        vjj vjjVar2 = this.a;
        if (vjjVar != vjjVar2) {
            q0kVar.O = vjjVar2;
            sea.p(q0kVar);
        }
        q0kVar.z1(this.b, this.c, false, this.d, null, this.e, this.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wzc wzcVar = this.b;
        int hashCode2 = (hashCode + (wzcVar != null ? wzcVar.hashCode() : 0)) * 31;
        j1a j1aVar = this.c;
        return this.f.hashCode() + wv8.a(this.e.a, dmi.e(dmi.e((hashCode2 + (j1aVar != null ? j1aVar.hashCode() : 0)) * 31, 31, false), 31, this.d), 31);
    }
}
