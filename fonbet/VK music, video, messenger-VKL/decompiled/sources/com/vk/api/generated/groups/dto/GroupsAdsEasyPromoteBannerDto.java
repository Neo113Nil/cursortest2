package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GroupsAdsEasyPromoteBannerDto.kt */
/* loaded from: classes14.dex */
public final class GroupsAdsEasyPromoteBannerDto implements Parcelable {
    public static final Parcelable.Creator<GroupsAdsEasyPromoteBannerDto> CREATOR = new a();

    @pmi0("link_url")
    private final String linkUrl;

    /* compiled from: GroupsAdsEasyPromoteBannerDto.kt */
    public static final class a implements Parcelable.Creator<GroupsAdsEasyPromoteBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsAdsEasyPromoteBannerDto createFromParcel(Parcel parcel) {
            return new GroupsAdsEasyPromoteBannerDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsAdsEasyPromoteBannerDto[] newArray(int i) {
            return new GroupsAdsEasyPromoteBannerDto[i];
        }
    }

    public GroupsAdsEasyPromoteBannerDto(String str) {
        this.linkUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupsAdsEasyPromoteBannerDto) && epx.f(this.linkUrl, ((GroupsAdsEasyPromoteBannerDto) obj).linkUrl);
    }

    public final int hashCode() {
        return this.linkUrl.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("GroupsAdsEasyPromoteBannerDto(linkUrl="), this.linkUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.linkUrl);
    }
}
