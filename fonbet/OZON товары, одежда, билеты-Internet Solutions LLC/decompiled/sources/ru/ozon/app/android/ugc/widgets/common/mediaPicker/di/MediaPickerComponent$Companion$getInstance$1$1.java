package ru.ozon.app.android.ugc.widgets.common.mediaPicker.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import android.content.SharedPreferences;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.mediaupload.di.MediaUploadComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.di.UgcReviewFormComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaPickerMapper;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerViewModelImpl;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u0089\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"ru/ozon/app/android/ugc/widgets/common/mediaPicker/di/MediaPickerComponent$Companion$getInstance$1$1", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/di/MediaPickerComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "Lru/ozon/app/android/mediaupload/di/MediaUploadComponentApi;", "mediaUploadComponentApi", "Lru/ozon/app/android/mediaupload/di/MediaUploadComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/di/UgcReviewFormComponentApi;", "ugcReviewFormComponentApi", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/di/UgcReviewFormComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/StorefrontCommonComponentApi;", "storefrontCommonComponentApi", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/StorefrontCommonComponentApi;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/core/MediaPickerMapper;", "mediaPickerMapper$delegate", "LSc/j;", "getMediaPickerMapper", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/core/MediaPickerMapper;", "mediaPickerMapper", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModelImpl;", "getUploadViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModelImpl;", "uploadViewModel", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModelImpl;", "getMediaPickerViewModel", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModelImpl;", "mediaPickerViewModel", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "getReviewFormRepository", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "reviewFormRepository", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "", "isTeenMode", "()Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaPickerComponent$Companion$getInstance$1$1 implements MediaPickerComponent {
    private final AndroidPlatformComponentApi androidPlatformComponentApi;
    private final AppType appType;
    private final ContextComponentDependencies contextComponentDependencies;

    /* renamed from: mediaPickerMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mediaPickerMapper = k.b(new MediaPickerComponent$Companion$getInstance$1$1$mediaPickerMapper$2(this));
    private final MediaUploadComponentApi mediaUploadComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final StorageComponentApi storageComponentApi;
    private final StorefrontCommonComponentApi storefrontCommonComponentApi;
    private final UgcReviewFormComponentApi ugcReviewFormComponentApi;

    MediaPickerComponent$Companion$getInstance$1$1(C7475g c7475g) {
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.androidPlatformComponentApi = (AndroidPlatformComponentApi) c7475g.getComponent(AndroidPlatformComponentApi.class);
        this.mediaUploadComponentApi = (MediaUploadComponentApi) c7475g.getComponent(MediaUploadComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.ugcReviewFormComponentApi = (UgcReviewFormComponentApi) c7475g.getComponent(UgcReviewFormComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.storefrontCommonComponentApi = (StorefrontCommonComponentApi) c7475g.getComponent(StorefrontCommonComponentApi.class);
        this.appType = ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
    }

    @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.di.MediaPickerComponent
    public AppType getAppType() {
        return this.appType;
    }

    @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.di.MediaPickerComponent
    public MediaPickerMapper getMediaPickerMapper() {
        return (MediaPickerMapper) this.mediaPickerMapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.di.MediaPickerComponent
    public MediaPickerViewModelImpl getMediaPickerViewModel() {
        return new MediaPickerViewModelImpl();
    }

    public ReviewFormRepository getReviewFormRepository() {
        return this.ugcReviewFormComponentApi.getReviewFormRepository();
    }

    @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.di.MediaPickerComponent
    public SharedPreferences getSharedPreferences() {
        return this.storageComponentApi.getSharedPreferences();
    }

    @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.di.MediaPickerComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.di.MediaPickerComponent
    public UploadingAttachmentsViewModelImpl getUploadViewModel() {
        return new UploadingAttachmentsViewModelImpl(new PickedAttachmentsMapper.ProductAttachmentsMapper(), this.androidPlatformComponentApi.getImageResizer(), this.mediaUploadComponentApi.getUploadImageUseCase(), this.mediaUploadComponentApi.getUploadVideoRepository(), this.networkComponentApi.getFeatureChecker());
    }

    @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.di.MediaPickerComponent
    public boolean isTeenMode() {
        return this.storefrontCommonComponentApi.getTeensModeService().isTeensModeOn();
    }
}
