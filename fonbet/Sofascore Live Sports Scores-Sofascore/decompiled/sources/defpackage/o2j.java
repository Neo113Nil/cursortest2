package defpackage;

import com.sofascore.model.mvvm.model.bettingtips.TeamStreak;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o2j {
    public final TeamStreak a;
    public final boolean b;

    public o2j(TeamStreak teamStreak, boolean z) {
        teamStreak.getClass();
        this.a = teamStreak;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2j)) {
            return false;
        }
        o2j o2jVar = (o2j) obj;
        return Intrinsics.c(this.a, o2jVar.a) && this.b == o2jVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamStreakWithShowSport(teamStreak=" + this.a + ", showSport=" + this.b + ")";
    }
}
