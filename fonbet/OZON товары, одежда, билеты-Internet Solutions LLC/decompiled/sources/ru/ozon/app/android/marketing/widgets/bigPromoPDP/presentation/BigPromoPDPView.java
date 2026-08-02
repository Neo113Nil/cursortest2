package ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import gk0.q;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$drawable;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation.BigPromoPDPVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010!\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010(R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010(R\u0016\u0010/\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00103\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00100R\u0016\u00104\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00100R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010(R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010(R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010(R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010<\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010B\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010B\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onDetachedFromWindow", "()V", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO;", "data", "onTimerLeft", "(Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindData", "(Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO;Lkotlin/jvm/functions/Function1;)V", "", "percentage", "restartAnimation", "(F)V", "dp4", "I", "dp2", "dp12", "dp16", "dp40", "dp140", "defaultBgColor", "hasProgress", "Z", "hasTimer", "hasButton", "hasStockNumber", "hasStockText", "topPadding", "bottomPadding", "titleStartPadding", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "stockNumber", "stockText", "Lru/ozon/uni/android/atom/icon/IconView;", "chevronIcon", "Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPercentageView;", "animatedProgressView$delegate", "LSc/j;", "getAnimatedProgressView", "()Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPercentageView;", "animatedProgressView", "Lru/ozon/uni/android/atom/image/Image;", "leftLogoImage$delegate", "getLeftLogoImage", "()Lru/ozon/uni/android/atom/image/Image;", "leftLogoImage", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "rightButton$delegate", "getRightButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "rightButton", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPTimerView;", "timerBadge$delegate", "getTimerBadge", "()Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPTimerView;", "timerBadge", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BigPromoPDPView extends ViewGroup {

    /* renamed from: animatedProgressView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j animatedProgressView;
    private int bottomPadding;

    @NotNull
    private final IconView chevronIcon;
    private final int defaultBgColor;
    private final int dp12;
    private final int dp140;
    private final int dp16;
    private final int dp2;
    private final int dp4;
    private final int dp40;
    private boolean hasButton;
    private boolean hasProgress;
    private boolean hasStockNumber;
    private boolean hasStockText;
    private boolean hasTimer;

    /* renamed from: leftLogoImage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j leftLogoImage;

    /* renamed from: rightButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rightButton;

    @NotNull
    private final TextAtomV2View stockNumber;

    @NotNull
    private final TextAtomV2View stockText;

    /* renamed from: timerBadge$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j timerBadge;

    @NotNull
    private final TextAtomV2View title;
    private int titleStartPadding;
    private int topPadding;

    public /* synthetic */ BigPromoPDPView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final BigPromoPercentageView getAnimatedProgressView() {
        return (BigPromoPercentageView) this.animatedProgressView.getValue();
    }

    private final Image getLeftLogoImage() {
        return (Image) this.leftLogoImage.getValue();
    }

    private final ButtonV3View getRightButton() {
        return (ButtonV3View) this.rightButton.getValue();
    }

    public final void bindData(@NotNull BigPromoPDPVO data, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        String widgetBackgroundColor = data.getWidgetBackgroundColor();
        if (widgetBackgroundColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer mapColor = styleParser.mapColor(context, widgetBackgroundColor);
            int intValue = mapColor != null ? mapColor.intValue() : this.defaultBgColor;
            Drawable background = getBackground();
            Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            Drawable mutate = ((GradientDrawable) background).mutate();
            Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
            ColorStateList colorStateList = a.getColorStateList(getContext(), intValue);
            Intrinsics.g(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) mutate).setColor(colorStateList);
        }
        this.hasProgress = data.getCounter() != null && data.getLogo() == null;
        this.hasStockNumber = data.getStockNumber() != null;
        this.hasStockText = data.getStockText() != null;
        this.hasTimer = data.getTimerBadge() != null;
        this.hasButton = data.getRightButton() != null;
        this.topPadding = ResourceExtKt.toPx(data.getPaddings().getTop());
        this.bottomPadding = ResourceExtKt.toPx(data.getPaddings().getBottom());
        this.titleStartPadding = ResourceExtKt.toPx(data.getPaddings().getTextStart());
        TextHolderKt.bind$default(this.title, data.getTitle(), null, 2, null);
        ImageHolderKt.bindOrGone$default(getLeftLogoImage(), data.getLogo(), null, 2, null);
        if (data.getLogo() == null || data.getCounter() == null) {
            getAnimatedProgressView().bindOrGone(data.getCounter(), data.getShouldAnimateProgress());
        } else {
            ViewExtKt.gone(getAnimatedProgressView());
        }
        ButtonV3HolderKt.bindOrGone(getRightButton(), data.getRightButton(), actionHandler);
        IconHolderKt.bindOrGone$default(this.chevronIcon, data.getChevronIcon(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.stockNumber, data.getStockNumber(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.stockText, data.getStockText(), null, 2, null);
        getTimerBadge().bindOrGone(data.getTimerBadge());
    }

    @NotNull
    public final BigPromoPDPTimerView getTimerBadge() {
        return (BigPromoPDPTimerView) this.timerBadge.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        getAnimatedProgressView().cancelAnimation();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i11;
        int measuredHeight;
        View animatedProgressView = this.hasProgress ? getAnimatedProgressView() : getLeftLogoImage();
        LayoutExtKt.layoutLeftTop(animatedProgressView, this.dp12, this.topPadding);
        ViewGroup timerBadge = this.hasTimer ? getTimerBadge() : this.hasButton ? getRightButton() : null;
        if (timerBadge != null) {
            if (this.hasTimer) {
                i11 = this.dp40;
                measuredHeight = getTimerBadge().getMeasuredHeight();
            } else {
                i11 = this.dp40;
                measuredHeight = getRightButton().getMeasuredHeight();
            }
            int i12 = (i11 - measuredHeight) / 2;
            timerBadge.layout((getRight() - timerBadge.getMeasuredWidth()) - this.dp16, animatedProgressView.getTop() + i12, getRight() - this.dp16, animatedProgressView.getBottom() - i12);
        }
        int measuredHeight2 = this.hasStockNumber ? this.stockNumber.getMeasuredHeight() : this.hasStockText ? this.stockText.getMeasuredHeight() : 0;
        int bottom2 = ((animatedProgressView.getBottom() - animatedProgressView.getTop()) - (this.title.getMeasuredHeight() + measuredHeight2)) / 2;
        this.title.layout(animatedProgressView.getRight() + this.titleStartPadding, animatedProgressView.getTop() + bottom2, this.title.getMeasuredWidth() + animatedProgressView.getRight() + this.titleStartPadding, (animatedProgressView.getBottom() - bottom2) - measuredHeight2);
        int bottom3 = ((this.title.getBottom() - this.title.getTop()) - this.dp16) / 2;
        this.chevronIcon.layout(this.title.getRight() + this.dp4, this.title.getTop() + bottom3, this.title.getRight() + this.dp16 + this.dp4, this.title.getBottom() - bottom3);
        LayoutExtKt.layoutLeftTop(this.stockNumber, this.title.getLeft(), this.title.getBottom());
        LayoutExtKt.layoutLeftTop(this.stockText, (!this.hasStockNumber ? this.title.getLeft() : this.stockNumber.getRight()) + this.dp2, this.title.getBottom());
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        MeasureExtKt.measure(getTimerBadge(), this.dp140, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        MeasureExtKt.measureUnspecified(getRightButton());
        MeasureExtKt.measureUnspecified(this.chevronIcon);
        int measuredWidth = (widthMeasureSpec - (this.hasTimer ? getTimerBadge().getMeasuredWidth() : getRightButton().getMeasuredWidth())) - this.chevronIcon.getMeasuredWidth();
        int i11 = this.dp16;
        int i12 = (((measuredWidth - i11) - i11) - this.dp40) - this.titleStartPadding;
        MeasureExtKt.measure(this.title, i12, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        MeasureExtKt.measure(this.stockNumber, widthMeasureSpec, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        int measuredWidth2 = this.hasStockNumber ? this.stockNumber.getMeasuredWidth() + this.dp2 : 0;
        TextAtomV2View textAtomV2View = this.stockText;
        int i13 = i12 - measuredWidth2;
        if (i13 < 0) {
            i13 = 0;
        }
        MeasureExtKt.measure(textAtomV2View, i13, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        Image leftLogoImage = getLeftLogoImage();
        int i14 = this.dp40;
        leftLogoImage.measure(i14, i14);
        BigPromoPercentageView animatedProgressView = getAnimatedProgressView();
        int i15 = this.dp40;
        animatedProgressView.measure(i15, i15);
        setMeasuredDimension(size, (this.hasProgress ? getAnimatedProgressView().getMeasuredHeight() : getLeftLogoImage().getMeasuredHeight()) + this.topPadding + this.bottomPadding);
    }

    public final void onTimerLeft(BigPromoPDPVO data) {
        BigPromoPDPVO.TimerBadgeVO timerBadge;
        getTimerBadge().onTimeLeft((data == null || (timerBadge = data.getTimerBadge()) == null) ? null : timerBadge.getOnExpiredText());
    }

    public final void restartAnimation(float percentage) {
        getAnimatedProgressView().restartAnimation(percentage);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigPromoPDPView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4);
        this.dp2 = ResourceExtKt.toPx(2);
        this.dp12 = ResourceExtKt.toPx(12);
        this.dp16 = ResourceExtKt.toPx(16);
        this.dp40 = ResourceExtKt.toPx(40);
        this.dp140 = ResourceExtKt.toPx(140);
        this.defaultBgColor = context.getColor(R$color.layer_floor_1);
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context);
        if (textAtomV2View == null) {
            context2 = context;
            textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        } else {
            context2 = context;
        }
        textAtomV2View.setId(R$id.bigPromoPdpTitle);
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.title = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context2);
        textAtomV2View2 = textAtomV2View2 == null ? new TextAtomV2View(context2, null, 0, 6, null) : textAtomV2View2;
        textAtomV2View2.setTextIsSelectable(false);
        addView(textAtomV2View2);
        this.stockNumber = textAtomV2View2;
        TextAtomV2View textAtomV2View3 = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context2);
        textAtomV2View3 = textAtomV2View3 == null ? new TextAtomV2View(context2, null, 0, 6, null) : textAtomV2View3;
        textAtomV2View3.setTextIsSelectable(false);
        addView(textAtomV2View3);
        this.stockText = textAtomV2View3;
        IconView iconView = new IconView(context2, null, 0, 6, null);
        this.chevronIcon = iconView;
        this.animatedProgressView = LazyUtilsKt.unsafeLazy(new BigPromoPDPView$animatedProgressView$2(context2, this));
        this.leftLogoImage = LazyUtilsKt.unsafeLazy(new BigPromoPDPView$leftLogoImage$2(context2, this));
        this.rightButton = LazyUtilsKt.unsafeLazy(new BigPromoPDPView$rightButton$2(context2, this));
        this.timerBadge = LazyUtilsKt.unsafeLazy(new BigPromoPDPView$timerBadge$2(context2, this));
        addView(iconView);
        setId(R$id.bigPromoPdp);
        setBackground(C7232a.a(context2, R$drawable.bg_big_promo_pdp));
    }
}
