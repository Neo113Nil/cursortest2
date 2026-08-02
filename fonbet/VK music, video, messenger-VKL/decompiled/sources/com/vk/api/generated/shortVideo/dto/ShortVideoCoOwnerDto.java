package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoCoOwnerDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoCoOwnerDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoCoOwnerDto> CREATOR = new a();

    @pmi0("can_set_status")
    private final boolean canSetStatus;

    @pmi0("main_tab_state")
    private final ShortVideoMainTabStateDto mainTabState;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoCoOwnerDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("approved")
        public static final StatusDto APPROVED;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("pending")
        public static final StatusDto PENDING;

        @pmi0("rejected")
        public static final StatusDto REJECTED;
        private final String value;

        /* compiled from: ShortVideoCoOwnerDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("PENDING", 0, "pending");
            PENDING = statusDto;
            StatusDto statusDto2 = new StatusDto("APPROVED", 1, "approved");
            APPROVED = statusDto2;
            StatusDto statusDto3 = new StatusDto("REJECTED", 2, "rejected");
            REJECTED = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: ShortVideoCoOwnerDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoCoOwnerDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoCoOwnerDto createFromParcel(Parcel parcel) {
            return new ShortVideoCoOwnerDto((UserId) parcel.readParcelable(ShortVideoCoOwnerDto.class.getClassLoader()), StatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : ShortVideoMainTabStateDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoCoOwnerDto[] newArray(int i) {
            return new ShortVideoCoOwnerDto[i];
        }
    }

    public ShortVideoCoOwnerDto(UserId userId, StatusDto statusDto, boolean z, ShortVideoMainTabStateDto shortVideoMainTabStateDto) {
        this.ownerId = userId;
        this.status = statusDto;
        this.canSetStatus = z;
        this.mainTabState = shortVideoMainTabStateDto;
    }

    public final boolean d() {
        return this.canSetStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ShortVideoMainTabStateDto e() {
        return this.mainTabState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoCoOwnerDto)) {
            return false;
        }
        ShortVideoCoOwnerDto shortVideoCoOwnerDto = (ShortVideoCoOwnerDto) obj;
        return epx.f(this.ownerId, shortVideoCoOwnerDto.ownerId) && this.status == shortVideoCoOwnerDto.status && this.canSetStatus == shortVideoCoOwnerDto.canSetStatus && this.mainTabState == shortVideoCoOwnerDto.mainTabState;
    }

    public final StatusDto f() {
        return this.status;
    }

    public final int hashCode() {
        int b = qoy.b((this.status.hashCode() + (Long.hashCode(this.ownerId.b) * 31)) * 31, 31, this.canSetStatus);
        ShortVideoMainTabStateDto shortVideoMainTabStateDto = this.mainTabState;
        return b + (shortVideoMainTabStateDto == null ? 0 : shortVideoMainTabStateDto.hashCode());
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        return "ShortVideoCoOwnerDto(ownerId=" + this.ownerId + ", status=" + this.status + ", canSetStatus=" + this.canSetStatus + ", mainTabState=" + this.mainTabState + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        this.status.writeToParcel(parcel, i);
        parcel.writeInt(this.canSetStatus ? 1 : 0);
        ShortVideoMainTabStateDto shortVideoMainTabStateDto = this.mainTabState;
        if (shortVideoMainTabStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoMainTabStateDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ShortVideoCoOwnerDto(UserId userId, StatusDto statusDto, boolean z, ShortVideoMainTabStateDto shortVideoMainTabStateDto, int i, zcl zclVar) {
        this(userId, statusDto, z, (i & 8) != 0 ? null : shortVideoMainTabStateDto);
    }
}
