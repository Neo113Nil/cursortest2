package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo32;", "Lbuc;", "Lq32;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class o32 extends buc {
    public final v40 a;

    public o32(v40 v40Var) {
        this.a = v40Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new q32(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o32) {
            return this.a == ((o32) obj).a;
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        q32 q32Var = (q32) wtcVar;
        v40 v40Var = this.a;
        q32Var.o = v40Var;
        if (q32Var.n) {
            v40Var.invoke(q32Var.p);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
