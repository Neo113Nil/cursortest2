package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class if2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j5e b;
    public final /* synthetic */ sx2 c;

    public /* synthetic */ if2(j5e j5eVar, sx2 sx2Var, int i) {
        this.a = i;
        this.b = j5eVar;
        this.c = sx2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        sx2 sx2Var = this.c;
        j5e j5eVar = this.b;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                j5eVar.c(sx2Var, intValue, intValue2);
                break;
            default:
                j5eVar.c(sx2Var, intValue, intValue2);
                break;
        }
        return Unit.a;
    }
}
