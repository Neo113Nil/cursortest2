package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsAdsBannerPortletDataDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsBannerPortletDataDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsBannerPortletDataDto> CREATOR = new a();

    @pmi0("advertising_label")
    private final String advertisingLabel;

    @pmi0("allow_close")
    private final boolean allowClose;

    @pmi0("cta_text")
    private final String ctaText;

    @pmi0("description")
    private final String description;

    @pmi0("icon_height")
    private final int iconHeight;

    @pmi0("icon_link")
    private final String iconLink;

    @pmi0("icon_width")
    private final int iconWidth;

    @pmi0("title")
    private final String title;

    @pmi0("tracking_link")
    private final String trackingLink;

    /* compiled from: AppsAdsBannerPortletDataDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsBannerPortletDataDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsBannerPortletDataDto createFromParcel(Parcel parcel) {
            return new AppsAdsBannerPortletDataDto(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsBannerPortletDataDto[] newArray(int i) {
            return new AppsAdsBannerPortletDataDto[i];
        }
    }

    public AppsAdsBannerPortletDataDto(String str, String str2, boolean z, String str3, int i, int i2, String str4, String str5, String str6) {
        this.title = str;
        this.description = str2;
        this.allowClose = z;
        this.iconLink = str3;
        this.iconWidth = i;
        this.iconHeight = i2;
        this.trackingLink = str4;
        this.advertisingLabel = str5;
        this.ctaText = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAdsBannerPortletDataDto)) {
            return false;
        }
        AppsAdsBannerPortletDataDto appsAdsBannerPortletDataDto = (AppsAdsBannerPortletDataDto) obj;
        return epx.f(this.title, appsAdsBannerPortletDataDto.title) && epx.f(this.description, appsAdsBannerPortletDataDto.description) && this.allowClose == appsAdsBannerPortletDataDto.allowClose && epx.f(this.iconLink, appsAdsBannerPortletDataDto.iconLink) && this.iconWidth == appsAdsBannerPortletDataDto.iconWidth && this.iconHeight == appsAdsBannerPortletDataDto.iconHeight && epx.f(this.trackingLink, appsAdsBannerPortletDataDto.trackingLink) && epx.f(this.advertisingLabel, appsAdsBannerPortletDataDto.advertisingLabel) && epx.f(this.ctaText, appsAdsBannerPortletDataDto.ctaText);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.iconHeight, shy.a(this.iconWidth, urd0.a(qoy.b(urd0.a(this.title.hashCode() * 31, 31, this.description), 31, this.allowClose), 31, this.iconLink), 31), 31), 31, this.trackingLink);
        String str = this.advertisingLabel;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ctaText;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAdsBannerPortletDataDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", allowClose=");
        sb.append(this.allowClose);
        sb.append(", iconLink=");
        sb.append(this.iconLink);
        sb.append(", iconWidth=");
        sb.append(this.iconWidth);
        sb.append(", iconHeight=");
        sb.append(this.iconHeight);
        sb.append(", trackingLink=");
        sb.append(this.trackingLink);
        sb.append(", advertisingLabel=");
        sb.append(this.advertisingLabel);
        sb.append(", ctaText=");
        return ho8.a(sb, this.ctaText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeInt(this.allowClose ? 1 : 0);
        parcel.writeString(this.iconLink);
        parcel.writeInt(this.iconWidth);
        parcel.writeInt(this.iconHeight);
        parcel.writeString(this.trackingLink);
        parcel.writeString(this.advertisingLabel);
        parcel.writeString(this.ctaText);
    }

    public /* synthetic */ AppsAdsBannerPortletDataDto(String str, String str2, boolean z, String str3, int i, int i2, String str4, String str5, String str6, int i3, zcl zclVar) {
        this(str, str2, z, str3, i, i2, str4, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? null : str6);
    }
}
