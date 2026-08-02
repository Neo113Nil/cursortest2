package ru.ozon.uni.android.textArea.common;

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
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$string;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R.\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001f¨\u0006$"}, d2 = {"Lru/ozon/uni/android/textArea/common/CounterView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setCounterText", "()V", "", "counterText", "color", "Landroid/text/Spannable;", "getColoredText", "(Ljava/lang/String;I)Landroid/text/Spannable;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "maxCount", "I", "getMaxCount", "()I", "setMaxCount", "(I)V", "currentCount", "Ljava/lang/Integer;", "getCurrentCount", "()Ljava/lang/Integer;", "setCurrentCount", "(Ljava/lang/Integer;)V", "currentCountColor", "getCurrentCountColor", "setCurrentCountColor", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CounterView extends AppCompatTextView {
    private Integer currentCount;
    private Integer currentCountColor;
    private int maxCount;
    public static final int $stable = 8;

    public /* synthetic */ CounterView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final Spannable getColoredText(String counterText, int color) {
        SpannableString valueOf = SpannableString.valueOf(counterText);
        valueOf.setSpan(new ForegroundColorSpan(color), 0, h.J(counterText, "/", 0, false, 6), 33);
        return valueOf;
    }

    private final void setCounterText() {
        Spannable coloredText;
        String string = getResources().getString(R$string.counter_text, this.currentCount, Integer.valueOf(this.maxCount));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Integer num = this.currentCountColor;
        if (num != null && (coloredText = getColoredText(string, num.intValue())) != null) {
            string = coloredText;
        }
        setText(string);
    }

    public final void setCurrentCount(Integer num) {
        if (num == null) {
            num = 0;
        }
        this.currentCount = num;
        setCounterText();
    }

    public final void setCurrentCountColor(Integer num) {
        this.currentCountColor = num;
    }

    public final void setMaxCount(int i11) {
        this.maxCount = i11;
        setCounterText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CounterView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxCount = ru.ozon.fintech.ui.input.CounterView.COUNTER_MAX_DEFAULT;
        this.currentCount = 0;
        setId(R$id.inputCounter);
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.END);
        TextViewExtKt.applyStyle(this, context, UniTextStyles.BODY_300_X_SMALL.getResId());
        setCounterText();
    }
}
