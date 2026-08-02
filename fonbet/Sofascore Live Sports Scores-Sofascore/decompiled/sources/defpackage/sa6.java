package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4c b;
    public final /* synthetic */ String c;

    public /* synthetic */ sa6(s4c s4cVar, String str, int i, int i2) {
        this.a = i2;
        this.b = s4cVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        String str = this.c;
        s4c s4cVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                fcp.V(s4cVar, str, of3Var, aba.K(1));
                break;
            default:
                fcp.F(s4cVar, str, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }
}
