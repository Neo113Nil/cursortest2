package Of;

import com.google.crypto.tink.integration.android.b;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import com.zoho.livechat.android.modules.triggers.data.remote.entities.TriggerAcknowledgementResponse;
import com.zoho.livechat.android.modules.triggers.data.remote.entities.TriggerResponse;
import com.zoho.livechat.android.modules.triggers.data.remote.entities.VTSTriggerResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J=\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"LOf/a;", "", "", "screenName", "uvid", "LNf/b;", EventKeys.PAYLOAD, "Lretrofit2/Response;", "Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQRestResponse;", "Lcom/zoho/livechat/android/modules/triggers/data/remote/entities/TriggerResponse;", b.f37029b, "(Ljava/lang/String;Ljava/lang/String;LNf/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zoho/livechat/android/modules/triggers/data/remote/entities/VTSTriggerResponse;", "c", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LNf/a;", "Lcom/zoho/livechat/android/modules/triggers/data/remote/entities/TriggerAcknowledgementResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;LNf/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @PUT("/visitor/v2/{screen_name}/livevisitors/{avuid}/triggers")
    @Nullable
    Object a(@Path("screen_name") @NotNull String str, @Path("avuid") @NotNull String str2, @Body @NotNull Nf.a aVar, @NotNull Continuation<? super Response<SalesIQRestResponse<TriggerAcknowledgementResponse>>> continuation);

    @POST("/visitor/v2/{screen_name}/livevisitors/{avuid}/triggers")
    @Nullable
    Object b(@Path("screen_name") @NotNull String str, @Path("avuid") @NotNull String str2, @Body @NotNull Nf.b bVar, @NotNull Continuation<? super Response<SalesIQRestResponse<TriggerResponse>>> continuation);

    @POST("/visitor/v2/{screen_name}/visitors/{uvid}/trigger")
    @Nullable
    Object c(@Path("screen_name") @NotNull String str, @Path("uvid") @NotNull String str2, @NotNull Continuation<? super Response<SalesIQRestResponse<VTSTriggerResponse>>> continuation);
}
