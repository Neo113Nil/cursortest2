package io.intercom.android.sdk.m5.inbox.states;

import androidx.paging.compose.LazyPagingItems;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.common.IntercomTopBarState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InboxUiState.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0011\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "", "intercomTopBarState", "Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "<init>", "(Lio/intercom/android/sdk/ui/common/IntercomTopBarState;)V", "getIntercomTopBarState", "()Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "Initial", "Loading", "Content", "Empty", "Error", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public class InboxUiState {
    public static final int $stable = IntercomTopBarState.$stable;
    private final IntercomTopBarState intercomTopBarState;

    /* compiled from: InboxUiState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiState$Initial;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "intercomTopBarState", "Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "<init>", "(Lio/intercom/android/sdk/ui/common/IntercomTopBarState;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Initial extends InboxUiState {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(IntercomTopBarState intercomTopBarState) {
            super(intercomTopBarState);
            Intrinsics.checkNotNullParameter(intercomTopBarState, "intercomTopBarState");
        }
    }

    public InboxUiState(IntercomTopBarState intercomTopBarState) {
        Intrinsics.checkNotNullParameter(intercomTopBarState, "intercomTopBarState");
        this.intercomTopBarState = intercomTopBarState;
    }

    public final IntercomTopBarState getIntercomTopBarState() {
        return this.intercomTopBarState;
    }

    /* compiled from: InboxUiState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiState$Loading;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "intercomTopBarState", "Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "<init>", "(Lio/intercom/android/sdk/ui/common/IntercomTopBarState;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends InboxUiState {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(IntercomTopBarState intercomTopBarState) {
            super(intercomTopBarState);
            Intrinsics.checkNotNullParameter(intercomTopBarState, "intercomTopBarState");
        }
    }

    /* compiled from: InboxUiState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiState$Content;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "intercomTopBarState", "Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "inboxConversations", "Landroidx/paging/compose/LazyPagingItems;", "Lio/intercom/android/sdk/models/Conversation;", "showSendMessageFab", "", "isLoadingMore", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "<init>", "(Lio/intercom/android/sdk/ui/common/IntercomTopBarState;Landroidx/paging/compose/LazyPagingItems;ZZLio/intercom/android/sdk/m5/components/ErrorState;)V", "getInboxConversations", "()Landroidx/paging/compose/LazyPagingItems;", "getShowSendMessageFab", "()Z", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Content extends InboxUiState {
        public static final int $stable = LazyPagingItems.$stable;
        private final ErrorState errorState;
        private final LazyPagingItems<Conversation> inboxConversations;
        private final boolean isLoadingMore;
        private final boolean showSendMessageFab;

        public /* synthetic */ Content(IntercomTopBarState intercomTopBarState, LazyPagingItems lazyPagingItems, boolean z, boolean z2, ErrorState errorState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(intercomTopBarState, lazyPagingItems, z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : errorState);
        }

        public final LazyPagingItems<Conversation> getInboxConversations() {
            return this.inboxConversations;
        }

        public final boolean getShowSendMessageFab() {
            return this.showSendMessageFab;
        }

        /* renamed from: isLoadingMore, reason: from getter */
        public final boolean getIsLoadingMore() {
            return this.isLoadingMore;
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(IntercomTopBarState intercomTopBarState, LazyPagingItems<Conversation> inboxConversations, boolean z, boolean z2, ErrorState errorState) {
            super(intercomTopBarState);
            Intrinsics.checkNotNullParameter(intercomTopBarState, "intercomTopBarState");
            Intrinsics.checkNotNullParameter(inboxConversations, "inboxConversations");
            this.inboxConversations = inboxConversations;
            this.showSendMessageFab = z;
            this.isLoadingMore = z2;
            this.errorState = errorState;
        }
    }

    /* compiled from: InboxUiState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiState$Empty;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "intercomTopBarState", "Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "emptyState", "Lio/intercom/android/sdk/models/EmptyState;", "showActionButton", "", "<init>", "(Lio/intercom/android/sdk/ui/common/IntercomTopBarState;Lio/intercom/android/sdk/models/EmptyState;Z)V", "getEmptyState", "()Lio/intercom/android/sdk/models/EmptyState;", "getShowActionButton", "()Z", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Empty extends InboxUiState {
        public static final int $stable = 0;
        private final EmptyState emptyState;
        private final boolean showActionButton;

        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        public final boolean getShowActionButton() {
            return this.showActionButton;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Empty(IntercomTopBarState intercomTopBarState, EmptyState emptyState, boolean z) {
            super(intercomTopBarState);
            Intrinsics.checkNotNullParameter(intercomTopBarState, "intercomTopBarState");
            Intrinsics.checkNotNullParameter(emptyState, "emptyState");
            this.emptyState = emptyState;
            this.showActionButton = z;
        }
    }

    /* compiled from: InboxUiState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiState$Error;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiState;", "intercomTopBarState", "Lio/intercom/android/sdk/ui/common/IntercomTopBarState;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "<init>", "(Lio/intercom/android/sdk/ui/common/IntercomTopBarState;Lio/intercom/android/sdk/m5/components/ErrorState;)V", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends InboxUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(IntercomTopBarState intercomTopBarState, ErrorState errorState) {
            super(intercomTopBarState);
            Intrinsics.checkNotNullParameter(intercomTopBarState, "intercomTopBarState");
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            this.errorState = errorState;
        }
    }
}
