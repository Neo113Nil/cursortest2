package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ttj implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ zp2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ ttj(zp2 zp2Var, int i, int i2, Function1 function1, boolean z, int i3) {
        this.a = i3;
        this.b = zp2Var;
        this.c = i;
        this.d = i2;
        this.e = function1;
        this.f = z;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final qze qzeVar, rq3 rq3Var) {
        switch (this.a) {
            case 0:
                final zp2 zp2Var = this.b;
                final int i = this.c;
                final int i2 = this.d;
                final Function1 function1 = this.e;
                final boolean z = this.f;
                Object d = rti.d(qzeVar, null, new Function1() { // from class: stj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ooi ooiVar = (ooi) qzeVar;
                        function1.invoke(Integer.valueOf(new aq2(zp2.this, (int) (((ooi) r1).x >> 32), (int) (ooiVar.x & 4294967295L), i, i2).c(Float.intBitsToFloat((int) (((dnd) obj).a >> 32)), (int) (ooiVar.x >> 32), z)));
                        return Unit.a;
                    }
                }, rq3Var, 7);
                if (d != lu3.a) {
                    break;
                }
                break;
            default:
                vm7 vm7Var = new vm7(this.b, qzeVar, this.c, this.d, this.e, this.f);
                float f = e95.a;
                Object s = oyn.s(qzeVar, new z85(new qz4(17), vm7Var, new wc4(22), new wc4(23), (rq3) null, 1), rq3Var);
                lu3 lu3Var = lu3.a;
                if (s != lu3Var) {
                    s = Unit.a;
                }
                if (s != lu3Var) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
