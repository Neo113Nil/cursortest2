package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: GroupsCommunityPageBannerDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCommunityPageBannerDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCommunityPageBannerDto> CREATOR = new a();

    @pmi0("can_hide")
    private final Boolean canHide;

    @pmi0("description")
    private final String description;

    @pmi0("image_link")
    private final String imageLink;

    @pmi0("title")
    private final String title;

    @pmi0("title_link")
    private final String titleLink;

    /* compiled from: GroupsCommunityPageBannerDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCommunityPageBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCommunityPageBannerDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsCommunityPageBannerDto(readString, readString2, readString3, valueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCommunityPageBannerDto[] newArray(int i) {
            return new GroupsCommunityPageBannerDto[i];
        }
    }

    public GroupsCommunityPageBannerDto() {
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
        if (!(obj instanceof GroupsCommunityPageBannerDto)) {
            return false;
        }
        GroupsCommunityPageBannerDto groupsCommunityPageBannerDto = (GroupsCommunityPageBannerDto) obj;
        return epx.f(this.title, groupsCommunityPageBannerDto.title) && epx.f(this.titleLink, groupsCommunityPageBannerDto.titleLink) && epx.f(this.description, groupsCommunityPageBannerDto.description) && epx.f(this.canHide, groupsCommunityPageBannerDto.canHide) && epx.f(this.imageLink, groupsCommunityPageBannerDto.imageLink);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleLink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canHide;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.imageLink;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCommunityPageBannerDto(title=");
        sb.append(this.title);
        sb.append(", titleLink=");
        sb.append(this.titleLink);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", canHide=");
        sb.append(this.canHide);
        sb.append(", imageLink=");
        return ho8.a(sb, this.imageLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.titleLink);
        parcel.writeString(this.description);
        Boolean bool = this.canHide;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.imageLink);
    }

    public GroupsCommunityPageBannerDto(String str, String str2, String str3, Boolean bool, String str4) {
        this.title = str;
        this.titleLink = str2;
        this.description = str3;
        this.canHide = bool;
        this.imageLink = str4;
    }

    public /* synthetic */ GroupsCommunityPageBannerDto(String str, String str2, String str3, Boolean bool, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str4);
    }
}
