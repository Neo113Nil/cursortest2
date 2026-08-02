package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yij extends xka implements Function1 {
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yij(long j) {
        super(1);
        this.i = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            a70.r("Start the timer with startTimer before calling addTime");
            return null;
        }
        wd5 wd5Var = xd5.b;
        long j = this.i;
        if (j > 0) {
            return Long.valueOf(xd5.e(j) + l.longValue());
        }
        a70.p("Cannot call addTime with a negative duration");
        return null;
    }
}
