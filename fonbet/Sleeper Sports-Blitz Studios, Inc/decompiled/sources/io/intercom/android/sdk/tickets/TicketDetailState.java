package io.intercom.android.sdk.tickets;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketDetailState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketDetailState;", "", "<init>", "()V", "Initial", "Loading", "Error", "TicketDetailContentState", "Lio/intercom/android/sdk/tickets/TicketDetailState$Error;", "Lio/intercom/android/sdk/tickets/TicketDetailState$Initial;", "Lio/intercom/android/sdk/tickets/TicketDetailState$Loading;", "Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class TicketDetailState {
    public static final int $stable = 0;

    public /* synthetic */ TicketDetailState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: TicketDetailState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketDetailState$Initial;", "Lio/intercom/android/sdk/tickets/TicketDetailState;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Initial extends TicketDetailState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    private TicketDetailState() {
    }

    /* compiled from: TicketDetailState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketDetailState$Loading;", "Lio/intercom/android/sdk/tickets/TicketDetailState;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends TicketDetailState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: TicketDetailState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketDetailState$Error;", "Lio/intercom/android/sdk/tickets/TicketDetailState;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "<init>", "(Lio/intercom/android/sdk/m5/components/ErrorState;)V", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends TicketDetailState {
        public static final int $stable = 0;
        private final ErrorState errorState;

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, int i, Object obj) {
            if ((i & 1) != 0) {
                errorState = error.errorState;
            }
            return error.copy(errorState);
        }

        /* renamed from: component1, reason: from getter */
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final Error copy(ErrorState errorState) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            return new Error(errorState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.errorState, ((Error) other).errorState);
        }

        public int hashCode() {
            return this.errorState.hashCode();
        }

        public String toString() {
            return "Error(errorState=" + this.errorState + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(ErrorState errorState) {
            super(null);
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            this.errorState = errorState;
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }
    }

    /* compiled from: TicketDetailState.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÇ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H×\u0003J\t\u0010$\u001a\u00020%H×\u0001J\t\u0010&\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "Lio/intercom/android/sdk/tickets/TicketDetailState;", "ticketName", "", "ticketTimelineCardState", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState;", "ticketAttributes", "", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "userEmail", "conversationId", "conversationButtonState", "Lio/intercom/android/sdk/tickets/ConversationButtonState;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/tickets/TicketTimelineCardState;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/tickets/ConversationButtonState;)V", "getTicketName", "()Ljava/lang/String;", "getTicketTimelineCardState", "()Lio/intercom/android/sdk/tickets/TicketTimelineCardState;", "getTicketAttributes", "()Ljava/util/List;", "getUserEmail", "getConversationId", "getConversationButtonState", "()Lio/intercom/android/sdk/tickets/ConversationButtonState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketDetailContentState extends TicketDetailState {
        public static final int $stable = 8;
        private final ConversationButtonState conversationButtonState;
        private final String conversationId;
        private final List<Ticket.TicketAttribute> ticketAttributes;
        private final String ticketName;
        private final TicketTimelineCardState ticketTimelineCardState;
        private final String userEmail;

        public static /* synthetic */ TicketDetailContentState copy$default(TicketDetailContentState ticketDetailContentState, String str, TicketTimelineCardState ticketTimelineCardState, List list, String str2, String str3, ConversationButtonState conversationButtonState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ticketDetailContentState.ticketName;
            }
            if ((i & 2) != 0) {
                ticketTimelineCardState = ticketDetailContentState.ticketTimelineCardState;
            }
            if ((i & 4) != 0) {
                list = ticketDetailContentState.ticketAttributes;
            }
            if ((i & 8) != 0) {
                str2 = ticketDetailContentState.userEmail;
            }
            if ((i & 16) != 0) {
                str3 = ticketDetailContentState.conversationId;
            }
            if ((i & 32) != 0) {
                conversationButtonState = ticketDetailContentState.conversationButtonState;
            }
            String str4 = str3;
            ConversationButtonState conversationButtonState2 = conversationButtonState;
            return ticketDetailContentState.copy(str, ticketTimelineCardState, list, str2, str4, conversationButtonState2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTicketName() {
            return this.ticketName;
        }

        /* renamed from: component2, reason: from getter */
        public final TicketTimelineCardState getTicketTimelineCardState() {
            return this.ticketTimelineCardState;
        }

        public final List<Ticket.TicketAttribute> component3() {
            return this.ticketAttributes;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUserEmail() {
            return this.userEmail;
        }

        /* renamed from: component5, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* renamed from: component6, reason: from getter */
        public final ConversationButtonState getConversationButtonState() {
            return this.conversationButtonState;
        }

        public final TicketDetailContentState copy(String ticketName, TicketTimelineCardState ticketTimelineCardState, List<? extends Ticket.TicketAttribute> ticketAttributes, String userEmail, String conversationId, ConversationButtonState conversationButtonState) {
            Intrinsics.checkNotNullParameter(ticketName, "ticketName");
            Intrinsics.checkNotNullParameter(ticketTimelineCardState, "ticketTimelineCardState");
            Intrinsics.checkNotNullParameter(ticketAttributes, "ticketAttributes");
            Intrinsics.checkNotNullParameter(userEmail, "userEmail");
            Intrinsics.checkNotNullParameter(conversationButtonState, "conversationButtonState");
            return new TicketDetailContentState(ticketName, ticketTimelineCardState, ticketAttributes, userEmail, conversationId, conversationButtonState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TicketDetailContentState)) {
                return false;
            }
            TicketDetailContentState ticketDetailContentState = (TicketDetailContentState) other;
            return Intrinsics.areEqual(this.ticketName, ticketDetailContentState.ticketName) && Intrinsics.areEqual(this.ticketTimelineCardState, ticketDetailContentState.ticketTimelineCardState) && Intrinsics.areEqual(this.ticketAttributes, ticketDetailContentState.ticketAttributes) && Intrinsics.areEqual(this.userEmail, ticketDetailContentState.userEmail) && Intrinsics.areEqual(this.conversationId, ticketDetailContentState.conversationId) && Intrinsics.areEqual(this.conversationButtonState, ticketDetailContentState.conversationButtonState);
        }

        public int hashCode() {
            int hashCode = ((((((this.ticketName.hashCode() * 31) + this.ticketTimelineCardState.hashCode()) * 31) + this.ticketAttributes.hashCode()) * 31) + this.userEmail.hashCode()) * 31;
            String str = this.conversationId;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.conversationButtonState.hashCode();
        }

        public String toString() {
            return "TicketDetailContentState(ticketName=" + this.ticketName + ", ticketTimelineCardState=" + this.ticketTimelineCardState + ", ticketAttributes=" + this.ticketAttributes + ", userEmail=" + this.userEmail + ", conversationId=" + this.conversationId + ", conversationButtonState=" + this.conversationButtonState + ')';
        }

        public final String getTicketName() {
            return this.ticketName;
        }

        public final TicketTimelineCardState getTicketTimelineCardState() {
            return this.ticketTimelineCardState;
        }

        public final List<Ticket.TicketAttribute> getTicketAttributes() {
            return this.ticketAttributes;
        }

        public final String getUserEmail() {
            return this.userEmail;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final ConversationButtonState getConversationButtonState() {
            return this.conversationButtonState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TicketDetailContentState(String ticketName, TicketTimelineCardState ticketTimelineCardState, List<? extends Ticket.TicketAttribute> ticketAttributes, String userEmail, String str, ConversationButtonState conversationButtonState) {
            super(null);
            Intrinsics.checkNotNullParameter(ticketName, "ticketName");
            Intrinsics.checkNotNullParameter(ticketTimelineCardState, "ticketTimelineCardState");
            Intrinsics.checkNotNullParameter(ticketAttributes, "ticketAttributes");
            Intrinsics.checkNotNullParameter(userEmail, "userEmail");
            Intrinsics.checkNotNullParameter(conversationButtonState, "conversationButtonState");
            this.ticketName = ticketName;
            this.ticketTimelineCardState = ticketTimelineCardState;
            this.ticketAttributes = ticketAttributes;
            this.userEmail = userEmail;
            this.conversationId = str;
            this.conversationButtonState = conversationButtonState;
        }
    }
}
