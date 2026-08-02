package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.tickets.TicketDetailState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0012\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0012\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "SpecialNoticeRow", "TeamIntroRow", "BigTicketRow", "EventRow", "TicketStatusRow", "MergedConversationRow", "AskedAboutRow", "BubbleMessageRow", "PostCardRow", "NoteCardRow", "ComposerSuggestionRow", "QuickRepliesRow", "DayDividerRow", "FinAnswerRow", "FinStreamingRow", "TypingIndicatorRow", "NewMessagesRow", "FooterNoticeRow", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$AskedAboutRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BigTicketRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BubbleMessageRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$ComposerSuggestionRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$DayDividerRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$EventRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$FinAnswerRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$FinStreamingRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$FooterNoticeRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$MergedConversationRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$NewMessagesRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$NoteCardRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$PostCardRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$QuickRepliesRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$SpecialNoticeRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$TeamIntroRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$TicketStatusRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$TypingIndicatorRow;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface ContentRow {
    String getKey();

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$SpecialNoticeRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", SDKConstants.PARAM_KEY, "getKey", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpecialNoticeRow implements ContentRow {
        public static final int $stable = 0;
        private final String message;

        public static /* synthetic */ SpecialNoticeRow copy$default(SpecialNoticeRow specialNoticeRow, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = specialNoticeRow.message;
            }
            return specialNoticeRow.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final SpecialNoticeRow copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new SpecialNoticeRow(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SpecialNoticeRow) && Intrinsics.areEqual(this.message, ((SpecialNoticeRow) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "SpecialNoticeRow(message=" + this.message + ')';
        }

        public SpecialNoticeRow(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "special_notice_row_" + this.message.hashCode();
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$TeamIntroRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", SDKConstants.PARAM_KEY, "getKey", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TeamIntroRow implements ContentRow {
        public static final int $stable = 0;
        private final String message;

        public static /* synthetic */ TeamIntroRow copy$default(TeamIntroRow teamIntroRow, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = teamIntroRow.message;
            }
            return teamIntroRow.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final TeamIntroRow copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new TeamIntroRow(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TeamIntroRow) && Intrinsics.areEqual(this.message, ((TeamIntroRow) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "TeamIntroRow(message=" + this.message + ')';
        }

        public TeamIntroRow(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "team_intro_row_" + this.message.hashCode();
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BigTicketRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "ticketDetailContentState", "Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "ticketId", "", "<init>", "(Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;Ljava/lang/String;)V", "getTicketDetailContentState", "()Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "getTicketId", "()Ljava/lang/String;", SDKConstants.PARAM_KEY, "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BigTicketRow implements ContentRow {
        public static final int $stable = 8;
        private final TicketDetailState.TicketDetailContentState ticketDetailContentState;
        private final String ticketId;

        public static /* synthetic */ BigTicketRow copy$default(BigTicketRow bigTicketRow, TicketDetailState.TicketDetailContentState ticketDetailContentState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                ticketDetailContentState = bigTicketRow.ticketDetailContentState;
            }
            if ((i & 2) != 0) {
                str = bigTicketRow.ticketId;
            }
            return bigTicketRow.copy(ticketDetailContentState, str);
        }

        /* renamed from: component1, reason: from getter */
        public final TicketDetailState.TicketDetailContentState getTicketDetailContentState() {
            return this.ticketDetailContentState;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTicketId() {
            return this.ticketId;
        }

        public final BigTicketRow copy(TicketDetailState.TicketDetailContentState ticketDetailContentState, String ticketId) {
            Intrinsics.checkNotNullParameter(ticketDetailContentState, "ticketDetailContentState");
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            return new BigTicketRow(ticketDetailContentState, ticketId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BigTicketRow)) {
                return false;
            }
            BigTicketRow bigTicketRow = (BigTicketRow) other;
            return Intrinsics.areEqual(this.ticketDetailContentState, bigTicketRow.ticketDetailContentState) && Intrinsics.areEqual(this.ticketId, bigTicketRow.ticketId);
        }

        public int hashCode() {
            return (this.ticketDetailContentState.hashCode() * 31) + this.ticketId.hashCode();
        }

        public String toString() {
            return "BigTicketRow(ticketDetailContentState=" + this.ticketDetailContentState + ", ticketId=" + this.ticketId + ')';
        }

        public BigTicketRow(TicketDetailState.TicketDetailContentState ticketDetailContentState, String ticketId) {
            Intrinsics.checkNotNullParameter(ticketDetailContentState, "ticketDetailContentState");
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            this.ticketDetailContentState = ticketDetailContentState;
            this.ticketId = ticketId;
        }

        public final TicketDetailState.TicketDetailContentState getTicketDetailContentState() {
            return this.ticketDetailContentState;
        }

        public final String getTicketId() {
            return this.ticketId;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "big_ticket_row_" + this.ticketId;
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\bH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$EventRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "labelSegments", "", "Lio/intercom/android/sdk/m5/conversation/states/EventLabelSegment;", "avatar", "Lio/intercom/android/sdk/models/Avatar;", "partId", "", "<init>", "(Ljava/util/List;Lio/intercom/android/sdk/models/Avatar;Ljava/lang/String;)V", "getLabelSegments", "()Ljava/util/List;", "getAvatar", "()Lio/intercom/android/sdk/models/Avatar;", "getPartId", "()Ljava/lang/String;", SDKConstants.PARAM_KEY, "getKey", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EventRow implements ContentRow {
        public static final int $stable = 8;
        private final Avatar avatar;
        private final List<EventLabelSegment> labelSegments;
        private final String partId;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EventRow copy$default(EventRow eventRow, List list, Avatar avatar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = eventRow.labelSegments;
            }
            if ((i & 2) != 0) {
                avatar = eventRow.avatar;
            }
            if ((i & 4) != 0) {
                str = eventRow.partId;
            }
            return eventRow.copy(list, avatar, str);
        }

        public final List<EventLabelSegment> component1() {
            return this.labelSegments;
        }

        /* renamed from: component2, reason: from getter */
        public final Avatar getAvatar() {
            return this.avatar;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPartId() {
            return this.partId;
        }

        public final EventRow copy(List<EventLabelSegment> labelSegments, Avatar avatar, String partId) {
            Intrinsics.checkNotNullParameter(labelSegments, "labelSegments");
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(partId, "partId");
            return new EventRow(labelSegments, avatar, partId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventRow)) {
                return false;
            }
            EventRow eventRow = (EventRow) other;
            return Intrinsics.areEqual(this.labelSegments, eventRow.labelSegments) && Intrinsics.areEqual(this.avatar, eventRow.avatar) && Intrinsics.areEqual(this.partId, eventRow.partId);
        }

        public int hashCode() {
            return (((this.labelSegments.hashCode() * 31) + this.avatar.hashCode()) * 31) + this.partId.hashCode();
        }

        public String toString() {
            return "EventRow(labelSegments=" + this.labelSegments + ", avatar=" + this.avatar + ", partId=" + this.partId + ')';
        }

        public EventRow(List<EventLabelSegment> labelSegments, Avatar avatar, String partId) {
            Intrinsics.checkNotNullParameter(labelSegments, "labelSegments");
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(partId, "partId");
            this.labelSegments = labelSegments;
            this.avatar = avatar;
            this.partId = partId;
        }

        public final List<EventLabelSegment> getLabelSegments() {
            return this.labelSegments;
        }

        public final Avatar getAvatar() {
            return this.avatar;
        }

        public final String getPartId() {
            return this.partId;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "event_row_" + this.partId;
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H×\u0003J\t\u0010!\u001a\u00020\"H×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$TicketStatusRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "ticketEventStatus", "", "ticketStatusText", "createdAt", "", "customStateLabel", "customStatePrefix", "partId", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTicketEventStatus", "()Ljava/lang/String;", "getTicketStatusText", "getCreatedAt", "()J", "getCustomStateLabel", "getCustomStatePrefix", "getPartId", SDKConstants.PARAM_KEY, "getKey", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketStatusRow implements ContentRow {
        public static final int $stable = 0;
        private final long createdAt;
        private final String customStateLabel;
        private final String customStatePrefix;
        private final String partId;
        private final String ticketEventStatus;
        private final String ticketStatusText;

        public static /* synthetic */ TicketStatusRow copy$default(TicketStatusRow ticketStatusRow, String str, String str2, long j, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ticketStatusRow.ticketEventStatus;
            }
            if ((i & 2) != 0) {
                str2 = ticketStatusRow.ticketStatusText;
            }
            if ((i & 4) != 0) {
                j = ticketStatusRow.createdAt;
            }
            if ((i & 8) != 0) {
                str3 = ticketStatusRow.customStateLabel;
            }
            if ((i & 16) != 0) {
                str4 = ticketStatusRow.customStatePrefix;
            }
            if ((i & 32) != 0) {
                str5 = ticketStatusRow.partId;
            }
            String str6 = str5;
            String str7 = str3;
            long j2 = j;
            return ticketStatusRow.copy(str, str2, j2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTicketEventStatus() {
            return this.ticketEventStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTicketStatusText() {
            return this.ticketStatusText;
        }

        /* renamed from: component3, reason: from getter */
        public final long getCreatedAt() {
            return this.createdAt;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCustomStateLabel() {
            return this.customStateLabel;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCustomStatePrefix() {
            return this.customStatePrefix;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPartId() {
            return this.partId;
        }

        public final TicketStatusRow copy(String ticketEventStatus, String ticketStatusText, long createdAt, String customStateLabel, String customStatePrefix, String partId) {
            Intrinsics.checkNotNullParameter(ticketEventStatus, "ticketEventStatus");
            Intrinsics.checkNotNullParameter(ticketStatusText, "ticketStatusText");
            Intrinsics.checkNotNullParameter(partId, "partId");
            return new TicketStatusRow(ticketEventStatus, ticketStatusText, createdAt, customStateLabel, customStatePrefix, partId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TicketStatusRow)) {
                return false;
            }
            TicketStatusRow ticketStatusRow = (TicketStatusRow) other;
            return Intrinsics.areEqual(this.ticketEventStatus, ticketStatusRow.ticketEventStatus) && Intrinsics.areEqual(this.ticketStatusText, ticketStatusRow.ticketStatusText) && this.createdAt == ticketStatusRow.createdAt && Intrinsics.areEqual(this.customStateLabel, ticketStatusRow.customStateLabel) && Intrinsics.areEqual(this.customStatePrefix, ticketStatusRow.customStatePrefix) && Intrinsics.areEqual(this.partId, ticketStatusRow.partId);
        }

        public int hashCode() {
            int hashCode = ((((this.ticketEventStatus.hashCode() * 31) + this.ticketStatusText.hashCode()) * 31) + Long.hashCode(this.createdAt)) * 31;
            String str = this.customStateLabel;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customStatePrefix;
            return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.partId.hashCode();
        }

        public String toString() {
            return "TicketStatusRow(ticketEventStatus=" + this.ticketEventStatus + ", ticketStatusText=" + this.ticketStatusText + ", createdAt=" + this.createdAt + ", customStateLabel=" + this.customStateLabel + ", customStatePrefix=" + this.customStatePrefix + ", partId=" + this.partId + ')';
        }

        public TicketStatusRow(String ticketEventStatus, String ticketStatusText, long j, String str, String str2, String partId) {
            Intrinsics.checkNotNullParameter(ticketEventStatus, "ticketEventStatus");
            Intrinsics.checkNotNullParameter(ticketStatusText, "ticketStatusText");
            Intrinsics.checkNotNullParameter(partId, "partId");
            this.ticketEventStatus = ticketEventStatus;
            this.ticketStatusText = ticketStatusText;
            this.createdAt = j;
            this.customStateLabel = str;
            this.customStatePrefix = str2;
            this.partId = partId;
        }

        public final String getTicketEventStatus() {
            return this.ticketEventStatus;
        }

        public final String getTicketStatusText() {
            return this.ticketStatusText;
        }

        public final long getCreatedAt() {
            return this.createdAt;
        }

        public final String getCustomStateLabel() {
            return this.customStateLabel;
        }

        public final String getCustomStatePrefix() {
            return this.customStatePrefix;
        }

        public final String getPartId() {
            return this.partId;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "ticket_status_row_" + this.partId;
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$MergedConversationRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "description", "", "conversationId", "partId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getConversationId", "getPartId", SDKConstants.PARAM_KEY, "getKey", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MergedConversationRow implements ContentRow {
        public static final int $stable = 0;
        private final String conversationId;
        private final String description;
        private final String partId;

        public static /* synthetic */ MergedConversationRow copy$default(MergedConversationRow mergedConversationRow, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mergedConversationRow.description;
            }
            if ((i & 2) != 0) {
                str2 = mergedConversationRow.conversationId;
            }
            if ((i & 4) != 0) {
                str3 = mergedConversationRow.partId;
            }
            return mergedConversationRow.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPartId() {
            return this.partId;
        }

        public final MergedConversationRow copy(String description, String conversationId, String partId) {
            Intrinsics.checkNotNullParameter(partId, "partId");
            return new MergedConversationRow(description, conversationId, partId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MergedConversationRow)) {
                return false;
            }
            MergedConversationRow mergedConversationRow = (MergedConversationRow) other;
            return Intrinsics.areEqual(this.description, mergedConversationRow.description) && Intrinsics.areEqual(this.conversationId, mergedConversationRow.conversationId) && Intrinsics.areEqual(this.partId, mergedConversationRow.partId);
        }

        public int hashCode() {
            String str = this.description;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.conversationId;
            return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.partId.hashCode();
        }

        public String toString() {
            return "MergedConversationRow(description=" + this.description + ", conversationId=" + this.conversationId + ", partId=" + this.partId + ')';
        }

        public MergedConversationRow(String str, String str2, String partId) {
            Intrinsics.checkNotNullParameter(partId, "partId");
            this.description = str;
            this.conversationId = str2;
            this.partId = partId;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getPartId() {
            return this.partId;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "merged_conversation_row_" + this.partId;
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$AskedAboutRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "part", "Lio/intercom/android/sdk/models/Part;", "<init>", "(Lio/intercom/android/sdk/models/Part;)V", "getPart", "()Lio/intercom/android/sdk/models/Part;", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AskedAboutRow implements ContentRow {
        public static final int $stable = 8;
        private final Part part;

        public static /* synthetic */ AskedAboutRow copy$default(AskedAboutRow askedAboutRow, Part part, int i, Object obj) {
            if ((i & 1) != 0) {
                part = askedAboutRow.part;
            }
            return askedAboutRow.copy(part);
        }

        /* renamed from: component1, reason: from getter */
        public final Part getPart() {
            return this.part;
        }

        public final AskedAboutRow copy(Part part) {
            Intrinsics.checkNotNullParameter(part, "part");
            return new AskedAboutRow(part);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AskedAboutRow) && Intrinsics.areEqual(this.part, ((AskedAboutRow) other).part);
        }

        public int hashCode() {
            return this.part.hashCode();
        }

        public String toString() {
            return "AskedAboutRow(part=" + this.part + ')';
        }

        public AskedAboutRow(Part part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.part = part;
        }

        public final Part getPart() {
            return this.part;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "asked_about_row_" + this.part.getId();
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÇ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 H×\u0003J\t\u0010!\u001a\u00020\"H×\u0001J\t\u0010#\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BubbleMessageRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "partWrapper", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BubbleMessageRow$PartWrapper;", "groupingPosition", "Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "failedImageUploadData", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "isFailed", "", "isPending", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BubbleMessageRow$PartWrapper;Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;ZZ)V", "getPartWrapper", "()Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BubbleMessageRow$PartWrapper;", "getGroupingPosition", "()Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "getFailedImageUploadData", "()Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "()Z", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "PartWrapper", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BubbleMessageRow implements ContentRow {
        public static final int $stable = 8;
        private final PendingMessage.FailedImageUploadData failedImageUploadData;
        private final GroupingPosition groupingPosition;
        private final boolean isFailed;
        private final boolean isPending;
        private final PartWrapper partWrapper;

        public static /* synthetic */ BubbleMessageRow copy$default(BubbleMessageRow bubbleMessageRow, PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedImageUploadData failedImageUploadData, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                partWrapper = bubbleMessageRow.partWrapper;
            }
            if ((i & 2) != 0) {
                groupingPosition = bubbleMessageRow.groupingPosition;
            }
            if ((i & 4) != 0) {
                failedImageUploadData = bubbleMessageRow.failedImageUploadData;
            }
            if ((i & 8) != 0) {
                z = bubbleMessageRow.isFailed;
            }
            if ((i & 16) != 0) {
                z2 = bubbleMessageRow.isPending;
            }
            boolean z3 = z2;
            PendingMessage.FailedImageUploadData failedImageUploadData2 = failedImageUploadData;
            return bubbleMessageRow.copy(partWrapper, groupingPosition, failedImageUploadData2, z, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final PartWrapper getPartWrapper() {
            return this.partWrapper;
        }

        /* renamed from: component2, reason: from getter */
        public final GroupingPosition getGroupingPosition() {
            return this.groupingPosition;
        }

        /* renamed from: component3, reason: from getter */
        public final PendingMessage.FailedImageUploadData getFailedImageUploadData() {
            return this.failedImageUploadData;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsFailed() {
            return this.isFailed;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsPending() {
            return this.isPending;
        }

        public final BubbleMessageRow copy(PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedImageUploadData failedImageUploadData, boolean isFailed, boolean isPending) {
            Intrinsics.checkNotNullParameter(partWrapper, "partWrapper");
            Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
            return new BubbleMessageRow(partWrapper, groupingPosition, failedImageUploadData, isFailed, isPending);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BubbleMessageRow)) {
                return false;
            }
            BubbleMessageRow bubbleMessageRow = (BubbleMessageRow) other;
            return Intrinsics.areEqual(this.partWrapper, bubbleMessageRow.partWrapper) && this.groupingPosition == bubbleMessageRow.groupingPosition && Intrinsics.areEqual(this.failedImageUploadData, bubbleMessageRow.failedImageUploadData) && this.isFailed == bubbleMessageRow.isFailed && this.isPending == bubbleMessageRow.isPending;
        }

        public int hashCode() {
            int hashCode = ((this.partWrapper.hashCode() * 31) + this.groupingPosition.hashCode()) * 31;
            PendingMessage.FailedImageUploadData failedImageUploadData = this.failedImageUploadData;
            return ((((hashCode + (failedImageUploadData == null ? 0 : failedImageUploadData.hashCode())) * 31) + Boolean.hashCode(this.isFailed)) * 31) + Boolean.hashCode(this.isPending);
        }

        public String toString() {
            return "BubbleMessageRow(partWrapper=" + this.partWrapper + ", groupingPosition=" + this.groupingPosition + ", failedImageUploadData=" + this.failedImageUploadData + ", isFailed=" + this.isFailed + ", isPending=" + this.isPending + ')';
        }

        public BubbleMessageRow(PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedImageUploadData failedImageUploadData, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(partWrapper, "partWrapper");
            Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
            this.partWrapper = partWrapper;
            this.groupingPosition = groupingPosition;
            this.failedImageUploadData = failedImageUploadData;
            this.isFailed = z;
            this.isPending = z2;
        }

        public /* synthetic */ BubbleMessageRow(PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedImageUploadData failedImageUploadData, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(partWrapper, groupingPosition, failedImageUploadData, z, (i & 16) != 0 ? false : z2);
        }

        public final PartWrapper getPartWrapper() {
            return this.partWrapper;
        }

        public final GroupingPosition getGroupingPosition() {
            return this.groupingPosition;
        }

        public final PendingMessage.FailedImageUploadData getFailedImageUploadData() {
            return this.failedImageUploadData;
        }

        public final boolean isFailed() {
            return this.isFailed;
        }

        public final boolean isPending() {
            return this.isPending;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "message_row_" + this.partWrapper.getPart().getId();
        }

        /* compiled from: ConversationUiState.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$BubbleMessageRow$PartWrapper;", "", "part", "Lio/intercom/android/sdk/models/Part;", "isLastPart", "", "isAdminOrAltParticipant", "failedAttributeIdentifiers", "", "", "loadingAttributeIdentifiers", "<init>", "(Lio/intercom/android/sdk/models/Part;ZZLjava/util/List;Ljava/util/List;)V", "getPart", "()Lio/intercom/android/sdk/models/Part;", "()Z", "getFailedAttributeIdentifiers", "()Ljava/util/List;", "getLoadingAttributeIdentifiers", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PartWrapper {
            public static final int $stable = 8;
            private final List<String> failedAttributeIdentifiers;
            private final boolean isAdminOrAltParticipant;
            private final boolean isLastPart;
            private final List<String> loadingAttributeIdentifiers;
            private final Part part;

            public static /* synthetic */ PartWrapper copy$default(PartWrapper partWrapper, Part part, boolean z, boolean z2, List list, List list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    part = partWrapper.part;
                }
                if ((i & 2) != 0) {
                    z = partWrapper.isLastPart;
                }
                if ((i & 4) != 0) {
                    z2 = partWrapper.isAdminOrAltParticipant;
                }
                if ((i & 8) != 0) {
                    list = partWrapper.failedAttributeIdentifiers;
                }
                if ((i & 16) != 0) {
                    list2 = partWrapper.loadingAttributeIdentifiers;
                }
                List list3 = list2;
                boolean z3 = z2;
                return partWrapper.copy(part, z, z3, list, list3);
            }

            /* renamed from: component1, reason: from getter */
            public final Part getPart() {
                return this.part;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsLastPart() {
                return this.isLastPart;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsAdminOrAltParticipant() {
                return this.isAdminOrAltParticipant;
            }

            public final List<String> component4() {
                return this.failedAttributeIdentifiers;
            }

            public final List<String> component5() {
                return this.loadingAttributeIdentifiers;
            }

            public final PartWrapper copy(Part part, boolean isLastPart, boolean isAdminOrAltParticipant, List<String> failedAttributeIdentifiers, List<String> loadingAttributeIdentifiers) {
                Intrinsics.checkNotNullParameter(part, "part");
                Intrinsics.checkNotNullParameter(failedAttributeIdentifiers, "failedAttributeIdentifiers");
                Intrinsics.checkNotNullParameter(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
                return new PartWrapper(part, isLastPart, isAdminOrAltParticipant, failedAttributeIdentifiers, loadingAttributeIdentifiers);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PartWrapper)) {
                    return false;
                }
                PartWrapper partWrapper = (PartWrapper) other;
                return Intrinsics.areEqual(this.part, partWrapper.part) && this.isLastPart == partWrapper.isLastPart && this.isAdminOrAltParticipant == partWrapper.isAdminOrAltParticipant && Intrinsics.areEqual(this.failedAttributeIdentifiers, partWrapper.failedAttributeIdentifiers) && Intrinsics.areEqual(this.loadingAttributeIdentifiers, partWrapper.loadingAttributeIdentifiers);
            }

            public int hashCode() {
                return (((((((this.part.hashCode() * 31) + Boolean.hashCode(this.isLastPart)) * 31) + Boolean.hashCode(this.isAdminOrAltParticipant)) * 31) + this.failedAttributeIdentifiers.hashCode()) * 31) + this.loadingAttributeIdentifiers.hashCode();
            }

            public String toString() {
                return "PartWrapper(part=" + this.part + ", isLastPart=" + this.isLastPart + ", isAdminOrAltParticipant=" + this.isAdminOrAltParticipant + ", failedAttributeIdentifiers=" + this.failedAttributeIdentifiers + ", loadingAttributeIdentifiers=" + this.loadingAttributeIdentifiers + ')';
            }

            public PartWrapper(Part part, boolean z, boolean z2, List<String> failedAttributeIdentifiers, List<String> loadingAttributeIdentifiers) {
                Intrinsics.checkNotNullParameter(part, "part");
                Intrinsics.checkNotNullParameter(failedAttributeIdentifiers, "failedAttributeIdentifiers");
                Intrinsics.checkNotNullParameter(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
                this.part = part;
                this.isLastPart = z;
                this.isAdminOrAltParticipant = z2;
                this.failedAttributeIdentifiers = failedAttributeIdentifiers;
                this.loadingAttributeIdentifiers = loadingAttributeIdentifiers;
            }

            public final Part getPart() {
                return this.part;
            }

            public final boolean isLastPart() {
                return this.isLastPart;
            }

            public final boolean isAdminOrAltParticipant() {
                return this.isAdminOrAltParticipant;
            }

            public /* synthetic */ PartWrapper(Part part, boolean z, boolean z2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(part, z, z2, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? CollectionsKt.emptyList() : list2);
            }

            public final List<String> getFailedAttributeIdentifiers() {
                return this.failedAttributeIdentifiers;
            }

            public final List<String> getLoadingAttributeIdentifiers() {
                return this.loadingAttributeIdentifiers;
            }
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$PostCardRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "part", "Lio/intercom/android/sdk/models/Part;", "companyName", "", "<init>", "(Lio/intercom/android/sdk/models/Part;Ljava/lang/String;)V", "getPart", "()Lio/intercom/android/sdk/models/Part;", "getCompanyName", "()Ljava/lang/String;", SDKConstants.PARAM_KEY, "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PostCardRow implements ContentRow {
        public static final int $stable = 8;
        private final String companyName;
        private final Part part;

        public static /* synthetic */ PostCardRow copy$default(PostCardRow postCardRow, Part part, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                part = postCardRow.part;
            }
            if ((i & 2) != 0) {
                str = postCardRow.companyName;
            }
            return postCardRow.copy(part, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Part getPart() {
            return this.part;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCompanyName() {
            return this.companyName;
        }

        public final PostCardRow copy(Part part, String companyName) {
            Intrinsics.checkNotNullParameter(part, "part");
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            return new PostCardRow(part, companyName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostCardRow)) {
                return false;
            }
            PostCardRow postCardRow = (PostCardRow) other;
            return Intrinsics.areEqual(this.part, postCardRow.part) && Intrinsics.areEqual(this.companyName, postCardRow.companyName);
        }

        public int hashCode() {
            return (this.part.hashCode() * 31) + this.companyName.hashCode();
        }

        public String toString() {
            return "PostCardRow(part=" + this.part + ", companyName=" + this.companyName + ')';
        }

        public PostCardRow(Part part, String companyName) {
            Intrinsics.checkNotNullParameter(part, "part");
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            this.part = part;
            this.companyName = companyName;
        }

        public final Part getPart() {
            return this.part;
        }

        public final String getCompanyName() {
            return this.companyName;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "post_card_row_" + this.part.getId();
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$NoteCardRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "part", "Lio/intercom/android/sdk/models/Part;", "companyName", "", "<init>", "(Lio/intercom/android/sdk/models/Part;Ljava/lang/String;)V", "getPart", "()Lio/intercom/android/sdk/models/Part;", "getCompanyName", "()Ljava/lang/String;", SDKConstants.PARAM_KEY, "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoteCardRow implements ContentRow {
        public static final int $stable = 8;
        private final String companyName;
        private final Part part;

        public static /* synthetic */ NoteCardRow copy$default(NoteCardRow noteCardRow, Part part, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                part = noteCardRow.part;
            }
            if ((i & 2) != 0) {
                str = noteCardRow.companyName;
            }
            return noteCardRow.copy(part, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Part getPart() {
            return this.part;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCompanyName() {
            return this.companyName;
        }

        public final NoteCardRow copy(Part part, String companyName) {
            Intrinsics.checkNotNullParameter(part, "part");
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            return new NoteCardRow(part, companyName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoteCardRow)) {
                return false;
            }
            NoteCardRow noteCardRow = (NoteCardRow) other;
            return Intrinsics.areEqual(this.part, noteCardRow.part) && Intrinsics.areEqual(this.companyName, noteCardRow.companyName);
        }

        public int hashCode() {
            return (this.part.hashCode() * 31) + this.companyName.hashCode();
        }

        public String toString() {
            return "NoteCardRow(part=" + this.part + ", companyName=" + this.companyName + ')';
        }

        public NoteCardRow(Part part, String companyName) {
            Intrinsics.checkNotNullParameter(part, "part");
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            this.part = part;
            this.companyName = companyName;
        }

        public final Part getPart() {
            return this.part;
        }

        public final String getCompanyName() {
            return this.companyName;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "note_card_row_" + this.part.getId();
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\nH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$ComposerSuggestionRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS, "", "Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "<init>", "(Ljava/util/List;)V", "getSuggestions", "()Ljava/util/List;", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ComposerSuggestionRow implements ContentRow {
        public static final int $stable = 8;
        private final List<ReplySuggestion> suggestions;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ComposerSuggestionRow copy$default(ComposerSuggestionRow composerSuggestionRow, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = composerSuggestionRow.suggestions;
            }
            return composerSuggestionRow.copy(list);
        }

        public final List<ReplySuggestion> component1() {
            return this.suggestions;
        }

        public final ComposerSuggestionRow copy(List<ReplySuggestion> suggestions) {
            Intrinsics.checkNotNullParameter(suggestions, "suggestions");
            return new ComposerSuggestionRow(suggestions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ComposerSuggestionRow) && Intrinsics.areEqual(this.suggestions, ((ComposerSuggestionRow) other).suggestions);
        }

        public int hashCode() {
            return this.suggestions.hashCode();
        }

        public String toString() {
            return "ComposerSuggestionRow(suggestions=" + this.suggestions + ')';
        }

        public ComposerSuggestionRow(List<ReplySuggestion> suggestions) {
            Intrinsics.checkNotNullParameter(suggestions, "suggestions");
            this.suggestions = suggestions;
        }

        public final List<ReplySuggestion> getSuggestions() {
            return this.suggestions;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "composer_suggestion_row_" + this.suggestions.hashCode();
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0006H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$QuickRepliesRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "replyOptions", "", "Lio/intercom/android/sdk/models/ReplyOption;", "partId", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getReplyOptions", "()Ljava/util/List;", "getPartId", "()Ljava/lang/String;", SDKConstants.PARAM_KEY, "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickRepliesRow implements ContentRow {
        public static final int $stable = 8;
        private final String partId;
        private final List<ReplyOption> replyOptions;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QuickRepliesRow copy$default(QuickRepliesRow quickRepliesRow, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = quickRepliesRow.replyOptions;
            }
            if ((i & 2) != 0) {
                str = quickRepliesRow.partId;
            }
            return quickRepliesRow.copy(list, str);
        }

        public final List<ReplyOption> component1() {
            return this.replyOptions;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPartId() {
            return this.partId;
        }

        public final QuickRepliesRow copy(List<ReplyOption> replyOptions, String partId) {
            Intrinsics.checkNotNullParameter(replyOptions, "replyOptions");
            Intrinsics.checkNotNullParameter(partId, "partId");
            return new QuickRepliesRow(replyOptions, partId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuickRepliesRow)) {
                return false;
            }
            QuickRepliesRow quickRepliesRow = (QuickRepliesRow) other;
            return Intrinsics.areEqual(this.replyOptions, quickRepliesRow.replyOptions) && Intrinsics.areEqual(this.partId, quickRepliesRow.partId);
        }

        public int hashCode() {
            return (this.replyOptions.hashCode() * 31) + this.partId.hashCode();
        }

        public String toString() {
            return "QuickRepliesRow(replyOptions=" + this.replyOptions + ", partId=" + this.partId + ')';
        }

        public QuickRepliesRow(List<ReplyOption> replyOptions, String partId) {
            Intrinsics.checkNotNullParameter(replyOptions, "replyOptions");
            Intrinsics.checkNotNullParameter(partId, "partId");
            this.replyOptions = replyOptions;
            this.partId = partId;
        }

        public final List<ReplyOption> getReplyOptions() {
            return this.replyOptions;
        }

        public final String getPartId() {
            return this.partId;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "quick_replies_row_" + this.partId;
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$DayDividerRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "timestamp", "", "<init>", "(J)V", "getTimestamp", "()J", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DayDividerRow implements ContentRow {
        public static final int $stable = 0;
        private final long timestamp;

        public static /* synthetic */ DayDividerRow copy$default(DayDividerRow dayDividerRow, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = dayDividerRow.timestamp;
            }
            return dayDividerRow.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final DayDividerRow copy(long timestamp) {
            return new DayDividerRow(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DayDividerRow) && this.timestamp == ((DayDividerRow) other).timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return "DayDividerRow(timestamp=" + this.timestamp + ')';
        }

        public DayDividerRow(long j) {
            this.timestamp = j;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "day_divider_row_" + Long.hashCode(this.timestamp);
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\rH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$FinAnswerRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "part", "Lio/intercom/android/sdk/models/Part;", "groupingPosition", "Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "<init>", "(Lio/intercom/android/sdk/models/Part;Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;)V", "getPart", "()Lio/intercom/android/sdk/models/Part;", "getGroupingPosition", "()Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FinAnswerRow implements ContentRow {
        public static final int $stable = 8;
        private final GroupingPosition groupingPosition;
        private final Part part;

        public static /* synthetic */ FinAnswerRow copy$default(FinAnswerRow finAnswerRow, Part part, GroupingPosition groupingPosition, int i, Object obj) {
            if ((i & 1) != 0) {
                part = finAnswerRow.part;
            }
            if ((i & 2) != 0) {
                groupingPosition = finAnswerRow.groupingPosition;
            }
            return finAnswerRow.copy(part, groupingPosition);
        }

        /* renamed from: component1, reason: from getter */
        public final Part getPart() {
            return this.part;
        }

        /* renamed from: component2, reason: from getter */
        public final GroupingPosition getGroupingPosition() {
            return this.groupingPosition;
        }

        public final FinAnswerRow copy(Part part, GroupingPosition groupingPosition) {
            Intrinsics.checkNotNullParameter(part, "part");
            Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
            return new FinAnswerRow(part, groupingPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinAnswerRow)) {
                return false;
            }
            FinAnswerRow finAnswerRow = (FinAnswerRow) other;
            return Intrinsics.areEqual(this.part, finAnswerRow.part) && this.groupingPosition == finAnswerRow.groupingPosition;
        }

        public int hashCode() {
            return (this.part.hashCode() * 31) + this.groupingPosition.hashCode();
        }

        public String toString() {
            return "FinAnswerRow(part=" + this.part + ", groupingPosition=" + this.groupingPosition + ')';
        }

        public FinAnswerRow(Part part, GroupingPosition groupingPosition) {
            Intrinsics.checkNotNullParameter(part, "part");
            Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
            this.part = part;
            this.groupingPosition = groupingPosition;
        }

        public final Part getPart() {
            return this.part;
        }

        public final GroupingPosition getGroupingPosition() {
            return this.groupingPosition;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "fin_answer_row_" + this.part.getId();
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u000eH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$FinStreamingRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "streamingPart", "Lio/intercom/android/sdk/models/StreamingPart;", "<init>", "(Ljava/util/List;Lio/intercom/android/sdk/models/StreamingPart;)V", "getBlocks", "()Ljava/util/List;", "getStreamingPart", "()Lio/intercom/android/sdk/models/StreamingPart;", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FinStreamingRow implements ContentRow {
        public static final int $stable = 8;
        private final List<Block> blocks;
        private final StreamingPart streamingPart;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinStreamingRow copy$default(FinStreamingRow finStreamingRow, List list, StreamingPart streamingPart, int i, Object obj) {
            if ((i & 1) != 0) {
                list = finStreamingRow.blocks;
            }
            if ((i & 2) != 0) {
                streamingPart = finStreamingRow.streamingPart;
            }
            return finStreamingRow.copy(list, streamingPart);
        }

        public final List<Block> component1() {
            return this.blocks;
        }

        /* renamed from: component2, reason: from getter */
        public final StreamingPart getStreamingPart() {
            return this.streamingPart;
        }

        public final FinStreamingRow copy(List<? extends Block> blocks, StreamingPart streamingPart) {
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            Intrinsics.checkNotNullParameter(streamingPart, "streamingPart");
            return new FinStreamingRow(blocks, streamingPart);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinStreamingRow)) {
                return false;
            }
            FinStreamingRow finStreamingRow = (FinStreamingRow) other;
            return Intrinsics.areEqual(this.blocks, finStreamingRow.blocks) && Intrinsics.areEqual(this.streamingPart, finStreamingRow.streamingPart);
        }

        public int hashCode() {
            return (this.blocks.hashCode() * 31) + this.streamingPart.hashCode();
        }

        public String toString() {
            return "FinStreamingRow(blocks=" + this.blocks + ", streamingPart=" + this.streamingPart + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FinStreamingRow(List<? extends Block> blocks, StreamingPart streamingPart) {
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            Intrinsics.checkNotNullParameter(streamingPart, "streamingPart");
            this.blocks = blocks;
            this.streamingPart = streamingPart;
        }

        public final List<Block> getBlocks() {
            return this.blocks;
        }

        public final StreamingPart getStreamingPart() {
            return this.streamingPart;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "fin_streaming_row_" + this.blocks.hashCode();
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$TypingIndicatorRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "currentlyTypingState", "Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;)V", "getCurrentlyTypingState", "()Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TypingIndicatorRow implements ContentRow {
        public static final int $stable = 8;
        private final CurrentlyTypingState currentlyTypingState;

        public static /* synthetic */ TypingIndicatorRow copy$default(TypingIndicatorRow typingIndicatorRow, CurrentlyTypingState currentlyTypingState, int i, Object obj) {
            if ((i & 1) != 0) {
                currentlyTypingState = typingIndicatorRow.currentlyTypingState;
            }
            return typingIndicatorRow.copy(currentlyTypingState);
        }

        /* renamed from: component1, reason: from getter */
        public final CurrentlyTypingState getCurrentlyTypingState() {
            return this.currentlyTypingState;
        }

        public final TypingIndicatorRow copy(CurrentlyTypingState currentlyTypingState) {
            Intrinsics.checkNotNullParameter(currentlyTypingState, "currentlyTypingState");
            return new TypingIndicatorRow(currentlyTypingState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TypingIndicatorRow) && Intrinsics.areEqual(this.currentlyTypingState, ((TypingIndicatorRow) other).currentlyTypingState);
        }

        public int hashCode() {
            return this.currentlyTypingState.hashCode();
        }

        public String toString() {
            return "TypingIndicatorRow(currentlyTypingState=" + this.currentlyTypingState + ')';
        }

        public TypingIndicatorRow(CurrentlyTypingState currentlyTypingState) {
            Intrinsics.checkNotNullParameter(currentlyTypingState, "currentlyTypingState");
            this.currentlyTypingState = currentlyTypingState;
        }

        public final CurrentlyTypingState getCurrentlyTypingState() {
            return this.currentlyTypingState;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "typing_indicator_row_" + this.currentlyTypingState.hashCode();
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$NewMessagesRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "partId", "", "<init>", "(Ljava/lang/String;)V", "getPartId", "()Ljava/lang/String;", SDKConstants.PARAM_KEY, "getKey", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewMessagesRow implements ContentRow {
        public static final int $stable = 0;
        private final String partId;

        public static /* synthetic */ NewMessagesRow copy$default(NewMessagesRow newMessagesRow, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = newMessagesRow.partId;
            }
            return newMessagesRow.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPartId() {
            return this.partId;
        }

        public final NewMessagesRow copy(String partId) {
            Intrinsics.checkNotNullParameter(partId, "partId");
            return new NewMessagesRow(partId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewMessagesRow) && Intrinsics.areEqual(this.partId, ((NewMessagesRow) other).partId);
        }

        public int hashCode() {
            return this.partId.hashCode();
        }

        public String toString() {
            return "NewMessagesRow(partId=" + this.partId + ')';
        }

        public NewMessagesRow(String partId) {
            Intrinsics.checkNotNullParameter(partId, "partId");
            this.partId = partId;
        }

        public final String getPartId() {
            return this.partId;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "new_messages_row_" + this.partId;
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentRow$FooterNoticeRow;", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "footerNoticeState", "Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;)V", "getFooterNoticeState", "()Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FooterNoticeRow implements ContentRow {
        public static final int $stable = 8;
        private final FooterNoticeState footerNoticeState;

        public static /* synthetic */ FooterNoticeRow copy$default(FooterNoticeRow footerNoticeRow, FooterNoticeState footerNoticeState, int i, Object obj) {
            if ((i & 1) != 0) {
                footerNoticeState = footerNoticeRow.footerNoticeState;
            }
            return footerNoticeRow.copy(footerNoticeState);
        }

        /* renamed from: component1, reason: from getter */
        public final FooterNoticeState getFooterNoticeState() {
            return this.footerNoticeState;
        }

        public final FooterNoticeRow copy(FooterNoticeState footerNoticeState) {
            Intrinsics.checkNotNullParameter(footerNoticeState, "footerNoticeState");
            return new FooterNoticeRow(footerNoticeState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FooterNoticeRow) && Intrinsics.areEqual(this.footerNoticeState, ((FooterNoticeRow) other).footerNoticeState);
        }

        public int hashCode() {
            return this.footerNoticeState.hashCode();
        }

        public String toString() {
            return "FooterNoticeRow(footerNoticeState=" + this.footerNoticeState + ')';
        }

        public FooterNoticeRow(FooterNoticeState footerNoticeState) {
            Intrinsics.checkNotNullParameter(footerNoticeState, "footerNoticeState");
            this.footerNoticeState = footerNoticeState;
        }

        public final FooterNoticeState getFooterNoticeState() {
            return this.footerNoticeState;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "footer_notice_row_" + this.footerNoticeState.hashCode();
        }
    }
}
