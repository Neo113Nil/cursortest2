package defpackage;

import kotlin.jvm.functions.Function2;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class uh3 {
    public static final ih2 a = new ih2("CLOSED", 5);

    public static final Object a(z0h z0hVar, long j, Function2 function2) {
        while (true) {
            z0h z0hVar2 = z0hVar;
            while (true) {
                if (z0hVar2.d >= j && !z0hVar2.d()) {
                    return z0hVar2;
                }
                Object objectVolatile = rh0.a.getObjectVolatile(z0hVar2, vh3.a);
                ih2 ih2Var = a;
                if (objectVolatile == ih2Var) {
                    return ih2Var;
                }
                z0hVar = (z0h) ((vh3) objectVolatile);
                if (z0hVar != null) {
                    break;
                }
                z0h z0hVar3 = (z0h) function2.invoke(Long.valueOf(z0hVar2.d + 1), z0hVar2);
                while (true) {
                    Unsafe unsafe = rh0.a;
                    long j2 = vh3.a;
                    if (unsafe.compareAndSwapObject(z0hVar2, j2, (Object) null, z0hVar3)) {
                        if (z0hVar2.d()) {
                            z0hVar2.e();
                        }
                        z0hVar2 = z0hVar3;
                    } else if (unsafe.getObjectVolatile(z0hVar2, j2) != null) {
                        break;
                    }
                }
            }
        }
    }
}
