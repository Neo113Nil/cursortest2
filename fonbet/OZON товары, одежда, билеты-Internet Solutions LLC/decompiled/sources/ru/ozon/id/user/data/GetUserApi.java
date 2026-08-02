package ru.ozon.id.user.data;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/id/user/data/GetUserApi;", "", "", "", "", "request", "Lru/ozon/id/user/data/OzonIdUser;", "getUserV2", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GetUserApi {
    @POST("composer-api.bx/_action/getUserV2")
    Object getUserV2(@Body @NotNull Map<String, Boolean> map, @NotNull d<? super OzonIdUser> dVar);
}
