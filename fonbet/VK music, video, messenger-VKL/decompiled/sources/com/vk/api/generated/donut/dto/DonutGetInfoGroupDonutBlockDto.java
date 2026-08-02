package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DonutGetInfoGroupDonutBlockDto.kt */
/* loaded from: classes14.dex */
public final class DonutGetInfoGroupDonutBlockDto implements Parcelable {
    public static final Parcelable.Creator<DonutGetInfoGroupDonutBlockDto> CREATOR = new a();

    @pmi0("about_button")
    private final BaseLinkButtonDto aboutButton;

    @pmi0("banner")
    private final DonutBannerDto banner;

    @pmi0("description")
    private final String description;

    @pmi0("discount")
    private final String discount;

    @pmi0("goals_info")
    private final DonutGoalsInfoDto goalsInfo;

    @pmi0("regular_support")
    private final DonutRegularSupportDto regularSupport;

    @pmi0("settings_button")
    private final BaseLinkButtonDto settingsButton;

    @pmi0("title")
    private final String title;

    /* compiled from: DonutGetInfoGroupDonutBlockDto.kt */
    public static final class a implements Parcelable.Creator<DonutGetInfoGroupDonutBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGetInfoGroupDonutBlockDto createFromParcel(Parcel parcel) {
            return new DonutGetInfoGroupDonutBlockDto(parcel.readString(), parcel.readString(), parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(DonutGetInfoGroupDonutBlockDto.class.getClassLoader()), (BaseLinkButtonDto) parcel.readParcelable(DonutGetInfoGroupDonutBlockDto.class.getClassLoader()), parcel.readInt() == 0 ? null : DonutRegularSupportDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DonutGoalsInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DonutBannerDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGetInfoGroupDonutBlockDto[] newArray(int i) {
            return new DonutGetInfoGroupDonutBlockDto[i];
        }
    }

    public DonutGetInfoGroupDonutBlockDto(String str, String str2, String str3, BaseLinkButtonDto baseLinkButtonDto, BaseLinkButtonDto baseLinkButtonDto2, DonutRegularSupportDto donutRegularSupportDto, DonutGoalsInfoDto donutGoalsInfoDto, DonutBannerDto donutBannerDto) {
        this.title = str;
        this.description = str2;
        this.discount = str3;
        this.aboutButton = baseLinkButtonDto;
        this.settingsButton = baseLinkButtonDto2;
        this.regularSupport = donutRegularSupportDto;
        this.goalsInfo = donutGoalsInfoDto;
        this.banner = donutBannerDto;
    }

    public final BaseLinkButtonDto d() {
        return this.aboutButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final DonutBannerDto e() {
        return this.banner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGetInfoGroupDonutBlockDto)) {
            return false;
        }
        DonutGetInfoGroupDonutBlockDto donutGetInfoGroupDonutBlockDto = (DonutGetInfoGroupDonutBlockDto) obj;
        return epx.f(this.title, donutGetInfoGroupDonutBlockDto.title) && epx.f(this.description, donutGetInfoGroupDonutBlockDto.description) && epx.f(this.discount, donutGetInfoGroupDonutBlockDto.discount) && epx.f(this.aboutButton, donutGetInfoGroupDonutBlockDto.aboutButton) && epx.f(this.settingsButton, donutGetInfoGroupDonutBlockDto.settingsButton) && epx.f(this.regularSupport, donutGetInfoGroupDonutBlockDto.regularSupport) && epx.f(this.goalsInfo, donutGetInfoGroupDonutBlockDto.goalsInfo) && epx.f(this.banner, donutGetInfoGroupDonutBlockDto.banner);
    }

    public final String f() {
        return this.discount;
    }

    public final DonutGoalsInfoDto g() {
        return this.goalsInfo;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discount;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.aboutButton;
        int hashCode4 = (hashCode3 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto2 = this.settingsButton;
        int hashCode5 = (hashCode4 + (baseLinkButtonDto2 == null ? 0 : baseLinkButtonDto2.hashCode())) * 31;
        DonutRegularSupportDto donutRegularSupportDto = this.regularSupport;
        int hashCode6 = (hashCode5 + (donutRegularSupportDto == null ? 0 : donutRegularSupportDto.hashCode())) * 31;
        DonutGoalsInfoDto donutGoalsInfoDto = this.goalsInfo;
        int hashCode7 = (hashCode6 + (donutGoalsInfoDto == null ? 0 : donutGoalsInfoDto.hashCode())) * 31;
        DonutBannerDto donutBannerDto = this.banner;
        return hashCode7 + (donutBannerDto != null ? donutBannerDto.hashCode() : 0);
    }

    public final DonutRegularSupportDto i() {
        return this.regularSupport;
    }

    public final BaseLinkButtonDto j() {
        return this.settingsButton;
    }

    public final String toString() {
        return "DonutGetInfoGroupDonutBlockDto(title=" + this.title + ", description=" + this.description + ", discount=" + this.discount + ", aboutButton=" + this.aboutButton + ", settingsButton=" + this.settingsButton + ", regularSupport=" + this.regularSupport + ", goalsInfo=" + this.goalsInfo + ", banner=" + this.banner + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.discount);
        parcel.writeParcelable(this.aboutButton, i);
        parcel.writeParcelable(this.settingsButton, i);
        DonutRegularSupportDto donutRegularSupportDto = this.regularSupport;
        if (donutRegularSupportDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutRegularSupportDto.writeToParcel(parcel, i);
        }
        DonutGoalsInfoDto donutGoalsInfoDto = this.goalsInfo;
        if (donutGoalsInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutGoalsInfoDto.writeToParcel(parcel, i);
        }
        DonutBannerDto donutBannerDto = this.banner;
        if (donutBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutBannerDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ DonutGetInfoGroupDonutBlockDto(String str, String str2, String str3, BaseLinkButtonDto baseLinkButtonDto, BaseLinkButtonDto baseLinkButtonDto2, DonutRegularSupportDto donutRegularSupportDto, DonutGoalsInfoDto donutGoalsInfoDto, DonutBannerDto donutBannerDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : baseLinkButtonDto, (i & 16) != 0 ? null : baseLinkButtonDto2, (i & 32) != 0 ? null : donutRegularSupportDto, (i & 64) != 0 ? null : donutGoalsInfoDto, (i & 128) != 0 ? null : donutBannerDto);
    }
}
