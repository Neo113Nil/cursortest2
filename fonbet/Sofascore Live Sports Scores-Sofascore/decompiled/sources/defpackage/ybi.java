package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ybi implements c80 {
    public final c80 a;
    public final long b;

    public ybi(j38 j38Var, long j) {
        this.a = j38Var;
        this.b = j;
    }

    @Override // defpackage.c80
    public final nmk a(q4k q4kVar) {
        return new zbi(this.a.a(q4kVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ybi)) {
            return false;
        }
        ybi ybiVar = (ybi) obj;
        return ybiVar.b == this.b && Intrinsics.c(ybiVar.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
