package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class st9 {
    public static final sl6 a = new sl6(km5.a);
    public static final sl6 b = new sl6(aba.g(4096, 4096));
    public static final sl6 c = new sl6(Boolean.FALSE);
    public static final sl6 d = new sl6(Boolean.TRUE);

    public static final void a(ht9 ht9Var, boolean z) {
        int i = z ? 200 : 0;
        sl6 sl6Var = vt9.a;
        ht9Var.b().a(vt9.a, i > 0 ? new g24(i) : qwj.a);
    }

    public static final void b(ht9 ht9Var, List list) {
        ht9Var.b().a(a, fcp.n0(list));
        String f0 = CollectionsKt.f0(list, null, null, null, new pt9(new dsf(), 0), 31);
        Map map = ht9Var.h;
        if (!Intrinsics.c(map, Boolean.valueOf(ht9Var.g))) {
            if (!(map instanceof Map)) {
                ogj.b();
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            ht9Var.h = linkedHashMap;
            ht9Var.g = true;
            map = linkedHashMap;
        }
        map.getClass();
        i5k.c(map).put("coil#transformations", f0);
    }
}
