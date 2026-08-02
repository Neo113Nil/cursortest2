package vf;

import com.google.gson.Gson;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import com.zoho.livechat.android.modules.messages.data.remote.responses.MessageResponse;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import og.i;
import og.j;
import og.m;

/* renamed from: vf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6687a {
    public static final MessageEntity a(Message message, Gson gson, String currentUserId) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List c10;
        Intrinsics.checkNotNullParameter(message, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        String acknowledgementKey = message.getAcknowledgementKey();
        String conversationId = message.getConversationId();
        String chatId = message.getChatId();
        String rChatId = message.getRChatId();
        Long sequenceId = message.getSequenceId();
        String stringValue = message.getMessageType().getStringValue();
        Integer valueOf = Integer.valueOf(message.getStatus().ordinal());
        String id2 = message.getId();
        String uniqueID = message.getUniqueID();
        if (((message.getInfoMessage() == null && message.getContent() == null && message.getComment() == null && message.getMessageStringResourceId() == null) ? null : message) != null) {
            Object infoMessage = message.getInfoMessage();
            if (infoMessage == null) {
                infoMessage = new MessageResponse.Message(message.getContent(), null, null, null, message.getComment(), null, null, null, null, null, null, message.getMessageStringResourceId(), null, null, null, null, null, null, 260078, null);
            }
            str = gson.v(infoMessage);
        } else {
            str = null;
        }
        if (((message.getInfoMessage() == null && message.getContent() == null && message.getComment() == null) ? null : message) != null) {
            Object infoMessage2 = message.getInfoMessage();
            if (infoMessage2 == null) {
                String content = message.getContent();
                String u10 = content != null ? i.u(content) : null;
                String comment = message.getComment();
                infoMessage2 = new MessageResponse.Message(u10, null, null, null, comment != null ? i.u(comment) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262126, null);
            }
            str2 = gson.v(infoMessage2);
        } else {
            str2 = null;
        }
        String content2 = message.getContent();
        if (content2 == null) {
            content2 = message.getComment();
        }
        String v10 = (content2 == null || (c10 = m.c(content2)) == null) ? null : gson.v(c10);
        String sender = message.getSender();
        Message.b displayName = message.getDisplayName();
        String str7 = str;
        if (displayName != null) {
            String e10 = displayName.e();
            String u11 = e10 != null ? i.u(e10) : null;
            str3 = acknowledgementKey;
            str4 = conversationId;
            str5 = null;
            str6 = gson.v(Message.b.c(displayName, u11, false, 2, null));
        } else {
            str3 = acknowledgementKey;
            str4 = conversationId;
            str5 = null;
            str6 = null;
        }
        String v11 = message.getAttachment() != null ? gson.v(message.getAttachment()) : str5;
        String v12 = message.getMeta() != null ? gson.v(message.getMeta()) : str5;
        String v13 = message.getRespondedMessage() != null ? gson.v(message.getRespondedMessage()) : str5;
        boolean isBot = message.isBot();
        Boolean isRead = message.isRead();
        Boolean isTyping = message.isTyping();
        Boolean isEdited = message.isEdited();
        Boolean isDeleted = message.isDeleted();
        Message replyTo = message.getReplyTo();
        String v14 = replyTo != null ? gson.v(a(replyTo, gson, currentUserId)) : str5;
        String timeDifferenceContent = message.getTimeDifferenceContent();
        boolean z10 = i.e(currentUserId) && Intrinsics.areEqual(currentUserId, message.getSender());
        String v15 = message.getExtras() != null ? gson.v(message.getExtras()) : null;
        long serverTime = message.getServerTime();
        long clientTime = message.getClientTime();
        long previousMessageTime = message.getPreviousMessageTime();
        String formattedClientTime = message.getFormattedClientTime();
        if (formattedClientTime == null) {
            formattedClientTime = j.c(message.getClientTime(), null, null, 3, null);
        }
        return new MessageEntity(str3, str4, chatId, rChatId, sequenceId, stringValue, valueOf, id2, uniqueID, str7, str2, v10, sender, str6, v11, v12, v13, isBot, isRead, isTyping, isEdited, isDeleted, v14, timeDifferenceContent, z10, v15, new MessageEntity.Time(serverTime, clientTime, previousMessageTime, 0L, 0L, formattedClientTime, 24, null));
    }

    public static final List b(List list, Gson gson, String currentUserId) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((Message) it.next(), gson, currentUserId));
        }
        return arrayList;
    }
}
