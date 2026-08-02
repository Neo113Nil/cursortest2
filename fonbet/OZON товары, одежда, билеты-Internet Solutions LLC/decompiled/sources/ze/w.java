package ze;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface w<E> {
    @NotNull
    Ie.f c();

    @NotNull
    Object e();

    Object f(@NotNull kotlin.coroutines.d<? super l<? extends E>> dVar);

    @NotNull
    Ie.f h();

    Object i(@NotNull kotlin.coroutines.d<? super E> dVar);

    @NotNull
    j<E> iterator();

    void j(CancellationException cancellationException);
}
