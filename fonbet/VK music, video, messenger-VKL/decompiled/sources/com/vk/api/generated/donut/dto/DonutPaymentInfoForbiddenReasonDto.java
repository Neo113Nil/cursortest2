package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DonutPaymentInfoForbiddenReasonDto.kt */
/* loaded from: classes14.dex */
public final class DonutPaymentInfoForbiddenReasonDto implements Parcelable {
    public static final Parcelable.Creator<DonutPaymentInfoForbiddenReasonDto> CREATOR = new a();

    @pmi0("back_button")
    private final String backButton;

    @pmi0("description")
    private final String description;

    @pmi0("title")
    private final String title;

    /* compiled from: DonutPaymentInfoForbiddenReasonDto.kt */
    public static final class a implements Parcelable.Creator<DonutPaymentInfoForbiddenReasonDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutPaymentInfoForbiddenReasonDto createFromParcel(Parcel parcel) {
            return new DonutPaymentInfoForbiddenReasonDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutPaymentInfoForbiddenReasonDto[] newArray(int i) {
            return new DonutPaymentInfoForbiddenReasonDto[i];
        }
    }

    public DonutPaymentInfoForbiddenReasonDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutPaymentInfoForbiddenReasonDto)) {
            return false;
        }
        DonutPaymentInfoForbiddenReasonDto donutPaymentInfoForbiddenReasonDto = (DonutPaymentInfoForbiddenReasonDto) obj;
        return epx.f(this.title, donutPaymentInfoForbiddenReasonDto.title) && epx.f(this.description, donutPaymentInfoForbiddenReasonDto.description) && epx.f(this.backButton, donutPaymentInfoForbiddenReasonDto.backButton);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backButton;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutPaymentInfoForbiddenReasonDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", backButton=");
        return ho8.a(sb, this.backButton, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.backButton);
    }

    public DonutPaymentInfoForbiddenReasonDto(String str, String str2, String str3) {
        this.title = str;
        this.description = str2;
        this.backButton = str3;
    }

    public /* synthetic */ DonutPaymentInfoForbiddenReasonDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
