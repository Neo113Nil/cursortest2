package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OwnersContentTabDonutDto.kt */
/* loaded from: classes15.dex */
public final class OwnersContentTabDonutDto implements Parcelable {
    public static final Parcelable.Creator<OwnersContentTabDonutDto> CREATOR = new a();

    @pmi0("base_configuration")
    private final OwnersContentTabBaseDto baseConfiguration;

    /* compiled from: OwnersContentTabDonutDto.kt */
    public static final class a implements Parcelable.Creator<OwnersContentTabDonutDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabDonutDto createFromParcel(Parcel parcel) {
            return new OwnersContentTabDonutDto(parcel.readInt() == 0 ? null : OwnersContentTabBaseDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabDonutDto[] newArray(int i) {
            return new OwnersContentTabDonutDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OwnersContentTabDonutDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final OwnersContentTabBaseDto d() {
        return this.baseConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OwnersContentTabDonutDto) && epx.f(this.baseConfiguration, ((OwnersContentTabDonutDto) obj).baseConfiguration);
    }

    public final int hashCode() {
        OwnersContentTabBaseDto ownersContentTabBaseDto = this.baseConfiguration;
        if (ownersContentTabBaseDto == null) {
            return 0;
        }
        return ownersContentTabBaseDto.hashCode();
    }

    public final String toString() {
        return "OwnersContentTabDonutDto(baseConfiguration=" + this.baseConfiguration + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OwnersContentTabBaseDto ownersContentTabBaseDto = this.baseConfiguration;
        if (ownersContentTabBaseDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownersContentTabBaseDto.writeToParcel(parcel, i);
        }
    }

    public OwnersContentTabDonutDto(OwnersContentTabBaseDto ownersContentTabBaseDto) {
        this.baseConfiguration = ownersContentTabBaseDto;
    }

    public /* synthetic */ OwnersContentTabDonutDto(OwnersContentTabBaseDto ownersContentTabBaseDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : ownersContentTabBaseDto);
    }
}
