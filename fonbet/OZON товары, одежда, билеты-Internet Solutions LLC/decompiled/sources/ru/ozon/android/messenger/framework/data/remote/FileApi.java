package ru.ozon.android.messenger.framework.data.remote;

import We.D;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/FileApi;", "", "", "uploadUrl", "LWe/D$c;", "filePart", "Lretrofit2/Response;", "Lru/ozon/android/messenger/framework/data/remote/UploadFileResponse;", "uploadImage", "(Ljava/lang/String;LWe/D$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "uploadFile", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface FileApi {
    @Headers({"READ_TIMEOUT:90000", "WRITE_TIMEOUT:90000"})
    @POST
    @Multipart
    Object uploadFile(@Url @NotNull String str, @NotNull @Part D.c cVar, @NotNull d<? super Response<UploadFileResponse>> dVar);

    @POST
    @Multipart
    Object uploadImage(@Url @NotNull String str, @NotNull @Part D.c cVar, @NotNull d<? super Response<UploadFileResponse>> dVar);
}
