package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input;

import Hj.C3143a;
import Sc.o;
import U7.d;
import V.e;
import android.widget.EditText;
import hd.C6915b;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input.OpenRangeFilterInputType;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0010\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u001e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001d\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterEditTextFormatter;", "", "<init>", "()V", "separator", "", "decimalFormatSymbol", "Ljava/text/DecimalFormatSymbols;", "integerFormat", "Ljava/text/DecimalFormat;", "minValue", "", "Ljava/lang/Float;", "maxValue", "maxValueSign", "", "initWith", "", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)V", "formatEditTextString", "editText", "Landroid/widget/EditText;", "correctValue", "", "options", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterEditTextFormatter$FormattingOptions;", "numberAsFormattedString", "number", "", "checkMaxValueSign", "correctedValue", "Companion", "FormattingOptions", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OpenRangeFilterEditTextFormatter {

    @NotNull
    private final DecimalFormatSymbols decimalFormatSymbol;

    @NotNull
    private final DecimalFormat integerFormat;
    private Float maxValue;
    private String maxValueSign;
    private Float minValue;
    private char separator = ' ';
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterEditTextFormatter$FormattingOptions;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;", "type", "", "isFocused", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;", "getType", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;", "Z", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormattingOptions {
        private final boolean isFocused;

        @NotNull
        private final OpenRangeFilterInputType type;

        public FormattingOptions(@NotNull OpenRangeFilterInputType type, boolean z11) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.isFocused = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormattingOptions)) {
                return false;
            }
            FormattingOptions formattingOptions = (FormattingOptions) other;
            return Intrinsics.d(this.type, formattingOptions.type) && this.isFocused == formattingOptions.isFocused;
        }

        @NotNull
        public final OpenRangeFilterInputType getType() {
            return this.type;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFocused) + (this.type.hashCode() * 31);
        }

        /* renamed from: isFocused, reason: from getter */
        public final boolean getIsFocused() {
            return this.isFocused;
        }

        @NotNull
        public String toString() {
            return "FormattingOptions(type=" + this.type + ", isFocused=" + this.isFocused + ")";
        }
    }

    public OpenRangeFilterEditTextFormatter() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(this.separator);
        this.decimalFormatSymbol = decimalFormatSymbols;
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        this.integerFormat = decimalFormat;
        this.minValue = Float.valueOf(Float.MIN_VALUE);
        this.maxValue = Float.valueOf(Float.MAX_VALUE);
    }

    private final String checkMaxValueSign(String str, float f7) {
        Float f11 = this.maxValue;
        return (f11 == null || f7 != f11.floatValue() || this.maxValueSign == null) ? str : d.e(e.b(new Object[]{str}, 1, "%s", "format(...)"), this.maxValueSign);
    }

    public final void formatEditTextString(@NotNull EditText editText, boolean correctValue, @NotNull FormattingOptions options) {
        String str;
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(options, "options");
        String g10 = C3143a.g("\\s", h.z0(editText.getText().toString()).toString(), "");
        OpenRangeFilterInputType type = options.getType();
        OpenRangeFilterInputType.To to = OpenRangeFilterInputType.To.INSTANCE;
        if (Intrinsics.d(type, to) && (str = this.maxValueSign) != null) {
            g10 = h.X(g10, str, "", false);
        }
        OpenRangeFilterInputType type2 = options.getType();
        float f7 = 0.0f;
        if (Intrinsics.d(type2, OpenRangeFilterInputType.From.INSTANCE)) {
            Float f11 = this.minValue;
            if (f11 != null) {
                f7 = f11.floatValue();
            }
        } else {
            if (!Intrinsics.d(type2, to)) {
                throw new o();
            }
            Float f12 = this.maxValue;
            if (f12 != null) {
                f7 = f12.floatValue();
            }
        }
        Float v02 = h.v0(g10);
        if (v02 != null) {
            f7 = v02.floatValue();
        }
        if (correctValue) {
            f7 = ((Number) kotlin.ranges.h.h(Float.valueOf(f7), this.minValue, this.maxValue)).floatValue();
        }
        OpenRangeFilterTextInputEditTextKt.setTextWithSelection(editText, numberAsFormattedString(Float.valueOf(f7), correctValue, options));
    }

    public final void initWith(Float minValue, Float maxValue, String maxValueSign) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.maxValueSign = maxValueSign;
    }

    @NotNull
    public final String numberAsFormattedString(@NotNull Number number, boolean correctValue, @NotNull FormattingOptions options) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(options, "options");
        float floatValue = number.floatValue();
        if (correctValue && this.minValue != null && this.maxValue != null) {
            floatValue = ((Number) kotlin.ranges.h.h(Float.valueOf(floatValue), this.minValue, this.maxValue)).floatValue();
        }
        String str = this.integerFormat.format(Integer.valueOf(C6915b.c(floatValue))).toString();
        return (!Intrinsics.d(options.getType(), OpenRangeFilterInputType.To.INSTANCE) || options.getIsFocused()) ? str : checkMaxValueSign(str, floatValue);
    }
}
