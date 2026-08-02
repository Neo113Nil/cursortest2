package j$.time.chrono;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C;
import com.microsoft.codepush.react.CodePushConstants;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;
import org.chromium.base.TimeUtils;

/* loaded from: classes3.dex */
final class ChronoLocalDateTimeImpl implements ChronoLocalDateTime, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient ChronoLocalDate date;
    private final transient LocalTime time;

    static ChronoLocalDateTimeImpl of(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        return new ChronoLocalDateTimeImpl(chronoLocalDate, localTime);
    }

    static ChronoLocalDateTimeImpl ensureValid(Chronology chronology, Temporal temporal) {
        ChronoLocalDateTimeImpl chronoLocalDateTimeImpl = (ChronoLocalDateTimeImpl) temporal;
        if (chronology.equals(chronoLocalDateTimeImpl.getChronology())) {
            return chronoLocalDateTimeImpl;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.getId() + ", actual: " + chronoLocalDateTimeImpl.getChronology().getId());
    }

    private ChronoLocalDateTimeImpl(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "date");
        Objects.requireNonNull(localTime, CodePushConstants.LATEST_ROLLBACK_TIME_KEY);
        this.date = chronoLocalDate;
        this.time = localTime;
    }

    private ChronoLocalDateTimeImpl with(Temporal temporal, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.date;
        return (chronoLocalDate == temporal && this.time == localTime) ? this : new ChronoLocalDateTimeImpl(ChronoLocalDateImpl.ensureValid(chronoLocalDate.getChronology(), temporal), localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public ChronoLocalDate toLocalDate() {
        return this.date;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalTime toLocalTime() {
        return this.time;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.isSupportedBy(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.isTimeBased();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isTimeBased() ? this.time.range(temporalField) : this.date.range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isTimeBased() ? this.time.get(temporalField) : this.date.get(temporalField);
        }
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isTimeBased() ? this.time.getLong(temporalField) : this.date.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    public ChronoLocalDateTimeImpl with(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof ChronoLocalDate) {
            return with((ChronoLocalDate) temporalAdjuster, this.time);
        }
        if (temporalAdjuster instanceof LocalTime) {
            return with(this.date, (LocalTime) temporalAdjuster);
        }
        if (temporalAdjuster instanceof ChronoLocalDateTimeImpl) {
            return ensureValid(this.date.getChronology(), (ChronoLocalDateTimeImpl) temporalAdjuster);
        }
        return ensureValid(this.date.getChronology(), (ChronoLocalDateTimeImpl) temporalAdjuster.adjustInto(this));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    public ChronoLocalDateTimeImpl with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).isTimeBased()) {
                return with(this.date, this.time.with(temporalField, j));
            }
            return with(this.date.with(temporalField, j), this.time);
        }
        return ensureValid(this.date.getChronology(), temporalField.adjustInto(this, j));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    public ChronoLocalDateTimeImpl plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusNanos(j);
                case 2:
                    return plusDays(j / 86400000000L).plusNanos((j % 86400000000L) * 1000);
                case 3:
                    return plusDays(j / 86400000).plusNanos((j % 86400000) * 1000000);
                case 4:
                    return plusSeconds(j);
                case 5:
                    return plusMinutes(j);
                case 6:
                    return plusHours(j);
                case 7:
                    return plusDays(j / 256).plusHours((j % 256) * 12);
                default:
                    return with(this.date.plus(j, temporalUnit), this.time);
            }
        }
        return ensureValid(this.date.getChronology(), temporalUnit.addTo(this, j));
    }

    /* renamed from: j$.time.chrono.ChronoLocalDateTimeImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private ChronoLocalDateTimeImpl plusDays(long j) {
        return with(this.date.plus(j, (TemporalUnit) ChronoUnit.DAYS), this.time);
    }

    private ChronoLocalDateTimeImpl plusHours(long j) {
        return plusWithOverflow(this.date, j, 0L, 0L, 0L);
    }

    private ChronoLocalDateTimeImpl plusMinutes(long j) {
        return plusWithOverflow(this.date, 0L, j, 0L, 0L);
    }

    ChronoLocalDateTimeImpl plusSeconds(long j) {
        return plusWithOverflow(this.date, 0L, 0L, j, 0L);
    }

    private ChronoLocalDateTimeImpl plusNanos(long j) {
        return plusWithOverflow(this.date, 0L, 0L, 0L, j);
    }

    private ChronoLocalDateTimeImpl plusWithOverflow(ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return with(chronoLocalDate, this.time);
        }
        long j5 = (j4 / 86400000000000L) + (j3 / TimeUtils.SECONDS_PER_DAY) + (j2 / 1440) + (j / 24);
        long j6 = (j4 % 86400000000000L) + ((j3 % TimeUtils.SECONDS_PER_DAY) * C.NANOS_PER_SECOND) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L);
        long nanoOfDay = this.time.toNanoOfDay();
        long j7 = j6 + nanoOfDay;
        long floorDiv = j5 + Math.floorDiv(j7, 86400000000000L);
        long floorMod = Math.floorMod(j7, 86400000000000L);
        return with(chronoLocalDate.plus(floorDiv, (TemporalUnit) ChronoUnit.DAYS), floorMod == nanoOfDay ? this.time : LocalTime.ofNanoOfDay(floorMod));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: atZone */
    public ChronoZonedDateTime atZone2(ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.ofBest(this, zoneId, null);
    }

    private Object writeReplace() {
        return new Ser((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.date);
        objectOutput.writeObject(this.time);
    }

    static ChronoLocalDateTime readExternal(ObjectInput objectInput) {
        return ((ChronoLocalDate) objectInput.readObject()).atTime((LocalTime) objectInput.readObject());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && compareTo((ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public int hashCode() {
        return toLocalDate().hashCode() ^ toLocalTime().hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public String toString() {
        return toLocalDate().toString() + ExifInterface.GPS_DIRECTION_TRUE + toLocalTime().toString();
    }
}
