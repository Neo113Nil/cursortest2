package q4;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final c4.k f21995a = new c4.k(e0.f19204a);

    /* renamed from: b, reason: collision with root package name */
    public static final c4.k f21996b = new c4.k(ci.c.c(4096, 4096));

    /* renamed from: c, reason: collision with root package name */
    public static final c4.k f21997c = new c4.k(Boolean.FALSE);

    /* renamed from: d, reason: collision with root package name */
    public static final c4.k f21998d = new c4.k(Boolean.TRUE);

    public static final void a(e eVar, List list) {
        c4.j jVar;
        Object obj = eVar.q;
        if (obj instanceof c4.j) {
            jVar = (c4.j) obj;
        } else {
            if (!(obj instanceof c4.l)) {
                throw new AssertionError();
            }
            c4.j jVar2 = new c4.j((c4.l) obj);
            eVar.q = jVar2;
            jVar = jVar2;
        }
        List a02 = ci.c.a0(list);
        LinkedHashMap linkedHashMap = jVar.f3592a;
        c4.k kVar = f21995a;
        if (a02 != null) {
            linkedHashMap.put(kVar, a02);
        } else {
            linkedHashMap.remove(kVar);
        }
        String J = CollectionsKt.J(list, null, null, null, new a2.f(17, new Ref.IntRef()), 31);
        if (J != null) {
            eVar.b().put("coil#transformations", J);
        } else {
            eVar.b().remove("coil#transformations");
        }
    }
}
