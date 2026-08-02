package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class cvc extends q3d {
    public final evc d;

    public cvc(evc evcVar) {
        super(lnl.b, evcVar.a, "monthName");
        this.d = evcVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cvc) && Intrinsics.c(this.d.a, ((cvc) obj).d.a);
    }

    public final int hashCode() {
        return this.d.a.hashCode();
    }
}
