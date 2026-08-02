package ru.ozon.app.android.returns.creation.widgets.photoPicker.di;

import Bi.k;
import Pc.a;
import Sc.InterfaceC4008j;
import Vg.d;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.ImageUploadingLogger;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewMapper.ButtonsMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewMapper.PhotosMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.title.viewMapper.TitleMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploadApi;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploader;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepository;
import ru.ozon.app.android.returns.ui.di.RmsComponentApi;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000©\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0010\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0010\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u0010\u001a\u0004\b9\u0010:R \u0010>\u001a\b\u0012\u0004\u0012\u00020=0<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010C\u001a\b\u0012\u0004\u0012\u00020B0<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010AR\u001b\u0010I\u001a\u00020E8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\u0010\u001a\u0004\bG\u0010HR\u001f\u0010O\u001a\u00060Jj\u0002`K8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u0010\u001a\u0004\bM\u0010NR$\u0010Q\u001a\u0004\u0018\u00010P8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010X\u001a\u00020W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"ru/ozon/app/android/returns/creation/widgets/photoPicker/di/ReturnCreationPhotoPickerComponent$Companion$create$1$1", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/di/ReturnCreationPhotoPickerComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "Lru/ozon/app/android/returns/ui/di/RmsComponentApi;", "rmsComponentApi", "Lru/ozon/app/android/returns/ui/di/RmsComponentApi;", "Lru/ozon/app/android/platform/image/ImageResizer;", "imageResizer$delegate", "LSc/j;", "getImageResizer", "()Lru/ozon/app/android/platform/image/ImageResizer;", "imageResizer", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper$ReturnAttachmentsMapper;", "pickedAttachmentsMapper$delegate", "getPickedAttachmentsMapper", "()Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper$ReturnAttachmentsMapper;", "pickedAttachmentsMapper", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploadApi;", "mediaFilesUploadApi$delegate", "getMediaFilesUploadApi", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploadApi;", "mediaFilesUploadApi", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/ImageUploadingLogger;", "logger$delegate", "getLogger", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/ImageUploadingLogger;", "logger", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploader;", "mediaFilesUploader$delegate", "getMediaFilesUploader", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploader;", "mediaFilesUploader", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/ReturnCreationPhotoPickerRepository;", "repository$delegate", "getRepository", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/ReturnCreationPhotoPickerRepository;", "repository", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/title/viewMapper/TitleMapper;", "titleMapper$delegate", "getTitleMapper", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/title/viewMapper/TitleMapper;", "titleMapper", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewMapper/ButtonsMapper;", "photoPickerButtonsMapper$delegate", "getPhotoPickerButtonsMapper", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewMapper/ButtonsMapper;", "photoPickerButtonsMapper", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewMapper/PhotosMapper;", "photosMapper$delegate", "getPhotosMapper", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewMapper/PhotosMapper;", "photosMapper", "LPc/a;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewModel/PhotosViewModel;", "photoViewModel", "LPc/a;", "getPhotoViewModel", "()LPc/a;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel;", "buttonsViewModel", "getButtonsViewModel", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory$delegate", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LBi/k;", "galleryLauncher", "LBi/k;", "getGalleryLauncher", "()LBi/k;", "setGalleryLauncher", "(LBi/k;)V", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationPhotoPickerComponent$Companion$create$1$1 implements ReturnCreationPhotoPickerComponent {
    private final AndroidPlatformComponentApi androidPlatformComponentApi;
    private final AppType appType;
    private final a<ButtonsViewModel> buttonsViewModel;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory;
    private k galleryLauncher;

    /* renamed from: imageResizer$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j imageResizer;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j logger;

    /* renamed from: mediaFilesUploadApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mediaFilesUploadApi;

    /* renamed from: mediaFilesUploader$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mediaFilesUploader;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: photoPickerButtonsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j photoPickerButtonsMapper;
    private final a<PhotosViewModel> photoViewModel;

    /* renamed from: photosMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j photosMapper;

    /* renamed from: pickedAttachmentsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j pickedAttachmentsMapper;

    /* renamed from: postRefreshHandlerFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j postRefreshHandlerFactory;

    /* renamed from: repository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j repository;
    private final RmsComponentApi rmsComponentApi;

    /* renamed from: titleMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j titleMapper;

    ReturnCreationPhotoPickerComponent$Companion$create$1$1(Context context) {
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        this.networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context, CustomActionHandlersComponentApi.class).getDependencyStorage();
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) dependencyStorage2.b(CustomActionHandlersComponentApi.class);
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(context, AndroidPlatformComponentApi.class).getDependencyStorage();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        this.androidPlatformComponentApi = (AndroidPlatformComponentApi) dependencyStorage3.b(AndroidPlatformComponentApi.class);
        if (RmsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component RmsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage4 = C6739a.a(context, RmsComponentApi.class).getDependencyStorage();
        if (RmsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component RmsComponentApi is not DiComponent");
        }
        this.rmsComponentApi = (RmsComponentApi) dependencyStorage4.b(RmsComponentApi.class);
        this.imageResizer = Sc.k.b(new ReturnCreationPhotoPickerComponent$Companion$create$1$1$imageResizer$2(this));
        this.pickedAttachmentsMapper = Sc.k.b(ReturnCreationPhotoPickerComponent$Companion$create$1$1$pickedAttachmentsMapper$2.INSTANCE);
        this.mediaFilesUploadApi = Sc.k.b(new ReturnCreationPhotoPickerComponent$Companion$create$1$1$mediaFilesUploadApi$2(this));
        this.logger = Sc.k.b(new ReturnCreationPhotoPickerComponent$Companion$create$1$1$logger$2(this));
        this.mediaFilesUploader = Sc.k.b(new ReturnCreationPhotoPickerComponent$Companion$create$1$1$mediaFilesUploader$2(this));
        this.repository = Sc.k.b(new ReturnCreationPhotoPickerComponent$Companion$create$1$1$repository$2(this));
        this.titleMapper = Sc.k.b(ReturnCreationPhotoPickerComponent$Companion$create$1$1$titleMapper$2.INSTANCE);
        this.photoPickerButtonsMapper = Sc.k.b(ReturnCreationPhotoPickerComponent$Companion$create$1$1$photoPickerButtonsMapper$2.INSTANCE);
        this.photosMapper = Sc.k.b(ReturnCreationPhotoPickerComponent$Companion$create$1$1$photosMapper$2.INSTANCE);
        this.photoViewModel = new FS.a(this, 1);
        this.buttonsViewModel = new XG.a(this, 0);
        this.postRefreshHandlerFactory = Sc.k.b(new ReturnCreationPhotoPickerComponent$Companion$create$1$1$postRefreshHandlerFactory$2(this));
        this.customActionHandlersStoreFactory = Sc.k.b(new ReturnCreationPhotoPickerComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(this));
        if (AndroidPlatformComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage5 = C6739a.a(context, AndroidPlatformComponentDependencies.class).getDependencyStorage();
        if (AndroidPlatformComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentDependencies is not DiComponent");
        }
        this.appType = ((AndroidPlatformComponentDependencies) dependencyStorage5.b(AndroidPlatformComponentDependencies.class)).getAppType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonsViewModel buttonsViewModel$lambda$1(ReturnCreationPhotoPickerComponent$Companion$create$1$1 returnCreationPhotoPickerComponent$Companion$create$1$1) {
        return new ButtonsViewModel(returnCreationPhotoPickerComponent$Companion$create$1$1.getRepository(), returnCreationPhotoPickerComponent$Companion$create$1$1.getPickedAttachmentsMapper(), returnCreationPhotoPickerComponent$Companion$create$1$1.rmsComponentApi.getReturnCreationEventManager(), StringProvider.getString(R$string.common_universal_network_error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PhotosViewModel photoViewModel$lambda$0(ReturnCreationPhotoPickerComponent$Companion$create$1$1 returnCreationPhotoPickerComponent$Companion$create$1$1) {
        return new PhotosViewModel(returnCreationPhotoPickerComponent$Companion$create$1$1.getRepository());
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent
    public AppType getAppType() {
        return this.appType;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent
    public a<ButtonsViewModel> getButtonsViewModel() {
        return this.buttonsViewModel;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent
    public k getGalleryLauncher() {
        return this.galleryLauncher;
    }

    public ImageResizer getImageResizer() {
        return (ImageResizer) this.imageResizer.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent
    public ImageUploadingLogger getLogger() {
        return (ImageUploadingLogger) this.logger.getValue();
    }

    public MediaFilesUploadApi getMediaFilesUploadApi() {
        Object value = this.mediaFilesUploadApi.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MediaFilesUploadApi) value;
    }

    public MediaFilesUploader getMediaFilesUploader() {
        return (MediaFilesUploader) this.mediaFilesUploader.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent
    public ButtonsMapper getPhotoPickerButtonsMapper() {
        return (ButtonsMapper) this.photoPickerButtonsMapper.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent
    public a<PhotosViewModel> getPhotoViewModel() {
        return this.photoViewModel;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent
    public PhotosMapper getPhotosMapper() {
        return (PhotosMapper) this.photosMapper.getValue();
    }

    public PickedAttachmentsMapper.ReturnAttachmentsMapper getPickedAttachmentsMapper() {
        return (PickedAttachmentsMapper.ReturnAttachmentsMapper) this.pickedAttachmentsMapper.getValue();
    }

    public ReturnCreationPhotoPickerRepository getRepository() {
        return (ReturnCreationPhotoPickerRepository) this.repository.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent
    public TitleMapper getTitleMapper() {
        return (TitleMapper) this.titleMapper.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent
    public void setGalleryLauncher(k kVar) {
        this.galleryLauncher = kVar;
    }
}
