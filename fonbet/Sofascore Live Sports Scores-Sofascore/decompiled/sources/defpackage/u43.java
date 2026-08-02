package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class u43 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lcj b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ tc3 d;
    public final /* synthetic */ int e;

    public /* synthetic */ u43(lcj lcjVar, boolean z, tc3 tc3Var, int i, int i2) {
        this.a = i2;
        this.b = lcjVar;
        this.c = z;
        this.d = tc3Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        tc3 tc3Var = this.d;
        boolean z = this.c;
        lcj lcjVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                o02.g(lcjVar, z, tc3Var, of3Var, aba.K(i2 | 1));
                break;
            default:
                lz.f(lcjVar, z, tc3Var, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
