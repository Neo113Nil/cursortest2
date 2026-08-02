package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3e;", "Lbuc;", "Lv3e;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class s3e extends buc {
    public final p3e a;

    public s3e(p3e p3eVar, etd etdVar) {
        this.a = p3eVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        v3e v3eVar = new v3e();
        v3eVar.o = this.a;
        return v3eVar;
    }

    public final boolean equals(Object obj) {
        s3e s3eVar = obj instanceof s3e ? (s3e) obj : null;
        if (s3eVar == null) {
            return false;
        }
        return Intrinsics.c(this.a, s3eVar.a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((v3e) wtcVar).o = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
