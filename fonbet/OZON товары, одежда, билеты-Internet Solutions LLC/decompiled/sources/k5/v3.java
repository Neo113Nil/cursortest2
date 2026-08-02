package k5;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public interface v3 {
    @NonNull
    Pm0.a<?> c();

    default <T> T n(@NonNull Callable<T> callable) {
        c().getClass();
        try {
            return callable.call();
        } catch (Exception unused) {
            return null;
        }
    }
}
