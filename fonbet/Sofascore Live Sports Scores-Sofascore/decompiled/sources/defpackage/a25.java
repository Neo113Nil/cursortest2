package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class a25 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a25(ecd ecdVar, int i, boolean z, boolean z2, boolean z3, Function0 function0, int i2) {
        this.h = ecdVar;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = function0;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                un0.f(this.c, this.f, this.d, this.e, (tc3) obj3, (of3) obj, aba.K(this.b | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                oyn.o((ecd) obj3, this.b, this.c, this.d, this.e, this.f, (of3) obj, aba.K(this.g | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ a25(boolean z, Function0 function0, boolean z2, boolean z3, tc3 tc3Var, int i, int i2) {
        this.c = z;
        this.f = function0;
        this.d = z2;
        this.e = z3;
        this.h = tc3Var;
        this.b = i;
        this.g = i2;
    }
}
