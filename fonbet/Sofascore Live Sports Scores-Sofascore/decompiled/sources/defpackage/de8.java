package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lde8;", "Lbuc;", "Lfe8;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class de8 extends buc {
    public final ce8 a;

    public de8(ce8 ce8Var) {
        this.a = ce8Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        fe8 fe8Var = new fe8();
        fe8Var.o = this.a;
        return fe8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de8) && Intrinsics.c(this.a, ((de8) obj).a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        fe8 fe8Var = (fe8) wtcVar;
        fe8Var.o.a.q(fe8Var);
        ce8 ce8Var = this.a;
        fe8Var.o = ce8Var;
        ce8Var.a.b(fe8Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
