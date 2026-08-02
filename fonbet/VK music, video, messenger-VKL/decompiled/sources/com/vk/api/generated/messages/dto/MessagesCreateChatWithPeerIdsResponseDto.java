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
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesCreateChatWithPeerIdsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCreateChatWithPeerIdsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesCreateChatWithPeerIdsResponseDto> CREATOR = new a();

    @pmi0("chat_id")
    private final Integer chatId;

    @pmi0("failed_phone_numbers")
    private final List<String> failedPhoneNumbers;

    @pmi0("peer_ids")
    private final List<UserId> peerIds;

    /* compiled from: MessagesCreateChatWithPeerIdsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCreateChatWithPeerIdsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesCreateChatWithPeerIdsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MessagesCreateChatWithPeerIdsResponseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MessagesCreateChatWithPeerIdsResponseDto(valueOf, arrayList, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCreateChatWithPeerIdsResponseDto[] newArray(int i) {
            return new MessagesCreateChatWithPeerIdsResponseDto[i];
        }
    }

    public MessagesCreateChatWithPeerIdsResponseDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.chatId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.failedPhoneNumbers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesCreateChatWithPeerIdsResponseDto)) {
            return false;
        }
        MessagesCreateChatWithPeerIdsResponseDto messagesCreateChatWithPeerIdsResponseDto = (MessagesCreateChatWithPeerIdsResponseDto) obj;
        return epx.f(this.chatId, messagesCreateChatWithPeerIdsResponseDto.chatId) && epx.f(this.peerIds, messagesCreateChatWithPeerIdsResponseDto.peerIds) && epx.f(this.failedPhoneNumbers, messagesCreateChatWithPeerIdsResponseDto.failedPhoneNumbers);
    }

    public final int hashCode() {
        Integer num = this.chatId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<UserId> list = this.peerIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.failedPhoneNumbers;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesCreateChatWithPeerIdsResponseDto(chatId=");
        sb.append(this.chatId);
        sb.append(", peerIds=");
        sb.append(this.peerIds);
        sb.append(", failedPhoneNumbers=");
        return ms9.a(')', sb, this.failedPhoneNumbers);
    }

    public final List<UserId> u2() {
        return this.peerIds;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.chatId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<UserId> list = this.peerIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeStringList(this.failedPhoneNumbers);
    }

    public MessagesCreateChatWithPeerIdsResponseDto(Integer num, List<UserId> list, List<String> list2) {
        this.chatId = num;
        this.peerIds = list;
        this.failedPhoneNumbers = list2;
    }

    public /* synthetic */ MessagesCreateChatWithPeerIdsResponseDto(Integer num, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
