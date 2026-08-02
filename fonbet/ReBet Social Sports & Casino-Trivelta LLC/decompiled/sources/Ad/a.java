package Ad;

import be.InterfaceC2419a;
import com.zoho.livechat.android.modules.authentication.data.local.entities.AnnonAuthResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ3\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ3\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"LAd/a;", "", "", "screenName", "Lokhttp3/RequestBody;", "requestBody", "Lretrofit2/Response;", "Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQRestResponse;", com.google.crypto.tink.integration.android.b.f37029b, "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "Lcom/zoho/livechat/android/modules/authentication/data/local/entities/AnnonAuthResponse;", "a", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @PUT("/visitor/v2/{screen_name}/conversations/annonid")
    @Nullable
    Object a(@Path("screen_name") @NotNull String str, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<AnnonAuthResponse>>> continuation);

    @InterfaceC2419a
    @POST("/visitor/v2/{screen_name}/jwtauthentication")
    @Nullable
    Object b(@Path("screen_name") @NotNull String str, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<Object>>> continuation);

    @InterfaceC2419a
    @PUT("/visitor/v2/{screen_name}/jwtauthentication/logout")
    @Nullable
    Object c(@Path("screen_name") @NotNull String str, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super Response<SalesIQRestResponse<Object>>> continuation);
}
