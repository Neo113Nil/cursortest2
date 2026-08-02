package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/views/SingleReviewGalleryBigItemView;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/views/SingleReviewGalleryItemView;", "context", "Landroid/content/Context;", "playerPreloader", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "iconPlayBitmap", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/video/preload/PlayerPreloader;Landroid/graphics/Bitmap;)V", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class SingleReviewGalleryBigItemView extends SingleReviewGalleryItemView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewGalleryBigItemView(@NotNull Context context, @NotNull PlayerPreloader playerPreloader, @NotNull Bitmap iconPlayBitmap) {
        super(context, playerPreloader, iconPlayBitmap);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(iconPlayBitmap, "iconPlayBitmap");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthMeasureSpec), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
