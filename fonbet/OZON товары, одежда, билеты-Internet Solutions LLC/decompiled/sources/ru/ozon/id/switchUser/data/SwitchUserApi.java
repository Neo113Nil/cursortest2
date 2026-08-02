package ru.ozon.id.switchUser.data;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/id/switchUser/data/SwitchUserApi;", "", "Lru/ozon/id/switchUser/data/SwitchUserBodyDTO;", "body", "Lru/ozon/id/switchUser/data/SwitchUserResultDTO;", "switchUser", "(Lru/ozon/id/switchUser/data/SwitchUserBodyDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SwitchUserApi {
    @POST("composer-api.bx/_action/switchUserMobile")
    Object switchUser(@Body @NotNull SwitchUserBodyDTO switchUserBodyDTO, @NotNull d<? super SwitchUserResultDTO> dVar);
}
