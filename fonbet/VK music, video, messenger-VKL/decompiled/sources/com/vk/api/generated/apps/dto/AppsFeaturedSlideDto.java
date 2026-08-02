package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsFeaturedSlideDto.kt */
/* loaded from: classes14.dex */
public final class AppsFeaturedSlideDto implements Parcelable {
    public static final Parcelable.Creator<AppsFeaturedSlideDto> CREATOR = new a();

    @pmi0("app_id")
    private final int appId;

    @pmi0("banner_1120")
    private final String banner1120;

    @pmi0("banner_560")
    private final String banner560;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("custom_link")
    private final String customLink;

    @pmi0("description")
    private final String description;

    @pmi0("video")
    private final VideoVideoFullDto video;

    /* compiled from: AppsFeaturedSlideDto.kt */
    public static final class a implements Parcelable.Creator<AppsFeaturedSlideDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsFeaturedSlideDto createFromParcel(Parcel parcel) {
            return new AppsFeaturedSlideDto(parcel.readInt(), parcel.readString(), parcel.readString(), (VideoVideoFullDto) parcel.readParcelable(AppsFeaturedSlideDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsFeaturedSlideDto[] newArray(int i) {
            return new AppsFeaturedSlideDto[i];
        }
    }

    public AppsFeaturedSlideDto(int i, String str, String str2, VideoVideoFullDto videoVideoFullDto, String str3, String str4, String str5) {
        this.appId = i;
        this.banner1120 = str;
        this.banner560 = str2;
        this.video = videoVideoFullDto;
        this.description = str3;
        this.buttonText = str4;
        this.customLink = str5;
    }

    public final int d() {
        return this.appId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.banner1120;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsFeaturedSlideDto)) {
            return false;
        }
        AppsFeaturedSlideDto appsFeaturedSlideDto = (AppsFeaturedSlideDto) obj;
        return this.appId == appsFeaturedSlideDto.appId && epx.f(this.banner1120, appsFeaturedSlideDto.banner1120) && epx.f(this.banner560, appsFeaturedSlideDto.banner560) && epx.f(this.video, appsFeaturedSlideDto.video) && epx.f(this.description, appsFeaturedSlideDto.description) && epx.f(this.buttonText, appsFeaturedSlideDto.buttonText) && epx.f(this.customLink, appsFeaturedSlideDto.customLink);
    }

    public final String f() {
        return this.banner560;
    }

    public final String g() {
        return this.buttonText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Integer.hashCode(this.appId) * 31, 31, this.banner1120), 31, this.banner560);
        VideoVideoFullDto videoVideoFullDto = this.video;
        int hashCode = (a2 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customLink;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsFeaturedSlideDto(appId=");
        sb.append(this.appId);
        sb.append(", banner1120=");
        sb.append(this.banner1120);
        sb.append(", banner560=");
        sb.append(this.banner560);
        sb.append(", video=");
        sb.append(this.video);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", customLink=");
        return ho8.a(sb, this.customLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.appId);
        parcel.writeString(this.banner1120);
        parcel.writeString(this.banner560);
        parcel.writeParcelable(this.video, i);
        parcel.writeString(this.description);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.customLink);
    }

    public /* synthetic */ AppsFeaturedSlideDto(int i, String str, String str2, VideoVideoFullDto videoVideoFullDto, String str3, String str4, String str5, int i2, zcl zclVar) {
        this(i, str, str2, (i2 & 8) != 0 ? null : videoVideoFullDto, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5);
    }
}
