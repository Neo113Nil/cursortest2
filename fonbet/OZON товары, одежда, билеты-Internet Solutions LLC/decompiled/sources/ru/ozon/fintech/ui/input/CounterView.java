package ru.ozon.fintech.ui.input;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010!\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011¨\u0006#"}, d2 = {"Lru/ozon/fintech/ui/input/CounterView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "commonTextColor", "errorTextColor", AppMeasurementSdk.ConditionalUserProperty.VALUE, "maxCount", "getMaxCount", "()I", "setMaxCount", "(I)V", "currentCount", "getCurrentCount", "()Ljava/lang/Integer;", "setCurrentCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "currentCountColor", "getCurrentCountColor", "setCurrentCountColor", "setCounterText", "", "getColoredText", "Landroid/text/Spannable;", "counterText", "", "color", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CounterView extends AppCompatTextView {
    public static final int COUNTER_MAX_DEFAULT = 500;

    @NotNull
    private static final String COUNTER_SEPARATOR = "/";
    private final int commonTextColor;
    private Integer currentCount;
    private int currentCountColor;
    private final int errorTextColor;
    private int maxCount;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CounterView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Spannable getColoredText(String counterText, int color) {
        SpannableString valueOf = SpannableString.valueOf(counterText);
        valueOf.setSpan(new ForegroundColorSpan(color), 0, h.J(counterText, COUNTER_SEPARATOR, 0, false, 6), 33);
        return valueOf;
    }

    private final void setCounterText() {
        String string = getResources().getString(R.string.counter_text, this.currentCount, Integer.valueOf(this.maxCount));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        setText(getColoredText(string, this.currentCountColor));
    }

    public final Integer getCurrentCount() {
        return this.currentCount;
    }

    public final int getCurrentCountColor() {
        return this.currentCountColor;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final void setCurrentCount(Integer num) {
        int intValue = num != null ? num.intValue() : 0;
        this.currentCount = Integer.valueOf(intValue);
        this.currentCountColor = (intValue <= 0 || intValue <= this.maxCount) ? this.commonTextColor : this.errorTextColor;
        setCounterText();
    }

    public final void setCurrentCountColor(int i11) {
        this.currentCountColor = i11;
    }

    public final void setMaxCount(int i11) {
        this.maxCount = i11;
        setCounterText();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CounterView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CounterView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CounterView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int color = androidx.core.content.a.getColor(context, UniColors.TEXT_SECONDARY.getResId());
        this.commonTextColor = color;
        this.errorTextColor = androidx.core.content.a.getColor(context, UniColors.TEXT_NEGATIVE.getResId());
        this.maxCount = COUNTER_MAX_DEFAULT;
        this.currentCount = 0;
        this.currentCountColor = color;
        setId(R.id.finInputCounter);
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.END);
        TextViewExtKt.applyStyle(this, context, UniTextStyles.BODY_300_X_SMALL.getResId());
        setCounterText();
    }
}
