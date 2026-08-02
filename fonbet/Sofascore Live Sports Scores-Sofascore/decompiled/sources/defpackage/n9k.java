package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n9k implements r9k {
    public final int a;
    public final Gender b;
    public final gv9 c;

    public n9k(int i, Gender gender, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = i;
        this.b = gender;
        this.c = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9k)) {
            return false;
        }
        n9k n9kVar = (n9k) obj;
        return this.a == n9kVar.a && this.b == n9kVar.b && Intrinsics.c(this.c, n9kVar.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Gender gender = this.b;
        return this.c.hashCode() + ((hashCode + (gender == null ? 0 : gender.hashCode())) * 31);
    }

    public final String toString() {
        return "GenderedStringResource(id=" + this.a + ", gender=" + this.b + ", args=" + this.c + ")";
    }

    public n9k(int i, Gender gender) {
        this(i, gender, rlh.b);
    }
}
