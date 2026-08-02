package p3;

import a2.k;
import e3.x;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m3.i;
import m3.j;
import m3.l;
import m3.o;
import m3.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21510a;

    static {
        String g10 = x.g("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(g10, "tagWithPrefix(...)");
        f21510a = g10;
    }

    public static final String a(l lVar, u uVar, i iVar, List list) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            j j = m4.g.j(oVar);
            String id2 = oVar.f20331a;
            m3.g a7 = iVar.a(j);
            Integer valueOf = a7 != null ? Integer.valueOf(a7.f20315c) : null;
            lVar.getClass();
            Intrinsics.checkNotNullParameter(id2, "workSpecId");
            String J = CollectionsKt.J((List) f3.x.n0(lVar.f20325a, true, false, new k(id2, 12)), StringUtils.COMMA, null, null, null, 62);
            uVar.getClass();
            Intrinsics.checkNotNullParameter(id2, "id");
            String J2 = CollectionsKt.J((List) f3.x.n0(uVar.f20365a, true, false, new k(id2, 25)), StringUtils.COMMA, null, null, null, 62);
            StringBuilder p10 = d9.e.p("\n", id2, "\t ");
            p10.append(oVar.f20333c);
            p10.append("\t ");
            p10.append(valueOf);
            p10.append("\t ");
            p10.append(oVar.f20332b.name());
            p10.append("\t ");
            p10.append(J);
            p10.append("\t ");
            p10.append(J2);
            p10.append('\t');
            sb2.append(p10.toString());
        }
        return sb2.toString();
    }
}
