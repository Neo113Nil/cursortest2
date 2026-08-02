package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxg3;", "Lbuc;", "Lyg3;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class xg3 extends buc {
    public final wg3 a;

    public xg3(aee aeeVar) {
        this.a = aeeVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        yg3 yg3Var = new yg3();
        yg3Var.o = this.a;
        return yg3Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xg3) && Intrinsics.c(((xg3) obj).a, this.a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        yg3 yg3Var = (yg3) wtcVar;
        wg3 wg3Var = this.a;
        yg3Var.o = wg3Var;
        c6o.c0(yg3Var).Z(wg3Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
