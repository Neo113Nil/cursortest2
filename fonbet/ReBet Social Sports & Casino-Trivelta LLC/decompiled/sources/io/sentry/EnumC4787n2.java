package io.sentry;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.sentry.n2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4787n2 {
    STRING,
    BOOLEAN,
    INTEGER,
    DOUBLE,
    ARRAY;

    @NotNull
    public static EnumC4787n2 inferFrom(@Nullable Object obj) {
        return obj instanceof Boolean ? BOOLEAN : ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Byte) || (obj instanceof BigInteger) || (obj instanceof AtomicInteger) || (obj instanceof AtomicLong)) ? INTEGER : obj instanceof Number ? DOUBLE : ((obj instanceof Collection) || (obj != null && obj.getClass().isArray())) ? ARRAY : STRING;
    }

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
