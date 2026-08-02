package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class imj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9i b;
    public final /* synthetic */ gv9 c;
    public final /* synthetic */ int d;

    public /* synthetic */ imj(e9i e9iVar, gv9 gv9Var, int i, int i2) {
        this.a = i2;
        this.b = e9iVar;
        this.c = gv9Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        gv9 gv9Var = this.c;
        e9i e9iVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c6o.r(e9iVar, gv9Var, of3Var, aba.K(i2 | 1));
                break;
            default:
                c6o.v(e9iVar, gv9Var, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
