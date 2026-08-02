package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class a05 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ dt8 l;

    public /* synthetic */ a05(q67 q67Var, boolean z, xtc xtcVar, mei meiVar, Function1 function1, Function1 function12, qug qugVar, boolean z2, Function1 function13, int i, int i2) {
        this.i = q67Var;
        this.b = z;
        this.c = xtcVar;
        this.j = meiVar;
        this.d = function1;
        this.e = function12;
        this.k = qugVar;
        this.f = z2;
        this.l = function13;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.j;
        int i2 = this.g;
        Object obj4 = this.k;
        dt8 dt8Var = this.l;
        Object obj5 = this.e;
        Object obj6 = this.i;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                t62.s((String) obj6, this.j, (Function1) obj7, (List) obj4, (Function1) obj5, (xtc) obj8, (ct8) dt8Var, this.b, this.f, (of3) obj, K, this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                tgj.e((q67) obj6, this.b, (xtc) obj8, (mei) obj3, (Function1) obj7, (Function1) obj5, (qug) obj4, this.f, (Function1) dt8Var, (of3) obj, K2, this.h);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                iz8.i((String) obj6, (String) obj3, (String) obj7, (Function0) obj5, (String) obj4, (String) obj8, (Function0) dt8Var, this.b, this.f, (of3) obj, K3, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                int K4 = aba.K(i2 | 1);
                tz9.l(this.b, (Function0) obj3, (xtc) obj8, this.f, (dfh) obj7, (String) obj6, (w8l) obj5, (ct8) dt8Var, (tc3) obj4, (of3) obj, K4, this.h);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ a05(String str, Object obj, Function1 function1, List list, Function1 function12, xtc xtcVar, ct8 ct8Var, boolean z, boolean z2, int i, int i2) {
        this.i = str;
        this.j = obj;
        this.d = function1;
        this.k = list;
        this.e = function12;
        this.c = xtcVar;
        this.l = ct8Var;
        this.b = z;
        this.f = z2;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ a05(String str, String str2, String str3, Function0 function0, String str4, String str5, Function0 function02, boolean z, boolean z2, int i, int i2) {
        this.i = str;
        this.j = str2;
        this.d = str3;
        this.e = function0;
        this.k = str4;
        this.c = str5;
        this.l = function02;
        this.b = z;
        this.f = z2;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ a05(boolean z, Function0 function0, xtc xtcVar, boolean z2, dfh dfhVar, String str, w8l w8lVar, ct8 ct8Var, tc3 tc3Var, int i, int i2) {
        this.b = z;
        this.j = function0;
        this.c = xtcVar;
        this.f = z2;
        this.d = dfhVar;
        this.i = str;
        this.e = w8lVar;
        this.l = ct8Var;
        this.k = tc3Var;
        this.g = i;
        this.h = i2;
    }
}
