package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface m1c extends l9a {
    static l1c G0(m1c m1cVar, int i, int i2, Function1 function1) {
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return m1cVar.v0(i, i2, lm5Var, function1);
    }

    l1c M0(int i, int i2, Map map, Function1 function1, Function1 function12);

    default l1c v0(int i, int i2, Map map, Function1 function1) {
        return M0(i, i2, map, null, function1);
    }
}
