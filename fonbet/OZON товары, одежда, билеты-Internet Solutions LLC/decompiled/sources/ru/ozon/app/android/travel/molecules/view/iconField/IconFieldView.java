package ru.ozon.app.android.travel.molecules.view.iconField;

import DN.b;
import Kk.C3531a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ca0.C5795b;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0014J\u0012\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J0\u0010&\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010'\u001a\u00020(2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aJ\u0010\u0010)\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010*\u001a\u00020\u001cH\u0002J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020,H\u0002J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0010H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defaultHeight", "compactHeight", "defaultVerticalMargin", "compactVerticalMargin", "rippleColor", "cornerRadius", "", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "backgroundPaint", "Landroid/graphics/Paint;", "item", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setOnClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "bindOrGone", "isTextAnimated", "", "updateModel", "setUpListener", "showTextWithAnimation", "Lru/ozon/uni/atoms/data/text/TextDTO;", "fadeTextAnimator", "Landroid/animation/ValueAnimator;", "from", "to", "Companion", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IconFieldView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final Paint backgroundPaint;
    private final int compactHeight;
    private final int compactVerticalMargin;
    private float cornerRadius;
    private final int defaultHeight;
    private final int defaultVerticalMargin;

    @NotNull
    private final IconView iconView;
    private IconFieldVO item;
    private final int rippleColor;

    @NotNull
    private final TextAtomV2View textView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldView$Companion;", "", "<init>", "()V", "LOCATOR", "", "LOCATOR_TEXT_VIEW", "LOCATOR_ICON_VIEW", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ IconFieldView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final ValueAnimator fadeTextAnimator(float from, float to) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(from, to);
        ofFloat.addUpdateListener(new C5795b(this, 2));
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fadeTextAnimator$lambda$14$lambda$13(IconFieldView iconFieldView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TextAtomV2View textAtomV2View = iconFieldView.textView;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        textAtomV2View.setAlpha(((Float) animatedValue).floatValue());
    }

    private final void setUpListener() {
        super.setOnClickListener(new b(this, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpListener$lambda$10(IconFieldView iconFieldView, View view) {
        IconFieldVO iconFieldVO;
        CommonControlSettings commonControlSettings;
        AtomActionDTO action;
        AtomAction atomAction;
        Function1<? super AtomAction, Unit> function1 = iconFieldView.actionHandler;
        if (function1 == null || (iconFieldVO = iconFieldView.item) == null || (commonControlSettings = iconFieldVO.getCommonControlSettings()) == null || (action = commonControlSettings.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo())) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final void showTextWithAnimation(final TextDTO item) {
        ValueAnimator fadeTextAnimator = fadeTextAnimator(1.0f, 0.0f);
        ValueAnimator fadeTextAnimator2 = fadeTextAnimator(0.0f, 1.0f);
        fadeTextAnimator2.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.travel.molecules.view.iconField.IconFieldView$showTextWithAnimation$fadeIn$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animation.removeListener(this);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                TextAtomV2View textAtomV2View;
                Intrinsics.checkNotNullParameter(animation, "animation");
                textAtomV2View = IconFieldView.this.textView;
                TextHolderKt.bind$default(textAtomV2View, item, null, 2, null);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(fadeTextAnimator, fadeTextAnimator2);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    public final void bindOrGone(IconFieldVO item, boolean isTextAnimated, Function1<? super AtomAction, Unit> actionHandler) {
        this.item = item;
        this.actionHandler = actionHandler;
        if (item == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        int px = item.getCornerRadius().getPx();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.cornerRadius = ResourceExtKt.toPxF(px, context);
        if (isTextAnimated) {
            showTextWithAnimation(item.getText());
        } else {
            TextHolderKt.bind$default(this.textView, item.getText(), null, 2, null);
            int i11 = item.getIsCompact() ? this.compactVerticalMargin : this.defaultVerticalMargin;
            TextAtomV2View textAtomV2View = this.textView;
            ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = i11;
            textAtomV2View.setLayoutParams(marginLayoutParams);
        }
        this.textView.setContentDescription("TextView");
        IconHolderKt.bind$default(this.iconView, item.getIcon(), null, 2, null);
        this.iconView.setContentDescription("IconView");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context2, item.getBackgroundColor());
        if (parseColor != null) {
            this.backgroundPaint.setColor(parseColor.intValue());
        }
        setForeground(DrawableExtensionsKt.contentlessRipple(this.rippleColor, this.cornerRadius));
        setContentDescription("IconFieldView");
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        IconFieldVO iconFieldVO = this.item;
        if (iconFieldVO == null || iconFieldVO.getBackgroundColor() == null) {
            super.onDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        float f7 = this.cornerRadius;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f7, f7, this.backgroundPaint);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        IconFieldVO iconFieldVO = this.item;
        if (iconFieldVO == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int i11 = iconFieldVO.getIsCompact() ? this.compactHeight : this.defaultHeight;
        CommonCellSettings.LayoutPadding topPadding = iconFieldVO.getText().getTopPadding();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.NONE;
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(i11, (topPadding == layoutPadding && iconFieldVO.getText().getBottomPadding() == layoutPadding) ? 1073741824 : 0));
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
    }

    public final void updateModel(IconFieldVO item) {
        this.item = item;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconFieldView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultHeight = UiExtKt.toPx(52, context);
        this.compactHeight = UiExtKt.toPx(44, context);
        this.defaultVerticalMargin = UiExtKt.toPx(16, context);
        this.compactVerticalMargin = UiExtKt.toPx(12, context);
        this.rippleColor = ThemeExtKt.themeColor(context, R$attr.bgActionSecondary);
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setTextIsSelectable(false);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41657u = 3124;
        bVar.setMarginStart(UiExtKt.toPx(16, context));
        bVar.setMarginEnd(UiExtKt.toPx(4, context));
        textAtomV2View.setLayoutParams(bVar);
        this.textView = textAtomV2View;
        IconView iconView = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, 3124, -2, -2);
        a11.f41636i = 0;
        a11.f41642l = 0;
        a11.f41658v = 0;
        a11.setMarginEnd(UiExtKt.toPx(10, context));
        iconView.setLayoutParams(a11);
        this.iconView = iconView;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
        addView(textAtomV2View);
        addView(iconView);
        setUpListener();
        setWillNotDraw(false);
    }
}
