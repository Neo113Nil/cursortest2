package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m9 {
    public final String a;
    public final dt8 b;

    public m9(String str, dt8 dt8Var) {
        this.a = str;
        this.b = dt8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9)) {
            return false;
        }
        m9 m9Var = (m9) obj;
        return Intrinsics.c(this.a, m9Var.a) && Intrinsics.c(this.b, m9Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        dt8 dt8Var = this.b;
        return hashCode + (dt8Var != null ? dt8Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
