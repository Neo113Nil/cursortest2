package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnvg;", "Lbuc;", "Lmug;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class nvg extends buc {
    public final qug a;
    public final boolean b;

    public nvg(qug qugVar, boolean z) {
        this.a = qugVar;
        this.b = z;
    }

    @Override // defpackage.buc
    public final wtc c() {
        mug mugVar = new mug();
        mugVar.o = this.a;
        mugVar.p = this.b;
        return mugVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nvg)) {
            return false;
        }
        nvg nvgVar = (nvg) obj;
        return Intrinsics.c(this.a, nvgVar.a) && this.b == nvgVar.b;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        mug mugVar = (mug) wtcVar;
        mugVar.o = this.a;
        mugVar.p = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + dmi.e(this.a.hashCode() * 31, 31, false);
    }
}
