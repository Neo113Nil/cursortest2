package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class s10 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ s10(tc3 tc3Var, Function0 function0, xtc xtcVar, Function2 function2, boolean z, cfc cfcVar, p3e p3eVar, wzc wzcVar, int i, int i2) {
        this.g = tc3Var;
        this.d = function0;
        this.b = xtcVar;
        this.h = function2;
        this.c = z;
        this.i = cfcVar;
        this.j = p3eVar;
        this.k = wzcVar;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                u10.b((tc3) obj7, this.d, this.b, (Function2) obj6, this.c, (cfc) obj5, (p3e) obj4, (wzc) obj3, (of3) obj, K, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                rd0.q((String) obj7, (String) obj6, this.b, (ct8) obj5, this.c, (Function1) obj4, this.d, (qqk) obj3, (of3) obj, K2, this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ s10(String str, String str2, xtc xtcVar, ct8 ct8Var, boolean z, Function1 function1, Function0 function0, qqk qqkVar, int i, int i2) {
        this.g = str;
        this.h = str2;
        this.b = xtcVar;
        this.i = ct8Var;
        this.c = z;
        this.j = function1;
        this.d = function0;
        this.k = qqkVar;
        this.e = i;
        this.f = i2;
    }
}
