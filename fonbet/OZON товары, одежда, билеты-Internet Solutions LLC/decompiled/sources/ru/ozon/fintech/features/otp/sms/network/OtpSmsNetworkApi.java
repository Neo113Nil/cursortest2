package ru.ozon.fintech.features.otp.sms.network;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/features/otp/sms/network/OtpSmsNetworkApi;", "", "Lru/ozon/fintech/features/otp/sms/network/OtpKeyData;", "getKey", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "otp-sms_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OtpSmsNetworkApi {
    @POST("mobile/offline/totpGetOcraPrivateKey")
    Object getKey(@NotNull d<? super OtpKeyData> dVar);
}
