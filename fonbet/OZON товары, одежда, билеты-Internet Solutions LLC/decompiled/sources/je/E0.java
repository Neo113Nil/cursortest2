package je;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import qd.s;

/* loaded from: classes10.dex */
final class E0 implements Function1<Sd.c, Boolean> {
    E0() {
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(@NotNull Sd.c cVar) {
        if (cVar != null) {
            return Boolean.valueOf(!r2.equals(s.a.f81925y));
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
    }
}
