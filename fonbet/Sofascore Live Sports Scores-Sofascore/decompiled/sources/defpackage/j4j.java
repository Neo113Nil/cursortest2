package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j4j {
    public final f4j a;
    public final int b;
    public final List c;

    public j4j(f4j f4jVar, int i, List list) {
        list.getClass();
        this.a = f4jVar;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4j)) {
            return false;
        }
        j4j j4jVar = (j4j) obj;
        return this.a.equals(j4jVar.a) && this.b == j4jVar.b && Intrinsics.c(this.c, j4jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamTrophies(team=");
        sb.append(this.a);
        sb.append(", totalTrophies=");
        sb.append(this.b);
        sb.append(", trophies=");
        return mz1.p(sb, this.c, ")");
    }
}
