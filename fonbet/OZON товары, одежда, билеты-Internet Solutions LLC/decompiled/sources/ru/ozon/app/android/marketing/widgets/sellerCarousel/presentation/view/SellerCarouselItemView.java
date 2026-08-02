package ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.view;

import Gl.C3124a;
import Vc.a;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$drawable;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.view.atoms.ratingbadge.RatingBadgeView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u0007H\u0014J0\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0007H\u0014J\b\u0010D\u001a\u00020\u0014H\u0002J\b\u0010E\u001a\u00020\u0007H\u0002J\b\u0010F\u001a\u00020\u0007H\u0002J\b\u0010G\u001a\u00020\u0007H\u0002R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010%\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010'\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016R\u0011\u0010)\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0016R\u0011\u0010+\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0016R\u000e\u0010-\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/view/SellerCarouselItemView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "favoriteButton", "Landroidx/appcompat/widget/AppCompatImageView;", "getFavoriteButton", "()Landroidx/appcompat/widget/AppCompatImageView;", "logo", "getLogo", "premium", "getPremium", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroidx/appcompat/widget/AppCompatTextView;", "getTitle", "()Landroidx/appcompat/widget/AppCompatTextView;", "subtitle", "getSubtitle", "count", "getCount", "rating", "Lru/ozon/app/android/uikit/view/atoms/ratingbadge/RatingBadgeView;", "getRating", "()Lru/ozon/app/android/uikit/view/atoms/ratingbadge/RatingBadgeView;", "preview1", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView;", "getPreview1", "()Lru/ozon/app/android/product/imagesswipeview/AdultImageView;", "preview2", "getPreview2", "preview3", "getPreview3", "priceView1", "getPriceView1", "priceView2", "getPriceView2", "priceView3", "getPriceView3", "margin", "favoriteMargin", "infoLeftMargin", "infoRightMargin", "ratingMargin", "imagesMargin", "favoriteButtonSize", "Landroid/util/Size;", "logoSize", "premiumSize", "pricePadding", "priceHeight", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "l", "t", "r", "b", "createPriceView", "calculateInfoHeight", "calculateInfoWidth", "calculateHeaderHeight", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerCarouselItemView extends ViewGroup {

    @NotNull
    private final AppCompatTextView count;

    @NotNull
    private final AppCompatImageView favoriteButton;

    @NotNull
    private final Size favoriteButtonSize;
    private final int favoriteMargin;
    private final int imagesMargin;
    private final int infoLeftMargin;
    private final int infoRightMargin;

    @NotNull
    private final AppCompatImageView logo;

    @NotNull
    private final Size logoSize;
    private final int margin;

    @NotNull
    private final AppCompatImageView premium;

    @NotNull
    private final Size premiumSize;

    @NotNull
    private final AdultImageView preview1;

    @NotNull
    private final AdultImageView preview2;

    @NotNull
    private final AdultImageView preview3;
    private final int priceHeight;
    private final int pricePadding;

    @NotNull
    private final AppCompatTextView priceView1;

    @NotNull
    private final AppCompatTextView priceView2;

    @NotNull
    private final AppCompatTextView priceView3;

    @NotNull
    private final RatingBadgeView rating;
    private final int ratingMargin;

    @NotNull
    private final AppCompatTextView subtitle;

    @NotNull
    private final AppCompatTextView title;

    public /* synthetic */ SellerCarouselItemView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final int calculateHeaderHeight() {
        return Math.max(this.logo.getMeasuredHeight(), calculateInfoHeight());
    }

    private final int calculateInfoHeight() {
        return this.subtitle.getMeasuredHeight() + this.title.getMeasuredHeight() + (this.count.getVisibility() == 8 ? 0 : this.count.getMeasuredHeight()) + (this.rating.getVisibility() != 8 ? this.ratingMargin + this.rating.getMeasuredHeight() : 0);
    }

    private final int calculateInfoWidth() {
        return a.c(new int[]{this.subtitle.getMeasuredWidth(), this.count.getVisibility() == 8 ? 0 : this.count.getMeasuredWidth(), this.rating.getVisibility() != 8 ? this.rating.getMeasuredWidth() : 0}, this.title.getMeasuredWidth()) + this.infoLeftMargin + this.infoRightMargin;
    }

    private final AppCompatTextView createPriceView() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setTextAppearance(R$style.TextStyle_Caption_Bold_White);
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextColor(appCompatTextView.getContext().getColor(R$color.oz_white_1));
        appCompatTextView.setBackgroundDrawable(androidx.core.content.a.getDrawable(appCompatTextView.getContext(), R$drawable.bg_seller_price));
        return appCompatTextView;
    }

    @NotNull
    public final AppCompatTextView getCount() {
        return this.count;
    }

    @NotNull
    public final AppCompatImageView getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    public final AppCompatImageView getLogo() {
        return this.logo;
    }

    @NotNull
    public final AppCompatImageView getPremium() {
        return this.premium;
    }

    @NotNull
    public final AdultImageView getPreview1() {
        return this.preview1;
    }

    @NotNull
    public final AdultImageView getPreview2() {
        return this.preview2;
    }

    @NotNull
    public final AdultImageView getPreview3() {
        return this.preview3;
    }

    @NotNull
    public final AppCompatTextView getPriceView1() {
        return this.priceView1;
    }

    @NotNull
    public final AppCompatTextView getPriceView2() {
        return this.priceView2;
    }

    @NotNull
    public final AppCompatTextView getPriceView3() {
        return this.priceView3;
    }

    @NotNull
    public final RatingBadgeView getRating() {
        return this.rating;
    }

    @NotNull
    public final AppCompatTextView getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final AppCompatTextView getTitle() {
        return this.title;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        AppCompatImageView appCompatImageView = this.favoriteButton;
        int measuredWidth = getMeasuredWidth();
        int i11 = this.favoriteMargin;
        LayoutExtKt.layoutRightTop(appCompatImageView, measuredWidth - i11, i11);
        int calculateInfoHeight = calculateInfoHeight();
        int calculateHeaderHeight = calculateHeaderHeight();
        AppCompatImageView appCompatImageView2 = this.logo;
        int i12 = this.margin;
        LayoutExtKt.layoutLeftBottom(appCompatImageView2, i12, calculateHeaderHeight + i12);
        if (this.premium.getVisibility() != 8) {
            LayoutExtKt.layoutRightBottom(this.premium, this.logo.getRight(), this.logo.getBottom());
        }
        int i13 = this.margin;
        int a11 = C3124a.a(calculateHeaderHeight, calculateInfoHeight, 2, i13);
        int measuredWidth2 = this.logo.getMeasuredWidth() + i13 + this.infoLeftMargin;
        LayoutExtKt.layoutLeftTop(this.title, measuredWidth2, a11);
        LayoutExtKt.layoutLeftTop(this.subtitle, measuredWidth2, this.title.getBottom());
        int bottom = this.subtitle.getBottom();
        if (this.count.getVisibility() != 8) {
            LayoutExtKt.layoutLeftTop(this.count, measuredWidth2, bottom);
            bottom = this.count.getBottom();
        }
        if (this.rating.getVisibility() != 8) {
            LayoutExtKt.layoutLeftTop(this.rating, measuredWidth2, bottom + this.ratingMargin);
        }
        AdultImageView adultImageView = this.preview1;
        int i14 = this.margin;
        int measuredWidth3 = (getMeasuredWidth() - this.preview1.getMeasuredWidth()) - this.preview2.getMeasuredWidth();
        int i15 = this.margin;
        LayoutExtKt.layoutLeftTop(adultImageView, C3124a.a(measuredWidth3 - (i15 * 2), this.imagesMargin, 2, i14), (i15 * 2) + calculateHeaderHeight);
        LayoutExtKt.layoutLeftTop(this.preview2, this.preview1.getRight() + this.imagesMargin, this.preview1.getTop());
        LayoutExtKt.layoutLeftTop(this.preview3, this.preview2.getLeft(), this.preview2.getBottom() + this.imagesMargin);
        LayoutExtKt.layoutLeftBottom(this.priceView1, this.preview1.getLeft(), this.preview1.getBottom());
        LayoutExtKt.layoutLeftBottom(this.priceView2, this.preview2.getLeft(), this.preview2.getBottom());
        LayoutExtKt.layoutLeftBottom(this.priceView3, this.preview3.getLeft(), this.preview3.getBottom());
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MeasureExtKt.measureExactly(this.favoriteButton, this.favoriteButtonSize.getWidth(), this.favoriteButtonSize.getHeight());
        MeasureExtKt.measureExactly(this.logo, this.logoSize.getWidth(), this.logoSize.getHeight());
        MeasureExtKt.measureExactly(this.premium, this.premiumSize.getWidth(), this.premiumSize.getHeight());
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int measuredWidth = ((size - (this.logo.getMeasuredWidth() + this.margin)) - (this.favoriteButton.getMeasuredWidth() + this.favoriteMargin)) - (this.infoLeftMargin + this.infoRightMargin);
        MeasureExtKt.measure(this.title, measuredWidth, mode, 0, 0);
        MeasureExtKt.measure(this.subtitle, measuredWidth, mode, 0, 0);
        if (this.count.getVisibility() != 8) {
            MeasureExtKt.measure(this.count, measuredWidth, mode, 0, 0);
        }
        if (this.rating.getVisibility() != 8) {
            if (mode == 0) {
                MeasureExtKt.measureUnspecified(this.rating);
            } else {
                MeasureExtKt.measure(this.rating, measuredWidth, LinearLayoutManager.INVALID_OFFSET, 0, 0);
            }
        }
        int measuredWidth2 = this.favoriteButton.getMeasuredWidth() + this.favoriteMargin + this.logo.getMeasuredWidth() + this.margin + calculateInfoWidth();
        int calculateHeaderHeight = (this.margin * 2) + this.margin + calculateHeaderHeight();
        int min = (mode == 0 ? measuredWidth2 : Math.min(measuredWidth2, size)) - (this.margin * 2);
        if (mode2 != 0) {
            min = Math.min(min, (((size2 - calculateHeaderHeight) * 3) / 2) + this.imagesMargin);
        }
        int i11 = this.imagesMargin;
        int i12 = (min - (i11 * 2)) / 3;
        int i13 = (i12 * 2) + i11;
        MeasureExtKt.measureExactly(this.preview1, i13, i13);
        MeasureExtKt.measureExactly(this.preview2, i12, i12);
        MeasureExtKt.measureExactly(this.preview3, i12, i12);
        MeasureExtKt.measure(this.priceView1, i13, LinearLayoutManager.INVALID_OFFSET, this.priceHeight, 1073741824);
        MeasureExtKt.measure(this.priceView2, i12, LinearLayoutManager.INVALID_OFFSET, this.priceHeight, 1073741824);
        MeasureExtKt.measure(this.priceView3, i12, LinearLayoutManager.INVALID_OFFSET, this.priceHeight, 1073741824);
        int measuredHeight = this.preview1.getMeasuredHeight() + calculateHeaderHeight;
        AppCompatTextView appCompatTextView = this.priceView1;
        MeasureExtKt.measureExactly(appCompatTextView, (this.pricePadding * 2) + appCompatTextView.getMeasuredWidth(), this.priceHeight);
        AppCompatTextView appCompatTextView2 = this.priceView2;
        MeasureExtKt.measureExactly(appCompatTextView2, (this.pricePadding * 2) + appCompatTextView2.getMeasuredWidth(), this.priceHeight);
        AppCompatTextView appCompatTextView3 = this.priceView3;
        MeasureExtKt.measureExactly(appCompatTextView3, (this.pricePadding * 2) + appCompatTextView3.getMeasuredWidth(), this.priceHeight);
        setMeasuredDimension(View.resolveSize(measuredWidth2, widthMeasureSpec), View.resolveSize(measuredHeight, heightMeasureSpec));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerCarouselItemView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setBackgroundResource(ru.ozon.app.android.uikit.R$drawable.bg_white_ripple_blue_round);
        appCompatImageView.setClickable(true);
        appCompatImageView.setFocusable(true);
        ViewExtKt.setPaddingsDp(appCompatImageView, 6.0f);
        this.favoriteButton = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.logo = appCompatImageView2;
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setBackgroundResource(R$drawable.bg_seller_card_premium);
        appCompatImageView3.setImageResource(ru.ozon.uni.core.R$drawable.ic_m_status_points);
        ThemeExtKt.tint(appCompatImageView3, Integer.valueOf(context.getColor(R$color.oz_white_1)));
        ViewExtKt.setPaddingsDp(appCompatImageView3, 5.0f);
        this.premium = appCompatImageView3;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextAppearance(context, R$style.TextStyle_Body_L_Bold);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setMaxLines(1);
        this.title = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setTextAppearance(context, R$style.TextStyle_Body_M_Black);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setMaxLines(1);
        this.subtitle = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setTextAppearance(context, R$style.TextStyle_Body_M_Gray60);
        appCompatTextView3.setEllipsize(truncateAt);
        appCompatTextView3.setMaxLines(1);
        this.count = appCompatTextView3;
        RatingBadgeView ratingBadgeView = new RatingBadgeView(context, null, 0, 6, null);
        this.rating = ratingBadgeView;
        AdultImageView adultImageView = new AdultImageView(context, null, 0, 6, null);
        this.preview1 = adultImageView;
        AdultImageView adultImageView2 = new AdultImageView(context, null, 0, 6, null);
        this.preview2 = adultImageView2;
        AdultImageView adultImageView3 = new AdultImageView(context, null, 0, 6, null);
        this.preview3 = adultImageView3;
        AppCompatTextView createPriceView = createPriceView();
        this.priceView1 = createPriceView;
        AppCompatTextView createPriceView2 = createPriceView();
        this.priceView2 = createPriceView2;
        AppCompatTextView createPriceView3 = createPriceView();
        this.priceView3 = createPriceView3;
        this.margin = ResourceExtKt.toPx(16, context);
        this.favoriteMargin = ResourceExtKt.toPx(10, context);
        this.infoLeftMargin = ResourceExtKt.toPx(16, context);
        this.infoRightMargin = ResourceExtKt.toPx(8, context);
        this.ratingMargin = ResourceExtKt.toPx(8, context);
        this.imagesMargin = ResourceExtKt.toPx(4, context);
        int px = ResourceExtKt.toPx(36, context);
        this.favoriteButtonSize = new Size(px, px);
        int px2 = ResourceExtKt.toPx(64, context);
        this.logoSize = new Size(px2, px2);
        int px3 = ResourceExtKt.toPx(24, context);
        this.premiumSize = new Size(px3, px3);
        this.pricePadding = ResourceExtKt.toPx(8, context);
        this.priceHeight = ResourceExtKt.toPx(20, context);
        setElevation(ResourceExtKt.toPxF(5, context));
        setBackground(androidx.core.content.a.getDrawable(context, R$drawable.bg_seller_item));
        setClipToOutline(true);
        addView(appCompatImageView);
        addView(appCompatImageView2);
        addView(appCompatImageView3);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(appCompatTextView3);
        addView(ratingBadgeView);
        addView(adultImageView);
        addView(adultImageView2);
        addView(adultImageView3);
        addView(createPriceView);
        addView(createPriceView2);
        addView(createPriceView3);
    }
}
