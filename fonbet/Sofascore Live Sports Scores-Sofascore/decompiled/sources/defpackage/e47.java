package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e47 {
    public final String a;
    public final int b;
    public final ArrayList c;

    public e47(int i, String str, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e47)) {
            return false;
        }
        e47 e47Var = (e47) obj;
        return Intrinsics.c(this.a, e47Var.a) && this.b == e47Var.b && this.c.equals(e47Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder q = mz1.q(this.b, "FantasyLeagueEventsWrapper(name=", this.a, ", categoryId=", ", events=");
        q.append(this.c);
        q.append(")");
        return q.toString();
    }
}
