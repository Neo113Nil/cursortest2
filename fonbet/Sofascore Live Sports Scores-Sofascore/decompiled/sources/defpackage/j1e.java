package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1e implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m1e b;
    public final /* synthetic */ int c;

    public /* synthetic */ j1e(m1e m1eVar, int i, int i2) {
        this.a = i2;
        this.b = m1eVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        m1e m1eVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                xw3.n(m1eVar, of3Var, aba.K(i2 | 1));
                break;
            default:
                xw3.q(m1eVar, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
