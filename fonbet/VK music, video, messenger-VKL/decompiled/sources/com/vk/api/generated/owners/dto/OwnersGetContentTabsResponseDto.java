package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OwnersGetContentTabsResponseDto.kt */
/* loaded from: classes15.dex */
public final class OwnersGetContentTabsResponseDto implements Parcelable {
    public static final Parcelable.Creator<OwnersGetContentTabsResponseDto> CREATOR = new a();

    @pmi0("tabs_configuration")
    private final OwnersContentTabsConfigurationDto tabsConfiguration;

    /* compiled from: OwnersGetContentTabsResponseDto.kt */
    public static final class a implements Parcelable.Creator<OwnersGetContentTabsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersGetContentTabsResponseDto createFromParcel(Parcel parcel) {
            return new OwnersGetContentTabsResponseDto(parcel.readInt() == 0 ? null : OwnersContentTabsConfigurationDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersGetContentTabsResponseDto[] newArray(int i) {
            return new OwnersGetContentTabsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OwnersGetContentTabsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final OwnersContentTabsConfigurationDto d() {
        return this.tabsConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OwnersGetContentTabsResponseDto) && epx.f(this.tabsConfiguration, ((OwnersGetContentTabsResponseDto) obj).tabsConfiguration);
    }

    public final int hashCode() {
        OwnersContentTabsConfigurationDto ownersContentTabsConfigurationDto = this.tabsConfiguration;
        if (ownersContentTabsConfigurationDto == null) {
            return 0;
        }
        return ownersContentTabsConfigurationDto.hashCode();
    }

    public final String toString() {
        return "OwnersGetContentTabsResponseDto(tabsConfiguration=" + this.tabsConfiguration + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OwnersContentTabsConfigurationDto ownersContentTabsConfigurationDto = this.tabsConfiguration;
        if (ownersContentTabsConfigurationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownersContentTabsConfigurationDto.writeToParcel(parcel, i);
        }
    }

    public OwnersGetContentTabsResponseDto(OwnersContentTabsConfigurationDto ownersContentTabsConfigurationDto) {
        this.tabsConfiguration = ownersContentTabsConfigurationDto;
    }

    public /* synthetic */ OwnersGetContentTabsResponseDto(OwnersContentTabsConfigurationDto ownersContentTabsConfigurationDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : ownersContentTabsConfigurationDto);
    }
}
