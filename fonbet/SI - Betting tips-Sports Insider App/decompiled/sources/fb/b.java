package fb;

import a2.i;
import cd.k;
import com.google.android.gms.internal.measurement.y3;
import eg.c0;
import eg.m0;
import f3.x;
import hb.e;
import hb.f;
import hb.g;
import j$.time.Instant;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lg.d;
import mf.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class b extends x {
    public static long L0(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        g N0 = N0();
        N0.getClass();
        Intrinsics.checkNotNullParameter(name, "key");
        f fVar = N0.f10480a;
        Integer valueOf = Integer.valueOf((int) Instant.now().getEpochSecond());
        fVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        return ((Number) x.n0(fVar.f10479a, false, true, new i(name, str, valueOf, 2))).longValue();
    }

    public static int M0(List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        g N0 = N0();
        N0.getClass();
        Intrinsics.checkNotNullParameter(ids, "ids");
        f fVar = N0.f10480a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(ids, "ids");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" DELETE FROM events_table WHERE id IN (");
        m4.g.c(ids.size(), sb2);
        sb2.append(") ");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return ((Number) x.n0(fVar.f10479a, false, true, new e(sb3, ids, 0))).intValue();
    }

    public static g N0() {
        return (g) y3.m(g.class, null, 6);
    }

    public static List O0() {
        List list = (List) x.n0(N0().f10480a.f10479a, true, false, new f1.a(23));
        return list != null ? CollectionsKt.D(list) : e0.f19204a;
    }

    public static rb.g P0() {
        return (rb.g) y3.m(rb.g.class, null, 6);
    }

    public void K0(Integer num, Integer num2, Integer num3, Integer num4) {
        ((Number) x.n0(x.e0().f23426a.f23832a, false, true, new b2.f(1, Integer.valueOf(num.intValue()), Integer.valueOf(num2.intValue()), Integer.valueOf(num3.intValue()), Integer.valueOf(num4.intValue())))).intValue();
    }

    public Object Q0(int i5, int i10, c cVar) {
        lg.e eVar = m0.f9201a;
        Object A = c0.A(d.f20063c, new k(this, i5, i10, null, 2), cVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }
}
