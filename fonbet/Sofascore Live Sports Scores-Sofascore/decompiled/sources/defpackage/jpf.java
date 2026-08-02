package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jpf implements gkh {
    public final kjh a;

    public jpf(kjh kjhVar) {
        this.a = kjhVar;
    }

    @Override // defpackage.gkh
    public final Object c(rq3 rq3Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpf) && Intrinsics.c(this.a, ((jpf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.a + ")";
    }
}
