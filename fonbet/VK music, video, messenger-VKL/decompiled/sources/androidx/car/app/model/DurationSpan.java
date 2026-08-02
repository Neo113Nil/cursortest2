package androidx.car.app.model;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.time.Duration;
import java.util.Objects;
import xsna.efz;

/* loaded from: classes11.dex */
public final class DurationSpan extends CarSpan {
    private final long mDurationSeconds;

    public static final class a {
        @NonNull
        public static DurationSpan a(@NonNull Duration duration) {
            Objects.requireNonNull(duration);
            return new DurationSpan(duration.getSeconds());
        }
    }

    public DurationSpan(long j) {
        this.mDurationSeconds = j;
    }

    @NonNull
    public static DurationSpan create(long j) {
        return new DurationSpan(j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DurationSpan) && this.mDurationSeconds == ((DurationSpan) obj).mDurationSeconds;
    }

    @SuppressLint({"MethodNameUnits"})
    public long getDurationSeconds() {
        return this.mDurationSeconds;
    }

    public int hashCode() {
        long j = this.mDurationSeconds;
        return (int) (j ^ (j >>> 32));
    }

    @NonNull
    public String toString() {
        return efz.b(this.mDurationSeconds, X3.j.e, new StringBuilder("[seconds: "));
    }

    @NonNull
    public static DurationSpan create(@NonNull Duration duration) {
        return a.a(duration);
    }

    private DurationSpan() {
        this.mDurationSeconds = 0L;
    }
}
