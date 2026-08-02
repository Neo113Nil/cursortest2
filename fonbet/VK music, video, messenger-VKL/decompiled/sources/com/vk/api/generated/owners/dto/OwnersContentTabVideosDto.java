package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OwnersContentTabVideosDto.kt */
/* loaded from: classes15.dex */
public final class OwnersContentTabVideosDto implements Parcelable {
    public static final Parcelable.Creator<OwnersContentTabVideosDto> CREATOR = new a();

    @pmi0("base_configuration")
    private final OwnersContentTabBaseDto baseConfiguration;

    /* compiled from: OwnersContentTabVideosDto.kt */
    public static final class a implements Parcelable.Creator<OwnersContentTabVideosDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabVideosDto createFromParcel(Parcel parcel) {
            return new OwnersContentTabVideosDto(parcel.readInt() == 0 ? null : OwnersContentTabBaseDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabVideosDto[] newArray(int i) {
            return new OwnersContentTabVideosDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OwnersContentTabVideosDto() {
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
        return (obj instanceof OwnersContentTabVideosDto) && epx.f(this.baseConfiguration, ((OwnersContentTabVideosDto) obj).baseConfiguration);
    }

    public final int hashCode() {
        OwnersContentTabBaseDto ownersContentTabBaseDto = this.baseConfiguration;
        if (ownersContentTabBaseDto == null) {
            return 0;
        }
        return ownersContentTabBaseDto.hashCode();
    }

    public final String toString() {
        return "OwnersContentTabVideosDto(baseConfiguration=" + this.baseConfiguration + ')';
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

    public OwnersContentTabVideosDto(OwnersContentTabBaseDto ownersContentTabBaseDto) {
        this.baseConfiguration = ownersContentTabBaseDto;
    }

    public /* synthetic */ OwnersContentTabVideosDto(OwnersContentTabBaseDto ownersContentTabBaseDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : ownersContentTabBaseDto);
    }
}
