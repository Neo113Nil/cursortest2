package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class lr1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0i b;
    public final /* synthetic */ xtc c;

    public /* synthetic */ lr1(v0i v0iVar, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = v0iVar;
        this.c = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        xtc xtcVar = this.c;
        v0i v0iVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ww9.a(v0iVar, xtcVar, of3Var, aba.K(1));
                break;
            default:
                rd0.l(v0iVar, xtcVar, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }
}
