package ru.ozon.app.android.search.views.galleryswipeview;

import FG.a;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.imagesswipeview.AdultServerBlurImageView;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/views/galleryswipeview/ImageViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/product/imagesswipeview/AdultServerBlurImageView;", "imageView", "<init>", "(Lru/ozon/app/android/product/imagesswipeview/AdultServerBlurImageView;)V", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel$GalleryItem$ImageItem;", "item", "", "bind", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel$GalleryItem$ImageItem;)V", "Lru/ozon/app/android/product/imagesswipeview/AdultServerBlurImageView;", "Lkotlin/Function0;", "onItemClicked", "Lkotlin/jvm/functions/Function0;", "getOnItemClicked", "()Lkotlin/jvm/functions/Function0;", "setOnItemClicked", "(Lkotlin/jvm/functions/Function0;)V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImageViewHolder extends j {

    @NotNull
    private final AdultServerBlurImageView imageView;
    private Function0<Unit> onItemClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewHolder(@NotNull AdultServerBlurImageView imageView) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        this.imageView = imageView;
        imageView.setOnClickListener(new a(this, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ImageViewHolder imageViewHolder, View view) {
        Function0<Unit> function0 = imageViewHolder.onItemClicked;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void bind(@NotNull SearchResultsGalleryModel.GalleryItem.ImageItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.imageView.bind(item.getImage());
    }

    public final void setOnItemClicked(Function0<Unit> function0) {
        this.onItemClicked = function0;
    }
}
