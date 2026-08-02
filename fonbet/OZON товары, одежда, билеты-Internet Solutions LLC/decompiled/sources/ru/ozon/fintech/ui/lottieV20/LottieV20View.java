package ru.ozon.fintech.ui.lottieV20;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/ui/lottieV20/LottieV20View;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lottie", "Lcom/airbnb/lottie/LottieAnimationView;", "state", "Lru/ozon/fintech/ui/lottieV20/LottieV20State;", "provideWidgetState", "provideActualWidget", "Landroid/view/View;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieV20View extends WidgetFrameLayout {

    @NotNull
    private final LottieAnimationView lottie;
    private LottieV20State state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LottieV20View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull LottieV20State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Common common = state.getCommon();
        LottieV20State lottieV20State = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, lottieV20State != null ? lottieV20State.getCommon() : null);
        Common common2 = state.getCommon();
        LottieV20State lottieV20State2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, lottieV20State2 != null ? lottieV20State2.getCommon() : null);
        Common common3 = state.getCommon();
        LottieV20State lottieV20State3 = this.state;
        CbottomExtKt.applyClickListener$default(this, common3, lottieV20State3 != null ? lottieV20State3.getCommon() : null, null, 4, null);
        this.state = state;
        if (state.getInfinity()) {
            this.lottie.setRepeatCount(-1);
            this.lottie.setRepeatMode(1);
        }
        this.lottie.setAnimationFromJson(state.getLottieResource(), null);
        this.lottie.playAnimation();
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this.lottie;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LottieV20View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState, reason: from getter */
    public LottieV20State getState() {
        return this.state;
    }

    public /* synthetic */ LottieV20View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieV20View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.lottie = lottieAnimationView;
        lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        getPaddingFrameLayout().addView(lottieAnimationView);
        setTag("LottieV20View");
    }
}
