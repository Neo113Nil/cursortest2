package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.di;

import We.E;
import We.InterfaceC4865g;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploadApi;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploadApi;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploadApi;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnCreationPhotoPickerPerImageTypeComponent$Companion$create$1$mediaFilesUploadApi$2 extends AbstractC7737t implements Function0<MediaFilesUploadApi> {
    final /* synthetic */ ReturnCreationPhotoPickerPerImageTypeComponent$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnCreationPhotoPickerPerImageTypeComponent$Companion$create$1$mediaFilesUploadApi$2(ReturnCreationPhotoPickerPerImageTypeComponent$Companion$create$1 returnCreationPhotoPickerPerImageTypeComponent$Companion$create$1) {
        super(0);
        this.this$0 = returnCreationPhotoPickerPerImageTypeComponent$Companion$create$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MediaFilesUploadApi invoke() {
        NetworkComponentApi networkComponentApi;
        networkComponentApi = this.this$0.networkComponentApi;
        Retrofit retrofit = networkComponentApi.getRetrofit();
        InterfaceC4865g.a callFactory = retrofit.callFactory();
        Intrinsics.g(callFactory, "null cannot be cast to non-null type okhttp3.OkHttpClient");
        E.a aVar = new E.a((E) callFactory);
        aVar.X(30000L, TimeUnit.MILLISECONDS);
        return (MediaFilesUploadApi) retrofit.newBuilder().client(new E(aVar)).build().create(MediaFilesUploadApi.class);
    }
}
