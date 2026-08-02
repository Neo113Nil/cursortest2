package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadingStateReducer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"reduceLoadingState", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Loading;", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LoadingStateReducerKt {
    public static final ConversationUiState.Loading reduceLoadingState(TopAppBarUiState topAppBarUiState) {
        TopAppBarUiState m12149copyN4y9b34;
        Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
        m12149copyN4y9b34 = r3.m12149copyN4y9b34((r32 & 1) != 0 ? r3.title : null, (r32 & 2) != 0 ? r3.navIcon : topAppBarUiState.getNavIcon(), (r32 & 4) != 0 ? r3.subTitle : null, (r32 & 8) != 0 ? r3.subTitleLeadingIcon : null, (r32 & 16) != 0 ? r3.avatars : null, (r32 & 32) != 0 ? r3.displayActiveIndicator : false, (r32 & 64) != 0 ? r3.ticketStatusState : null, (r32 & 128) != 0 ? r3.headerMenuItems : null, (r32 & 256) != 0 ? r3.backgroundColor : null, (r32 & 512) != 0 ? r3.backgroundColorDark : null, (r32 & 1024) != 0 ? r3.contentColor : null, (r32 & 2048) != 0 ? r3.contentColorDark : null, (r32 & 4096) != 0 ? r3.subTitleColor : null, (r32 & 8192) != 0 ? r3.subTitleColorDark : null, (r32 & 16384) != 0 ? TopAppBarUiState.INSTANCE.getDefault().pushNotificationsBannerState : null);
        return new ConversationUiState.Loading(m12149copyN4y9b34);
    }
}
