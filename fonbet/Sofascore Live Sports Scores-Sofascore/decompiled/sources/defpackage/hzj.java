package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class hzj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ phh b;
    public final /* synthetic */ r9k c;

    public /* synthetic */ hzj(phh phhVar, r9k r9kVar, int i, int i2) {
        this.a = i2;
        this.b = phhVar;
        this.c = r9kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        r9k r9kVar = this.c;
        phh phhVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                f5p.i(phhVar, r9kVar, of3Var, aba.K(1));
                break;
            default:
                f5p.g(phhVar, r9kVar, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }
}
