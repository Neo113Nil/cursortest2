package io.intercom.android.sdk.m5.data;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.UsersResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonRepository.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/m5/data/CommonRepository;", "", "messengerApi", "Lio/intercom/android/sdk/api/MessengerApi;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lio/intercom/android/sdk/api/MessengerApi;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "openMessenger", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUnreadCounts", "Lio/intercom/android/sdk/models/UsersResponse;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CommonRepository {
    public static final int $stable = 8;
    private final IntercomDataLayer intercomDataLayer;
    private final MessengerApi messengerApi;

    public CommonRepository(MessengerApi messengerApi, IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(messengerApi, "messengerApi");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.messengerApi = messengerApi;
        this.intercomDataLayer = intercomDataLayer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object openMessenger(Continuation<? super OpenMessengerResponse> continuation) {
        CommonRepository$openMessenger$1 commonRepository$openMessenger$1;
        int i;
        CommonRepository commonRepository;
        NetworkResponse networkResponse;
        if (continuation instanceof CommonRepository$openMessenger$1) {
            commonRepository$openMessenger$1 = (CommonRepository$openMessenger$1) continuation;
            if ((commonRepository$openMessenger$1.label & Integer.MIN_VALUE) != 0) {
                commonRepository$openMessenger$1.label -= Integer.MIN_VALUE;
                Object obj = commonRepository$openMessenger$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonRepository$openMessenger$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    OpenMessengerResponse openResponse = this.intercomDataLayer.getOpenResponse();
                    if (openResponse != null) {
                        return openResponse;
                    }
                    if (!Injector.get().getAblyManager().isConnected()) {
                        Injector.get().getAblyManager().connect();
                    }
                    MessengerApi messengerApi = this.messengerApi;
                    commonRepository$openMessenger$1.L$0 = this;
                    commonRepository$openMessenger$1.label = 1;
                    obj = MessengerApi.DefaultImpls.openMessengerSuspended$default(messengerApi, null, commonRepository$openMessenger$1, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    commonRepository = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    commonRepository = (CommonRepository) commonRepository$openMessenger$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                networkResponse = (NetworkResponse) obj;
                if (networkResponse instanceof NetworkResponse.Success) {
                    return null;
                }
                NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
                commonRepository.intercomDataLayer.updateOpenResponse((OpenMessengerResponse) success.getBody());
                return (OpenMessengerResponse) success.getBody();
            }
        }
        commonRepository$openMessenger$1 = new CommonRepository$openMessenger$1(this, continuation);
        Object obj2 = commonRepository$openMessenger$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonRepository$openMessenger$1.label;
        if (i != 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (networkResponse instanceof NetworkResponse.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchUnreadCounts(Continuation<? super UsersResponse> continuation) {
        CommonRepository$fetchUnreadCounts$1 commonRepository$fetchUnreadCounts$1;
        int i;
        NetworkResponse networkResponse;
        if (continuation instanceof CommonRepository$fetchUnreadCounts$1) {
            commonRepository$fetchUnreadCounts$1 = (CommonRepository$fetchUnreadCounts$1) continuation;
            if ((commonRepository$fetchUnreadCounts$1.label & Integer.MIN_VALUE) != 0) {
                commonRepository$fetchUnreadCounts$1.label -= Integer.MIN_VALUE;
                Object obj = commonRepository$fetchUnreadCounts$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonRepository$fetchUnreadCounts$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MessengerApi messengerApi = this.messengerApi;
                    commonRepository$fetchUnreadCounts$1.label = 1;
                    obj = MessengerApi.DefaultImpls.getUnreadConversationsSuspended$default(messengerApi, null, commonRepository$fetchUnreadCounts$1, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                networkResponse = (NetworkResponse) obj;
                if (networkResponse instanceof NetworkResponse.Success) {
                    return null;
                }
                return ((UsersResponse.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
            }
        }
        commonRepository$fetchUnreadCounts$1 = new CommonRepository$fetchUnreadCounts$1(this, continuation);
        Object obj2 = commonRepository$fetchUnreadCounts$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonRepository$fetchUnreadCounts$1.label;
        if (i != 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (networkResponse instanceof NetworkResponse.Success) {
        }
    }
}
