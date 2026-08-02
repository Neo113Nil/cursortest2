package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppShowcaseStubsDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcaseStubsDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppShowcaseStubsDto> CREATOR = new a();

    @pmi0("half_tile")
    private final SuperAppShowcaseHalfTileDto halfTile;

    @pmi0("tile")
    private final SuperAppShowcaseTileDto tile;

    /* compiled from: SuperAppShowcaseStubsDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseStubsDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseStubsDto createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseStubsDto(parcel.readInt() == 0 ? null : SuperAppShowcaseTileDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppShowcaseHalfTileDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseStubsDto[] newArray(int i) {
            return new SuperAppShowcaseStubsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppShowcaseStubsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final SuperAppShowcaseHalfTileDto d() {
        return this.halfTile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SuperAppShowcaseTileDto e() {
        return this.tile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppShowcaseStubsDto)) {
            return false;
        }
        SuperAppShowcaseStubsDto superAppShowcaseStubsDto = (SuperAppShowcaseStubsDto) obj;
        return epx.f(this.tile, superAppShowcaseStubsDto.tile) && epx.f(this.halfTile, superAppShowcaseStubsDto.halfTile);
    }

    public final int hashCode() {
        SuperAppShowcaseTileDto superAppShowcaseTileDto = this.tile;
        int hashCode = (superAppShowcaseTileDto == null ? 0 : superAppShowcaseTileDto.hashCode()) * 31;
        SuperAppShowcaseHalfTileDto superAppShowcaseHalfTileDto = this.halfTile;
        return hashCode + (superAppShowcaseHalfTileDto != null ? superAppShowcaseHalfTileDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppShowcaseStubsDto(tile=" + this.tile + ", halfTile=" + this.halfTile + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SuperAppShowcaseTileDto superAppShowcaseTileDto = this.tile;
        if (superAppShowcaseTileDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppShowcaseTileDto.writeToParcel(parcel, i);
        }
        SuperAppShowcaseHalfTileDto superAppShowcaseHalfTileDto = this.halfTile;
        if (superAppShowcaseHalfTileDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppShowcaseHalfTileDto.writeToParcel(parcel, i);
        }
    }

    public SuperAppShowcaseStubsDto(SuperAppShowcaseTileDto superAppShowcaseTileDto, SuperAppShowcaseHalfTileDto superAppShowcaseHalfTileDto) {
        this.tile = superAppShowcaseTileDto;
        this.halfTile = superAppShowcaseHalfTileDto;
    }

    public /* synthetic */ SuperAppShowcaseStubsDto(SuperAppShowcaseTileDto superAppShowcaseTileDto, SuperAppShowcaseHalfTileDto superAppShowcaseHalfTileDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppShowcaseTileDto, (i & 2) != 0 ? null : superAppShowcaseHalfTileDto);
    }
}
