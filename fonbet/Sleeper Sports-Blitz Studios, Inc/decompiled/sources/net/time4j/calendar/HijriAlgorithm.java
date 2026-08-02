package net.time4j.calendar;

import androidx.core.text.util.LocalePreferences;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.time4j.base.MathUtils;
import net.time4j.engine.CalendarEra;
import net.time4j.engine.VariantSource;

/* loaded from: classes10.dex */
public enum HijriAlgorithm implements VariantSource {
    EAST_ISLAMIC_CIVIL("islamic-eastc", new int[]{2, 5, 7, 10, 13, 15, 18, 21, 24, 26, 29}, true),
    EAST_ISLAMIC_ASTRO("islamic-easta", new int[]{2, 5, 7, 10, 13, 15, 18, 21, 24, 26, 29}, false),
    WEST_ISLAMIC_CIVIL(LocalePreferences.CalendarType.ISLAMIC_CIVIL, new int[]{2, 5, 7, 10, 13, 16, 18, 21, 24, 26, 29}, true),
    WEST_ISLAMIC_ASTRO(LocalePreferences.CalendarType.ISLAMIC_TBLA, new int[]{2, 5, 7, 10, 13, 16, 18, 21, 24, 26, 29}, false),
    FATIMID_CIVIL("islamic-fatimidc", new int[]{2, 5, 8, 10, 13, 16, 19, 21, 24, 27, 29}, true),
    FATIMID_ASTRO("islamic-fatimida", new int[]{2, 5, 8, 10, 13, 16, 19, 21, 24, 27, 29}, false),
    HABASH_AL_HASIB_CIVIL("islamic-habashalhasibc", new int[]{2, 5, 8, 11, 13, 16, 19, 21, 24, 27, 30}, true),
    HABASH_AL_HASIB_ASTRO("islamic-habashalhasiba", new int[]{2, 5, 8, 11, 13, 16, 19, 21, 24, 27, 30}, false);

    private final transient Transformer calsys;
    private static final long LENGTH_OF_30_YEAR_CYCLE = 10631;
    private static final long START_622_07_15 = -492879;
    private static final long START_622_07_16 = (-492879) + 1;
    private static final int MAX_YEAR = 1600;
    private static final long ASTRO_1600_12_29 = 74106;
    private static final long CIVIL_1600_12_29 = 74106 + 1;

    HijriAlgorithm(String str, int[] iArr, boolean z) {
        this.calsys = new Transformer(str, iArr, z, 0);
    }

    @Override // net.time4j.engine.VariantSource
    public String getVariant() {
        return this.calsys.variant;
    }

    EraYearMonthDaySystem<HijriCalendar> getCalendarSystem(int i) {
        if (i == 0) {
            return this.calsys;
        }
        return new Transformer(HijriAdjustment.of(getVariant(), i).getVariant(), this.calsys.intercalaries, this.calsys.civil, i);
    }

    private static class Transformer implements EraYearMonthDaySystem<HijriCalendar> {
        private final int adjustment;
        private final boolean civil;
        private final int[] intercalaries;
        private final String variant;

        Transformer(String str, int[] iArr, boolean z, int i) {
            this.variant = str;
            this.intercalaries = iArr;
            this.civil = z;
            this.adjustment = i;
        }

        @Override // net.time4j.calendar.EraYearMonthDaySystem
        public boolean isValid(CalendarEra calendarEra, int i, int i2, int i3) {
            return calendarEra == HijriEra.ANNO_HEGIRAE && i >= 1 && i <= HijriAlgorithm.MAX_YEAR && i2 >= 1 && i2 <= 12 && i3 >= 1 && i3 <= getLengthOfMonth(calendarEra, i, i2);
        }

        @Override // net.time4j.calendar.EraYearMonthDaySystem
        public int getLengthOfMonth(CalendarEra calendarEra, int i, int i2) {
            if (calendarEra == HijriEra.ANNO_HEGIRAE) {
                if (i >= 1 && i <= HijriAlgorithm.MAX_YEAR && i2 >= 1 && i2 <= 12) {
                    if (i2 == 12) {
                        return Arrays.binarySearch(this.intercalaries, ((i - 1) % 30) + 1) >= 0 ? 30 : 29;
                    }
                    return i2 % 2 == 1 ? 30 : 29;
                }
                throw new IllegalArgumentException("Out of bounds: " + i + "/" + i2);
            }
            throw new IllegalArgumentException("Wrong era: " + calendarEra);
        }

        @Override // net.time4j.calendar.EraYearMonthDaySystem
        public int getLengthOfYear(CalendarEra calendarEra, int i) {
            if (calendarEra == HijriEra.ANNO_HEGIRAE) {
                if (i >= 1 && i <= HijriAlgorithm.MAX_YEAR) {
                    return Arrays.binarySearch(this.intercalaries, ((i - 1) % 30) + 1) >= 0 ? 355 : 354;
                }
                throw new IllegalArgumentException("Out of bounds: yearOfEra=" + i);
            }
            throw new IllegalArgumentException("Wrong era: " + calendarEra);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
        
            if (java.util.Arrays.binarySearch(r7.intercalaries, ((r0 - 1) % 30) + 1) >= 0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        
            r2 = 29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
        
            if (r8 <= r2) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
        
            r3 = r3 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
        
            if (r3 <= 12) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
        
            r0 = r0 + 1;
            r8 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
        
            return net.time4j.calendar.HijriCalendar.of(r7.variant, r0, r1, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
        
            r8 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
        
            r1 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
        
            if ((r3 % 2) == 1) goto L40;
         */
        @Override // net.time4j.engine.CalendarSystem
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public HijriCalendar transform(long j) {
            long safeAdd = MathUtils.safeAdd(j, this.adjustment);
            long j2 = this.civil ? HijriAlgorithm.START_622_07_16 : HijriAlgorithm.START_622_07_15;
            if (safeAdd >= j2) {
                if (safeAdd <= (this.civil ? HijriAlgorithm.CIVIL_1600_12_29 : HijriAlgorithm.ASTRO_1600_12_29)) {
                    long safeSubtract = MathUtils.safeSubtract(safeAdd, j2);
                    int i = 1;
                    int safeCast = MathUtils.safeCast((safeSubtract / HijriAlgorithm.LENGTH_OF_30_YEAR_CYCLE) * 30) + 1;
                    int i2 = (int) (safeSubtract % HijriAlgorithm.LENGTH_OF_30_YEAR_CYCLE);
                    int i3 = 1;
                    while (true) {
                        int i4 = 30;
                        if (i3 >= 30) {
                            break;
                        }
                        int i5 = Arrays.binarySearch(this.intercalaries, i3) >= 0 ? 355 : 354;
                        if (i2 <= i5) {
                            break;
                        }
                        i2 -= i5;
                        safeCast++;
                        i3++;
                    }
                    int i6 = 1;
                    for (int i7 = 1; i7 < 12; i7++) {
                        int i8 = i7 % 2 == 0 ? 29 : 30;
                        if (i2 <= i8) {
                            break;
                        }
                        i2 -= i8;
                        i6++;
                    }
                    int i9 = i2 + 1;
                    if (i6 == 12) {
                    }
                }
            }
            throw new IllegalArgumentException("Out of supported range: " + j);
        }

        @Override // net.time4j.engine.CalendarSystem
        public long transform(HijriCalendar hijriCalendar) {
            int year = hijriCalendar.getYear();
            int value = hijriCalendar.getMonth().getValue();
            int dayOfMonth = hijriCalendar.getDayOfMonth();
            if (year >= 1 && year <= HijriAlgorithm.MAX_YEAR && value >= 1 && value <= 12 && dayOfMonth >= 1 && dayOfMonth <= 30) {
                long j = (r0 / 30) * HijriAlgorithm.LENGTH_OF_30_YEAR_CYCLE;
                int i = ((year - 1) % 30) + 1;
                for (int i2 = 1; i2 < i; i2++) {
                    j += Arrays.binarySearch(this.intercalaries, i2) >= 0 ? 355L : 354L;
                }
                for (int i3 = 1; i3 < value; i3++) {
                    j += i3 % 2 == 0 ? 29L : 30L;
                }
                if (dayOfMonth == 30 && ((value == 12 && Arrays.binarySearch(this.intercalaries, i) < 0) || (value != 12 && value % 2 == 0))) {
                    throw new IllegalArgumentException("Invalid day-of-month: " + hijriCalendar);
                }
                return MathUtils.safeSubtract(((this.civil ? HijriAlgorithm.START_622_07_16 : HijriAlgorithm.START_622_07_15) + (j + dayOfMonth)) - 1, this.adjustment);
            }
            throw new IllegalArgumentException("Out of supported range: " + hijriCalendar);
        }

        @Override // net.time4j.engine.CalendarSystem
        public long getMinimumSinceUTC() {
            return MathUtils.safeSubtract(this.civil ? HijriAlgorithm.START_622_07_16 : HijriAlgorithm.START_622_07_15, this.adjustment);
        }

        @Override // net.time4j.engine.CalendarSystem
        public long getMaximumSinceUTC() {
            return MathUtils.safeSubtract(this.civil ? HijriAlgorithm.CIVIL_1600_12_29 : HijriAlgorithm.ASTRO_1600_12_29, this.adjustment);
        }

        @Override // net.time4j.engine.CalendarSystem
        public List<CalendarEra> getEras() {
            return Collections.singletonList(HijriEra.ANNO_HEGIRAE);
        }
    }
}
