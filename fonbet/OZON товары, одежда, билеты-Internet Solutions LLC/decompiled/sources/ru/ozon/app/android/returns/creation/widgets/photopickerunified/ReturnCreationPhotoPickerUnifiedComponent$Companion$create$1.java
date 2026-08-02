package ru.ozon.app.android.returns.creation.widgets.photopickerunified;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponent;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploadApi;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepositoryImpl;
import ru.ozon.app.android.returns.ui.di.RmsComponentApi;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000]\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR#\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001e\u001a\u00060\u001aj\u0002`\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"ru/ozon/app/android/returns/creation/widgets/photopickerunified/ReturnCreationPhotoPickerUnifiedComponent$Companion$create$1", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/ReturnCreationPhotoPickerUnifiedComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "Lru/ozon/app/android/returns/ui/di/RmsComponentApi;", "rmsComponentApi", "Lru/ozon/app/android/returns/ui/di/RmsComponentApi;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploadApi;", "kotlin.jvm.PlatformType", "mediaFilesUploadApi$delegate", "LSc/j;", "getMediaFilesUploadApi", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploadApi;", "mediaFilesUploadApi", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/repository/ReturnCreationPhotoPickerRepositoryImpl;", "photoPickerRepository$delegate", "getPhotoPickerRepository", "()Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/repository/ReturnCreationPhotoPickerRepositoryImpl;", "photoPickerRepository", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LBi/k;", "getGalleryLauncher", "()LBi/k;", "galleryLauncher", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/PickerViewModel;", "getViewModel", "()Lru/ozon/app/android/returns/creation/widgets/photopickerunified/PickerViewModel;", "viewModel", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationPhotoPickerUnifiedComponent$Companion$create$1 implements ReturnCreationPhotoPickerUnifiedComponent {
    final /* synthetic */ C7475g $storage;
    private final AndroidPlatformComponentApi androidPlatformComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final RmsComponentApi rmsComponentApi;

    /* renamed from: mediaFilesUploadApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mediaFilesUploadApi = k.b(new ReturnCreationPhotoPickerUnifiedComponent$Companion$create$1$mediaFilesUploadApi$2(this));

    /* renamed from: photoPickerRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j photoPickerRepository = k.b(new ReturnCreationPhotoPickerUnifiedComponent$Companion$create$1$photoPickerRepository$2(this));

    ReturnCreationPhotoPickerUnifiedComponent$Companion$create$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.androidPlatformComponentApi = (AndroidPlatformComponentApi) c7475g.getComponent(AndroidPlatformComponentApi.class);
        this.rmsComponentApi = (RmsComponentApi) c7475g.getComponent(RmsComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaFilesUploadApi getMediaFilesUploadApi() {
        return (MediaFilesUploadApi) this.mediaFilesUploadApi.getValue();
    }

    private final ReturnCreationPhotoPickerRepositoryImpl getPhotoPickerRepository() {
        return (ReturnCreationPhotoPickerRepositoryImpl) this.photoPickerRepository.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedComponent
    public AppType getAppType() {
        return this.androidPlatformComponentApi.getAppType();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedComponent
    public Bi.k getGalleryLauncher() {
        return ((GalleryLauncherComponent) this.$storage.getComponent(GalleryLauncherComponent.class)).getGalleryLauncher();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedComponent
    public PickerViewModel getViewModel() {
        return new PickerViewModel(getPhotoPickerRepository(), new PickedAttachmentsMapper.ReturnAttachmentsMapper(), this.rmsComponentApi.getReturnCreationEventManager());
    }
}
