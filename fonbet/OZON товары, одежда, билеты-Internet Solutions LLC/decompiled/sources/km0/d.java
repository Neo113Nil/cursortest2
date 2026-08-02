package km0;

import jm0.i;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public interface d<T> {
    void a(@NotNull i iVar);

    void onComplete();

    void onError(@NotNull Throwable th2);

    void onNext(T t2);
}
