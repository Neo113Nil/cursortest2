package bi;

import Zh.InterfaceC1901b;
import di.T0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* renamed from: bi.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2426b {
    public static final KClass a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f25201b;
        }
        if (fVar instanceof T0) {
            return a(((T0) fVar).j());
        }
        return null;
    }

    public static final f b(gi.e eVar, f descriptor) {
        InterfaceC1901b c10;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass a10 = a(descriptor);
        if (a10 == null || (c10 = gi.e.c(eVar, a10, null, 2, null)) == null) {
            return null;
        }
        return c10.getDescriptor();
    }

    public static final f c(f fVar, KClass context) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new c(fVar, context);
    }
}
