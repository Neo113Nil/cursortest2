package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJD\u0010(\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020$2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020$0%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020$0%2\u0006\u0010'\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b(\u0010)J&\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0018H\u0096\u0001¢\u0006\u0004\b+\u0010\u001bR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010.R\u0016\u00105\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010A\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010<R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010BR\u001b\u0010&\u001a\u0002038FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bD\u0010E*\u0004\bF\u0010GR\u001b\u0010\u001d\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bH\u0010I*\u0004\bJ\u0010GR\u001b\u0010\u001e\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bK\u0010I*\u0004\bL\u0010GR\u001b\u0010P\u001a\u00020,8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bM\u0010N*\u0004\bO\u0010GR\u001b\u0010S\u001a\u00020,8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bQ\u0010N*\u0004\bR\u0010G¨\u0006T"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonsContainerViewGroup;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "configuration", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;)V", "", "setupConfiguration", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "isTransparent", "", "cornerRadius", "updateSticky", "(ZF)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonsV5ContainerState;", "cartButtonsV5ContainerState", "Lkotlin/Function0;", "onFinish", "updateButtonsIfNeeded", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonsV5ContainerState;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5View;", "firstButton", "secondButton", "reSetupButtonsIfNeeded", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5View;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5View;)V", "releaseClickListener", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "LSc/j;", "counterView", "initState", "initialize", "(Landroid/view/ViewGroup;Landroid/view/View;LSc/j;LSc/j;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonsV5ContainerState;)V", "state", "setupButtons", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5WithBadgeView;", "_firstButtonWithBadge", "LSc/j;", "_secondButtonWithBadge", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonView;", "_firstButton", "_secondButton", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5CounterView;", "_counterView", "buttonConfiguration", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "isStickyTransparent", "Z", "isTeenMode", "Landroid/graphics/Paint;", "bgPaint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", "strokePath", "Landroid/graphics/Path;", "bgPath", "strokeWidth", "F", "strokePaint", "getCounterView", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5CounterView;", "getCounterView$delegate", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonsContainerViewGroup;)Ljava/lang/Object;", "getFirstButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonView;", "getFirstButton$delegate", "getSecondButton", "getSecondButton$delegate", "getFirstButtonWithBadge", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5WithBadgeView;", "getFirstButtonWithBadge$delegate", "firstButtonWithBadge", "getSecondButtonWithBadge", "getSecondButtonWithBadge$delegate", "secondButtonWithBadge", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class CartButtonV5ButtonsContainerViewGroup extends LinearLayout {
    private final /* synthetic */ CartButtonV5ButtonsContainerDelegateImpl $$delegate_0;

    @NotNull
    private final InterfaceC4008j<CartButtonV5CounterView> _counterView;

    @NotNull
    private final InterfaceC4008j<CartButtonV5ButtonView> _firstButton;

    @NotNull
    private final InterfaceC4008j<CartButtonV5WithBadgeView> _firstButtonWithBadge;

    @NotNull
    private final InterfaceC4008j<CartButtonV5ButtonView> _secondButton;

    @NotNull
    private final InterfaceC4008j<CartButtonV5WithBadgeView> _secondButtonWithBadge;

    @NotNull
    private final Paint bgPaint;

    @NotNull
    private final Path bgPath;

    @NotNull
    private CartButtonV5Configuration buttonConfiguration;
    private float cornerRadius;
    private boolean isStickyTransparent;
    private final boolean isTeenMode;

    @NotNull
    private final Paint strokePaint;

    @NotNull
    private final Path strokePath;
    private final float strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartButtonV5ButtonsContainerViewGroup(@NotNull Context context, @NotNull CartButtonV5Configuration configuration) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.$$delegate_0 = new CartButtonV5ButtonsContainerDelegateImpl();
        this._firstButtonWithBadge = DelegatesKt.lazyUnsafe(new CartButtonV5ButtonsContainerViewGroup$_firstButtonWithBadge$1(context, this));
        this._secondButtonWithBadge = DelegatesKt.lazyUnsafe(new CartButtonV5ButtonsContainerViewGroup$_secondButtonWithBadge$1(context, this));
        this._firstButton = DelegatesKt.lazyUnsafe(new CartButtonV5ButtonsContainerViewGroup$_firstButton$1(context, this));
        this._secondButton = DelegatesKt.lazyUnsafe(new CartButtonV5ButtonsContainerViewGroup$_secondButton$1(context, this));
        this._counterView = DelegatesKt.lazyUnsafe(new CartButtonV5ButtonsContainerViewGroup$_counterView$1(context));
        this.buttonConfiguration = configuration;
        this.isStickyTransparent = configuration.getIsStickyTransparent();
        boolean isTeenMode = this.buttonConfiguration.getIsTeenMode();
        this.isTeenMode = isTeenMode;
        Paint paint = new Paint(1);
        paint.setColor(a.getColor(context, (isTeenMode ? UniColors.BG_DARK_KEY : UniColors.LAYER_FLOOR_1).getResId()));
        paint.setStyle(Paint.Style.FILL);
        this.bgPaint = paint;
        this.strokePath = new Path();
        this.bgPath = new Path();
        Dimens dimens = Dimens.INSTANCE;
        float dpf_1 = dimens.getDPF_1();
        this.strokeWidth = dpf_1;
        Paint paint2 = new Paint(1);
        paint2.setColor(a.getColor(context, UniColors.GRAPHIC_STROKE_STICKY.getResId()));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(dpf_1);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        this.strokePaint = paint2;
        this.cornerRadius = dimens.getDPF_24();
        setClickable(true);
        setupConfiguration();
    }

    private final void setupConfiguration() {
        int i11 = -1;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Dimens dimens = Dimens.INSTANCE;
        ViewExtKt.updatePadding$default(this, dimens.getDP_8(), 0, dimens.getDP_8(), dimens.getDP_4(), 2, null);
        setWillNotDraw(false);
        View firstButtonWithBadge = this.buttonConfiguration.getHasFirstBadge() ? getFirstButtonWithBadge() : getFirstButton();
        if (!this.buttonConfiguration.getIsSecondInCart()) {
            if (!this.buttonConfiguration.getIsSubscribeButton() && (this.buttonConfiguration.getIsFirstInCart() || !this.buttonConfiguration.getIsSingleButton())) {
                i11 = 0;
            }
            ViewGroup.LayoutParams layoutParams = firstButtonWithBadge.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.width = i11;
                layoutParams2.weight = 1.0f;
            }
            addView(firstButtonWithBadge);
        }
        if (!this.buttonConfiguration.getIsSingleButton() && !this.buttonConfiguration.getIsFirstInCart()) {
            View secondButtonWithBadge = this.buttonConfiguration.getHasSecondBadge() ? getSecondButtonWithBadge() : getSecondButton();
            ViewGroup.LayoutParams layoutParams3 = secondButtonWithBadge.getLayoutParams();
            LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.weight = 1.0f;
                layoutParams4.width = 0;
                layoutParams4.leftMargin = this.buttonConfiguration.getIsSecondInCart() ? 0 : dimens.getDP_8();
                layoutParams4.gravity = (this.buttonConfiguration.getIsSecondInCart() ? 8388611 : 8388613) | 80;
            }
            addView(secondButtonWithBadge);
        }
        if ((this.buttonConfiguration.getIsFirstInCart() || this.buttonConfiguration.getIsSecondInCart()) && !this.buttonConfiguration.getIsSubscribeButton()) {
            addView(getCounterView());
        }
        initialize(this, firstButtonWithBadge, this.buttonConfiguration.getHasSecondBadge() ? this._secondButtonWithBadge : this._secondButton, this._counterView, ((!this.buttonConfiguration.getIsSingleButton() || this.buttonConfiguration.getIsFirstInCart()) && !this.buttonConfiguration.getIsSubscribeButton()) ? (this.buttonConfiguration.getIsSingleButton() && this.buttonConfiguration.getIsFirstInCart()) ? CartButtonsV5ContainerState.SINGLE_COUNTER : (this.buttonConfiguration.getIsSingleButton() || !this.buttonConfiguration.getIsFirstInCart()) ? (this.buttonConfiguration.getIsSingleButton() || !this.buttonConfiguration.getIsSecondInCart()) ? CartButtonsV5ContainerState.DOUBLE_BUTTONS : CartButtonsV5ContainerState.DOUBLE_SECOND : CartButtonsV5ContainerState.DOUBLE_FIRST : CartButtonsV5ContainerState.SINGLE);
    }

    @NotNull
    public final CartButtonV5CounterView getCounterView() {
        return this._counterView.getValue();
    }

    @NotNull
    public final CartButtonV5ButtonView getFirstButton() {
        return this._firstButton.getValue();
    }

    @NotNull
    public final CartButtonV5WithBadgeView getFirstButtonWithBadge() {
        return this._firstButtonWithBadge.getValue();
    }

    @NotNull
    public final CartButtonV5ButtonView getSecondButton() {
        return this._secondButton.getValue();
    }

    @NotNull
    public final CartButtonV5WithBadgeView getSecondButtonWithBadge() {
        return this._secondButtonWithBadge.getValue();
    }

    public void initialize(@NotNull ViewGroup container, @NotNull View firstButton, @NotNull InterfaceC4008j<? extends View> secondButton, @NotNull InterfaceC4008j<? extends View> counterView, @NotNull CartButtonsV5ContainerState initState) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(firstButton, "firstButton");
        Intrinsics.checkNotNullParameter(secondButton, "secondButton");
        Intrinsics.checkNotNullParameter(counterView, "counterView");
        Intrinsics.checkNotNullParameter(initState, "initState");
        this.$$delegate_0.initialize(container, firstButton, secondButton, counterView, initState);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.isStickyTransparent) {
            return;
        }
        this.bgPath.reset();
        if (this.isTeenMode) {
            this.bgPath.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
            canvas.drawPath(this.bgPath, this.bgPaint);
            return;
        }
        Path path = this.bgPath;
        float width = getWidth();
        float height = getHeight();
        float f7 = this.cornerRadius;
        path.addRoundRect(0.0f, 0.0f, width, height, new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        canvas.drawPath(this.bgPath, this.bgPaint);
        float f11 = 2;
        float strokeWidth = this.strokePaint.getStrokeWidth() / f11;
        Path path2 = this.strokePath;
        path2.moveTo(0.0f, this.cornerRadius);
        float f12 = this.strokeWidth;
        path2.quadTo(f12 * f11, f12, this.cornerRadius, strokeWidth);
        path2.lineTo(getWidth() - this.cornerRadius, strokeWidth);
        float width2 = getWidth();
        float f13 = this.strokeWidth;
        path2.quadTo(width2 - (f11 * f13), f13, getWidth(), this.cornerRadius);
        canvas.drawPath(this.strokePath, this.strokePaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void reSetupButtonsIfNeeded(@NotNull CartButtonV5Configuration configuration, @NotNull CartButtonV5View firstButton, CartButtonV5View secondButton) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(firstButton, "firstButton");
        if (configuration.getIsSingleButton() == this.buttonConfiguration.getIsSingleButton() && configuration.getIsFirstInCart() == this.buttonConfiguration.getIsFirstInCart() && configuration.getIsSecondInCart() == this.buttonConfiguration.getIsSecondInCart()) {
            return;
        }
        firstButton.hideSubtitleUpdateAnimation();
        if (secondButton != 0) {
            secondButton.hideSubtitleUpdateAnimation();
        }
        this.buttonConfiguration = configuration;
        removeAllViews();
        setupConfiguration();
        ViewGroup viewGroup = firstButton instanceof ViewGroup ? (ViewGroup) firstButton : null;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 1.0f;
            viewGroup.setLayoutParams(layoutParams2);
        }
        ViewGroup viewGroup2 = secondButton instanceof ViewGroup ? (ViewGroup) secondButton : null;
        if (viewGroup2 != null) {
            ViewGroup.LayoutParams layoutParams3 = viewGroup2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.weight = 1.0f;
            viewGroup2.setLayoutParams(layoutParams4);
        }
    }

    public final void releaseClickListener() {
        if (this._firstButton.isInitialized()) {
            getFirstButton().releaseClickListener();
        }
        if (this._firstButtonWithBadge.isInitialized()) {
            getFirstButtonWithBadge().releaseClickListener();
        }
        if (this._secondButton.isInitialized()) {
            getSecondButton().releaseClickListener();
        }
        if (this._secondButtonWithBadge.isInitialized()) {
            getSecondButtonWithBadge().releaseClickListener();
        }
    }

    public void setupButtons(@NotNull CartButtonsV5ContainerState state, @NotNull Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.$$delegate_0.setupButtons(state, onFinish);
    }

    public final void updateButtonsIfNeeded(@NotNull CartButtonsV5ContainerState cartButtonsV5ContainerState, @NotNull Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(cartButtonsV5ContainerState, "cartButtonsV5ContainerState");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        setupButtons(cartButtonsV5ContainerState, onFinish);
    }

    public final void updateSticky(boolean isTransparent, float cornerRadius) {
        if (this.isStickyTransparent == isTransparent && this.cornerRadius == cornerRadius) {
            return;
        }
        this.isStickyTransparent = isTransparent;
        this.cornerRadius = cornerRadius;
        invalidate();
    }
}
