package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MessagesAddChatUsersResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesAddChatUsersResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesAddChatUsersResponseDto> CREATOR = new a();

    @pmi0("failed_peer_ids")
    private final List<UserId> failedPeerIds;

    @pmi0("failed_phone_numbers")
    private final List<String> failedPhoneNumbers;

    @pmi0("invitees")
    private final List<UserId> invitees;

    /* compiled from: MessagesAddChatUsersResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesAddChatUsersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesAddChatUsersResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(MessagesAddChatUsersResponseDto.class, parcel, arrayList, i2, 1);
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = bo.b(MessagesAddChatUsersResponseDto.class, parcel, arrayList2, i, 1);
            }
            return new MessagesAddChatUsersResponseDto(arrayList, createStringArrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesAddChatUsersResponseDto[] newArray(int i) {
            return new MessagesAddChatUsersResponseDto[i];
        }
    }

    public MessagesAddChatUsersResponseDto(List<UserId> list, List<String> list2, List<UserId> list3) {
        this.failedPeerIds = list;
        this.failedPhoneNumbers = list2;
        this.invitees = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesAddChatUsersResponseDto)) {
            return false;
        }
        MessagesAddChatUsersResponseDto messagesAddChatUsersResponseDto = (MessagesAddChatUsersResponseDto) obj;
        return epx.f(this.failedPeerIds, messagesAddChatUsersResponseDto.failedPeerIds) && epx.f(this.failedPhoneNumbers, messagesAddChatUsersResponseDto.failedPhoneNumbers) && epx.f(this.invitees, messagesAddChatUsersResponseDto.invitees);
    }

    public final int hashCode() {
        return this.invitees.hashCode() + fw3.a(this.failedPeerIds.hashCode() * 31, 31, this.failedPhoneNumbers);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesAddChatUsersResponseDto(failedPeerIds=");
        sb.append(this.failedPeerIds);
        sb.append(", failedPhoneNumbers=");
        sb.append(this.failedPhoneNumbers);
        sb.append(", invitees=");
        return ms9.a(')', sb, this.invitees);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.failedPeerIds);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeStringList(this.failedPhoneNumbers);
        Iterator a3 = ao.a(parcel, this.invitees);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
    }
}
