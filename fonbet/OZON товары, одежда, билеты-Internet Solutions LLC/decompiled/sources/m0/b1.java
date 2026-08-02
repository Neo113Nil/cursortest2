package m0;

import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public interface b1<V extends AbstractC8015t> extends c1<V> {
    @Override // m0.X0
    default long b(@NotNull V v11, @NotNull V v12, @NotNull V v13) {
        return (g() + f()) * 1000000;
    }

    int f();

    int g();
}
