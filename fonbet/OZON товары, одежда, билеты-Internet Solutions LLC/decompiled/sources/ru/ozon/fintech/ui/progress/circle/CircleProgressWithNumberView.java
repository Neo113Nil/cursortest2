package ru.ozon.fintech.ui.progress.circle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.databinding.CircleProgressWithNumberViewBinding;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/ui/progress/circle/CircleProgressWithNumberView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/fintech/ui/databinding/CircleProgressWithNumberViewBinding;", "state", "Lru/ozon/fintech/ui/progress/circle/CircleProgressWithNumberState;", "getState", "()Lru/ozon/fintech/ui/progress/circle/CircleProgressWithNumberState;", "setState", "(Lru/ozon/fintech/ui/progress/circle/CircleProgressWithNumberState;)V", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CircleProgressWithNumberView extends FrameLayout {

    @NotNull
    private final CircleProgressWithNumberViewBinding binding;
    private CircleProgressWithNumberState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleProgressWithNumberView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull CircleProgressWithNumberState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        if (state.getDigit() != null) {
            TextAtomView digit = this.binding.digit;
            Intrinsics.checkNotNullExpressionValue(digit, "digit");
            TextAtomHolderKt.bind$default(digit, state.getDigit(), null, 2, null);
        }
        TextAtomView digit2 = this.binding.digit;
        Intrinsics.checkNotNullExpressionValue(digit2, "digit");
        digit2.setVisibility(state.getDigit() != null ? 0 : 8);
        this.binding.circleProgress.updateProgressCircleData(state.getCircleAndDiginColor(), null, state.getPercentage(), 2);
    }

    public final CircleProgressWithNumberState getState() {
        return this.state;
    }

    public final void setState(CircleProgressWithNumberState circleProgressWithNumberState) {
        this.state = circleProgressWithNumberState;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleProgressWithNumberView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CircleProgressWithNumberView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressWithNumberView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        CircleProgressWithNumberViewBinding inflate = CircleProgressWithNumberViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }
}
