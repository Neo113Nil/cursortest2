package com.vk.ecomm.reviews.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CreateMarketItemReviewArguments.kt */
/* loaded from: classes18.dex */
public final class CreateMarketItemReviewArguments implements Parcelable {
    public static final Parcelable.Creator<CreateMarketItemReviewArguments> CREATOR = new a();
    public final long b;
    public final UserId c;
    public final Float d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;

    /* compiled from: CreateMarketItemReviewArguments.kt */
    public static final class a implements Parcelable.Creator<CreateMarketItemReviewArguments> {
        @Override // android.os.Parcelable.Creator
        public final CreateMarketItemReviewArguments createFromParcel(Parcel parcel) {
            return new CreateMarketItemReviewArguments(parcel.readLong(), (UserId) parcel.readParcelable(CreateMarketItemReviewArguments.class.getClassLoader()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CreateMarketItemReviewArguments[] newArray(int i) {
            return new CreateMarketItemReviewArguments[i];
        }
    }

    public CreateMarketItemReviewArguments(long j, UserId userId, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.b = j;
        this.c = userId;
        this.d = f;
        this.e = num;
        this.f = num2;
        this.g = num3;
        this.h = num4;
        this.i = num5;
    }

    public final Integer d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateMarketItemReviewArguments)) {
            return false;
        }
        CreateMarketItemReviewArguments createMarketItemReviewArguments = (CreateMarketItemReviewArguments) obj;
        return this.b == createMarketItemReviewArguments.b && epx.f(this.c, createMarketItemReviewArguments.c) && epx.f(this.d, createMarketItemReviewArguments.d) && epx.f(this.e, createMarketItemReviewArguments.e) && epx.f(this.f, createMarketItemReviewArguments.f) && epx.f(this.g, createMarketItemReviewArguments.g) && epx.f(this.h, createMarketItemReviewArguments.h) && epx.f(this.i, createMarketItemReviewArguments.i);
    }

    public final int hashCode() {
        int a2 = bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b);
        Float f = this.d;
        int hashCode = (a2 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.i;
        return hashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateMarketItemReviewArguments(productId=");
        sb.append(this.b);
        sb.append(", communityId=");
        sb.append(this.c);
        sb.append(", rating=");
        sb.append(this.d);
        sb.append(", sourcePopupId=");
        sb.append(this.e);
        sb.append(", orderId=");
        sb.append(this.f);
        sb.append(", itemsInPopup=");
        sb.append(this.g);
        sb.append(", itemNumberInPopup=");
        sb.append(this.h);
        sb.append(", reviewId=");
        return uqi.b(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, i);
        Float f = this.d;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.g;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.h;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.i;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
    }

    public /* synthetic */ CreateMarketItemReviewArguments(long j, UserId userId, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, zcl zclVar) {
        this(j, userId, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : num5);
    }
}
