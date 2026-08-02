package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import We.D;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploadApi;", "", "", "actionName", "LWe/D$c;", "body", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadMediaResponse;", "uploadMediaFile", "(Ljava/lang/String;LWe/D$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface MediaFilesUploadApi {
    @POST("/composer-api.bx/_action/{actionName}")
    @Multipart
    Object uploadMediaFile(@Path("actionName") @NotNull String str, @NotNull @Part D.c cVar, @NotNull d<? super UploadMediaResponse> dVar);
}
