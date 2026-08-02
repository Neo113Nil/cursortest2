package k5;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public interface R0 {
    @NonNull
    Object b();

    @NonNull
    default void c() {
        throw new RuntimeException("Must be overridden in child class");
    }
}
