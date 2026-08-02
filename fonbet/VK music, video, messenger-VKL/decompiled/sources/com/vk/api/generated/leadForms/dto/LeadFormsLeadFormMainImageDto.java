package com.vk.api.generated.leadForms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: LeadFormsLeadFormMainImageDto.kt */
/* loaded from: classes14.dex */
public final class LeadFormsLeadFormMainImageDto implements Parcelable {
    public static final Parcelable.Creator<LeadFormsLeadFormMainImageDto> CREATOR = new a();

    /* renamed from: 1080x607, reason: not valid java name */
    @pmi0("1080x607")
    private final String f51080x607;

    /* renamed from: 320x180, reason: not valid java name */
    @pmi0("320x180")
    private final String f6320x180;

    /* renamed from: 480x270, reason: not valid java name */
    @pmi0("480x270")
    private final String f7480x270;

    /* compiled from: LeadFormsLeadFormMainImageDto.kt */
    public static final class a implements Parcelable.Creator<LeadFormsLeadFormMainImageDto> {
        @Override // android.os.Parcelable.Creator
        public final LeadFormsLeadFormMainImageDto createFromParcel(Parcel parcel) {
            return new LeadFormsLeadFormMainImageDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LeadFormsLeadFormMainImageDto[] newArray(int i) {
            return new LeadFormsLeadFormMainImageDto[i];
        }
    }

    public LeadFormsLeadFormMainImageDto(String str, String str2, String str3) {
        this.f51080x607 = str;
        this.f7480x270 = str2;
        this.f6320x180 = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsLeadFormMainImageDto)) {
            return false;
        }
        LeadFormsLeadFormMainImageDto leadFormsLeadFormMainImageDto = (LeadFormsLeadFormMainImageDto) obj;
        return epx.f(this.f51080x607, leadFormsLeadFormMainImageDto.f51080x607) && epx.f(this.f7480x270, leadFormsLeadFormMainImageDto.f7480x270) && epx.f(this.f6320x180, leadFormsLeadFormMainImageDto.f6320x180);
    }

    public final int hashCode() {
        return this.f6320x180.hashCode() + urd0.a(this.f51080x607.hashCode() * 31, 31, this.f7480x270);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeadFormsLeadFormMainImageDto(1080x607=");
        sb.append(this.f51080x607);
        sb.append(", 480x270=");
        sb.append(this.f7480x270);
        sb.append(", 320x180=");
        return ho8.a(sb, this.f6320x180, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f51080x607);
        parcel.writeString(this.f7480x270);
        parcel.writeString(this.f6320x180);
    }
}
