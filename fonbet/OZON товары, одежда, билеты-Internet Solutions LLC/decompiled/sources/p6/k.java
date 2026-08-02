package p6;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class k {
    public static void a(@NonNull String str, boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    public static void b(Object obj) {
        c(obj, "Argument must not be null");
    }

    @NonNull
    public static void c(Object obj, @NonNull String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
