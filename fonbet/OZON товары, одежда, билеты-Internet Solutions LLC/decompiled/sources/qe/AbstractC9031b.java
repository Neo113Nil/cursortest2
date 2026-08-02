package qe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe.AbstractC9036g;

/* renamed from: qe.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9031b {
    @NotNull
    public final AbstractC9036g a(@NotNull Ed.e functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        for (C9040k c9040k : b()) {
            if (c9040k.b(functionDescriptor)) {
                return c9040k.a(functionDescriptor);
            }
        }
        return AbstractC9036g.a.f81952b;
    }

    @NotNull
    public abstract List<C9040k> b();
}
