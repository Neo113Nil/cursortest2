package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ri4 implements Function2 {
    public final /* synthetic */ int a = 4;
    public final /* synthetic */ Object b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ri4(c9b c9bVar, r8b r8bVar, bnf bnfVar, boolean z, xtc xtcVar, boolean z2, Function1 function1, int i) {
        this.f = c9bVar;
        this.g = r8bVar;
        this.b = bnfVar;
        this.d = z;
        this.c = xtcVar;
        this.e = z2;
        this.h = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.h;
        Object obj4 = this.b;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(49);
                oj4.m((String) obj6, this.c, this.d, this.e, (Function0) obj4, (String) obj5, (ci4) obj3, (of3) obj, K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                i56.c((vte) obj6, (Function1) obj5, (Function0) obj4, this.c, (Function0) obj3, this.d, this.e, (of3) obj, K2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int K3 = aba.K(1);
                tgj.d(this.d, (Function2) obj4, (String) obj6, (String) obj5, this.c, (qug) obj3, this.e, (of3) obj, K3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int K4 = aba.K(1572865);
                l6g.j((String) obj6, this.d, this.e, (String) obj5, (Function0) obj4, (Function0) obj3, this.c, (of3) obj, K4);
                break;
            default:
                ((Integer) obj2).getClass();
                int K5 = aba.K(1);
                v9g.m((c9b) obj6, (r8b) obj5, (bnf) obj4, this.d, this.c, this.e, (Function1) obj3, (of3) obj, K5);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ri4(vte vteVar, Function1 function1, Function0 function0, xtc xtcVar, Function0 function02, boolean z, boolean z2, int i) {
        this.f = vteVar;
        this.g = function1;
        this.b = function0;
        this.c = xtcVar;
        this.h = function02;
        this.d = z;
        this.e = z2;
    }

    public /* synthetic */ ri4(String str, xtc xtcVar, boolean z, boolean z2, Function0 function0, String str2, ci4 ci4Var, int i) {
        this.f = str;
        this.c = xtcVar;
        this.d = z;
        this.e = z2;
        this.b = function0;
        this.g = str2;
        this.h = ci4Var;
    }

    public /* synthetic */ ri4(String str, boolean z, boolean z2, String str2, Function0 function0, Function0 function02, xtc xtcVar, int i) {
        this.f = str;
        this.d = z;
        this.e = z2;
        this.g = str2;
        this.b = function0;
        this.h = function02;
        this.c = xtcVar;
    }

    public /* synthetic */ ri4(boolean z, Function2 function2, String str, String str2, xtc xtcVar, qug qugVar, boolean z2, int i) {
        this.d = z;
        this.b = function2;
        this.f = str;
        this.g = str2;
        this.c = xtcVar;
        this.h = qugVar;
        this.e = z2;
    }
}
