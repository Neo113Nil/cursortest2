package ru.ozon.app.android.cabinet.profiledatasettings.presentation.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/presentation/mapper/ProfileDateMapper;", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/mapper/IProfileDateMapper;", "<init>", "()V", "apiDateFormat", "Ljava/text/SimpleDateFormat;", "apiDateFormatForPatchUser", "transformDateToIsoFormat", "Lorg/joda/time/LocalDate;", "date", "", "transformViewFormatToIsoForPatchUser", "day", "", "month", "year", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProfileDateMapper implements IProfileDateMapper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final SimpleDateFormat apiDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());

    @NotNull
    private final SimpleDateFormat apiDateFormatForPatchUser = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/presentation/mapper/ProfileDateMapper$Companion;", "", "<init>", "()V", "START_DAY", "", "START_MONTH", "START_YEAR", "ISO_8601_TIME_FORMAT_NO_TIME_ZONE", "", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.app.android.cabinet.profiledatasettings.presentation.mapper.IProfileDateMapper
    @NotNull
    public LocalDate transformDateToIsoFormat(@NotNull String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        try {
            return LocalDate.h(this.apiDateFormat.parse(date));
        } catch (ParseException unused) {
            return new LocalDate(2000, 1, 1);
        }
    }

    @Override // ru.ozon.app.android.cabinet.profiledatasettings.presentation.mapper.IProfileDateMapper
    @NotNull
    public String transformViewFormatToIsoForPatchUser(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, day);
        calendar.set(2, month);
        calendar.set(1, year);
        String format = this.apiDateFormatForPatchUser.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
