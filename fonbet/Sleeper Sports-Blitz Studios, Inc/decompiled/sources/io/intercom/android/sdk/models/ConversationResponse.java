package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationResponse.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/models/ConversationResponse;", "Lio/intercom/android/sdk/models/BaseResponse;", "builder", "Lio/intercom/android/sdk/models/ConversationResponse$Builder;", "<init>", "(Lio/intercom/android/sdk/models/ConversationResponse$Builder;)V", "getBuilder", "()Lio/intercom/android/sdk/models/ConversationResponse$Builder;", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "getConversation", "()Lio/intercom/android/sdk/models/Conversation;", "Builder", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConversationResponse extends BaseResponse {
    public static final int $stable = 8;
    private final Builder builder;
    private final Conversation conversation;

    public final Builder getBuilder() {
        return this.builder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationResponse(Builder builder) {
        super(builder);
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        String id = builder.getId();
        id = id == null ? "" : id;
        boolean read = builder.getRead();
        List<Participant.Builder> participants = builder.getParticipants();
        List<Part.Builder> conversation_parts = builder.getConversation_parts();
        List<String> group_conversation_participant_ids = builder.getGroup_conversation_participant_ids();
        LastParticipatingAdmin.Builder last_participating_admin = builder.getLast_participating_admin();
        ComposerState composer_state = builder.getComposer_state();
        composer_state = composer_state == null ? ComposerState.INSTANCE.getNULL() : composer_state;
        boolean prevent_end_user_replies = builder.getPrevent_end_user_replies();
        boolean inbound_conversations_disabled = builder.getInbound_conversations_disabled();
        String notification_status = builder.getNotification_status();
        notification_status = notification_status == null ? "" : notification_status;
        String state = builder.getState();
        state = state == null ? "" : state;
        boolean is_inbound = builder.getIs_inbound();
        Ticket ticket = builder.getTicket();
        ConversationUiFlags ui_flags = builder.getUi_flags();
        this.conversation = new Conversation(id, read, participants, conversation_parts, group_conversation_participant_ids, last_participating_admin, composer_state, prevent_end_user_replies, inbound_conversations_disabled, notification_status, state, is_inbound, ticket, ui_flags == null ? ConversationUiFlags.INSTANCE.getDEFAULT() : ui_flags, null, null, null, null, null, null, 1032192, null);
    }

    public final Conversation getConversation() {
        return this.conversation;
    }

    /* compiled from: ConversationResponse.kt */
    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010D\u001a\u00020EH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR\u001a\u0010-\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR\u001c\u00100\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\tR\u001c\u00103\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR\u001a\u00106\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u000fR\u001c\u00108\u001a\u0004\u0018\u000109X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lio/intercom/android/sdk/models/ConversationResponse$Builder;", "Lio/intercom/android/sdk/models/BaseResponse$Builder;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "read", "", "getRead", "()Z", "setRead", "(Z)V", "participants", "", "Lio/intercom/android/sdk/models/Participant$Builder;", "getParticipants", "()Ljava/util/List;", "setParticipants", "(Ljava/util/List;)V", "conversation_parts", "Lio/intercom/android/sdk/models/Part$Builder;", "getConversation_parts", "setConversation_parts", "group_conversation_participant_ids", "getGroup_conversation_participant_ids", "setGroup_conversation_participant_ids", "last_participating_admin", "Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;", "getLast_participating_admin", "()Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;", "setLast_participating_admin", "(Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;)V", "composer_state", "Lio/intercom/android/sdk/models/ComposerState;", "getComposer_state", "()Lio/intercom/android/sdk/models/ComposerState;", "setComposer_state", "(Lio/intercom/android/sdk/models/ComposerState;)V", "prevent_end_user_replies", "getPrevent_end_user_replies", "setPrevent_end_user_replies", "inbound_conversations_disabled", "getInbound_conversations_disabled", "setInbound_conversations_disabled", "notification_status", "getNotification_status", "setNotification_status", "state", "getState", "setState", "is_inbound", "set_inbound", "ticket", "Lio/intercom/android/sdk/models/Ticket;", "getTicket", "()Lio/intercom/android/sdk/models/Ticket;", "setTicket", "(Lio/intercom/android/sdk/models/Ticket;)V", "ui_flags", "Lio/intercom/android/sdk/models/ConversationUiFlags;", "getUi_flags", "()Lio/intercom/android/sdk/models/ConversationUiFlags;", "setUi_flags", "(Lio/intercom/android/sdk/models/ConversationUiFlags;)V", "build", "Lio/intercom/android/sdk/models/ConversationResponse;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder extends BaseResponse.Builder {
        public static final int $stable = 8;
        private ComposerState composer_state;
        private String id;
        private boolean inbound_conversations_disabled;
        private boolean is_inbound;
        private String notification_status;
        private boolean prevent_end_user_replies;
        private boolean read;
        private String state;
        private Ticket ticket;
        private ConversationUiFlags ui_flags;
        private List<Participant.Builder> participants = CollectionsKt.emptyList();
        private List<Part.Builder> conversation_parts = CollectionsKt.emptyList();
        private List<String> group_conversation_participant_ids = CollectionsKt.emptyList();
        private LastParticipatingAdmin.Builder last_participating_admin = new LastParticipatingAdmin.Builder();

        public final String getId() {
            return this.id;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final boolean getRead() {
            return this.read;
        }

        public final void setRead(boolean z) {
            this.read = z;
        }

        public final List<Participant.Builder> getParticipants() {
            return this.participants;
        }

        public final void setParticipants(List<Participant.Builder> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.participants = list;
        }

        public final List<Part.Builder> getConversation_parts() {
            return this.conversation_parts;
        }

        public final void setConversation_parts(List<Part.Builder> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.conversation_parts = list;
        }

        public final List<String> getGroup_conversation_participant_ids() {
            return this.group_conversation_participant_ids;
        }

        public final void setGroup_conversation_participant_ids(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.group_conversation_participant_ids = list;
        }

        public final LastParticipatingAdmin.Builder getLast_participating_admin() {
            return this.last_participating_admin;
        }

        public final void setLast_participating_admin(LastParticipatingAdmin.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "<set-?>");
            this.last_participating_admin = builder;
        }

        public final ComposerState getComposer_state() {
            return this.composer_state;
        }

        public final void setComposer_state(ComposerState composerState) {
            this.composer_state = composerState;
        }

        public final boolean getPrevent_end_user_replies() {
            return this.prevent_end_user_replies;
        }

        public final void setPrevent_end_user_replies(boolean z) {
            this.prevent_end_user_replies = z;
        }

        public final boolean getInbound_conversations_disabled() {
            return this.inbound_conversations_disabled;
        }

        public final void setInbound_conversations_disabled(boolean z) {
            this.inbound_conversations_disabled = z;
        }

        public final String getNotification_status() {
            return this.notification_status;
        }

        public final void setNotification_status(String str) {
            this.notification_status = str;
        }

        public final String getState() {
            return this.state;
        }

        public final void setState(String str) {
            this.state = str;
        }

        /* renamed from: is_inbound, reason: from getter */
        public final boolean getIs_inbound() {
            return this.is_inbound;
        }

        public final void set_inbound(boolean z) {
            this.is_inbound = z;
        }

        public final Ticket getTicket() {
            return this.ticket;
        }

        public final void setTicket(Ticket ticket) {
            this.ticket = ticket;
        }

        public final ConversationUiFlags getUi_flags() {
            return this.ui_flags;
        }

        public final void setUi_flags(ConversationUiFlags conversationUiFlags) {
            this.ui_flags = conversationUiFlags;
        }

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public ConversationResponse build() {
            return new ConversationResponse(this);
        }
    }
}
