package npi.spay;

import Ve.InterfaceC4574r1;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import spay.sdk.data.dto.response.PartsPaymentPlanBnplResponseBodyDto;
import spay.sdk.data.dto.response.PaymentOrderResponseBodyDto;
import spay.sdk.data.dto.response.PaymentPlanBnplResponseBodyDto;
import spay.sdk.data.dto.response.PaymentTokenResponseBodyDto;
import spay.sdk.data.dto.response.SdkAuthResponseBodyDto;
import spay.sdk.data.dto.response.SessionIdResponseBodyDto;
import spay.sdk.data.dto.response.binding.BindingSessionResponseBodyDto;
import spay.sdk.data.dto.response.binding.BindingV3SessionResponseBodyDto;
import spay.sdk.data.dto.response.binding.CreateBindingOtpResponseBodyDto;
import spay.sdk.data.dto.response.binding.PayBindingResponseBodyDto;
import spay.sdk.data.dto.response.listOfCards.ListOfCardsResponseBodyDto;
import spay.sdk.data.dto.response.otp.ConfirmOtpResponseBodyDto;
import spay.sdk.data.dto.response.otp.CreateOtpSdkResponseBodyDto;
import spay.sdk.data.dto.response.spasibo.SpasiboBonusesResponseBodyDto;
import spay.sdk.domain.model.request.BindingSessionIdRequestBody;
import spay.sdk.domain.model.request.BindingV3SessionIdRequestBody;
import spay.sdk.domain.model.request.ConfirmBindingOtpRequestBody;
import spay.sdk.domain.model.request.ConfirmOtpRequestBody;
import spay.sdk.domain.model.request.CreateBindingOtpRequestBody;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.PayBindingRequestBody;
import spay.sdk.domain.model.request.PayOnlineRequestBody;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;
import spay.sdk.domain.model.request.PaymentOrderRequestBody;
import spay.sdk.domain.model.request.PaymentTokenRequestBody;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.request.SessionIdRequestBody;
import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u000bJ#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\t\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u000eJ1\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00110\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0012J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0017J-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u001cJ#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010 J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020#0\u00042\b\b\u0001\u0010\"\u001a\u00020!H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010$J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010&\u001a\u00020%H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010(J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020+0\u00042\b\b\u0001\u0010*\u001a\u00020)H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010,J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020-0\u00042\b\b\u0001\u0010*\u001a\u00020)H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010,J-\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002010\u00042\b\b\u0001\u0010.\u001a\u00020\u000f2\b\b\u0001\u00100\u001a\u00020/H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u00102J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002050\u00042\b\b\u0001\u00104\u001a\u000203H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u00106J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002090\u00042\b\b\u0001\u00108\u001a\u000207H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010:J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020'0\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010;J\u001d\u0010\u0016\u001a\u00020'2\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010 J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020>0\u00042\b\b\u0001\u0010=\u001a\u00020<H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010?J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010A\u001a\u00020@H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010BJ#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010D\u001a\u00020CH§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010EJ#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020F0\u00042\b\b\u0001\u0010D\u001a\u00020CH§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010E\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"Lnpi/spay/fk;", "", "Lspay/sdk/domain/model/request/SessionIdRequestBody;", "sessionIdRequestBody", "Lretrofit2/Response;", "Lspay/sdk/data/dto/response/SessionIdResponseBodyDto;", "a", "(Lspay/sdk/domain/model/request/SessionIdRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/BindingSessionIdRequestBody;", "bindingSessionIdRequestBody", "Lspay/sdk/data/dto/response/binding/BindingSessionResponseBodyDto;", "(Lspay/sdk/domain/model/request/BindingSessionIdRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/BindingV3SessionIdRequestBody;", "Lspay/sdk/data/dto/response/binding/BindingV3SessionResponseBodyDto;", "(Lspay/sdk/domain/model/request/BindingV3SessionIdRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "sessionId", "", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/ListOfCardsRequestBody;", "listOfCardsRequestBody", "Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto;", "b", "(Lspay/sdk/domain/model/request/ListOfCardsRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/SpasiboBonusesRequestBody;", "spasiboBonusesRequestBody", "endPointVersion", "Lspay/sdk/data/dto/response/spasibo/SpasiboBonusesResponseBodyDto;", "(Lspay/sdk/domain/model/request/SpasiboBonusesRequestBody;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/PaymentTokenRequestBody;", "paymentTokenRequestBody", "Lspay/sdk/data/dto/response/PaymentTokenResponseBodyDto;", "(Lspay/sdk/domain/model/request/PaymentTokenRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/PaymentOrderRequestBody;", "paymentOrderRequestBody", "Lspay/sdk/data/dto/response/PaymentOrderResponseBodyDto;", "(Lspay/sdk/domain/model/request/PaymentOrderRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/PayOnlineRequestBody;", "payOnlineRequestBody", "", "(Lspay/sdk/domain/model/request/PayOnlineRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/PaymentBnplPlanRequestBody;", "paymentBnplPlanRequestBody", "Lspay/sdk/data/dto/response/PaymentPlanBnplResponseBodyDto;", "(Lspay/sdk/domain/model/request/PaymentBnplPlanRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/data/dto/response/PartsPaymentPlanBnplResponseBodyDto;", ImagesContract.URL, "Lspay/sdk/domain/model/request/SdkAuthRequestBody;", "sdkAuthRequestBody", "Lspay/sdk/data/dto/response/SdkAuthResponseBodyDto;", "(Ljava/lang/String;Lspay/sdk/domain/model/request/SdkAuthRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/ConfirmOtpRequestBody;", "confirmOtpRequestBody", "Lspay/sdk/data/dto/response/otp/ConfirmOtpResponseBodyDto;", "(Lspay/sdk/domain/model/request/ConfirmOtpRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/CreateOtpSdkRequestBody;", "createOtpSdkRequestBody", "Lspay/sdk/data/dto/response/otp/CreateOtpSdkResponseBodyDto;", "(Lspay/sdk/domain/model/request/CreateOtpSdkRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/CreateBindingOtpRequestBody;", "createBindingOtpRequestBody", "Lspay/sdk/data/dto/response/binding/CreateBindingOtpResponseBodyDto;", "(Lspay/sdk/domain/model/request/CreateBindingOtpRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/ConfirmBindingOtpRequestBody;", "confirmBindingOtpRequestBody", "(Lspay/sdk/domain/model/request/ConfirmBindingOtpRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/PayBindingRequestBody;", "payBindingRequestBody", "(Lspay/sdk/domain/model/request/PayBindingRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lspay/sdk/data/dto/response/binding/PayBindingResponseBodyDto;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface fk {
    @GET("sdk-gateway/v3/checkBinding")
    Object a(@NotNull @Query("sessionId") String str, @NotNull d<? super Response<Map<String, Object>>> dVar);

    @InterfaceC4574r1
    @POST
    Object a(@Url @NotNull String str, @Body @NotNull SdkAuthRequestBody sdkAuthRequestBody, @NotNull d<? super Response<SdkAuthResponseBodyDto>> dVar);

    @POST("sdk-gateway/v1/revokeTokenSdk")
    Object a(@NotNull d<? super Response<Unit>> dVar);

    @POST("sdk-gateway/v1/bindingSession")
    Object a(@Body @NotNull BindingSessionIdRequestBody bindingSessionIdRequestBody, @NotNull d<? super Response<BindingSessionResponseBodyDto>> dVar);

    @POST("sdk-gateway/v3/bindingSession")
    Object a(@Body @NotNull BindingV3SessionIdRequestBody bindingV3SessionIdRequestBody, @NotNull d<? super Response<BindingV3SessionResponseBodyDto>> dVar);

    @POST("sdk-gateway/v1/confirmBindingOtp")
    Object a(@Body @NotNull ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody, @NotNull d<? super Response<Unit>> dVar);

    @POST("sdk-gateway/v1/confirmOtp")
    Object a(@Body @NotNull ConfirmOtpRequestBody confirmOtpRequestBody, @NotNull d<? super Response<ConfirmOtpResponseBodyDto>> dVar);

    @POST("sdk-gateway/v1/createBindingOtp")
    Object a(@Body @NotNull CreateBindingOtpRequestBody createBindingOtpRequestBody, @NotNull d<? super Response<CreateBindingOtpResponseBodyDto>> dVar);

    @POST("sdk-gateway/v1/createOtp")
    Object a(@Body @NotNull CreateOtpSdkRequestBody createOtpSdkRequestBody, @NotNull d<? super Response<CreateOtpSdkResponseBodyDto>> dVar);

    @POST("sdk-gateway/v1/listPaymentAccounts")
    Object a(@Body @NotNull ListOfCardsRequestBody listOfCardsRequestBody, @NotNull d<? super Response<ListOfCardsResponseBodyDto>> dVar);

    @POST("sdk-gateway/v1/payBinding")
    Object a(@Body @NotNull PayBindingRequestBody payBindingRequestBody, @NotNull d<? super Response<Unit>> dVar);

    @POST("sdk-gateway/v1/payOnline")
    Object a(@Body @NotNull PayOnlineRequestBody payOnlineRequestBody, @NotNull d<? super Response<Unit>> dVar);

    @POST("sdk-gateway/v1/createPaymentPlan")
    Object a(@Body @NotNull PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, @NotNull d<? super Response<PartsPaymentPlanBnplResponseBodyDto>> dVar);

    @POST("sdk-gateway/v1/paymentOrder")
    Object a(@Body @NotNull PaymentOrderRequestBody paymentOrderRequestBody, @NotNull d<? super Response<PaymentOrderResponseBodyDto>> dVar);

    @POST("sdk-gateway/v1/paymentToken")
    Object a(@Body @NotNull PaymentTokenRequestBody paymentTokenRequestBody, @NotNull d<? super Response<PaymentTokenResponseBodyDto>> dVar);

    @POST("sdk-gateway/v1/sessionId")
    Object a(@Body @NotNull SessionIdRequestBody sessionIdRequestBody, @NotNull d<? super Response<SessionIdResponseBodyDto>> dVar);

    @POST("sdk-gateway/{version}/orderSpasiboBonuses")
    Object a(@Body @NotNull SpasiboBonusesRequestBody spasiboBonusesRequestBody, @Path("version") @NotNull String str, @NotNull d<? super Response<SpasiboBonusesResponseBodyDto>> dVar);

    @POST("sdk-gateway/v3/listCards")
    Object b(@Body @NotNull ListOfCardsRequestBody listOfCardsRequestBody, @NotNull d<? super Response<ListOfCardsResponseBodyDto>> dVar);

    @POST("sdk-gateway/v2/payBinding")
    Object b(@Body @NotNull PayBindingRequestBody payBindingRequestBody, @NotNull d<? super Response<PayBindingResponseBodyDto>> dVar);

    @POST("sdk-gateway/v2/paymentPlanBnpl")
    Object b(@Body @NotNull PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, @NotNull d<? super Response<PaymentPlanBnplResponseBodyDto>> dVar);

    @POST("sdk-gateway/v1/paymentToken")
    Object b(@Body @NotNull PaymentTokenRequestBody paymentTokenRequestBody, @NotNull d<? super Unit> dVar);
}
