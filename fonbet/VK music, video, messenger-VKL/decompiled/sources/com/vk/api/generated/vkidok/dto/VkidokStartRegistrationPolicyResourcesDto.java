package com.vk.api.generated.vkidok.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VkidokStartRegistrationPolicyResourcesDto.kt */
/* loaded from: classes15.dex */
public final class VkidokStartRegistrationPolicyResourcesDto implements Parcelable {
    public static final Parcelable.Creator<VkidokStartRegistrationPolicyResourcesDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("value")
    private final String value;

    /* compiled from: VkidokStartRegistrationPolicyResourcesDto.kt */
    public static final class a implements Parcelable.Creator<VkidokStartRegistrationPolicyResourcesDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidokStartRegistrationPolicyResourcesDto createFromParcel(Parcel parcel) {
            return new VkidokStartRegistrationPolicyResourcesDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkidokStartRegistrationPolicyResourcesDto[] newArray(int i) {
            return new VkidokStartRegistrationPolicyResourcesDto[i];
        }
    }

    public VkidokStartRegistrationPolicyResourcesDto(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidokStartRegistrationPolicyResourcesDto)) {
            return false;
        }
        VkidokStartRegistrationPolicyResourcesDto vkidokStartRegistrationPolicyResourcesDto = (VkidokStartRegistrationPolicyResourcesDto) obj;
        return epx.f(this.name, vkidokStartRegistrationPolicyResourcesDto.name) && epx.f(this.value, vkidokStartRegistrationPolicyResourcesDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidokStartRegistrationPolicyResourcesDto(name=");
        sb.append(this.name);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.value);
    }
}
