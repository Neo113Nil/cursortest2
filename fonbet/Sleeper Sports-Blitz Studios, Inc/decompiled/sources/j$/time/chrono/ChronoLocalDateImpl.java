package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import java.io.Serializable;

/* loaded from: classes3.dex */
abstract class ChronoLocalDateImpl implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    abstract ChronoLocalDate plusDays(long j);

    abstract ChronoLocalDate plusMonths(long j);

    abstract ChronoLocalDate plusYears(long j);

    static ChronoLocalDate ensureValid(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.getChronology())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + chronology.getId() + ", actual: " + chronoLocalDate.getChronology().getId());
    }

    ChronoLocalDateImpl() {
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate with(TemporalAdjuster temporalAdjuster) {
        return super.with(temporalAdjuster);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate with(TemporalField temporalField, long j) {
        return super.with(temporalField, j);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDate plus(TemporalAmount temporalAmount) {
        return super.plus(temporalAmount);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate plus(long j, TemporalUnit temporalUnit) {
        long multiplyExact;
        long multiplyExact2;
        long multiplyExact3;
        long multiplyExact4;
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusDays(j);
                case 2:
                    multiplyExact = Math.multiplyExact(j, 7L);
                    return plusDays(multiplyExact);
                case 3:
                    return plusMonths(j);
                case 4:
                    return plusYears(j);
                case 5:
                    multiplyExact2 = Math.multiplyExact(j, 10L);
                    return plusYears(multiplyExact2);
                case 6:
                    multiplyExact3 = Math.multiplyExact(j, 100L);
                    return plusYears(multiplyExact3);
                case 7:
                    multiplyExact4 = Math.multiplyExact(j, 1000L);
                    return plusYears(multiplyExact4);
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return with((TemporalField) chronoField, Math.addExact(getLong(chronoField), j));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return super.plus(j, temporalUnit);
    }

    /* renamed from: j$.time.chrono.ChronoLocalDateImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate minus(long j, TemporalUnit temporalUnit) {
        return super.minus(j, temporalUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ getChronology().hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        long j = getLong(ChronoField.YEAR_OF_ERA);
        long j2 = getLong(ChronoField.MONTH_OF_YEAR);
        long j3 = getLong(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(getEra());
        sb.append(" ");
        sb.append(j);
        sb.append(j2 < 10 ? "-0" : "-");
        sb.append(j2);
        sb.append(j3 < 10 ? "-0" : "-");
        sb.append(j3);
        return sb.toString();
    }
}
