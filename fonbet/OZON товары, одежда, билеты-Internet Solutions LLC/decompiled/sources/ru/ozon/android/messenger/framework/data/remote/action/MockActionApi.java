package ru.ozon.android.messenger.framework.data.remote.action;

import We.D;
import We.K;
import We.M;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import ru.ozon.android.messenger.blocks.curtain.CurtainModalResponseDTO;
import ru.ozon.android.messenger.blocks.disclaimer.modal.DisclaimerModalResponseDTO;
import ru.ozon.android.messenger.blocks.originalText.OriginalTextResponseDTO;
import ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.RateMessengerSuccessModalDto;
import ru.ozon.android.messenger.framework.data.remote.FileApi;
import ru.ozon.android.messenger.framework.data.remote.UploadFileResponse;
import ru.ozon.android.messenger.framework.data.requests.ActionsCurtainResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.AddFastAnswerResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ContextMenuItemActionResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.CouponActionResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.EditChatMessageResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ExternalTransitionModalResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ReadAllResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ReplyChatMessageResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.common.ActionSuccessOrFailResponseDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/action/MockActionApi;", "Lru/ozon/android/messenger/framework/data/remote/action/ActionApi;", "Lru/ozon/android/messenger/framework/data/remote/FileApi;", "<init>", "()V", "", "location", "", "", "params", "Lretrofit2/Response;", "Lru/ozon/android/messenger/framework/data/requests/EditChatMessageResponseDTO;", "executeEditChatMessageAction", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MockActionApi implements ActionApi, FileApi {
    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object chatGetFastAnswersAddAction(@NotNull String str, @NotNull K k11, @NotNull kotlin.coroutines.d<? super Response<AddFastAnswerResponseDTO>> dVar) {
        Response success = Response.success(new AddFastAnswerResponseDTO(new ActionSuccessOrFailResponseDTO(new ActionSuccessOrFailResponseDTO.SuccessMessageDTO("Добавили сообщение в быстрые ответы", null), null)));
        Intrinsics.checkNotNullExpressionValue(success, "success(...)");
        return success;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object executeChatWithSuccessAction(@NotNull String str, @NotNull K k11, @NotNull kotlin.coroutines.d<? super Response<ContextMenuItemActionResponseDTO>> dVar) {
        Response error = Response.error(999, M.Companion.d(M.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(error, "error(...)");
        return error;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public Object executeEditChatMessageAction(@NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<EditChatMessageResponseDTO>> dVar) {
        Response error = Response.error(999, M.Companion.d(M.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(error, "error(...)");
        return error;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object executeGetActionCurtainModalAction(@NotNull String str, @NotNull K k11, @NotNull kotlin.coroutines.d<? super Response<ActionsCurtainResponseDTO>> dVar) {
        Response error = Response.error(999, M.Companion.d(M.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(error, "error(...)");
        return error;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object executeGetCurtainModalAction(@NotNull String str, @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<CurtainModalResponseDTO>> dVar) {
        Response error = Response.error(999, M.Companion.d(M.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(error, "error(...)");
        return error;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object executeGetSuspiciousLinkModalAction(@NotNull String str, @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<ExternalTransitionModalResponseDTO>> dVar) {
        Response error = Response.error(999, M.Companion.d(M.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(error, "error(...)");
        return error;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object executeReplyChatMessageAction(@NotNull String str, @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<ReplyChatMessageResponseDTO>> dVar) {
        Response error = Response.error(999, M.Companion.d(M.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(error, "error(...)");
        return error;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object getOriginalTextAction(@NotNull String str, @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<OriginalTextResponseDTO>> dVar) {
        Response success = Response.success(null);
        Intrinsics.checkNotNullExpressionValue(success, "success(...)");
        return success;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object openDisclaimerModalAction(@NotNull String str, @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<DisclaimerModalResponseDTO>> dVar) {
        Response success = Response.success(null);
        Intrinsics.checkNotNullExpressionValue(success, "success(...)");
        return success;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object openRateMessengerSuccessModalAction(@NotNull String str, @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<RateMessengerSuccessModalDto>> dVar) {
        Response success = Response.success(null);
        Intrinsics.checkNotNullExpressionValue(success, "success(...)");
        return success;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object removeFastAnswerAction(@NotNull String str, @NotNull K k11, @NotNull kotlin.coroutines.d<? super Response<AddFastAnswerResponseDTO>> dVar) {
        Response error = Response.error(999, M.Companion.d(M.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(error, "error(...)");
        return error;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object saveFastAnswerAction(@NotNull String str, @NotNull K k11, @NotNull kotlin.coroutines.d<? super Response<AddFastAnswerResponseDTO>> dVar) {
        Response error = Response.error(999, M.Companion.d(M.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(error, "error(...)");
        return error;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object sendAction(@NotNull String str, @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<Unit>> dVar) {
        Response success = Response.success(Unit.f71690a);
        Intrinsics.checkNotNullExpressionValue(success, "success(...)");
        return success;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object sendCouponAction(@NotNull String str, @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<CouponActionResponseDTO>> dVar) {
        Response success = Response.success(null);
        Intrinsics.checkNotNullExpressionValue(success, "success(...)");
        return success;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object sendReadAllAction(@NotNull String str, @NotNull Map<String, Object> map, @NotNull kotlin.coroutines.d<? super Response<ReadAllResponseDTO>> dVar) {
        Response success = Response.success(null);
        Intrinsics.checkNotNullExpressionValue(success, "success(...)");
        return success;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.action.ActionApi
    public final Object sendReportAbuseAction(@NotNull String str, @NotNull K k11, @NotNull kotlin.coroutines.d<? super Response<CurtainModalResponseDTO>> dVar) {
        Response error = Response.error(999, M.Companion.d(M.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(error, "error(...)");
        return error;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.FileApi
    public final Object uploadFile(@NotNull String str, @NotNull D.c cVar, @NotNull kotlin.coroutines.d<? super Response<UploadFileResponse>> dVar) {
        Response success = Response.success(new UploadFileResponse(str));
        Intrinsics.checkNotNullExpressionValue(success, "success(...)");
        return success;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.FileApi
    public final Object uploadImage(@NotNull String str, @NotNull D.c cVar, @NotNull kotlin.coroutines.d<? super Response<UploadFileResponse>> dVar) {
        Response success = Response.success(new UploadFileResponse(str));
        Intrinsics.checkNotNullExpressionValue(success, "success(...)");
        return success;
    }
}
