package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqcj;", "Lbuc;", "Lrcj;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class qcj extends buc {
    public final dfj a;

    public qcj(dfj dfjVar) {
        this.a = dfjVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new rcj(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcj)) {
            return false;
        }
        return Intrinsics.c(this.a, ((qcj) obj).a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        rcj rcjVar = (rcj) wtcVar;
        rcjVar.getClass();
        dfj C = g7a.C(this.a, c6o.c0(rcjVar).z);
        rcjVar.k1(C, (sf8) tgj.x(rcjVar, dh3.k));
        pcj pcjVar = rcjVar.q;
        if (pcjVar == null) {
            throw wv8.d("Min size state is not set.");
        }
        pcj.a(pcjVar, null, null, C, 23);
        y6a.E(rcjVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
