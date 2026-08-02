package io.intercom.android.sdk.m5.inbox.reducers;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.ui.common.IntercomTopBarState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InboxPagingItemsReducer.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a3\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0007H\u0002¨\u0006\r"}, d2 = {"reduceToInboxUiState", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "Landroidx/paging/compose/LazyPagingItems;", "Lio/intercom/android/sdk/models/Conversation;", "emptyState", "Lio/intercom/android/sdk/models/EmptyState;", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "navIcon", "", "(Landroidx/paging/compose/LazyPagingItems;Lio/intercom/android/sdk/models/EmptyState;Lio/intercom/android/sdk/identity/AppConfig;ILandroidx/compose/runtime/Composer;II)Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "shouldShowSendMessageButton", "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InboxPagingItemsReducerKt {
    public static final InboxUiState reduceToInboxUiState(final LazyPagingItems<Conversation> lazyPagingItems, EmptyState emptyState, AppConfig appConfig, int i, Composer composer, int i2, int i3) {
        InboxUiState.Initial loading;
        InboxUiState.Error error;
        Intrinsics.checkNotNullParameter(lazyPagingItems, "<this>");
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        composer.startReplaceGroup(886365946);
        AppConfig appConfig2 = (i3 & 2) != 0 ? Injector.get().getAppConfigProvider().get() : appConfig;
        String spaceLabelIfExists = appConfig2.getSpaceLabelIfExists(Space.Type.MESSAGES);
        composer.startReplaceGroup(-261437153);
        if (spaceLabelIfExists == null) {
            spaceLabelIfExists = StringResources_androidKt.stringResource(R.string.intercom_messages_space_title, composer, 0);
        }
        composer.endReplaceGroup();
        IntercomTopBarState intercomTopBarState = new IntercomTopBarState(Integer.valueOf(i), spaceLabelIfExists, null, Color.m6029boximpl(IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13106getHeader0d7_KjU()), Color.m6029boximpl(IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13113getOnHeader0d7_KjU()), null, 36, null);
        if (lazyPagingItems.getItemSnapshotList().size() != 0) {
            boolean shouldShowSendMessageButton = shouldShowSendMessageButton(appConfig2);
            boolean z = lazyPagingItems.getLoadState().getAppend() instanceof LoadState.Loading;
            LoadState append = lazyPagingItems.getLoadState().getAppend();
            ErrorState errorState = null;
            LoadState.Error error2 = append instanceof LoadState.Error ? (LoadState.Error) append : null;
            if (error2 != null) {
                errorState = error2.getError() instanceof IOException ? new ErrorState.WithCTA(0, 0, null, 0, new Function0() { // from class: io.intercom.android.sdk.m5.inbox.reducers.InboxPagingItemsReducerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit reduceToInboxUiState$lambda$1$lambda$0;
                        reduceToInboxUiState$lambda$1$lambda$0 = InboxPagingItemsReducerKt.reduceToInboxUiState$lambda$1$lambda$0(LazyPagingItems.this);
                        return reduceToInboxUiState$lambda$1$lambda$0;
                    }
                }, 15, null) : new ErrorState.WithoutCTA(0, 0, null, 7, null);
            }
            loading = new InboxUiState.Content(intercomTopBarState, lazyPagingItems, shouldShowSendMessageButton, z, errorState);
        } else if (lazyPagingItems.getLoadState().getRefresh() instanceof LoadState.Error) {
            LoadState refresh = lazyPagingItems.getLoadState().getRefresh();
            Intrinsics.checkNotNull(refresh, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
            if (((LoadState.Error) refresh).getError() instanceof IOException) {
                error = new InboxUiState.Error(intercomTopBarState, new ErrorState.WithCTA(0, 0, null, 0, new Function0() { // from class: io.intercom.android.sdk.m5.inbox.reducers.InboxPagingItemsReducerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit reduceToInboxUiState$lambda$2;
                        reduceToInboxUiState$lambda$2 = InboxPagingItemsReducerKt.reduceToInboxUiState$lambda$2(LazyPagingItems.this);
                        return reduceToInboxUiState$lambda$2;
                    }
                }, 15, null));
            } else {
                error = new InboxUiState.Error(intercomTopBarState, new ErrorState.WithoutCTA(0, 0, null, 7, null));
            }
            loading = error;
        } else if (!Intrinsics.areEqual(emptyState, EmptyState.INSTANCE.getNULL())) {
            loading = new InboxUiState.Empty(intercomTopBarState, emptyState, shouldShowSendMessageButton(appConfig2));
        } else {
            loading = lazyPagingItems.getLoadState().getRefresh() instanceof LoadState.Loading ? new InboxUiState.Loading(intercomTopBarState) : new InboxUiState.Initial(intercomTopBarState);
        }
        composer.endReplaceGroup();
        return loading;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reduceToInboxUiState$lambda$1$lambda$0(LazyPagingItems this_reduceToInboxUiState) {
        Intrinsics.checkNotNullParameter(this_reduceToInboxUiState, "$this_reduceToInboxUiState");
        this_reduceToInboxUiState.retry();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reduceToInboxUiState$lambda$2(LazyPagingItems this_reduceToInboxUiState) {
        Intrinsics.checkNotNullParameter(this_reduceToInboxUiState, "$this_reduceToInboxUiState");
        this_reduceToInboxUiState.refresh();
        return Unit.INSTANCE;
    }

    private static final boolean shouldShowSendMessageButton(AppConfig appConfig) {
        return AppConfigExtensionsKt.canStartNewConversation(appConfig) && !appConfig.isHelpCenterRequireSearchEnabled();
    }
}
