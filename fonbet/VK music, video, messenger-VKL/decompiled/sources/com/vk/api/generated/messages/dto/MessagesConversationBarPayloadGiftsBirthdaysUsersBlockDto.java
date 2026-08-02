package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    @pmi0("user_ids")
    private final List<UserId> userIds;

    /* compiled from: MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto[] newArray(int i) {
            return new MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<UserId> d() {
        return this.userIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto)) {
            return false;
        }
        MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto messagesConversationBarPayloadGiftsBirthdaysUsersBlockDto = (MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto) obj;
        return epx.f(this.title, messagesConversationBarPayloadGiftsBirthdaysUsersBlockDto.title) && epx.f(this.userIds, messagesConversationBarPayloadGiftsBirthdaysUsersBlockDto.userIds);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UserId> list = this.userIds;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto(title=");
        sb.append(this.title);
        sb.append(", userIds=");
        return ms9.a(')', sb, this.userIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<UserId> list = this.userIds;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto(String str, List<UserId> list) {
        this.title = str;
        this.userIds = list;
    }

    public /* synthetic */ MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
