package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsCreationOnboardingScreenButtonDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingScreenButtonDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingScreenButtonDto> CREATOR = new a();

    @pmi0("action")
    private final String action;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsCreationOnboardingScreenButtonDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingScreenButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenButtonDto createFromParcel(Parcel parcel) {
            return new GroupsCreationOnboardingScreenButtonDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenButtonDto[] newArray(int i) {
            return new GroupsCreationOnboardingScreenButtonDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsCreationOnboardingScreenButtonDto() {
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
        if (!(obj instanceof GroupsCreationOnboardingScreenButtonDto)) {
            return false;
        }
        GroupsCreationOnboardingScreenButtonDto groupsCreationOnboardingScreenButtonDto = (GroupsCreationOnboardingScreenButtonDto) obj;
        return epx.f(this.title, groupsCreationOnboardingScreenButtonDto.title) && epx.f(this.action, groupsCreationOnboardingScreenButtonDto.action);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.action;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCreationOnboardingScreenButtonDto(title=");
        sb.append(this.title);
        sb.append(", action=");
        return ho8.a(sb, this.action, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.action);
    }

    public GroupsCreationOnboardingScreenButtonDto(String str, String str2) {
        this.title = str;
        this.action = str2;
    }

    public /* synthetic */ GroupsCreationOnboardingScreenButtonDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
