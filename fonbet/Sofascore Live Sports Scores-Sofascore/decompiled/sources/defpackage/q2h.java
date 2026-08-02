package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q2h {
    public final int a;
    public final String b;
    public final boolean c;

    public q2h(int i, String str, boolean z) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2h)) {
            return false;
        }
        q2h q2hVar = (q2h) obj;
        return this.a == q2hVar.a && Intrinsics.c(this.b, q2hVar.b) && this.c == q2hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return wt3.p(dmi.t(this.a, "SelectTeamUiModel(teamId=", ", teamName=", this.b, ", isSelected="), this.c, ")");
    }
}
