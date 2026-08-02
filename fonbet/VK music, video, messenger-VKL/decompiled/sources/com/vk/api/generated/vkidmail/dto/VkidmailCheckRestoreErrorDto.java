package com.vk.api.generated.vkidmail.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkidmailCheckRestoreErrorDto.kt */
/* loaded from: classes15.dex */
public final class VkidmailCheckRestoreErrorDto implements Parcelable {
    public static final Parcelable.Creator<VkidmailCheckRestoreErrorDto> CREATOR = new a();

    @pmi0("error_code")
    private final String errorCode;

    @pmi0("error_text")
    private final String errorText;

    /* compiled from: VkidmailCheckRestoreErrorDto.kt */
    public static final class a implements Parcelable.Creator<VkidmailCheckRestoreErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidmailCheckRestoreErrorDto createFromParcel(Parcel parcel) {
            return new VkidmailCheckRestoreErrorDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkidmailCheckRestoreErrorDto[] newArray(int i) {
            return new VkidmailCheckRestoreErrorDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkidmailCheckRestoreErrorDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidmailCheckRestoreErrorDto)) {
            return false;
        }
        VkidmailCheckRestoreErrorDto vkidmailCheckRestoreErrorDto = (VkidmailCheckRestoreErrorDto) obj;
        return epx.f(this.errorCode, vkidmailCheckRestoreErrorDto.errorCode) && epx.f(this.errorText, vkidmailCheckRestoreErrorDto.errorText);
    }

    public final int hashCode() {
        String str = this.errorCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorText;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidmailCheckRestoreErrorDto(errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorText=");
        return ho8.a(sb, this.errorText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.errorCode);
        parcel.writeString(this.errorText);
    }

    public VkidmailCheckRestoreErrorDto(String str, String str2) {
        this.errorCode = str;
        this.errorText = str2;
    }

    public /* synthetic */ VkidmailCheckRestoreErrorDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
