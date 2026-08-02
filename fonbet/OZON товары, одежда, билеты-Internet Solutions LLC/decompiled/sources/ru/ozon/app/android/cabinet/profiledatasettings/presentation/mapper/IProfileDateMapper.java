package ru.ozon.app.android.cabinet.profiledatasettings.presentation.mapper;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/presentation/mapper/IProfileDateMapper;", "", "transformDateToIsoFormat", "Lorg/joda/time/LocalDate;", "date", "", "transformViewFormatToIsoForPatchUser", "day", "", "month", "year", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface IProfileDateMapper {
    @NotNull
    LocalDate transformDateToIsoFormat(@NotNull String date);

    @NotNull
    String transformViewFormatToIsoForPatchUser(int day, int month, int year);
}
