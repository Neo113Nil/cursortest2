package com.vk.api.generated.utils.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UtilsDomainResolvedDto.kt */
/* loaded from: classes15.dex */
public final class UtilsDomainResolvedDto implements Parcelable {
    public static final Parcelable.Creator<UtilsDomainResolvedDto> CREATOR = new a();

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("object_id")
    private final Integer objectId;

    @pmi0("type")
    private final UtilsDomainResolvedTypeDto type;

    /* compiled from: UtilsDomainResolvedDto.kt */
    public static final class a implements Parcelable.Creator<UtilsDomainResolvedDto> {
        @Override // android.os.Parcelable.Creator
        public final UtilsDomainResolvedDto createFromParcel(Parcel parcel) {
            return new UtilsDomainResolvedDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UserId) parcel.readParcelable(UtilsDomainResolvedDto.class.getClassLoader()), parcel.readInt() != 0 ? UtilsDomainResolvedTypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UtilsDomainResolvedDto[] newArray(int i) {
            return new UtilsDomainResolvedDto[i];
        }
    }

    public UtilsDomainResolvedDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.objectId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UtilsDomainResolvedTypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsDomainResolvedDto)) {
            return false;
        }
        UtilsDomainResolvedDto utilsDomainResolvedDto = (UtilsDomainResolvedDto) obj;
        return epx.f(this.objectId, utilsDomainResolvedDto.objectId) && epx.f(this.groupId, utilsDomainResolvedDto.groupId) && this.type == utilsDomainResolvedDto.type;
    }

    public final int hashCode() {
        Integer num = this.objectId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.groupId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto = this.type;
        return hashCode2 + (utilsDomainResolvedTypeDto != null ? utilsDomainResolvedTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "UtilsDomainResolvedDto(objectId=" + this.objectId + ", groupId=" + this.groupId + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.objectId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.groupId, i);
        UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto = this.type;
        if (utilsDomainResolvedTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            utilsDomainResolvedTypeDto.writeToParcel(parcel, i);
        }
    }

    public UtilsDomainResolvedDto(Integer num, UserId userId, UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto) {
        this.objectId = num;
        this.groupId = userId;
        this.type = utilsDomainResolvedTypeDto;
    }

    public /* synthetic */ UtilsDomainResolvedDto(Integer num, UserId userId, UtilsDomainResolvedTypeDto utilsDomainResolvedTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : utilsDomainResolvedTypeDto);
    }
}
