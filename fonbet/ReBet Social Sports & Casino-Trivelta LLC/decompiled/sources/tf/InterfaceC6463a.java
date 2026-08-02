package tf;

import W9.d;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.shape.i;
import com.google.crypto.tink.integration.android.b;
import com.zoho.livechat.android.modules.brand.data.remote.entities.FormResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import com.zoho.livechat.android.modules.messages.data.remote.responses.MessageResponse;
import i3.C4527h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0099\u0001\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0007H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001dJ=\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001fJA\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u00022\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0017H§@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, d2 = {"Ltf/a;", "", "", "screenName", "conversationId", "messageUId", "from", "", "fromTime", "toTime", "", "limit", "beforeLimit", "afterLimit", "syncTime", "Lretrofit2/Response;", "Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQRestResponse;", "", "Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse;", C4527h.f48087o, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/RequestBody;", "body", "", e.f29601m, "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", d.f13160a, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i.f35755A, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "messageId", "f", "avuid", "requestBody", "Lcom/zoho/livechat/android/modules/brand/data/remote/entities/FormResponse$Message;", b.f37029b, "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6463a {
    static /* synthetic */ Object g(InterfaceC6463a interfaceC6463a, String str, String str2, int i10, String str3, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProactiveMessages");
        }
        if ((i11 & 4) != 0) {
            i10 = 50;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            str3 = ViewProps.BOTTOM;
        }
        return interfaceC6463a.a(str, str2, i12, str3, continuation);
    }

    @GET("visitor/v2/{screen_name}/visitors/{zldt}/messages")
    @Nullable
    Object a(@Path("screen_name") @NotNull String str, @Path("zldt") @NotNull String str2, @Query("limit") int i10, @NotNull @Query("from") String str3, @NotNull Continuation<? super Response<SalesIQRestResponse<List<MessageResponse>>>> continuation);

    @POST("/visitor/v2/{screen_name}/conversations/{avuid}/context")
    @Nullable
    Object b(@Path("screen_name") @NotNull String str, @Path("avuid") @NotNull String str2, @Body @Nullable RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<FormResponse.Message>>> continuation);

    @POST("visitor/v2/{screen_name}/conversations/{conversation_id}/messages/{message_uid}/reply")
    @Nullable
    Object c(@Path("screen_name") @NotNull String str, @Path("conversation_id") @NotNull String str2, @Path("message_uid") @NotNull String str3, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<Unit>>> continuation);

    @PUT("visitor/v2/{screen_name}/conversations/{conversation_id}/messages/{message_uid}")
    @Nullable
    Object d(@Path("screen_name") @NotNull String str, @Path("conversation_id") @NotNull String str2, @Path("message_uid") @NotNull String str3, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<Unit>>> continuation);

    @POST("visitor/v2/{screen_name}/conversations/{conversation_id}/messages")
    @Nullable
    Object e(@Path("screen_name") @NotNull String str, @Path("conversation_id") @NotNull String str2, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<Unit>>> continuation);

    @PUT("visitor/v2/{screen_name}/conversations/{conversation_id}/messages/{message_uid}/read")
    @Nullable
    Object f(@Path("screen_name") @NotNull String str, @Path("conversation_id") @NotNull String str2, @Path("message_uid") @NotNull String str3, @NotNull Continuation<? super Response<SalesIQRestResponse<Unit>>> continuation);

    @GET("visitor/v2/{screen_name}/conversations/{conversation_id}/messages")
    @Nullable
    Object h(@Path("screen_name") @NotNull String str, @Path("conversation_id") @NotNull String str2, @Nullable @Query("message_id") String str3, @Nullable @Query("from") String str4, @Nullable @Query("from_time") Long l10, @Nullable @Query("to_time") Long l11, @Nullable @Query("limit") Integer num, @Nullable @Query("before_limit") Integer num2, @Nullable @Query("after_limit") Integer num3, @Nullable @Query("sync_time") Long l12, @NotNull Continuation<? super Response<SalesIQRestResponse<List<MessageResponse>>>> continuation);

    @DELETE("visitor/v2/{screen_name}/conversations/{conversation_id}/messages/{message_uid}")
    @Nullable
    Object i(@Path("screen_name") @NotNull String str, @Path("conversation_id") @NotNull String str2, @Path("message_uid") @NotNull String str3, @NotNull Continuation<? super Response<SalesIQRestResponse<Unit>>> continuation);
}
