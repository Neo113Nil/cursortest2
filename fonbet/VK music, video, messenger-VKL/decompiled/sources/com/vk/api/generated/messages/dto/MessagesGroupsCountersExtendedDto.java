package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesGroupsCountersExtendedDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGroupsCountersExtendedDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGroupsCountersExtendedDto> CREATOR = new a();

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("important_dialogs")
    private final Integer importantDialogs;

    @pmi0("unanswered_dialogs")
    private final Integer unansweredDialogs;

    @pmi0("unread_dialogs")
    private final Integer unreadDialogs;

    /* compiled from: MessagesGroupsCountersExtendedDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGroupsCountersExtendedDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGroupsCountersExtendedDto createFromParcel(Parcel parcel) {
            return new MessagesGroupsCountersExtendedDto((UserId) parcel.readParcelable(MessagesGroupsCountersExtendedDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGroupsCountersExtendedDto[] newArray(int i) {
            return new MessagesGroupsCountersExtendedDto[i];
        }
    }

    public MessagesGroupsCountersExtendedDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGroupsCountersExtendedDto)) {
            return false;
        }
        MessagesGroupsCountersExtendedDto messagesGroupsCountersExtendedDto = (MessagesGroupsCountersExtendedDto) obj;
        return epx.f(this.groupId, messagesGroupsCountersExtendedDto.groupId) && epx.f(this.importantDialogs, messagesGroupsCountersExtendedDto.importantDialogs) && epx.f(this.unansweredDialogs, messagesGroupsCountersExtendedDto.unansweredDialogs) && epx.f(this.unreadDialogs, messagesGroupsCountersExtendedDto.unreadDialogs);
    }

    public final int hashCode() {
        UserId userId = this.groupId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Integer num = this.importantDialogs;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unansweredDialogs;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.unreadDialogs;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGroupsCountersExtendedDto(groupId=");
        sb.append(this.groupId);
        sb.append(", importantDialogs=");
        sb.append(this.importantDialogs);
        sb.append(", unansweredDialogs=");
        sb.append(this.unansweredDialogs);
        sb.append(", unreadDialogs=");
        return uqi.b(sb, this.unreadDialogs, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.groupId, i);
        Integer num = this.importantDialogs;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.unansweredDialogs;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.unreadDialogs;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public MessagesGroupsCountersExtendedDto(UserId userId, Integer num, Integer num2, Integer num3) {
        this.groupId = userId;
        this.importantDialogs = num;
        this.unansweredDialogs = num2;
        this.unreadDialogs = num3;
    }

    public /* synthetic */ MessagesGroupsCountersExtendedDto(UserId userId, Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }
}
