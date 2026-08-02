package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nn6 {
    public final int a;
    public final String b;
    public final String c;

    public nn6(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn6)) {
            return false;
        }
        nn6 nn6Var = (nn6) obj;
        return this.a == nn6Var.a && Intrinsics.c(this.b, nn6Var.b) && Intrinsics.c(this.c, nn6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return mz1.o(dmi.t(this.a, "FakeChatMessage(avatarRes=", ", username=", this.b, ", text="), this.c, ")");
    }
}
