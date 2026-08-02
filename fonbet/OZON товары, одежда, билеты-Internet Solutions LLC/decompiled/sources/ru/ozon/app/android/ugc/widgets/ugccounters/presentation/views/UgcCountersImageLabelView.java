package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersImageConstants;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J$\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bJ\b\u0010\u001c\u001a\u00020\u000bH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersImageLabelView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "preCreationBgImageDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "<init>", "(Landroid/content/Context;Landroid/graphics/drawable/ShapeDrawable;)V", "imageView", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersImageView;", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "blurTransformation", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$Blur;", "bind", "", "imageOutlineColor", "", "label", "Lru/ozon/uni/atoms/data/text/TextDTO;", "isFirstItem", "", "loadLabelImage", "image", "cornerRadius", "", "onImageLoadSuccessful", "Lkotlin/Function0;", "createLabelView", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class UgcCountersImageLabelView extends FrameLayout {

    @NotNull
    private final ImageTransformation.Blur blurTransformation;

    @NotNull
    private final UgcCountersImageView imageView;

    @NotNull
    private final TextAtomV2View textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcCountersImageLabelView(@NotNull Context context, ShapeDrawable shapeDrawable) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        UgcCountersImageView ugcCountersImageView = new UgcCountersImageView(context, shapeDrawable);
        this.imageView = ugcCountersImageView;
        TextAtomV2View createLabelView = createLabelView();
        this.textView = createLabelView;
        this.blurTransformation = new ImageTransformation.Blur(6, 2);
        UgcCountersImageConstants ugcCountersImageConstants = UgcCountersImageConstants.INSTANCE;
        setLayoutParams(new ViewGroup.MarginLayoutParams(ugcCountersImageConstants.getELEMENT_SIZE_WITH_PADDINGS(), ugcCountersImageConstants.getELEMENT_SIZE_WITH_PADDINGS()));
        addView(ugcCountersImageView);
        addView(createLabelView);
    }

    private final TextAtomV2View createLabelView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setGravity(17);
        return textAtomV2View;
    }

    public final void bind(@NotNull String imageOutlineColor, @NotNull TextDTO label, boolean isFirstItem) {
        Intrinsics.checkNotNullParameter(imageOutlineColor, "imageOutlineColor");
        Intrinsics.checkNotNullParameter(label, "label");
        TextHolderKt.bind$default(this.textView, label, null, 2, null);
        this.imageView.bind(imageOutlineColor, false, isFirstItem);
        if (isFirstItem) {
            return;
        }
        int i11 = -UgcCountersImageConstants.INSTANCE.getLEFT_OVERLAP();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i12 = marginLayoutParams.leftMargin;
        int i13 = marginLayoutParams.topMargin;
        int i14 = marginLayoutParams.rightMargin;
        int i15 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(i11);
        if (i12 == marginLayoutParams.leftMargin) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (i13 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i14 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (i15 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                        return;
                    }
                }
            }
        }
        setLayoutParams(marginLayoutParams);
    }

    public final void loadLabelImage(@NotNull String image, int cornerRadius, @NotNull Function0<Unit> onImageLoadSuccessful) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(onImageLoadSuccessful, "onImageLoadSuccessful");
        this.imageView.loadBlockImage(image, C7714v.a0(this.blurTransformation), cornerRadius, onImageLoadSuccessful);
    }
}
