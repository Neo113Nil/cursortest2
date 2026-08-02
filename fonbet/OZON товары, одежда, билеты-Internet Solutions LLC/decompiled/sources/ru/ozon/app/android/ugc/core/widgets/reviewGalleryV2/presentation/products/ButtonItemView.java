package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products;

import B3.D;
import Sc.InterfaceC4008j;
import Sc.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0018\u0010%\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u00108\u001a\u0004\u0018\u0001028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ButtonItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "", "isInBottomItems", "<init>", "(Landroid/content/Context;Z)V", "", "bgColor", "Landroid/graphics/drawable/Drawable;", "createProductBackground", "(I)Landroid/graphics/drawable/Drawable;", "", "updateCutoutGeometry", "()V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO$ButtonItem;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO$ButtonItem;Lkotlin/jvm/functions/Function1;)V", "Z", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "indicatorView", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "lastBackgroundColor", "Ljava/lang/Integer;", "hasIndicator", "currentBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "", "cutoutBorderPx", "F", "cornerRadiusPx", "Landroid/graphics/Path;", "cutoutPath", "Landroid/graphics/Path;", "Landroid/graphics/RectF;", "innerRect", "Landroid/graphics/RectF;", "outerRect", "Landroid/graphics/Paint;", "clearPaint$delegate", "LSc/j;", "getClearPaint", "()Landroid/graphics/Paint;", "clearPaint", "bottomOverlayPaint", "Landroid/graphics/Paint;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class ButtonItemView extends FrameLayout {
    private final Paint bottomOverlayPaint;

    /* renamed from: clearPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j clearPaint;
    private final float cornerRadiusPx;
    private Drawable currentBackgroundDrawable;
    private final float cutoutBorderPx;

    @NotNull
    private final Path cutoutPath;
    private boolean hasIndicator;

    @NotNull
    private final IndicatorView indicatorView;

    @NotNull
    private final RectF innerRect;
    private final boolean isInBottomItems;
    private Integer lastBackgroundColor;

    @NotNull
    private final RectF outerRect;

    @NotNull
    private final TextAtomV2View textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonItemView(@NotNull Context context, boolean z11) {
        super(context);
        Paint paint;
        Intrinsics.checkNotNullParameter(context, "context");
        this.isInBottomItems = z11;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        textAtomV2View.setTextIsSelectable(false);
        layoutParams.gravity = 16;
        textAtomV2View.setLayoutParams(layoutParams);
        addView(textAtomV2View);
        this.textView = textAtomV2View;
        IndicatorView indicatorView = new IndicatorView(context, null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        layoutParams2.setMarginEnd(0);
        layoutParams2.bottomMargin = 0;
        indicatorView.setLayoutParams(layoutParams2);
        addView(indicatorView);
        this.indicatorView = indicatorView;
        this.cutoutBorderPx = Dimens.INSTANCE.getDPF_2();
        this.cornerRadiusPx = ProductInfoView.INSTANCE.getCORNER_RADIUS();
        this.cutoutPath = new Path();
        this.innerRect = new RectF();
        this.outerRect = new RectF();
        this.clearPaint = k.b(ButtonItemView$clearPaint$2.INSTANCE);
        if (z11) {
            paint = new Paint(1);
            paint.setColor(a.getColor(context, R$color.graphic_dark_key));
            paint.setStyle(Paint.Style.FILL);
        } else {
            paint = null;
        }
        this.bottomOverlayPaint = paint;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setBackground(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$9(ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ButtonItem buttonItem, Function1 function1, View view) {
        AtomActionDTO action = buttonItem.getAction();
        if (action == null || function1 == null) {
            return;
        }
        function1.invoke(AtomActionMapperKt.toAtomAction(action, buttonItem.getTracking()));
    }

    private final Drawable createProductBackground(int bgColor) {
        GradientDrawable b11 = D.b(0);
        b11.setCornerRadius(this.cornerRadiusPx);
        b11.setColor(bgColor);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R$attr.colorControlHighlight, typedValue, true);
        return new RippleDrawable(ColorStateList.valueOf(typedValue.data), b11, null);
    }

    private final Paint getClearPaint() {
        return (Paint) this.clearPaint.getValue();
    }

    private final void updateCutoutGeometry() {
        this.innerRect.set(getWidth() - this.indicatorView.getMeasuredWidth(), getHeight() - this.indicatorView.getMeasuredHeight(), getWidth(), getHeight());
        RectF rectF = this.outerRect;
        RectF rectF2 = this.innerRect;
        float f7 = rectF2.left;
        float f11 = this.cutoutBorderPx;
        rectF.set(f7 - f11, rectF2.top - f11, rectF2.right + f11, rectF2.bottom + f11);
        Path path = this.cutoutPath;
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        RectF rectF3 = this.outerRect;
        float f12 = this.cornerRadiusPx;
        float f13 = this.cutoutBorderPx;
        float f14 = f12 + f13;
        float f15 = f12 + f13;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, f14, f15, direction);
        RectF rectF4 = this.innerRect;
        float f16 = this.cornerRadiusPx;
        path.addRoundRect(rectF4, f16, f16, direction);
    }

    public final void bind(@NotNull ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ButtonItem item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(this.textView, item.getText(), null, 2, null);
        IndicatorHolderKt.bindOrGone$default(this.indicatorView, item.getIndicator(), null, 2, null);
        this.hasIndicator = item.getIndicator() != null;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        int intValue = parseColor != null ? parseColor.intValue() : a.getColor(getContext(), R$color.oz_semantic_accent_feed_2);
        Integer num = this.lastBackgroundColor;
        if (num == null || num.intValue() != intValue) {
            this.currentBackgroundDrawable = createProductBackground(intValue);
            this.lastBackgroundColor = Integer.valueOf(intValue);
        }
        setOnClickListener(new Lk.a(3, item, actionHandler));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z11 = this.hasIndicator && this.indicatorView.getVisibility() == 0;
        if (!this.isInBottomItems && z11) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            Drawable drawable = this.currentBackgroundDrawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
                drawable.draw(canvas);
            }
            super.dispatchDraw(canvas);
            updateCutoutGeometry();
            canvas.drawPath(this.cutoutPath, getClearPaint());
            canvas.restoreToCount(saveLayer);
            return;
        }
        Drawable drawable2 = this.currentBackgroundDrawable;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
            drawable2.draw(canvas);
        }
        super.dispatchDraw(canvas);
        if (!z11 || this.bottomOverlayPaint == null) {
            return;
        }
        updateCutoutGeometry();
        canvas.drawPath(this.cutoutPath, this.bottomOverlayPaint);
    }
}
