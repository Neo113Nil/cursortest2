package m0;

import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface X0<V extends AbstractC8015t> {
    boolean a();

    long b(@NotNull V v11, @NotNull V v12, @NotNull V v13);

    @NotNull
    V c(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13);

    @NotNull
    V d(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13);

    @NotNull
    default V e(@NotNull V v11, @NotNull V v12, @NotNull V v13) {
        return d(b(v11, v12, v13), v11, v12, v13);
    }
}
