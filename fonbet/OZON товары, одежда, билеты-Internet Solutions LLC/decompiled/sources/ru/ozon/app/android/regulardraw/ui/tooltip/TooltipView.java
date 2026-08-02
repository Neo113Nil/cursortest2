package ru.ozon.app.android.regulardraw.ui.tooltip;

import B3.D;
import Sc.InterfaceC4008j;
import Sc.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.R$drawable;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadge;
import ru.ozon.app.android.regulardraw.ui.tooltip.ToolTipConfig;
import ru.ozon.app.android.regulardraw.utils.Dimens;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0014\u0010$\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001e\u001a\u0004\b3\u00104R\u001b\u00109\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001e\u001a\u0004\b7\u00108R\u001b\u0010<\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u001e\u001a\u0004\b;\u00104R\u0018\u0010=\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/tooltip/TooltipView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "", "arrowBias", "", "supportIconButton", "supportBottomViewGroup", "<init>", "(Landroid/content/Context;FZZ)V", "Landroid/graphics/drawable/GradientDrawable;", "createOvalBackground", "()Landroid/graphics/drawable/GradientDrawable;", "Landroid/widget/FrameLayout;", "initIconButtonWrapperIfNeeded", "()Landroid/widget/FrameLayout;", "Landroid/widget/LinearLayout;", "initBottomViewGroupIfNeeded", "()Landroid/widget/LinearLayout;", "Lru/ozon/app/android/regulardraw/ui/tooltip/ToolTipConfig;", "toolTipConfig", "", "bind", "(Lru/ozon/app/android/regulardraw/ui/tooltip/ToolTipConfig;)V", "Z", "", "rootVerticalPadding", "I", "warningImageMargin$delegate", "LSc/j;", "getWarningImageMargin", "()I", "warningImageMargin", "imageVerticalMargins", "tooltipImgWidth", "tooltipImgHeight", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "arrowView", "Landroidx/appcompat/widget/AppCompatTextView;", "textView", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonV3View$delegate", "getIconButtonV3View", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonV3View", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadge;", "leftCurrencyBadge$delegate", "getLeftCurrencyBadge", "()Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadge;", "leftCurrencyBadge", "currencySeparatorImg$delegate", "getCurrencySeparatorImg", "()Landroid/widget/ImageView;", "currencySeparatorImg", "rightCurrencyBadge$delegate", "getRightCurrencyBadge", "rightCurrencyBadge", "bottomViewGroup", "Landroid/widget/LinearLayout;", "iconButtonWrapper", "Landroid/widget/FrameLayout;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class TooltipView extends ConstraintLayout {

    @NotNull
    private final ImageView arrowView;
    private LinearLayout bottomViewGroup;

    /* renamed from: currencySeparatorImg$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j currencySeparatorImg;

    /* renamed from: iconButtonV3View$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconButtonV3View;
    private final FrameLayout iconButtonWrapper;
    private final int imageVerticalMargins;

    @NotNull
    private final ImageView imageView;

    /* renamed from: leftCurrencyBadge$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j leftCurrencyBadge;

    /* renamed from: rightCurrencyBadge$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rightCurrencyBadge;
    private final int rootVerticalPadding;
    private final boolean supportBottomViewGroup;
    private final boolean supportIconButton;

    @NotNull
    private final AppCompatTextView textView;
    private final int tooltipImgHeight;
    private final int tooltipImgWidth;

    /* renamed from: warningImageMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j warningImageMargin;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.ui.tooltip.TooltipView$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<d, Unit> {
        final /* synthetic */ float $arrowBias;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f7) {
            super(1);
            this.$arrowBias = f7;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
            invoke2(dVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d updateConstraints) {
            Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
            ConstraintSetExtKt.bottomToBottom(updateConstraints, TooltipView.this.imageView.getId(), 0, -TooltipView.this.imageVerticalMargins);
            ConstraintSetExtKt.startToStart(updateConstraints, TooltipView.this.imageView.getId(), 0, -ResourceExtKt.toPx(13));
            ConstraintSetExtKt.topToTop(updateConstraints, TooltipView.this.imageView.getId(), 0, -TooltipView.this.imageVerticalMargins);
            if (this.$arrowBias > 0.0f) {
                ConstraintSetExtKt.topToTop(updateConstraints, TooltipView.this.arrowView.getId(), 0, -ResourceExtKt.toPx(15));
            } else {
                ConstraintSetExtKt.bottomToBottom(updateConstraints, TooltipView.this.arrowView.getId(), 0, -ResourceExtKt.toPx(15));
            }
            ConstraintSetExtKt.startToStart(updateConstraints, TooltipView.this.arrowView.getId(), 0, 0);
            ConstraintSetExtKt.endToEnd(updateConstraints, TooltipView.this.arrowView.getId(), 0, 0);
            updateConstraints.c0(Math.abs(this.$arrowBias), TooltipView.this.arrowView.getId());
            ConstraintSetExtKt.topToTop(updateConstraints, TooltipView.this.textView.getId(), 0, 0);
            int id2 = TooltipView.this.textView.getId();
            int id3 = TooltipView.this.imageView.getId();
            Dimens dimens = Dimens.INSTANCE;
            ConstraintSetExtKt.startToEnd(updateConstraints, id2, id3, dimens.getDP_6());
            FrameLayout frameLayout = TooltipView.this.iconButtonWrapper;
            if (frameLayout != null) {
                ConstraintSetExtKt.endToStart(updateConstraints, TooltipView.this.textView.getId(), frameLayout.getId(), dimens.getDP_12());
                ConstraintSetExtKt.endToEnd(updateConstraints, frameLayout.getId(), 0, 0);
                ConstraintSetExtKt.topToTop(updateConstraints, frameLayout.getId(), 0, 0);
                ConstraintSetExtKt.bottomToBottom(updateConstraints, frameLayout.getId(), 0, 0);
            } else {
                ConstraintSetExtKt.endToEnd(updateConstraints, TooltipView.this.textView.getId(), 0, 0);
            }
            LinearLayout linearLayout = TooltipView.this.bottomViewGroup;
            if (linearLayout != null) {
                TooltipView tooltipView = TooltipView.this;
                ConstraintSetExtKt.topToBottom(updateConstraints, linearLayout.getId(), tooltipView.textView.getId(), dimens.getDP_2());
                ConstraintSetExtKt.startToEnd(updateConstraints, linearLayout.getId(), tooltipView.imageView.getId(), dimens.getDP_6());
                ConstraintSetExtKt.endToEnd(updateConstraints, linearLayout.getId(), 0, 0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipView(@NotNull Context context, float f7, boolean z11, boolean z12) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.supportIconButton = z11;
        this.supportBottomViewGroup = z12;
        int px = ResourceExtKt.toPx(9);
        this.rootVerticalPadding = px;
        this.warningImageMargin = LazyUtilsKt.unsafeLazy(TooltipView$warningImageMargin$2.INSTANCE);
        this.imageVerticalMargins = z11 ? px - getWarningImageMargin() : 0;
        int px2 = ResourceExtKt.toPx(55);
        this.tooltipImgWidth = px2;
        int px3 = ResourceExtKt.toPx(58);
        this.tooltipImgHeight = px3;
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.b(px2, px3));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(imageView);
        this.imageView = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(View.generateViewId());
        imageView2.setImageResource(R$drawable.img_ic_arrow_tooltip);
        imageView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        imageView2.setRotation(f7 > 0.0f ? 0.0f : 180.0f);
        addView(imageView2);
        this.arrowView = imageView2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(View.generateViewId());
        TextViewExtKt.applyStyle(appCompatTextView, context, R$style.Text_SemiBold);
        appCompatTextView.setTextColor(a.getColor(context, R$color.tooltip_text_color));
        appCompatTextView.setLayoutParams(new ConstraintLayout.b(0, -2));
        appCompatTextView.setLineSpacing(0.0f, 1.22f);
        appCompatTextView.setTextSize(2, 14.0f);
        appCompatTextView.setLetterSpacing(0.0f);
        addView(appCompatTextView);
        this.textView = appCompatTextView;
        this.iconButtonV3View = LazyUtilsKt.unsafeLazy(new TooltipView$iconButtonV3View$2(context));
        this.leftCurrencyBadge = LazyUtilsKt.unsafeLazy(new TooltipView$leftCurrencyBadge$2(context));
        this.currencySeparatorImg = LazyUtilsKt.unsafeLazy(new TooltipView$currencySeparatorImg$2(context));
        this.rightCurrencyBadge = LazyUtilsKt.unsafeLazy(new TooltipView$rightCurrencyBadge$2(context));
        this.bottomViewGroup = initBottomViewGroupIfNeeded();
        this.iconButtonWrapper = initIconButtonWrapperIfNeeded();
        setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        int px4 = ResourceExtKt.toPx(17);
        Dimens dimens = Dimens.INSTANCE;
        bVar.setMargins(px4, 0, dimens.getDP_8(), 0);
        setLayoutParams(bVar);
        setPadding(0, px, z11 ? dimens.getDP_2() : dimens.getDP_12(), px);
        setBackground(createOvalBackground());
        setClipToPadding(false);
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass2(f7));
    }

    private final GradientDrawable createOvalBackground() {
        GradientDrawable b11 = D.b(0);
        b11.setColor(a.getColor(getContext(), R$color.tooltip_bg_color));
        b11.setCornerRadius(ResourceExtKt.toPxF(14));
        return b11;
    }

    private final ImageView getCurrencySeparatorImg() {
        return (ImageView) this.currencySeparatorImg.getValue();
    }

    private final IconButtonV3View getIconButtonV3View() {
        return (IconButtonV3View) this.iconButtonV3View.getValue();
    }

    private final MorkovskCurrencyBadge getLeftCurrencyBadge() {
        return (MorkovskCurrencyBadge) this.leftCurrencyBadge.getValue();
    }

    private final MorkovskCurrencyBadge getRightCurrencyBadge() {
        return (MorkovskCurrencyBadge) this.rightCurrencyBadge.getValue();
    }

    private final int getWarningImageMargin() {
        return ((Number) this.warningImageMargin.getValue()).intValue();
    }

    private final LinearLayout initBottomViewGroupIfNeeded() {
        if (!this.supportBottomViewGroup) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(View.generateViewId());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        Dimens dimens = Dimens.INSTANCE;
        linearLayout.setPadding(0, dimens.getDP_4(), 0, dimens.getDP_4());
        linearLayout.addView(getLeftCurrencyBadge());
        linearLayout.addView(getCurrencySeparatorImg());
        linearLayout.addView(getRightCurrencyBadge());
        addView(linearLayout);
        return linearLayout;
    }

    private final FrameLayout initIconButtonWrapperIfNeeded() {
        if (!this.supportIconButton) {
            return null;
        }
        final Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context) { // from class: ru.ozon.app.android.regulardraw.ui.tooltip.TooltipView$initIconButtonWrapperIfNeeded$1
            @Override // android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent ev) {
                return true;
            }
        };
        frameLayout.setId(View.generateViewId());
        frameLayout.setLayoutParams(new ConstraintLayout.b(-2, -2));
        frameLayout.addView(getIconButtonV3View());
        addView(frameLayout);
        return frameLayout;
    }

    public final void bind(@NotNull ToolTipConfig toolTipConfig) {
        Intrinsics.checkNotNullParameter(toolTipConfig, "toolTipConfig");
        this.textView.setText(toolTipConfig.getTooltipText());
        ImageViewExtKt.load$default(this.imageView, toolTipConfig.getTooltipImg(), null, null, null, new ImageSize(this.tooltipImgWidth, this.tooltipImgHeight), false, LoadPriority.HIGH, 46, null);
        if (toolTipConfig instanceof ToolTipConfig.BasicOnboarding) {
            return;
        }
        if (toolTipConfig instanceof ToolTipConfig.BottomViewOnboarding) {
            ToolTipConfig.BottomViewOnboarding bottomViewOnboarding = (ToolTipConfig.BottomViewOnboarding) toolTipConfig;
            MorkovskCurrencyBadge.bindOrInvisible$default(getLeftCurrencyBadge(), bottomViewOnboarding.getLeftCurrencyBadgeVO(), null, 2, null);
            getCurrencySeparatorImg().setImageResource(bottomViewOnboarding.getBadgeSeparator());
            MorkovskCurrencyBadge.bindOrInvisible$default(getRightCurrencyBadge(), bottomViewOnboarding.getRightCurrencyBadgeVO(), null, 2, null);
            return;
        }
        if (!(toolTipConfig instanceof ToolTipConfig.Warning)) {
            throw new o();
        }
        ToolTipConfig.Warning warning = (ToolTipConfig.Warning) toolTipConfig;
        TestInfo testInfo = warning.getTestInfo();
        setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
        IconButtonV3HolderKt.bind$default(getIconButtonV3View(), warning.getIconButtonV3DTO(), null, 2, null);
    }
}
