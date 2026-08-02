package com.vk.api.generated.vkidok.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: VkidokStartRegistrationPolicyLinksDto.kt */
/* loaded from: classes15.dex */
public final class VkidokStartRegistrationPolicyLinksDto implements Parcelable {
    public static final Parcelable.Creator<VkidokStartRegistrationPolicyLinksDto> CREATOR = new a();

    @pmi0("link")
    private final String link;

    @pmi0("pts_key")
    private final String ptsKey;

    @pmi0("stat_key")
    private final String statKey;

    /* compiled from: VkidokStartRegistrationPolicyLinksDto.kt */
    public static final class a implements Parcelable.Creator<VkidokStartRegistrationPolicyLinksDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidokStartRegistrationPolicyLinksDto createFromParcel(Parcel parcel) {
            return new VkidokStartRegistrationPolicyLinksDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkidokStartRegistrationPolicyLinksDto[] newArray(int i) {
            return new VkidokStartRegistrationPolicyLinksDto[i];
        }
    }

    public VkidokStartRegistrationPolicyLinksDto(String str, String str2, String str3) {
        this.link = str;
        this.ptsKey = str2;
        this.statKey = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidokStartRegistrationPolicyLinksDto)) {
            return false;
        }
        VkidokStartRegistrationPolicyLinksDto vkidokStartRegistrationPolicyLinksDto = (VkidokStartRegistrationPolicyLinksDto) obj;
        return epx.f(this.link, vkidokStartRegistrationPolicyLinksDto.link) && epx.f(this.ptsKey, vkidokStartRegistrationPolicyLinksDto.ptsKey) && epx.f(this.statKey, vkidokStartRegistrationPolicyLinksDto.statKey);
    }

    public final int hashCode() {
        return this.statKey.hashCode() + urd0.a(this.link.hashCode() * 31, 31, this.ptsKey);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidokStartRegistrationPolicyLinksDto(link=");
        sb.append(this.link);
        sb.append(", ptsKey=");
        sb.append(this.ptsKey);
        sb.append(", statKey=");
        return ho8.a(sb, this.statKey, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.link);
        parcel.writeString(this.ptsKey);
        parcel.writeString(this.statKey);
    }
}
