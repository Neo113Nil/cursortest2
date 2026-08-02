package defpackage;

import com.sofascore.model.TeamSelection;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e9b {
    public final gv9 a;
    public final a1j b;
    public final TeamSelection c;

    public e9b(gv9 gv9Var, a1j a1jVar, TeamSelection teamSelection) {
        gv9Var.getClass();
        teamSelection.getClass();
        this.a = gv9Var;
        this.b = a1jVar;
        this.c = teamSelection;
    }

    public static e9b a(e9b e9bVar, gv9 gv9Var, a1j a1jVar, TeamSelection teamSelection, int i) {
        if ((i & 2) != 0) {
            a1jVar = e9bVar.b;
        }
        if ((i & 4) != 0) {
            teamSelection = e9bVar.c;
        }
        e9bVar.getClass();
        gv9Var.getClass();
        a1jVar.getClass();
        teamSelection.getClass();
        return new e9b(gv9Var, a1jVar, teamSelection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9b)) {
            return false;
        }
        e9b e9bVar = (e9b) obj;
        return Intrinsics.c(this.a, e9bVar.a) && Intrinsics.c(this.b, e9bVar.b) && this.c == e9bVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ljg.d(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "LineupsListData(items=" + this.a + ", teamSelector=" + this.b + ", selectedTeam=" + this.c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e9b() {
        this(r0, new a1j(r0), TeamSelection.First);
        rlh rlhVar = rlh.b;
    }
}
