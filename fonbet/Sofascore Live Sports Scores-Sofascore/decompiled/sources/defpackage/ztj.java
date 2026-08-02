package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ztj {
    public static final br3 a = new br3(3, null, 9);
    public static final tyd b = tyd.u;

    public static Object a(ArrayList arrayList, Map map, ct8 ct8Var, aob aobVar, Function1 function1, hoi hoiVar, int i) {
        Object P;
        if ((i & 1) != 0) {
            map = lm5.a;
            map.getClass();
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            aobVar = null;
        }
        aob aobVar2 = aobVar;
        if (arrayList.isEmpty()) {
            cjb.b("fireTrackers called with no URLs.");
            P = Unit.a;
        } else {
            P = tz9.P(new jk((Object) arrayList, (Object) map2, (Object) ct8Var, (Object) aobVar2, (dt8) function1, (rq3) null, 23), hoiVar);
            if (P != lu3.a) {
                P = Unit.a;
            }
        }
        return P == lu3.a ? P : Unit.a;
    }
}
