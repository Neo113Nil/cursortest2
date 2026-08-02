package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw6 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ gw6(y7l y7lVar, boolean z, String str, String str2, boolean z2, tee teeVar, boolean z3, boolean z4, vy8 vy8Var, int i) {
        this.g = y7lVar;
        this.b = z;
        this.c = str;
        this.h = str2;
        this.d = z2;
        this.i = teeVar;
        this.e = z3;
        this.f = z4;
        this.j = vy8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                c5n.e(this.c, this.b, this.d, this.e, (Function0) obj6, (Function0) obj5, (Function1) obj4, (xtc) obj3, this.f, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                o6a.g((y7l) obj6, this.b, this.c, (String) obj5, this.d, (tee) obj4, this.e, this.f, (vy8) obj3, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gw6(String str, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, Function1 function1, xtc xtcVar, boolean z4, int i) {
        this.c = str;
        this.b = z;
        this.d = z2;
        this.e = z3;
        this.g = function0;
        this.h = function02;
        this.i = function1;
        this.j = xtcVar;
        this.f = z4;
    }
}
