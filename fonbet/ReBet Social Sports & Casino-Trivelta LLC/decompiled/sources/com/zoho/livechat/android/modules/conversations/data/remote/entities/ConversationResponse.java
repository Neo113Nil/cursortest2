package com.zoho.livechat.android.modules.conversations.data.remote.entities;

import Gb.c;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.modules.calls.data.model.MediaResponse;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005`abcdBß\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010!J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010>J\u000b\u0010M\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010W\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010X\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0094\u0002\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\u00020\u001b2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020^HÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b,\u0010'R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b1\u0010'R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010#¨\u0006e"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse;", "", "acknowledgementKey", "", "attender", "Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Attender;", "chatId", "chatStatus", "Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$ChatStatus;", "department", "Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Department;", StackTraceHelper.ID_KEY, "currentPosition", "", "lastModifiedTime", "mediaData", "Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse;", "averageResponseTime", "question", "referenceId", "startTime", "missedTime", "endTime", "timeDifference", "type", "Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Type;", "unreadChats", "", "visitor", "Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Visitor;", "wmsChatId", "queueType", "module", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Attender;Ljava/lang/String;Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$ChatStatus;Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Department;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Type;Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Visitor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcknowledgementKey", "()Ljava/lang/String;", "getAttender", "()Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Attender;", "getAverageResponseTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getChatId", "getChatStatus", "()Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$ChatStatus;", "getCurrentPosition", "getDepartment", "()Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Department;", "getEndTime", "getId", "getLastModifiedTime", "getMediaData", "()Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse;", "getMissedTime", "getModule", "getQuestion", "getQueueType", "getReferenceId", "getStartTime", "getTimeDifference", "getType", "()Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Type;", "getUnreadChats", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVisitor", "()Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Visitor;", "getWmsChatId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Attender;Ljava/lang/String;Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$ChatStatus;Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Department;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Type;Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Visitor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse;", "equals", "other", "hashCode", "", "toString", "Attender", "ChatStatus", "Department", "Type", "Visitor", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ConversationResponse {

    @c("ack_key")
    @Nullable
    private final String acknowledgementKey;

    @c("attender")
    @Nullable
    private final Attender attender;

    @c("average_response_time")
    @Nullable
    private final Long averageResponseTime;

    @c("chat_id")
    @Nullable
    private final String chatId;

    @c("chat_status")
    @Nullable
    private final ChatStatus chatStatus;

    @c("current_position")
    @Nullable
    private final Long currentPosition;

    @c("department")
    @Nullable
    private final Department department;

    @c("end_time")
    @Nullable
    private final String endTime;

    @c(StackTraceHelper.ID_KEY)
    @NotNull
    private final String id;

    @c("last_modified_time")
    @Nullable
    private final Long lastModifiedTime;

    @c("media_data")
    @Nullable
    private final MediaResponse mediaData;

    @c("missed_time")
    @Nullable
    private final String missedTime;

    @c("module")
    @Nullable
    private final String module;

    @c("question")
    @Nullable
    private final String question;

    @c("queue_type")
    @Nullable
    private final String queueType;

    @c("reference_id")
    @Nullable
    private final String referenceId;

    @c("start_time")
    @Nullable
    private final String startTime;

    @c("time_difference")
    @Nullable
    private final String timeDifference;

    @c("type")
    @Nullable
    private final Type type;

    @c("unread_chats")
    @Nullable
    private final Boolean unreadChats;

    @c("visitor")
    @Nullable
    private final Visitor visitor;

    @c("wms_chat_id")
    @Nullable
    private final String wmsChatId;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJJ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0006\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Attender;", "", StackTraceHelper.ID_KEY, "", "name", "imageKey", "isBot", "", "callEnabled", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCallEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "()Ljava/lang/String;", "getImageKey", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Attender;", "equals", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Attender {

        @c("call_enabled")
        @Nullable
        private final Boolean callEnabled;

        @c(StackTraceHelper.ID_KEY)
        @Nullable
        private final String id;

        @c("image_key")
        @Nullable
        private final String imageKey;

        @c("is_bot")
        @Nullable
        private final Boolean isBot;

        @c("name")
        @Nullable
        private final String name;

        public Attender(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2) {
            this.id = str;
            this.name = str2;
            this.imageKey = str3;
            this.isBot = bool;
            this.callEnabled = bool2;
        }

        public static /* synthetic */ Attender copy$default(Attender attender, String str, String str2, String str3, Boolean bool, Boolean bool2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = attender.id;
            }
            if ((i10 & 2) != 0) {
                str2 = attender.name;
            }
            if ((i10 & 4) != 0) {
                str3 = attender.imageKey;
            }
            if ((i10 & 8) != 0) {
                bool = attender.isBot;
            }
            if ((i10 & 16) != 0) {
                bool2 = attender.callEnabled;
            }
            Boolean bool3 = bool2;
            String str4 = str3;
            return attender.copy(str, str2, str4, bool, bool3);
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

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getImageKey() {
            return this.imageKey;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Boolean getIsBot() {
            return this.isBot;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Boolean getCallEnabled() {
            return this.callEnabled;
        }

        @NotNull
        public final Attender copy(@Nullable String id2, @Nullable String name, @Nullable String imageKey, @Nullable Boolean isBot, @Nullable Boolean callEnabled) {
            return new Attender(id2, name, imageKey, isBot, callEnabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attender)) {
                return false;
            }
            Attender attender = (Attender) other;
            return Intrinsics.areEqual(this.id, attender.id) && Intrinsics.areEqual(this.name, attender.name) && Intrinsics.areEqual(this.imageKey, attender.imageKey) && Intrinsics.areEqual(this.isBot, attender.isBot) && Intrinsics.areEqual(this.callEnabled, attender.callEnabled);
        }

        @Nullable
        public final Boolean getCallEnabled() {
            return this.callEnabled;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getImageKey() {
            return this.imageKey;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.imageKey;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.isBot;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.callEnabled;
            return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Nullable
        public final Boolean isBot() {
            return this.isBot;
        }

        @NotNull
        public String toString() {
            return "Attender(id=" + this.id + ", name=" + this.name + ", imageKey=" + this.imageKey + ", isBot=" + this.isBot + ", callEnabled=" + this.callEnabled + ')';
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$ChatStatus;", "", "state", "", "stateKey", "", "statusCode", "statusKey", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getState", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStateKey", "()Ljava/lang/String;", "getStatusCode", "getStatusKey", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$ChatStatus;", "equals", "", "other", "hashCode", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChatStatus {

        @c("state")
        @Nullable
        private final Integer state;

        @c("state_key")
        @Nullable
        private final String stateKey;

        @c("status_code")
        @Nullable
        private final Integer statusCode;

        @c("status_key")
        @Nullable
        private final String statusKey;

        public ChatStatus(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable String str2) {
            this.state = num;
            this.stateKey = str;
            this.statusCode = num2;
            this.statusKey = str2;
        }

        public static /* synthetic */ ChatStatus copy$default(ChatStatus chatStatus, Integer num, String str, Integer num2, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = chatStatus.state;
            }
            if ((i10 & 2) != 0) {
                str = chatStatus.stateKey;
            }
            if ((i10 & 4) != 0) {
                num2 = chatStatus.statusCode;
            }
            if ((i10 & 8) != 0) {
                str2 = chatStatus.statusKey;
            }
            return chatStatus.copy(num, str, num2, str2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Integer getState() {
            return this.state;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getStateKey() {
            return this.stateKey;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Integer getStatusCode() {
            return this.statusCode;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getStatusKey() {
            return this.statusKey;
        }

        @NotNull
        public final ChatStatus copy(@Nullable Integer state, @Nullable String stateKey, @Nullable Integer statusCode, @Nullable String statusKey) {
            return new ChatStatus(state, stateKey, statusCode, statusKey);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChatStatus)) {
                return false;
            }
            ChatStatus chatStatus = (ChatStatus) other;
            return Intrinsics.areEqual(this.state, chatStatus.state) && Intrinsics.areEqual(this.stateKey, chatStatus.stateKey) && Intrinsics.areEqual(this.statusCode, chatStatus.statusCode) && Intrinsics.areEqual(this.statusKey, chatStatus.statusKey);
        }

        @Nullable
        public final Integer getState() {
            return this.state;
        }

        @Nullable
        public final String getStateKey() {
            return this.stateKey;
        }

        @Nullable
        public final Integer getStatusCode() {
            return this.statusCode;
        }

        @Nullable
        public final String getStatusKey() {
            return this.statusKey;
        }

        public int hashCode() {
            Integer num = this.state;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.stateKey;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.statusCode;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.statusKey;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ChatStatus(state=" + this.state + ", stateKey=" + this.stateKey + ", statusCode=" + this.statusCode + ", statusKey=" + this.statusKey + ')';
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Department;", "", StackTraceHelper.ID_KEY, "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Department {

        @c(StackTraceHelper.ID_KEY)
        @Nullable
        private final String id;

        @c("name")
        @Nullable
        private final String name;

        public Department(@Nullable String str, @Nullable String str2) {
            this.id = str;
            this.name = str2;
        }

        public static /* synthetic */ Department copy$default(Department department, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = department.id;
            }
            if ((i10 & 2) != 0) {
                str2 = department.name;
            }
            return department.copy(str, str2);
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
        public final Department copy(@Nullable String id2, @Nullable String name) {
            return new Department(id2, name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Department)) {
                return false;
            }
            Department department = (Department) other;
            return Intrinsics.areEqual(this.id, department.id) && Intrinsics.areEqual(this.name, department.name);
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
            return "Department(id=" + this.id + ", name=" + this.name + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Type;", "", "(Ljava/lang/String;I)V", "Chat", "Call", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @c("chat")
        public static final Type Chat = new Type("Chat", 0);

        @c("call")
        public static final Type Call = new Type("Call", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Chat, Call};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Type(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/data/remote/entities/ConversationResponse$Visitor;", "", "countryCode", "", EventKeys.IP, "name", "userId", "uuid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getIp", "getName", "getUserId", "getUuid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Visitor {

        @c("country_code")
        @Nullable
        private final String countryCode;

        @c(EventKeys.IP)
        @Nullable
        private final String ip;

        @c("name")
        @Nullable
        private final String name;

        @c("user_id")
        @Nullable
        private final String userId;

        @c("uuid")
        @Nullable
        private final String uuid;

        public Visitor(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.countryCode = str;
            this.ip = str2;
            this.name = str3;
            this.userId = str4;
            this.uuid = str5;
        }

        public static /* synthetic */ Visitor copy$default(Visitor visitor, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = visitor.countryCode;
            }
            if ((i10 & 2) != 0) {
                str2 = visitor.ip;
            }
            if ((i10 & 4) != 0) {
                str3 = visitor.name;
            }
            if ((i10 & 8) != 0) {
                str4 = visitor.userId;
            }
            if ((i10 & 16) != 0) {
                str5 = visitor.uuid;
            }
            String str6 = str5;
            String str7 = str3;
            return visitor.copy(str, str2, str7, str4, str6);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getIp() {
            return this.ip;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        @NotNull
        public final Visitor copy(@Nullable String countryCode, @Nullable String ip, @Nullable String name, @Nullable String userId, @Nullable String uuid) {
            return new Visitor(countryCode, ip, name, userId, uuid);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Visitor)) {
                return false;
            }
            Visitor visitor = (Visitor) other;
            return Intrinsics.areEqual(this.countryCode, visitor.countryCode) && Intrinsics.areEqual(this.ip, visitor.ip) && Intrinsics.areEqual(this.name, visitor.name) && Intrinsics.areEqual(this.userId, visitor.userId) && Intrinsics.areEqual(this.uuid, visitor.uuid);
        }

        @Nullable
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Nullable
        public final String getIp() {
            return this.ip;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        @Nullable
        public final String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            String str = this.countryCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.ip;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.name;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.userId;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.uuid;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Visitor(countryCode=" + this.countryCode + ", ip=" + this.ip + ", name=" + this.name + ", userId=" + this.userId + ", uuid=" + this.uuid + ')';
        }
    }

    public ConversationResponse(@Nullable String str, @Nullable Attender attender, @Nullable String str2, @Nullable ChatStatus chatStatus, @Nullable Department department, @NotNull String id2, @Nullable Long l10, @Nullable Long l11, @Nullable MediaResponse mediaResponse, @Nullable Long l12, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Type type, @Nullable Boolean bool, @Nullable Visitor visitor, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.acknowledgementKey = str;
        this.attender = attender;
        this.chatId = str2;
        this.chatStatus = chatStatus;
        this.department = department;
        this.id = id2;
        this.currentPosition = l10;
        this.lastModifiedTime = l11;
        this.mediaData = mediaResponse;
        this.averageResponseTime = l12;
        this.question = str3;
        this.referenceId = str4;
        this.startTime = str5;
        this.missedTime = str6;
        this.endTime = str7;
        this.timeDifference = str8;
        this.type = type;
        this.unreadChats = bool;
        this.visitor = visitor;
        this.wmsChatId = str9;
        this.queueType = str10;
        this.module = str11;
    }

    public static /* synthetic */ ConversationResponse copy$default(ConversationResponse conversationResponse, String str, Attender attender, String str2, ChatStatus chatStatus, Department department, String str3, Long l10, Long l11, MediaResponse mediaResponse, Long l12, String str4, String str5, String str6, String str7, String str8, String str9, Type type, Boolean bool, Visitor visitor, String str10, String str11, String str12, int i10, Object obj) {
        String str13;
        String str14;
        String str15 = (i10 & 1) != 0 ? conversationResponse.acknowledgementKey : str;
        Attender attender2 = (i10 & 2) != 0 ? conversationResponse.attender : attender;
        String str16 = (i10 & 4) != 0 ? conversationResponse.chatId : str2;
        ChatStatus chatStatus2 = (i10 & 8) != 0 ? conversationResponse.chatStatus : chatStatus;
        Department department2 = (i10 & 16) != 0 ? conversationResponse.department : department;
        String str17 = (i10 & 32) != 0 ? conversationResponse.id : str3;
        Long l13 = (i10 & 64) != 0 ? conversationResponse.currentPosition : l10;
        Long l14 = (i10 & 128) != 0 ? conversationResponse.lastModifiedTime : l11;
        MediaResponse mediaResponse2 = (i10 & 256) != 0 ? conversationResponse.mediaData : mediaResponse;
        Long l15 = (i10 & 512) != 0 ? conversationResponse.averageResponseTime : l12;
        String str18 = (i10 & 1024) != 0 ? conversationResponse.question : str4;
        String str19 = (i10 & 2048) != 0 ? conversationResponse.referenceId : str5;
        String str20 = (i10 & 4096) != 0 ? conversationResponse.startTime : str6;
        String str21 = (i10 & 8192) != 0 ? conversationResponse.missedTime : str7;
        String str22 = str15;
        String str23 = (i10 & 16384) != 0 ? conversationResponse.endTime : str8;
        String str24 = (i10 & 32768) != 0 ? conversationResponse.timeDifference : str9;
        Type type2 = (i10 & PKIFailureInfo.notAuthorized) != 0 ? conversationResponse.type : type;
        Boolean bool2 = (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? conversationResponse.unreadChats : bool;
        Visitor visitor2 = (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? conversationResponse.visitor : visitor;
        String str25 = (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? conversationResponse.wmsChatId : str10;
        String str26 = (i10 & PKIFailureInfo.badCertTemplate) != 0 ? conversationResponse.queueType : str11;
        if ((i10 & PKIFailureInfo.badSenderNonce) != 0) {
            str14 = str26;
            str13 = conversationResponse.module;
        } else {
            str13 = str12;
            str14 = str26;
        }
        return conversationResponse.copy(str22, attender2, str16, chatStatus2, department2, str17, l13, l14, mediaResponse2, l15, str18, str19, str20, str21, str23, str24, type2, bool2, visitor2, str25, str14, str13);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAcknowledgementKey() {
        return this.acknowledgementKey;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Long getAverageResponseTime() {
        return this.averageResponseTime;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getMissedTime() {
        return this.missedTime;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getTimeDifference() {
        return this.timeDifference;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Boolean getUnreadChats() {
        return this.unreadChats;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Visitor getVisitor() {
        return this.visitor;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Attender getAttender() {
        return this.attender;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getWmsChatId() {
        return this.wmsChatId;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final String getQueueType() {
        return this.queueType;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final ChatStatus getChatStatus() {
        return this.chatStatus;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Department getDepartment() {
        return this.department;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Long getCurrentPosition() {
        return this.currentPosition;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final MediaResponse getMediaData() {
        return this.mediaData;
    }

    @NotNull
    public final ConversationResponse copy(@Nullable String acknowledgementKey, @Nullable Attender attender, @Nullable String chatId, @Nullable ChatStatus chatStatus, @Nullable Department department, @NotNull String id2, @Nullable Long currentPosition, @Nullable Long lastModifiedTime, @Nullable MediaResponse mediaData, @Nullable Long averageResponseTime, @Nullable String question, @Nullable String referenceId, @Nullable String startTime, @Nullable String missedTime, @Nullable String endTime, @Nullable String timeDifference, @Nullable Type type, @Nullable Boolean unreadChats, @Nullable Visitor visitor, @Nullable String wmsChatId, @Nullable String queueType, @Nullable String module) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new ConversationResponse(acknowledgementKey, attender, chatId, chatStatus, department, id2, currentPosition, lastModifiedTime, mediaData, averageResponseTime, question, referenceId, startTime, missedTime, endTime, timeDifference, type, unreadChats, visitor, wmsChatId, queueType, module);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationResponse)) {
            return false;
        }
        ConversationResponse conversationResponse = (ConversationResponse) other;
        return Intrinsics.areEqual(this.acknowledgementKey, conversationResponse.acknowledgementKey) && Intrinsics.areEqual(this.attender, conversationResponse.attender) && Intrinsics.areEqual(this.chatId, conversationResponse.chatId) && Intrinsics.areEqual(this.chatStatus, conversationResponse.chatStatus) && Intrinsics.areEqual(this.department, conversationResponse.department) && Intrinsics.areEqual(this.id, conversationResponse.id) && Intrinsics.areEqual(this.currentPosition, conversationResponse.currentPosition) && Intrinsics.areEqual(this.lastModifiedTime, conversationResponse.lastModifiedTime) && Intrinsics.areEqual(this.mediaData, conversationResponse.mediaData) && Intrinsics.areEqual(this.averageResponseTime, conversationResponse.averageResponseTime) && Intrinsics.areEqual(this.question, conversationResponse.question) && Intrinsics.areEqual(this.referenceId, conversationResponse.referenceId) && Intrinsics.areEqual(this.startTime, conversationResponse.startTime) && Intrinsics.areEqual(this.missedTime, conversationResponse.missedTime) && Intrinsics.areEqual(this.endTime, conversationResponse.endTime) && Intrinsics.areEqual(this.timeDifference, conversationResponse.timeDifference) && this.type == conversationResponse.type && Intrinsics.areEqual(this.unreadChats, conversationResponse.unreadChats) && Intrinsics.areEqual(this.visitor, conversationResponse.visitor) && Intrinsics.areEqual(this.wmsChatId, conversationResponse.wmsChatId) && Intrinsics.areEqual(this.queueType, conversationResponse.queueType) && Intrinsics.areEqual(this.module, conversationResponse.module);
    }

    @Nullable
    public final String getAcknowledgementKey() {
        return this.acknowledgementKey;
    }

    @Nullable
    public final Attender getAttender() {
        return this.attender;
    }

    @Nullable
    public final Long getAverageResponseTime() {
        return this.averageResponseTime;
    }

    @Nullable
    public final String getChatId() {
        return this.chatId;
    }

    @Nullable
    public final ChatStatus getChatStatus() {
        return this.chatStatus;
    }

    @Nullable
    public final Long getCurrentPosition() {
        return this.currentPosition;
    }

    @Nullable
    public final Department getDepartment() {
        return this.department;
    }

    @Nullable
    public final String getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    @Nullable
    public final MediaResponse getMediaData() {
        return this.mediaData;
    }

    @Nullable
    public final String getMissedTime() {
        return this.missedTime;
    }

    @Nullable
    public final String getModule() {
        return this.module;
    }

    @Nullable
    public final String getQuestion() {
        return this.question;
    }

    @Nullable
    public final String getQueueType() {
        return this.queueType;
    }

    @Nullable
    public final String getReferenceId() {
        return this.referenceId;
    }

    @Nullable
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getTimeDifference() {
        return this.timeDifference;
    }

    @Nullable
    public final Type getType() {
        return this.type;
    }

    @Nullable
    public final Boolean getUnreadChats() {
        return this.unreadChats;
    }

    @Nullable
    public final Visitor getVisitor() {
        return this.visitor;
    }

    @Nullable
    public final String getWmsChatId() {
        return this.wmsChatId;
    }

    public int hashCode() {
        String str = this.acknowledgementKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Attender attender = this.attender;
        int hashCode2 = (hashCode + (attender == null ? 0 : attender.hashCode())) * 31;
        String str2 = this.chatId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChatStatus chatStatus = this.chatStatus;
        int hashCode4 = (hashCode3 + (chatStatus == null ? 0 : chatStatus.hashCode())) * 31;
        Department department = this.department;
        int hashCode5 = (((hashCode4 + (department == null ? 0 : department.hashCode())) * 31) + this.id.hashCode()) * 31;
        Long l10 = this.currentPosition;
        int hashCode6 = (hashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.lastModifiedTime;
        int hashCode7 = (hashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        MediaResponse mediaResponse = this.mediaData;
        int hashCode8 = (hashCode7 + (mediaResponse == null ? 0 : mediaResponse.hashCode())) * 31;
        Long l12 = this.averageResponseTime;
        int hashCode9 = (hashCode8 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.question;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.referenceId;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.startTime;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.missedTime;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.endTime;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.timeDifference;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Type type = this.type;
        int hashCode16 = (hashCode15 + (type == null ? 0 : type.hashCode())) * 31;
        Boolean bool = this.unreadChats;
        int hashCode17 = (hashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        Visitor visitor = this.visitor;
        int hashCode18 = (hashCode17 + (visitor == null ? 0 : visitor.hashCode())) * 31;
        String str9 = this.wmsChatId;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.queueType;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.module;
        return hashCode20 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ConversationResponse(acknowledgementKey=" + this.acknowledgementKey + ", attender=" + this.attender + ", chatId=" + this.chatId + ", chatStatus=" + this.chatStatus + ", department=" + this.department + ", id=" + this.id + ", currentPosition=" + this.currentPosition + ", lastModifiedTime=" + this.lastModifiedTime + ", mediaData=" + this.mediaData + ", averageResponseTime=" + this.averageResponseTime + ", question=" + this.question + ", referenceId=" + this.referenceId + ", startTime=" + this.startTime + ", missedTime=" + this.missedTime + ", endTime=" + this.endTime + ", timeDifference=" + this.timeDifference + ", type=" + this.type + ", unreadChats=" + this.unreadChats + ", visitor=" + this.visitor + ", wmsChatId=" + this.wmsChatId + ", queueType=" + this.queueType + ", module=" + this.module + ')';
    }
}
