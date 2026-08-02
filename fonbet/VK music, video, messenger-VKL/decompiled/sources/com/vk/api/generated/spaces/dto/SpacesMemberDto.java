package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.gp;
import xsna.k73;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: SpacesMemberDto.kt */
/* loaded from: classes15.dex */
public final class SpacesMemberDto implements Parcelable {
    public static final Parcelable.Creator<SpacesMemberDto> CREATOR = new a();

    @pmi0("entity_version")
    private final long entityVersion;

    @pmi0("invited_by")
    private final UserId invitedBy;

    @pmi0("join_date")
    private final int joinDate;

    @pmi0("member_id")
    private final long memberId;

    @pmi0("profile_id")
    private final UserId profileId;

    @pmi0("role_ids")
    private final List<Long> roleIds;

    @pmi0("status_in_space")
    private final int statusInSpace;

    /* compiled from: SpacesMemberDto.kt */
    public static final class a implements Parcelable.Creator<SpacesMemberDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesMemberDto createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = k73.b(parcel, arrayList, i, 1);
            }
            return new SpacesMemberDto(readLong, readInt, arrayList, parcel.readInt(), parcel.readLong(), (UserId) parcel.readParcelable(SpacesMemberDto.class.getClassLoader()), (UserId) parcel.readParcelable(SpacesMemberDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesMemberDto[] newArray(int i) {
            return new SpacesMemberDto[i];
        }
    }

    public SpacesMemberDto(long j, int i, List<Long> list, int i2, long j2, UserId userId, UserId userId2) {
        this.memberId = j;
        this.joinDate = i;
        this.roleIds = list;
        this.statusInSpace = i2;
        this.entityVersion = j2;
        this.invitedBy = userId;
        this.profileId = userId2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesMemberDto)) {
            return false;
        }
        SpacesMemberDto spacesMemberDto = (SpacesMemberDto) obj;
        return this.memberId == spacesMemberDto.memberId && this.joinDate == spacesMemberDto.joinDate && epx.f(this.roleIds, spacesMemberDto.roleIds) && this.statusInSpace == spacesMemberDto.statusInSpace && this.entityVersion == spacesMemberDto.entityVersion && epx.f(this.invitedBy, spacesMemberDto.invitedBy) && epx.f(this.profileId, spacesMemberDto.profileId);
    }

    public final int hashCode() {
        int a2 = bh10.a(shy.a(this.statusInSpace, fw3.a(shy.a(this.joinDate, Long.hashCode(this.memberId) * 31, 31), 31, this.roleIds), 31), 31, this.entityVersion);
        UserId userId = this.invitedBy;
        int hashCode = (a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UserId userId2 = this.profileId;
        return hashCode + (userId2 != null ? Long.hashCode(userId2.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesMemberDto(memberId=");
        sb.append(this.memberId);
        sb.append(", joinDate=");
        sb.append(this.joinDate);
        sb.append(", roleIds=");
        sb.append(this.roleIds);
        sb.append(", statusInSpace=");
        sb.append(this.statusInSpace);
        sb.append(", entityVersion=");
        sb.append(this.entityVersion);
        sb.append(", invitedBy=");
        sb.append(this.invitedBy);
        sb.append(", profileId=");
        return gp.b(sb, this.profileId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.memberId);
        parcel.writeInt(this.joinDate);
        Iterator a2 = ao.a(parcel, this.roleIds);
        while (a2.hasNext()) {
            parcel.writeLong(((Number) a2.next()).longValue());
        }
        parcel.writeInt(this.statusInSpace);
        parcel.writeLong(this.entityVersion);
        parcel.writeParcelable(this.invitedBy, i);
        parcel.writeParcelable(this.profileId, i);
    }

    public /* synthetic */ SpacesMemberDto(long j, int i, List list, int i2, long j2, UserId userId, UserId userId2, int i3, zcl zclVar) {
        this(j, i, list, i2, j2, (i3 & 32) != 0 ? null : userId, (i3 & 64) != 0 ? null : userId2);
    }
}
