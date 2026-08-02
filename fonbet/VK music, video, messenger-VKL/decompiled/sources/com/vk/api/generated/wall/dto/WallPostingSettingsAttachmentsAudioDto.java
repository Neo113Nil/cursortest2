package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: WallPostingSettingsAttachmentsAudioDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingSettingsAttachmentsAudioDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingSettingsAttachmentsAudioDto> CREATOR = new a();

    @pmi0("max_count")
    private final int maxCount;

    /* compiled from: WallPostingSettingsAttachmentsAudioDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingSettingsAttachmentsAudioDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsAttachmentsAudioDto createFromParcel(Parcel parcel) {
            return new WallPostingSettingsAttachmentsAudioDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsAttachmentsAudioDto[] newArray(int i) {
            return new WallPostingSettingsAttachmentsAudioDto[i];
        }
    }

    public WallPostingSettingsAttachmentsAudioDto(int i) {
        this.maxCount = i;
    }

    public final int d() {
        return this.maxCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallPostingSettingsAttachmentsAudioDto) && this.maxCount == ((WallPostingSettingsAttachmentsAudioDto) obj).maxCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxCount);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("WallPostingSettingsAttachmentsAudioDto(maxCount="), this.maxCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.maxCount);
    }
}
