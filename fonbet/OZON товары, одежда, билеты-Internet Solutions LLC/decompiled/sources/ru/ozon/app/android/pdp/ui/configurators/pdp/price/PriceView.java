package ru.ozon.app.android.pdp.ui.configurators.pdp.price;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.appearance.text.StrikethroughTextView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0014J0\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0014J$\u0010\"\u001a\u00020\u00192\b\b\u0001\u0010#\u001a\u00020\b2\b\b\u0001\u0010$\u001a\u00020\b2\b\b\u0001\u0010%\u001a\u00020\bJ\"\u0010&\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0001\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020+J\u001a\u0010,\u001a\u00020\u00192\b\u0010-\u001a\u0004\u0018\u00010(2\b\b\u0001\u0010)\u001a\u00020\bJ0\u0010.\u001a\u00020\u00192\b\u0010/\u001a\u0004\u0018\u00010(2\b\b\u0001\u00100\u001a\u00020\b2\b\b\u0003\u00101\u001a\u00020\b2\n\b\u0002\u00102\u001a\u0004\u0018\u000103J\b\u00104\u001a\u00020\bH\u0002J\u0010\u00105\u001a\u00020\b2\u0006\u00106\u001a\u000207H\u0002J\u0012\u00108\u001a\u00020\u000e2\b\b\u0001\u00109\u001a\u00020\bH\u0002J\u0012\u0010:\u001a\u00020\u00112\b\b\u0001\u00109\u001a\u00020\bH\u0002J\u0012\u0010;\u001a\u00020\u00132\b\b\u0001\u00109\u001a\u00020\bH\u0002J \u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u0002072\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0002J\u0010\u0010>\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002J\f\u0010?\u001a\u00020\b*\u00020\u000eH\u0002J0\u0010@\u001a\u00020\u00192\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010B\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u000e2\b\b\u0002\u0010C\u001a\u00020\nH\u0002J \u0010D\u001a\u00020\u0019*\u00020\u000e2\b\u0010E\u001a\u0004\u0018\u00010(2\b\b\u0001\u00100\u001a\u00020\bH\u0002J*\u0010D\u001a\u00020\u0019*\u00020\u00112\b\u0010E\u001a\u0004\u0018\u00010(2\b\b\u0001\u00100\u001a\u00020\b2\b\b\u0001\u00101\u001a\u00020\bH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceView;", "Landroid/view/ViewGroup;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "isSelect", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "finalPriceTv", "Landroid/widget/TextView;", "priceDescriptionTv", "originalPriceTv", "Lru/ozon/uni/android/uikit/appearance/text/StrikethroughTextView;", "iconIv", "Landroid/widget/ImageView;", "finalPriceAppearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "priceDescriptionAppearance", "originalPriceAppearance", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "left", "top", "right", "bottom", "applyStyles", "priceStyle", "priceDescriptionStyle", "originalPriceStyle", "setPrice", "price", "", "color", "locator", "", "setPriceDescription", "description", "setOriginalPrice", "originalPrice", "textColor", "strikeLineColor", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "calculateTotalHorizontalSpacing", "getHorizontalOffset", "childView", "Landroid/view/View;", "addTextSubView", "id", "addStrikethroughTextSubView", "addIconImageSubView", "measureChildren", "view", "getMaxWidth", "bottomBaseline", "applyStyle", "appearance", "style", "applyTextColorsFromStyle", "bindOrGone", "charSequence", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class PriceView extends ViewGroup implements AtomView {

    @NotNull
    private final StyleAppearance<TextView> finalPriceAppearance;

    @NotNull
    private final TextView finalPriceTv;

    @NotNull
    private final ImageView iconIv;
    private final boolean isSelect;

    @NotNull
    private final StyleAppearance<TextView> originalPriceAppearance;

    @NotNull
    private final StrikethroughTextView originalPriceTv;

    @NotNull
    private final StyleAppearance<TextView> priceDescriptionAppearance;

    @NotNull
    private final TextView priceDescriptionTv;

    public /* synthetic */ PriceView(Context context, AttributeSet attributeSet, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, z11);
    }

    private final ImageView addIconImageSubView(int id2) {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(id2);
        Dimens dimens = Dimens.INSTANCE;
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(dimens.getDP_16(), dimens.getDP_16()));
        addView(imageView);
        return imageView;
    }

    private final StrikethroughTextView addStrikethroughTextSubView(int id2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StrikethroughTextView strikethroughTextView = new StrikethroughTextView(context, null, 0, 6, null);
        strikethroughTextView.setId(id2);
        marginLayoutParams = PriceViewKt.DEFAULT_LAYOUT_PARAMS;
        strikethroughTextView.setLayoutParams(marginLayoutParams);
        addView(strikethroughTextView);
        return strikethroughTextView;
    }

    private final TextView addTextSubView(int id2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(id2);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setGravity(16);
        marginLayoutParams = PriceViewKt.DEFAULT_LAYOUT_PARAMS;
        appCompatTextView.setLayoutParams(marginLayoutParams);
        addView(appCompatTextView);
        return appCompatTextView;
    }

    private final void applyStyle(StyleAppearance<TextView> appearance, int style, TextView view, boolean applyTextColorsFromStyle) {
        ColorStateList textColors = view.getTextColors();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appearance.read(context, style);
        appearance.apply(view);
        if (applyTextColorsFromStyle) {
            textColors = null;
        }
        if (textColors != null) {
            view.setTextColor(textColors);
        }
    }

    static /* synthetic */ void applyStyle$default(PriceView priceView, StyleAppearance styleAppearance, int i11, TextView textView, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        priceView.applyStyle(styleAppearance, i11, textView, z11);
    }

    private final void bindOrGone(StrikethroughTextView strikethroughTextView, CharSequence charSequence, int i11, int i12) {
        bindOrGone(strikethroughTextView, charSequence, i11);
        strikethroughTextView.setStrikeColor(i12);
    }

    private final int bottomBaseline(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    private final int calculateTotalHorizontalSpacing() {
        CharSequence text = this.priceDescriptionTv.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        int horizontalOffset = !h.K(text) ? getHorizontalOffset(this.priceDescriptionTv) : 0;
        CharSequence text2 = this.originalPriceTv.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (!h.K(text2)) {
            horizontalOffset += getHorizontalOffset(this.originalPriceTv);
        }
        return this.iconIv.getDrawable() != null ? horizontalOffset + getHorizontalOffset(this.iconIv) : horizontalOffset;
    }

    private final int getHorizontalOffset(View childView) {
        if (childView == this.priceDescriptionTv) {
            return Dimens.INSTANCE.getDP_2();
        }
        if (childView == this.originalPriceTv) {
            return this.isSelect ? Dimens.INSTANCE.getDP_4() : Dimens.INSTANCE.getDP_8();
        }
        if (childView == this.iconIv) {
            return Dimens.INSTANCE.getDP_4();
        }
        return 0;
    }

    private final int getMaxWidth(int widthMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.getSize(widthMeasureSpec);
        }
        return Integer.MAX_VALUE;
    }

    private final void measureChildren(View view, int widthMeasureSpec, int heightMeasureSpec) {
        measureChildWithMargins(view, widthMeasureSpec, 0, heightMeasureSpec, 0);
    }

    public final void applyStyles(int priceStyle, int priceDescriptionStyle, int originalPriceStyle) {
        applyStyle$default(this, this.finalPriceAppearance, priceStyle, this.finalPriceTv, false, 8, null);
        applyStyle$default(this, this.priceDescriptionAppearance, priceDescriptionStyle, this.priceDescriptionTv, false, 8, null);
        applyStyle$default(this, this.originalPriceAppearance, originalPriceStyle, this.originalPriceTv, false, 8, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i11;
        int measuredHeight;
        int paddingBottom = (bottom - top) - getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int bottomBaseline = bottomBaseline(this.finalPriceTv) - bottomBaseline(this.originalPriceTv);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            Intrinsics.f(childAt);
            if (!ViewExtKt.isVisible(childAt)) {
                childAt = null;
            }
            if (childAt != null) {
                if (i12 != 0 && paddingLeft - getPaddingLeft() > 0) {
                    paddingLeft += getHorizontalOffset(childAt);
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                int id2 = childAt.getId();
                if (id2 == R$id.finalPriceTv) {
                    measuredHeight = paddingBottom - childAt.getMeasuredHeight();
                } else {
                    if (id2 == R$id.originalPriceTv || id2 == ru.ozon.app.android.pdp.ui.configurators.R$id.priceDescriptionTv) {
                        i11 = paddingBottom - bottomBaseline;
                        measuredHeight = (paddingBottom - childAt.getMeasuredHeight()) - bottomBaseline;
                    } else if (id2 == ru.ozon.app.android.pdp.ui.configurators.R$id.priceIconIv) {
                        TextView textView = this.originalPriceTv;
                        if (textView.getHeight() <= 0) {
                            textView = null;
                        }
                        if (textView == null) {
                            TextView textView2 = this.priceDescriptionTv;
                            TextView textView3 = textView2.getHeight() > 0 ? textView2 : null;
                            textView = textView3 == null ? this.finalPriceTv : textView3;
                        }
                        int height = textView.getHeight() - childAt.getMeasuredHeight();
                        if (height > 0) {
                            int i13 = height / 2;
                            int top2 = textView.getTop() + i13;
                            i11 = textView.getBottom() - i13;
                            measuredHeight = top2;
                        } else {
                            measuredHeight = textView.getTop() - (Math.abs(height) / 2);
                            i11 = childAt.getMeasuredHeight() + measuredHeight;
                        }
                    } else {
                        measuredHeight = 0;
                    }
                    childAt.layout(paddingLeft, measuredHeight, measuredWidth, i11);
                    paddingLeft = measuredWidth;
                }
                i11 = paddingBottom;
                childAt.layout(paddingLeft, measuredHeight, measuredWidth, i11);
                paddingLeft = measuredWidth;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int maxWidth = getMaxWidth(widthMeasureSpec);
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            Intrinsics.f(childAt);
            if (!ViewExtKt.isVisible(childAt)) {
                childAt = null;
            }
            if (childAt != null) {
                measureChildren(childAt, widthMeasureSpec, heightMeasureSpec);
                int measuredWidth = childAt.getMeasuredWidth() + i11;
                i12 = Math.max(childAt.getMeasuredHeight(), i12);
                i11 = measuredWidth;
            }
        }
        setMeasuredDimension(Math.min(maxWidth, getPaddingRight() + getPaddingLeft() + calculateTotalHorizontalSpacing() + i11), getPaddingTop() + getPaddingBottom() + i12);
    }

    public final void setOriginalPrice(CharSequence originalPrice, int textColor, int strikeLineColor, Icon icon) {
        bindOrGone(this.originalPriceTv, originalPrice, textColor, strikeLineColor);
        ru.ozon.app.android.pdp.utils.ViewExtKt.bindOrGone$default(this.iconIv, icon, null, 2, null);
    }

    public final void setPrice(CharSequence price, int color, @NotNull String locator) {
        Intrinsics.checkNotNullParameter(locator, "locator");
        bindOrGone(this.finalPriceTv, price, color);
        this.finalPriceTv.setContentDescription(locator);
    }

    public final void setPriceDescription(CharSequence description, int color) {
        bindOrGone(this.priceDescriptionTv, description, color);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceView(@NotNull Context context, AttributeSet attributeSet, int i11, boolean z11) {
        super(context, attributeSet, i11);
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Intrinsics.checkNotNullParameter(context, "context");
        this.isSelect = z11;
        this.finalPriceTv = addTextSubView(R$id.finalPriceTv);
        this.priceDescriptionTv = addTextSubView(ru.ozon.app.android.pdp.ui.configurators.R$id.priceDescriptionTv);
        this.originalPriceTv = addStrikethroughTextSubView(R$id.originalPriceTv);
        this.iconIv = addIconImageSubView(ru.ozon.app.android.pdp.ui.configurators.R$id.priceIconIv);
        StyleAppearance.Companion companion = StyleAppearance.INSTANCE;
        this.finalPriceAppearance = StyleAppearance.Companion.ofText$default(companion, null, 1, null);
        this.priceDescriptionAppearance = StyleAppearance.Companion.ofText$default(companion, null, 1, null);
        this.originalPriceAppearance = StyleAppearance.Companion.ofText$default(companion, null, 1, null);
        marginLayoutParams = PriceViewKt.DEFAULT_LAYOUT_PARAMS;
        setLayoutParams(marginLayoutParams);
    }

    private final void bindOrGone(TextView textView, CharSequence charSequence, int i11) {
        textView.setVisibility(charSequence == null ? 8 : 0);
        if (charSequence == null) {
            return;
        }
        textView.setText(charSequence);
        textView.setTextColor(i11);
    }
}
