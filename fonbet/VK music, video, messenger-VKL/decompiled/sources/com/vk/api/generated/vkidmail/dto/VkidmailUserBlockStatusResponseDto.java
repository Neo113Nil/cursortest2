package com.vk.api.generated.vkidmail.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkidmailUserBlockStatusResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkidmailUserBlockStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkidmailUserBlockStatusResponseDto> CREATOR = new a();

    @pmi0("block")
    private final VkidmailUserBlockStatusBlockDto block;

    @pmi0("status")
    private final String status;

    /* compiled from: VkidmailUserBlockStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkidmailUserBlockStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidmailUserBlockStatusResponseDto createFromParcel(Parcel parcel) {
            return new VkidmailUserBlockStatusResponseDto(parcel.readString(), parcel.readInt() == 0 ? null : VkidmailUserBlockStatusBlockDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VkidmailUserBlockStatusResponseDto[] newArray(int i) {
            return new VkidmailUserBlockStatusResponseDto[i];
        }
    }

    public VkidmailUserBlockStatusResponseDto(String str, VkidmailUserBlockStatusBlockDto vkidmailUserBlockStatusBlockDto) {
        this.status = str;
        this.block = vkidmailUserBlockStatusBlockDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidmailUserBlockStatusResponseDto)) {
            return false;
        }
        VkidmailUserBlockStatusResponseDto vkidmailUserBlockStatusResponseDto = (VkidmailUserBlockStatusResponseDto) obj;
        return epx.f(this.status, vkidmailUserBlockStatusResponseDto.status) && epx.f(this.block, vkidmailUserBlockStatusResponseDto.block);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        VkidmailUserBlockStatusBlockDto vkidmailUserBlockStatusBlockDto = this.block;
        return hashCode + (vkidmailUserBlockStatusBlockDto == null ? 0 : vkidmailUserBlockStatusBlockDto.hashCode());
    }

    public final String toString() {
        return "VkidmailUserBlockStatusResponseDto(status=" + this.status + ", block=" + this.block + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.status);
        VkidmailUserBlockStatusBlockDto vkidmailUserBlockStatusBlockDto = this.block;
        if (vkidmailUserBlockStatusBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkidmailUserBlockStatusBlockDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkidmailUserBlockStatusResponseDto(String str, VkidmailUserBlockStatusBlockDto vkidmailUserBlockStatusBlockDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : vkidmailUserBlockStatusBlockDto);
    }
}
