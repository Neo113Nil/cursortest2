package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public interface esa {
    static /* synthetic */ void b(esa esaVar, String str, tc3 tc3Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        esaVar.c(str, null, tc3Var);
    }

    static /* synthetic */ void d(esa esaVar, Object obj, Object obj2, ct8 ct8Var, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        esaVar.f(obj, obj2, ct8Var);
    }

    static /* synthetic */ void e(esa esaVar, int i, Function1 function1, isa isaVar, tc3 tc3Var, int i2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Function1 function12 = isaVar;
        if ((i2 & 4) != 0) {
            function12 = rg2.l;
        }
        esaVar.a(i, function1, function12, tc3Var);
    }

    void a(int i, Function1 function1, Function1 function12, tc3 tc3Var);

    void c(Object obj, Object obj2, tc3 tc3Var);

    void f(Object obj, Object obj2, ct8 ct8Var);
}
