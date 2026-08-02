package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsCreationOnboardingScreenClipsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingScreenClipsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingScreenClipsDto> CREATOR = new a();

    @pmi0("button")
    private final GroupsCreationOnboardingScreenButtonDto button;

    @pmi0("image")
    private final String image;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsCreationOnboardingScreenClipsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingScreenClipsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenClipsDto createFromParcel(Parcel parcel) {
            return new GroupsCreationOnboardingScreenClipsDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenClipsDto[] newArray(int i) {
            return new GroupsCreationOnboardingScreenClipsDto[i];
        }
    }

    public GroupsCreationOnboardingScreenClipsDto(String str, String str2, String str3, GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto) {
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
        if (!(obj instanceof GroupsCreationOnboardingScreenClipsDto)) {
            return false;
        }
        GroupsCreationOnboardingScreenClipsDto groupsCreationOnboardingScreenClipsDto = (GroupsCreationOnboardingScreenClipsDto) obj;
        return epx.f(this.title, groupsCreationOnboardingScreenClipsDto.title) && epx.f(this.subtitle, groupsCreationOnboardingScreenClipsDto.subtitle) && epx.f(this.image, groupsCreationOnboardingScreenClipsDto.image) && epx.f(this.button, groupsCreationOnboardingScreenClipsDto.button);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.subtitle), 31, this.image);
        GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto = this.button;
        return a2 + (groupsCreationOnboardingScreenButtonDto == null ? 0 : groupsCreationOnboardingScreenButtonDto.hashCode());
    }

    public final String toString() {
        return "GroupsCreationOnboardingScreenClipsDto(title=" + this.title + ", subtitle=" + this.subtitle + ", image=" + this.image + ", button=" + this.button + ')';
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

    public /* synthetic */ GroupsCreationOnboardingScreenClipsDto(String str, String str2, String str3, GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : groupsCreationOnboardingScreenButtonDto);
    }
}
