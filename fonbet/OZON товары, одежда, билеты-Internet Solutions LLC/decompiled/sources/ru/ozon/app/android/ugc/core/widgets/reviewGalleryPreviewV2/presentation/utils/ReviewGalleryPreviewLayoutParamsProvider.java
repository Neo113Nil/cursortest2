package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.utils;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewItemSizeProvider;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/utils/ReviewGalleryPreviewLayoutParamsProvider;", "", "sizeProvider", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewItemSizeProvider;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewItemSizeProvider;)V", "imageLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "getImageLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "getRootLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "parent", "Landroid/view/ViewGroup;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewLayoutParamsProvider {

    @NotNull
    private final PreviewItemSizeProvider sizeProvider;

    public ReviewGalleryPreviewLayoutParamsProvider(@NotNull PreviewItemSizeProvider sizeProvider) {
        Intrinsics.checkNotNullParameter(sizeProvider, "sizeProvider");
        this.sizeProvider = sizeProvider;
    }

    @NotNull
    public final FrameLayout.LayoutParams getImageLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @NotNull
    public final ViewGroup.LayoutParams getRootLayoutParams(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent instanceof LinearLayout ? new LinearLayout.LayoutParams(-2, -2) : new RecyclerView.p(this.sizeProvider.getItemWidth(), this.sizeProvider.getItemHeight());
    }
}
