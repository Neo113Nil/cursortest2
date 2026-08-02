package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpji;", "Lbuc;", "Lqji;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class pji extends buc {
    public final t75 a;

    public pji(t75 t75Var) {
        this.a = t75Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new qji(o1j.h, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pji)) {
            return false;
        }
        pji pjiVar = (pji) obj;
        k20 k20Var = o1j.h;
        return k20Var.equals(k20Var) && Intrinsics.c(this.a, pjiVar.a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        qji qjiVar = (qji) wtcVar;
        k20 k20Var = o1j.h;
        if (!Intrinsics.c(qjiVar.p, k20Var)) {
            qjiVar.p = k20Var;
            if (qjiVar.q) {
                qjiVar.m1();
            }
        }
        qjiVar.o = this.a;
    }

    public final int hashCode() {
        int e = dmi.e(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW * 31, 31, false);
        t75 t75Var = this.a;
        return e + (t75Var != null ? t75Var.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + o1j.h + ", overrideDescendants=false, touchBoundsExpansion=" + this.a + ')';
    }
}
