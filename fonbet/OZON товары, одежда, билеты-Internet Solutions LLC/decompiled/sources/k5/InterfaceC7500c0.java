package k5;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* renamed from: k5.c0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC7500c0<T extends Serializable> {

    /* renamed from: a, reason: collision with root package name */
    public static final long f70717a = TimeUnit.DAYS.toMillis(999);

    default void a(T t2) {
        f().c(x(), t2);
    }

    @NonNull
    AbstractC7520h0 f();

    default T p(long j11) {
        return (T) f().a(x(), j11);
    }

    @NonNull
    Mm0.e x();
}
