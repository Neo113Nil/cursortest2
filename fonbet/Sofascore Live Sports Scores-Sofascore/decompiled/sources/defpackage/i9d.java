package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Li9d;", "Lbuc;", "Lm9d;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class i9d extends buc {
    public final e9d a;
    public final h9d b;

    public i9d(e9d e9dVar, h9d h9dVar) {
        this.a = e9dVar;
        this.b = h9dVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new m9d(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i9d)) {
            return false;
        }
        i9d i9dVar = (i9d) obj;
        return Intrinsics.c(i9dVar.a, this.a) && Intrinsics.c(i9dVar.b, this.b);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        m9d m9dVar = (m9d) wtcVar;
        m9dVar.o = this.a;
        h9d h9dVar = m9dVar.p;
        if (h9dVar.a == m9dVar) {
            h9dVar.a = null;
        }
        h9d h9dVar2 = this.b;
        if (h9dVar2 == null) {
            h9dVar = new h9d();
            m9dVar.p = h9dVar;
        } else if (h9dVar2 != h9dVar) {
            m9dVar.p = h9dVar2;
            h9dVar = h9dVar2;
        }
        if (m9dVar.n) {
            h9dVar.a = m9dVar;
            h9dVar.b = null;
            m9dVar.q = null;
            h9dVar.c = new jmc(m9dVar, 15);
            h9dVar.d = m9dVar.Y0();
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h9d h9dVar = this.b;
        return hashCode + (h9dVar != null ? h9dVar.hashCode() : 0);
    }
}
