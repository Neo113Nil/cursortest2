package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: GroupsRecommendedTipsWidgetDto.kt */
/* loaded from: classes14.dex */
public final class GroupsRecommendedTipsWidgetDto implements Parcelable {
    public static final Parcelable.Creator<GroupsRecommendedTipsWidgetDto> CREATOR = new a();

    @pmi0("section_hidden")
    private final boolean sectionHidden;

    @pmi0("tips_completed")
    private final int tipsCompleted;

    @pmi0("tips_total")
    private final int tipsTotal;

    @pmi0("widget_img_url")
    private final String widgetImgUrl;

    @pmi0("widget_img_url_dark")
    private final String widgetImgUrlDark;

    /* compiled from: GroupsRecommendedTipsWidgetDto.kt */
    public static final class a implements Parcelable.Creator<GroupsRecommendedTipsWidgetDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsRecommendedTipsWidgetDto createFromParcel(Parcel parcel) {
            return new GroupsRecommendedTipsWidgetDto(parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsRecommendedTipsWidgetDto[] newArray(int i) {
            return new GroupsRecommendedTipsWidgetDto[i];
        }
    }

    public GroupsRecommendedTipsWidgetDto(boolean z, int i, int i2, String str, String str2) {
        this.sectionHidden = z;
        this.tipsTotal = i;
        this.tipsCompleted = i2;
        this.widgetImgUrl = str;
        this.widgetImgUrlDark = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsRecommendedTipsWidgetDto)) {
            return false;
        }
        GroupsRecommendedTipsWidgetDto groupsRecommendedTipsWidgetDto = (GroupsRecommendedTipsWidgetDto) obj;
        return this.sectionHidden == groupsRecommendedTipsWidgetDto.sectionHidden && this.tipsTotal == groupsRecommendedTipsWidgetDto.tipsTotal && this.tipsCompleted == groupsRecommendedTipsWidgetDto.tipsCompleted && epx.f(this.widgetImgUrl, groupsRecommendedTipsWidgetDto.widgetImgUrl) && epx.f(this.widgetImgUrlDark, groupsRecommendedTipsWidgetDto.widgetImgUrlDark);
    }

    public final int hashCode() {
        return this.widgetImgUrlDark.hashCode() + urd0.a(shy.a(this.tipsCompleted, shy.a(this.tipsTotal, Boolean.hashCode(this.sectionHidden) * 31, 31), 31), 31, this.widgetImgUrl);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsRecommendedTipsWidgetDto(sectionHidden=");
        sb.append(this.sectionHidden);
        sb.append(", tipsTotal=");
        sb.append(this.tipsTotal);
        sb.append(", tipsCompleted=");
        sb.append(this.tipsCompleted);
        sb.append(", widgetImgUrl=");
        sb.append(this.widgetImgUrl);
        sb.append(", widgetImgUrlDark=");
        return ho8.a(sb, this.widgetImgUrlDark, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sectionHidden ? 1 : 0);
        parcel.writeInt(this.tipsTotal);
        parcel.writeInt(this.tipsCompleted);
        parcel.writeString(this.widgetImgUrl);
        parcel.writeString(this.widgetImgUrlDark);
    }
}
