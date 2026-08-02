package defpackage;

import com.sofascore.model.weeklyChallenge.WeeklyStatus;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s3l implements t3l {
    public final l3l a;
    public final WeeklyStatus b;
    public final int c;
    public final Integer d;
    public final p4b e;

    public s3l(l3l l3lVar, WeeklyStatus weeklyStatus, int i, Integer num, p4b p4bVar) {
        weeklyStatus.getClass();
        this.a = l3lVar;
        this.b = weeklyStatus;
        this.c = i;
        this.d = num;
        this.e = p4bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3l)) {
            return false;
        }
        s3l s3lVar = (s3l) obj;
        return this.a.equals(s3lVar.a) && Intrinsics.c(this.b, s3lVar.b) && this.c == s3lVar.c && Intrinsics.c(this.d, s3lVar.d) && this.e.equals(s3lVar.e);
    }

    public final int hashCode() {
        int a = wv8.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        Integer num = this.d;
        return this.e.hashCode() + ((a + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "Success(weeklyChallengeUiModel=" + this.a + ", weeklyStatus=" + this.b + ", weeklyStreakCount=" + this.c + ", previousStreakCount=" + this.d + ", newLeagueAsset=" + this.e + ")";
    }
}
