package net.time4j;

import androidx.media3.common.C;
import java.util.ArrayList;
import java.util.Comparator;
import net.time4j.IsoUnit;
import net.time4j.base.MathUtils;
import net.time4j.engine.ChronoUnit;
import net.time4j.engine.Normalizer;
import net.time4j.engine.TimeSpan;

/* loaded from: classes10.dex */
class StdNormalizer<U extends IsoUnit> implements Normalizer<U>, Comparator<TimeSpan.Item<? extends ChronoUnit>> {
    private static final int MIO = 1000000;
    private static final int MRD = 1000000000;
    private final boolean mixed;

    private StdNormalizer(boolean z) {
        this.mixed = z;
    }

    static StdNormalizer<IsoUnit> ofMixedUnits() {
        return new StdNormalizer<>(true);
    }

    static StdNormalizer<CalendarUnit> ofCalendarUnits() {
        return new StdNormalizer<>(false);
    }

    static StdNormalizer<ClockUnit> ofClockUnits() {
        return new StdNormalizer<>(false);
    }

    static Comparator<TimeSpan.Item<? extends ChronoUnit>> comparator() {
        return new StdNormalizer(false);
    }

    @Override // java.util.Comparator
    public int compare(TimeSpan.Item<? extends ChronoUnit> item, TimeSpan.Item<? extends ChronoUnit> item2) {
        return compare(item.getUnit(), item2.getUnit());
    }

    @Override // net.time4j.engine.Normalizer
    /* renamed from: normalize */
    public Duration<U> normalize2(TimeSpan<? extends U> timeSpan) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        int size = timeSpan.getTotalLength().size();
        ArrayList arrayList = new ArrayList(size);
        int i = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        while (i < size) {
            long j18 = j15;
            TimeSpan.Item<? extends U> item = timeSpan.getTotalLength().get(i);
            int i2 = i;
            long j19 = j10;
            long amount = item.getAmount();
            U unit = item.getUnit();
            long j20 = j11;
            if (unit instanceof CalendarUnit) {
                switch (AnonymousClass1.$SwitchMap$net$time4j$CalendarUnit[((CalendarUnit) CalendarUnit.class.cast(unit)).ordinal()]) {
                    case 1:
                        j9 = MathUtils.safeAdd(MathUtils.safeMultiply(amount, 1000L), j9);
                        break;
                    case 2:
                        j9 = MathUtils.safeAdd(MathUtils.safeMultiply(amount, 100L), j9);
                        break;
                    case 3:
                        j9 = MathUtils.safeAdd(MathUtils.safeMultiply(amount, 10L), j9);
                        break;
                    case 4:
                        j9 = MathUtils.safeAdd(amount, j9);
                        break;
                    case 5:
                        j14 = MathUtils.safeAdd(MathUtils.safeMultiply(amount, 3L), j14);
                        break;
                    case 6:
                        j14 = MathUtils.safeAdd(amount, j14);
                        break;
                    case 7:
                        j17 = amount;
                        break;
                    case 8:
                        j16 = amount;
                        break;
                    default:
                        throw new UnsupportedOperationException(unit.toString());
                }
            } else if (unit instanceof ClockUnit) {
                switch (AnonymousClass1.$SwitchMap$net$time4j$ClockUnit[((ClockUnit) ClockUnit.class.cast(unit)).ordinal()]) {
                    case 1:
                        j10 = amount;
                        j11 = j20;
                        i = i2 + 1;
                        j15 = j18;
                    case 2:
                        j11 = amount;
                        j10 = j19;
                        i = i2 + 1;
                        j15 = j18;
                    case 3:
                        j12 = amount;
                        break;
                    case 4:
                        j13 = MathUtils.safeAdd(MathUtils.safeMultiply(amount, 1000000L), j13);
                        break;
                    case 5:
                        j13 = MathUtils.safeAdd(MathUtils.safeMultiply(amount, 1000L), j13);
                        break;
                    case 6:
                        j13 = MathUtils.safeAdd(amount, j13);
                        break;
                    default:
                        throw new UnsupportedOperationException(unit.toString());
                }
            } else {
                arrayList.add(TimeSpan.Item.of(amount, unit));
            }
            j10 = j19;
            j11 = j20;
            i = i2 + 1;
            j15 = j18;
        }
        long j21 = j10;
        long j22 = j11;
        long j23 = j15;
        if ((j21 | j22 | j12 | j13) != j23) {
            long j24 = j13 % C.NANOS_PER_SECOND;
            long safeAdd = MathUtils.safeAdd(j12, j13 / C.NANOS_PER_SECOND);
            j4 = safeAdd % 60;
            long safeAdd2 = MathUtils.safeAdd(j22, safeAdd / 60);
            j3 = safeAdd2 % 60;
            j2 = MathUtils.safeAdd(j21, safeAdd2 / 60);
            if (this.mixed) {
                long j25 = j2 % 24;
                long safeAdd3 = MathUtils.safeAdd(j16, j2 / 24);
                j6 = j24;
                j = j14;
                j5 = safeAdd3;
                j2 = j25;
            } else {
                j5 = j16;
                j6 = j24;
                j = j14;
            }
        } else {
            j = j14;
            j2 = j23;
            j3 = j2;
            j4 = j3;
            j5 = j16;
            j6 = j4;
        }
        if ((j9 | j | j5) != j23) {
            long j26 = j;
            long safeAdd4 = MathUtils.safeAdd(j9, j26 / 12);
            long j27 = j26 % 12;
            j7 = j6;
            j8 = j4;
            long safeAdd5 = MathUtils.safeAdd(MathUtils.safeMultiply(j17, 7L), j5);
            if (safeAdd4 != j23) {
                arrayList.add(TimeSpan.Item.of(safeAdd4, CalendarUnit.YEARS));
            }
            if (j27 != j23) {
                arrayList.add(TimeSpan.Item.of(j27, CalendarUnit.MONTHS));
            }
            if (safeAdd5 != j23) {
                arrayList.add(TimeSpan.Item.of(safeAdd5, CalendarUnit.DAYS));
            }
        } else {
            j7 = j6;
            j8 = j4;
            long j28 = j17;
            if (j28 != j23) {
                arrayList.add(TimeSpan.Item.of(j28, CalendarUnit.WEEKS));
            }
        }
        if (j2 != j23) {
            arrayList.add(TimeSpan.Item.of(j2, ClockUnit.HOURS));
        }
        if (j3 != j23) {
            arrayList.add(TimeSpan.Item.of(j3, ClockUnit.MINUTES));
        }
        if (j8 != j23) {
            arrayList.add(TimeSpan.Item.of(j8, ClockUnit.SECONDS));
        }
        if (j7 != j23) {
            arrayList.add(TimeSpan.Item.of(j7, ClockUnit.NANOS));
        }
        return new Duration<>(arrayList, timeSpan.isNegative());
    }

    /* renamed from: net.time4j.StdNormalizer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$CalendarUnit;
        static final /* synthetic */ int[] $SwitchMap$net$time4j$ClockUnit;

        static {
            int[] iArr = new int[ClockUnit.values().length];
            $SwitchMap$net$time4j$ClockUnit = iArr;
            try {
                iArr[ClockUnit.HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[ClockUnit.MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[ClockUnit.SECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[ClockUnit.MILLIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[ClockUnit.MICROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[ClockUnit.NANOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[CalendarUnit.values().length];
            $SwitchMap$net$time4j$CalendarUnit = iArr2;
            try {
                iArr2[CalendarUnit.MILLENNIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[CalendarUnit.CENTURIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[CalendarUnit.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[CalendarUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[CalendarUnit.QUARTERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[CalendarUnit.MONTHS.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[CalendarUnit.WEEKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[CalendarUnit.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    static int compare(ChronoUnit chronoUnit, ChronoUnit chronoUnit2) {
        int compare = Double.compare(chronoUnit2.getLength(), chronoUnit.getLength());
        if (compare != 0 || chronoUnit.equals(chronoUnit2)) {
            return compare;
        }
        throw new IllegalArgumentException("Mixing different units of same length not allowed.");
    }
}
