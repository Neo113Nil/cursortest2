package defpackage;

import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k7g {
    public final TournamentRoundWrapper a;
    public final String b;

    public k7g(TournamentRoundWrapper tournamentRoundWrapper, String str) {
        str.getClass();
        this.a = tournamentRoundWrapper;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7g)) {
            return false;
        }
        k7g k7gVar = (k7g) obj;
        return this.a.equals(k7gVar.a) && Intrinsics.c(this.b, k7gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RoundSpinnerItem(round=" + this.a + ", label=" + this.b + ")";
    }
}
