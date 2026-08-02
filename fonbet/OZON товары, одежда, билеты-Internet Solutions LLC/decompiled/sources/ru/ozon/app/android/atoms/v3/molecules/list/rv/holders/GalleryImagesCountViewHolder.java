package ru.ozon.app.android.atoms.v3.molecules.list.rv.holders;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.databinding.GalleryItemImageCountViewHolderBinding;
import ru.ozon.app.android.atoms.v3.molecules.list.models.GalleryItem;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/list/rv/holders/GalleryImagesCountViewHolder;", "Lru/ozon/app/android/atoms/v3/molecules/list/rv/holders/GalleryItemViewHolder;", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem$GalleryImageCountItem;", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getContainerView", "()Landroid/view/View;", "binding", "Lru/ozon/app/android/atoms/databinding/GalleryItemImageCountViewHolderBinding;", "bind", "", "galleryItemModel", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GalleryImagesCountViewHolder extends GalleryItemViewHolder<GalleryItem.GalleryImageCountItem> {

    @NotNull
    private final GalleryItemImageCountViewHolderBinding binding;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryImagesCountViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        GalleryItemImageCountViewHolderBinding bind = GalleryItemImageCountViewHolderBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    public void bind(@NotNull GalleryItem.GalleryImageCountItem galleryItemModel) {
        Intrinsics.checkNotNullParameter(galleryItemModel, "galleryItemModel");
        this.binding.galleryImageCountItem.setText("+" + galleryItemModel.getImageCount());
    }

    @NotNull
    public final View getContainerView() {
        return this.containerView;
    }
}
