package ru.ozon.id.logout.data.api;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJF\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/id/logout/data/api/LogoutComposerApi;", "", "", ImagesContract.URL, "", "body", "Lru/ozon/id/logout/data/api/ConfirmTrustedDeviceActionResponse;", "confirmTrustedDevice", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "canConfirmTrusted", "skipTrusted", "Lru/ozon/id/logout/data/api/LogoutResponse;", "logout", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LogoutComposerApi {
    @POST
    Object confirmTrustedDevice(@Url @NotNull String str, @Body @NotNull Map<String, String> map, @NotNull d<? super ConfirmTrustedDeviceActionResponse> dVar);

    @Headers({"Cache-Control: no-cache"})
    @POST
    Object logout(@Url @NotNull String str, @Query("canConfirmTrusted") boolean z11, @Query("skipTrusted") Boolean bool, @Body @NotNull Map<String, String> map, @NotNull d<? super LogoutResponse> dVar);
}
