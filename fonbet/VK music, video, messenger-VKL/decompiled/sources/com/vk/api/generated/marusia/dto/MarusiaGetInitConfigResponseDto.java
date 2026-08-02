package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarusiaGetInitConfigResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaGetInitConfigResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaGetInitConfigResponseDto> CREATOR = new a();

    @pmi0("capabilities")
    private final MarusiaCapabilitiesDto capabilities;

    @pmi0("grantedPermissions")
    private final MarusiaGrantedPermissionsDto grantedPermissions;

    @pmi0("marusiaBackendCommands")
    private final MarusiaBackendCommandsDto marusiaBackendCommands;

    @pmi0("marusiaServerType")
    private final MarusiaServerTypeDto marusiaServerType;

    @pmi0("maskedChatId")
    private final String maskedChatId;

    @pmi0("needServicePolicy")
    private final Boolean needServicePolicy;

    /* compiled from: MarusiaGetInitConfigResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaGetInitConfigResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaGetInitConfigResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            MarusiaCapabilitiesDto createFromParcel = MarusiaCapabilitiesDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarusiaGetInitConfigResponseDto(createFromParcel, readString, valueOf, parcel.readInt() == 0 ? null : MarusiaGrantedPermissionsDto.CREATOR.createFromParcel(parcel), (MarusiaServerTypeDto) parcel.readParcelable(MarusiaGetInitConfigResponseDto.class.getClassLoader()), parcel.readInt() != 0 ? MarusiaBackendCommandsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaGetInitConfigResponseDto[] newArray(int i) {
            return new MarusiaGetInitConfigResponseDto[i];
        }
    }

    public MarusiaGetInitConfigResponseDto(MarusiaCapabilitiesDto marusiaCapabilitiesDto, String str, Boolean bool, MarusiaGrantedPermissionsDto marusiaGrantedPermissionsDto, MarusiaServerTypeDto marusiaServerTypeDto, MarusiaBackendCommandsDto marusiaBackendCommandsDto) {
        this.capabilities = marusiaCapabilitiesDto;
        this.maskedChatId = str;
        this.needServicePolicy = bool;
        this.grantedPermissions = marusiaGrantedPermissionsDto;
        this.marusiaServerType = marusiaServerTypeDto;
        this.marusiaBackendCommands = marusiaBackendCommandsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaGetInitConfigResponseDto)) {
            return false;
        }
        MarusiaGetInitConfigResponseDto marusiaGetInitConfigResponseDto = (MarusiaGetInitConfigResponseDto) obj;
        return epx.f(this.capabilities, marusiaGetInitConfigResponseDto.capabilities) && epx.f(this.maskedChatId, marusiaGetInitConfigResponseDto.maskedChatId) && epx.f(this.needServicePolicy, marusiaGetInitConfigResponseDto.needServicePolicy) && epx.f(this.grantedPermissions, marusiaGetInitConfigResponseDto.grantedPermissions) && epx.f(this.marusiaServerType, marusiaGetInitConfigResponseDto.marusiaServerType) && epx.f(this.marusiaBackendCommands, marusiaGetInitConfigResponseDto.marusiaBackendCommands);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.capabilities.hashCode() * 31, 31, this.maskedChatId);
        Boolean bool = this.needServicePolicy;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        MarusiaGrantedPermissionsDto marusiaGrantedPermissionsDto = this.grantedPermissions;
        int hashCode2 = (hashCode + (marusiaGrantedPermissionsDto == null ? 0 : marusiaGrantedPermissionsDto.hashCode())) * 31;
        MarusiaServerTypeDto marusiaServerTypeDto = this.marusiaServerType;
        int hashCode3 = (hashCode2 + (marusiaServerTypeDto == null ? 0 : marusiaServerTypeDto.hashCode())) * 31;
        MarusiaBackendCommandsDto marusiaBackendCommandsDto = this.marusiaBackendCommands;
        return hashCode3 + (marusiaBackendCommandsDto != null ? marusiaBackendCommandsDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarusiaGetInitConfigResponseDto(capabilities=" + this.capabilities + ", maskedChatId=" + this.maskedChatId + ", needServicePolicy=" + this.needServicePolicy + ", grantedPermissions=" + this.grantedPermissions + ", marusiaServerType=" + this.marusiaServerType + ", marusiaBackendCommands=" + this.marusiaBackendCommands + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.capabilities.writeToParcel(parcel, i);
        parcel.writeString(this.maskedChatId);
        Boolean bool = this.needServicePolicy;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        MarusiaGrantedPermissionsDto marusiaGrantedPermissionsDto = this.grantedPermissions;
        if (marusiaGrantedPermissionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marusiaGrantedPermissionsDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.marusiaServerType, i);
        MarusiaBackendCommandsDto marusiaBackendCommandsDto = this.marusiaBackendCommands;
        if (marusiaBackendCommandsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marusiaBackendCommandsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarusiaGetInitConfigResponseDto(MarusiaCapabilitiesDto marusiaCapabilitiesDto, String str, Boolean bool, MarusiaGrantedPermissionsDto marusiaGrantedPermissionsDto, MarusiaServerTypeDto marusiaServerTypeDto, MarusiaBackendCommandsDto marusiaBackendCommandsDto, int i, zcl zclVar) {
        this(marusiaCapabilitiesDto, str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : marusiaGrantedPermissionsDto, (i & 16) != 0 ? null : marusiaServerTypeDto, (i & 32) != 0 ? null : marusiaBackendCommandsDto);
    }
}
