package androidx.car.app.model;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import xsna.i5s;

/* loaded from: classes11.dex */
public final class DateTimeWithZone {
    private static final long MAX_ZONE_OFFSET_SECONDS = TimeUnit.HOURS.toSeconds(1) * 18;
    private final long mTimeSinceEpochMillis;
    private final int mZoneOffsetSeconds;

    @Nullable
    private final String mZoneShortName;

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.time.LocalDateTime, java.time.chrono.ChronoLocalDateTime] */
        @NonNull
        public static DateTimeWithZone a(@NonNull ZonedDateTime zonedDateTime) {
            Objects.requireNonNull(zonedDateTime);
            ?? localDateTime = zonedDateTime.toLocalDateTime();
            ZoneId zone = zonedDateTime.getZone();
            ZoneOffset offset = zone.getRules().getOffset((LocalDateTime) localDateTime);
            return DateTimeWithZone.create(TimeUnit.SECONDS.toMillis(localDateTime.toEpochSecond(offset)), offset.getTotalSeconds(), zone.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
        }
    }

    private DateTimeWithZone() {
        this.mTimeSinceEpochMillis = 0L;
        this.mZoneOffsetSeconds = 0;
        this.mZoneShortName = null;
    }

    @NonNull
    public static DateTimeWithZone create(long j, int i, @NonNull String str) {
        if (j < 0) {
            throw new IllegalArgumentException("Time since epoch must be greater than or equal to zero");
        }
        if (Math.abs(i) > MAX_ZONE_OFFSET_SECONDS) {
            throw new IllegalArgumentException("Zone offset not in valid range: -18:00 to +18:00");
        }
        Objects.requireNonNull(str);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("The time zone short name can not be null or empty");
        }
        return new DateTimeWithZone(j, i, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateTimeWithZone)) {
            return false;
        }
        DateTimeWithZone dateTimeWithZone = (DateTimeWithZone) obj;
        return this.mTimeSinceEpochMillis == dateTimeWithZone.mTimeSinceEpochMillis && this.mZoneOffsetSeconds == dateTimeWithZone.mZoneOffsetSeconds && Objects.equals(this.mZoneShortName, dateTimeWithZone.mZoneShortName);
    }

    public long getTimeSinceEpochMillis() {
        return this.mTimeSinceEpochMillis;
    }

    @SuppressLint({"MethodNameUnits"})
    public int getZoneOffsetSeconds() {
        return this.mZoneOffsetSeconds;
    }

    @Nullable
    public String getZoneShortName() {
        return this.mZoneShortName;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.mTimeSinceEpochMillis), Integer.valueOf(this.mZoneOffsetSeconds), this.mZoneShortName);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("[time since epoch (ms): ");
        sb.append(this.mTimeSinceEpochMillis);
        sb.append("( ");
        sb.append(new Date(this.mTimeSinceEpochMillis));
        sb.append(")  zone offset (s): ");
        sb.append(this.mZoneOffsetSeconds);
        sb.append(", zone: ");
        return i5s.a(sb, this.mZoneShortName, X3.j.e);
    }

    private DateTimeWithZone(long j, int i, @Nullable String str) {
        this.mTimeSinceEpochMillis = j;
        this.mZoneOffsetSeconds = i;
        this.mZoneShortName = str;
    }

    @NonNull
    public static DateTimeWithZone create(long j, @NonNull TimeZone timeZone) {
        if (j >= 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Objects.requireNonNull(timeZone);
            return create(j, (int) timeUnit.toSeconds(timeZone.getOffset(j)), timeZone.getDisplayName(false, 0));
        }
        throw new IllegalArgumentException("timeSinceEpochMillis must be greater than or equal to zero");
    }

    @NonNull
    public static DateTimeWithZone create(@NonNull ZonedDateTime zonedDateTime) {
        return a.a(zonedDateTime);
    }
}
