package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m46 {
    public final e9b a;
    public final n9g b;
    public final boolean c;

    public m46(e9b e9bVar, n9g n9gVar, boolean z) {
        this.a = e9bVar;
        this.b = n9gVar;
        this.c = z;
    }

    public static m46 a(m46 m46Var, e9b e9bVar, n9g n9gVar, boolean z, int i) {
        if ((i & 1) != 0) {
            e9bVar = m46Var.a;
        }
        if ((i & 2) != 0) {
            n9gVar = m46Var.b;
        }
        if ((i & 4) != 0) {
            z = m46Var.c;
        }
        return new m46(e9bVar, n9gVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m46)) {
            return false;
        }
        m46 m46Var = (m46) obj;
        return this.a.equals(m46Var.a) && Intrinsics.c(this.b, m46Var.b) && this.c == m46Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n9g n9gVar = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (n9gVar == null ? 0 : n9gVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventOtherSportsLineupsState(lineupsListData=");
        sb.append(this.a);
        sb.append(", rugbyFieldData=");
        sb.append(this.b);
        sb.append(", isPullToRefreshing=");
        return wt3.p(sb, this.c, ")");
    }
}
