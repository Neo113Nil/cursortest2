package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class gj7 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ gj7(int i, long j, Function0 function0, Function0 function02, xtc xtcVar, int i2) {
        this.f = i;
        this.c = j;
        this.d = function0;
        this.e = function02;
        this.b = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                n4o.h(this.f, this.c, this.d, this.e, this.b, of3Var, aba.K(24577));
                break;
            default:
                jca.u(this.b, this.c, this.d, this.e, of3Var, aba.K(this.f | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gj7(xtc xtcVar, long j, Function0 function0, Function0 function02, int i) {
        this.b = xtcVar;
        this.c = j;
        this.d = function0;
        this.e = function02;
        this.f = i;
    }
}
