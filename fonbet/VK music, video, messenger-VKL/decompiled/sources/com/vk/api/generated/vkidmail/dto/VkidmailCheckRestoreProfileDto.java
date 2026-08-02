package com.vk.api.generated.vkidmail.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: VkidmailCheckRestoreProfileDto.kt */
/* loaded from: classes15.dex */
public final class VkidmailCheckRestoreProfileDto implements Parcelable {
    public static final Parcelable.Creator<VkidmailCheckRestoreProfileDto> CREATOR = new a();

    @pmi0("deleted")
    private final Boolean deleted;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("phone")
    private final String phone;

    @pmi0("photo_200")
    private final String photo200;

    /* compiled from: VkidmailCheckRestoreProfileDto.kt */
    public static final class a implements Parcelable.Creator<VkidmailCheckRestoreProfileDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidmailCheckRestoreProfileDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VkidmailCheckRestoreProfileDto(readString, readString2, readString3, readString4, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final VkidmailCheckRestoreProfileDto[] newArray(int i) {
            return new VkidmailCheckRestoreProfileDto[i];
        }
    }

    public VkidmailCheckRestoreProfileDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidmailCheckRestoreProfileDto)) {
            return false;
        }
        VkidmailCheckRestoreProfileDto vkidmailCheckRestoreProfileDto = (VkidmailCheckRestoreProfileDto) obj;
        return epx.f(this.phone, vkidmailCheckRestoreProfileDto.phone) && epx.f(this.photo200, vkidmailCheckRestoreProfileDto.photo200) && epx.f(this.firstName, vkidmailCheckRestoreProfileDto.firstName) && epx.f(this.lastName, vkidmailCheckRestoreProfileDto.lastName) && epx.f(this.deleted, vkidmailCheckRestoreProfileDto.deleted);
    }

    public final int hashCode() {
        String str = this.phone;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.photo200;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.deleted;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidmailCheckRestoreProfileDto(phone=");
        sb.append(this.phone);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", deleted=");
        return tn.a(sb, this.deleted, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.phone);
        parcel.writeString(this.photo200);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        Boolean bool = this.deleted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public VkidmailCheckRestoreProfileDto(String str, String str2, String str3, String str4, Boolean bool) {
        this.phone = str;
        this.photo200 = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.deleted = bool;
    }

    public /* synthetic */ VkidmailCheckRestoreProfileDto(String str, String str2, String str3, String str4, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool);
    }
}
