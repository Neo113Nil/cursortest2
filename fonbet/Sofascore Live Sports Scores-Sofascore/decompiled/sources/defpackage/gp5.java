package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gp5 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;

    public gp5(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                this.b = new LinkedHashMap();
                break;
        }
    }

    public void a(KClass kClass, Function1 function1, Function1 function12, tc3 tc3Var) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(kClass)) {
            is8.i(46, kClass.getSimpleName(), "An `entry` with the same `clazz` has already been added: ");
        } else {
            linkedHashMap.put(kClass, new fp5(kClass, function1, function12, tc3Var));
        }
    }
}
