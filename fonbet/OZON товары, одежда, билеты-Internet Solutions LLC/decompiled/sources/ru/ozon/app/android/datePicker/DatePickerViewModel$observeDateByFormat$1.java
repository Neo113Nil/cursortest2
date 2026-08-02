package ru.ozon.app.android.datePicker;

import java.text.SimpleDateFormat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lorg/joda/time/LocalDate;", "kotlin.jvm.PlatformType", "invoke", "(Lorg/joda/time/LocalDate;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DatePickerViewModel$observeDateByFormat$1 extends AbstractC7737t implements Function1<LocalDate, String> {
    final /* synthetic */ SimpleDateFormat $format;
    final /* synthetic */ DatePickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatePickerViewModel$observeDateByFormat$1(SimpleDateFormat simpleDateFormat, DatePickerViewModel datePickerViewModel) {
        super(1);
        this.$format = simpleDateFormat;
        this.this$0 = datePickerViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(LocalDate localDate) {
        DatePickerMapper datePickerMapper;
        SimpleDateFormat simpleDateFormat = this.$format;
        datePickerMapper = this.this$0.mapper;
        Intrinsics.f(localDate);
        String format = simpleDateFormat.format(datePickerMapper.extractTime(localDate));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
