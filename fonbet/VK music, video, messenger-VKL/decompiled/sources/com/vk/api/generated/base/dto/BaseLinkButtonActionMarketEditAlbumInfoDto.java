package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: BaseLinkButtonActionMarketEditAlbumInfoDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkButtonActionMarketEditAlbumInfoDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkButtonActionMarketEditAlbumInfoDto> CREATOR = new a();

    @pmi0("album_id")
    private final Integer albumId;

    @pmi0("owner_id")
    private final UserId ownerId;

    /* compiled from: BaseLinkButtonActionMarketEditAlbumInfoDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkButtonActionMarketEditAlbumInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionMarketEditAlbumInfoDto createFromParcel(Parcel parcel) {
            return new BaseLinkButtonActionMarketEditAlbumInfoDto((UserId) parcel.readParcelable(BaseLinkButtonActionMarketEditAlbumInfoDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionMarketEditAlbumInfoDto[] newArray(int i) {
            return new BaseLinkButtonActionMarketEditAlbumInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseLinkButtonActionMarketEditAlbumInfoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.albumId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkButtonActionMarketEditAlbumInfoDto)) {
            return false;
        }
        BaseLinkButtonActionMarketEditAlbumInfoDto baseLinkButtonActionMarketEditAlbumInfoDto = (BaseLinkButtonActionMarketEditAlbumInfoDto) obj;
        return epx.f(this.ownerId, baseLinkButtonActionMarketEditAlbumInfoDto.ownerId) && epx.f(this.albumId, baseLinkButtonActionMarketEditAlbumInfoDto.albumId);
    }

    public final int hashCode() {
        UserId userId = this.ownerId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Integer num = this.albumId;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLinkButtonActionMarketEditAlbumInfoDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", albumId=");
        return uqi.b(sb, this.albumId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        Integer num = this.albumId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public BaseLinkButtonActionMarketEditAlbumInfoDto(UserId userId, Integer num) {
        this.ownerId = userId;
        this.albumId = num;
    }

    public /* synthetic */ BaseLinkButtonActionMarketEditAlbumInfoDto(UserId userId, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : num);
    }
}
