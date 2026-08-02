package ru.ozon.fintech.ui.animatedcircleprogress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.fintech.ui.utils.WidgetState;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/ui/animatedcircleprogress/AnimatedCircleProgressWrapper;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animatedCircleProgressView", "Lru/ozon/fintech/ui/animatedcircleprogress/AnimatedCircleProgressView;", "state", "Lru/ozon/fintech/ui/animatedcircleprogress/AnimatedCircleProgressWrapperState;", "bindState", "", "provideActualWidget", "Landroid/view/View;", "provideWidgetState", "Lru/ozon/fintech/ui/utils/WidgetState;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnimatedCircleProgressWrapper extends WidgetFrameLayout {

    @NotNull
    private final AnimatedCircleProgressView animatedCircleProgressView;
    private AnimatedCircleProgressWrapperState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedCircleProgressWrapper(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull AnimatedCircleProgressWrapperState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Common common = state.getCommon();
        AnimatedCircleProgressWrapperState animatedCircleProgressWrapperState = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, animatedCircleProgressWrapperState != null ? animatedCircleProgressWrapperState.getCommon() : null);
        Common common2 = state.getCommon();
        AnimatedCircleProgressWrapperState animatedCircleProgressWrapperState2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, animatedCircleProgressWrapperState2 != null ? animatedCircleProgressWrapperState2.getCommon() : null);
        Common common3 = state.getCommon();
        AnimatedCircleProgressWrapperState animatedCircleProgressWrapperState3 = this.state;
        CbottomExtKt.applyClickListener$default(this, common3, animatedCircleProgressWrapperState3 != null ? animatedCircleProgressWrapperState3.getCommon() : null, null, 4, null);
        AnimatedCircleProgressView animatedCircleProgressView = this.animatedCircleProgressView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = animatedCircleProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        animatedCircleProgressView.setTintColor(styleParser.parseColor(context, state.getTintColor(), R.color.blue_500));
        animatedCircleProgressView.setProgressStrokeWidth(state.getProgressStrokeWidth());
        this.state = state;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    public View provideActualWidget() {
        return null;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState */
    public WidgetState getState() {
        return this.state;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedCircleProgressWrapper(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AnimatedCircleProgressWrapper(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedCircleProgressWrapper(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AnimatedCircleProgressView animatedCircleProgressView = new AnimatedCircleProgressView(context, null, 0, 0, 14, null);
        this.animatedCircleProgressView = animatedCircleProgressView;
        setTag("AnimatedCircleProgressWrapper");
        animatedCircleProgressView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getPaddingFrameLayout().addView(animatedCircleProgressView);
        getPaddingFrameLayout().setClipToPadding(false);
        getPaddingFrameLayout().setClipChildren(false);
    }
}
