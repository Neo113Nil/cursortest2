package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel;

import Ae.B0;
import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItemViewState;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewState;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewObject.PhotosVO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.Error;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFile;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepository;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.SignedLink;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.UploadingState;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b%\u0010$J\u001d\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0&2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020+0&8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/ReturnCreationPhotoPickerRepository;", "repository", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/ReturnCreationPhotoPickerRepository;)V", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState$Photos;", "", "id", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;", "getPhotoItemViewState", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState$Photos;J)Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "mediaFile", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "mapToPhoto", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;)Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "photoItem", "mapToUploadedMedia", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;)Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "mapLink", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;)Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "mapState", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;)Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;", "", "photos", "", "emitPhotosOrEmpty", "(Ljava/util/List;)V", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewObject/PhotosVO;", "item", "fetchPhotos", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewObject/PhotosVO;)V", "photo", "deletePhotoClicked", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;)V", "retryLoading", "Landroidx/lifecycle/P;", "observePhotoItemViewState", "(J)Landroidx/lifecycle/P;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/ReturnCreationPhotoPickerRepository;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewState;", "mutablePhotosState", "Landroidx/lifecycle/V;", "photosState", "Landroidx/lifecycle/P;", "getPhotosState", "()Landroidx/lifecycle/P;", "boundedData", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewObject/PhotosVO;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotosViewModel extends w0 {
    private PhotosVO boundedData;

    @NotNull
    private final V<PhotosViewState> mutablePhotosState;

    @NotNull
    private final P<PhotosViewState> photosState;

    @NotNull
    private final ReturnCreationPhotoPickerRepository repository;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel$1", f = "PhotosViewModel.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PhotosViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                M0<Set<MediaFile>> media = PhotosViewModel.this.repository.getMedia();
                final PhotosViewModel photosViewModel = PhotosViewModel.this;
                InterfaceC2397i<? super Set<MediaFile>> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Set<MediaFile>) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(Set<MediaFile> set, d<? super Unit> dVar) {
                        PhotosViewModel photosViewModel2 = PhotosViewModel.this;
                        Set<MediaFile> set2 = set;
                        ArrayList arrayList = new ArrayList(C7714v.z(set2, 10));
                        Iterator<T> it = set2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(photosViewModel2.mapToPhoto((MediaFile) it.next()));
                        }
                        photosViewModel2.emitPhotosOrEmpty(C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel$1$1$emit$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t2, T t11) {
                                return Vc.a.b(Long.valueOf(((PhotoItem) t2).getId()), Long.valueOf(((PhotoItem) t11).getId()));
                            }
                        }, arrayList));
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (media.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel$2", f = "PhotosViewModel.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PhotosViewModel.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                B0<Error> error = PhotosViewModel.this.repository.getError();
                final PhotosViewModel photosViewModel = PhotosViewModel.this;
                InterfaceC2397i<? super Error> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel.2.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Error) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(Error error2, d<? super Unit> dVar) {
                        if (error2 instanceof Error.Disclaimer) {
                            PhotosViewModel.this.mutablePhotosState.setValue(PhotosViewState.Disclaimer.INSTANCE);
                        }
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (error.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public PhotosViewModel(@NotNull ReturnCreationPhotoPickerRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        V<PhotosViewState> v11 = new V<>();
        this.mutablePhotosState = v11;
        this.photosState = v11;
        C10727i.c(x0.a(this), null, null, new AnonymousClass1(null), 3);
        C10727i.c(x0.a(this), null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitPhotosOrEmpty(List<PhotoItem> photos) {
        if (photos.isEmpty()) {
            this.mutablePhotosState.postValue(PhotosViewState.EmptyState.INSTANCE);
        } else {
            this.mutablePhotosState.postValue(new PhotosViewState.Photos(photos));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhotoItemViewState getPhotoItemViewState(PhotosViewState.Photos photos, long j11) {
        Object obj;
        PhotoItemViewState state;
        Iterator<T> it = photos.getPhotos().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PhotoItem) obj).getId() == j11) {
                break;
            }
        }
        PhotoItem photoItem = (PhotoItem) obj;
        return (photoItem == null || (state = photoItem.getState()) == null) ? PhotoItemViewState.Error.INSTANCE : state;
    }

    private final SignedLink mapLink(MediaFile mediaFile) {
        SignedLink signedLink = mediaFile.getSignedLink();
        if (signedLink == null) {
            AttachmentVO.AttachedImageVO attachment = mediaFile.getAttachment();
            signedLink = new SignedLink(null, String.valueOf(attachment != null ? attachment.getMediaUri() : null));
        }
        return signedLink;
    }

    private final PhotoItemViewState mapState(MediaFile mediaFile) {
        UploadingState uploadingState = mediaFile.getUploadingState();
        if (!(uploadingState instanceof UploadingState.Pending) && !(uploadingState instanceof UploadingState.Loading)) {
            if (uploadingState instanceof UploadingState.Uploaded) {
                return PhotoItemViewState.Success.INSTANCE;
            }
            if (uploadingState instanceof UploadingState.Error) {
                return PhotoItemViewState.Error.INSTANCE;
            }
            throw new o();
        }
        return PhotoItemViewState.Loading.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhotoItem mapToPhoto(MediaFile mediaFile) {
        return new PhotoItem(mediaFile.getId(), mapLink(mediaFile), PhotoItem.INSTANCE.createDeleteIconButton(), mapState(mediaFile));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaFile mapToUploadedMedia(PhotoItem photoItem) {
        return new MediaFile(photoItem.getId(), null, photoItem.getLink(), UploadingState.Uploaded.INSTANCE, 2, null);
    }

    public final void deletePhotoClicked(PhotoItem photo) {
        if (photo != null) {
            C10727i.c(x0.a(this), null, null, new PhotosViewModel$deletePhotoClicked$1(this, photo.getId(), null), 3);
        }
    }

    public final void fetchPhotos(@NotNull PhotosVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundedData = item;
        C10727i.c(x0.a(this), null, null, new PhotosViewModel$fetchPhotos$1(this, item, null), 3);
    }

    @NotNull
    public final P<PhotosViewState> getPhotosState() {
        return this.photosState;
    }

    @NotNull
    public final P<PhotoItemViewState> observePhotoItemViewState(long id2) {
        return t0.b(this.photosState, new PhotosViewModel$observePhotoItemViewState$1(this, id2));
    }

    public final void retryLoading(PhotoItem photo) {
        if (photo != null) {
            C10727i.c(x0.a(this), null, null, new PhotosViewModel$retryLoading$1(this, photo.getId(), null), 3);
        }
    }
}
