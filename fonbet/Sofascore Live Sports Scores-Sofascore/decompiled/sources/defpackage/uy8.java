package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface uy8 extends vy8 {
    @Override // defpackage.vy8
    default Object a(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.vy8
    default boolean b() {
        return Boolean.TRUE.booleanValue();
    }

    @Override // defpackage.vy8
    default boolean c(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
