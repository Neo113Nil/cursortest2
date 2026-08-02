package com.vk.api.generated.services.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ServicesServiceDto.kt */
/* loaded from: classes15.dex */
public final class ServicesServiceDto implements Parcelable {
    public static final Parcelable.Creator<ServicesServiceDto> CREATOR = new a();

    @pmi0("abonement_restriction")
    private final int abonementRestriction;

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    private final int active;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final ServicesCurrencyDto currency;

    @pmi0("description")
    private final String description;

    @pmi0("duration")
    private final int duration;

    @pmi0("external_id")
    private final Integer externalId;

    @pmi0("id")
    private final int id;

    @pmi0("image")
    private final String image;

    @pmi0("name")
    private final String name;

    @pmi0("prepaid")
    private final String prepaid;

    @pmi0("price")
    private final int price;

    @pmi0("price_from")
    private final int priceFrom;

    @pmi0("weight")
    private final int weight;

    @pmi0("yc_branch_id")
    private final Integer ycBranchId;

    /* compiled from: ServicesServiceDto.kt */
    public static final class a implements Parcelable.Creator<ServicesServiceDto> {
        @Override // android.os.Parcelable.Creator
        public final ServicesServiceDto createFromParcel(Parcel parcel) {
            return new ServicesServiceDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), ServicesCurrencyDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesServiceDto[] newArray(int i) {
            return new ServicesServiceDto[i];
        }
    }

    public ServicesServiceDto(int i, String str, String str2, int i2, int i3, int i4, ServicesCurrencyDto servicesCurrencyDto, int i5, int i6, String str3, String str4, int i7, Integer num, Integer num2) {
        this.id = i;
        this.name = str;
        this.description = str2;
        this.duration = i2;
        this.price = i3;
        this.priceFrom = i4;
        this.currency = servicesCurrencyDto;
        this.weight = i5;
        this.active = i6;
        this.image = str3;
        this.prepaid = str4;
        this.abonementRestriction = i7;
        this.externalId = num;
        this.ycBranchId = num2;
    }

    public final int d() {
        return this.active;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.externalId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesServiceDto)) {
            return false;
        }
        ServicesServiceDto servicesServiceDto = (ServicesServiceDto) obj;
        return this.id == servicesServiceDto.id && epx.f(this.name, servicesServiceDto.name) && epx.f(this.description, servicesServiceDto.description) && this.duration == servicesServiceDto.duration && this.price == servicesServiceDto.price && this.priceFrom == servicesServiceDto.priceFrom && epx.f(this.currency, servicesServiceDto.currency) && this.weight == servicesServiceDto.weight && this.active == servicesServiceDto.active && epx.f(this.image, servicesServiceDto.image) && epx.f(this.prepaid, servicesServiceDto.prepaid) && this.abonementRestriction == servicesServiceDto.abonementRestriction && epx.f(this.externalId, servicesServiceDto.externalId) && epx.f(this.ycBranchId, servicesServiceDto.ycBranchId);
    }

    public final String f() {
        return this.image;
    }

    public final String g() {
        return this.name;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = shy.a(this.abonementRestriction, urd0.a(urd0.a(shy.a(this.active, shy.a(this.weight, (this.currency.hashCode() + shy.a(this.priceFrom, shy.a(this.price, shy.a(this.duration, urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.description), 31), 31), 31)) * 31, 31), 31), 31, this.image), 31, this.prepaid), 31);
        Integer num = this.externalId;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.ycBranchId;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final int i() {
        return this.price;
    }

    public final int j() {
        return this.priceFrom;
    }

    public final int k() {
        return this.weight;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServicesServiceDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", priceFrom=");
        sb.append(this.priceFrom);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", active=");
        sb.append(this.active);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", prepaid=");
        sb.append(this.prepaid);
        sb.append(", abonementRestriction=");
        sb.append(this.abonementRestriction);
        sb.append(", externalId=");
        sb.append(this.externalId);
        sb.append(", ycBranchId=");
        return uqi.b(sb, this.ycBranchId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.price);
        parcel.writeInt(this.priceFrom);
        this.currency.writeToParcel(parcel, i);
        parcel.writeInt(this.weight);
        parcel.writeInt(this.active);
        parcel.writeString(this.image);
        parcel.writeString(this.prepaid);
        parcel.writeInt(this.abonementRestriction);
        Integer num = this.externalId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.ycBranchId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ ServicesServiceDto(int i, String str, String str2, int i2, int i3, int i4, ServicesCurrencyDto servicesCurrencyDto, int i5, int i6, String str3, String str4, int i7, Integer num, Integer num2, int i8, zcl zclVar) {
        this(i, str, str2, i2, i3, i4, servicesCurrencyDto, i5, i6, str3, str4, i7, (i8 & 4096) != 0 ? null : num, (i8 & 8192) != 0 ? null : num2);
    }
}
