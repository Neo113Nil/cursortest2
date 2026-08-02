package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ShortVideoShortVideoMaskIdDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoMaskIdDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoMaskIdDto> CREATOR = new a();

    @pmi0("mask_id")
    private final int maskId;

    @pmi0("mask_owner_id")
    private final long maskOwnerId;

    /* compiled from: ShortVideoShortVideoMaskIdDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoMaskIdDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoMaskIdDto createFromParcel(Parcel parcel) {
            return new ShortVideoShortVideoMaskIdDto(parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoMaskIdDto[] newArray(int i) {
            return new ShortVideoShortVideoMaskIdDto[i];
        }
    }

    public ShortVideoShortVideoMaskIdDto(long j, int i) {
        this.maskOwnerId = j;
        this.maskId = i;
    }

    public final int d() {
        return this.maskId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.maskOwnerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoMaskIdDto)) {
            return false;
        }
        ShortVideoShortVideoMaskIdDto shortVideoShortVideoMaskIdDto = (ShortVideoShortVideoMaskIdDto) obj;
        return this.maskOwnerId == shortVideoShortVideoMaskIdDto.maskOwnerId && this.maskId == shortVideoShortVideoMaskIdDto.maskId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maskId) + (Long.hashCode(this.maskOwnerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoMaskIdDto(maskOwnerId=");
        sb.append(this.maskOwnerId);
        sb.append(", maskId=");
        return vu5.b(sb, this.maskId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.maskOwnerId);
        parcel.writeInt(this.maskId);
    }
}
