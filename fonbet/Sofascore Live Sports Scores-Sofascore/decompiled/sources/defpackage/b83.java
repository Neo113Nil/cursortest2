package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b83 implements l83 {
    public final r9k a;
    public final tee b;
    public final Set c;
    public final i83 d;

    public b83(r9k r9kVar, tee teeVar, Set set, i83 i83Var) {
        teeVar.getClass();
        set.getClass();
        this.a = r9kVar;
        this.b = teeVar;
        this.c = set;
        this.d = i83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b83)) {
            return false;
        }
        b83 b83Var = (b83) obj;
        return this.a.equals(b83Var.a) && Intrinsics.c(this.b, b83Var.b) && Intrinsics.c(this.c, b83Var.c) && Intrinsics.c(this.d, b83Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        i83 i83Var = this.d;
        return hashCode + (i83Var == null ? 0 : i83Var.hashCode());
    }

    public final String toString() {
        return "ComparableRow(label=" + this.a + ", values=" + this.b + ", winners=" + this.c + ", info=" + this.d + ")";
    }
}
