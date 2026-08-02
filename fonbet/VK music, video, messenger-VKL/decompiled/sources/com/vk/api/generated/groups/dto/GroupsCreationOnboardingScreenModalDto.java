package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsCreationOnboardingScreenModalDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingScreenModalDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingScreenModalDto> CREATOR = new a();

    @pmi0("button")
    private final GroupsCreationOnboardingScreenButtonDto button;

    @pmi0("image")
    private final String image;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsCreationOnboardingScreenModalDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingScreenModalDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenModalDto createFromParcel(Parcel parcel) {
            return new GroupsCreationOnboardingScreenModalDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenModalDto[] newArray(int i) {
            return new GroupsCreationOnboardingScreenModalDto[i];
        }
    }

    public GroupsCreationOnboardingScreenModalDto(String str, String str2, String str3, GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto) {
        this.title = str;
        this.subtitle = str2;
        this.image = str3;
        this.button = groupsCreationOnboardingScreenButtonDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCreationOnboardingScreenModalDto)) {
            return false;
        }
        GroupsCreationOnboardingScreenModalDto groupsCreationOnboardingScreenModalDto = (GroupsCreationOnboardingScreenModalDto) obj;
        return epx.f(this.title, groupsCreationOnboardingScreenModalDto.title) && epx.f(this.subtitle, groupsCreationOnboardingScreenModalDto.subtitle) && epx.f(this.image, groupsCreationOnboardingScreenModalDto.image) && epx.f(this.button, groupsCreationOnboardingScreenModalDto.button);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto = this.button;
        return hashCode3 + (groupsCreationOnboardingScreenButtonDto != null ? groupsCreationOnboardingScreenButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsCreationOnboardingScreenModalDto(title=" + this.title + ", subtitle=" + this.subtitle + ", image=" + this.image + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.image);
        GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto = this.button;
        if (groupsCreationOnboardingScreenButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsCreationOnboardingScreenModalDto(String str, String str2, String str3, GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : groupsCreationOnboardingScreenButtonDto);
    }
}
