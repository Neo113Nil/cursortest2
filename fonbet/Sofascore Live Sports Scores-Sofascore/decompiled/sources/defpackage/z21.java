package defpackage;

import com.sofascore.model.mvvm.model.Category;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z21 {
    public final int a;
    public final String b;
    public final Category c;
    public final long d;

    public z21(int i, String str, Category category, long j) {
        category.getClass();
        this.a = i;
        this.b = str;
        this.c = category;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z21)) {
            return false;
        }
        z21 z21Var = (z21) obj;
        return this.a == z21Var.a && Intrinsics.c(this.b, z21Var.b) && Intrinsics.c(this.c, z21Var.c) && this.d == z21Var.d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "FollowableUniqueTournament(id=", ", translatedName=", this.b, ", category=");
        t.append(this.c);
        t.append(", userCount=");
        t.append(this.d);
        t.append(")");
        return t.toString();
    }
}
