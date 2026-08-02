package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: GroupsRecommendedTipsListImageObjectsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsRecommendedTipsListImageObjectsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsRecommendedTipsListImageObjectsDto> CREATOR = new a();

    @pmi0("hide_modal_widget_theme")
    private final String hideModalWidgetTheme;

    @pmi0("step_1")
    private final String step1;

    @pmi0("step_2")
    private final String step2;

    @pmi0("step_3")
    private final String step3;

    @pmi0("widget_theme")
    private final String widgetTheme;

    /* compiled from: GroupsRecommendedTipsListImageObjectsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsRecommendedTipsListImageObjectsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsRecommendedTipsListImageObjectsDto createFromParcel(Parcel parcel) {
            return new GroupsRecommendedTipsListImageObjectsDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsRecommendedTipsListImageObjectsDto[] newArray(int i) {
            return new GroupsRecommendedTipsListImageObjectsDto[i];
        }
    }

    public GroupsRecommendedTipsListImageObjectsDto(String str, String str2, String str3, String str4, String str5) {
        this.step1 = str;
        this.step2 = str2;
        this.step3 = str3;
        this.widgetTheme = str4;
        this.hideModalWidgetTheme = str5;
    }

    public final String d() {
        return this.step1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.step2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsRecommendedTipsListImageObjectsDto)) {
            return false;
        }
        GroupsRecommendedTipsListImageObjectsDto groupsRecommendedTipsListImageObjectsDto = (GroupsRecommendedTipsListImageObjectsDto) obj;
        return epx.f(this.step1, groupsRecommendedTipsListImageObjectsDto.step1) && epx.f(this.step2, groupsRecommendedTipsListImageObjectsDto.step2) && epx.f(this.step3, groupsRecommendedTipsListImageObjectsDto.step3) && epx.f(this.widgetTheme, groupsRecommendedTipsListImageObjectsDto.widgetTheme) && epx.f(this.hideModalWidgetTheme, groupsRecommendedTipsListImageObjectsDto.hideModalWidgetTheme);
    }

    public final String f() {
        return this.step3;
    }

    public final int hashCode() {
        return this.hideModalWidgetTheme.hashCode() + urd0.a(urd0.a(urd0.a(this.step1.hashCode() * 31, 31, this.step2), 31, this.step3), 31, this.widgetTheme);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsRecommendedTipsListImageObjectsDto(step1=");
        sb.append(this.step1);
        sb.append(", step2=");
        sb.append(this.step2);
        sb.append(", step3=");
        sb.append(this.step3);
        sb.append(", widgetTheme=");
        sb.append(this.widgetTheme);
        sb.append(", hideModalWidgetTheme=");
        return ho8.a(sb, this.hideModalWidgetTheme, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.step1);
        parcel.writeString(this.step2);
        parcel.writeString(this.step3);
        parcel.writeString(this.widgetTheme);
        parcel.writeString(this.hideModalWidgetTheme);
    }
}
