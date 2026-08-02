package ru.ozon.app.android.datePicker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/datePicker/DatePickerMapper;", "", "<init>", "()V", "extractTime", "Ljava/util/Date;", "date", "Lorg/joda/time/LocalDate;", "parseDateByFormatOrDefault", "", "format", "Ljava/text/SimpleDateFormat;", "parseDateByFormatOrNull", "Companion", "date-picker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DatePickerMapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/datePicker/DatePickerMapper$Companion;", "", "<init>", "()V", "DEFAULT_YEAR", "", "DEFAULT_MONTH", "DEFAULT_DAY", "getDefaultDate", "Lorg/joda/time/LocalDate;", "date-picker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LocalDate getDefaultDate() {
            return new LocalDate(2000, 1, 1);
        }

        private Companion() {
        }
    }

    @NotNull
    public final Date extractTime(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, date.i());
        calendar.set(2, date.n() - 1);
        calendar.set(1, date.s());
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }

    @NotNull
    public final LocalDate parseDateByFormatOrDefault(@NotNull String date, @NotNull SimpleDateFormat format) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(format, "format");
        try {
            return LocalDate.h(format.parse(date));
        } catch (ParseException unused) {
            return new LocalDate(2000, 1, 1);
        }
    }

    public final LocalDate parseDateByFormatOrNull(@NotNull String date, @NotNull SimpleDateFormat format) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(format, "format");
        try {
            return LocalDate.h(format.parse(date));
        } catch (ParseException unused) {
            return null;
        }
    }
}
