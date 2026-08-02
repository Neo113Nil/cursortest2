package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zh9 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final yh9 d = new yh9(0);

    public zh9() {
        int i = xje.a;
    }

    public final void a(ii9 ii9Var, Function1 function1) {
        ii9Var.getClass();
        pm0 key = ii9Var.getKey();
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.put(ii9Var.getKey(), new ja1((Function1) linkedHashMap.get(key), function1, 2));
        pm0 key2 = ii9Var.getKey();
        LinkedHashMap linkedHashMap2 = this.a;
        if (linkedHashMap2.containsKey(key2)) {
            return;
        }
        linkedHashMap2.put(ii9Var.getKey(), new yx7(ii9Var, 22));
    }
}
