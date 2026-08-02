package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public enum q6 implements c2 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    q6(int i5) {
        this.minHttpStatusCode = i5;
        this.maxHttpStatusCode = i5;
    }

    @Nullable
    public static q6 fromApiNameSafely(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public static q6 fromHttpStatusCode(int i5) {
        for (q6 q6Var : values()) {
            if (q6Var.matches(i5)) {
                return q6Var;
            }
        }
        return null;
    }

    private boolean matches(int i5) {
        return i5 >= this.minHttpStatusCode && i5 <= this.maxHttpStatusCode;
    }

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.c2
    public void serialize(@NotNull b3 b3Var, @NotNull ILogger iLogger) throws IOException {
        ((l1.a) b3Var).K(apiName());
    }

    @NotNull
    public static q6 fromHttpStatusCode(@Nullable Integer num, @NotNull q6 q6Var) {
        q6 fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : q6Var;
        return fromHttpStatusCode != null ? fromHttpStatusCode : q6Var;
    }

    q6(int i5, int i10) {
        this.minHttpStatusCode = i5;
        this.maxHttpStatusCode = i10;
    }
}
