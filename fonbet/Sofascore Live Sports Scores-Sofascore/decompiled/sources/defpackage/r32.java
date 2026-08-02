package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lr32;", "Lbuc;", "Lu32;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class r32 extends buc {
    public final t32 a;

    public r32(t32 t32Var) {
        this.a = t32Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new u32(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r32) {
            return Intrinsics.c(this.a, ((r32) obj).a);
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        u32 u32Var = (u32) wtcVar;
        t32 t32Var = u32Var.o;
        if (t32Var != null) {
            t32Var.a.q(u32Var);
        }
        t32 t32Var2 = this.a;
        if (t32Var2 != null) {
            t32Var2.a.b(u32Var);
        }
        u32Var.o = t32Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
