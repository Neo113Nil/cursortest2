package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvla;", "Lbuc;", "Lxla;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class vla extends buc {
    public final wla a;

    public vla(wla wlaVar) {
        this.a = wlaVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new xla(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vla) && Intrinsics.c(this.a, ((vla) obj).a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        xla xlaVar = (xla) wtcVar;
        wla wlaVar = this.a;
        xlaVar.o = wlaVar;
        ((eoh) wlaVar.a).setValue(xlaVar.q);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutBoundsElement(holder=" + this.a + ')';
    }
}
