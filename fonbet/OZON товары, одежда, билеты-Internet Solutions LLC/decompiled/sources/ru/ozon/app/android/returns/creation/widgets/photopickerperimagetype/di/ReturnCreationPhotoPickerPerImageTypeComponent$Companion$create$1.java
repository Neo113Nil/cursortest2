package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import java.util.concurrent.ConcurrentHashMap;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponent;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.ImageUploadingLoggerImpl;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploadApi;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploaderImpl;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.PickerViewModel;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepository;
import ru.ozon.app.android.returns.ui.di.RmsComponentApi;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000m\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0018\u00100\u001a\u00060,j\u0002`-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"ru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/di/ReturnCreationPhotoPickerPerImageTypeComponent$Companion$create$1", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/di/ReturnCreationPhotoPickerPerImageTypeComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "Lru/ozon/app/android/returns/ui/di/RmsComponentApi;", "rmsComponentApi", "Lru/ozon/app/android/returns/ui/di/RmsComponentApi;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploadApi;", "mediaFilesUploadApi$delegate", "LSc/j;", "getMediaFilesUploadApi", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploadApi;", "mediaFilesUploadApi", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploaderImpl;", "mediaFilesUploader", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploaderImpl;", "getMediaFilesUploader", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploaderImpl;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/repository/ReturnCreationPhotoPickerRepository;", "repositories", "Ljava/util/concurrent/ConcurrentHashMap;", "getRepositories", "()Ljava/util/concurrent/ConcurrentHashMap;", "LBi/k;", "getGalleryLauncher", "()LBi/k;", "galleryLauncher", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel;", "getViewModel", "()Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel;", "viewModel", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationPhotoPickerPerImageTypeComponent$Companion$create$1 implements ReturnCreationPhotoPickerPerImageTypeComponent {
    final /* synthetic */ C7475g $storage;
    private final AndroidPlatformComponentApi androidPlatformComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: mediaFilesUploadApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mediaFilesUploadApi;
    private final MediaFilesUploaderImpl mediaFilesUploader;
    private final NetworkComponentApi networkComponentApi;
    private final ConcurrentHashMap<Integer, ReturnCreationPhotoPickerRepository> repositories;
    private final RmsComponentApi rmsComponentApi;

    ReturnCreationPhotoPickerPerImageTypeComponent$Companion$create$1(C7475g c7475g) {
        this.$storage = c7475g;
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.networkComponentApi = networkComponentApi;
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        AndroidPlatformComponentApi androidPlatformComponentApi = (AndroidPlatformComponentApi) c7475g.getComponent(AndroidPlatformComponentApi.class);
        this.androidPlatformComponentApi = androidPlatformComponentApi;
        this.rmsComponentApi = (RmsComponentApi) c7475g.getComponent(RmsComponentApi.class);
        this.mediaFilesUploadApi = k.b(new ReturnCreationPhotoPickerPerImageTypeComponent$Companion$create$1$mediaFilesUploadApi$2(this));
        this.mediaFilesUploader = new MediaFilesUploaderImpl(getMediaFilesUploadApi(), networkComponentApi.getInternetConnectionUtils(), androidPlatformComponentApi.getImageResizer(), new ImageUploadingLoggerImpl(networkComponentApi.getNetworkInfoProvider()));
        this.repositories = new ConcurrentHashMap<>();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.di.ReturnCreationPhotoPickerPerImageTypeComponent
    public AppType getAppType() {
        return this.androidPlatformComponentApi.getAppType();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.di.ReturnCreationPhotoPickerPerImageTypeComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.di.ReturnCreationPhotoPickerPerImageTypeComponent
    public Bi.k getGalleryLauncher() {
        return ((GalleryLauncherComponent) this.$storage.getComponent(GalleryLauncherComponent.class)).getGalleryLauncher();
    }

    public MediaFilesUploadApi getMediaFilesUploadApi() {
        Object value = this.mediaFilesUploadApi.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MediaFilesUploadApi) value;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.di.ReturnCreationPhotoPickerPerImageTypeComponent
    public PickerViewModel getViewModel() {
        return new PickerViewModel(getRepositories(), new PickedAttachmentsMapper.ReturnAttachmentsMapper(), this.rmsComponentApi.getReturnCreationEventManager());
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.di.ReturnCreationPhotoPickerPerImageTypeComponent
    public MediaFilesUploaderImpl getMediaFilesUploader() {
        return this.mediaFilesUploader;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.di.ReturnCreationPhotoPickerPerImageTypeComponent
    public ConcurrentHashMap<Integer, ReturnCreationPhotoPickerRepository> getRepositories() {
        return this.repositories;
    }
}
