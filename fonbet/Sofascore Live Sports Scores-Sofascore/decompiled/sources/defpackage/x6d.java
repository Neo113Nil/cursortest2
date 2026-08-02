package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class x6d implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ xtc g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ x6d(w3f w3fVar, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Function1 function1, Function0 function0, Function2 function2, xtc xtcVar, int i3) {
        this.h = w3fVar;
        this.b = i;
        this.c = i2;
        this.i = num;
        this.j = num2;
        this.k = num3;
        this.l = num4;
        this.d = function1;
        this.e = function0;
        this.f = function2;
        this.g = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1 | this.b);
                int K2 = aba.K(this.c);
                r4a.e((ArrayList) obj7, this.g, (io) obj6, (List) obj5, (List) obj4, this.d, (Function1) obj3, this.f, this.e, (of3) obj, K, K2);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(1);
                r4a.g((w3f) obj7, this.b, this.c, (Integer) obj6, (Integer) obj5, (Integer) obj4, (Integer) obj3, this.d, this.e, this.f, this.g, (of3) obj, K3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x6d(ArrayList arrayList, xtc xtcVar, io ioVar, List list, List list2, Function1 function1, Function1 function12, Function2 function2, Function0 function0, int i, int i2) {
        this.h = arrayList;
        this.g = xtcVar;
        this.i = ioVar;
        this.j = list;
        this.k = list2;
        this.d = function1;
        this.l = function12;
        this.f = function2;
        this.e = function0;
        this.b = i;
        this.c = i2;
    }
}
