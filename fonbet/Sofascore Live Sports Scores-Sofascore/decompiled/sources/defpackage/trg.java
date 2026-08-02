package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface trg {
    List a();

    tc3 getContent();

    List getEntries();

    Object getKey();

    default Map x() {
        Map map;
        e7d e7dVar = (e7d) CollectionsKt.j0(getEntries());
        if (e7dVar != null && (map = e7dVar.c) != null) {
            return map;
        }
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return lm5Var;
    }
}
