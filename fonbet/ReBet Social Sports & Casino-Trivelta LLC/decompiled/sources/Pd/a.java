package Pd;

import W9.d;
import com.zoho.livechat.android.modules.calls.data.model.CheckStatusResponse;
import com.zoho.livechat.android.modules.calls.data.model.MediaResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ?\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ=\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ7\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"LPd/a;", "", "", "screenName", "Lokhttp3/RequestBody;", "body", "Lretrofit2/Response;", "Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQRestResponse;", "Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse;", d.f13160a, "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mediaId", com.google.crypto.tink.integration.android.b.f37029b, "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Lcom/zoho/livechat/android/modules/calls/data/model/CheckStatusResponse;", "c", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @POST("visitor/v2/{screen_name}/stats/{media_id}/media/activity")
    @Nullable
    Object a(@Path("screen_name") @NotNull String str, @Path("media_id") @NotNull String str2, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<Unit>>> continuation);

    @PUT("visitor/v3/{screen_name}/media/{media_id}")
    @Nullable
    Object b(@Path("screen_name") @NotNull String str, @Path("media_id") @NotNull String str2, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<MediaResponse>>> continuation);

    @GET("visitor/v3/{screen_name}/media/{media_id}/status")
    @Nullable
    Object c(@Path("screen_name") @NotNull String str, @Path("media_id") @Nullable String str2, @NotNull Continuation<? super Response<SalesIQRestResponse<CheckStatusResponse>>> continuation);

    @POST("visitor/v3/{screen_name}/media")
    @Nullable
    Object d(@Path("screen_name") @NotNull String str, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<MediaResponse>>> continuation);
}
