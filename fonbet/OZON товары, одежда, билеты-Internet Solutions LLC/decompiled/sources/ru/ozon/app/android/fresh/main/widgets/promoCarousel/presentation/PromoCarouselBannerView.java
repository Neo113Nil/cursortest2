package ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.R$drawable;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014J0\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014J\u0016\u0010 \u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007J\b\u0010!\u001a\u00020\u0016H\u0002J\u0018\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0002J\b\u0010%\u001a\u00020\u0016H\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010'\u001a\u00020\u0016H\u0002R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselBannerView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "advBadgeV2", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getAdvBadgeV2", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "height", "width", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "updateLayoutSize", "measureImageView", "measureAdvBadge", "fullContentWidth", "fullContentHeight", "layoutImageView", "layoutAdvBadge", "setContainerStyle", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoCarouselBannerView extends ViewGroup {
    private static final float badgeElevation = UiExtKt.toPxF(2);
    private static final int margin = UiExtKt.toPx(8);

    @NotNull
    private final BadgeView advBadgeV2;
    private int height;

    @NotNull
    private final ImageView imageView;
    private int width;

    public /* synthetic */ PromoCarouselBannerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void layoutAdvBadge() {
        if (this.advBadgeV2.getVisibility() == 8) {
            return;
        }
        BadgeView badgeView = this.advBadgeV2;
        int measuredWidth = getMeasuredWidth();
        int i11 = margin;
        LayoutExtKt.layoutRightBottom(badgeView, measuredWidth - i11, getMeasuredHeight() - i11);
    }

    private final void layoutImageView() {
        if (this.imageView.getVisibility() == 8) {
            return;
        }
        LayoutExtKt.layoutLeftTop(this.imageView, 0, 0);
    }

    private final void measureAdvBadge(int fullContentWidth, int fullContentHeight) {
        if (this.advBadgeV2.getVisibility() == 8) {
            return;
        }
        BadgeView badgeView = this.advBadgeV2;
        int i11 = margin;
        MeasureExtKt.measureAtMost(badgeView, fullContentWidth - (i11 * 2), fullContentHeight - (i11 * 2));
    }

    private final void measureImageView() {
        if (this.imageView.getVisibility() == 8) {
            return;
        }
        MeasureExtKt.measureExactly(this.imageView, this.width, this.height);
    }

    private final void setContainerStyle() {
        setBackgroundResource(R$drawable.bg_rounded_both_16);
    }

    @NotNull
    public final BadgeView getAdvBadgeV2() {
        return this.advBadgeV2;
    }

    @NotNull
    public final ImageView getImageView() {
        return this.imageView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        layoutImageView();
        layoutAdvBadge();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        measureImageView();
        measureAdvBadge(size, size2);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.width, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(this.height, LinearLayoutManager.INVALID_OFFSET));
    }

    public final void updateLayoutSize(int width, int height) {
        if (this.width == width && this.height == height) {
            return;
        }
        this.width = width;
        this.height = height;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCarouselBannerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.promoCarouselBannerImage);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(imageView);
        this.imageView = imageView;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(R$id.advBadgeV2);
        badgeView.setElevation(badgeElevation);
        badgeView.setVisibility(8);
        addView(badgeView);
        this.advBadgeV2 = badgeView;
        this.height = UiExtKt.toPx(96);
        this.width = UiExtKt.toPx(240);
        setContainerStyle();
    }
}
