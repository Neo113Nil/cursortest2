package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;
import xsna.shy;

/* compiled from: VkRunUserEmojiStatusDto.kt */
/* loaded from: classes15.dex */
public final class VkRunUserEmojiStatusDto implements Parcelable {
    public static final Parcelable.Creator<VkRunUserEmojiStatusDto> CREATOR = new a();

    @pmi0("days_num_remained")
    private final int daysNumRemained;

    @pmi0("is_allowed")
    private final boolean isAllowed;

    @pmi0("target")
    private final int target;

    /* compiled from: VkRunUserEmojiStatusDto.kt */
    public static final class a implements Parcelable.Creator<VkRunUserEmojiStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunUserEmojiStatusDto createFromParcel(Parcel parcel) {
            return new VkRunUserEmojiStatusDto(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunUserEmojiStatusDto[] newArray(int i) {
            return new VkRunUserEmojiStatusDto[i];
        }
    }

    public VkRunUserEmojiStatusDto(int i, int i2, boolean z) {
        this.target = i;
        this.daysNumRemained = i2;
        this.isAllowed = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunUserEmojiStatusDto)) {
            return false;
        }
        VkRunUserEmojiStatusDto vkRunUserEmojiStatusDto = (VkRunUserEmojiStatusDto) obj;
        return this.target == vkRunUserEmojiStatusDto.target && this.daysNumRemained == vkRunUserEmojiStatusDto.daysNumRemained && this.isAllowed == vkRunUserEmojiStatusDto.isAllowed;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isAllowed) + shy.a(this.daysNumRemained, Integer.hashCode(this.target) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunUserEmojiStatusDto(target=");
        sb.append(this.target);
        sb.append(", daysNumRemained=");
        sb.append(this.daysNumRemained);
        sb.append(", isAllowed=");
        return q0.a(sb, this.isAllowed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.target);
        parcel.writeInt(this.daysNumRemained);
        parcel.writeInt(this.isAllowed ? 1 : 0);
    }
}
