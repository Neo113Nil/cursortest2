package ru.ozon.app.android.atoms.v3.molecules.list.rv.holders;

import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.databinding.GalleryItemImageViewHolderBinding;
import ru.ozon.app.android.atoms.v3.molecules.list.models.GalleryItem;
import ru.ozon.uni.atoms.common.ImageLoader;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/list/rv/holders/GalleryImageItemViewHolder;", "Lru/ozon/app/android/atoms/v3/molecules/list/rv/holders/GalleryItemViewHolder;", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem$GalleryImageItem;", "containerView", "Landroid/view/View;", "imageLoader", "Lru/ozon/uni/atoms/common/ImageLoader;", "<init>", "(Landroid/view/View;Lru/ozon/uni/atoms/common/ImageLoader;)V", "getContainerView", "()Landroid/view/View;", "binding", "Lru/ozon/app/android/atoms/databinding/GalleryItemImageViewHolderBinding;", "bind", "", "galleryItemModel", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GalleryImageItemViewHolder extends GalleryItemViewHolder<GalleryItem.GalleryImageItem> {

    @NotNull
    private final GalleryItemImageViewHolderBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ImageLoader imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryImageItemViewHolder(@NotNull View containerView, @NotNull ImageLoader imageLoader) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.containerView = containerView;
        this.imageLoader = imageLoader;
        GalleryItemImageViewHolderBinding bind = GalleryItemImageViewHolderBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    public void bind(@NotNull GalleryItem.GalleryImageItem galleryItemModel) {
        Intrinsics.checkNotNullParameter(galleryItemModel, "galleryItemModel");
        ImageLoader imageLoader = this.imageLoader;
        ImageView galleryImageItem = this.binding.galleryImageItem;
        Intrinsics.checkNotNullExpressionValue(galleryImageItem, "galleryImageItem");
        imageLoader.loadRoundCorners(galleryImageItem, galleryItemModel.getImageUrl());
        this.binding.galleryImageItem.setClipToOutline(true);
    }

    @NotNull
    public final View getContainerView() {
        return this.containerView;
    }
}
