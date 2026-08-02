package defpackage;

import com.sofascore.model.mvvm.model.Season;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sb9 extends ub9 {
    public final int b;
    public final Season c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb9(int i, Season season) {
        super(8);
        season.getClass();
        this.b = i;
        this.c = season;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb9)) {
            return false;
        }
        sb9 sb9Var = (sb9) obj;
        return this.b == sb9Var.b && Intrinsics.c(this.c, sb9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "SeasonButton(uniqueTournamentId=" + this.b + ", season=" + this.c + ")";
    }
}
