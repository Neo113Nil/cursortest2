package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w1j implements z1j {
    public final c2j a;
    public final boolean b;
    public final wv9 c;

    public w1j(c2j c2jVar, boolean z, wv9 wv9Var) {
        c2jVar.getClass();
        this.a = c2jVar;
        this.b = z;
        this.c = wv9Var;
    }

    @Override // defpackage.z1j
    public final wv9 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1j)) {
            return false;
        }
        w1j w1jVar = (w1j) obj;
        return Intrinsics.c(this.a, w1jVar.a) && this.b == w1jVar.b && this.c.equals(w1jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Staff(data=" + this.a + ", showDivider=" + this.b + ", visibleForChips=" + this.c + ")";
    }
}
