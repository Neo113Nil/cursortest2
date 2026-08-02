package qd;

import java.util.LinkedHashSet;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;

/* loaded from: classes10.dex */
public final class e {
    public static final boolean a(@NotNull InterfaceC9839e classDescriptor) {
        Intrinsics.checkNotNullParameter(d.f81829a, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (!Vd.i.s(classDescriptor)) {
            return false;
        }
        LinkedHashSet b11 = d.b();
        Sd.b f7 = Zd.e.f(classDescriptor);
        return C7714v.A(b11, f7 != null ? f7.e() : null);
    }
}
