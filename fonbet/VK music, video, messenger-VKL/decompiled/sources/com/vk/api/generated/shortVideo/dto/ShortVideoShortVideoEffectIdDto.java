package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ShortVideoShortVideoEffectIdDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoEffectIdDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoEffectIdDto> CREATOR = new a();

    @pmi0("effect_id")
    private final int effectId;

    @pmi0("effect_owner_id")
    private final long effectOwnerId;

    /* compiled from: ShortVideoShortVideoEffectIdDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoEffectIdDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoEffectIdDto createFromParcel(Parcel parcel) {
            return new ShortVideoShortVideoEffectIdDto(parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoEffectIdDto[] newArray(int i) {
            return new ShortVideoShortVideoEffectIdDto[i];
        }
    }

    public ShortVideoShortVideoEffectIdDto(long j, int i) {
        this.effectOwnerId = j;
        this.effectId = i;
    }

    public final int d() {
        return this.effectId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.effectOwnerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoEffectIdDto)) {
            return false;
        }
        ShortVideoShortVideoEffectIdDto shortVideoShortVideoEffectIdDto = (ShortVideoShortVideoEffectIdDto) obj;
        return this.effectOwnerId == shortVideoShortVideoEffectIdDto.effectOwnerId && this.effectId == shortVideoShortVideoEffectIdDto.effectId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.effectId) + (Long.hashCode(this.effectOwnerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoEffectIdDto(effectOwnerId=");
        sb.append(this.effectOwnerId);
        sb.append(", effectId=");
        return vu5.b(sb, this.effectId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.effectOwnerId);
        parcel.writeInt(this.effectId);
    }
}
