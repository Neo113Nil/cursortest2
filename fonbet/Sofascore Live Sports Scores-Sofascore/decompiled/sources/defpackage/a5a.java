package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La5a;", "Lbuc;", "Lc5a;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class a5a extends buc {
    public final w8l a;

    public a5a(w8l w8lVar) {
        this.a = w8lVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new c5a(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a5a) {
            return Intrinsics.c(((a5a) obj).a, this.a);
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        c5a c5aVar = (c5a) wtcVar;
        w8l w8lVar = c5aVar.q;
        w8l w8lVar2 = this.a;
        if (Intrinsics.c(w8lVar2, w8lVar)) {
            return;
        }
        c5aVar.q = w8lVar2;
        c5aVar.l1();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
