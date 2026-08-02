package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s37 {
    public final j67 a;
    public final boolean b;

    public s37(j67 j67Var, boolean z) {
        j67Var.getClass();
        this.a = j67Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s37)) {
            return false;
        }
        s37 s37Var = (s37) obj;
        return Intrinsics.c(this.a, s37Var.a) && this.b == s37Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FantasyLeagueChatWrapper(league=" + this.a + ", hasUnreadMessages=" + this.b + ")";
    }
}
