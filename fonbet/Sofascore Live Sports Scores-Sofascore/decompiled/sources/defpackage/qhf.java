package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqhf;", "Lbuc;", "Lwhf;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class qhf extends buc {
    public final boolean a;
    public final Function0 b;
    public final xhf c;
    public final float d;

    public qhf(boolean z, Function0 function0, xhf xhfVar, float f) {
        this.a = z;
        this.b = function0;
        this.c = xhfVar;
        this.d = f;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new whf(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhf)) {
            return false;
        }
        qhf qhfVar = (qhf) obj;
        return this.a == qhfVar.a && this.b == qhfVar.b && Intrinsics.c(this.c, qhfVar.c) && p75.b(this.d, qhfVar.d);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        whf whfVar = (whf) wtcVar;
        whfVar.r = this.b;
        whfVar.s = true;
        whfVar.t = this.c;
        whfVar.u = this.d;
        boolean z = whfVar.q;
        boolean z2 = this.a;
        if (z != z2) {
            whfVar.q = z2;
            xw3.L(whfVar.Y0(), null, null, new thf(whfVar, null, 2), 3);
        }
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + dmi.e(Boolean.hashCode(this.a) * 31, 31, true)) * 31)) * 31);
    }
}
