package tf;

import org.jetbrains.annotations.NotNull;

/* renamed from: tf.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9870b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final char[] f99484a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c11) {
        if ('0' <= c11 && c11 < ':') {
            return c11 - '0';
        }
        if ('a' <= c11 && c11 < 'g') {
            return c11 - 'W';
        }
        if ('A' > c11 || c11 >= 'G') {
            throw new IllegalArgumentException(Pk0.i.a("Unexpected hex digit: ", c11));
        }
        return c11 - '7';
    }

    @NotNull
    public static final char[] b() {
        return f99484a;
    }
}
