package defpackage;

import com.blaze.blazesdk.database.BlazeDatabase;
import java.util.List;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mgm {
    public static final mgm a = new mgm();
    public static final trl b;
    public static final i9m c;
    public static final kqm d;
    public static final int e;
    public static final int f;
    public static final ddm g;

    static {
        String str;
        Integer intOrNull;
        String str2;
        Integer intOrNull2;
        BlazeDatabase.Companion companion = BlazeDatabase.INSTANCE;
        BlazeDatabase instance = companion.instance();
        b = instance != null ? instance.getStoryPageDao() : null;
        BlazeDatabase instance2 = companion.instance();
        c = instance2 != null ? instance2.getMomentsViewedDao() : null;
        d = kqm.a;
        tul tulVar = jdm.d;
        uul uulVar = tulVar != null ? tulVar.a : null;
        e = (uulVar == null || (str2 = uulVar.e) == null || (intOrNull2 = StringsKt.toIntOrNull(str2)) == null) ? 10 : intOrNull2.intValue();
        tul tulVar2 = jdm.d;
        uul uulVar2 = tulVar2 != null ? tulVar2.a : null;
        f = (uulVar2 == null || (str = uulVar2.f) == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 20 : intOrNull.intValue();
        g = new ddm(null);
    }

    public static Object a(int i, rq3 rq3Var) {
        trl trlVar = b;
        int f2 = trlVar != null ? trlVar.f() : 0;
        i9m i9mVar = c;
        int e2 = i9mVar != null ? i9mVar.e() : 0;
        int i2 = f2 + e2;
        if (i2 <= 0 || i2 < i) {
            return Unit.a;
        }
        List list = null;
        List g2 = f2 > 0 ? trlVar != null ? trlVar.g() : null : km5.a;
        if (e2 <= 0) {
            list = km5.a;
        } else if (i9mVar != null) {
            list = i9mVar.f();
        }
        if (g2 == null) {
            g2 = km5.a;
        }
        if (list == null) {
            list = km5.a;
        }
        Object b2 = d.b(g2, list, rq3Var);
        return b2 == lu3.a ? b2 : Unit.a;
    }

    public static /* synthetic */ Object postUserActivity$default(mgm mgmVar, int i, rq3 rq3Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = e;
        }
        mgmVar.getClass();
        return a(i, rq3Var);
    }
}
