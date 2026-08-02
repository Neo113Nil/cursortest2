package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v1j implements z1j {
    public final String a;
    public final String b;
    public final wv9 c;

    public v1j(String str, String str2, wv9 wv9Var) {
        this.a = str;
        this.b = str2;
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
        if (!(obj instanceof v1j)) {
            return false;
        }
        v1j v1jVar = (v1j) obj;
        return Intrinsics.c(this.a, v1jVar.a) && this.b.equals(v1jVar.b) && this.c.equals(v1jVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + dmi.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder s = mz1.s("PositionSection(id=", this.a, ", name=", this.b, ", visibleForChips=");
        s.append(this.c);
        s.append(")");
        return s.toString();
    }
}
