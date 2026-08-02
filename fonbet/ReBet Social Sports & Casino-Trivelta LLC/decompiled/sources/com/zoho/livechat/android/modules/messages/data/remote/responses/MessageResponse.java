package com.zoho.livechat.android.modules.messages.data.remote.responses;

import Gb.c;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.gson.h;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.modules.brand.data.remote.entities.FormResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001:\u0002NOB§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b+\u0010)J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0000HÆ\u0003¢\u0006\u0004\b.\u0010/JÀ\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0000HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u001aJ\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\bA\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\bB\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bC\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\b\u0012\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\b\u0013\u0010)R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\bJ\u0010 R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\bK\u0010 R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\bM\u0010/¨\u0006P"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse;", "", "", "messageUID", "", "serverTime", "Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Sender;", "sender", "sequenceId", "type", "messageId", "lastMessageTime", "Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message;", "message", "Lcom/google/gson/h;", "meta", "", "readStatus", "isEdited", "isDeleted", "editedTime", "deletedTime", "replyTo", "<init>", "(Ljava/lang/String;JLcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Sender;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message;Lcom/google/gson/h;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Sender;", "component4", "()Ljava/lang/Long;", "component5", "component6", "component7", "component8", "()Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message;", "component9", "()Lcom/google/gson/h;", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "component13", "component14", "component15", "()Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse;", "copy", "(Ljava/lang/String;JLcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Sender;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message;Lcom/google/gson/h;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse;)Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessageUID", "J", "getServerTime", "Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Sender;", "getSender", "Ljava/lang/Long;", "getSequenceId", "getType", "getMessageId", "getLastMessageTime", "Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message;", "getMessage", "Lcom/google/gson/h;", "getMeta", "Ljava/lang/Boolean;", "getReadStatus", "getEditedTime", "getDeletedTime", "Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse;", "getReplyTo", "Message", "Sender", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MessageResponse {

    @c("deleted_time")
    @Nullable
    private final Long deletedTime;

    @c("edited_time")
    @Nullable
    private final Long editedTime;

    @c(EventKeys.DELETED)
    @Nullable
    private final Boolean isDeleted;

    @c("edited")
    @Nullable
    private final Boolean isEdited;

    @c("last_message_time")
    @Nullable
    private final Long lastMessageTime;

    @c("message")
    @Nullable
    private final Message message;

    @c("client_message_id")
    @Nullable
    private final String messageId;

    @c(StackTraceHelper.ID_KEY)
    @NotNull
    private final String messageUID;

    @c("meta")
    @Nullable
    private final h meta;

    @c("is_read")
    @Nullable
    private final Boolean readStatus;

    @c("reply_to")
    @Nullable
    private final MessageResponse replyTo;

    @c("sender")
    @Nullable
    private final Sender sender;

    @c("sequence_id")
    @Nullable
    private final Long sequenceId;

    @c("time")
    private final long serverTime;

    @c("type")
    @Nullable
    private final String type;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Sender;", "", StackTraceHelper.ID_KEY, "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Sender {

        @c(StackTraceHelper.ID_KEY)
        @Nullable
        private final String id;

        @c("name")
        @Nullable
        private final String name;

        public Sender(@Nullable String str, @Nullable String str2) {
            this.id = str;
            this.name = str2;
        }

        public static /* synthetic */ Sender copy$default(Sender sender, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sender.id;
            }
            if ((i10 & 2) != 0) {
                str2 = sender.name;
            }
            return sender.copy(str, str2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Sender copy(@Nullable String id2, @Nullable String name) {
            return new Sender(id2, name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sender)) {
                return false;
            }
            Sender sender = (Sender) other;
            return Intrinsics.areEqual(this.id, sender.id) && Intrinsics.areEqual(this.name, sender.name);
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Sender(id=" + this.id + ", name=" + this.name + ')';
        }
    }

    public MessageResponse(@NotNull String messageUID, long j10, @Nullable Sender sender, @Nullable Long l10, @Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Message message, @Nullable h hVar, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Long l12, @Nullable Long l13, @Nullable MessageResponse messageResponse) {
        Intrinsics.checkNotNullParameter(messageUID, "messageUID");
        this.messageUID = messageUID;
        this.serverTime = j10;
        this.sender = sender;
        this.sequenceId = l10;
        this.type = str;
        this.messageId = str2;
        this.lastMessageTime = l11;
        this.message = message;
        this.meta = hVar;
        this.readStatus = bool;
        this.isEdited = bool2;
        this.isDeleted = bool3;
        this.editedTime = l12;
        this.deletedTime = l13;
        this.replyTo = messageResponse;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMessageUID() {
        return this.messageUID;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Boolean getReadStatus() {
        return this.readStatus;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Boolean getIsEdited() {
        return this.isEdited;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Boolean getIsDeleted() {
        return this.isDeleted;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Long getEditedTime() {
        return this.editedTime;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Long getDeletedTime() {
        return this.deletedTime;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final MessageResponse getReplyTo() {
        return this.replyTo;
    }

    /* renamed from: component2, reason: from getter */
    public final long getServerTime() {
        return this.serverTime;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Sender getSender() {
        return this.sender;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getSequenceId() {
        return this.sequenceId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Long getLastMessageTime() {
        return this.lastMessageTime;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final h getMeta() {
        return this.meta;
    }

    @NotNull
    public final MessageResponse copy(@NotNull String messageUID, long serverTime, @Nullable Sender sender, @Nullable Long sequenceId, @Nullable String type, @Nullable String messageId, @Nullable Long lastMessageTime, @Nullable Message message, @Nullable h meta, @Nullable Boolean readStatus, @Nullable Boolean isEdited, @Nullable Boolean isDeleted, @Nullable Long editedTime, @Nullable Long deletedTime, @Nullable MessageResponse replyTo) {
        Intrinsics.checkNotNullParameter(messageUID, "messageUID");
        return new MessageResponse(messageUID, serverTime, sender, sequenceId, type, messageId, lastMessageTime, message, meta, readStatus, isEdited, isDeleted, editedTime, deletedTime, replyTo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageResponse)) {
            return false;
        }
        MessageResponse messageResponse = (MessageResponse) other;
        return Intrinsics.areEqual(this.messageUID, messageResponse.messageUID) && this.serverTime == messageResponse.serverTime && Intrinsics.areEqual(this.sender, messageResponse.sender) && Intrinsics.areEqual(this.sequenceId, messageResponse.sequenceId) && Intrinsics.areEqual(this.type, messageResponse.type) && Intrinsics.areEqual(this.messageId, messageResponse.messageId) && Intrinsics.areEqual(this.lastMessageTime, messageResponse.lastMessageTime) && Intrinsics.areEqual(this.message, messageResponse.message) && Intrinsics.areEqual(this.meta, messageResponse.meta) && Intrinsics.areEqual(this.readStatus, messageResponse.readStatus) && Intrinsics.areEqual(this.isEdited, messageResponse.isEdited) && Intrinsics.areEqual(this.isDeleted, messageResponse.isDeleted) && Intrinsics.areEqual(this.editedTime, messageResponse.editedTime) && Intrinsics.areEqual(this.deletedTime, messageResponse.deletedTime) && Intrinsics.areEqual(this.replyTo, messageResponse.replyTo);
    }

    @Nullable
    public final Long getDeletedTime() {
        return this.deletedTime;
    }

    @Nullable
    public final Long getEditedTime() {
        return this.editedTime;
    }

    @Nullable
    public final Long getLastMessageTime() {
        return this.lastMessageTime;
    }

    @Nullable
    public final Message getMessage() {
        return this.message;
    }

    @Nullable
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final String getMessageUID() {
        return this.messageUID;
    }

    @Nullable
    public final h getMeta() {
        return this.meta;
    }

    @Nullable
    public final Boolean getReadStatus() {
        return this.readStatus;
    }

    @Nullable
    public final MessageResponse getReplyTo() {
        return this.replyTo;
    }

    @Nullable
    public final Sender getSender() {
        return this.sender;
    }

    @Nullable
    public final Long getSequenceId() {
        return this.sequenceId;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((this.messageUID.hashCode() * 31) + Long.hashCode(this.serverTime)) * 31;
        Sender sender = this.sender;
        int hashCode2 = (hashCode + (sender == null ? 0 : sender.hashCode())) * 31;
        Long l10 = this.sequenceId;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.type;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.messageId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.lastMessageTime;
        int hashCode6 = (hashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Message message = this.message;
        int hashCode7 = (hashCode6 + (message == null ? 0 : message.hashCode())) * 31;
        h hVar = this.meta;
        int hashCode8 = (hashCode7 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Boolean bool = this.readStatus;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isEdited;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isDeleted;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l12 = this.editedTime;
        int hashCode12 = (hashCode11 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.deletedTime;
        int hashCode13 = (hashCode12 + (l13 == null ? 0 : l13.hashCode())) * 31;
        MessageResponse messageResponse = this.replyTo;
        return hashCode13 + (messageResponse != null ? messageResponse.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDeleted() {
        return this.isDeleted;
    }

    @Nullable
    public final Boolean isEdited() {
        return this.isEdited;
    }

    @NotNull
    public String toString() {
        return "MessageResponse(messageUID=" + this.messageUID + ", serverTime=" + this.serverTime + ", sender=" + this.sender + ", sequenceId=" + this.sequenceId + ", type=" + this.type + ", messageId=" + this.messageId + ", lastMessageTime=" + this.lastMessageTime + ", message=" + this.message + ", meta=" + this.meta + ", readStatus=" + this.readStatus + ", isEdited=" + this.isEdited + ", isDeleted=" + this.isDeleted + ", editedTime=" + this.editedTime + ", deletedTime=" + this.deletedTime + ", replyTo=" + this.replyTo + ')';
    }

    public /* synthetic */ MessageResponse(String str, long j10, Sender sender, Long l10, String str2, String str3, Long l11, Message message, h hVar, Boolean bool, Boolean bool2, Boolean bool3, Long l12, Long l13, MessageResponse messageResponse, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? -1L : j10, sender, l10, str2, (i10 & 32) != 0 ? "" : str3, l11, message, hVar, bool, (i10 & 1024) != 0 ? null : bool2, (i10 & 2048) != 0 ? null : bool3, (i10 & 4096) != 0 ? null : l12, (i10 & 8192) != 0 ? null : l13, (i10 & 16384) != 0 ? null : messageResponse);
    }

    @Keep
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0001VBã\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001eJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001eJ\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001eJ\u0012\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b1\u0010\"J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\u001eJî\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001eJ\u0010\u00108\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b@\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\bA\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bD\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bE\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010F\u001a\u0004\bG\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010H\u001a\u0004\bI\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bJ\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bK\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bL\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bN\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\bO\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\bP\u0010\u001eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\bQ\u0010\u001eR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010B\u001a\u0004\bR\u0010\"R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010S\u001a\u0004\bT\u00103R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\bU\u0010\u001e¨\u0006W"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message;", "", "", "text", "message", "displayName", "Lcom/google/gson/h;", "file", "comment", "mode", "", "time", "Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message$User;", "operationUser", "userList", "transferTo", "formType", "", "messageStringResourceId", "joinUrl", "startUrl", "operation", "media", "", "Lcom/zoho/livechat/android/modules/brand/data/remote/entities/FormResponse$Message;", "messages", "transferMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message$User;Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message$User;Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message$User;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/h;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/google/gson/h;", "component5", "component6", "component7", "()Ljava/lang/Long;", "component8", "()Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message$User;", "component9", "component10", "component11", "component12", "()Ljava/lang/Integer;", "component13", "component14", "component15", "component16", "component17", "()Ljava/util/List;", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message$User;Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message$User;Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message$User;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/h;Ljava/util/List;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getMessage", "getDisplayName", "Lcom/google/gson/h;", "getFile", "getComment", "getMode", "Ljava/lang/Long;", "getTime", "Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message$User;", "getOperationUser", "getUserList", "getTransferTo", "getFormType", "Ljava/lang/Integer;", "getMessageStringResourceId", "getJoinUrl", "getStartUrl", "getOperation", "getMedia", "Ljava/util/List;", "getMessages", "getTransferMessage", "User", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Message {

        @c("comment")
        @Nullable
        private final String comment;

        @c("dname")
        @Nullable
        private final String displayName;

        @c("file")
        @Nullable
        private final h file;

        @c("form_type")
        @Nullable
        private final String formType;

        @c("join_url")
        @Nullable
        private final String joinUrl;

        @c("media")
        @Nullable
        private final h media;

        @c("message")
        @Nullable
        private final String message;

        @c("message_string_resource_id")
        @Nullable
        private final Integer messageStringResourceId;

        @c("msglist")
        @Nullable
        private final List<FormResponse.Message> messages;

        @c("mode")
        @Nullable
        private final String mode;

        @c(alternate = {"operation"}, value = "opr")
        @Nullable
        private final String operation;

        @c("operation_user")
        @Nullable
        private final User operationUser;

        @c("start_url")
        @Nullable
        private final String startUrl;

        @c("text")
        @Nullable
        private final String text;

        @c("time")
        @Nullable
        private final Long time;

        @c("transfer_message")
        @Nullable
        private final String transferMessage;

        @c("transfer_to")
        @Nullable
        private final User transferTo;

        @c("user_list")
        @Nullable
        private final User userList;

        @Keep
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/data/remote/responses/MessageResponse$Message$User;", "", "name", "", StackTraceHelper.ID_KEY, "imageFileKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getImageFileKey", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class User {

            @c(StackTraceHelper.ID_KEY)
            @Nullable
            private final String id;

            @c("image_file_key")
            @Nullable
            private final String imageFileKey;

            @c("name")
            @Nullable
            private final String name;

            public User(@Nullable String str, @Nullable String str2, @Nullable String str3) {
                this.name = str;
                this.id = str2;
                this.imageFileKey = str3;
            }

            public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = user.name;
                }
                if ((i10 & 2) != 0) {
                    str2 = user.id;
                }
                if ((i10 & 4) != 0) {
                    str3 = user.imageFileKey;
                }
                return user.copy(str, str2, str3);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @Nullable
            /* renamed from: component3, reason: from getter */
            public final String getImageFileKey() {
                return this.imageFileKey;
            }

            @NotNull
            public final User copy(@Nullable String name, @Nullable String id2, @Nullable String imageFileKey) {
                return new User(name, id2, imageFileKey);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof User)) {
                    return false;
                }
                User user = (User) other;
                return Intrinsics.areEqual(this.name, user.name) && Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.imageFileKey, user.imageFileKey);
            }

            @Nullable
            public final String getId() {
                return this.id;
            }

            @Nullable
            public final String getImageFileKey() {
                return this.imageFileKey;
            }

            @Nullable
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                String str = this.name;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.id;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.imageFileKey;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "User(name=" + this.name + ", id=" + this.id + ", imageFileKey=" + this.imageFileKey + ')';
            }
        }

        public Message(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable h hVar, @Nullable String str4, @Nullable String str5, @Nullable Long l10, @Nullable User user, @Nullable User user2, @Nullable User user3, @Nullable String str6, @Nullable Integer num, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable h hVar2, @Nullable List<FormResponse.Message> list, @Nullable String str10) {
            this.text = str;
            this.message = str2;
            this.displayName = str3;
            this.file = hVar;
            this.comment = str4;
            this.mode = str5;
            this.time = l10;
            this.operationUser = user;
            this.userList = user2;
            this.transferTo = user3;
            this.formType = str6;
            this.messageStringResourceId = num;
            this.joinUrl = str7;
            this.startUrl = str8;
            this.operation = str9;
            this.media = hVar2;
            this.messages = list;
            this.transferMessage = str10;
        }

        public static /* synthetic */ Message copy$default(Message message, String str, String str2, String str3, h hVar, String str4, String str5, Long l10, User user, User user2, User user3, String str6, Integer num, String str7, String str8, String str9, h hVar2, List list, String str10, int i10, Object obj) {
            String str11;
            List list2;
            String str12 = (i10 & 1) != 0 ? message.text : str;
            String str13 = (i10 & 2) != 0 ? message.message : str2;
            String str14 = (i10 & 4) != 0 ? message.displayName : str3;
            h hVar3 = (i10 & 8) != 0 ? message.file : hVar;
            String str15 = (i10 & 16) != 0 ? message.comment : str4;
            String str16 = (i10 & 32) != 0 ? message.mode : str5;
            Long l11 = (i10 & 64) != 0 ? message.time : l10;
            User user4 = (i10 & 128) != 0 ? message.operationUser : user;
            User user5 = (i10 & 256) != 0 ? message.userList : user2;
            User user6 = (i10 & 512) != 0 ? message.transferTo : user3;
            String str17 = (i10 & 1024) != 0 ? message.formType : str6;
            Integer num2 = (i10 & 2048) != 0 ? message.messageStringResourceId : num;
            String str18 = (i10 & 4096) != 0 ? message.joinUrl : str7;
            String str19 = (i10 & 8192) != 0 ? message.startUrl : str8;
            String str20 = str12;
            String str21 = (i10 & 16384) != 0 ? message.operation : str9;
            h hVar4 = (i10 & 32768) != 0 ? message.media : hVar2;
            List list3 = (i10 & PKIFailureInfo.notAuthorized) != 0 ? message.messages : list;
            if ((i10 & PKIFailureInfo.unsupportedVersion) != 0) {
                list2 = list3;
                str11 = message.transferMessage;
            } else {
                str11 = str10;
                list2 = list3;
            }
            return message.copy(str20, str13, str14, hVar3, str15, str16, l11, user4, user5, user6, str17, num2, str18, str19, str21, hVar4, list2, str11);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final User getTransferTo() {
            return this.transferTo;
        }

        @Nullable
        /* renamed from: component11, reason: from getter */
        public final String getFormType() {
            return this.formType;
        }

        @Nullable
        /* renamed from: component12, reason: from getter */
        public final Integer getMessageStringResourceId() {
            return this.messageStringResourceId;
        }

        @Nullable
        /* renamed from: component13, reason: from getter */
        public final String getJoinUrl() {
            return this.joinUrl;
        }

        @Nullable
        /* renamed from: component14, reason: from getter */
        public final String getStartUrl() {
            return this.startUrl;
        }

        @Nullable
        /* renamed from: component15, reason: from getter */
        public final String getOperation() {
            return this.operation;
        }

        @Nullable
        /* renamed from: component16, reason: from getter */
        public final h getMedia() {
            return this.media;
        }

        @Nullable
        public final List<FormResponse.Message> component17() {
            return this.messages;
        }

        @Nullable
        /* renamed from: component18, reason: from getter */
        public final String getTransferMessage() {
            return this.transferMessage;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final h getFile() {
            return this.file;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getComment() {
            return this.comment;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Long getTime() {
            return this.time;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final User getOperationUser() {
            return this.operationUser;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final User getUserList() {
            return this.userList;
        }

        @NotNull
        public final Message copy(@Nullable String text, @Nullable String message, @Nullable String displayName, @Nullable h file, @Nullable String comment, @Nullable String mode, @Nullable Long time, @Nullable User operationUser, @Nullable User userList, @Nullable User transferTo, @Nullable String formType, @Nullable Integer messageStringResourceId, @Nullable String joinUrl, @Nullable String startUrl, @Nullable String operation, @Nullable h media, @Nullable List<FormResponse.Message> messages, @Nullable String transferMessage) {
            return new Message(text, message, displayName, file, comment, mode, time, operationUser, userList, transferTo, formType, messageStringResourceId, joinUrl, startUrl, operation, media, messages, transferMessage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Message)) {
                return false;
            }
            Message message = (Message) other;
            return Intrinsics.areEqual(this.text, message.text) && Intrinsics.areEqual(this.message, message.message) && Intrinsics.areEqual(this.displayName, message.displayName) && Intrinsics.areEqual(this.file, message.file) && Intrinsics.areEqual(this.comment, message.comment) && Intrinsics.areEqual(this.mode, message.mode) && Intrinsics.areEqual(this.time, message.time) && Intrinsics.areEqual(this.operationUser, message.operationUser) && Intrinsics.areEqual(this.userList, message.userList) && Intrinsics.areEqual(this.transferTo, message.transferTo) && Intrinsics.areEqual(this.formType, message.formType) && Intrinsics.areEqual(this.messageStringResourceId, message.messageStringResourceId) && Intrinsics.areEqual(this.joinUrl, message.joinUrl) && Intrinsics.areEqual(this.startUrl, message.startUrl) && Intrinsics.areEqual(this.operation, message.operation) && Intrinsics.areEqual(this.media, message.media) && Intrinsics.areEqual(this.messages, message.messages) && Intrinsics.areEqual(this.transferMessage, message.transferMessage);
        }

        @Nullable
        public final String getComment() {
            return this.comment;
        }

        @Nullable
        public final String getDisplayName() {
            return this.displayName;
        }

        @Nullable
        public final h getFile() {
            return this.file;
        }

        @Nullable
        public final String getFormType() {
            return this.formType;
        }

        @Nullable
        public final String getJoinUrl() {
            return this.joinUrl;
        }

        @Nullable
        public final h getMedia() {
            return this.media;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final Integer getMessageStringResourceId() {
            return this.messageStringResourceId;
        }

        @Nullable
        public final List<FormResponse.Message> getMessages() {
            return this.messages;
        }

        @Nullable
        public final String getMode() {
            return this.mode;
        }

        @Nullable
        public final String getOperation() {
            return this.operation;
        }

        @Nullable
        public final User getOperationUser() {
            return this.operationUser;
        }

        @Nullable
        public final String getStartUrl() {
            return this.startUrl;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final Long getTime() {
            return this.time;
        }

        @Nullable
        public final String getTransferMessage() {
            return this.transferMessage;
        }

        @Nullable
        public final User getTransferTo() {
            return this.transferTo;
        }

        @Nullable
        public final User getUserList() {
            return this.userList;
        }

        public int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.displayName;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            h hVar = this.file;
            int hashCode4 = (hashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            String str4 = this.comment;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.mode;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Long l10 = this.time;
            int hashCode7 = (hashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
            User user = this.operationUser;
            int hashCode8 = (hashCode7 + (user == null ? 0 : user.hashCode())) * 31;
            User user2 = this.userList;
            int hashCode9 = (hashCode8 + (user2 == null ? 0 : user2.hashCode())) * 31;
            User user3 = this.transferTo;
            int hashCode10 = (hashCode9 + (user3 == null ? 0 : user3.hashCode())) * 31;
            String str6 = this.formType;
            int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num = this.messageStringResourceId;
            int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
            String str7 = this.joinUrl;
            int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.startUrl;
            int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.operation;
            int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
            h hVar2 = this.media;
            int hashCode16 = (hashCode15 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
            List<FormResponse.Message> list = this.messages;
            int hashCode17 = (hashCode16 + (list == null ? 0 : list.hashCode())) * 31;
            String str10 = this.transferMessage;
            return hashCode17 + (str10 != null ? str10.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Message(text=" + this.text + ", message=" + this.message + ", displayName=" + this.displayName + ", file=" + this.file + ", comment=" + this.comment + ", mode=" + this.mode + ", time=" + this.time + ", operationUser=" + this.operationUser + ", userList=" + this.userList + ", transferTo=" + this.transferTo + ", formType=" + this.formType + ", messageStringResourceId=" + this.messageStringResourceId + ", joinUrl=" + this.joinUrl + ", startUrl=" + this.startUrl + ", operation=" + this.operation + ", media=" + this.media + ", messages=" + this.messages + ", transferMessage=" + this.transferMessage + ')';
        }

        public /* synthetic */ Message(String str, String str2, String str3, h hVar, String str4, String str5, Long l10, User user, User user2, User user3, String str6, Integer num, String str7, String str8, String str9, h hVar2, List list, String str10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : hVar, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : l10, (i10 & 128) != 0 ? null : user, (i10 & 256) != 0 ? null : user2, (i10 & 512) != 0 ? null : user3, (i10 & 1024) != 0 ? null : str6, (i10 & 2048) != 0 ? null : num, (i10 & 4096) != 0 ? null : str7, (i10 & 8192) != 0 ? null : str8, (i10 & 16384) != 0 ? null : str9, (i10 & 32768) != 0 ? null : hVar2, (i10 & PKIFailureInfo.notAuthorized) != 0 ? null : list, (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? null : str10);
        }
    }
}
