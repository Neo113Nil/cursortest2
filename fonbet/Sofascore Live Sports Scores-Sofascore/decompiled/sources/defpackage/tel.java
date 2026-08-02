package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class tel implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iel b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ tel(iel ielVar, boolean z, Function1 function1, int i, int i2) {
        this.a = i2;
        this.b = ielVar;
        this.c = z;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                z1a.d(this.b, this.c, this.d, of3Var, aba.K(this.e | 1));
                break;
            default:
                v8a.g(this.b, this.c, this.d, of3Var, aba.K(this.e | 1));
                break;
        }
        return Unit.a;
    }
}
