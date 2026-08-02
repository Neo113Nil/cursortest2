package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsCreationOnboardingScreenConditionDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingScreenConditionDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingScreenConditionDto> CREATOR = new a();

    @pmi0("is_completed")
    private final boolean isCompleted;

    @pmi0(C4504q2.u)
    private final int order;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    /* compiled from: GroupsCreationOnboardingScreenConditionDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingScreenConditionDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenConditionDto createFromParcel(Parcel parcel) {
            return new GroupsCreationOnboardingScreenConditionDto(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenConditionDto[] newArray(int i) {
            return new GroupsCreationOnboardingScreenConditionDto[i];
        }
    }

    public GroupsCreationOnboardingScreenConditionDto(String str, String str2, int i, boolean z, String str3) {
        this.title = str;
        this.type = str2;
        this.order = i;
        this.isCompleted = z;
        this.url = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCreationOnboardingScreenConditionDto)) {
            return false;
        }
        GroupsCreationOnboardingScreenConditionDto groupsCreationOnboardingScreenConditionDto = (GroupsCreationOnboardingScreenConditionDto) obj;
        return epx.f(this.title, groupsCreationOnboardingScreenConditionDto.title) && epx.f(this.type, groupsCreationOnboardingScreenConditionDto.type) && this.order == groupsCreationOnboardingScreenConditionDto.order && this.isCompleted == groupsCreationOnboardingScreenConditionDto.isCompleted && epx.f(this.url, groupsCreationOnboardingScreenConditionDto.url);
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.order, urd0.a(this.title.hashCode() * 31, 31, this.type), 31), 31, this.isCompleted);
        String str = this.url;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCreationOnboardingScreenConditionDto(title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", order=");
        sb.append(this.order);
        sb.append(", isCompleted=");
        sb.append(this.isCompleted);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.type);
        parcel.writeInt(this.order);
        parcel.writeInt(this.isCompleted ? 1 : 0);
        parcel.writeString(this.url);
    }

    public /* synthetic */ GroupsCreationOnboardingScreenConditionDto(String str, String str2, int i, boolean z, String str3, int i2, zcl zclVar) {
        this(str, str2, i, z, (i2 & 16) != 0 ? null : str3);
    }
}
