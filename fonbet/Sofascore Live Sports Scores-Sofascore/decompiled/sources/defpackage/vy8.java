package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface vy8 {
    Object a(Object obj, Function2 function2);

    boolean b();

    boolean c(Function1 function1);

    default vy8 d(vy8 vy8Var) {
        return vy8Var == ty8.a ? this : new o33(this, vy8Var);
    }
}
