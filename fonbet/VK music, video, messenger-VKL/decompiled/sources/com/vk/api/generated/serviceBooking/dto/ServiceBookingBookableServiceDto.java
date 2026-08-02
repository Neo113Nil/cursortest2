package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ServiceBookingBookableServiceDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingBookableServiceDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingBookableServiceDto> CREATOR = new a();

    @pmi0("abonement_restriction")
    private final int abonementRestriction;

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    private final int active;

    @pmi0("category_id")
    private final int categoryId;

    @pmi0("comment")
    private final String comment;

    @pmi0("discount")
    private final int discount;

    @pmi0("id")
    private final int id;

    @pmi0("image")
    private final String image;

    @pmi0("prepaid")
    private final String prepaid;

    @pmi0("price_max")
    private final int priceMax;

    @pmi0("price_min")
    private final int priceMin;

    @pmi0("seance_length")
    private final Integer seanceLength;

    @pmi0("sex")
    private final int sex;

    @pmi0("title")
    private final String title;

    @pmi0("weight")
    private final int weight;

    /* compiled from: ServiceBookingBookableServiceDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingBookableServiceDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBookableServiceDto createFromParcel(Parcel parcel) {
            return new ServiceBookingBookableServiceDto(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBookableServiceDto[] newArray(int i) {
            return new ServiceBookingBookableServiceDto[i];
        }
    }

    public ServiceBookingBookableServiceDto(int i, String str, int i2, int i3, int i4, int i5, String str2, int i6, int i7, int i8, String str3, String str4, int i9, Integer num) {
        this.id = i;
        this.title = str;
        this.categoryId = i2;
        this.priceMin = i3;
        this.priceMax = i4;
        this.discount = i5;
        this.comment = str2;
        this.weight = i6;
        this.active = i7;
        this.sex = i8;
        this.image = str3;
        this.prepaid = str4;
        this.abonementRestriction = i9;
        this.seanceLength = num;
    }

    public final int d() {
        return this.active;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.categoryId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingBookableServiceDto)) {
            return false;
        }
        ServiceBookingBookableServiceDto serviceBookingBookableServiceDto = (ServiceBookingBookableServiceDto) obj;
        return this.id == serviceBookingBookableServiceDto.id && epx.f(this.title, serviceBookingBookableServiceDto.title) && this.categoryId == serviceBookingBookableServiceDto.categoryId && this.priceMin == serviceBookingBookableServiceDto.priceMin && this.priceMax == serviceBookingBookableServiceDto.priceMax && this.discount == serviceBookingBookableServiceDto.discount && epx.f(this.comment, serviceBookingBookableServiceDto.comment) && this.weight == serviceBookingBookableServiceDto.weight && this.active == serviceBookingBookableServiceDto.active && this.sex == serviceBookingBookableServiceDto.sex && epx.f(this.image, serviceBookingBookableServiceDto.image) && epx.f(this.prepaid, serviceBookingBookableServiceDto.prepaid) && this.abonementRestriction == serviceBookingBookableServiceDto.abonementRestriction && epx.f(this.seanceLength, serviceBookingBookableServiceDto.seanceLength);
    }

    public final String f() {
        return this.comment;
    }

    public final int g() {
        return this.discount;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.abonementRestriction, urd0.a(urd0.a(shy.a(this.sex, shy.a(this.active, shy.a(this.weight, urd0.a(shy.a(this.discount, shy.a(this.priceMax, shy.a(this.priceMin, shy.a(this.categoryId, urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31), 31), 31), 31), 31, this.comment), 31), 31), 31), 31, this.image), 31, this.prepaid), 31);
        Integer num = this.seanceLength;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String i() {
        return this.image;
    }

    public final int j() {
        return this.priceMax;
    }

    public final int k() {
        return this.priceMin;
    }

    public final Integer l() {
        return this.seanceLength;
    }

    public final int n() {
        return this.weight;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingBookableServiceDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", categoryId=");
        sb.append(this.categoryId);
        sb.append(", priceMin=");
        sb.append(this.priceMin);
        sb.append(", priceMax=");
        sb.append(this.priceMax);
        sb.append(", discount=");
        sb.append(this.discount);
        sb.append(", comment=");
        sb.append(this.comment);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", active=");
        sb.append(this.active);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", prepaid=");
        sb.append(this.prepaid);
        sb.append(", abonementRestriction=");
        sb.append(this.abonementRestriction);
        sb.append(", seanceLength=");
        return uqi.b(sb, this.seanceLength, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.categoryId);
        parcel.writeInt(this.priceMin);
        parcel.writeInt(this.priceMax);
        parcel.writeInt(this.discount);
        parcel.writeString(this.comment);
        parcel.writeInt(this.weight);
        parcel.writeInt(this.active);
        parcel.writeInt(this.sex);
        parcel.writeString(this.image);
        parcel.writeString(this.prepaid);
        parcel.writeInt(this.abonementRestriction);
        Integer num = this.seanceLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ ServiceBookingBookableServiceDto(int i, String str, int i2, int i3, int i4, int i5, String str2, int i6, int i7, int i8, String str3, String str4, int i9, Integer num, int i10, zcl zclVar) {
        this(i, str, i2, i3, i4, i5, str2, i6, i7, i8, str3, str4, i9, (i10 & 8192) != 0 ? null : num);
    }
}
