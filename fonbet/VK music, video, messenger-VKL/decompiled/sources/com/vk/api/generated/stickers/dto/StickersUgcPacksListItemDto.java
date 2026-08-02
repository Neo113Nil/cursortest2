package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: StickersUgcPacksListItemDto.kt */
/* loaded from: classes15.dex */
public final class StickersUgcPacksListItemDto implements Parcelable {
    public static final Parcelable.Creator<StickersUgcPacksListItemDto> CREATOR = new a();

    @pmi0("hash")
    private final String hash;

    @pmi0("pack_id")
    private final long packId;

    /* compiled from: StickersUgcPacksListItemDto.kt */
    public static final class a implements Parcelable.Creator<StickersUgcPacksListItemDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersUgcPacksListItemDto createFromParcel(Parcel parcel) {
            return new StickersUgcPacksListItemDto(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersUgcPacksListItemDto[] newArray(int i) {
            return new StickersUgcPacksListItemDto[i];
        }
    }

    public StickersUgcPacksListItemDto(long j, String str) {
        this.packId = j;
        this.hash = str;
    }

    public final String d() {
        return this.hash;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.packId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersUgcPacksListItemDto)) {
            return false;
        }
        StickersUgcPacksListItemDto stickersUgcPacksListItemDto = (StickersUgcPacksListItemDto) obj;
        return this.packId == stickersUgcPacksListItemDto.packId && epx.f(this.hash, stickersUgcPacksListItemDto.hash);
    }

    public final int hashCode() {
        return this.hash.hashCode() + (Long.hashCode(this.packId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersUgcPacksListItemDto(packId=");
        sb.append(this.packId);
        sb.append(", hash=");
        return ho8.a(sb, this.hash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.packId);
        parcel.writeString(this.hash);
    }
}
