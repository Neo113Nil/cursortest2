package fi0;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final long f63497a;

    public m(long j11) {
        TimeUnit unit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f63497a = j11;
    }

    @NotNull
    public final DateTime a() {
        TimeUnit unit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new DateTime(System.currentTimeMillis() - unit.toMillis(this.f63497a));
    }

    public final long b() {
        return this.f63497a;
    }
}
