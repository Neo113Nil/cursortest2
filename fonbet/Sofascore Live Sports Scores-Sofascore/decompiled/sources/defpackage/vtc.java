package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface vtc extends xtc {
    @Override // defpackage.xtc
    default Object a(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.xtc
    default boolean f(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
