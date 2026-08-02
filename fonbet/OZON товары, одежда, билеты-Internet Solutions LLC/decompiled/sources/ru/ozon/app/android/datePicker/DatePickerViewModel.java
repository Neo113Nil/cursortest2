package ru.ozon.app.android.datePicker;

import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import java.text.SimpleDateFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.utils.livedata.LiveDataOperatorsKt;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/datePicker/DatePickerViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/datePicker/DatePickerMapper;", "mapper", "<init>", "(Lru/ozon/app/android/datePicker/DatePickerMapper;)V", "Ljava/text/SimpleDateFormat;", "format", "Landroidx/lifecycle/P;", "", "observeDateByFormat", "(Ljava/text/SimpleDateFormat;)Landroidx/lifecycle/P;", "date", "dateFormat", "Lorg/joda/time/LocalDate;", "mapDateToDatePickerFormat", "(Ljava/lang/String;Ljava/text/SimpleDateFormat;)Lorg/joda/time/LocalDate;", "mapDateToDatePickerFormatOrNull", "", "submitDate", "(Lorg/joda/time/LocalDate;)V", "Lru/ozon/app/android/datePicker/DatePickerMapper;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "sharedDate", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "date-picker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DatePickerViewModel extends w0 {

    @NotNull
    private final DatePickerMapper mapper;

    @NotNull
    private final SingleLiveEvent<LocalDate> sharedDate;

    public DatePickerViewModel(@NotNull DatePickerMapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.mapper = mapper;
        this.sharedDate = new SingleLiveEvent<>();
    }

    @NotNull
    public final LocalDate mapDateToDatePickerFormat(@NotNull String date, @NotNull SimpleDateFormat dateFormat) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        return this.mapper.parseDateByFormatOrDefault(date, dateFormat);
    }

    public final LocalDate mapDateToDatePickerFormatOrNull(@NotNull String date, @NotNull SimpleDateFormat dateFormat) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        return this.mapper.parseDateByFormatOrNull(date, dateFormat);
    }

    @NotNull
    public final P<String> observeDateByFormat(@NotNull SimpleDateFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return LiveDataOperatorsKt.map(this.sharedDate, new DatePickerViewModel$observeDateByFormat$1(format, this));
    }

    public final void submitDate(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.sharedDate.setValue(date);
    }
}
