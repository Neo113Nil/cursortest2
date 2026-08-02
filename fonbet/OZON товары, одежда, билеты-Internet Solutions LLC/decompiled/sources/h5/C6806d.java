package h5;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: h5.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6806d {
    public static final long a(@NotNull Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        return duration.toMillis();
    }
}
