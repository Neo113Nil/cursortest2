package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItemViewState;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewState;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState;", "photosState", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;", "invoke", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState;)Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class PhotosViewModel$observePhotoItemViewState$1 extends AbstractC7737t implements Function1<PhotosViewState, PhotoItemViewState> {
    final /* synthetic */ long $id;
    final /* synthetic */ PhotosViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhotosViewModel$observePhotoItemViewState$1(PhotosViewModel photosViewModel, long j11) {
        super(1);
        this.this$0 = photosViewModel;
        this.$id = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PhotoItemViewState invoke(PhotosViewState photosState) {
        PhotoItemViewState photoItemViewState;
        Intrinsics.checkNotNullParameter(photosState, "photosState");
        PhotosViewState.Photos photos = photosState instanceof PhotosViewState.Photos ? (PhotosViewState.Photos) photosState : null;
        if (photos == null) {
            return null;
        }
        photoItemViewState = this.this$0.getPhotoItemViewState(photos, this.$id);
        return photoItemViewState;
    }
}
