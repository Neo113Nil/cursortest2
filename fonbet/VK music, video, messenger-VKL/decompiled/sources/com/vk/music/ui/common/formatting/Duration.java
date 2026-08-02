package com.vk.music.ui.common.formatting;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'WEEK' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class Duration {
    private static final /* synthetic */ Duration[] $VALUES;
    public static final Duration DAY;
    public static final Duration HOUR;
    public static final Duration MINUTE;
    public static final Duration MONTH;
    public static final Duration WEEK;
    public static final Duration YEAR;
    private long seconds;

    static {
        Duration duration = new Duration("MINUTE", 0, TimeUnit.MINUTES.toSeconds(1L));
        MINUTE = duration;
        Duration duration2 = new Duration("HOUR", 1, TimeUnit.HOURS.toSeconds(1L));
        HOUR = duration2;
        Duration duration3 = new Duration("DAY", 2, TimeUnit.DAYS.toSeconds(1L));
        DAY = duration3;
        long j = duration3.seconds;
        Duration duration4 = new Duration("WEEK", 3, 7 * j);
        WEEK = duration4;
        Duration duration5 = new Duration("MONTH", 4, 30 * j);
        MONTH = duration5;
        Duration duration6 = new Duration("YEAR", 5, j * 365);
        YEAR = duration6;
        $VALUES = new Duration[]{duration, duration2, duration3, duration4, duration5, duration6};
    }

    public Duration(String str, int i, long j) {
        this.seconds = j;
    }

    public static Duration valueOf(String str) {
        return (Duration) Enum.valueOf(Duration.class, str);
    }

    public static Duration[] values() {
        return (Duration[]) $VALUES.clone();
    }

    public final boolean a(long j) {
        return this.seconds > j;
    }

    public final long h() {
        return this.seconds;
    }
}
