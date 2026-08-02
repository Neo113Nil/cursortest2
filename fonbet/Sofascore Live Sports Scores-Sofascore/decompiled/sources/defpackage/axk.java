package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class axk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dxk b;

    public /* synthetic */ axk(dxk dxkVar, int i, int i2) {
        this.a = i2;
        this.b = dxkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                b0a.w(this.b, of3Var, aba.K(1));
                break;
            case 1:
                b0a.q(this.b, of3Var, aba.K(1));
                break;
            case 2:
                b0a.g(this.b, of3Var, aba.K(1));
                break;
            default:
                b0a.j(this.b, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }
}
