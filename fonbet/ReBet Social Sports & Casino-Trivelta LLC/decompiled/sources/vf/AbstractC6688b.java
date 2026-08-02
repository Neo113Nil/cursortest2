package vf;

import android.app.Application;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.twilio.voice.EventGroupType;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import com.zoho.livechat.android.modules.messages.data.remote.responses.MessageResponse;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.y;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import og.AbstractC5896h;
import og.i;
import og.j;
import og.m;

/* renamed from: vf.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6688b {
    /* JADX WARN: Code restructure failed: missing block: B:148:0x05aa, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r1, "$", r12, r10, (java.lang.Object) null) == true) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0240, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r15, (java.lang.CharSequence) com.zoho.livechat.android.modules.messages.domain.entities.Message.g.Image.getStringValue(), false, 2, (java.lang.Object) null) == true) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x034a, code lost:
    
        if (r0 == null) goto L179;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0496  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MessageEntity a(MessageResponse messageResponse, boolean z10, Application application, SalesIQChat salesIQChat, String str, String str2, String chatId, String str3, String str4, Gson gson) {
        k s10;
        k d10;
        long j10;
        String str5;
        String str6;
        String str7;
        long j11;
        long j12;
        Message.g a10;
        String str8;
        String str9;
        long j13;
        String str10;
        long j14;
        String stringValue;
        File file;
        String str11;
        Object m147constructorimpl;
        Throwable m150exceptionOrNullimpl;
        Long longOrNull;
        String stringValue2;
        k d11;
        h r10;
        k d12;
        h r11;
        String h10;
        k d13;
        h r12;
        Integer valueOf;
        boolean g10;
        MessageResponse.Message message;
        String str12;
        String str13;
        MessageResponse.Message message2;
        String comment;
        Integer num;
        String str14;
        String id2;
        String str15;
        String str16;
        String name;
        MessageResponse.Message message3;
        String str17;
        MessageResponse.Sender sender;
        int i10;
        boolean z11;
        boolean z12;
        Boolean bool;
        MessageResponse replyTo;
        String str18;
        String str19;
        String str20;
        int i11;
        boolean z13;
        String str21;
        MessageResponse.Sender sender2;
        boolean z14;
        String id3;
        h file2;
        k d14;
        String f10;
        String u10;
        Object c10;
        Object obj;
        k d15;
        h r13;
        h r14;
        h file3;
        k d16;
        Intrinsics.checkNotNullParameter(messageResponse, "<this>");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(gson, "gson");
        h meta = messageResponse.getMeta();
        if (meta == null || (d16 = AbstractC5896h.d(meta)) == null || (s10 = d16.s("input_card")) == null) {
            h meta2 = messageResponse.getMeta();
            s10 = (meta2 == null || (d10 = AbstractC5896h.d(meta2)) == null) ? null : d10.s("display_card");
        }
        MessageResponse.Message message4 = messageResponse.getMessage();
        k d17 = (message4 == null || (file3 = message4.getFile()) == null) ? null : AbstractC5896h.d(file3);
        String f11 = (d17 == null || (r14 = d17.r("type")) == null) ? null : AbstractC5896h.f(r14);
        String f12 = (d17 == null || (r13 = d17.r("name")) == null) ? null : AbstractC5896h.f(r13);
        String messageId = messageResponse.getMessageId();
        String valueOf2 = (messageId == null || messageId.length() == 0) ? String.valueOf(messageResponse.getServerTime()) : messageResponse.getMessageId();
        MessageResponse.Message message5 = messageResponse.getMessage();
        long longValue = (Intrinsics.areEqual(message5 != null ? message5.getMode() : null, "trigger") && i.e(messageResponse.getMessage().getTime())) ? messageResponse.getMessage().getTime().longValue() : messageResponse.getServerTime();
        Long longOrNull2 = StringsKt.toLongOrNull(valueOf2);
        long longValue2 = longOrNull2 != null ? longOrNull2.longValue() : longValue;
        MessageResponse.Message message6 = messageResponse.getMessage();
        boolean areEqual = Intrinsics.areEqual(message6 != null ? message6.getMode() : null, "trigger");
        Long sequenceId = messageResponse.getSequenceId();
        h meta3 = messageResponse.getMeta();
        if (meta3 == null || (d15 = AbstractC5896h.d(meta3)) == null) {
            j10 = 0;
        } else {
            j10 = 0;
            h r15 = d15.r("is_question");
            if (r15 != null && AbstractC5896h.a(r15)) {
                stringValue2 = Message.g.Question.getStringValue();
                stringValue = stringValue2;
                str8 = f12;
                str5 = valueOf2;
                str10 = null;
                str9 = null;
                j13 = j10;
                j14 = -1;
                valueOf = Integer.valueOf(Message.f.Sent.ordinal());
                String messageUID = messageResponse.getMessageUID();
                MessageResponse.Message message7 = messageResponse.getMessage();
                boolean g11 = i.g(message7 != null ? message7.getFile() : null);
                MessageResponse.Message message8 = messageResponse.getMessage();
                String v10 = (g11 | i.e(message8 != null ? message8.getComment() : null) ? messageResponse : null) != null ? gson.v(messageResponse.getMessage()) : null;
                MessageResponse.Message message9 = messageResponse.getMessage();
                g10 = i.g(message9 != null ? message9.getFile() : null);
                message = messageResponse.getMessage();
                if ((g10 | i.e(message != null ? message.getComment() : null) ? messageResponse : null) != null) {
                    MessageResponse.Message message10 = messageResponse.getMessage();
                    if (message10 != null) {
                        String text = messageResponse.getMessage().getText();
                        String u11 = text != null ? i.u(text) : null;
                        String comment2 = messageResponse.getMessage().getComment();
                        obj = MessageResponse.Message.copy$default(message10, u11, null, null, null, comment2 != null ? i.u(comment2) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262126, null);
                    } else {
                        obj = null;
                    }
                    str12 = stringValue;
                    str13 = gson.v(obj);
                } else {
                    str12 = stringValue;
                    str13 = null;
                }
                message2 = messageResponse.getMessage();
                if (message2 != null || (comment = message2.getText()) == null) {
                    MessageResponse.Message message11 = messageResponse.getMessage();
                    comment = message11 != null ? message11.getComment() : null;
                }
                if (comment != null || (c10 = m.c(comment)) == null) {
                    num = valueOf;
                    str14 = null;
                } else {
                    num = valueOf;
                    str14 = gson.v(c10);
                }
                if (areEqual) {
                    if (salesIQChat == null || (id2 = salesIQChat.getAttenderid()) == null) {
                        MessageResponse.Sender sender3 = messageResponse.getSender();
                        if (sender3 != null) {
                            id2 = sender3.getId();
                        }
                        str15 = v10;
                        str16 = null;
                    }
                    str15 = v10;
                    str16 = id2;
                } else {
                    MessageResponse.Sender sender4 = messageResponse.getSender();
                    if (sender4 != null) {
                        id2 = sender4.getId();
                        str15 = v10;
                        str16 = id2;
                    }
                    str15 = v10;
                    str16 = null;
                }
                if (areEqual) {
                    MessageResponse.Message message12 = messageResponse.getMessage();
                    if (message12 != null) {
                        name = message12.getDisplayName();
                    }
                    name = null;
                } else {
                    MessageResponse.Sender sender5 = messageResponse.getSender();
                    if (sender5 != null) {
                        name = sender5.getName();
                    }
                    name = null;
                }
                String v11 = (name != null || (u10 = i.u(name)) == null) ? null : gson.v(new Message.b(u10, m.b(u10)));
                message3 = messageResponse.getMessage();
                if (message3 != null || (file2 = message3.getFile()) == null || (d14 = AbstractC5896h.d(file2)) == null) {
                    str17 = null;
                } else {
                    h r16 = d14.r("blur_image");
                    if (r16 != null && (f10 = AbstractC5896h.f(r16)) != null) {
                        String a11 = m.a(f10);
                        if (a11 != null) {
                            f10 = a11;
                        }
                        d14.p("blur_image", f10);
                        Unit unit = Unit.INSTANCE;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    str17 = gson.u(d14);
                }
                h meta4 = messageResponse.getMeta();
                String u12 = meta4 != null ? gson.u(meta4) : null;
                sender = messageResponse.getSender();
                if (sender != null || (id3 = sender.getId()) == null) {
                    i10 = 2;
                    z11 = false;
                } else {
                    i10 = 2;
                    z11 = false;
                    if (StringsKt.startsWith$default(id3, com.google.crypto.tink.integration.android.b.f37029b, false, 2, (Object) null)) {
                        z12 = true;
                        Boolean readStatus = messageResponse.getReadStatus();
                        bool = Boolean.TRUE;
                        Boolean valueOf3 = (Intrinsics.areEqual(readStatus, bool) ? messageResponse : null) == null ? Boolean.valueOf(z10) : messageResponse.getReadStatus();
                        Boolean isEdited = messageResponse.isEdited();
                        Boolean isDeleted = messageResponse.isDeleted();
                        replyTo = messageResponse.getReplyTo();
                        if (replyTo == null) {
                            str18 = messageUID;
                            str19 = str13;
                            str20 = str5;
                            i11 = i10;
                            z13 = z11;
                            str21 = gson.v(a(replyTo, false, application, salesIQChat, str, str2, chatId, str3, str4, gson));
                        } else {
                            str18 = messageUID;
                            str19 = str13;
                            str20 = str5;
                            i11 = i10;
                            z13 = z11;
                            str21 = null;
                        }
                        sender2 = messageResponse.getSender();
                        if (Intrinsics.areEqual(sender2 == null ? sender2.getId() : null, str4)) {
                            MessageResponse.Sender sender6 = messageResponse.getSender();
                            z14 = (sender6 == null || (r1 = sender6.getId()) == null) ? true : true;
                            String v12 = ((str10 == null || str8 != null || str9 != null) ? messageResponse : null) != null ? gson.v(new Message.Extras(str10, str8, j13, j14, str9, null, null, null, false, 480, null)) : null;
                            Long lastMessageTime = messageResponse.getLastMessageTime();
                            MessageEntity.Time time = new MessageEntity.Time(longValue, longValue2, lastMessageTime != null ? lastMessageTime.longValue() : -1L, 0L, 0L, j.c(longValue, null, null, 3, null), 24, null);
                            if (Intrinsics.areEqual(messageResponse.isEdited(), bool)) {
                                Long editedTime = messageResponse.getEditedTime();
                                time = MessageEntity.Time.copy$default(time, 0L, 0L, 0L, editedTime != null ? editedTime.longValue() : -1L, 0L, null, 55, null);
                            } else if (Intrinsics.areEqual(messageResponse.isDeleted(), bool)) {
                                Long deletedTime = messageResponse.getDeletedTime();
                                time = MessageEntity.Time.copy$default(time, 0L, 0L, 0L, 0L, deletedTime != null ? deletedTime.longValue() : -1L, null, 47, null);
                            }
                            return new MessageEntity(str, str2, chatId, str3, sequenceId, str12, num, str20, str18, str15, str19, str14, str16, v11, str17, u12, null, z12, valueOf3, null, isEdited, isDeleted, str21, null, z13, v12, time);
                        }
                        if (!areEqual) {
                            z13 = z14;
                        }
                        if (((str10 == null || str8 != null || str9 != null) ? messageResponse : null) != null) {
                        }
                        Long lastMessageTime2 = messageResponse.getLastMessageTime();
                        MessageEntity.Time time2 = new MessageEntity.Time(longValue, longValue2, lastMessageTime2 != null ? lastMessageTime2.longValue() : -1L, 0L, 0L, j.c(longValue, null, null, 3, null), 24, null);
                        if (Intrinsics.areEqual(messageResponse.isEdited(), bool)) {
                        }
                        return new MessageEntity(str, str2, chatId, str3, sequenceId, str12, num, str20, str18, str15, str19, str14, str16, v11, str17, u12, null, z12, valueOf3, null, isEdited, isDeleted, str21, null, z13, v12, time2);
                    }
                }
                z12 = z11;
                Boolean readStatus2 = messageResponse.getReadStatus();
                bool = Boolean.TRUE;
                Boolean valueOf32 = (Intrinsics.areEqual(readStatus2, bool) ? messageResponse : null) == null ? Boolean.valueOf(z10) : messageResponse.getReadStatus();
                Boolean isEdited2 = messageResponse.isEdited();
                Boolean isDeleted2 = messageResponse.isDeleted();
                replyTo = messageResponse.getReplyTo();
                if (replyTo == null) {
                }
                sender2 = messageResponse.getSender();
                if (Intrinsics.areEqual(sender2 == null ? sender2.getId() : null, str4)) {
                }
                if (!areEqual) {
                }
                if (((str10 == null || str8 != null || str9 != null) ? messageResponse : null) != null) {
                }
                Long lastMessageTime22 = messageResponse.getLastMessageTime();
                MessageEntity.Time time22 = new MessageEntity.Time(longValue, longValue2, lastMessageTime22 != null ? lastMessageTime22.longValue() : -1L, 0L, 0L, j.c(longValue, null, null, 3, null), 24, null);
                if (Intrinsics.areEqual(messageResponse.isEdited(), bool)) {
                }
                return new MessageEntity(str, str2, chatId, str3, sequenceId, str12, num, str20, str18, str15, str19, str14, str16, v11, str17, u12, null, z12, valueOf32, null, isEdited2, isDeleted2, str21, null, z13, v12, time22);
            }
        }
        h meta5 = messageResponse.getMeta();
        String f13 = (meta5 == null || (d13 = AbstractC5896h.d(meta5)) == null || (r12 = d13.r("resource_type")) == null) ? null : AbstractC5896h.f(r12);
        Message.g gVar = Message.g.Article;
        if (Intrinsics.areEqual(f13, gVar.getStringValue())) {
            stringValue2 = gVar.getStringValue();
        } else if (s10 != null && s10.r("type") != null) {
            String f14 = AbstractC5896h.f(s10.r("type"));
            Message.g.a aVar = Message.g.Companion;
            if (Intrinsics.areEqual(f14, Message.g.Video.getStringValue())) {
                f14 = Message.g.WidgetVideo.getStringValue();
            } else if (Intrinsics.areEqual(f14, Message.g.Location.getStringValue())) {
                f14 = Message.g.WidgetLocation.getStringValue();
            } else if (Intrinsics.areEqual(f14, Message.g.File.getStringValue())) {
                f14 = Message.g.WidgetFileUpload.getStringValue();
            }
            stringValue2 = aVar.a(f14).getStringValue();
        } else if (areEqual) {
            stringValue2 = Message.g.Text.getStringValue();
        } else {
            h meta6 = messageResponse.getMeta();
            if (((meta6 == null || (d11 = AbstractC5896h.d(meta6)) == null || (r10 = d11.r("card_data")) == null || (d12 = AbstractC5896h.d(r10)) == null || (r11 = d12.r("type")) == null || (h10 = r11.h()) == null || !Intrinsics.areEqual(h10, Message.g.Location.getStringValue())) ? null : messageResponse) == null) {
                if (((i.e(f11) && i.e(f12)) ? messageResponse : null) != null) {
                    Intrinsics.checkNotNull(f11);
                    Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) StringsKt.split$default((CharSequence) f11, new String[]{"/"}, false, 0, 6, (Object) null));
                    Me.a aVar2 = Me.a.f7650a;
                    Intrinsics.checkNotNull(f12);
                    f12 = aVar2.a(f12, valueOf2);
                    File fileFromDisk = y.INSTANCE.getFileFromDisk(f12);
                    str7 = fileFromDisk.getAbsolutePath();
                    long length = fileFromDisk.length();
                    String str22 = (String) firstOrNull;
                    if (str22 != null) {
                        file = fileFromDisk;
                    } else {
                        file = fileFromDisk;
                    }
                    if ((str22 == null || !StringsKt.contains$default((CharSequence) str22, (CharSequence) Message.g.Audio.getStringValue(), false, 2, (Object) null)) && (str22 == null || !StringsKt.contains$default((CharSequence) str22, (CharSequence) Message.g.Video.getStringValue(), false, 2, (Object) null))) {
                        str5 = valueOf2;
                        firstOrNull = Message.g.File.getStringValue();
                        str6 = null;
                        j12 = -1;
                        String str23 = (String) firstOrNull;
                        a10 = str23 == null ? Message.g.Companion.a(str23) : null;
                        j11 = length;
                    }
                    CharSequence charSequence = (CharSequence) firstOrNull;
                    if ((StringsKt.contains$default(charSequence, (CharSequence) Message.g.Video.getStringValue(), false, 2, (Object) null) || StringsKt.contains$default(charSequence, (CharSequence) Message.g.Audio.getStringValue(), false, 2, (Object) null)) && length > j10) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            mediaMetadataRetriever.setDataSource(application, Uri.fromFile(file));
                            str11 = mediaMetadataRetriever.extractMetadata(9);
                            try {
                                m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th2) {
                                th = th2;
                                Result.Companion companion2 = Result.INSTANCE;
                                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                                if (m150exceptionOrNullimpl != null) {
                                }
                                if (str11 != null) {
                                }
                                if (j12 == -1) {
                                }
                                String str232 = (String) firstOrNull;
                                if (str232 == null) {
                                }
                                j11 = length;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str11 = null;
                        }
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                            firstOrNull = Message.g.File.getStringValue();
                            LiveChatUtil.log(m150exceptionOrNullimpl);
                        }
                        j12 = (str11 != null || (longOrNull = StringsKt.toLongOrNull(str11)) == null) ? -1L : longOrNull.longValue();
                        if (j12 == -1) {
                            str5 = valueOf2;
                            long j15 = j12 / 1000;
                            long j16 = 60;
                            Object obj2 = firstOrNull;
                            long j17 = j15 / j16;
                            long j18 = j15 % j16;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(j17 < 10 ? "0" : "");
                            sb2.append(j17);
                            String sb3 = sb2.toString();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(j18 < 10 ? "0" : "");
                            sb4.append(j18);
                            str6 = sb3 + ':' + sb4.toString();
                            firstOrNull = obj2;
                        } else {
                            str5 = valueOf2;
                            str6 = null;
                        }
                        String str2322 = (String) firstOrNull;
                        if (str2322 == null) {
                        }
                        j11 = length;
                    } else {
                        str5 = valueOf2;
                        str6 = null;
                        j12 = -1;
                        String str23222 = (String) firstOrNull;
                        if (str23222 == null) {
                        }
                        j11 = length;
                    }
                } else {
                    str5 = valueOf2;
                    str6 = null;
                    str7 = null;
                    j11 = j10;
                    j12 = -1;
                }
                String type = messageResponse.getType();
                a10 = type != null ? Message.g.Companion.a(type) : Message.g.Text;
                str8 = f12;
                str9 = str6;
                j13 = j11;
                str10 = str7;
                j14 = j12;
                stringValue = a10.getStringValue();
                valueOf = Integer.valueOf(Message.f.Sent.ordinal());
                String messageUID2 = messageResponse.getMessageUID();
                MessageResponse.Message message72 = messageResponse.getMessage();
                boolean g112 = i.g(message72 != null ? message72.getFile() : null);
                MessageResponse.Message message82 = messageResponse.getMessage();
                if ((g112 | i.e(message82 != null ? message82.getComment() : null) ? messageResponse : null) != null) {
                }
                MessageResponse.Message message92 = messageResponse.getMessage();
                g10 = i.g(message92 != null ? message92.getFile() : null);
                message = messageResponse.getMessage();
                if ((g10 | i.e(message != null ? message.getComment() : null) ? messageResponse : null) != null) {
                }
                message2 = messageResponse.getMessage();
                if (message2 != null) {
                }
                MessageResponse.Message message112 = messageResponse.getMessage();
                if (message112 != null) {
                }
                if (comment != null) {
                }
                num = valueOf;
                str14 = null;
                if (areEqual) {
                }
                if (areEqual) {
                }
                if (name != null) {
                }
                message3 = messageResponse.getMessage();
                if (message3 != null) {
                }
                str17 = null;
                h meta42 = messageResponse.getMeta();
                if (meta42 != null) {
                }
                sender = messageResponse.getSender();
                if (sender != null) {
                }
                i10 = 2;
                z11 = false;
                z12 = z11;
                Boolean readStatus22 = messageResponse.getReadStatus();
                bool = Boolean.TRUE;
                Boolean valueOf322 = (Intrinsics.areEqual(readStatus22, bool) ? messageResponse : null) == null ? Boolean.valueOf(z10) : messageResponse.getReadStatus();
                Boolean isEdited22 = messageResponse.isEdited();
                Boolean isDeleted22 = messageResponse.isDeleted();
                replyTo = messageResponse.getReplyTo();
                if (replyTo == null) {
                }
                sender2 = messageResponse.getSender();
                if (Intrinsics.areEqual(sender2 == null ? sender2.getId() : null, str4)) {
                }
                if (!areEqual) {
                }
                if (((str10 == null || str8 != null || str9 != null) ? messageResponse : null) != null) {
                }
                Long lastMessageTime222 = messageResponse.getLastMessageTime();
                MessageEntity.Time time222 = new MessageEntity.Time(longValue, longValue2, lastMessageTime222 != null ? lastMessageTime222.longValue() : -1L, 0L, 0L, j.c(longValue, null, null, 3, null), 24, null);
                if (Intrinsics.areEqual(messageResponse.isEdited(), bool)) {
                }
                return new MessageEntity(str, str2, chatId, str3, sequenceId, str12, num, str20, str18, str15, str19, str14, str16, v11, str17, u12, null, z12, valueOf322, null, isEdited22, isDeleted22, str21, null, z13, v12, time222);
            }
            stringValue2 = Message.g.Location.getStringValue();
        }
        stringValue = stringValue2;
        str8 = f12;
        str5 = valueOf2;
        str10 = null;
        str9 = null;
        j13 = j10;
        j14 = -1;
        valueOf = Integer.valueOf(Message.f.Sent.ordinal());
        String messageUID22 = messageResponse.getMessageUID();
        MessageResponse.Message message722 = messageResponse.getMessage();
        boolean g1122 = i.g(message722 != null ? message722.getFile() : null);
        MessageResponse.Message message822 = messageResponse.getMessage();
        if ((g1122 | i.e(message822 != null ? message822.getComment() : null) ? messageResponse : null) != null) {
        }
        MessageResponse.Message message922 = messageResponse.getMessage();
        g10 = i.g(message922 != null ? message922.getFile() : null);
        message = messageResponse.getMessage();
        if ((g10 | i.e(message != null ? message.getComment() : null) ? messageResponse : null) != null) {
        }
        message2 = messageResponse.getMessage();
        if (message2 != null) {
        }
        MessageResponse.Message message1122 = messageResponse.getMessage();
        if (message1122 != null) {
        }
        if (comment != null) {
        }
        num = valueOf;
        str14 = null;
        if (areEqual) {
        }
        if (areEqual) {
        }
        if (name != null) {
        }
        message3 = messageResponse.getMessage();
        if (message3 != null) {
        }
        str17 = null;
        h meta422 = messageResponse.getMeta();
        if (meta422 != null) {
        }
        sender = messageResponse.getSender();
        if (sender != null) {
        }
        i10 = 2;
        z11 = false;
        z12 = z11;
        Boolean readStatus222 = messageResponse.getReadStatus();
        bool = Boolean.TRUE;
        Boolean valueOf3222 = (Intrinsics.areEqual(readStatus222, bool) ? messageResponse : null) == null ? Boolean.valueOf(z10) : messageResponse.getReadStatus();
        Boolean isEdited222 = messageResponse.isEdited();
        Boolean isDeleted222 = messageResponse.isDeleted();
        replyTo = messageResponse.getReplyTo();
        if (replyTo == null) {
        }
        sender2 = messageResponse.getSender();
        if (Intrinsics.areEqual(sender2 == null ? sender2.getId() : null, str4)) {
        }
        if (!areEqual) {
        }
        if (((str10 == null || str8 != null || str9 != null) ? messageResponse : null) != null) {
        }
        Long lastMessageTime2222 = messageResponse.getLastMessageTime();
        MessageEntity.Time time2222 = new MessageEntity.Time(longValue, longValue2, lastMessageTime2222 != null ? lastMessageTime2222.longValue() : -1L, 0L, 0L, j.c(longValue, null, null, 3, null), 24, null);
        if (Intrinsics.areEqual(messageResponse.isEdited(), bool)) {
        }
        return new MessageEntity(str, str2, chatId, str3, sequenceId, str12, num, str20, str18, str15, str19, str14, str16, v11, str17, u12, null, z12, valueOf3222, null, isEdited222, isDeleted222, str21, null, z13, v12, time2222);
    }

    public static final List b(List list, Application application, SalesIQChat salesIQChat, String str, String str2, String str3, String str4, String str5, Gson gson) {
        int i10;
        MessageResponse messageResponse;
        boolean z10;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Application application2 = application;
        Intrinsics.checkNotNullParameter(application2, "application");
        String chatId = str3;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Gson gson2 = gson;
        Intrinsics.checkNotNullParameter(gson2, "gson");
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i10 = -1;
                break;
            }
            if (Intrinsics.areEqual(((MessageResponse) listIterator.previous()).getReadStatus(), Boolean.TRUE)) {
                i10 = listIterator.nextIndex();
                break;
            }
        }
        int i11 = i10;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MessageResponse messageResponse2 = (MessageResponse) obj;
            MessageResponse.Message message = messageResponse2.getMessage();
            if (i.g(message != null ? message.getFormType() : null)) {
                MessageResponse.Message message2 = messageResponse2.getMessage();
                if (!Intrinsics.areEqual(message2 != null ? message2.getMode() : null, EventGroupType.FEEDBACK_EVENT_GROUP)) {
                    if (i12 < i11) {
                        z10 = true;
                        messageResponse = messageResponse2;
                    } else {
                        messageResponse = messageResponse2;
                        z10 = false;
                    }
                    MessageEntity a10 = a(messageResponse, z10, application2, salesIQChat, str, str2, chatId, str4, str5, gson2);
                    MessageResponse.Message message3 = messageResponse.getMessage();
                    arrayList.add(MessageEntity.copy$default(a10, null, null, null, null, null, i.g(message3 != null ? message3.getFormType() : null) ? a10.getMessageType() : Message.g.Ignore.getStringValue(), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, null, 134217695, null));
                }
            }
            application2 = application;
            chatId = str3;
            gson2 = gson;
            i12 = i13;
        }
        return arrayList;
    }
}
