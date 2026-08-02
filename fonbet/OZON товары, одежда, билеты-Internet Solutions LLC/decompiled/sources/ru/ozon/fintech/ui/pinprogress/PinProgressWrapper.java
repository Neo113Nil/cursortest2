package ru.ozon.fintech.ui.pinprogress;

import B90.o0;
import B90.q0;
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
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.fintech.ui.utils.WidgetState;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\rH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/fintech/ui/pinprogress/PinProgressWrapper;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinProgressView", "Lru/ozon/fintech/ui/pinprogress/PinProgressView;", "state", "Lru/ozon/fintech/ui/pinprogress/PinProgressWrapperState;", "bindState", "", "provideActualWidget", "Landroid/view/View;", "provideWidgetState", "Lru/ozon/fintech/ui/utils/WidgetState;", "applyStateToView", "newState", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinProgressWrapper extends WidgetFrameLayout {
    private static final long MIN_DELAY = 100;

    @NotNull
    private final PinProgressView pinProgressView;
    private PinProgressWrapperState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinProgressWrapper(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyStateToView(PinProgressWrapperState newState) {
        PinProgressView pinProgressView = this.pinProgressView;
        pinProgressView.setSelectedDot(newState.getSelectedDot());
        pinProgressView.setDotsCount(newState.getDotsCount());
        pinProgressView.setDotRadius(UiExtKt.toPxF(newState.getDotRadius()));
        pinProgressView.setSelectedRadius(UiExtKt.toPxF(newState.getSelectedRadius()));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = pinProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        pinProgressView.setNormalColor(styleParser.parseColor(context, newState.getNormalColor(), UniColors.GRAPHIC_TERTIARY.getResId()));
        Context context2 = pinProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        pinProgressView.setSelectedColor(styleParser.parseColor(context2, newState.getSelectedColor(), UniColors.GRAPHIC_ACTION_PRIMARY.getResId()));
        Context context3 = pinProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        pinProgressView.setErrorColor(styleParser.parseColor(context3, newState.getErrorColor(), UniColors.GRAPHIC_NEGATIVE_PRIMARY.getResId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindState$lambda$1(PinProgressWrapper pinProgressWrapper, PinProgressWrapperState pinProgressWrapperState) {
        pinProgressWrapper.applyStateToView(pinProgressWrapperState);
        if (PinProgressWrapperStateKt.shouldPlayLoaderAnimation(pinProgressWrapperState)) {
            pinProgressWrapper.pinProgressView.post(new o0(pinProgressWrapper, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindState$lambda$1$lambda$0(PinProgressWrapper pinProgressWrapper) {
        pinProgressWrapper.pinProgressView.playLoaderAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindState$lambda$2(PinProgressWrapper pinProgressWrapper) {
        if (PinProgressWrapperStateKt.isFirstLaunch(pinProgressWrapper.state)) {
            pinProgressWrapper.pinProgressView.setupDots();
        }
        pinProgressWrapper.pinProgressView.playLoaderAnimation();
    }

    public final void bindState(@NotNull PinProgressWrapperState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Common common = state.getCommon();
        PinProgressWrapperState pinProgressWrapperState = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, pinProgressWrapperState != null ? pinProgressWrapperState.getCommon() : null);
        Common common2 = state.getCommon();
        PinProgressWrapperState pinProgressWrapperState2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, pinProgressWrapperState2 != null ? pinProgressWrapperState2.getCommon() : null);
        Common common3 = state.getCommon();
        PinProgressWrapperState pinProgressWrapperState3 = this.state;
        CbottomExtKt.applyClickListener$default(this, common3, pinProgressWrapperState3 != null ? pinProgressWrapperState3.getCommon() : null, null, 4, null);
        if (PinProgressWrapperStateKt.isFirstLaunch(this.state) || !PinProgressWrapperStateKt.shouldPlayLoaderAnimation(this.state)) {
            applyStateToView(state);
            if (PinProgressWrapperStateKt.shouldPlayLoaderAnimation(state)) {
                this.pinProgressView.post(new q0(this, 4));
            }
        } else if (PinProgressWrapperStateKt.shouldResetLoaderAnimation(this.state, state)) {
            this.pinProgressView.reset();
            this.pinProgressView.postDelayed(new M2.b(2, this, state), 600L);
        }
        this.state = state;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this.pinProgressView;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState */
    public WidgetState getState() {
        return this.state;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinProgressWrapper(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PinProgressWrapper(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinProgressWrapper(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        PinProgressView pinProgressView = new PinProgressView(context, null, 0, 6, null);
        this.pinProgressView = pinProgressView;
        setTag("PinProgressWrapper");
        pinProgressView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getPaddingFrameLayout().addView(pinProgressView);
        getPaddingFrameLayout().setClipToPadding(false);
        getPaddingFrameLayout().setClipChildren(false);
    }
}
