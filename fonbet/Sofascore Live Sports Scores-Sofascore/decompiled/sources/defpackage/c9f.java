package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c9f {
    public final Boolean a;
    public final Boolean b;

    public c9f(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9f)) {
            return false;
        }
        c9f c9fVar = (c9f) obj;
        return Intrinsics.c(this.a, c9fVar.a) && Intrinsics.c(this.b, c9fVar.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "ChangeUserData(changeNicknameResult=" + this.a + ", changeBadgeResult=" + this.b + ")";
    }
}
