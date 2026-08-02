package ru.ozon.uni.android.uikit.view.atoms.price;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bH\u0014J0\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0014J \u00103\u001a\u00020*2\u0006\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\b2\b\b\u0001\u00106\u001a\u00020\bJ\u000e\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020\u0016J,\u00109\u001a\u00020*2\b\b\u0001\u0010:\u001a\u00020\b2\b\b\u0001\u0010;\u001a\u00020<2\b\b\u0001\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u0016J\u0010\u0010?\u001a\u00020*2\b\u0010@\u001a\u0004\u0018\u00010AJ\u000e\u0010B\u001a\u00020*2\u0006\u00108\u001a\u00020\u0016J$\u0010C\u001a\u00020*2\b\b\u0001\u0010:\u001a\u00020\b2\b\b\u0001\u0010;\u001a\u00020<2\b\b\u0001\u0010=\u001a\u00020\bJ\u0010\u0010D\u001a\u00020*2\b\u0010@\u001a\u0004\u0018\u00010AJ\u000e\u0010E\u001a\u00020*2\u0006\u00108\u001a\u00020\u0016J\u0010\u0010F\u001a\u00020*2\b\b\u0001\u0010G\u001a\u00020\bJ\"\u0010H\u001a\u00020*2\u0006\u00104\u001a\u00020\u00182\b\b\u0001\u00105\u001a\u00020\b2\b\b\u0001\u00106\u001a\u00020\bJ\u000e\u0010I\u001a\u00020*2\u0006\u00108\u001a\u00020\u0016J0\u0010J\u001a\u00020*2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bH\u0002J0\u0010P\u001a\u00020*2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0002J\u0010\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002J\u0010\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002J \u0010T\u001a\u00020*2\u0006\u0010U\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0002J\b\u0010V\u001a\u00020*H\u0002J\u0018\u0010W\u001a\u00020*2\u0006\u0010X\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\bH\u0002J\b\u0010Z\u001a\u00020*H\u0002J\b\u0010[\u001a\u00020*H\u0002J\u0018\u0010\\\u001a\u00020\b2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\bH\u0002J0\u0010`\u001a\u00020*2\u0006\u0010]\u001a\u00020^2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0002J\b\u0010a\u001a\u00020\bH\u0002J\b\u0010_\u001a\u00020\bH\u0002J\b\u0010b\u001a\u00020\bH\u0002J\b\u0010c\u001a\u00020\u0016H\u0002J\b\u0010d\u001a\u00020\u0016H\u0002J\b\u0010e\u001a\u00020\u0016H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8\u0002@BX\u0083\u000e¢\u0006\b\n\u0000\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8\u0002@BX\u0083\u000e¢\u0006\b\n\u0000\"\u0004\b \u0010\u001eR \u0010!\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8\u0002@BX\u0083\u000e¢\u0006\b\n\u0000\"\u0004\b\"\u0010\u001eR \u0010#\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8\u0002@BX\u0083\u000e¢\u0006\b\n\u0000\"\u0004\b$\u0010\u001eR\u001e\u0010%\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b&\u0010\u001bR \u0010'\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8\u0002@BX\u0083\u000e¢\u0006\b\n\u0000\"\u0004\b(\u0010\u001e¨\u0006f"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/price/PriceWithPointsView;", "Landroid/view/ViewGroup;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "price", "Landroidx/appcompat/widget/AppCompatTextView;", "firstIconBackground", "Landroid/graphics/drawable/GradientDrawable;", "firstIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "secondIconBackgroundBorder", "secondIconBackground", "secondIcon", "pointsText", "isSingleLine", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "priceValue", "setPriceValue", "(Ljava/lang/String;)V", "priceStyleId", "setPriceStyleId", "(I)V", "firstIconSize", "setFirstIconSize", "secondIconSize", "setSecondIconSize", "iconsEndMargin", "setIconsEndMargin", "pointsTextValue", "setPointsTextValue", "pointsStyleId", "setPointsStyleId", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "l", "t", "r", "b", "setPrice", "text", "style", "color", "setPriceVisibility", "show", "setFirstIconsParams", "size", "radius", "", "backgroundColor", "hasSecondIcon", "setFirstIcon", "draw", "Landroid/graphics/drawable/Drawable;", "setFirstIconVisibility", "setSecondIconsParams", "setSecondIcon", "setSecondIconVisibility", "setIconsBlockMargin", "margin", "setPointsText", "setPointsTextVisibility", "measureHorizontal", "paddingHorizontal", "paddingVertical", "maxWidth", "childHeightSpec", "totalWidthWithoutPointsText", "measureVertical", "getChildSpecMode", "spec", "getMaxWidthSize", "measurePrice", "widthSpecMode", "measureIcons", "measurePointsText", "widthSpec", "heightSpec", "layoutVertical", "layoutHorizontal", "extractMiddleLine", "view", "Landroid/view/View;", "maxChildHeight", "layoutChild", "iconsWidthWithMargin", "pointsMaxHeight", "anyIconVisible", "bothIconVisible", "anyPointsItemVisible", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceWithPointsView extends ViewGroup implements AtomView {

    @NotNull
    private final AppCompatImageView firstIcon;

    @NotNull
    private final GradientDrawable firstIconBackground;
    private int firstIconSize;
    private int iconsEndMargin;
    private boolean isSingleLine;
    private int pointsStyleId;

    @NotNull
    private final AppCompatTextView pointsText;

    @NotNull
    private String pointsTextValue;

    @NotNull
    private final AppCompatTextView price;
    private int priceStyleId;

    @NotNull
    private String priceValue;

    @NotNull
    private final AppCompatImageView secondIcon;

    @NotNull
    private final GradientDrawable secondIconBackground;

    @NotNull
    private final GradientDrawable secondIconBackgroundBorder;
    private int secondIconSize;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceWithPointsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean anyIconVisible() {
        boolean isVisible;
        boolean isVisible2;
        isVisible = PriceWithPointsViewKt.isVisible(this.firstIcon);
        if (isVisible) {
            return true;
        }
        isVisible2 = PriceWithPointsViewKt.isVisible(this.secondIcon);
        return isVisible2;
    }

    private final boolean anyPointsItemVisible() {
        boolean isVisible;
        boolean isVisible2;
        boolean isVisible3;
        isVisible = PriceWithPointsViewKt.isVisible(this.firstIcon);
        if (isVisible) {
            return true;
        }
        isVisible2 = PriceWithPointsViewKt.isVisible(this.secondIcon);
        if (isVisible2) {
            return true;
        }
        isVisible3 = PriceWithPointsViewKt.isVisible(this.pointsText);
        return isVisible3;
    }

    private final boolean bothIconVisible() {
        boolean isVisible;
        boolean isVisible2;
        isVisible = PriceWithPointsViewKt.isVisible(this.firstIcon);
        if (!isVisible) {
            return false;
        }
        isVisible2 = PriceWithPointsViewKt.isVisible(this.secondIcon);
        return isVisible2;
    }

    private final int extractMiddleLine(View view, int maxChildHeight) {
        int heightIfVisible;
        heightIfVisible = PriceWithPointsViewKt.heightIfVisible(view);
        return (maxChildHeight - heightIfVisible) / 2;
    }

    private final int getChildSpecMode(int spec) {
        int mode = View.MeasureSpec.getMode(spec);
        if (mode == Integer.MIN_VALUE) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        if (mode == 0 || mode != 1073741824) {
            return 0;
        }
        return LinearLayoutManager.INVALID_OFFSET;
    }

    private final int getMaxWidthSize(int spec) {
        int mode = View.MeasureSpec.getMode(spec);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.getSize(spec);
        }
        if (mode == 0 || mode != 1073741824) {
            return Integer.MAX_VALUE;
        }
        return View.MeasureSpec.getSize(spec);
    }

    private final int iconsWidthWithMargin() {
        int widthIfVisible;
        int widthIfVisible2;
        boolean isVisible;
        boolean isVisible2;
        widthIfVisible = PriceWithPointsViewKt.widthIfVisible(this.firstIcon);
        widthIfVisible2 = PriceWithPointsViewKt.widthIfVisible(this.secondIcon);
        int i11 = widthIfVisible2 + widthIfVisible;
        if (anyIconVisible()) {
            isVisible2 = PriceWithPointsViewKt.isVisible(this.pointsText);
            if (isVisible2) {
                i11 += this.iconsEndMargin;
            }
        }
        isVisible = PriceWithPointsViewKt.isVisible(this.secondIcon);
        return isVisible ? i11 - PriceWithPointsBuilder.INSTANCE.getSecondIconOverlayPositive() : i11;
    }

    private final void layoutChild(View view, int l11, int t2, int r11, int b11) {
        boolean isVisible;
        isVisible = PriceWithPointsViewKt.isVisible(view);
        if (isVisible) {
            view.layout(l11, t2, r11, b11);
        }
    }

    private final void layoutHorizontal() {
        int widthIfVisible;
        int heightIfVisible;
        int widthIfVisible2;
        boolean isVisible;
        int widthIfVisible3;
        int heightIfVisible2;
        int widthIfVisible4;
        boolean isVisible2;
        int widthIfVisible5;
        int heightIfVisible3;
        int widthIfVisible6;
        int heightIfVisible4;
        int paddingLeft = getPaddingLeft();
        int maxChildHeight = maxChildHeight();
        int paddingTop = getPaddingTop() + extractMiddleLine(this.price, maxChildHeight);
        AppCompatTextView appCompatTextView = this.price;
        int paddingLeft2 = getPaddingLeft();
        widthIfVisible = PriceWithPointsViewKt.widthIfVisible(this.price);
        heightIfVisible = PriceWithPointsViewKt.heightIfVisible(this.price);
        layoutChild(appCompatTextView, paddingLeft2, paddingTop, widthIfVisible + paddingLeft, heightIfVisible + paddingTop);
        widthIfVisible2 = PriceWithPointsViewKt.widthIfVisible(this.price);
        int i11 = widthIfVisible2 + paddingLeft;
        isVisible = PriceWithPointsViewKt.isVisible(this.price);
        if (isVisible && anyPointsItemVisible()) {
            i11 += PriceWithPointsBuilder.INSTANCE.getPriceMarginEnd();
        }
        if (bothIconVisible()) {
            i11 += PriceWithPointsBuilder.INSTANCE.getDp1();
        }
        int i12 = i11;
        int paddingTop2 = getPaddingTop() + extractMiddleLine(this.firstIcon, maxChildHeight);
        AppCompatImageView appCompatImageView = this.firstIcon;
        widthIfVisible3 = PriceWithPointsViewKt.widthIfVisible(appCompatImageView);
        heightIfVisible2 = PriceWithPointsViewKt.heightIfVisible(this.firstIcon);
        layoutChild(appCompatImageView, i12, paddingTop2, widthIfVisible3 + i12, heightIfVisible2 + paddingTop2);
        widthIfVisible4 = PriceWithPointsViewKt.widthIfVisible(this.firstIcon);
        int i13 = widthIfVisible4 + i12;
        int paddingTop3 = getPaddingTop() + extractMiddleLine(this.secondIcon, maxChildHeight);
        isVisible2 = PriceWithPointsViewKt.isVisible(this.secondIcon);
        if (isVisible2) {
            i13 -= PriceWithPointsBuilder.INSTANCE.getSecondIconOverlayPositive();
        }
        int i14 = i13;
        AppCompatImageView appCompatImageView2 = this.secondIcon;
        widthIfVisible5 = PriceWithPointsViewKt.widthIfVisible(appCompatImageView2);
        heightIfVisible3 = PriceWithPointsViewKt.heightIfVisible(this.secondIcon);
        layoutChild(appCompatImageView2, i14, paddingTop3, widthIfVisible5 + i14, heightIfVisible3 + paddingTop3);
        int iconsWidthWithMargin = i12 + iconsWidthWithMargin();
        int paddingTop4 = getPaddingTop() + extractMiddleLine(this.pointsText, maxChildHeight);
        AppCompatTextView appCompatTextView2 = this.pointsText;
        widthIfVisible6 = PriceWithPointsViewKt.widthIfVisible(appCompatTextView2);
        heightIfVisible4 = PriceWithPointsViewKt.heightIfVisible(this.pointsText);
        layoutChild(appCompatTextView2, iconsWidthWithMargin, paddingTop4, widthIfVisible6 + iconsWidthWithMargin, heightIfVisible4 + paddingTop4);
    }

    private final void layoutVertical() {
        int widthIfVisible;
        int heightIfVisible;
        int heightIfVisible2;
        int widthIfVisible2;
        int heightIfVisible3;
        int widthIfVisible3;
        boolean isVisible;
        int widthIfVisible4;
        int heightIfVisible4;
        int widthIfVisible5;
        int heightIfVisible5;
        AppCompatTextView appCompatTextView = this.price;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingStart2 = getPaddingStart();
        widthIfVisible = PriceWithPointsViewKt.widthIfVisible(this.price);
        int i11 = widthIfVisible + paddingStart2;
        int paddingTop2 = getPaddingTop();
        heightIfVisible = PriceWithPointsViewKt.heightIfVisible(this.price);
        layoutChild(appCompatTextView, paddingStart, paddingTop, i11, heightIfVisible + paddingTop2);
        heightIfVisible2 = PriceWithPointsViewKt.heightIfVisible(this.price);
        PriceWithPointsBuilder priceWithPointsBuilder = PriceWithPointsBuilder.INSTANCE;
        int paddingTop3 = getPaddingTop() + priceWithPointsBuilder.getPointsBlockMarginTop() + heightIfVisible2;
        int extractMiddleLine = paddingTop3 + extractMiddleLine(this.firstIcon, pointsMaxHeight());
        int paddingStart3 = getPaddingStart();
        if (bothIconVisible()) {
            paddingStart3 += priceWithPointsBuilder.getDp1();
        }
        int i12 = paddingStart3;
        AppCompatImageView appCompatImageView = this.firstIcon;
        widthIfVisible2 = PriceWithPointsViewKt.widthIfVisible(appCompatImageView);
        int i13 = widthIfVisible2 + i12;
        heightIfVisible3 = PriceWithPointsViewKt.heightIfVisible(this.firstIcon);
        layoutChild(appCompatImageView, i12, extractMiddleLine, i13, heightIfVisible3 + extractMiddleLine);
        widthIfVisible3 = PriceWithPointsViewKt.widthIfVisible(this.firstIcon);
        int i14 = widthIfVisible3 + i12;
        int extractMiddleLine2 = paddingTop3 + extractMiddleLine(this.secondIcon, pointsMaxHeight());
        isVisible = PriceWithPointsViewKt.isVisible(this.secondIcon);
        if (isVisible) {
            i14 -= priceWithPointsBuilder.getSecondIconOverlayPositive();
        }
        int i15 = i14;
        AppCompatImageView appCompatImageView2 = this.secondIcon;
        widthIfVisible4 = PriceWithPointsViewKt.widthIfVisible(appCompatImageView2);
        int i16 = widthIfVisible4 + i15;
        heightIfVisible4 = PriceWithPointsViewKt.heightIfVisible(this.secondIcon);
        layoutChild(appCompatImageView2, i15, extractMiddleLine2, i16, heightIfVisible4 + extractMiddleLine2);
        int paddingStart4 = getPaddingStart() + iconsWidthWithMargin();
        if (bothIconVisible()) {
            paddingStart4 += priceWithPointsBuilder.getDp1();
        }
        int extractMiddleLine3 = paddingTop3 + extractMiddleLine(this.pointsText, pointsMaxHeight());
        AppCompatTextView appCompatTextView2 = this.pointsText;
        widthIfVisible5 = PriceWithPointsViewKt.widthIfVisible(appCompatTextView2);
        heightIfVisible5 = PriceWithPointsViewKt.heightIfVisible(this.pointsText);
        appCompatTextView2.layout(paddingStart4, extractMiddleLine3, widthIfVisible5 + paddingStart4, heightIfVisible5 + extractMiddleLine3);
    }

    private final int maxChildHeight() {
        int heightIfVisible;
        heightIfVisible = PriceWithPointsViewKt.heightIfVisible(this.price);
        return Math.max(heightIfVisible, pointsMaxHeight());
    }

    private final void measureHorizontal(int paddingHorizontal, int paddingVertical, int maxWidth, int childHeightSpec, int totalWidthWithoutPointsText) {
        int widthIfVisible;
        boolean isVisible;
        int widthIfVisible2;
        this.isSingleLine = true;
        int iconsWidthWithMargin = maxWidth - iconsWidthWithMargin();
        widthIfVisible = PriceWithPointsViewKt.widthIfVisible(this.price);
        int i11 = (iconsWidthWithMargin - widthIfVisible) - paddingHorizontal;
        isVisible = PriceWithPointsViewKt.isVisible(this.price);
        if (isVisible && anyIconVisible()) {
            i11 -= PriceWithPointsBuilder.INSTANCE.getPriceMarginEnd();
        }
        measurePointsText(View.MeasureSpec.makeMeasureSpec(i11, LinearLayoutManager.INVALID_OFFSET), childHeightSpec);
        widthIfVisible2 = PriceWithPointsViewKt.widthIfVisible(this.pointsText);
        setMeasuredDimension(widthIfVisible2 + totalWidthWithoutPointsText, maxChildHeight() + paddingVertical);
    }

    private final void measureIcons() {
        boolean isVisible;
        boolean isVisible2;
        isVisible = PriceWithPointsViewKt.isVisible(this.firstIcon);
        if (isVisible) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.firstIconSize, 1073741824);
            this.firstIcon.measure(makeMeasureSpec, makeMeasureSpec);
        }
        isVisible2 = PriceWithPointsViewKt.isVisible(this.secondIcon);
        if (isVisible2) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.secondIconSize, 1073741824);
            this.secondIcon.measure(makeMeasureSpec2, makeMeasureSpec2);
        }
    }

    private final void measurePointsText(int widthSpec, int heightSpec) {
        boolean isVisible;
        isVisible = PriceWithPointsViewKt.isVisible(this.pointsText);
        if (isVisible) {
            this.pointsText.measure(widthSpec, heightSpec);
        }
    }

    private final void measurePrice(int widthSpecMode, int heightMeasureSpec, int maxWidth) {
        boolean isVisible;
        isVisible = PriceWithPointsViewKt.isVisible(this.price);
        if (isVisible) {
            this.price.measure(View.MeasureSpec.makeMeasureSpec((maxWidth - getPaddingStart()) - getPaddingEnd(), widthSpecMode), heightMeasureSpec);
        }
    }

    private final void measureVertical(int paddingHorizontal, int paddingVertical, int maxWidth, int childHeightSpec, int widthMeasureSpec) {
        int widthIfVisible;
        int widthIfVisible2;
        int heightIfVisible;
        this.isSingleLine = false;
        measurePointsText(View.MeasureSpec.makeMeasureSpec((maxWidth - iconsWidthWithMargin()) - paddingHorizontal, LinearLayoutManager.INVALID_OFFSET), childHeightSpec);
        int iconsWidthWithMargin = iconsWidthWithMargin();
        widthIfVisible = PriceWithPointsViewKt.widthIfVisible(this.pointsText);
        int i11 = widthIfVisible + iconsWidthWithMargin;
        widthIfVisible2 = PriceWithPointsViewKt.widthIfVisible(this.price);
        int min = Math.min(View.MeasureSpec.getSize(widthMeasureSpec), Math.max(widthIfVisible2, i11) + paddingHorizontal);
        heightIfVisible = PriceWithPointsViewKt.heightIfVisible(this.price);
        setMeasuredDimension(min, PriceWithPointsBuilder.INSTANCE.getPointsBlockMarginTop() + heightIfVisible + pointsMaxHeight() + paddingVertical);
    }

    private final int pointsMaxHeight() {
        int heightIfVisible;
        int heightIfVisible2;
        int heightIfVisible3;
        heightIfVisible = PriceWithPointsViewKt.heightIfVisible(this.pointsText);
        heightIfVisible2 = PriceWithPointsViewKt.heightIfVisible(this.firstIcon);
        heightIfVisible3 = PriceWithPointsViewKt.heightIfVisible(this.secondIcon);
        return Math.max(heightIfVisible, Math.max(heightIfVisible2, heightIfVisible3));
    }

    private final void setFirstIconSize(int i11) {
        if (i11 != this.firstIconSize) {
            this.firstIconSize = i11;
        }
    }

    private final void setIconsEndMargin(int i11) {
        if (i11 != this.iconsEndMargin) {
            this.iconsEndMargin = i11;
        }
    }

    private final void setPointsStyleId(int i11) {
        if (i11 != this.pointsStyleId) {
            this.pointsStyleId = i11;
            this.pointsText.setTextAppearance(i11);
        }
    }

    private final void setPointsTextValue(String str) {
        if (Intrinsics.d(str, this.pointsTextValue)) {
            return;
        }
        this.pointsTextValue = str;
        this.pointsText.setText(str);
    }

    private final void setPriceStyleId(int i11) {
        if (i11 != this.priceStyleId) {
            this.priceStyleId = i11;
            this.price.setTextAppearance(i11);
        }
    }

    private final void setPriceValue(String str) {
        if (Intrinsics.d(str, this.priceValue)) {
            return;
        }
        this.priceValue = str;
        this.price.setText(str);
    }

    private final void setSecondIconSize(int i11) {
        if (i11 != this.secondIconSize) {
            this.secondIconSize = i11;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        if (this.isSingleLine) {
            layoutHorizontal();
        } else {
            layoutVertical();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthIfVisible;
        boolean isVisible;
        int widthIfVisible2;
        boolean isVisible2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int maxWidthSize = getMaxWidthSize(widthMeasureSpec);
        int childSpecMode = getChildSpecMode(widthMeasureSpec);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(heightMeasureSpec), getChildSpecMode(heightMeasureSpec));
        measurePrice(childSpecMode, makeMeasureSpec, maxWidthSize);
        widthIfVisible = PriceWithPointsViewKt.widthIfVisible(this.price);
        int i11 = widthIfVisible + paddingRight;
        isVisible = PriceWithPointsViewKt.isVisible(this.price);
        if (isVisible && anyPointsItemVisible()) {
            i11 += PriceWithPointsBuilder.INSTANCE.getPriceMarginEnd();
        }
        measureIcons();
        int iconsWidthWithMargin = i11 + iconsWidthWithMargin();
        if (bothIconVisible()) {
            iconsWidthWithMargin += PriceWithPointsBuilder.INSTANCE.getDp1();
        }
        measurePointsText(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
        widthIfVisible2 = PriceWithPointsViewKt.widthIfVisible(this.pointsText);
        if (widthIfVisible2 + iconsWidthWithMargin > maxWidthSize) {
            isVisible2 = PriceWithPointsViewKt.isVisible(this.price);
            if (isVisible2 && anyPointsItemVisible()) {
                measureVertical(paddingRight, paddingBottom, maxWidthSize, makeMeasureSpec, widthMeasureSpec);
                return;
            }
        }
        measureHorizontal(paddingRight, paddingBottom, maxWidthSize, makeMeasureSpec, iconsWidthWithMargin);
    }

    public final void setFirstIcon(Drawable draw) {
        this.firstIcon.setImageDrawable(draw);
    }

    public final void setFirstIconVisibility(boolean show) {
        ViewExtKt.showOrGone(this.firstIcon, Boolean.valueOf(show));
    }

    public final void setFirstIconsParams(int size, float radius, int backgroundColor, boolean hasSecondIcon) {
        setFirstIconVisibility(true);
        setFirstIconSize(size);
        this.firstIconBackground.setCornerRadius(radius);
        this.firstIconBackground.setColor(backgroundColor);
        this.firstIcon.setRotation(hasSecondIcon ? -6.0f : 0.0f);
    }

    public final void setIconsBlockMargin(int margin) {
        setIconsEndMargin(margin);
    }

    public final void setPointsText(@NotNull String text, int style, int color) {
        Intrinsics.checkNotNullParameter(text, "text");
        setPointsTextVisibility(true);
        setPointsTextValue(text);
        setPointsStyleId(style);
        this.pointsText.setTextColor(color);
    }

    public final void setPointsTextVisibility(boolean show) {
        ViewExtKt.showOrGone(this.pointsText, Boolean.valueOf(show));
    }

    public final void setPrice(@NotNull String text, int style, int color) {
        Intrinsics.checkNotNullParameter(text, "text");
        setPriceVisibility(true);
        setPriceValue(text);
        setPriceStyleId(style);
        this.price.setTextColor(color);
    }

    public final void setPriceVisibility(boolean show) {
        ViewExtKt.showOrGone(this.price, Boolean.valueOf(show));
    }

    public final void setSecondIcon(Drawable draw) {
        this.secondIcon.setImageDrawable(draw);
    }

    public final void setSecondIconVisibility(boolean show) {
        ViewExtKt.showOrGone(this.secondIcon, Boolean.valueOf(show));
    }

    public final void setSecondIconsParams(int size, float radius, int backgroundColor) {
        setSecondIconVisibility(true);
        setSecondIconSize(PriceWithPointsBuilder.INSTANCE.getSecondIconOverlapCompensation() + size);
        this.secondIconBackground.setCornerRadius(radius);
        this.secondIconBackgroundBorder.setCornerRadius(radius + r0.getSecondIconBorderCompensation());
        this.secondIconBackground.setColor(backgroundColor);
    }

    public /* synthetic */ PriceWithPointsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceWithPointsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        PriceWithPointsBuilder priceWithPointsBuilder = PriceWithPointsBuilder.INSTANCE;
        this.price = priceWithPointsBuilder.addPrice(this);
        GradientDrawable createIconsBg = priceWithPointsBuilder.createIconsBg();
        this.firstIconBackground = createIconsBg;
        this.firstIcon = priceWithPointsBuilder.addFirstIcon(context, this, createIconsBg);
        GradientDrawable createIconsBg2 = priceWithPointsBuilder.createIconsBg();
        this.secondIconBackgroundBorder = createIconsBg2;
        GradientDrawable createIconsBg3 = priceWithPointsBuilder.createIconsBg();
        this.secondIconBackground = createIconsBg3;
        this.secondIcon = priceWithPointsBuilder.addSecondIcon(context, this, createIconsBg3, createIconsBg2);
        this.pointsText = priceWithPointsBuilder.addPointsText(this, context);
        this.isSingleLine = true;
        this.priceValue = "";
        this.pointsTextValue = "";
        setClipChildren(false);
    }
}
