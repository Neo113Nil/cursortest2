package Je;

import W9.d;
import be.c;
import com.bumptech.glide.gifdecoder.e;
import com.google.crypto.tink.integration.android.b;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import com.zoho.livechat.android.modules.conversations.data.remote.entities.ConversationResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JM\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJM\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJA\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0010J?\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0010ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"LJe/a;", "", "", "screenName", "", "headers", "Lokhttp3/RequestBody;", "requestBody", "Lretrofit2/Response;", "Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQRestResponse;", "Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse;", e.f29601m, "(Ljava/lang/String;Ljava/util/Map;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "conversationId", b.f37029b, "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", d.f13160a, "a", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @POST("visitor/v2/{screen_name}/conversations/{conversation_id}/mail")
    @Nullable
    Object a(@Path("screen_name") @NotNull String str, @Path("conversation_id") @NotNull String str2, @Body @Nullable RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<Unit>>> continuation);

    @POST("visitor/v2/{screen_name}/conversations/{conversation_id}/missed")
    @Nullable
    Object b(@Path("screen_name") @NotNull String str, @Path("conversation_id") @NotNull String str2, @Body @Nullable RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<ConversationResponse>>> continuation);

    @PUT("visitor/v2/{screen_name}/conversations/leavemessage")
    @c
    @Nullable
    Object c(@Path("screen_name") @NotNull String str, @HeaderMap @NotNull Map<String, String> map, @Body @Nullable RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<ConversationResponse>>> continuation);

    @POST("visitor/v2/{screen_name}/conversations/{conversation_id}/join")
    @c
    @Nullable
    Object d(@Path("screen_name") @NotNull String str, @Path("conversation_id") @NotNull String str2, @Body @Nullable RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<Unit>>> continuation);

    @POST("visitor/v2/{screen_name}/conversations")
    @c
    @Nullable
    Object e(@Path("screen_name") @NotNull String str, @HeaderMap @NotNull Map<String, String> map, @Body @Nullable RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<ConversationResponse>>> continuation);

    @POST("visitor/v2/{screen_name}/conversations/{conversation_id}/missed")
    @Nullable
    Object f(@Path("screen_name") @NotNull String str, @Path("conversation_id") @NotNull String str2, @NotNull Continuation<? super Response<SalesIQRestResponse<ConversationResponse>>> continuation);
}
