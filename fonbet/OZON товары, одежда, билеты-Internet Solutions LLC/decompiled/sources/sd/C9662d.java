package sd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;

/* renamed from: sd.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9662d {
    @NotNull
    public static InterfaceC9839e a(@NotNull InterfaceC9839e readOnly) {
        Intrinsics.checkNotNullParameter(readOnly, "readOnly");
        Sd.d k11 = Vd.i.k(readOnly);
        int i11 = C9661c.f98575o;
        Sd.c m11 = C9661c.m(k11);
        if (m11 != null) {
            InterfaceC9839e o11 = Zd.e.e(readOnly).o(m11);
            Intrinsics.checkNotNullExpressionValue(o11, "getBuiltInClassByFqName(...)");
            return o11;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public static InterfaceC9839e b(Sd.c fqName, qd.m builtIns) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        int i11 = C9661c.f98575o;
        Sd.b j11 = C9661c.j(fqName);
        if (j11 != null) {
            return builtIns.o(j11.a());
        }
        return null;
    }
}
