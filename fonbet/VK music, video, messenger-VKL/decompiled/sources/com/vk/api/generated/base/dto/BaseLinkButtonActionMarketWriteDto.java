package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseLinkButtonActionMarketWriteDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkButtonActionMarketWriteDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkButtonActionMarketWriteDto> CREATOR = new a();

    @pmi0("message")
    private final String message;

    @pmi0("peer_id")
    private final UserId peerId;

    /* compiled from: BaseLinkButtonActionMarketWriteDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkButtonActionMarketWriteDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionMarketWriteDto createFromParcel(Parcel parcel) {
            return new BaseLinkButtonActionMarketWriteDto((UserId) parcel.readParcelable(BaseLinkButtonActionMarketWriteDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionMarketWriteDto[] newArray(int i) {
            return new BaseLinkButtonActionMarketWriteDto[i];
        }
    }

    public BaseLinkButtonActionMarketWriteDto(UserId userId, String str) {
        this.peerId = userId;
        this.message = str;
    }

    public final UserId d() {
        return this.peerId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkButtonActionMarketWriteDto)) {
            return false;
        }
        BaseLinkButtonActionMarketWriteDto baseLinkButtonActionMarketWriteDto = (BaseLinkButtonActionMarketWriteDto) obj;
        return epx.f(this.peerId, baseLinkButtonActionMarketWriteDto.peerId) && epx.f(this.message, baseLinkButtonActionMarketWriteDto.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.peerId.b) * 31;
        String str = this.message;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLinkButtonActionMarketWriteDto(peerId=");
        sb.append(this.peerId);
        sb.append(", message=");
        return ho8.a(sb, this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.peerId, i);
        parcel.writeString(this.message);
    }

    public /* synthetic */ BaseLinkButtonActionMarketWriteDto(UserId userId, String str, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : str);
    }
}
