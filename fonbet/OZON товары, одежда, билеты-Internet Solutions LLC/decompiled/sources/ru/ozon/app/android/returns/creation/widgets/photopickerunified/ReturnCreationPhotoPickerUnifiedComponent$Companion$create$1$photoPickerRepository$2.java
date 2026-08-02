package ru.ozon.app.android.returns.creation.widgets.photopickerunified;

import Ae.O0;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.ImageUploadingLoggerImpl;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploadApi;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploaderImpl;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepositoryImpl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/repository/ReturnCreationPhotoPickerRepositoryImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnCreationPhotoPickerUnifiedComponent$Companion$create$1$photoPickerRepository$2 extends AbstractC7737t implements Function0<ReturnCreationPhotoPickerRepositoryImpl> {
    final /* synthetic */ ReturnCreationPhotoPickerUnifiedComponent$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnCreationPhotoPickerUnifiedComponent$Companion$create$1$photoPickerRepository$2(ReturnCreationPhotoPickerUnifiedComponent$Companion$create$1 returnCreationPhotoPickerUnifiedComponent$Companion$create$1) {
        super(0);
        this.this$0 = returnCreationPhotoPickerUnifiedComponent$Companion$create$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ReturnCreationPhotoPickerRepositoryImpl invoke() {
        MediaFilesUploadApi mediaFilesUploadApi;
        NetworkComponentApi networkComponentApi;
        AndroidPlatformComponentApi androidPlatformComponentApi;
        NetworkComponentApi networkComponentApi2;
        mediaFilesUploadApi = this.this$0.getMediaFilesUploadApi();
        Intrinsics.checkNotNullExpressionValue(mediaFilesUploadApi, "access$getMediaFilesUploadApi(...)");
        networkComponentApi = this.this$0.networkComponentApi;
        ConnectionHandler internetConnectionUtils = networkComponentApi.getInternetConnectionUtils();
        androidPlatformComponentApi = this.this$0.androidPlatformComponentApi;
        ImageResizer imageResizer = androidPlatformComponentApi.getImageResizer();
        networkComponentApi2 = this.this$0.networkComponentApi;
        return new ReturnCreationPhotoPickerRepositoryImpl(new MediaFilesUploaderImpl(mediaFilesUploadApi, internetConnectionUtils, imageResizer, new ImageUploadingLoggerImpl(networkComponentApi2.getNetworkInfoProvider())), O0.a(new HashSet()));
    }
}
