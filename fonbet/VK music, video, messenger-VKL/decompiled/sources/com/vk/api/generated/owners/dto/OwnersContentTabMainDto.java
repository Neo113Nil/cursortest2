package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OwnersContentTabMainDto.kt */
/* loaded from: classes15.dex */
public final class OwnersContentTabMainDto implements Parcelable {
    public static final Parcelable.Creator<OwnersContentTabMainDto> CREATOR = new a();

    @pmi0("base_configuration")
    private final OwnersContentTabBaseDto baseConfiguration;

    /* compiled from: OwnersContentTabMainDto.kt */
    public static final class a implements Parcelable.Creator<OwnersContentTabMainDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabMainDto createFromParcel(Parcel parcel) {
            return new OwnersContentTabMainDto(parcel.readInt() == 0 ? null : OwnersContentTabBaseDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabMainDto[] newArray(int i) {
            return new OwnersContentTabMainDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OwnersContentTabMainDto() {
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
        return (obj instanceof OwnersContentTabMainDto) && epx.f(this.baseConfiguration, ((OwnersContentTabMainDto) obj).baseConfiguration);
    }

    public final int hashCode() {
        OwnersContentTabBaseDto ownersContentTabBaseDto = this.baseConfiguration;
        if (ownersContentTabBaseDto == null) {
            return 0;
        }
        return ownersContentTabBaseDto.hashCode();
    }

    public final String toString() {
        return "OwnersContentTabMainDto(baseConfiguration=" + this.baseConfiguration + ')';
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

    public OwnersContentTabMainDto(OwnersContentTabBaseDto ownersContentTabBaseDto) {
        this.baseConfiguration = ownersContentTabBaseDto;
    }

    public /* synthetic */ OwnersContentTabMainDto(OwnersContentTabBaseDto ownersContentTabBaseDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : ownersContentTabBaseDto);
    }
}
