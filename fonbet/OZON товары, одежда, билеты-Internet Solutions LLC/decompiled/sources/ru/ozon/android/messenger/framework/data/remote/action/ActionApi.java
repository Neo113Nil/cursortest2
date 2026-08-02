package ru.ozon.android.messenger.framework.data.remote.action;

import We.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;
import ru.ozon.android.messenger.blocks.curtain.CurtainModalResponseDTO;
import ru.ozon.android.messenger.blocks.disclaimer.modal.DisclaimerModalResponseDTO;
import ru.ozon.android.messenger.blocks.originalText.OriginalTextResponseDTO;
import ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.RateMessengerSuccessModalDto;
import ru.ozon.android.messenger.framework.data.requests.ActionsCurtainResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.AddFastAnswerResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ContextMenuItemActionResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.CouponActionResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.EditChatMessageResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ExternalTransitionModalResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ReadAllResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ReplyChatMessageResponseDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u000b\u0010\tJ6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\r\u0010\tJ6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u000f\u0010\tJ6\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u0011\u0010\tJ6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u0013\u0010\tJ*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\u001a\u0010\tJ*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0014H§@¢\u0006\u0004\b\u001c\u0010\u0018J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0014H§@¢\u0006\u0004\b\u001d\u0010\u0018J*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0014H§@¢\u0006\u0004\b\u001e\u0010\u0018J6\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b \u0010\tJ*\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0014H§@¢\u0006\u0004\b\"\u0010\u0018J*\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0014H§@¢\u0006\u0004\b#\u0010\u0018J6\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b%\u0010\tJ6\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b'\u0010\t¨\u0006("}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/action/ActionApi;", "", "", "location", "", "params", "Lretrofit2/Response;", "", "sendAction", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/android/messenger/framework/data/requests/ReadAllResponseDTO;", "sendReadAllAction", "Lru/ozon/android/messenger/framework/data/requests/CouponActionResponseDTO;", "sendCouponAction", "Lru/ozon/android/messenger/blocks/disclaimer/modal/DisclaimerModalResponseDTO;", "openDisclaimerModalAction", "Lru/ozon/android/messenger/blocks/ratemessenger/sucessstate/RateMessengerSuccessModalDto;", "openRateMessengerSuccessModalAction", "Lru/ozon/android/messenger/blocks/originalText/OriginalTextResponseDTO;", "getOriginalTextAction", "LWe/K;", "requestBody", "Lru/ozon/android/messenger/framework/data/requests/ContextMenuItemActionResponseDTO;", "executeChatWithSuccessAction", "(Ljava/lang/String;LWe/K;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/android/messenger/framework/data/requests/ExternalTransitionModalResponseDTO;", "executeGetSuspiciousLinkModalAction", "Lru/ozon/android/messenger/framework/data/requests/AddFastAnswerResponseDTO;", "chatGetFastAnswersAddAction", "saveFastAnswerAction", "removeFastAnswerAction", "Lru/ozon/android/messenger/blocks/curtain/CurtainModalResponseDTO;", "executeGetCurtainModalAction", "Lru/ozon/android/messenger/framework/data/requests/ActionsCurtainResponseDTO;", "executeGetActionCurtainModalAction", "sendReportAbuseAction", "Lru/ozon/android/messenger/framework/data/requests/EditChatMessageResponseDTO;", "executeEditChatMessageAction", "Lru/ozon/android/messenger/framework/data/requests/ReplyChatMessageResponseDTO;", "executeReplyChatMessageAction", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ActionApi {
    @POST
    Object chatGetFastAnswersAddAction(@Url @NotNull String str, @Body @NotNull K k11, @NotNull kotlin.coroutines.d<? super Response<AddFastAnswerResponseDTO>> dVar);

    @POST
    Object executeChatWithSuccessAction(@Url @NotNull String str, @Body @NotNull K k11, @NotNull kotlin.coroutines.d<? super Response<ContextMenuItemActionResponseDTO>> dVar);

    @POST
    Object executeEditChatMessageAction(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<EditChatMessageResponseDTO>> dVar);

    @POST
    Object executeGetActionCurtainModalAction(@Url @NotNull String str, @Body @NotNull K k11, @NotNull kotlin.coroutines.d<? super Response<ActionsCurtainResponseDTO>> dVar);

    @POST
    Object executeGetCurtainModalAction(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<CurtainModalResponseDTO>> dVar);

    @POST
    Object executeGetSuspiciousLinkModalAction(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<ExternalTransitionModalResponseDTO>> dVar);

    @POST
    Object executeReplyChatMessageAction(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<ReplyChatMessageResponseDTO>> dVar);

    @POST
    Object getOriginalTextAction(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<OriginalTextResponseDTO>> dVar);

    @POST
    Object openDisclaimerModalAction(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<DisclaimerModalResponseDTO>> dVar);

    @POST
    Object openRateMessengerSuccessModalAction(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<RateMessengerSuccessModalDto>> dVar);

    @POST
    Object removeFastAnswerAction(@Url @NotNull String str, @Body @NotNull K k11, @NotNull kotlin.coroutines.d<? super Response<AddFastAnswerResponseDTO>> dVar);

    @POST
    Object saveFastAnswerAction(@Url @NotNull String str, @Body @NotNull K k11, @NotNull kotlin.coroutines.d<? super Response<AddFastAnswerResponseDTO>> dVar);

    @POST
    Object sendAction(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<Unit>> dVar);

    @POST
    Object sendCouponAction(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<CouponActionResponseDTO>> dVar);

    @POST
    Object sendReadAllAction(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<ReadAllResponseDTO>> dVar);

    @POST
    Object sendReportAbuseAction(@Url @NotNull String str, @Body @NotNull K k11, @NotNull kotlin.coroutines.d<? super Response<CurtainModalResponseDTO>> dVar);
}
