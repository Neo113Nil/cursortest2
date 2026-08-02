package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class h47 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Comparable h;
    public final /* synthetic */ Serializable i;
    public final /* synthetic */ Object j;

    public /* synthetic */ h47(n8b n8bVar, int i, r8b r8bVar, bnf bnfVar, boolean z, xtc xtcVar, boolean z2, Function1 function1, int i2) {
        this.g = n8bVar;
        this.b = i;
        this.h = r8bVar;
        this.i = bnfVar;
        this.c = z;
        this.d = xtcVar;
        this.e = z2;
        this.j = function1;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.j;
        Serializable serializable = this.i;
        Comparable comparable = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                dy0.e((String) obj4, (String) comparable, (ev6) serializable, this.c, this.e, (Function0) obj3, this.d, (of3) obj, K, this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(this.f | 1);
                b9b.c((n8b) obj4, this.b, (r8b) comparable, (bnf) serializable, this.c, this.d, this.e, (Function1) obj3, (of3) obj, K2);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(i2 | 1);
                i9a.i((Double) obj4, this.c, this.d, (p75) comparable, (Integer) serializable, (p75) obj3, this.e, (of3) obj, K3, this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ h47(Double d, boolean z, xtc xtcVar, p75 p75Var, Integer num, p75 p75Var2, boolean z2, int i, int i2) {
        this.g = d;
        this.c = z;
        this.d = xtcVar;
        this.h = p75Var;
        this.i = num;
        this.j = p75Var2;
        this.e = z2;
        this.b = i;
        this.f = i2;
    }

    public /* synthetic */ h47(String str, String str2, ev6 ev6Var, boolean z, boolean z2, Function0 function0, xtc xtcVar, int i, int i2) {
        this.g = str;
        this.h = str2;
        this.i = ev6Var;
        this.c = z;
        this.e = z2;
        this.j = function0;
        this.d = xtcVar;
        this.b = i;
        this.f = i2;
    }
}
