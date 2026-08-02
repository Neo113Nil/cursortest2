package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsTrackCodeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTrackCodeDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTrackCodeDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: GroupsTrackCodeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTrackCodeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTrackCodeDto createFromParcel(Parcel parcel) {
            return new GroupsTrackCodeDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTrackCodeDto[] newArray(int i) {
            return new GroupsTrackCodeDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsTrackCodeDto() {
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
        if (!(obj instanceof GroupsTrackCodeDto)) {
            return false;
        }
        GroupsTrackCodeDto groupsTrackCodeDto = (GroupsTrackCodeDto) obj;
        return epx.f(this.id, groupsTrackCodeDto.id) && epx.f(this.trackCode, groupsTrackCodeDto.trackCode);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.trackCode;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTrackCodeDto(id=");
        sb.append(this.id);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.trackCode);
    }

    public GroupsTrackCodeDto(Integer num, String str) {
        this.id = num;
        this.trackCode = str;
    }

    public /* synthetic */ GroupsTrackCodeDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
