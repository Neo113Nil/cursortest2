package z00;

import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {
    @NotNull
    public static final c a() {
        return new c(K.f71697a);
    }

    @NotNull
    public static final c b(@NotNull Function1<? super e, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        e eVar = new e();
        init.invoke(eVar);
        return eVar.c();
    }
}
