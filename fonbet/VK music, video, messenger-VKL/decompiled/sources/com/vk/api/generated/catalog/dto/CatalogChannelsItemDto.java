package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogChannelsItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogChannelsItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogChannelsItemDto> CREATOR = new a();

    @pmi0("channel_id")
    private final long channelId;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: CatalogChannelsItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogChannelsItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogChannelsItemDto createFromParcel(Parcel parcel) {
            return new CatalogChannelsItemDto(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogChannelsItemDto[] newArray(int i) {
            return new CatalogChannelsItemDto[i];
        }
    }

    public CatalogChannelsItemDto(long j, String str) {
        this.channelId = j;
        this.trackCode = str;
    }

    public final long d() {
        return this.channelId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogChannelsItemDto)) {
            return false;
        }
        CatalogChannelsItemDto catalogChannelsItemDto = (CatalogChannelsItemDto) obj;
        return this.channelId == catalogChannelsItemDto.channelId && epx.f(this.trackCode, catalogChannelsItemDto.trackCode);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.channelId) * 31;
        String str = this.trackCode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogChannelsItemDto(channelId=");
        sb.append(this.channelId);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.channelId);
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ CatalogChannelsItemDto(long j, String str, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : str);
    }
}
