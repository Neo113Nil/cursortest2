package mg;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NANO_OF_SECOND' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: mg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC8145a implements h {
    private static final /* synthetic */ EnumC8145a[] $VALUES;
    public static final EnumC8145a ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final EnumC8145a ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final EnumC8145a ALIGNED_WEEK_OF_MONTH;
    public static final EnumC8145a ALIGNED_WEEK_OF_YEAR;
    public static final EnumC8145a AMPM_OF_DAY;
    public static final EnumC8145a CLOCK_HOUR_OF_AMPM;
    public static final EnumC8145a CLOCK_HOUR_OF_DAY;
    public static final EnumC8145a DAY_OF_MONTH;
    public static final EnumC8145a DAY_OF_WEEK;
    public static final EnumC8145a DAY_OF_YEAR;
    public static final EnumC8145a EPOCH_DAY;
    public static final EnumC8145a ERA;
    public static final EnumC8145a HOUR_OF_AMPM;
    public static final EnumC8145a HOUR_OF_DAY;
    public static final EnumC8145a INSTANT_SECONDS;
    public static final EnumC8145a MICRO_OF_DAY;
    public static final EnumC8145a MICRO_OF_SECOND;
    public static final EnumC8145a MILLI_OF_DAY;
    public static final EnumC8145a MILLI_OF_SECOND;
    public static final EnumC8145a MINUTE_OF_DAY;
    public static final EnumC8145a MINUTE_OF_HOUR;
    public static final EnumC8145a MONTH_OF_YEAR;
    public static final EnumC8145a NANO_OF_DAY;
    public static final EnumC8145a NANO_OF_SECOND;
    public static final EnumC8145a OFFSET_SECONDS;
    public static final EnumC8145a PROLEPTIC_MONTH;
    public static final EnumC8145a SECOND_OF_DAY;
    public static final EnumC8145a SECOND_OF_MINUTE;
    public static final EnumC8145a YEAR;
    public static final EnumC8145a YEAR_OF_ERA;
    private final k baseUnit;
    private final String name;
    private final m range;
    private final k rangeUnit;

    static {
        b bVar = b.NANOS;
        b bVar2 = b.SECONDS;
        EnumC8145a enumC8145a = new EnumC8145a("NANO_OF_SECOND", 0, "NanoOfSecond", bVar, bVar2, m.h(0L, 999999999L));
        NANO_OF_SECOND = enumC8145a;
        b bVar3 = b.DAYS;
        EnumC8145a enumC8145a2 = new EnumC8145a("NANO_OF_DAY", 1, "NanoOfDay", bVar, bVar3, m.h(0L, 86399999999999L));
        NANO_OF_DAY = enumC8145a2;
        b bVar4 = b.MICROS;
        EnumC8145a enumC8145a3 = new EnumC8145a("MICRO_OF_SECOND", 2, "MicroOfSecond", bVar4, bVar2, m.h(0L, 999999L));
        MICRO_OF_SECOND = enumC8145a3;
        EnumC8145a enumC8145a4 = new EnumC8145a("MICRO_OF_DAY", 3, "MicroOfDay", bVar4, bVar3, m.h(0L, 86399999999L));
        MICRO_OF_DAY = enumC8145a4;
        b bVar5 = b.MILLIS;
        EnumC8145a enumC8145a5 = new EnumC8145a("MILLI_OF_SECOND", 4, "MilliOfSecond", bVar5, bVar2, m.h(0L, 999L));
        MILLI_OF_SECOND = enumC8145a5;
        EnumC8145a enumC8145a6 = new EnumC8145a("MILLI_OF_DAY", 5, "MilliOfDay", bVar5, bVar3, m.h(0L, 86399999L));
        MILLI_OF_DAY = enumC8145a6;
        b bVar6 = b.MINUTES;
        EnumC8145a enumC8145a7 = new EnumC8145a("SECOND_OF_MINUTE", 6, "SecondOfMinute", bVar2, bVar6, m.h(0L, 59L));
        SECOND_OF_MINUTE = enumC8145a7;
        EnumC8145a enumC8145a8 = new EnumC8145a("SECOND_OF_DAY", 7, "SecondOfDay", bVar2, bVar3, m.h(0L, 86399L));
        SECOND_OF_DAY = enumC8145a8;
        b bVar7 = b.HOURS;
        EnumC8145a enumC8145a9 = new EnumC8145a("MINUTE_OF_HOUR", 8, "MinuteOfHour", bVar6, bVar7, m.h(0L, 59L));
        MINUTE_OF_HOUR = enumC8145a9;
        EnumC8145a enumC8145a10 = new EnumC8145a("MINUTE_OF_DAY", 9, "MinuteOfDay", bVar6, bVar3, m.h(0L, 1439L));
        MINUTE_OF_DAY = enumC8145a10;
        b bVar8 = b.HALF_DAYS;
        EnumC8145a enumC8145a11 = new EnumC8145a("HOUR_OF_AMPM", 10, "HourOfAmPm", bVar7, bVar8, m.h(0L, 11L));
        HOUR_OF_AMPM = enumC8145a11;
        EnumC8145a enumC8145a12 = new EnumC8145a("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", bVar7, bVar8, m.h(1L, 12L));
        CLOCK_HOUR_OF_AMPM = enumC8145a12;
        EnumC8145a enumC8145a13 = new EnumC8145a("HOUR_OF_DAY", 12, "HourOfDay", bVar7, bVar3, m.h(0L, 23L));
        HOUR_OF_DAY = enumC8145a13;
        EnumC8145a enumC8145a14 = new EnumC8145a("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", bVar7, bVar3, m.h(1L, 24L));
        CLOCK_HOUR_OF_DAY = enumC8145a14;
        EnumC8145a enumC8145a15 = new EnumC8145a("AMPM_OF_DAY", 14, "AmPmOfDay", bVar8, bVar3, m.h(0L, 1L));
        AMPM_OF_DAY = enumC8145a15;
        b bVar9 = b.WEEKS;
        EnumC8145a enumC8145a16 = new EnumC8145a("DAY_OF_WEEK", 15, "DayOfWeek", bVar3, bVar9, m.h(1L, 7L));
        DAY_OF_WEEK = enumC8145a16;
        EnumC8145a enumC8145a17 = new EnumC8145a("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", bVar3, bVar9, m.h(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = enumC8145a17;
        EnumC8145a enumC8145a18 = new EnumC8145a("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", bVar3, bVar9, m.h(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = enumC8145a18;
        b bVar10 = b.MONTHS;
        EnumC8145a enumC8145a19 = new EnumC8145a("DAY_OF_MONTH", 18, "DayOfMonth", bVar3, bVar10, m.i(1L, 1L, 28L, 31L));
        DAY_OF_MONTH = enumC8145a19;
        b bVar11 = b.YEARS;
        EnumC8145a enumC8145a20 = new EnumC8145a("DAY_OF_YEAR", 19, "DayOfYear", bVar3, bVar11, m.i(1L, 1L, 365L, 366L));
        DAY_OF_YEAR = enumC8145a20;
        b bVar12 = b.FOREVER;
        EnumC8145a enumC8145a21 = new EnumC8145a("EPOCH_DAY", 20, "EpochDay", bVar3, bVar12, m.h(-365243219162L, 365241780471L));
        EPOCH_DAY = enumC8145a21;
        EnumC8145a enumC8145a22 = new EnumC8145a("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", bVar9, bVar10, m.i(1L, 1L, 4L, 5L));
        ALIGNED_WEEK_OF_MONTH = enumC8145a22;
        EnumC8145a enumC8145a23 = new EnumC8145a("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", bVar9, bVar11, m.h(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = enumC8145a23;
        EnumC8145a enumC8145a24 = new EnumC8145a("MONTH_OF_YEAR", 23, "MonthOfYear", bVar10, bVar11, m.h(1L, 12L));
        MONTH_OF_YEAR = enumC8145a24;
        EnumC8145a enumC8145a25 = new EnumC8145a("PROLEPTIC_MONTH", 24, "ProlepticMonth", bVar10, bVar12, m.h(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = enumC8145a25;
        EnumC8145a enumC8145a26 = new EnumC8145a("YEAR_OF_ERA", 25, "YearOfEra", bVar11, bVar12, m.i(1L, 1L, 999999999L, 1000000000L));
        YEAR_OF_ERA = enumC8145a26;
        EnumC8145a enumC8145a27 = new EnumC8145a("YEAR", 26, "Year", bVar11, bVar12, m.h(-999999999L, 999999999L));
        YEAR = enumC8145a27;
        EnumC8145a enumC8145a28 = new EnumC8145a("ERA", 27, "Era", b.ERAS, bVar12, m.h(0L, 1L));
        ERA = enumC8145a28;
        EnumC8145a enumC8145a29 = new EnumC8145a("INSTANT_SECONDS", 28, "InstantSeconds", bVar2, bVar12, m.h(Long.MIN_VALUE, Long.MAX_VALUE));
        INSTANT_SECONDS = enumC8145a29;
        EnumC8145a enumC8145a30 = new EnumC8145a("OFFSET_SECONDS", 29, "OffsetSeconds", bVar2, bVar12, m.h(-64800L, 64800L));
        OFFSET_SECONDS = enumC8145a30;
        $VALUES = new EnumC8145a[]{enumC8145a, enumC8145a2, enumC8145a3, enumC8145a4, enumC8145a5, enumC8145a6, enumC8145a7, enumC8145a8, enumC8145a9, enumC8145a10, enumC8145a11, enumC8145a12, enumC8145a13, enumC8145a14, enumC8145a15, enumC8145a16, enumC8145a17, enumC8145a18, enumC8145a19, enumC8145a20, enumC8145a21, enumC8145a22, enumC8145a23, enumC8145a24, enumC8145a25, enumC8145a26, enumC8145a27, enumC8145a28, enumC8145a29, enumC8145a30};
    }

    private EnumC8145a(String str, int i11, String str2, k kVar, b bVar, m mVar) {
        this.name = str2;
        this.baseUnit = kVar;
        this.rangeUnit = bVar;
        this.range = mVar;
    }

    public static EnumC8145a valueOf(String str) {
        return (EnumC8145a) Enum.valueOf(EnumC8145a.class, str);
    }

    public static EnumC8145a[] values() {
        return (EnumC8145a[]) $VALUES.clone();
    }

    @Override // mg.h
    public final boolean a(e eVar) {
        return eVar.L(this);
    }

    @Override // mg.h
    public final boolean b() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // mg.h
    public final m d() {
        return this.range;
    }

    @Override // mg.h
    public final <R extends d> R e(R r11, long j11) {
        return (R) r11.c1(j11, this);
    }

    @Override // mg.h
    public final long f(e eVar) {
        return eVar.m(this);
    }

    @Override // mg.h
    public final m g(e eVar) {
        return eVar.p(this);
    }

    public final int h(long j11) {
        return this.range.a(j11, this);
    }

    public final void i(long j11) {
        this.range.b(j11, this);
    }

    public final boolean j() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.name;
    }
}
