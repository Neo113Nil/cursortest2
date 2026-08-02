package com.zoho.livechat.android.modules.messages.data.local.entities;

import androidx.annotation.Keep;
import io.agora.rtc2.internal.AudioRoutingController;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\bC\b\u0087\b\u0018\u00002\u00020\u0001:\u0001cB©\u0002\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0017HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010O\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010P\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0017HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010U\u001a\u00020!HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010=J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003JÆ\u0002\u0010]\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00172\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010 \u001a\u00020!HÆ\u0001¢\u0006\u0002\u0010^J\u0013\u0010_\u001a\u00020\u00172\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010a\u001a\u00020\u000bHÖ\u0001J\t\u0010b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010+R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u001b\u0010,R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u001a\u0010,R\u0016\u0010\u001e\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010+R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u0019\u0010,R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b5\u0010,R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0016\u0010 \u001a\u00020!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010$¨\u0006d"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/data/local/entities/MessageEntity;", "", "acknowledgementKey", "", "conversationId", "chatId", "rChatId", "sequenceId", "", "messageType", "status", "", "messageId", "messageUID", "message", "formattedMessage", "markdowns", "sender", "displayName", "attachment", "meta", "respondedMessage", "isBot", "", "readStatus", "isTyping", "isEdited", "isDeleted", "replyTo", "timeDifferenceContent", "isRightAligned", "extras", "time", "Lcom/zoho/livechat/android/modules/messages/data/local/entities/MessageEntity$Time;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/zoho/livechat/android/modules/messages/data/local/entities/MessageEntity$Time;)V", "getAcknowledgementKey", "()Ljava/lang/String;", "getAttachment", "getChatId", "getConversationId", "getDisplayName", "getExtras", "getFormattedMessage", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMarkdowns", "getMessage", "getMessageId", "getMessageType", "getMessageUID", "getMeta", "getRChatId", "getReadStatus", "getReplyTo", "getRespondedMessage", "getSender", "getSequenceId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTime", "()Lcom/zoho/livechat/android/modules/messages/data/local/entities/MessageEntity$Time;", "getTimeDifferenceContent", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/zoho/livechat/android/modules/messages/data/local/entities/MessageEntity$Time;)Lcom/zoho/livechat/android/modules/messages/data/local/entities/MessageEntity;", "equals", "other", "hashCode", "toString", "Time", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MessageEntity {

    @Nullable
    private final String acknowledgementKey;

    @Nullable
    private final String attachment;

    @NotNull
    private final String chatId;

    @Nullable
    private final String conversationId;

    @Nullable
    private final String displayName;

    @Nullable
    private final String extras;

    @Nullable
    private final String formattedMessage;
    private final boolean isBot;

    @Nullable
    private final Boolean isDeleted;

    @Nullable
    private final Boolean isEdited;
    private final boolean isRightAligned;

    @Nullable
    private final Boolean isTyping;

    @Nullable
    private final String markdowns;

    @Nullable
    private final String message;

    @NotNull
    private final String messageId;

    @Nullable
    private final String messageType;

    @NotNull
    private final String messageUID;

    @Nullable
    private final String meta;

    @Nullable
    private final String rChatId;

    @Nullable
    private final Boolean readStatus;

    @Nullable
    private final String replyTo;

    @Nullable
    private final String respondedMessage;

    @Nullable
    private final String sender;

    @Nullable
    private final Long sequenceId;

    @Nullable
    private final Integer status;

    @NotNull
    private final Time time;

    @Nullable
    private final String timeDifferenceContent;

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/zoho/livechat/android/modules/messages/data/local/entities/MessageEntity$Time;", "", "serverTime", "", "clientTime", "previousMessageTime", "editedTime", "deletedTime", "formattedClientTime", "", "(JJJJJLjava/lang/String;)V", "getClientTime", "()J", "getDeletedTime", "getEditedTime", "getFormattedClientTime", "()Ljava/lang/String;", "getPreviousMessageTime", "getServerTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Time {
        private final long clientTime;
        private final long deletedTime;
        private final long editedTime;

        @Nullable
        private final String formattedClientTime;
        private final long previousMessageTime;
        private final long serverTime;

        public Time() {
            this(0L, 0L, 0L, 0L, 0L, null, 63, null);
        }

        public static /* synthetic */ Time copy$default(Time time, long j10, long j11, long j12, long j13, long j14, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = time.serverTime;
            }
            return time.copy(j10, (i10 & 2) != 0 ? time.clientTime : j11, (i10 & 4) != 0 ? time.previousMessageTime : j12, (i10 & 8) != 0 ? time.editedTime : j13, (i10 & 16) != 0 ? time.deletedTime : j14, (i10 & 32) != 0 ? time.formattedClientTime : str);
        }

        /* renamed from: component1, reason: from getter */
        public final long getServerTime() {
            return this.serverTime;
        }

        /* renamed from: component2, reason: from getter */
        public final long getClientTime() {
            return this.clientTime;
        }

        /* renamed from: component3, reason: from getter */
        public final long getPreviousMessageTime() {
            return this.previousMessageTime;
        }

        /* renamed from: component4, reason: from getter */
        public final long getEditedTime() {
            return this.editedTime;
        }

        /* renamed from: component5, reason: from getter */
        public final long getDeletedTime() {
            return this.deletedTime;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getFormattedClientTime() {
            return this.formattedClientTime;
        }

        @NotNull
        public final Time copy(long serverTime, long clientTime, long previousMessageTime, long editedTime, long deletedTime, @Nullable String formattedClientTime) {
            return new Time(serverTime, clientTime, previousMessageTime, editedTime, deletedTime, formattedClientTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Time)) {
                return false;
            }
            Time time = (Time) other;
            return this.serverTime == time.serverTime && this.clientTime == time.clientTime && this.previousMessageTime == time.previousMessageTime && this.editedTime == time.editedTime && this.deletedTime == time.deletedTime && Intrinsics.areEqual(this.formattedClientTime, time.formattedClientTime);
        }

        public final long getClientTime() {
            return this.clientTime;
        }

        public final long getDeletedTime() {
            return this.deletedTime;
        }

        public final long getEditedTime() {
            return this.editedTime;
        }

        @Nullable
        public final String getFormattedClientTime() {
            return this.formattedClientTime;
        }

        public final long getPreviousMessageTime() {
            return this.previousMessageTime;
        }

        public final long getServerTime() {
            return this.serverTime;
        }

        public int hashCode() {
            int hashCode = ((((((((Long.hashCode(this.serverTime) * 31) + Long.hashCode(this.clientTime)) * 31) + Long.hashCode(this.previousMessageTime)) * 31) + Long.hashCode(this.editedTime)) * 31) + Long.hashCode(this.deletedTime)) * 31;
            String str = this.formattedClientTime;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "Time(serverTime=" + this.serverTime + ", clientTime=" + this.clientTime + ", previousMessageTime=" + this.previousMessageTime + ", editedTime=" + this.editedTime + ", deletedTime=" + this.deletedTime + ", formattedClientTime=" + this.formattedClientTime + ')';
        }

        public Time(long j10, long j11, long j12, long j13, long j14, @Nullable String str) {
            this.serverTime = j10;
            this.clientTime = j11;
            this.previousMessageTime = j12;
            this.editedTime = j13;
            this.deletedTime = j14;
            this.formattedClientTime = str;
        }

        public /* synthetic */ Time(long j10, long j11, long j12, long j13, long j14, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? -1L : j10, (i10 & 2) != 0 ? -1L : j11, (i10 & 4) != 0 ? -1L : j12, (i10 & 8) != 0 ? -1L : j13, (i10 & 16) != 0 ? -1L : j14, (i10 & 32) != 0 ? null : str);
        }
    }

    public MessageEntity(@Nullable String str, @Nullable String str2, @NotNull String chatId, @Nullable String str3, @Nullable Long l10, @Nullable String str4, @Nullable Integer num, @NotNull String messageId, @NotNull String messageUID, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str13, @Nullable String str14, boolean z11, @Nullable String str15, @NotNull Time time) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(messageUID, "messageUID");
        Intrinsics.checkNotNullParameter(time, "time");
        this.acknowledgementKey = str;
        this.conversationId = str2;
        this.chatId = chatId;
        this.rChatId = str3;
        this.sequenceId = l10;
        this.messageType = str4;
        this.status = num;
        this.messageId = messageId;
        this.messageUID = messageUID;
        this.message = str5;
        this.formattedMessage = str6;
        this.markdowns = str7;
        this.sender = str8;
        this.displayName = str9;
        this.attachment = str10;
        this.meta = str11;
        this.respondedMessage = str12;
        this.isBot = z10;
        this.readStatus = bool;
        this.isTyping = bool2;
        this.isEdited = bool3;
        this.isDeleted = bool4;
        this.replyTo = str13;
        this.timeDifferenceContent = str14;
        this.isRightAligned = z11;
        this.extras = str15;
        this.time = time;
    }

    public static /* synthetic */ MessageEntity copy$default(MessageEntity messageEntity, String str, String str2, String str3, String str4, Long l10, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str16, String str17, boolean z11, String str18, Time time, int i10, Object obj) {
        Time time2;
        String str19;
        String str20 = (i10 & 1) != 0 ? messageEntity.acknowledgementKey : str;
        String str21 = (i10 & 2) != 0 ? messageEntity.conversationId : str2;
        String str22 = (i10 & 4) != 0 ? messageEntity.chatId : str3;
        String str23 = (i10 & 8) != 0 ? messageEntity.rChatId : str4;
        Long l11 = (i10 & 16) != 0 ? messageEntity.sequenceId : l10;
        String str24 = (i10 & 32) != 0 ? messageEntity.messageType : str5;
        Integer num2 = (i10 & 64) != 0 ? messageEntity.status : num;
        String str25 = (i10 & 128) != 0 ? messageEntity.messageId : str6;
        String str26 = (i10 & 256) != 0 ? messageEntity.messageUID : str7;
        String str27 = (i10 & 512) != 0 ? messageEntity.message : str8;
        String str28 = (i10 & 1024) != 0 ? messageEntity.formattedMessage : str9;
        String str29 = (i10 & 2048) != 0 ? messageEntity.markdowns : str10;
        String str30 = (i10 & 4096) != 0 ? messageEntity.sender : str11;
        String str31 = (i10 & 8192) != 0 ? messageEntity.displayName : str12;
        String str32 = str20;
        String str33 = (i10 & 16384) != 0 ? messageEntity.attachment : str13;
        String str34 = (i10 & 32768) != 0 ? messageEntity.meta : str14;
        String str35 = (i10 & PKIFailureInfo.notAuthorized) != 0 ? messageEntity.respondedMessage : str15;
        boolean z12 = (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? messageEntity.isBot : z10;
        Boolean bool5 = (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? messageEntity.readStatus : bool;
        Boolean bool6 = (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? messageEntity.isTyping : bool2;
        Boolean bool7 = (i10 & PKIFailureInfo.badCertTemplate) != 0 ? messageEntity.isEdited : bool3;
        Boolean bool8 = (i10 & PKIFailureInfo.badSenderNonce) != 0 ? messageEntity.isDeleted : bool4;
        String str36 = (i10 & 4194304) != 0 ? messageEntity.replyTo : str16;
        String str37 = (i10 & 8388608) != 0 ? messageEntity.timeDifferenceContent : str17;
        boolean z13 = (i10 & 16777216) != 0 ? messageEntity.isRightAligned : z11;
        String str38 = (i10 & 33554432) != 0 ? messageEntity.extras : str18;
        if ((i10 & AudioRoutingController.DEVICE_OUT_USB_HEADSET) != 0) {
            str19 = str38;
            time2 = messageEntity.time;
        } else {
            time2 = time;
            str19 = str38;
        }
        return messageEntity.copy(str32, str21, str22, str23, l11, str24, num2, str25, str26, str27, str28, str29, str30, str31, str33, str34, str35, z12, bool5, bool6, bool7, bool8, str36, str37, z13, str19, time2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAcknowledgementKey() {
        return this.acknowledgementKey;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getFormattedMessage() {
        return this.formattedMessage;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getMarkdowns() {
        return this.markdowns;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getSender() {
        return this.sender;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getAttachment() {
        return this.attachment;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getMeta() {
        return this.meta;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getRespondedMessage() {
        return this.respondedMessage;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsBot() {
        return this.isBot;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Boolean getReadStatus() {
        return this.readStatus;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Boolean getIsTyping() {
        return this.isTyping;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Boolean getIsEdited() {
        return this.isEdited;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Boolean getIsDeleted() {
        return this.isDeleted;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final String getReplyTo() {
        return this.replyTo;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final String getTimeDifferenceContent() {
        return this.timeDifferenceContent;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsRightAligned() {
        return this.isRightAligned;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final String getExtras() {
        return this.extras;
    }

    @NotNull
    /* renamed from: component27, reason: from getter */
    public final Time getTime() {
        return this.time;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getRChatId() {
        return this.rChatId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getSequenceId() {
        return this.sequenceId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getMessageUID() {
        return this.messageUID;
    }

    @NotNull
    public final MessageEntity copy(@Nullable String acknowledgementKey, @Nullable String conversationId, @NotNull String chatId, @Nullable String rChatId, @Nullable Long sequenceId, @Nullable String messageType, @Nullable Integer status, @NotNull String messageId, @NotNull String messageUID, @Nullable String message, @Nullable String formattedMessage, @Nullable String markdowns, @Nullable String sender, @Nullable String displayName, @Nullable String attachment, @Nullable String meta, @Nullable String respondedMessage, boolean isBot, @Nullable Boolean readStatus, @Nullable Boolean isTyping, @Nullable Boolean isEdited, @Nullable Boolean isDeleted, @Nullable String replyTo, @Nullable String timeDifferenceContent, boolean isRightAligned, @Nullable String extras, @NotNull Time time) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(messageUID, "messageUID");
        Intrinsics.checkNotNullParameter(time, "time");
        return new MessageEntity(acknowledgementKey, conversationId, chatId, rChatId, sequenceId, messageType, status, messageId, messageUID, message, formattedMessage, markdowns, sender, displayName, attachment, meta, respondedMessage, isBot, readStatus, isTyping, isEdited, isDeleted, replyTo, timeDifferenceContent, isRightAligned, extras, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageEntity)) {
            return false;
        }
        MessageEntity messageEntity = (MessageEntity) other;
        return Intrinsics.areEqual(this.acknowledgementKey, messageEntity.acknowledgementKey) && Intrinsics.areEqual(this.conversationId, messageEntity.conversationId) && Intrinsics.areEqual(this.chatId, messageEntity.chatId) && Intrinsics.areEqual(this.rChatId, messageEntity.rChatId) && Intrinsics.areEqual(this.sequenceId, messageEntity.sequenceId) && Intrinsics.areEqual(this.messageType, messageEntity.messageType) && Intrinsics.areEqual(this.status, messageEntity.status) && Intrinsics.areEqual(this.messageId, messageEntity.messageId) && Intrinsics.areEqual(this.messageUID, messageEntity.messageUID) && Intrinsics.areEqual(this.message, messageEntity.message) && Intrinsics.areEqual(this.formattedMessage, messageEntity.formattedMessage) && Intrinsics.areEqual(this.markdowns, messageEntity.markdowns) && Intrinsics.areEqual(this.sender, messageEntity.sender) && Intrinsics.areEqual(this.displayName, messageEntity.displayName) && Intrinsics.areEqual(this.attachment, messageEntity.attachment) && Intrinsics.areEqual(this.meta, messageEntity.meta) && Intrinsics.areEqual(this.respondedMessage, messageEntity.respondedMessage) && this.isBot == messageEntity.isBot && Intrinsics.areEqual(this.readStatus, messageEntity.readStatus) && Intrinsics.areEqual(this.isTyping, messageEntity.isTyping) && Intrinsics.areEqual(this.isEdited, messageEntity.isEdited) && Intrinsics.areEqual(this.isDeleted, messageEntity.isDeleted) && Intrinsics.areEqual(this.replyTo, messageEntity.replyTo) && Intrinsics.areEqual(this.timeDifferenceContent, messageEntity.timeDifferenceContent) && this.isRightAligned == messageEntity.isRightAligned && Intrinsics.areEqual(this.extras, messageEntity.extras) && Intrinsics.areEqual(this.time, messageEntity.time);
    }

    @Nullable
    public final String getAcknowledgementKey() {
        return this.acknowledgementKey;
    }

    @Nullable
    public final String getAttachment() {
        return this.attachment;
    }

    @NotNull
    public final String getChatId() {
        return this.chatId;
    }

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final String getExtras() {
        return this.extras;
    }

    @Nullable
    public final String getFormattedMessage() {
        return this.formattedMessage;
    }

    @Nullable
    public final String getMarkdowns() {
        return this.markdowns;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final String getMessageType() {
        return this.messageType;
    }

    @NotNull
    public final String getMessageUID() {
        return this.messageUID;
    }

    @Nullable
    public final String getMeta() {
        return this.meta;
    }

    @Nullable
    public final String getRChatId() {
        return this.rChatId;
    }

    @Nullable
    public final Boolean getReadStatus() {
        return this.readStatus;
    }

    @Nullable
    public final String getReplyTo() {
        return this.replyTo;
    }

    @Nullable
    public final String getRespondedMessage() {
        return this.respondedMessage;
    }

    @Nullable
    public final String getSender() {
        return this.sender;
    }

    @Nullable
    public final Long getSequenceId() {
        return this.sequenceId;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @NotNull
    public final Time getTime() {
        return this.time;
    }

    @Nullable
    public final String getTimeDifferenceContent() {
        return this.timeDifferenceContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.acknowledgementKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.conversationId;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.chatId.hashCode()) * 31;
        String str3 = this.rChatId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.sequenceId;
        int hashCode4 = (hashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str4 = this.messageType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.status;
        int hashCode6 = (((((hashCode5 + (num == null ? 0 : num.hashCode())) * 31) + this.messageId.hashCode()) * 31) + this.messageUID.hashCode()) * 31;
        String str5 = this.message;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.formattedMessage;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.markdowns;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sender;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.displayName;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.attachment;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.meta;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.respondedMessage;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        boolean z10 = this.isBot;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode14 + i10) * 31;
        Boolean bool = this.readStatus;
        int hashCode15 = (i11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isTyping;
        int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isEdited;
        int hashCode17 = (hashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isDeleted;
        int hashCode18 = (hashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str13 = this.replyTo;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.timeDifferenceContent;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        boolean z11 = this.isRightAligned;
        int i12 = (hashCode20 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        String str15 = this.extras;
        return ((i12 + (str15 != null ? str15.hashCode() : 0)) * 31) + this.time.hashCode();
    }

    public final boolean isBot() {
        return this.isBot;
    }

    @Nullable
    public final Boolean isDeleted() {
        return this.isDeleted;
    }

    @Nullable
    public final Boolean isEdited() {
        return this.isEdited;
    }

    public final boolean isRightAligned() {
        return this.isRightAligned;
    }

    @Nullable
    public final Boolean isTyping() {
        return this.isTyping;
    }

    @NotNull
    public String toString() {
        return "MessageEntity(acknowledgementKey=" + this.acknowledgementKey + ", conversationId=" + this.conversationId + ", chatId=" + this.chatId + ", rChatId=" + this.rChatId + ", sequenceId=" + this.sequenceId + ", messageType=" + this.messageType + ", status=" + this.status + ", messageId=" + this.messageId + ", messageUID=" + this.messageUID + ", message=" + this.message + ", formattedMessage=" + this.formattedMessage + ", markdowns=" + this.markdowns + ", sender=" + this.sender + ", displayName=" + this.displayName + ", attachment=" + this.attachment + ", meta=" + this.meta + ", respondedMessage=" + this.respondedMessage + ", isBot=" + this.isBot + ", readStatus=" + this.readStatus + ", isTyping=" + this.isTyping + ", isEdited=" + this.isEdited + ", isDeleted=" + this.isDeleted + ", replyTo=" + this.replyTo + ", timeDifferenceContent=" + this.timeDifferenceContent + ", isRightAligned=" + this.isRightAligned + ", extras=" + this.extras + ", time=" + this.time + ')';
    }

    public /* synthetic */ MessageEntity(String str, String str2, String str3, String str4, Long l10, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str16, String str17, boolean z11, String str18, Time time, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : l10, str5, num, str6, str7, str8, (i10 & 1024) != 0 ? null : str9, (i10 & 2048) != 0 ? null : str10, str11, str12, (i10 & 16384) != 0 ? null : str13, (32768 & i10) != 0 ? null : str14, (65536 & i10) != 0 ? null : str15, (131072 & i10) != 0 ? false : z10, (262144 & i10) != 0 ? null : bool, (524288 & i10) != 0 ? null : bool2, (1048576 & i10) != 0 ? null : bool3, (2097152 & i10) != 0 ? null : bool4, (4194304 & i10) != 0 ? null : str16, (8388608 & i10) != 0 ? null : str17, (16777216 & i10) != 0 ? false : z11, (i10 & 33554432) != 0 ? null : str18, time);
    }
}
