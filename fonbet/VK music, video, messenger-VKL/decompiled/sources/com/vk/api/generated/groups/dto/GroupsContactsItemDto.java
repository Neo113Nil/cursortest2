package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsContactsItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsContactsItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsContactsItemDto> CREATOR = new a();

    @pmi0("contact_id")
    private final Long contactId;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    private final String desc;

    @pmi0("email")
    private final String email;

    @pmi0("phone")
    private final String phone;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: GroupsContactsItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsContactsItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsContactsItemDto createFromParcel(Parcel parcel) {
            return new GroupsContactsItemDto((UserId) parcel.readParcelable(GroupsContactsItemDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsContactsItemDto[] newArray(int i) {
            return new GroupsContactsItemDto[i];
        }
    }

    public GroupsContactsItemDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsContactsItemDto)) {
            return false;
        }
        GroupsContactsItemDto groupsContactsItemDto = (GroupsContactsItemDto) obj;
        return epx.f(this.userId, groupsContactsItemDto.userId) && epx.f(this.desc, groupsContactsItemDto.desc) && epx.f(this.phone, groupsContactsItemDto.phone) && epx.f(this.email, groupsContactsItemDto.email) && epx.f(this.contactId, groupsContactsItemDto.contactId);
    }

    public final int hashCode() {
        UserId userId = this.userId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.desc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.contactId;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsContactsItemDto(userId=");
        sb.append(this.userId);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", contactId=");
        return iq.b(sb, this.contactId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.desc);
        parcel.writeString(this.phone);
        parcel.writeString(this.email);
        Long l = this.contactId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
    }

    public GroupsContactsItemDto(UserId userId, String str, String str2, String str3, Long l) {
        this.userId = userId;
        this.desc = str;
        this.phone = str2;
        this.email = str3;
        this.contactId = l;
    }

    public /* synthetic */ GroupsContactsItemDto(UserId userId, String str, String str2, String str3, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : l);
    }
}
