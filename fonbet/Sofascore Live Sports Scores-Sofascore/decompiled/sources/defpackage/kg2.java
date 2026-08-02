package defpackage;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kg2 {
    public static final ZoneId e = ZoneId.of("UTC");
    public final Locale a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final int c;
    public final ArrayList d;

    public kg2(Locale locale) {
        this.a = locale;
        this.c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        kp5 kp5Var = jg2.a;
        ArrayList arrayList = new ArrayList(kp5Var.size());
        int size = kp5Var.size();
        for (int i = 0; i < size; i++) {
            DayOfWeek dayOfWeek = (DayOfWeek) kp5Var.get(i);
            arrayList.add(new Pair(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.d = arrayList;
    }

    public final eg2 a(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(e).toLocalDate();
        return new eg2(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    public final lg2 b(long j) {
        return c(Instant.ofEpochMilli(j).atZone(e).withDayOfMonth(1).toLocalDate());
    }

    public final lg2 c(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.c;
        if (value < 0) {
            value += 7;
        }
        return new lg2(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
    }

    public final eg2 d() {
        LocalDate now = LocalDate.now();
        return new eg2(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), now.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
    }

    public final eg2 e(String str, String str2, Locale locale) {
        try {
            LocalDate parse = LocalDate.parse(str, rfo.C(str2, locale, this.b));
            return new eg2(parse.getYear(), parse.getMonth().getValue(), parse.getDayOfMonth(), parse.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public final String toString() {
        return "CalendarModel";
    }
}
