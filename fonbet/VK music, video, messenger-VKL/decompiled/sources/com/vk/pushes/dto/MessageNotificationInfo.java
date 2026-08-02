package com.vk.pushes.dto;

import com.vk.core.serialize.Serializer;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import java.util.List;
import xsna.epx;
import xsna.ho8;

/* compiled from: MessageNotificationInfo.kt */
/* loaded from: classes5.dex */
public final class MessageNotificationInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MessageNotificationInfo> CREATOR = new a();
    public final MessageNotificationContainer b;
    public final String c;
    public final String d;
    public final List<PushMessage> e;
    public final String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MessageNotificationInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MessageNotificationInfo a(Serializer serializer) {
            return new MessageNotificationInfo((MessageNotificationContainer) serializer.G(MessageNotificationContainer.class.getClassLoader()), serializer.H(), serializer.H(), serializer.j(PushMessage.CREATOR), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MessageNotificationInfo[i];
        }
    }

    public MessageNotificationInfo(MessageNotificationContainer messageNotificationContainer, String str, String str2, List<PushMessage> list, String str3) {
        this.b = messageNotificationContainer;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = str3;
    }

    public static MessageNotificationInfo zb(MessageNotificationInfo messageNotificationInfo, MessageNotificationContainer messageNotificationContainer, List list, String str, int i) {
        String str2 = messageNotificationInfo.c;
        String str3 = messageNotificationInfo.d;
        if ((i & 16) != 0) {
            str = messageNotificationInfo.f;
        }
        messageNotificationInfo.getClass();
        return new MessageNotificationInfo(messageNotificationContainer, str2, str3, list, str);
    }

    public final String Ab() {
        return this.f;
    }

    public final MessageNotificationContainer Bb() {
        return this.b;
    }

    public final List<PushMessage> Cb() {
        return this.e;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.o0(this.e);
        serializer.j0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageNotificationInfo)) {
            return false;
        }
        MessageNotificationInfo messageNotificationInfo = (MessageNotificationInfo) obj;
        return epx.f(this.b, messageNotificationInfo.b) && epx.f(this.c, messageNotificationInfo.c) && epx.f(this.d, messageNotificationInfo.d) && epx.f(this.e, messageNotificationInfo.e) && epx.f(this.f, messageNotificationInfo.f);
    }

    public final int hashCode() {
        MessageNotificationContainer messageNotificationContainer = this.b;
        int hashCode = (messageNotificationContainer == null ? 0 : messageNotificationContainer.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PushMessage> list = this.e;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageNotificationInfo(container=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        sb.append(this.c);
        sb.append(", bigImageUrl=");
        sb.append(this.d);
        sb.append(", unreadMessages=");
        sb.append(this.e);
        sb.append(", chatImageUrl=");
        return ho8.a(sb, this.f, ')');
    }
}
