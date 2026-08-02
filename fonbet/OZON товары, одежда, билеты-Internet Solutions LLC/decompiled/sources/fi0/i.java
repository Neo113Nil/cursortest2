package fi0;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final long f63492a;

    public i(long j11) {
        TimeUnit unit = TimeUnit.HOURS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f63492a = j11;
    }

    @NotNull
    public final DateTime a() {
        TimeUnit unit = TimeUnit.HOURS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new DateTime(System.currentTimeMillis() - unit.toMillis(this.f63492a));
    }

    public final long b() {
        return this.f63492a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        if (this.f63492a != ((i) obj).f63492a) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.HOURS;
        return true;
    }

    public final int hashCode() {
        return TimeUnit.HOURS.hashCode() + (Long.hashCode(this.f63492a) * 31);
    }

    @NotNull
    public final String toString() {
        return "LifeTimeEvent(time=" + this.f63492a + ", unit=" + TimeUnit.HOURS + ")";
    }
}
