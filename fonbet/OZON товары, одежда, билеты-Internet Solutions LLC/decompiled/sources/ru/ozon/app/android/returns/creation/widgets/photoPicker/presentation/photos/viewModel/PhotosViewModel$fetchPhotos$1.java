package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel;

import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewObject.PhotosVO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFile;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel$fetchPhotos$1", f = "PhotosViewModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PhotosViewModel$fetchPhotos$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ PhotosVO $item;
    int label;
    final /* synthetic */ PhotosViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhotosViewModel$fetchPhotos$1(PhotosViewModel photosViewModel, PhotosVO photosVO, d<? super PhotosViewModel$fetchPhotos$1> dVar) {
        super(2, dVar);
        this.this$0 = photosViewModel;
        this.$item = photosVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PhotosViewModel$fetchPhotos$1(this.this$0, this.$item, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MediaFile mapToUploadedMedia;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ReturnCreationPhotoPickerRepository returnCreationPhotoPickerRepository = this.this$0.repository;
            List<PhotoItem> existingImages = this.$item.getExistingImages();
            PhotosViewModel photosViewModel = this.this$0;
            ArrayList arrayList = new ArrayList(C7714v.z(existingImages, 10));
            Iterator<T> it = existingImages.iterator();
            while (it.hasNext()) {
                mapToUploadedMedia = photosViewModel.mapToUploadedMedia((PhotoItem) it.next());
                arrayList.add(mapToUploadedMedia);
            }
            this.label = 1;
            if (returnCreationPhotoPickerRepository.addMediaFiles(arrayList, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PhotosViewModel$fetchPhotos$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
