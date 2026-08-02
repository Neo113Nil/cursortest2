package ru.ozon.app.android.storefront.core.atoms.views;

import Hj.C3143a;
import Sc.o;
import Xc.a;
import Xc.b;
import android.widget.EditText;
import hd.C6915b;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.views.RangeFilterView;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0003%&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0014J,\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0002J\f\u0010$\u001a\u00020\u0019*\u00020\u001fH\u0002R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/RangeEditTextFormatter;", "", "<init>", "()V", "separator", "", "Ljava/lang/Character;", "rangeType", "Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data$RangeType;", "minValue", "", "Ljava/lang/Float;", "maxValue", "integerFormat", "Ljava/text/DecimalFormat;", "decimalFormat", "decimalFormatSymbol", "Ljava/text/DecimalFormatSymbols;", "initWith", "", "(Ljava/lang/Character;Lru/ozon/app/android/storefront/core/atoms/views/RangeFilterView$Data$RangeType;Ljava/lang/Float;Ljava/lang/Float;)V", "formatEditTextString", "editText", "Landroid/widget/EditText;", "correctValue", "", "rangePartType", "Lru/ozon/app/android/storefront/core/atoms/views/RangeEditTextFormatter$RangePartType;", "textLengthState", "Lru/ozon/app/android/storefront/core/atoms/views/RangeEditTextFormatter$TextLengthState;", "numberAsFormattedString", "", "number", "", "removeRedundantSeparators", "input", "containsSeparator", "Companion", "TextLengthState", "RangePartType", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RangeEditTextFormatter {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Character[] SEPARATORS = {',', '.'};
    private Character separator = ' ';
    private RangeFilterView.Data.RangeType rangeType = RangeFilterView.Data.RangeType.INTEGER;
    private Float minValue = Float.valueOf(Float.MIN_VALUE);
    private Float maxValue = Float.valueOf(Float.MAX_VALUE);

    @NotNull
    private final DecimalFormat integerFormat = new DecimalFormat();

    @NotNull
    private final DecimalFormat decimalFormat = new DecimalFormat();

    @NotNull
    private final DecimalFormatSymbols decimalFormatSymbol = new DecimalFormatSymbols();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/RangeEditTextFormatter$Companion;", "", "<init>", "()V", "DEFAULT_SEPARATOR", "", "DEFAULT_SEPARATOR_STRING", "", "COMMA_SEPARATOR_STRING", "DOT_SEPARATOR_STRING", "COMMA_SEPARATOR_CHAR", "DOT_SEPARATOR_CHAR", "LIMIT_OF_SEPARATOR_SYMBOLS", "", "SEPARATORS", "", "getSEPARATORS$atoms_prodGoogleAllVendorsRelease", "()[Ljava/lang/Character;", "[Ljava/lang/Character;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Character[] getSEPARATORS$atoms_prodGoogleAllVendorsRelease() {
            return RangeEditTextFormatter.SEPARATORS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/RangeEditTextFormatter$RangePartType;", "", "<init>", "(Ljava/lang/String;I)V", "FROM", "TO", "UNDEFINED", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RangePartType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RangePartType[] $VALUES;
        public static final RangePartType FROM = new RangePartType("FROM", 0);

        /* renamed from: TO, reason: collision with root package name */
        public static final RangePartType f93505TO = new RangePartType("TO", 1);
        public static final RangePartType UNDEFINED = new RangePartType("UNDEFINED", 2);

        private static final /* synthetic */ RangePartType[] $values() {
            return new RangePartType[]{FROM, f93505TO, UNDEFINED};
        }

        static {
            RangePartType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RangePartType(String str, int i11) {
        }

        public static RangePartType valueOf(String str) {
            return (RangePartType) Enum.valueOf(RangePartType.class, str);
        }

        public static RangePartType[] values() {
            return (RangePartType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/RangeEditTextFormatter$TextLengthState;", "", "<init>", "(Ljava/lang/String;I)V", "ADDING", "CLEARING", "UNCHANGED", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TextLengthState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TextLengthState[] $VALUES;
        public static final TextLengthState ADDING = new TextLengthState("ADDING", 0);
        public static final TextLengthState CLEARING = new TextLengthState("CLEARING", 1);
        public static final TextLengthState UNCHANGED = new TextLengthState("UNCHANGED", 2);

        private static final /* synthetic */ TextLengthState[] $values() {
            return new TextLengthState[]{ADDING, CLEARING, UNCHANGED};
        }

        static {
            TextLengthState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TextLengthState(String str, int i11) {
        }

        public static TextLengthState valueOf(String str) {
            return (TextLengthState) Enum.valueOf(TextLengthState.class, str);
        }

        public static TextLengthState[] values() {
            return (TextLengthState[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RangePartType.values().length];
            try {
                iArr[RangePartType.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RangePartType.f93505TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RangeFilterView.Data.RangeType.values().length];
            try {
                iArr2[RangeFilterView.Data.RangeType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RangeFilterView.Data.RangeType.DECIMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final boolean containsSeparator(String str) {
        return h.u(str, ',') || h.u(str, '.');
    }

    public static /* synthetic */ void formatEditTextString$default(RangeEditTextFormatter rangeEditTextFormatter, EditText editText, boolean z11, RangePartType rangePartType, TextLengthState textLengthState, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            rangePartType = RangePartType.UNDEFINED;
        }
        if ((i11 & 8) != 0) {
            textLengthState = null;
        }
        rangeEditTextFormatter.formatEditTextString(editText, z11, rangePartType, textLengthState);
    }

    public static /* synthetic */ void initWith$default(RangeEditTextFormatter rangeEditTextFormatter, Character ch2, RangeFilterView.Data.RangeType rangeType, Float f7, Float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ch2 = ' ';
        }
        rangeEditTextFormatter.initWith(ch2, rangeType, f7, f11);
    }

    private final String removeRedundantSeparators(String input) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < input.length(); i11++) {
            char charAt = input.charAt(i11);
            Character[] chArr = SEPARATORS;
            if (C7705l.m(chArr, Character.valueOf(charAt))) {
                if (C7705l.m(chArr, Character.valueOf(charAt))) {
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                    if (containsSeparator(sb3)) {
                    }
                }
            }
            sb2.append(charAt);
        }
        String sb4 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public final void formatEditTextString(@NotNull EditText editText, boolean correctValue, @NotNull RangePartType rangePartType, TextLengthState textLengthState) {
        Float f7;
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(rangePartType, "rangePartType");
        if (textLengthState == TextLengthState.CLEARING && this.rangeType == RangeFilterView.Data.RangeType.DECIMAL) {
            return;
        }
        String removeRedundantSeparators = removeRedundantSeparators(h.X(C3143a.g("\\s", h.z0(editText.getText().toString()).toString(), ""), ",", ".", false));
        if (h.u(removeRedundantSeparators, ',') || h.u(removeRedundantSeparators, '.')) {
            this.decimalFormat.setMinimumFractionDigits(1);
        } else {
            this.decimalFormat.setMinimumFractionDigits(0);
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[rangePartType.ordinal()];
        float f11 = 0.0f;
        if (i11 == 1) {
            Float f12 = this.minValue;
            if (f12 != null) {
                f11 = f12.floatValue();
            }
        } else if (i11 == 2 && (f7 = this.maxValue) != null) {
            f11 = f7.floatValue();
        }
        if (removeRedundantSeparators.length() > 0) {
            try {
                f11 = Float.parseFloat(removeRedundantSeparators);
            } catch (NumberFormatException unused) {
            }
        }
        if (correctValue) {
            f11 = ((Number) kotlin.ranges.h.h(Float.valueOf(f11), this.minValue, this.maxValue)).floatValue();
        }
        RangeEditTextFormatterKt.setTextWithSelection(editText, numberAsFormattedString(Float.valueOf(f11), correctValue));
    }

    public final void initWith(Character separator, RangeFilterView.Data.RangeType rangeType, Float minValue, Float maxValue) {
        this.separator = separator;
        DecimalFormatSymbols decimalFormatSymbols = this.decimalFormatSymbol;
        decimalFormatSymbols.setGroupingSeparator(separator != null ? separator.charValue() : ' ');
        decimalFormatSymbols.setDecimalSeparator(',');
        this.integerFormat.setDecimalFormatSymbols(this.decimalFormatSymbol);
        DecimalFormat decimalFormat = this.decimalFormat;
        decimalFormat.setDecimalFormatSymbols(this.decimalFormatSymbol);
        decimalFormat.setMinimumFractionDigits(1);
        decimalFormat.setMaximumFractionDigits(2);
        this.rangeType = rangeType;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @NotNull
    public final String numberAsFormattedString(@NotNull Number number, boolean correctValue) {
        String format;
        Intrinsics.checkNotNullParameter(number, "number");
        float floatValue = number.floatValue();
        if (correctValue && this.minValue != null && this.maxValue != null) {
            floatValue = ((Number) kotlin.ranges.h.h(Float.valueOf(floatValue), this.minValue, this.maxValue)).floatValue();
        }
        RangeFilterView.Data.RangeType rangeType = this.rangeType;
        if (rangeType == null) {
            rangeType = RangeFilterView.Data.RangeType.INTEGER;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$1[rangeType.ordinal()];
        if (i11 == 1) {
            format = this.integerFormat.format(Integer.valueOf(C6915b.c(floatValue)));
        } else {
            if (i11 != 2) {
                throw new o();
            }
            format = this.decimalFormat.format(Float.valueOf(floatValue));
        }
        return format.toString();
    }
}
