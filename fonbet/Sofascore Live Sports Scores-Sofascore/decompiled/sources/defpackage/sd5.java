package defpackage;

import com.sofascore.model.mvvm.model.Tournament;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sd5 {
    public final int a;
    public final int b;
    public final int c;
    public final pd5 d;
    public final pd5 e;
    public final Tournament f;

    public sd5(int i, int i2, int i3, pd5 pd5Var, pd5 pd5Var2, Tournament tournament) {
        tournament.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = pd5Var;
        this.e = pd5Var2;
        this.f = tournament;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd5)) {
            return false;
        }
        sd5 sd5Var = (sd5) obj;
        return this.a == sd5Var.a && this.b == sd5Var.b && this.c == sd5Var.c && this.d.equals(sd5Var.d) && this.e.equals(sd5Var.e) && Intrinsics.c(this.f, sd5Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "DuelWrapper(firstTeamWins=", ", secondTeamWins=", ", draws=");
        s.append(this.c);
        s.append(", firstItem=");
        s.append(this.d);
        s.append(", secondItem=");
        s.append(this.e);
        s.append(", tournament=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
