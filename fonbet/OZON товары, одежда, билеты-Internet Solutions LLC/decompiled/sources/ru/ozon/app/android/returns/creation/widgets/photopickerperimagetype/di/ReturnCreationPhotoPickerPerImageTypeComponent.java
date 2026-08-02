package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.di;

import Bi.k;
import Vg.d;
import hi.InterfaceC6958a;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploader;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.PickerViewModel;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepository;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/di/ReturnCreationPhotoPickerPerImageTypeComponent;", "Lhi/a;", "LBi/k;", "getGalleryLauncher", "()LBi/k;", "galleryLauncher", "", "", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/repository/ReturnCreationPhotoPickerRepository;", "getRepositories", "()Ljava/util/Map;", "repositories", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel;", "getViewModel", "()Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel;", "viewModel", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploader;", "getMediaFilesUploader", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploader;", "mediaFilesUploader", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReturnCreationPhotoPickerPerImageTypeComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/di/ReturnCreationPhotoPickerPerImageTypeComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/di/ReturnCreationPhotoPickerPerImageTypeComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/di/ReturnCreationPhotoPickerPerImageTypeComponent;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final ReturnCreationPhotoPickerPerImageTypeComponent create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new ReturnCreationPhotoPickerPerImageTypeComponent$Companion$create$1(storage);
        }
    }

    @NotNull
    AppType getAppType();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    k getGalleryLauncher();

    @NotNull
    MediaFilesUploader getMediaFilesUploader();

    @NotNull
    Map<Integer, ReturnCreationPhotoPickerRepository> getRepositories();

    @NotNull
    PickerViewModel getViewModel();
}
