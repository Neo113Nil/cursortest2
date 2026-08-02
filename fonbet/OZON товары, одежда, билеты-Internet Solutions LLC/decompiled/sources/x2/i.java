package x2;

import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i {
    public static void a(@NonNull String str, boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(int i11, int i12, int i13, @NonNull String str) {
        if (i11 < i12) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i12 + ", " + i13 + "] (too low)");
        }
        if (i11 <= i13) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i12 + ", " + i13 + "] (too high)");
    }

    public static void d(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
    }

    @NonNull
    public static void e(Object obj, @NonNull String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void f(String str, boolean z11) {
        if (!z11) {
            throw new IllegalStateException(str);
        }
    }
}
