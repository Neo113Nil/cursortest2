package ru.ozon.id.antibot.challenge.mf;

import Ic0.j;
import We.A;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Tag;
import retrofit2.http.Url;
import ru.ozon.id.antibot.FingerprintRequestDTO;
import ru.ozon.id.antibot.FingerprintResponseDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/id/antibot/challenge/mf/FingerprintApi;", "", "LWe/A;", ImagesContract.URL, "Lru/ozon/id/antibot/FingerprintRequestDTO;", "body", "LIc0/j;", "tag", "Lru/ozon/id/antibot/FingerprintResponseDTO;", "sendFingerprint", "(LWe/A;Lru/ozon/id/antibot/FingerprintRequestDTO;LIc0/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FingerprintApi {
    @POST
    Object sendFingerprint(@Url @NotNull A a11, @Body @NotNull FingerprintRequestDTO fingerprintRequestDTO, @Tag @NotNull j jVar, @NotNull d<? super FingerprintResponseDTO> dVar);
}
