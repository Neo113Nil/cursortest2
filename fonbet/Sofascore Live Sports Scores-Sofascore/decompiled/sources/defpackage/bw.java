package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lbw;", "T", "Lbuc;", "Lsw;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class bw<T> extends buc {
    public final dx a;
    public final boolean b;

    public bw(dx dxVar, boolean z) {
        ewd ewdVar = ewd.a;
        this.a = dxVar;
        this.b = z;
    }

    @Override // defpackage.buc
    public final wtc c() {
        ewd ewdVar = ewd.b;
        sw swVar = new sw(zm2.a, this.b, null, ewdVar);
        swVar.J = this.a;
        swVar.K = ewdVar;
        return swVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bw) {
            bw bwVar = (bw) obj;
            if (this.a != bwVar.a) {
                return false;
            }
            ewd ewdVar = ewd.a;
            if (this.b == bwVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        boolean z;
        boolean z2;
        sw swVar = (sw) wtcVar;
        ewd ewdVar = ewd.b;
        swVar.getClass();
        dx dxVar = swVar.J;
        dx dxVar2 = this.a;
        if (Intrinsics.c(dxVar, dxVar2)) {
            z = false;
        } else {
            swVar.J = dxVar2;
            swVar.H1();
            z = true;
        }
        if (swVar.K != ewdVar) {
            swVar.K = ewdVar;
            z2 = true;
        } else {
            z2 = z;
        }
        swVar.E1(swVar.r, this.b, null, ewdVar, z2);
    }

    public final int hashCode() {
        return dmi.e((ewd.b.hashCode() + (this.a.hashCode() * 31)) * 31, 28629151, this.b);
    }
}
