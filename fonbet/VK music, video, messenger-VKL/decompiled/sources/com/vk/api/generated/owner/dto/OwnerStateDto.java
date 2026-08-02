package com.vk.api.generated.owner.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: OwnerStateDto.kt */
/* loaded from: classes15.dex */
public final class OwnerStateDto implements Parcelable {
    public static final Parcelable.Creator<OwnerStateDto> CREATOR = new a();

    @pmi0("can_activate_until_date")
    private final Integer canActivateUntilDate;

    @pmi0("description")
    private final String description;

    @pmi0("photos")
    private final OwnerStatePhotosDto photos;

    @pmi0("state")
    private final StateDto state;

    @pmi0("unban_date")
    private final Integer unbanDate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OwnerStateDto.kt */
    public static final class StateDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;

        @pmi0("2")
        public static final StateDto ADULT;

        @pmi0("1")
        public static final StateDto BANNED;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final StateDto BLACKLISTED;
        public static final Parcelable.Creator<StateDto> CREATOR;

        @pmi0("4")
        public static final StateDto DELETED;

        @pmi0("3")
        public static final StateDto HIDDEN;
        private final int value;

        /* compiled from: OwnerStateDto.kt */
        public static final class a implements Parcelable.Creator<StateDto> {
            @Override // android.os.Parcelable.Creator
            public final StateDto createFromParcel(Parcel parcel) {
                return StateDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StateDto[] newArray(int i) {
                return new StateDto[i];
            }
        }

        static {
            StateDto stateDto = new StateDto("BANNED", 0, 1);
            BANNED = stateDto;
            StateDto stateDto2 = new StateDto("ADULT", 1, 2);
            ADULT = stateDto2;
            StateDto stateDto3 = new StateDto("HIDDEN", 2, 3);
            HIDDEN = stateDto3;
            StateDto stateDto4 = new StateDto("DELETED", 3, 4);
            DELETED = stateDto4;
            StateDto stateDto5 = new StateDto("BLACKLISTED", 4, 5);
            BLACKLISTED = stateDto5;
            StateDto[] stateDtoArr = {stateDto, stateDto2, stateDto3, stateDto4, stateDto5};
            $VALUES = stateDtoArr;
            $ENTRIES = new asp(stateDtoArr);
            CREATOR = new a();
        }

        private StateDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static StateDto valueOf(String str) {
            return (StateDto) Enum.valueOf(StateDto.class, str);
        }

        public static StateDto[] values() {
            return (StateDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: OwnerStateDto.kt */
    public static final class a implements Parcelable.Creator<OwnerStateDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnerStateDto createFromParcel(Parcel parcel) {
            Integer num;
            Integer valueOf;
            StateDto createFromParcel = parcel.readInt() == 0 ? null : StateDto.CREATOR.createFromParcel(parcel);
            OwnerStatePhotosDto createFromParcel2 = parcel.readInt() == 0 ? null : OwnerStatePhotosDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                Integer num2 = valueOf2;
                valueOf = null;
                num = num2;
            } else {
                num = valueOf2;
                valueOf = Integer.valueOf(parcel.readInt());
            }
            return new OwnerStateDto(createFromParcel, createFromParcel2, readString, num, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final OwnerStateDto[] newArray(int i) {
            return new OwnerStateDto[i];
        }
    }

    public OwnerStateDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final OwnerStatePhotosDto d() {
        return this.photos;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StateDto e() {
        return this.state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerStateDto)) {
            return false;
        }
        OwnerStateDto ownerStateDto = (OwnerStateDto) obj;
        return this.state == ownerStateDto.state && epx.f(this.photos, ownerStateDto.photos) && epx.f(this.description, ownerStateDto.description) && epx.f(this.unbanDate, ownerStateDto.unbanDate) && epx.f(this.canActivateUntilDate, ownerStateDto.canActivateUntilDate);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        StateDto stateDto = this.state;
        int hashCode = (stateDto == null ? 0 : stateDto.hashCode()) * 31;
        OwnerStatePhotosDto ownerStatePhotosDto = this.photos;
        int hashCode2 = (hashCode + (ownerStatePhotosDto == null ? 0 : ownerStatePhotosDto.hashCode())) * 31;
        String str = this.description;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.unbanDate;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.canActivateUntilDate;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnerStateDto(state=");
        sb.append(this.state);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", unbanDate=");
        sb.append(this.unbanDate);
        sb.append(", canActivateUntilDate=");
        return uqi.b(sb, this.canActivateUntilDate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StateDto stateDto = this.state;
        if (stateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stateDto.writeToParcel(parcel, i);
        }
        OwnerStatePhotosDto ownerStatePhotosDto = this.photos;
        if (ownerStatePhotosDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownerStatePhotosDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        Integer num = this.unbanDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.canActivateUntilDate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public OwnerStateDto(StateDto stateDto, OwnerStatePhotosDto ownerStatePhotosDto, String str, Integer num, Integer num2) {
        this.state = stateDto;
        this.photos = ownerStatePhotosDto;
        this.description = str;
        this.unbanDate = num;
        this.canActivateUntilDate = num2;
    }

    public /* synthetic */ OwnerStateDto(StateDto stateDto, OwnerStatePhotosDto ownerStatePhotosDto, String str, Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : stateDto, (i & 2) != 0 ? null : ownerStatePhotosDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }
}
