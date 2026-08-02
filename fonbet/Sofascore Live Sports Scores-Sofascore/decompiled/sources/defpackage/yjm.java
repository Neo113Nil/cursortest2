package defpackage;

import defpackage.gim;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class yjm {
    public static final Pair a(gim gimVar) {
        gimVar.getClass();
        if (gimVar instanceof gim.d) {
            gim.d dVar = (gim.d) gimVar;
            return new Pair(dVar.a.l, dVar.b.p);
        }
        if (gimVar instanceof gim.b) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return new Pair(lm5Var, ((gim.b) gimVar).a.p);
        }
        if (gimVar instanceof gim.e) {
            lm5 lm5Var2 = lm5.a;
            lm5Var2.getClass();
            return new Pair(lm5Var2, ((gim.e) gimVar).a.p);
        }
        if (!(gimVar instanceof gim.a) && !(gimVar instanceof gim.c)) {
            zzl.b();
            return null;
        }
        lm5 lm5Var3 = lm5.a;
        lm5Var3.getClass();
        lm5Var3.getClass();
        return new Pair(lm5Var3, lm5Var3);
    }

    public static Map mergedExtraInfo$default(gim gimVar, pvm pvmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pvmVar = pvm.PLAYABLE_WINS;
        }
        gimVar.getClass();
        pvmVar.getClass();
        Pair a = a(gimVar);
        Map map = (Map) a.a;
        Map map2 = (Map) a.b;
        int ordinal = pvmVar.ordinal();
        if (ordinal == 0) {
            LinkedHashMap q = tub.q(map);
            q.putAll(map2);
            return q;
        }
        if (ordinal != 1) {
            zzl.b();
            return null;
        }
        LinkedHashMap q2 = tub.q(map2);
        q2.putAll(map);
        return q2;
    }
}
