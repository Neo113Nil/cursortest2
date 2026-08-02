package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.utils;

import Sc.InterfaceC4008j;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.format.DateTimeFormatterBuilder;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/utils/CustomShortMonthDateTimeFormatterBuilder;", "Lorg/joda/time/format/DateTimeFormatterBuilder;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "appendMonthOfYearShortText", "()Lorg/joda/time/format/DateTimeFormatterBuilder;", "", "", "shortMonths$delegate", "LSc/j;", "getShortMonths", "()[Ljava/lang/String;", "shortMonths", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomShortMonthDateTimeFormatterBuilder extends DateTimeFormatterBuilder {

    /* renamed from: shortMonths$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j shortMonths;

    public CustomShortMonthDateTimeFormatterBuilder(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.shortMonths = LazyUtilsKt.unsafeLazy(new CustomShortMonthDateTimeFormatterBuilder$shortMonths$2(context));
    }

    private final String[] getShortMonths() {
        Object value = this.shortMonths.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String[]) value;
    }

    @Override // org.joda.time.format.DateTimeFormatterBuilder
    @NotNull
    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        DateTimeFormatterBuilder append = append(new CustomShortMonthField(getShortMonths()));
        Intrinsics.checkNotNullExpressionValue(append, "append(...)");
        return append;
    }
}
