package defpackage;

import com.sofascore.model.weeklyChallenge.WeeklyStatus;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeActivity;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i1f extends j1f {
    public final WeeklyStatus h;

    public i1f(WeeklyStatus weeklyStatus) {
        super("Weekly Challenge", j7f.c, new b1f(8), b.j(MainActivity.class, ProfileActivity.class, WeeklyChallengeActivity.class), new b1f(9), null, 80);
        this.h = weeklyStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1f) && this.h.equals(((i1f) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "WeeklyChallengePromotionDemotion(status=" + this.h + ")";
    }
}
