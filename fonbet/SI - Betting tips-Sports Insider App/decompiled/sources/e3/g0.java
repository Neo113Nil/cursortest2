package e3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 extends l0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Class workerClass) {
        super(workerClass);
        TimeUnit repeatIntervalTimeUnit = TimeUnit.HOURS;
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        m3.o oVar = this.f8541c;
        long millis = repeatIntervalTimeUnit.toMillis(1L);
        oVar.getClass();
        String str = m3.o.f20330z;
        if (millis < 900000) {
            x.e().h(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j = millis < 900000 ? 900000L : millis;
        long j6 = millis < 900000 ? 900000L : millis;
        if (j < 900000) {
            x.e().h(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        oVar.f20338h = j >= 900000 ? j : 900000L;
        if (j6 < 300000) {
            x.e().h(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j6 > oVar.f20338h) {
            x.e().h(str, "Flex duration greater than interval duration; Changed to " + j);
        }
        oVar.f20339i = zf.j.b(j6, 300000L, oVar.f20338h);
    }

    @Override // e3.l0
    public final m0 c() {
        if (this.f8539a && this.f8541c.j.f8509d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        if (this.f8541c.q) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        Intrinsics.checkNotNullParameter(this, "builder");
        return new h0(this.f8540b, this.f8541c, this.f8542d);
    }

    @Override // e3.l0
    public final l0 d() {
        return this;
    }
}
