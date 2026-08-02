package com.vk.api.generated.vkidmail.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VkidmailUserBlockStatusBlockDto.kt */
/* loaded from: classes15.dex */
public final class VkidmailUserBlockStatusBlockDto implements Parcelable {
    public static final Parcelable.Creator<VkidmailUserBlockStatusBlockDto> CREATOR = new a();

    @pmi0("can_unblock")
    private final boolean canUnblock;

    @pmi0("reason")
    private final String reason;

    /* compiled from: VkidmailUserBlockStatusBlockDto.kt */
    public static final class a implements Parcelable.Creator<VkidmailUserBlockStatusBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidmailUserBlockStatusBlockDto createFromParcel(Parcel parcel) {
            return new VkidmailUserBlockStatusBlockDto(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VkidmailUserBlockStatusBlockDto[] newArray(int i) {
            return new VkidmailUserBlockStatusBlockDto[i];
        }
    }

    public VkidmailUserBlockStatusBlockDto(String str, boolean z) {
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
        if (!(obj instanceof VkidmailUserBlockStatusBlockDto)) {
            return false;
        }
        VkidmailUserBlockStatusBlockDto vkidmailUserBlockStatusBlockDto = (VkidmailUserBlockStatusBlockDto) obj;
        return epx.f(this.reason, vkidmailUserBlockStatusBlockDto.reason) && this.canUnblock == vkidmailUserBlockStatusBlockDto.canUnblock;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.canUnblock) + (this.reason.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidmailUserBlockStatusBlockDto(reason=");
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
