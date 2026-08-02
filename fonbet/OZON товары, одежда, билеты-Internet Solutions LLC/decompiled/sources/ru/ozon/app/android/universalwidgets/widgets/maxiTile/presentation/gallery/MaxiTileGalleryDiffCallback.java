package ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.gallery;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.vi.MaxiTileVI;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/gallery/MaxiTileGalleryDiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem;Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem;)Z", "areContentsTheSame", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaxiTileGalleryDiffCallback extends i.d<MaxiTileVI.Gallery.ImageItem> {

    @NotNull
    public static final MaxiTileGalleryDiffCallback INSTANCE = new MaxiTileGalleryDiffCallback();

    private MaxiTileGalleryDiffCallback() {
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull MaxiTileVI.Gallery.ImageItem oldItem, @NotNull MaxiTileVI.Gallery.ImageItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull MaxiTileVI.Gallery.ImageItem oldItem, @NotNull MaxiTileVI.Gallery.ImageItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem.getLink(), newItem.getLink());
    }
}
