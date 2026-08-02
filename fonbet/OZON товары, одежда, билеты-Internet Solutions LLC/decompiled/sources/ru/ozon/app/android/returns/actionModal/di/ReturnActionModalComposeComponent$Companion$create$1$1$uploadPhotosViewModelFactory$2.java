package ru.ozon.app.android.returns.actionModal.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.mediaupload.di.MediaUploadComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.uploadPhotos.di.viewModelFactory.UploadPhotosViewModelFactory;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/uploadPhotos/di/viewModelFactory/UploadPhotosViewModelFactory;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnActionModalComposeComponent$Companion$create$1$1$uploadPhotosViewModelFactory$2 extends AbstractC7737t implements Function0<UploadPhotosViewModelFactory> {
    final /* synthetic */ AndroidPlatformComponentApi $androidPlatformComponentApi;
    final /* synthetic */ MediaUploadComponentApi $mediaUploadComponentApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnActionModalComposeComponent$Companion$create$1$1$uploadPhotosViewModelFactory$2(AndroidPlatformComponentApi androidPlatformComponentApi, MediaUploadComponentApi mediaUploadComponentApi) {
        super(0);
        this.$androidPlatformComponentApi = androidPlatformComponentApi;
        this.$mediaUploadComponentApi = mediaUploadComponentApi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final UploadPhotosViewModelFactory invoke() {
        return new UploadPhotosViewModelFactory(new PickedAttachmentsMapper.ReturnAttachmentsMapper(), this.$androidPlatformComponentApi.getImageResizer(), this.$mediaUploadComponentApi.getUploadImageUseCase());
    }
}
