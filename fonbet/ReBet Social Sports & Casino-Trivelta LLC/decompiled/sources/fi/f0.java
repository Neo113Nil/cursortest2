package fi;

import bi.AbstractC2426b;
import bi.m;
import bi.n;
import ei.AbstractC4212b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class f0 {
    public static final bi.f a(bi.f fVar, gi.e module) {
        bi.f a10;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.areEqual(fVar.getKind(), m.a.f25228a)) {
            return fVar.isInline() ? a(fVar.g(0), module) : fVar;
        }
        bi.f b10 = AbstractC2426b.b(module, fVar);
        return (b10 == null || (a10 = a(b10, module)) == null) ? fVar : a10;
    }

    public static final e0 b(AbstractC4212b abstractC4212b, bi.f desc) {
        Intrinsics.checkNotNullParameter(abstractC4212b, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        bi.m kind = desc.getKind();
        if (kind instanceof bi.d) {
            return e0.f46769f;
        }
        if (Intrinsics.areEqual(kind, n.b.f25231a)) {
            return e0.f46767d;
        }
        if (!Intrinsics.areEqual(kind, n.c.f25232a)) {
            return e0.f46766c;
        }
        bi.f a10 = a(desc.g(0), abstractC4212b.a());
        bi.m kind2 = a10.getKind();
        if ((kind2 instanceof bi.e) || Intrinsics.areEqual(kind2, m.b.f25229a)) {
            return e0.f46768e;
        }
        if (abstractC4212b.f().c()) {
            return e0.f46767d;
        }
        throw C.d(a10);
    }
}
