package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lr2h;", "Lbuc;", "Lt2h;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class r2h extends buc {
    public final boolean a;
    public final wzc b;
    public final j1a c;
    public final boolean d;
    public final u5g e;
    public final Function0 f;

    public r2h(boolean z, wzc wzcVar, p5g p5gVar, boolean z2, u5g u5gVar, Function0 function0) {
        this.a = z;
        this.b = wzcVar;
        this.c = p5gVar;
        this.d = z2;
        this.e = u5gVar;
        this.f = function0;
    }

    @Override // defpackage.buc
    public final wtc c() {
        t2h t2hVar = new t2h(this.b, this.c, false, this.d, null, this.e, this.f);
        t2hVar.O = this.a;
        return t2hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r2h.class != obj.getClass()) {
            return false;
        }
        r2h r2hVar = (r2h) obj;
        return this.a == r2hVar.a && Intrinsics.c(this.b, r2hVar.b) && Intrinsics.c(this.c, r2hVar.c) && this.d == r2hVar.d && Intrinsics.c(this.e, r2hVar.e) && this.f == r2hVar.f;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        t2h t2hVar = (t2h) wtcVar;
        boolean z = t2hVar.O;
        boolean z2 = this.a;
        if (z != z2) {
            t2hVar.O = z2;
            sea.p(t2hVar);
        }
        t2hVar.z1(this.b, this.c, false, this.d, null, this.e, this.f);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        wzc wzcVar = this.b;
        int hashCode2 = (hashCode + (wzcVar != null ? wzcVar.hashCode() : 0)) * 31;
        j1a j1aVar = this.c;
        int e = dmi.e(dmi.e((hashCode2 + (j1aVar != null ? j1aVar.hashCode() : 0)) * 31, 31, false), 31, this.d);
        u5g u5gVar = this.e;
        return this.f.hashCode() + ((e + (u5gVar != null ? Integer.hashCode(u5gVar.a) : 0)) * 31);
    }
}
