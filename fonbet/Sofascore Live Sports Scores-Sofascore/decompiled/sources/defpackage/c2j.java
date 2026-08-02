package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c2j {
    public final int a;
    public final String b;
    public final r9k c;

    public c2j(int i, q9k q9kVar, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = q9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2j)) {
            return false;
        }
        c2j c2jVar = (c2j) obj;
        return this.a == c2jVar.a && Intrinsics.c(this.b, c2jVar.b) && Intrinsics.c(this.c, c2jVar.c);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        r9k r9kVar = this.c;
        return c + (r9kVar == null ? 0 : r9kVar.hashCode());
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "TeamSquadStaffUIModel(listId=", ", staffName=", this.b, ", staffRole=");
        t.append(this.c);
        t.append(")");
        return t.toString();
    }
}
