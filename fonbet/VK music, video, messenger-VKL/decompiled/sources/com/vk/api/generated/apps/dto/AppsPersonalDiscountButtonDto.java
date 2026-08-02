package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsPersonalDiscountButtonDto.kt */
/* loaded from: classes14.dex */
public final class AppsPersonalDiscountButtonDto implements Parcelable {
    public static final Parcelable.Creator<AppsPersonalDiscountButtonDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsPersonalDiscountButtonDto.kt */
    public static final class a implements Parcelable.Creator<AppsPersonalDiscountButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsPersonalDiscountButtonDto createFromParcel(Parcel parcel) {
            return new AppsPersonalDiscountButtonDto((BaseLinkButtonActionDto) parcel.readParcelable(AppsPersonalDiscountButtonDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsPersonalDiscountButtonDto[] newArray(int i) {
            return new AppsPersonalDiscountButtonDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsPersonalDiscountButtonDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsPersonalDiscountButtonDto)) {
            return false;
        }
        AppsPersonalDiscountButtonDto appsPersonalDiscountButtonDto = (AppsPersonalDiscountButtonDto) obj;
        return epx.f(this.action, appsPersonalDiscountButtonDto.action) && epx.f(this.title, appsPersonalDiscountButtonDto.title);
    }

    public final int hashCode() {
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode = (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode()) * 31;
        String str = this.title;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsPersonalDiscountButtonDto(action=");
        sb.append(this.action);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.action, i);
        parcel.writeString(this.title);
    }

    public AppsPersonalDiscountButtonDto(BaseLinkButtonActionDto baseLinkButtonActionDto, String str) {
        this.action = baseLinkButtonActionDto;
        this.title = str;
    }

    public /* synthetic */ AppsPersonalDiscountButtonDto(BaseLinkButtonActionDto baseLinkButtonActionDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseLinkButtonActionDto, (i & 2) != 0 ? null : str);
    }
}
