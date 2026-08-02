package ru.ozon.fintech.settings.network;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import ru.ozon.fintech.settings.models.AuthPinpad;
import ru.ozon.fintech.settings.models.AuthPinpadRequestDto;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/fintech/settings/network/AuthPinpadNetwork;", "", "", "coldStart", "", "sessionId", "Lru/ozon/fintech/settings/models/AuthPinpadRequestDto;", "authPinpadRequestDto", "Lru/ozon/fintech/settings/models/AuthPinpad;", "authPinpad", "(ZLjava/lang/String;Lru/ozon/fintech/settings/models/AuthPinpadRequestDto;Lkotlin/coroutines/d;)Ljava/lang/Object;", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AuthPinpadNetwork {
    @Headers({"Cache-Control: no-cache", "accept: application/json", "Content-Type: application/json"})
    @POST("mobile/auth/pinpad")
    Object authPinpad(@Header("x-ob-cold-start") boolean z11, @Header("x-ob-sessionid") @NotNull String str, @Body @NotNull AuthPinpadRequestDto authPinpadRequestDto, @NotNull d<? super AuthPinpad> dVar);
}
