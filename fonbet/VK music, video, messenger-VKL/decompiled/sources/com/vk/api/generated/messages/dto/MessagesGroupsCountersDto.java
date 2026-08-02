package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesGroupsCountersDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGroupsCountersDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGroupsCountersDto> CREATOR = new a();

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("unread_dialogs")
    private final Integer unreadDialogs;

    /* compiled from: MessagesGroupsCountersDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGroupsCountersDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGroupsCountersDto createFromParcel(Parcel parcel) {
            return new MessagesGroupsCountersDto((UserId) parcel.readParcelable(MessagesGroupsCountersDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGroupsCountersDto[] newArray(int i) {
            return new MessagesGroupsCountersDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesGroupsCountersDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGroupsCountersDto)) {
            return false;
        }
        MessagesGroupsCountersDto messagesGroupsCountersDto = (MessagesGroupsCountersDto) obj;
        return epx.f(this.groupId, messagesGroupsCountersDto.groupId) && epx.f(this.unreadDialogs, messagesGroupsCountersDto.unreadDialogs);
    }

    public final int hashCode() {
        UserId userId = this.groupId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Integer num = this.unreadDialogs;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGroupsCountersDto(groupId=");
        sb.append(this.groupId);
        sb.append(", unreadDialogs=");
        return uqi.b(sb, this.unreadDialogs, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.groupId, i);
        Integer num = this.unreadDialogs;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public MessagesGroupsCountersDto(UserId userId, Integer num) {
        this.groupId = userId;
        this.unreadDialogs = num;
    }

    public /* synthetic */ MessagesGroupsCountersDto(UserId userId, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : num);
    }
}
