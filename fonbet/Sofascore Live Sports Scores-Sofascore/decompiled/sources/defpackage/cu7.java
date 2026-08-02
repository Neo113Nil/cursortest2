package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class cu7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ int e;

    public /* synthetic */ cu7(int i, xtc xtcVar, int i2, int i3) {
        this.a = 0;
        this.b = i;
        this.d = xtcVar;
        this.c = i2;
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        xtc xtcVar = this.d;
        int i3 = this.c;
        int i4 = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                iu7.f(i4, aba.K(i3 | 1), i2, of3Var, xtcVar);
                break;
            case 1:
                z5l.d(i4, i3, aba.K(i2 | 1), of3Var, xtcVar);
                break;
            default:
                l98.z(i4, i3, aba.K(i2 | 1), of3Var, xtcVar);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cu7(int i, int i2, xtc xtcVar, int i3, int i4) {
        this.a = i4;
        this.b = i;
        this.c = i2;
        this.d = xtcVar;
        this.e = i3;
    }
}
