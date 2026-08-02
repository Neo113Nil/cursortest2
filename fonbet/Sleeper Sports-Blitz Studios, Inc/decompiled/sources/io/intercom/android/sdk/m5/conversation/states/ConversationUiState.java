package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "getTopAppBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "Loading", "Content", "Error", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Content;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Error;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface ConversationUiState {
    TopAppBarUiState getTopAppBarUiState();

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Loading;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;)V", "getTopAppBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading implements ConversationUiState {
        public static final int $stable = 8;
        private final TopAppBarUiState topAppBarUiState;

        public static /* synthetic */ Loading copy$default(Loading loading, TopAppBarUiState topAppBarUiState, int i, Object obj) {
            if ((i & 1) != 0) {
                topAppBarUiState = loading.topAppBarUiState;
            }
            return loading.copy(topAppBarUiState);
        }

        /* renamed from: component1, reason: from getter */
        public final TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public final Loading copy(TopAppBarUiState topAppBarUiState) {
            Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
            return new Loading(topAppBarUiState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.topAppBarUiState, ((Loading) other).topAppBarUiState);
        }

        public int hashCode() {
            return this.topAppBarUiState.hashCode();
        }

        public String toString() {
            return "Loading(topAppBarUiState=" + this.topAppBarUiState + ')';
        }

        public Loading(TopAppBarUiState topAppBarUiState) {
            Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
            this.topAppBarUiState = topAppBarUiState;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ConversationUiState
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u0010HÆ\u0003J\t\u0010,\u001a\u00020\u0012HÆ\u0003J_\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÇ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H×\u0003J\t\u00102\u001a\u000203H×\u0001J\t\u00104\u001a\u000205H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Content;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "contentRows", "", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "bottomBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "networkState", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "bottomSheetState", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "floatingIndicatorState", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "teamPresenceState", "Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;", "voiceTranscriptionState", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;Ljava/util/List;Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;Lio/intercom/android/sdk/m5/conversation/states/NetworkState;Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;)V", "getTopAppBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "getContentRows", "()Ljava/util/List;", "getBottomBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "getNetworkState", "()Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "getBottomSheetState", "()Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "getFloatingIndicatorState", "()Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "getTeamPresenceState", "()Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;", "getVoiceTranscriptionState", "()Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content implements ConversationUiState {
        public static final int $stable = 8;
        private final BottomBarUiState bottomBarUiState;
        private final BottomSheetState bottomSheetState;
        private final List<ContentRow> contentRows;
        private final FloatingIndicatorState floatingIndicatorState;
        private final NetworkState networkState;
        private final TeamPresenceState teamPresenceState;
        private final TopAppBarUiState topAppBarUiState;
        private final VoiceTranscriptionState voiceTranscriptionState;

        public static /* synthetic */ Content copy$default(Content content, TopAppBarUiState topAppBarUiState, List list, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, VoiceTranscriptionState voiceTranscriptionState, int i, Object obj) {
            if ((i & 1) != 0) {
                topAppBarUiState = content.topAppBarUiState;
            }
            if ((i & 2) != 0) {
                list = content.contentRows;
            }
            if ((i & 4) != 0) {
                bottomBarUiState = content.bottomBarUiState;
            }
            if ((i & 8) != 0) {
                networkState = content.networkState;
            }
            if ((i & 16) != 0) {
                bottomSheetState = content.bottomSheetState;
            }
            if ((i & 32) != 0) {
                floatingIndicatorState = content.floatingIndicatorState;
            }
            if ((i & 64) != 0) {
                teamPresenceState = content.teamPresenceState;
            }
            if ((i & 128) != 0) {
                voiceTranscriptionState = content.voiceTranscriptionState;
            }
            TeamPresenceState teamPresenceState2 = teamPresenceState;
            VoiceTranscriptionState voiceTranscriptionState2 = voiceTranscriptionState;
            BottomSheetState bottomSheetState2 = bottomSheetState;
            FloatingIndicatorState floatingIndicatorState2 = floatingIndicatorState;
            return content.copy(topAppBarUiState, list, bottomBarUiState, networkState, bottomSheetState2, floatingIndicatorState2, teamPresenceState2, voiceTranscriptionState2);
        }

        /* renamed from: component1, reason: from getter */
        public final TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public final List<ContentRow> component2() {
            return this.contentRows;
        }

        /* renamed from: component3, reason: from getter */
        public final BottomBarUiState getBottomBarUiState() {
            return this.bottomBarUiState;
        }

        /* renamed from: component4, reason: from getter */
        public final NetworkState getNetworkState() {
            return this.networkState;
        }

        /* renamed from: component5, reason: from getter */
        public final BottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        /* renamed from: component6, reason: from getter */
        public final FloatingIndicatorState getFloatingIndicatorState() {
            return this.floatingIndicatorState;
        }

        /* renamed from: component7, reason: from getter */
        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        /* renamed from: component8, reason: from getter */
        public final VoiceTranscriptionState getVoiceTranscriptionState() {
            return this.voiceTranscriptionState;
        }

        public final Content copy(TopAppBarUiState topAppBarUiState, List<? extends ContentRow> contentRows, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, VoiceTranscriptionState voiceTranscriptionState) {
            Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
            Intrinsics.checkNotNullParameter(contentRows, "contentRows");
            Intrinsics.checkNotNullParameter(bottomBarUiState, "bottomBarUiState");
            Intrinsics.checkNotNullParameter(networkState, "networkState");
            Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
            Intrinsics.checkNotNullParameter(floatingIndicatorState, "floatingIndicatorState");
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            Intrinsics.checkNotNullParameter(voiceTranscriptionState, "voiceTranscriptionState");
            return new Content(topAppBarUiState, contentRows, bottomBarUiState, networkState, bottomSheetState, floatingIndicatorState, teamPresenceState, voiceTranscriptionState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.topAppBarUiState, content.topAppBarUiState) && Intrinsics.areEqual(this.contentRows, content.contentRows) && Intrinsics.areEqual(this.bottomBarUiState, content.bottomBarUiState) && Intrinsics.areEqual(this.networkState, content.networkState) && Intrinsics.areEqual(this.bottomSheetState, content.bottomSheetState) && Intrinsics.areEqual(this.floatingIndicatorState, content.floatingIndicatorState) && Intrinsics.areEqual(this.teamPresenceState, content.teamPresenceState) && Intrinsics.areEqual(this.voiceTranscriptionState, content.voiceTranscriptionState);
        }

        public int hashCode() {
            return (((((((((((((this.topAppBarUiState.hashCode() * 31) + this.contentRows.hashCode()) * 31) + this.bottomBarUiState.hashCode()) * 31) + this.networkState.hashCode()) * 31) + this.bottomSheetState.hashCode()) * 31) + this.floatingIndicatorState.hashCode()) * 31) + this.teamPresenceState.hashCode()) * 31) + this.voiceTranscriptionState.hashCode();
        }

        public String toString() {
            return "Content(topAppBarUiState=" + this.topAppBarUiState + ", contentRows=" + this.contentRows + ", bottomBarUiState=" + this.bottomBarUiState + ", networkState=" + this.networkState + ", bottomSheetState=" + this.bottomSheetState + ", floatingIndicatorState=" + this.floatingIndicatorState + ", teamPresenceState=" + this.teamPresenceState + ", voiceTranscriptionState=" + this.voiceTranscriptionState + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content(TopAppBarUiState topAppBarUiState, List<? extends ContentRow> contentRows, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, VoiceTranscriptionState voiceTranscriptionState) {
            Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
            Intrinsics.checkNotNullParameter(contentRows, "contentRows");
            Intrinsics.checkNotNullParameter(bottomBarUiState, "bottomBarUiState");
            Intrinsics.checkNotNullParameter(networkState, "networkState");
            Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
            Intrinsics.checkNotNullParameter(floatingIndicatorState, "floatingIndicatorState");
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            Intrinsics.checkNotNullParameter(voiceTranscriptionState, "voiceTranscriptionState");
            this.topAppBarUiState = topAppBarUiState;
            this.contentRows = contentRows;
            this.bottomBarUiState = bottomBarUiState;
            this.networkState = networkState;
            this.bottomSheetState = bottomSheetState;
            this.floatingIndicatorState = floatingIndicatorState;
            this.teamPresenceState = teamPresenceState;
            this.voiceTranscriptionState = voiceTranscriptionState;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ConversationUiState
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public final List<ContentRow> getContentRows() {
            return this.contentRows;
        }

        public final BottomBarUiState getBottomBarUiState() {
            return this.bottomBarUiState;
        }

        public /* synthetic */ Content(TopAppBarUiState topAppBarUiState, List list, BottomBarUiState bottomBarUiState, NetworkState.Connected connected, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, VoiceTranscriptionState voiceTranscriptionState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(topAppBarUiState, list, bottomBarUiState, (i & 8) != 0 ? NetworkState.Connected.INSTANCE : connected, (i & 16) != 0 ? BottomSheetState.Empty.INSTANCE : bottomSheetState, floatingIndicatorState, teamPresenceState, (i & 128) != 0 ? VoiceTranscriptionState.Idle.INSTANCE : voiceTranscriptionState);
        }

        public final NetworkState getNetworkState() {
            return this.networkState;
        }

        public final BottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final FloatingIndicatorState getFloatingIndicatorState() {
            return this.floatingIndicatorState;
        }

        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public final VoiceTranscriptionState getVoiceTranscriptionState() {
            return this.voiceTranscriptionState;
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Error;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "showCta", "", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "<init>", "(ZLio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;)V", "getShowCta", "()Z", "getTopAppBarUiState", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements ConversationUiState {
        public static final int $stable = 8;
        private final boolean showCta;
        private final TopAppBarUiState topAppBarUiState;

        public static /* synthetic */ Error copy$default(Error error, boolean z, TopAppBarUiState topAppBarUiState, int i, Object obj) {
            if ((i & 1) != 0) {
                z = error.showCta;
            }
            if ((i & 2) != 0) {
                topAppBarUiState = error.topAppBarUiState;
            }
            return error.copy(z, topAppBarUiState);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowCta() {
            return this.showCta;
        }

        /* renamed from: component2, reason: from getter */
        public final TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public final Error copy(boolean showCta, TopAppBarUiState topAppBarUiState) {
            Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
            return new Error(showCta, topAppBarUiState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.showCta == error.showCta && Intrinsics.areEqual(this.topAppBarUiState, error.topAppBarUiState);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.showCta) * 31) + this.topAppBarUiState.hashCode();
        }

        public String toString() {
            return "Error(showCta=" + this.showCta + ", topAppBarUiState=" + this.topAppBarUiState + ')';
        }

        public Error(boolean z, TopAppBarUiState topAppBarUiState) {
            Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
            this.showCta = z;
            this.topAppBarUiState = topAppBarUiState;
        }

        public final boolean getShowCta() {
            return this.showCta;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ConversationUiState
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }
    }
}
