package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AppsAdsSlotsSettingsMappingDto.kt */
/* loaded from: classes14.dex */
public final class AppsAdsSlotsSettingsMappingDto implements Parcelable {
    public static final Parcelable.Creator<AppsAdsSlotsSettingsMappingDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("tag")
    private final String tag;

    /* compiled from: AppsAdsSlotsSettingsMappingDto.kt */
    public static final class a implements Parcelable.Creator<AppsAdsSlotsSettingsMappingDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsSettingsMappingDto createFromParcel(Parcel parcel) {
            return new AppsAdsSlotsSettingsMappingDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAdsSlotsSettingsMappingDto[] newArray(int i) {
            return new AppsAdsSlotsSettingsMappingDto[i];
        }
    }

    public AppsAdsSlotsSettingsMappingDto(int i, String str) {
        this.id = i;
        this.tag = str;
    }

    public final String d() {
        return this.tag;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAdsSlotsSettingsMappingDto)) {
            return false;
        }
        AppsAdsSlotsSettingsMappingDto appsAdsSlotsSettingsMappingDto = (AppsAdsSlotsSettingsMappingDto) obj;
        return this.id == appsAdsSlotsSettingsMappingDto.id && epx.f(this.tag, appsAdsSlotsSettingsMappingDto.tag);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.tag.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAdsSlotsSettingsMappingDto(id=");
        sb.append(this.id);
        sb.append(", tag=");
        return ho8.a(sb, this.tag, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.tag);
    }
}
