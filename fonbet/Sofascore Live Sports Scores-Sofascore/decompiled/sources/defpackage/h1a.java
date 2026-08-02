package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh1a;", "Lbuc;", "Li1a;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class h1a extends buc {
    public final wzc a;
    public final j1a b;

    public h1a(wzc wzcVar, j1a j1aVar) {
        this.a = wzcVar;
        this.b = j1aVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        xv4 b = this.b.b(this.a);
        i1a i1aVar = new i1a();
        i1aVar.q = b;
        i1aVar.k1(b);
        return i1aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1a)) {
            return false;
        }
        h1a h1aVar = (h1a) obj;
        return Intrinsics.c(this.a, h1aVar.a) && this.b.equals(h1aVar.b);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        i1a i1aVar = (i1a) wtcVar;
        xv4 b = this.b.b(this.a);
        i1aVar.l1(i1aVar.q);
        i1aVar.q = b;
        i1aVar.k1(b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
