package defpackage;

import com.sofascore.model.weeklyChallenge.WeeklyStatus;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b3l {
    public final p4b a;
    public final WeeklyStatus b;
    public final int c;
    public final Integer d;
    public final boolean e;

    public b3l(p4b p4bVar, WeeklyStatus weeklyStatus, int i, Integer num, boolean z) {
        weeklyStatus.getClass();
        this.a = p4bVar;
        this.b = weeklyStatus;
        this.c = i;
        this.d = num;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3l)) {
            return false;
        }
        b3l b3lVar = (b3l) obj;
        return this.a.equals(b3lVar.a) && Intrinsics.c(this.b, b3lVar.b) && this.c == b3lVar.c && Intrinsics.c(this.d, b3lVar.d) && this.e == b3lVar.e;
    }

    public final int hashCode() {
        int a = wv8.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((a + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WeeklyChallengeResultWrapper(newLeagueAsset=");
        sb.append(this.a);
        sb.append(", weeklyStatus=");
        sb.append(this.b);
        sb.append(", streakCount=");
        sb.append(this.c);
        sb.append(", previousStreakCount=");
        sb.append(this.d);
        sb.append(", streakBroken=");
        return wt3.p(sb, this.e, ")");
    }
}
