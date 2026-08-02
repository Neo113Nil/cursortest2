package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface xtc {
    Object a(Object obj, Function2 function2);

    boolean f(Function1 function1);

    default xtc z(xtc xtcVar) {
        return xtcVar == utc.a ? this : new q33(this, xtcVar);
    }
}
