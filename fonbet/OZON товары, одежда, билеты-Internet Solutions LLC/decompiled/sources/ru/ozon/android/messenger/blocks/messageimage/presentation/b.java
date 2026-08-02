package ru.ozon.android.messenger.blocks.messageimage.presentation;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.github.chrisbanes.photoview.PhotoView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.databinding.MFragmentGalleryImageBinding;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<MFragmentGalleryImageBinding, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PhotoView f85764b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a f85765c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(PhotoView photoView, a aVar) {
        super(1);
        this.f85764b = photoView;
        this.f85765c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MFragmentGalleryImageBinding mFragmentGalleryImageBinding) {
        MFragmentGalleryImageBinding withSafeBinding = mFragmentGalleryImageBinding;
        Intrinsics.checkNotNullParameter(withSafeBinding, "$this$withSafeBinding");
        Drawable drawable = this.f85764b.getDrawable();
        if (drawable != null) {
            PhotoView galleryMainPV = withSafeBinding.galleryMainPV;
            Intrinsics.checkNotNullExpressionValue(galleryMainPV, "galleryMainPV");
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f85765c.getClass();
            if (intrinsicWidth > galleryMainPV.getWidth() || intrinsicHeight > galleryMainPV.getHeight() - galleryMainPV.getPaddingTop()) {
                galleryMainPV.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            }
        }
        ProgressBar galleryImageLoaderPB = withSafeBinding.galleryImageLoaderPB;
        Intrinsics.checkNotNullExpressionValue(galleryImageLoaderPB, "galleryImageLoaderPB");
        s.a(galleryImageLoaderPB);
        return Unit.f71690a;
    }
}
