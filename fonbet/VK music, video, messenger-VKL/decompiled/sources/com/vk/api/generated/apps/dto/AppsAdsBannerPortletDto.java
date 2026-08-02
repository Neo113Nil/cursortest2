package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AppsAdsBannerPortletDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsBannerPortletDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsBannerPortletDto> CREATOR = new a();

    @pmi0("banner")
    private final int banner;

    @pmi0("data")
    private final AppsAdsBannerPortletDataDto data;

    @pmi0("slot")
    private final int slot;

    /* compiled from: AppsAdsBannerPortletDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsBannerPortletDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsBannerPortletDto createFromParcel(Parcel parcel) {
            return new AppsAdsBannerPortletDto(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : AppsAdsBannerPortletDataDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsBannerPortletDto[] newArray(int i) {
            return new AppsAdsBannerPortletDto[i];
        }
    }

    public AppsAdsBannerPortletDto(int i, int i2, AppsAdsBannerPortletDataDto appsAdsBannerPortletDataDto) {
        this.slot = i;
        this.banner = i2;
        this.data = appsAdsBannerPortletDataDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAdsBannerPortletDto)) {
            return false;
        }
        AppsAdsBannerPortletDto appsAdsBannerPortletDto = (AppsAdsBannerPortletDto) obj;
        return this.slot == appsAdsBannerPortletDto.slot && this.banner == appsAdsBannerPortletDto.banner && epx.f(this.data, appsAdsBannerPortletDto.data);
    }

    public final int hashCode() {
        int a2 = shy.a(this.banner, Integer.hashCode(this.slot) * 31, 31);
        AppsAdsBannerPortletDataDto appsAdsBannerPortletDataDto = this.data;
        return a2 + (appsAdsBannerPortletDataDto == null ? 0 : appsAdsBannerPortletDataDto.hashCode());
    }

    public final String toString() {
        return "AppsAdsBannerPortletDto(slot=" + this.slot + ", banner=" + this.banner + ", data=" + this.data + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.slot);
        parcel.writeInt(this.banner);
        AppsAdsBannerPortletDataDto appsAdsBannerPortletDataDto = this.data;
        if (appsAdsBannerPortletDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAdsBannerPortletDataDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsAdsBannerPortletDto(int i, int i2, AppsAdsBannerPortletDataDto appsAdsBannerPortletDataDto, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? null : appsAdsBannerPortletDataDto);
    }
}
