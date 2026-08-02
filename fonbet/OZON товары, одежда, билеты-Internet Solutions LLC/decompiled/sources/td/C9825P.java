package td;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: td.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9825P {
    public static final void a(@NotNull InterfaceC9821L interfaceC9821L, @NotNull Sd.c fqName, @NotNull ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(interfaceC9821L, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        if (interfaceC9821L instanceof InterfaceC9826Q) {
            ((InterfaceC9826Q) interfaceC9821L).a(fqName, packageFragments);
        } else {
            packageFragments.addAll(interfaceC9821L.b(fqName));
        }
    }

    public static final boolean b(@NotNull InterfaceC9821L interfaceC9821L, @NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(interfaceC9821L, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return interfaceC9821L instanceof InterfaceC9826Q ? ((InterfaceC9826Q) interfaceC9821L).c(fqName) : c(interfaceC9821L, fqName).isEmpty();
    }

    @NotNull
    public static final ArrayList c(@NotNull InterfaceC9821L interfaceC9821L, @NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(interfaceC9821L, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(interfaceC9821L, fqName, arrayList);
        return arrayList;
    }
}
