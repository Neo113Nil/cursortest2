package ru.ozon.uni.android.uikit.view.atoms.price;

import B3.D;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010!R\u0017\u0010$\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010!R\u0017\u0010&\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010!R\u0017\u0010(\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010!R\u0017\u0010*\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010!¨\u0006,"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/price/PriceWithPointsBuilder;", "", "<init>", "()V", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/drawable/InsetDrawable;", "addInset", "(Landroid/graphics/drawable/GradientDrawable;)Landroid/graphics/drawable/InsetDrawable;", "Landroid/view/ViewGroup;", "parent", "Landroidx/appcompat/widget/AppCompatTextView;", "addPrice", "(Landroid/view/ViewGroup;)Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "firstItemBackground", "Landroidx/appcompat/widget/AppCompatImageView;", "addFirstIcon", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/graphics/drawable/GradientDrawable;)Landroidx/appcompat/widget/AppCompatImageView;", "container", "background", "secondIconBackgroundBorder", "addSecondIcon", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/graphics/drawable/GradientDrawable;Landroid/graphics/drawable/GradientDrawable;)Landroidx/appcompat/widget/AppCompatImageView;", "createIconsBg", "()Landroid/graphics/drawable/GradientDrawable;", "addPointsText", "(Landroid/view/ViewGroup;Landroid/content/Context;)Landroidx/appcompat/widget/AppCompatTextView;", "", "secondIconBorderWidth", "I", "secondIconOverlapCompensation", "getSecondIconOverlapCompensation", "()I", "secondIconBorderCompensation", "getSecondIconBorderCompensation", "priceMarginEnd", "getPriceMarginEnd", "secondIconOverlayPositive", "getSecondIconOverlayPositive", "pointsBlockMarginTop", "getPointsBlockMarginTop", "dp1", "getDp1", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceWithPointsBuilder {

    @NotNull
    public static final PriceWithPointsBuilder INSTANCE = new PriceWithPointsBuilder();
    private static final int secondIconBorderWidth = ResourceExtKt.toPx(2);
    private static final int secondIconOverlapCompensation = ResourceExtKt.toPx(4);
    private static final int secondIconBorderCompensation = ResourceExtKt.toPx(2);
    private static final int priceMarginEnd = ResourceExtKt.toPx(8);
    private static final int secondIconOverlayPositive = ResourceExtKt.toPx(2);
    private static final int pointsBlockMarginTop = ResourceExtKt.toPx(2);
    private static final int dp1 = ResourceExtKt.toPx(1);

    private PriceWithPointsBuilder() {
    }

    private final InsetDrawable addInset(GradientDrawable gradientDrawable) {
        return new InsetDrawable((Drawable) gradientDrawable, secondIconBorderWidth);
    }

    @NotNull
    public final AppCompatImageView addFirstIcon(@NotNull Context context, @NotNull ViewGroup parent, @NotNull GradientDrawable firstItemBackground) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(firstItemBackground, "firstItemBackground");
        AppCompatImageView appCompatImageView = new AppCompatImageView(parent.getContext());
        appCompatImageView.setBackground(firstItemBackground);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        ThemeExtKt.tint(appCompatImageView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.oz_semantic_text_primary_negative)));
        parent.addView(appCompatImageView);
        return appCompatImageView;
    }

    @NotNull
    public final AppCompatTextView addPointsText(@NotNull ViewGroup container, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        container.addView(appCompatTextView);
        return appCompatTextView;
    }

    @NotNull
    public final AppCompatTextView addPrice(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        AppCompatTextView appCompatTextView = new AppCompatTextView(parent.getContext());
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        parent.addView(appCompatTextView);
        return appCompatTextView;
    }

    @NotNull
    public final AppCompatImageView addSecondIcon(@NotNull Context context, @NotNull ViewGroup container, @NotNull GradientDrawable background, @NotNull GradientDrawable secondIconBackgroundBorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(secondIconBackgroundBorder, "secondIconBackgroundBorder");
        secondIconBackgroundBorder.setColor(ThemeExtKt.themeColor(context, R$attr.oz_semantic_bg_secondary));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{secondIconBackgroundBorder, addInset(background)});
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setBackground(layerDrawable);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        ThemeExtKt.tint(appCompatImageView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.oz_semantic_text_primary_negative)));
        appCompatImageView.setRotation(6.0f);
        container.addView(appCompatImageView);
        return appCompatImageView;
    }

    @NotNull
    public final GradientDrawable createIconsBg() {
        return D.b(0);
    }

    public final int getDp1() {
        return dp1;
    }

    public final int getPointsBlockMarginTop() {
        return pointsBlockMarginTop;
    }

    public final int getPriceMarginEnd() {
        return priceMarginEnd;
    }

    public final int getSecondIconBorderCompensation() {
        return secondIconBorderCompensation;
    }

    public final int getSecondIconOverlapCompensation() {
        return secondIconOverlapCompensation;
    }

    public final int getSecondIconOverlayPositive() {
        return secondIconOverlayPositive;
    }
}
