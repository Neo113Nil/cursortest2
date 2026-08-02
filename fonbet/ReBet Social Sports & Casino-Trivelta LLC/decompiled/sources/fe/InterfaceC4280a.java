package fe;

import com.google.crypto.tink.integration.android.b;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lfe/a;", "", "", "screenName", "Lokhttp3/RequestBody;", "requestBody", "Lretrofit2/Response;", "Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQRestResponse;", "", b.f37029b, "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", EventKeys.URL, "Lokhttp3/ResponseBody;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fe.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4280a {
    @be.b
    @GET
    @Nullable
    Object a(@Url @NotNull String str, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @POST("{screen_name}/logdebuginfo.ls")
    @Nullable
    Object b(@Path("screen_name") @NotNull String str, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<Unit>>> continuation);
}
