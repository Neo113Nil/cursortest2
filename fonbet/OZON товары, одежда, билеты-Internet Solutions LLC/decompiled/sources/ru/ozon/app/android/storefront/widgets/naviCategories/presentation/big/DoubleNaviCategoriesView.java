package ru.ozon.app.android.storefront.widgets.naviCategories.presentation.big;

import D40.a;
import Ef0.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0014J\u0010\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010\"\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!J\u001f\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010'R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/big/DoubleNaviCategoriesView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp2", "dp8", "dp12", "viewRadius", "", "imageTransformations", "Ljava/util/ArrayList;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitHeightCropWidth;", "Lkotlin/collections/ArrayList;", "imageView", "Landroid/widget/ImageView;", "titleView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "subtitleView", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "bindImage", "imageUrl", "", "bindTitle", "textAtom", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "bindSubtitle", "getDrawable", "Landroid/graphics/drawable/GradientDrawable;", "radius", "color", "(FLjava/lang/Integer;)Landroid/graphics/drawable/GradientDrawable;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DoubleNaviCategoriesView extends ConstraintLayout {
    private final int dp12;
    private final int dp2;
    private final int dp8;

    @NotNull
    private final ArrayList<ImageTransformation.FitHeightCropWidth> imageTransformations;

    @NotNull
    private final ImageView imageView;

    @NotNull
    private final TextAtomView subtitleView;

    @NotNull
    private final TextAtomView titleView;
    private final float viewRadius;

    public /* synthetic */ DoubleNaviCategoriesView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final GradientDrawable getDrawable(float radius, Integer color) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(radius);
        if (color != null) {
            gradientDrawable.setColor(color.intValue());
        }
        return gradientDrawable;
    }

    public final void bindImage(String imageUrl) {
        ImageViewExtKt.load$default(this.imageView, imageUrl, this.imageTransformations, null, null, null, false, null, 124, null);
    }

    public final void bindSubtitle(TextAtom textAtom) {
        TextAtomHolderKt.bindOrGone$default(this.subtitleView, textAtom, null, 2, null);
    }

    public final void bindTitle(TextAtom textAtom) {
        TextAtomHolderKt.bindOrGone$default(this.titleView, textAtom, null, 2, null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(widthMeasureSpec) - this.dp8) / 2, 1073741824));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleNaviCategoriesView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(2);
        this.dp2 = px;
        this.dp8 = ResourceExtKt.toPx(8);
        int px2 = ResourceExtKt.toPx(12);
        this.dp12 = px2;
        float pxF = ResourceExtKt.toPxF(16);
        this.viewRadius = pxF;
        this.imageTransformations = C7714v.t(new ImageTransformation.FitHeightCropWidth(ImageTransformation.FitHeightCropWidth.CropType.LEFT));
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.doubleNaviCategoriesImageView);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -1);
        bVar.f41598E = 0.0f;
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(bVar);
        this.imageView = imageView;
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b11 = c.b(textAtomView, R$id.doubleNaviCategoriesTitleView, 0, -2);
        b11.f41636i = 0;
        b11.f41655s = R$id.doubleNaviCategoriesGuideline;
        b11.f41640k = R$id.doubleNaviCategoriesSubtitleView;
        b11.f41658v = 0;
        b11.f41604K = 2;
        ((ViewGroup.MarginLayoutParams) b11).topMargin = px2;
        ((ViewGroup.MarginLayoutParams) b11).bottomMargin = 0;
        b11.f41662z = px2;
        ((ViewGroup.MarginLayoutParams) b11).rightMargin = px2;
        textAtomView.setLayoutParams(b11);
        this.titleView = textAtomView;
        TextAtomView textAtomView2 = new TextAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b12 = c.b(textAtomView2, R$id.doubleNaviCategoriesSubtitleView, 0, -2);
        b12.f41638j = R$id.doubleNaviCategoriesTitleView;
        b12.f41655s = R$id.doubleNaviCategoriesGuideline;
        b12.f41642l = 0;
        b12.f41658v = 0;
        b12.f41604K = 2;
        ((ViewGroup.MarginLayoutParams) b12).topMargin = px;
        b12.f41660x = px2;
        ((ViewGroup.MarginLayoutParams) b12).bottomMargin = px2;
        ((ViewGroup.MarginLayoutParams) b12).rightMargin = px2;
        textAtomView2.setLayoutParams(b12);
        this.subtitleView = textAtomView2;
        Guideline guideline = new Guideline(context);
        ConstraintLayout.b a11 = a.a(guideline, R$id.doubleNaviCategoriesGuideline, -2, -2);
        a11.f41615V = 1;
        a11.f41624c = 0.5f;
        guideline.setLayoutParams(a11);
        ColorStateList valueOf = ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        setForeground(new RippleDrawable(valueOf, null, getDrawable(pxF, -1)));
        setBackground(getDrawable(pxF, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.bgSecondary))));
        setClipToOutline(true);
        addView(guideline);
        addView(imageView);
        addView(textAtomView);
        addView(textAtomView2);
    }
}
