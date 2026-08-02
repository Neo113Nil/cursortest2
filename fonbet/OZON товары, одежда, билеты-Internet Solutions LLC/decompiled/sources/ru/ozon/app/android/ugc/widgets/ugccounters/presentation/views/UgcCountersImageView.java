package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import j.C7232a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.R$drawable;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersImageConstants;
import ru.ozon.uni.android.uikitsdk.ext.DrawableExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rJ2\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "preCreationBgDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "<init>", "(Landroid/content/Context;Landroid/graphics/drawable/ShapeDrawable;)V", "bind", "", "imageOutlineColor", "", "addLeftMargin", "", "isFirstItem", "loadBlockImage", "image", "addTransformations", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "cornerRadius", "", "onImageLoadSuccessful", "Lkotlin/Function0;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class UgcCountersImageView extends AppCompatImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcCountersImageView(@NotNull Context context, ShapeDrawable shapeDrawable) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(shapeDrawable);
        UgcCountersImageConstants ugcCountersImageConstants = UgcCountersImageConstants.INSTANCE;
        setLayoutParams(new ViewGroup.MarginLayoutParams(ugcCountersImageConstants.getELEMENT_SIZE_WITH_PADDINGS(), ugcCountersImageConstants.getELEMENT_SIZE_WITH_PADDINGS()));
        int elements_separator_visible_width_px = ugcCountersImageConstants.getELEMENTS_SEPARATOR_VISIBLE_WIDTH_PX();
        setPadding(elements_separator_visible_width_px, elements_separator_visible_width_px, elements_separator_visible_width_px, elements_separator_visible_width_px);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r6 != (r9 != null ? r9.bottomMargin : 0)) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(@NotNull String imageOutlineColor, boolean addLeftMargin, boolean isFirstItem) {
        Intrinsics.checkNotNullParameter(imageOutlineColor, "imageOutlineColor");
        if (addLeftMargin) {
            int i11 = -UgcCountersImageConstants.INSTANCE.getLEFT_OVERLAP();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
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
                        }
                    }
                }
                setLayoutParams(marginLayoutParams);
            }
        }
        if (isFirstItem) {
            UgcCountersImageConstants ugcCountersImageConstants = UgcCountersImageConstants.INSTANCE;
            setPadding(0, ugcCountersImageConstants.getELEMENTS_SEPARATOR_VISIBLE_WIDTH_PX(), ugcCountersImageConstants.getADDITIONAL_WIDTH(), ugcCountersImageConstants.getELEMENTS_SEPARATOR_VISIBLE_WIDTH_PX());
        }
        Drawable background = getBackground();
        ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
        if (shapeDrawable != null) {
            Paint paint = shapeDrawable.getPaint();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            paint.setColor(ContextExtKt.parseColor(context, imageOutlineColor));
        }
    }

    public final void loadBlockImage(@NotNull String image, @NotNull List<? extends ImageTransformation> addTransformations, int cornerRadius, @NotNull final Function0<Unit> onImageLoadSuccessful) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(addTransformations, "addTransformations");
        Intrinsics.checkNotNullParameter(onImageLoadSuccessful, "onImageLoadSuccessful");
        final List b02 = C7714v.b0(ImageTransformation.CenterCrop.INSTANCE, new ImageTransformation.RoundedCorners(cornerRadius, null, 2, null));
        UgcCountersImageConstants ugcCountersImageConstants = UgcCountersImageConstants.INSTANCE;
        ImageViewExtKt.load$default(this, image, C7714v.p0(b02, addTransformations), new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.ugc.widgets.ugccounters.presentation.views.UgcCountersImageView$loadBlockImage$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                final UgcCountersImageView ugcCountersImageView = this;
                final List<ImageTransformation> list = b02;
                ugcCountersImageView.postDelayed(new Runnable() { // from class: ru.ozon.app.android.ugc.widgets.ugccounters.presentation.views.UgcCountersImageView$loadBlockImage$1$onLoadFailed$$inlined$postDelayed$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        UgcCountersImageView ugcCountersImageView2 = UgcCountersImageView.this;
                        Drawable a11 = C7232a.a(ugcCountersImageView2.getContext(), R$drawable.ic_video_preview_placeholder);
                        ImageViewExtKt.load$default(ugcCountersImageView2, a11 != null ? DrawableExtKt.toBitmap(a11, UgcCountersImageConstants.INSTANCE.getIMAGE_SIZE_PX()) : null, null, list, null, 10, null);
                    }
                }, 200L);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                onImageLoadSuccessful.invoke();
            }
        }, Integer.valueOf(ru.ozon.app.android.ugc.R$drawable.ugc_counters_image_placeholder), new ImageSize(ugcCountersImageConstants.getIMAGE_SIZE_PX(), ugcCountersImageConstants.getIMAGE_SIZE_PX()), false, null, 96, null);
    }
}
