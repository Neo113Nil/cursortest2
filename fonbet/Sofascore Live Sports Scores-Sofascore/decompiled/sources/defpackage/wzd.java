package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wzd implements ct8 {
    public final /* synthetic */ int a;

    public wzd(int i) {
        this.a = i;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((r13) obj).a;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            nq8.h(av8Var, n9e.q(l98.b0(bkh.l(utc.a, 16.0f), 2.0f), lz.D(this.a, av8Var), o7g.a));
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
