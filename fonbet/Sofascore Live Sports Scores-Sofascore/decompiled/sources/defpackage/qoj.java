package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class qoj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9i b;
    public final /* synthetic */ ooj c;
    public final /* synthetic */ int d;

    public /* synthetic */ qoj(e9i e9iVar, ooj oojVar, int i, int i2) {
        this.a = i2;
        this.b = e9iVar;
        this.c = oojVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        ooj oojVar = this.c;
        e9i e9iVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                rfo.n(e9iVar, oojVar, of3Var, aba.K(i2 | 1));
                break;
            case 1:
                rfo.o(e9iVar, oojVar, of3Var, aba.K(i2 | 1));
                break;
            case 2:
                rfo.l(e9iVar, oojVar, of3Var, aba.K(i2 | 1));
                break;
            default:
                rfo.r(e9iVar, oojVar, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
