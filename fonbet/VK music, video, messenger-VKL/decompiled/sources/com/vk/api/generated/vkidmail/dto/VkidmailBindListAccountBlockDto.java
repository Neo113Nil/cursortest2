package com.vk.api.generated.vkidmail.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VkidmailBindListAccountBlockDto.kt */
/* loaded from: classes15.dex */
public final class VkidmailBindListAccountBlockDto implements Parcelable {
    public static final Parcelable.Creator<VkidmailBindListAccountBlockDto> CREATOR = new a();

    @pmi0("can_unblock")
    private final boolean canUnblock;

    @pmi0("reason")
    private final String reason;

    /* compiled from: VkidmailBindListAccountBlockDto.kt */
    public static final class a implements Parcelable.Creator<VkidmailBindListAccountBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidmailBindListAccountBlockDto createFromParcel(Parcel parcel) {
            return new VkidmailBindListAccountBlockDto(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VkidmailBindListAccountBlockDto[] newArray(int i) {
            return new VkidmailBindListAccountBlockDto[i];
        }
    }

    public VkidmailBindListAccountBlockDto(String str, boolean z) {
        this.reason = str;
        this.canUnblock = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidmailBindListAccountBlockDto)) {
            return false;
        }
        VkidmailBindListAccountBlockDto vkidmailBindListAccountBlockDto = (VkidmailBindListAccountBlockDto) obj;
        return epx.f(this.reason, vkidmailBindListAccountBlockDto.reason) && this.canUnblock == vkidmailBindListAccountBlockDto.canUnblock;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.canUnblock) + (this.reason.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidmailBindListAccountBlockDto(reason=");
        sb.append(this.reason);
        sb.append(", canUnblock=");
        return q0.a(sb, this.canUnblock, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.reason);
        parcel.writeInt(this.canUnblock ? 1 : 0);
    }
}
