package ru.ozon.app.android.storefront.widgets.naviCategories.presentation.single;

import Ef0.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0014J\u0010\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010 R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/single/SingleNaviCategoriesView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp8", "dp12", "viewRadius", "", "textView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "imageView", "Landroid/widget/ImageView;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "bindText", "textAtom", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "bindImage", "imageUrl", "", "getDrawable", "Landroid/graphics/drawable/GradientDrawable;", "radius", "color", "(FLjava/lang/Integer;)Landroid/graphics/drawable/GradientDrawable;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleNaviCategoriesView extends ConstraintLayout {
    private final int dp12;
    private final int dp8;

    @NotNull
    private final ImageView imageView;

    @NotNull
    private final TextAtomView textView;
    private final float viewRadius;

    public /* synthetic */ SingleNaviCategoriesView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
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
        ImageViewExtKt.load$default(this.imageView, imageUrl, null, null, null, null, false, null, 126, null);
    }

    public final void bindText(TextAtom textAtom) {
        TextAtomHolderKt.bindOrInvisible$default(this.textView, textAtom, null, 2, null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleNaviCategoriesView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(12);
        this.dp12 = px2;
        float pxF = ResourceExtKt.toPxF(16);
        this.viewRadius = pxF;
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b11 = c.b(textAtomView, R$id.singleNaviCategoriesTitleView, 0, -2);
        b11.f41656t = 0;
        b11.f41658v = 0;
        b11.f41636i = 0;
        textAtomView.setLayoutParams(b11);
        textAtomView.setGravity(17);
        textAtomView.setLines(2);
        this.textView = textAtomView;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.singleNaviCategoriesImageView);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41638j = R$id.singleNaviCategoriesTitleView;
        bVar.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = px;
        imageView.setLayoutParams(bVar);
        this.imageView = imageView;
        ColorStateList valueOf = ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        setForeground(new RippleDrawable(valueOf, null, getDrawable(pxF, -1)));
        setBackground(getDrawable(pxF, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.bgSecondary))));
        setClipToOutline(true);
        setPadding(px, px, px, px2);
        addView(textAtomView);
        addView(imageView);
    }
}
