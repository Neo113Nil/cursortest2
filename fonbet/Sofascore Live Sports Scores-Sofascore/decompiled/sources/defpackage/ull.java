package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lull;", "Lbuc;", "Lvll;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ull extends buc {
    public final l35 a;
    public final boolean b;
    public final Function2 c;
    public final Object d;

    public ull(l35 l35Var, boolean z, Function2 function2, Object obj) {
        this.a = l35Var;
        this.b = z;
        this.c = function2;
        this.d = obj;
    }

    @Override // defpackage.buc
    public final wtc c() {
        vll vllVar = new vll();
        vllVar.o = this.a;
        vllVar.p = this.b;
        vllVar.q = this.c;
        return vllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ull.class != obj.getClass()) {
            return false;
        }
        ull ullVar = (ull) obj;
        return this.a == ullVar.a && this.b == ullVar.b && Intrinsics.c(this.d, ullVar.d);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        vll vllVar = (vll) wtcVar;
        vllVar.o = this.a;
        vllVar.p = this.b;
        vllVar.q = this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.e(this.a.hashCode() * 31, 31, this.b);
    }
}
