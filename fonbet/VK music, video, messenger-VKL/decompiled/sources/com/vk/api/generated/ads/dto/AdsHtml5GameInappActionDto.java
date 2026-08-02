package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AdsHtml5GameInappActionDto.kt */
/* loaded from: classes14.dex */
public final class AdsHtml5GameInappActionDto implements Parcelable {
    public static final Parcelable.Creator<AdsHtml5GameInappActionDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("name")
    private final String name;

    /* compiled from: AdsHtml5GameInappActionDto.kt */
    public static final class a implements Parcelable.Creator<AdsHtml5GameInappActionDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsHtml5GameInappActionDto createFromParcel(Parcel parcel) {
            return new AdsHtml5GameInappActionDto(parcel.readString(), (BaseLinkButtonActionDto) parcel.readParcelable(AdsHtml5GameInappActionDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdsHtml5GameInappActionDto[] newArray(int i) {
            return new AdsHtml5GameInappActionDto[i];
        }
    }

    public AdsHtml5GameInappActionDto(String str, BaseLinkButtonActionDto baseLinkButtonActionDto) {
        this.name = str;
        this.action = baseLinkButtonActionDto;
    }

    public final BaseLinkButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsHtml5GameInappActionDto)) {
            return false;
        }
        AdsHtml5GameInappActionDto adsHtml5GameInappActionDto = (AdsHtml5GameInappActionDto) obj;
        return epx.f(this.name, adsHtml5GameInappActionDto.name) && epx.f(this.action, adsHtml5GameInappActionDto.action);
    }

    public final int hashCode() {
        return this.action.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return "AdsHtml5GameInappActionDto(name=" + this.name + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeParcelable(this.action, i);
    }
}
