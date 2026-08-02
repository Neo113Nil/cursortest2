package db;

import a2.k;
import f3.x;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f8358a;

    public a(e generalDao) {
        Intrinsics.checkNotNullParameter(generalDao, "generalDao");
        this.f8358a = generalDao;
    }

    public final Integer a(String nameId) {
        e eVar = this.f8358a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(nameId, "nameId");
        return (Integer) x.n0(eVar.f8364a, true, false, new k(nameId, 3));
    }

    public final void b(Integer num, String nameId) {
        e eVar = this.f8358a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(nameId, "nameId");
        if (((Number) x.n0(eVar.f8364a, true, false, new k(nameId, 2))).intValue() > 0) {
            Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
            eVar.getClass();
            Intrinsics.checkNotNullParameter(nameId, "nameId");
            ((Number) x.n0(eVar.f8364a, false, true, new d(valueOf, nameId))).intValue();
            return;
        }
        Integer valueOf2 = Integer.valueOf(num != null ? num.intValue() : 0);
        eVar.getClass();
        Intrinsics.checkNotNullParameter(nameId, "nameId");
        ((Number) x.n0(eVar.f8364a, false, true, new d(nameId, valueOf2))).longValue();
    }
}
