package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class cfl implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cfl(Object obj, boolean z, Function1 function1, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = z;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function1 function1 = this.c;
        boolean z = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                o3a.b((afl) obj3, z, function1, (of3) obj, aba.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                d7a.l((wil) obj3, z, function1, (of3) obj, aba.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                d7a.c((wci) obj3, z, function1, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                haa.h((hjl) obj3, z, function1, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }
}
