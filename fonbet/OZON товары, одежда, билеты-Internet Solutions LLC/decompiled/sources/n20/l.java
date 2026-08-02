package n20;

import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class l {
    public static final void a(@NotNull k<? extends InterfaceC8046a<?, ? extends l20.c>> kVar, @NotNull i[] widgets) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        for (i iVar : widgets) {
            if (!kVar.containsWidget(iVar.getKey())) {
                kVar.insert(iVar);
            }
        }
    }
}
