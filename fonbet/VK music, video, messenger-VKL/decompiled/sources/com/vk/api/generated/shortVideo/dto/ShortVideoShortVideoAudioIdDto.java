package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ShortVideoShortVideoAudioIdDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoAudioIdDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoAudioIdDto> CREATOR = new a();

    @pmi0("audio_id")
    private final int audioId;

    @pmi0("audio_owner_id")
    private final long audioOwnerId;

    /* compiled from: ShortVideoShortVideoAudioIdDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoAudioIdDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoAudioIdDto createFromParcel(Parcel parcel) {
            return new ShortVideoShortVideoAudioIdDto(parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoAudioIdDto[] newArray(int i) {
            return new ShortVideoShortVideoAudioIdDto[i];
        }
    }

    public ShortVideoShortVideoAudioIdDto(long j, int i) {
        this.audioOwnerId = j;
        this.audioId = i;
    }

    public final int d() {
        return this.audioId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.audioOwnerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoAudioIdDto)) {
            return false;
        }
        ShortVideoShortVideoAudioIdDto shortVideoShortVideoAudioIdDto = (ShortVideoShortVideoAudioIdDto) obj;
        return this.audioOwnerId == shortVideoShortVideoAudioIdDto.audioOwnerId && this.audioId == shortVideoShortVideoAudioIdDto.audioId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.audioId) + (Long.hashCode(this.audioOwnerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoAudioIdDto(audioOwnerId=");
        sb.append(this.audioOwnerId);
        sb.append(", audioId=");
        return vu5.b(sb, this.audioId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.audioOwnerId);
        parcel.writeInt(this.audioId);
    }
}
