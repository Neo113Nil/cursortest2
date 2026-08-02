package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqw2;", "Lbuc;", "Lsw2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class qw2 extends buc {
    public final wzc a;
    public final j1a b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final u5g f;
    public final Function0 g;

    public qw2(wzc wzcVar, j1a j1aVar, boolean z, boolean z2, String str, u5g u5gVar, Function0 function0) {
        this.a = wzcVar;
        this.b = j1aVar;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = u5gVar;
        this.g = function0;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new sw2(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qw2.class != obj.getClass()) {
            return false;
        }
        qw2 qw2Var = (qw2) obj;
        return Intrinsics.c(this.a, qw2Var.a) && Intrinsics.c(this.b, qw2Var.b) && this.c == qw2Var.c && this.d == qw2Var.d && Intrinsics.c(this.e, qw2Var.e) && Intrinsics.c(this.f, qw2Var.f) && this.g == qw2Var.g;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((sw2) wtcVar).z1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final int hashCode() {
        wzc wzcVar = this.a;
        int hashCode = (wzcVar != null ? wzcVar.hashCode() : 0) * 31;
        j1a j1aVar = this.b;
        int e = dmi.e(dmi.e((hashCode + (j1aVar != null ? j1aVar.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode2 = (e + (str != null ? str.hashCode() : 0)) * 31;
        u5g u5gVar = this.f;
        return this.g.hashCode() + ((hashCode2 + (u5gVar != null ? Integer.hashCode(u5gVar.a) : 0)) * 31);
    }
}
