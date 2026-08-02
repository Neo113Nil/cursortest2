package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u1j implements z1j {
    public final b2j a;
    public final boolean b;
    public final boolean c;
    public final wv9 d;

    public u1j(b2j b2jVar, boolean z, boolean z2, wv9 wv9Var) {
        b2jVar.getClass();
        this.a = b2jVar;
        this.b = z;
        this.c = z2;
        this.d = wv9Var;
    }

    @Override // defpackage.z1j
    public final wv9 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1j)) {
            return false;
        }
        u1j u1jVar = (u1j) obj;
        return Intrinsics.c(this.a, u1jVar.a) && this.b == u1jVar.b && this.c == u1jVar.c && this.d.equals(u1jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.e(dmi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "Player(data=" + this.a + ", roundTop=" + this.b + ", showDivider=" + this.c + ", visibleForChips=" + this.d + ")";
    }
}
