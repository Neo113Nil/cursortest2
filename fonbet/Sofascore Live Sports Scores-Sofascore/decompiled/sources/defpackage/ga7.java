package defpackage;

import com.moloco.sdk.internal.publisher.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga7 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ga7(Function1 function1, xtc xtcVar, Function1 function12, int i) {
        this.b = function1;
        this.c = xtcVar;
        this.d = function12;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Function1 function1 = this.d;
        xtc xtcVar = this.c;
        Function1 function12 = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                f5p.e(aba.K(i2 | 1), of3Var, xtcVar, function12, function1);
                break;
            default:
                h0.h(i2 | 1, of3Var, xtcVar, function12, function1);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ga7(Function1 function1, Function1 function12, xtc xtcVar, int i) {
        this.b = function1;
        this.d = function12;
        this.c = xtcVar;
        this.e = i;
    }
}
