package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorReducer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"reduceError", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "networkResponse", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ErrorReducerKt {
    public static final ConversationUiState reduceError(NetworkResponse<? extends Object> networkResponse, TopAppBarUiState topAppBarUiState) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            return new ConversationUiState.Error(false, topAppBarUiState);
        }
        return new ConversationUiState.Error(true, topAppBarUiState);
    }
}
