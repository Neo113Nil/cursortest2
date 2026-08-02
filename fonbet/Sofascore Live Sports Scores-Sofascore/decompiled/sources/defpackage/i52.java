package defpackage;

import com.sofascore.model.weeklyChallenge.WeeklyStatus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i52 extends j52 {
    public final WeeklyStatus a;

    public i52(WeeklyStatus weeklyStatus) {
        this.a = weeklyStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i52) && this.a.equals(((i52) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WeeklyChallenge(weeklyStatus=" + this.a + ")";
    }
}
