package ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const;
import ru.ozon.app.android.pdp.utils.Dimens;
import y7.k;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v4/GalleryV4ShapeableImageView;", "Lcom/google/android/material/imageview/ShapeableImageView;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v4/GalleryV4Const;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV4ShapeableImageView extends ShapeableImageView implements GalleryV4Const {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v4/GalleryV4ShapeableImageView$Companion;", "", "<init>", "()V", "configure", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v4/GalleryV4ShapeableImageView;", "width", "", "height", "backgroundColor", "Landroid/graphics/drawable/Drawable;", "foregroundColor", "isUniqueView", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        
            if (r1 != (r0 != null ? r0.bottomMargin : 0)) goto L47;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final GalleryV4ShapeableImageView configure(@NotNull GalleryV4ShapeableImageView galleryV4ShapeableImageView, int i11, int i12, Drawable drawable, Drawable drawable2, boolean z11) {
            Drawable.ConstantState constantState;
            Drawable.ConstantState constantState2;
            Intrinsics.checkNotNullParameter(galleryV4ShapeableImageView, "<this>");
            if (z11) {
                drawable = (drawable == null || (constantState2 = drawable.getConstantState()) == null) ? null : constantState2.newDrawable();
            }
            galleryV4ShapeableImageView.setBackground(drawable);
            if (z11) {
                drawable2 = (drawable2 == null || (constantState = drawable2.getConstantState()) == null) ? null : constantState.newDrawable();
            }
            galleryV4ShapeableImageView.setForeground(drawable2);
            ViewGroup.LayoutParams layoutParams = galleryV4ShapeableImageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i13 = marginLayoutParams.topMargin;
                int i14 = marginLayoutParams.rightMargin;
                int i15 = marginLayoutParams.bottomMargin;
                marginLayoutParams.width = i11;
                marginLayoutParams.height = i12;
                ViewGroup.LayoutParams layoutParams2 = galleryV4ShapeableImageView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i13 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = galleryV4ShapeableImageView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i14 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = galleryV4ShapeableImageView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
                galleryV4ShapeableImageView.setLayoutParams(marginLayoutParams);
                return galleryV4ShapeableImageView;
            }
            return galleryV4ShapeableImageView;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4ShapeableImageView(@NotNull Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        setId(R$id.galleryV4ImageV);
        int galleryPadding = context.getResources().getDisplayMetrics().widthPixels - getGalleryPadding();
        setLayoutParams(new FrameLayout.LayoutParams(galleryPadding, galleryPadding));
        setShapeAppearanceModel(new k().o(Dimens.INSTANCE.getDPF_20()));
        setClickable(true);
        setClipToOutline(true);
        setMeasuredDimension(getWidth(), getHeight());
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v4.GalleryV4Const
    public int getGalleryPadding() {
        return GalleryV4Const.DefaultImpls.getGalleryPadding(this);
    }
}
