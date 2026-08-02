package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a4b implements c4b {
    public final x3b a;

    public a4b(x3b x3bVar) {
        this.a = x3bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a4b) && Intrinsics.c(this.a, ((a4b) obj).a);
    }

    public final int hashCode() {
        x3b x3bVar = this.a;
        if (x3bVar == null) {
            return 0;
        }
        return x3bVar.hashCode();
    }

    public final String toString() {
        return "TeamSelected(team=" + this.a + ")";
    }
}
