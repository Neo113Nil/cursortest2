package com.zoho.livechat.android.modules.messages.data.repository.mapper;

import android.app.Application;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.reflect.TypeToken;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import com.zoho.livechat.android.modules.messages.data.remote.responses.MessageResponse;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import od.t;
import og.AbstractC5895g;
import og.AbstractC5896h;
import og.i;
import og.j;
import og.m;
import zf.C6966g;

/* loaded from: classes4.dex */
public abstract class MessageRoomToDomainKt {
    public static final boolean a(Message message, Message message2) {
        String sender;
        Intrinsics.checkNotNullParameter(message, "message");
        if (LiveChatUtil.canShowOperatorImageInChat() && !Intrinsics.areEqual(message.getSender(), LiveChatUtil.getAnnonID())) {
            if ((message2 != null ? message2.getSender() : null) != null && (sender = message.getSender()) != null && StringsKt.contains$default((CharSequence) sender, (CharSequence) j(message2.getSender()), false, 2, (Object) null) && !StringsKt.startsWith$default(message2.getSender(), "$", false, 2, (Object) null) && message2.getMessageType() != Message.g.InfoMessage) {
                if (message2.getMeta() != null) {
                    Message.Meta meta = message.getMeta();
                    if ((meta != null ? meta.getOperationUser() : null) != null) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r7.getMessageType() == com.zoho.livechat.android.modules.messages.domain.entities.Message.g.InfoMessage) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r7.getMeta() != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r7.getMeta().getOperationUser() != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002c, code lost:
    
        if (c(r6, r7) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r1, (java.lang.CharSequence) j(r7.getSender()), false, 2, (java.lang.Object) null) == true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(Message message, Message message2) {
        boolean z10;
        Intrinsics.checkNotNullParameter(message, "message");
        if ((message2 != null ? message2.getSender() : null) != null) {
            String sender = message.getSender();
            z10 = false;
            if (sender != null) {
            }
        }
        z10 = true;
        if (!i.g(message2)) {
            Message.Meta meta = message.getMeta();
            if ((meta != null ? meta.getOperationUser() : null) == null) {
                return z10;
            }
        }
        return true;
    }

    public static final boolean c(Message message, Message message2) {
        String sender;
        String sender2 = message.getSender();
        return (sender2 == null || !StringsKt.startsWith$default(sender2, "$", false, 2, (Object) null) || message2 == null || (sender = message2.getSender()) == null || !StringsKt.startsWith$default(sender, "$", false, 2, (Object) null)) ? false : true;
    }

    public static final Message d(MessageEntity messageEntity, Application application, Gson gson) {
        Intrinsics.checkNotNullParameter(messageEntity, "<this>");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return g(messageEntity, application, gson, false, false, null, null, 60, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ed, code lost:
    
        if ((r33 != null ? r33.getMetaType() : null) == com.zoho.livechat.android.modules.messages.domain.entities.Message.Meta.b.ContentModerationBlock) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Message e(MessageEntity messageEntity, Application application, Gson gson, boolean z10, boolean z11, Function2 function2, Message message) {
        String str;
        Message.g gVar;
        MessageEntity messageEntity2;
        Message.d dVar;
        Integer num;
        Integer messageStringResourceId;
        String text;
        MessageEntity messageEntity3;
        String str2;
        String message2;
        String str3;
        String comment;
        String u10;
        Message.Attachment attachment;
        Message.InfoMessage infoMessage;
        String replyTo;
        Message message3;
        String markdowns;
        h r10;
        String f10;
        Object m147constructorimpl;
        k kVar;
        k d10;
        h r11;
        String f11;
        String e10;
        Intrinsics.checkNotNullParameter(messageEntity, "<this>");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(gson, "gson");
        List list = null;
        Message.Meta meta = messageEntity.getMeta() != null ? (Message.Meta) AbstractC5895g.b(gson, messageEntity.getMeta(), Message.Meta.class) : null;
        MessageResponse.Message message4 = messageEntity.getMessage() != null ? (MessageResponse.Message) AbstractC5895g.b(gson, messageEntity.getMessage(), MessageResponse.Message.class) : null;
        if (message4 != null) {
            String message5 = message4.getMessage();
            if (message5 == null) {
                message5 = message4.getComment();
            }
            str = message5;
        } else {
            str = null;
        }
        MessageResponse.Message message6 = messageEntity.getFormattedMessage() != null ? (MessageResponse.Message) AbstractC5895g.b(gson, messageEntity.getFormattedMessage(), MessageResponse.Message.class) : null;
        if (messageEntity.getMessageType() == null || (gVar = (Message.g) AbstractC5895g.b(gson, messageEntity.getMessageType(), Message.g.class)) == null) {
            gVar = Message.g.Text;
        }
        Message.g gVar2 = gVar;
        if (messageEntity.getMessage() != null) {
            if (i.e(message6 != null ? message6.getMode() : null)) {
                messageEntity2 = messageEntity;
                if (messageEntity2 == null) {
                    dVar = (Message.d) AbstractC5895g.b(gson, gson.v(message6 != null ? message6.getMode() : null), Message.d.class);
                } else {
                    dVar = null;
                }
                String displayName = messageEntity.getDisplayName();
                Message.b bVar = displayName == null ? (Message.b) AbstractC5895g.b(gson, displayName, Message.b.class) : null;
                if (dVar == Message.d.Trigger) {
                    if (message6 == null || (e10 = message6.getDisplayName()) == null) {
                        e10 = bVar != null ? bVar.e() : null;
                    }
                    bVar = new Message.b(e10, i.i(bVar != null ? Boolean.valueOf(bVar.d()) : null));
                }
                Message.d dVar2 = dVar;
                String acknowledgementKey = messageEntity.getAcknowledgementKey();
                String conversationId = messageEntity.getConversationId();
                String chatId = messageEntity.getChatId();
                if (messageEntity.getStatus() != null || (r6 = (Message.f) Message.f.getEntries().get(messageEntity.getStatus().intValue())) == null) {
                    Message.f fVar = Message.f.Sent;
                }
                Message.f fVar2 = fVar;
                String messageId = messageEntity.getMessageId();
                String messageUID = messageEntity.getMessageUID();
                if (message6 != null || (messageStringResourceId = message6.getMessageStringResourceId()) == null) {
                    if (message4 != null) {
                        num = null;
                        if (message6 != null || (text = message6.getText()) == null) {
                            text = message4 == null ? message4.getText() : null;
                        }
                        if (text != null || (str2 = i.u(text)) == null) {
                            if (!Intrinsics.areEqual(message6 == null ? message6.getMode() : null, "trigger")) {
                                if (!Intrinsics.areEqual(message4 != null ? message4.getMode() : null, "trigger")) {
                                    messageEntity3 = null;
                                    if (messageEntity3 != null) {
                                        if (message6 == null || (message2 = message6.getMessage()) == null) {
                                            message2 = message4 != null ? message4.getMessage() : null;
                                        }
                                        if (message2 != null) {
                                            str2 = i.u(message2);
                                        }
                                    }
                                    str2 = null;
                                }
                            }
                            messageEntity3 = messageEntity;
                            if (messageEntity3 != null) {
                            }
                            str2 = null;
                        }
                        String str4 = str2;
                        if (message6 != null || (u10 = message6.getComment()) == null) {
                            if (message4 != null || (comment = message4.getComment()) == null) {
                                str3 = null;
                                long serverTime = messageEntity.getTime().getServerTime();
                                long clientTime = messageEntity.getTime().getClientTime();
                                String sender = messageEntity.getSender();
                                String e11 = bVar != null ? bVar.e() : null;
                                if ((meta != null ? meta.getMetaType() : null) != Message.Meta.b.ContentModerationWaring) {
                                    if ((meta != null ? meta.getMetaType() : null) != Message.Meta.b.ContentModerationClose) {
                                    }
                                }
                                String string = application.getString(t.f61088p);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                bVar = new Message.b(string, m.b(string));
                                Message.b bVar2 = bVar;
                                Long sequenceId = messageEntity.getSequenceId();
                                String rChatId = messageEntity.getRChatId();
                                Message.Attachment attachment2 = messageEntity.getAttachment() != null ? (Message.Attachment) AbstractC5895g.b(gson, messageEntity.getAttachment(), Message.Attachment.class) : null;
                                if (gVar2 == Message.g.Feedback) {
                                    if (attachment2 == null) {
                                        attachment = null;
                                        Message.RespondedMessage respondedMessage = messageEntity.getRespondedMessage() == null ? (Message.RespondedMessage) AbstractC5895g.b(gson, messageEntity.getRespondedMessage(), Message.RespondedMessage.class) : null;
                                        boolean isBot = messageEntity.isBot();
                                        Boolean readStatus = messageEntity.getReadStatus();
                                        Boolean isTyping = messageEntity.isTyping();
                                        Boolean isEdited = messageEntity.isEdited();
                                        Boolean isDeleted = messageEntity.isDeleted();
                                        if (((messageEntity.getMessage() == null && gVar2 == Message.g.InfoMessage) ? messageEntity : null) == null) {
                                            Message.InfoMessage infoMessage2 = (Message.InfoMessage) AbstractC5895g.b(gson, messageEntity.getMessage(), Message.InfoMessage.class);
                                            if (infoMessage2 == null) {
                                                h d11 = com.google.gson.m.d(messageEntity.getMessage());
                                                Intrinsics.checkNotNullExpressionValue(d11, "parseString(...)");
                                                k d12 = AbstractC5896h.d(d11);
                                                if (d12 == null || !d12.t("media") || (r10 = d12.r("media")) == null || (f10 = AbstractC5896h.f(r10)) == null) {
                                                    infoMessage2 = null;
                                                } else {
                                                    try {
                                                        Result.Companion companion = Result.INSTANCE;
                                                        h d13 = com.google.gson.m.d(f10);
                                                        if (d13 != null) {
                                                            Intrinsics.checkNotNull(d13);
                                                            kVar = AbstractC5896h.d(d13);
                                                        } else {
                                                            kVar = null;
                                                        }
                                                        if (kVar != null && (d10 = AbstractC5896h.d(kVar)) != null && (r11 = d10.r("opruser")) != null && (f11 = AbstractC5896h.f(r11)) != null) {
                                                            kVar.m("operation_user", com.google.gson.m.d(f11));
                                                            Unit unit = Unit.INSTANCE;
                                                        }
                                                        d12.m("media", kVar);
                                                        m147constructorimpl = Result.m147constructorimpl((Message.InfoMessage) gson.i(d12, Message.InfoMessage.class));
                                                    } catch (Throwable th2) {
                                                        Result.Companion companion2 = Result.INSTANCE;
                                                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                                                    }
                                                    Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                                    if (m150exceptionOrNullimpl != null) {
                                                        LiveChatUtil.log(m150exceptionOrNullimpl);
                                                    }
                                                    if (Result.m153isFailureimpl(m147constructorimpl)) {
                                                        m147constructorimpl = null;
                                                    }
                                                    infoMessage2 = (Message.InfoMessage) m147constructorimpl;
                                                }
                                            }
                                            infoMessage = infoMessage2;
                                        } else {
                                            infoMessage = null;
                                        }
                                        Message.Extras extras = messageEntity.getExtras() == null ? (Message.Extras) AbstractC5895g.b(gson, messageEntity.getExtras(), Message.Extras.class) : null;
                                        long editedTime = messageEntity.getTime().getEditedTime();
                                        long deletedTime = messageEntity.getTime().getDeletedTime();
                                        long previousMessageTime = messageEntity.getTime().getPreviousMessageTime();
                                        replyTo = messageEntity.getReplyTo();
                                        if (replyTo == null) {
                                            MessageEntity messageEntity4 = (MessageEntity) AbstractC5895g.b(gson, replyTo, MessageEntity.class);
                                            message3 = messageEntity4 != null ? g(messageEntity4, application, gson, false, false, null, null, 60, null) : null;
                                        } else {
                                            message3 = null;
                                        }
                                        markdowns = messageEntity.getMarkdowns();
                                        if (markdowns != null) {
                                            Type type = new TypeToken<List<? extends Message.c>>() { // from class: com.zoho.livechat.android.modules.messages.data.repository.mapper.MessageRoomToDomainKt$toDomainEntity$11$1
                                            }.getType();
                                            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                                            list = (List) AbstractC5895g.c(gson, markdowns, type);
                                        }
                                        Message message7 = new Message(acknowledgementKey, conversationId, chatId, gVar2, fVar2, messageId, messageUID, num, str4, str3, serverTime, clientTime, sender, e11, bVar2, sequenceId, rChatId, attachment, meta, respondedMessage, isBot, readStatus, isTyping, isEdited, isDeleted, dVar2, infoMessage, extras, editedTime, deletedTime, previousMessageTime, message3, list, str, null, messageEntity.getTimeDifferenceContent(), z10, z11, messageEntity.isRightAligned(), false, false, j.c(messageEntity.getTime().getClientTime(), null, null, 3, null), 0, 384, null);
                                        return Message.copy$default(message7, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, a(message7, message), b(message7, message), null, -1, 639, null);
                                    }
                                    attachment2 = Message.Attachment.copy$default(attachment2, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, function2 != null ? (Boolean) function2.invoke(Boolean.TRUE, messageEntity.getChatId()) : null, null, 25165823, null);
                                }
                                attachment = attachment2;
                                if (messageEntity.getRespondedMessage() == null) {
                                }
                                boolean isBot2 = messageEntity.isBot();
                                Boolean readStatus2 = messageEntity.getReadStatus();
                                Boolean isTyping2 = messageEntity.isTyping();
                                Boolean isEdited2 = messageEntity.isEdited();
                                Boolean isDeleted2 = messageEntity.isDeleted();
                                if (((messageEntity.getMessage() == null && gVar2 == Message.g.InfoMessage) ? messageEntity : null) == null) {
                                }
                                if (messageEntity.getExtras() == null) {
                                }
                                long editedTime2 = messageEntity.getTime().getEditedTime();
                                long deletedTime2 = messageEntity.getTime().getDeletedTime();
                                long previousMessageTime2 = messageEntity.getTime().getPreviousMessageTime();
                                replyTo = messageEntity.getReplyTo();
                                if (replyTo == null) {
                                }
                                markdowns = messageEntity.getMarkdowns();
                                if (markdowns != null) {
                                }
                                Message message72 = new Message(acknowledgementKey, conversationId, chatId, gVar2, fVar2, messageId, messageUID, num, str4, str3, serverTime, clientTime, sender, e11, bVar2, sequenceId, rChatId, attachment, meta, respondedMessage, isBot2, readStatus2, isTyping2, isEdited2, isDeleted2, dVar2, infoMessage, extras, editedTime2, deletedTime2, previousMessageTime2, message3, list, str, null, messageEntity.getTimeDifferenceContent(), z10, z11, messageEntity.isRightAligned(), false, false, j.c(messageEntity.getTime().getClientTime(), null, null, 3, null), 0, 384, null);
                                return Message.copy$default(message72, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, a(message72, message), b(message72, message), null, -1, 639, null);
                            }
                            u10 = i.u(comment);
                        }
                        str3 = u10;
                        long serverTime2 = messageEntity.getTime().getServerTime();
                        long clientTime2 = messageEntity.getTime().getClientTime();
                        String sender2 = messageEntity.getSender();
                        if (bVar != null) {
                        }
                        if ((meta != null ? meta.getMetaType() : null) != Message.Meta.b.ContentModerationWaring) {
                        }
                        String string2 = application.getString(t.f61088p);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        bVar = new Message.b(string2, m.b(string2));
                        Message.b bVar22 = bVar;
                        Long sequenceId2 = messageEntity.getSequenceId();
                        String rChatId2 = messageEntity.getRChatId();
                        if (messageEntity.getAttachment() != null) {
                        }
                        if (gVar2 == Message.g.Feedback) {
                        }
                        attachment = attachment2;
                        if (messageEntity.getRespondedMessage() == null) {
                        }
                        boolean isBot22 = messageEntity.isBot();
                        Boolean readStatus22 = messageEntity.getReadStatus();
                        Boolean isTyping22 = messageEntity.isTyping();
                        Boolean isEdited22 = messageEntity.isEdited();
                        Boolean isDeleted22 = messageEntity.isDeleted();
                        if (((messageEntity.getMessage() == null && gVar2 == Message.g.InfoMessage) ? messageEntity : null) == null) {
                        }
                        if (messageEntity.getExtras() == null) {
                        }
                        long editedTime22 = messageEntity.getTime().getEditedTime();
                        long deletedTime22 = messageEntity.getTime().getDeletedTime();
                        long previousMessageTime22 = messageEntity.getTime().getPreviousMessageTime();
                        replyTo = messageEntity.getReplyTo();
                        if (replyTo == null) {
                        }
                        markdowns = messageEntity.getMarkdowns();
                        if (markdowns != null) {
                        }
                        Message message722 = new Message(acknowledgementKey, conversationId, chatId, gVar2, fVar2, messageId, messageUID, num, str4, str3, serverTime2, clientTime2, sender2, e11, bVar22, sequenceId2, rChatId2, attachment, meta, respondedMessage, isBot22, readStatus22, isTyping22, isEdited22, isDeleted22, dVar2, infoMessage, extras, editedTime22, deletedTime22, previousMessageTime22, message3, list, str, null, messageEntity.getTimeDifferenceContent(), z10, z11, messageEntity.isRightAligned(), false, false, j.c(messageEntity.getTime().getClientTime(), null, null, 3, null), 0, 384, null);
                        return Message.copy$default(message722, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, a(message722, message), b(message722, message), null, -1, 639, null);
                    }
                    messageStringResourceId = message4.getMessageStringResourceId();
                }
                num = messageStringResourceId;
                if (message6 != null) {
                }
                if (message4 == null) {
                }
                if (text != null) {
                }
                if (!Intrinsics.areEqual(message6 == null ? message6.getMode() : null, "trigger")) {
                }
                messageEntity3 = messageEntity;
                if (messageEntity3 != null) {
                }
                str2 = null;
                String str42 = str2;
                if (message6 != null) {
                }
                if (message4 != null) {
                }
                str3 = null;
                long serverTime22 = messageEntity.getTime().getServerTime();
                long clientTime22 = messageEntity.getTime().getClientTime();
                String sender22 = messageEntity.getSender();
                if (bVar != null) {
                }
                if ((meta != null ? meta.getMetaType() : null) != Message.Meta.b.ContentModerationWaring) {
                }
                String string22 = application.getString(t.f61088p);
                Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                bVar = new Message.b(string22, m.b(string22));
                Message.b bVar222 = bVar;
                Long sequenceId22 = messageEntity.getSequenceId();
                String rChatId22 = messageEntity.getRChatId();
                if (messageEntity.getAttachment() != null) {
                }
                if (gVar2 == Message.g.Feedback) {
                }
                attachment = attachment2;
                if (messageEntity.getRespondedMessage() == null) {
                }
                boolean isBot222 = messageEntity.isBot();
                Boolean readStatus222 = messageEntity.getReadStatus();
                Boolean isTyping222 = messageEntity.isTyping();
                Boolean isEdited222 = messageEntity.isEdited();
                Boolean isDeleted222 = messageEntity.isDeleted();
                if (((messageEntity.getMessage() == null && gVar2 == Message.g.InfoMessage) ? messageEntity : null) == null) {
                }
                if (messageEntity.getExtras() == null) {
                }
                long editedTime222 = messageEntity.getTime().getEditedTime();
                long deletedTime222 = messageEntity.getTime().getDeletedTime();
                long previousMessageTime222 = messageEntity.getTime().getPreviousMessageTime();
                replyTo = messageEntity.getReplyTo();
                if (replyTo == null) {
                }
                markdowns = messageEntity.getMarkdowns();
                if (markdowns != null) {
                }
                Message message7222 = new Message(acknowledgementKey, conversationId, chatId, gVar2, fVar2, messageId, messageUID, num, str42, str3, serverTime22, clientTime22, sender22, e11, bVar222, sequenceId22, rChatId22, attachment, meta, respondedMessage, isBot222, readStatus222, isTyping222, isEdited222, isDeleted222, dVar2, infoMessage, extras, editedTime222, deletedTime222, previousMessageTime222, message3, list, str, null, messageEntity.getTimeDifferenceContent(), z10, z11, messageEntity.isRightAligned(), false, false, j.c(messageEntity.getTime().getClientTime(), null, null, 3, null), 0, 384, null);
                return Message.copy$default(message7222, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, a(message7222, message), b(message7222, message), null, -1, 639, null);
            }
        }
        messageEntity2 = null;
        if (messageEntity2 == null) {
        }
        String displayName2 = messageEntity.getDisplayName();
        if (displayName2 == null) {
        }
        if (dVar == Message.d.Trigger) {
        }
        Message.d dVar22 = dVar;
        String acknowledgementKey2 = messageEntity.getAcknowledgementKey();
        String conversationId2 = messageEntity.getConversationId();
        String chatId2 = messageEntity.getChatId();
        if (messageEntity.getStatus() != null) {
        }
        Message.f fVar3 = Message.f.Sent;
        Message.f fVar22 = fVar3;
        String messageId2 = messageEntity.getMessageId();
        String messageUID2 = messageEntity.getMessageUID();
        if (message6 != null) {
        }
        if (message4 != null) {
        }
    }

    public static final List f(List list, Application application, Gson gson, boolean z10, Function2 function2) {
        Message copy$default;
        long j10;
        Object obj;
        Application application2;
        Gson gson2;
        Function2 function22;
        MessageEntity messageEntity;
        boolean z11;
        List list2 = list;
        Intrinsics.checkNotNullParameter(list2, "<this>");
        Application application3 = application;
        Intrinsics.checkNotNullParameter(application3, "application");
        Gson gson3 = gson;
        Intrinsics.checkNotNullParameter(gson3, "gson");
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        Message message = null;
        int i11 = 0;
        for (Object obj2 : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MessageEntity messageEntity2 = (MessageEntity) obj2;
            Message i13 = i(list2, application3, gson3, z10, function2, i12);
            if (message == null) {
                boolean z12 = !z10 ? i11 != 0 : i11 != list2.size() - 1;
                if (!z10 ? i11 != list2.size() - 1 : i11 != 0) {
                    application2 = application;
                    gson2 = gson;
                    function22 = function2;
                    messageEntity = messageEntity2;
                    z11 = false;
                } else {
                    application2 = application;
                    gson2 = gson;
                    function22 = function2;
                    messageEntity = messageEntity2;
                    z11 = true;
                }
                copy$default = e(messageEntity, application2, gson2, z12, z11, function22, i13);
            } else {
                copy$default = Message.copy$default(message, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, a(message, i13), b(message, i13), null, -1, 639, null);
            }
            Message message2 = copy$default;
            if (i11 > i10) {
                Intrinsics.checkNotNull(message2);
                if (message2.getMessageType() == Message.g.InfoMessage) {
                    Message.InfoMessage infoMessage = message2.getInfoMessage();
                    if (i.e(infoMessage != null ? infoMessage.getMode() : null)) {
                        Iterator<E> it = Message.InfoMessage.Mode.getEntries().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            C6966g.C6967a c6967a = C6966g.C6967a.f69072a;
                            String value = ((Message.InfoMessage.Mode) obj).getValue();
                            Message.InfoMessage infoMessage2 = message2.getInfoMessage();
                            String mode = infoMessage2 != null ? infoMessage2.getMode() : null;
                            Intrinsics.checkNotNull(mode);
                            if (c6967a.e(value, mode)) {
                                break;
                            }
                        }
                        if (!i.e(obj)) {
                        }
                    }
                }
                if (Intrinsics.areEqual(message2.isDeleted(), Boolean.TRUE)) {
                    int size = list2.size();
                    long j11 = 0;
                    while (i11 < size) {
                        MessageEntity messageEntity3 = (MessageEntity) list2.get(i11);
                        j10 = 1;
                        if (!Intrinsics.areEqual(messageEntity3.isDeleted(), Boolean.TRUE) || messageEntity3.getSender() == null || !Intrinsics.areEqual(messageEntity3.getSender(), message2.getSender())) {
                            i10 = i11 - 1;
                            break;
                        }
                        j11++;
                        i11++;
                    }
                    j10 = 1;
                    if (j11 > j10) {
                        i13 = i(list2, application, gson, z10, function2, i10 + 1);
                        message2 = Message.copy$default(message2, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, a(message2, i13), b(message2, i13), null, -1, 639, null);
                    }
                    Message message3 = message2;
                    Intrinsics.checkNotNull(message3);
                    message2 = Message.copy$default(message3, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, Long.valueOf(j11), null, false, false, false, false, false, null, -1, 1019, null);
                }
                Intrinsics.checkNotNull(message2);
                arrayList.add(message2);
            }
            message = i13;
            list2 = list;
            application3 = application;
            gson3 = gson;
            i11 = i12;
        }
        return arrayList;
    }

    public static /* synthetic */ Message g(MessageEntity messageEntity, Application application, Gson gson, boolean z10, boolean z11, Function2 function2, Message message, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        if ((i10 & 16) != 0) {
            function2 = null;
        }
        if ((i10 & 32) != 0) {
            message = null;
        }
        return e(messageEntity, application, gson, z10, z11, function2, message);
    }

    public static /* synthetic */ List h(List list, Application application, Gson gson, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function2 = null;
        }
        return f(list, application, gson, z10, function2);
    }

    public static final Message i(List list, Application application, Gson gson, boolean z10, Function2 function2, int i10) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl((MessageEntity) list.get(i10));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            m147constructorimpl = null;
        }
        MessageEntity messageEntity = (MessageEntity) m147constructorimpl;
        if (messageEntity != null) {
            return g(messageEntity, application, gson, !z10 ? i10 != 0 : i10 != list.size() - 1, !z10 ? i10 != list.size() - 1 : i10 != 0, function2, null, 32, null);
        }
        return null;
    }

    public static final String j(String str) {
        if ((StringsKt.contains$default((CharSequence) str, (CharSequence) "_", false, 2, (Object) null) ? str : null) != null) {
            int i10 = -1;
            int length = str.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (str.charAt(length) == '_') {
                        i10 = length;
                        break;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                }
            }
            String substring = str.substring(i10 + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (substring != null) {
                return substring;
            }
        }
        return str;
    }
}
