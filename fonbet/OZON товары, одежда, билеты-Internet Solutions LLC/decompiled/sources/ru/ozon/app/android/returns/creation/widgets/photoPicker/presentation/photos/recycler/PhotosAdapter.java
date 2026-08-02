package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import jk0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.databinding.PhotoPickerPhotoItemBinding;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotosAdapter;", "Ljk0/i;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewHolder;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewModel;", "viewModel", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewModel;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewHolder;I)V", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewModel;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotosAdapter extends i<PhotoItem, PhotoItemViewHolder> {

    @NotNull
    private final PhotosViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotosAdapter(@NotNull PhotosViewModel viewModel, @NotNull J lifecycleOwner) {
        super(new i.d<PhotoItem>() { // from class: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotosAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(PhotoItem oldItem, PhotoItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(PhotoItem oldItem, PhotoItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        }, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.viewModel = viewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PhotoItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        PhotoItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PhotoItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        PhotoPickerPhotoItemBinding inflate = PhotoPickerPhotoItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new PhotoItemViewHolder(inflate, this.viewModel);
    }
}
