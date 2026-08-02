package com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.nr;

/* compiled from: CreateMarketItemReviewResult.kt */
/* loaded from: classes18.dex */
public final class CreateMarketItemReviewResult implements Parcelable {
    public static final Parcelable.Creator<CreateMarketItemReviewResult> CREATOR = new a();
    public final Long b;
    public final Float c;
    public final boolean d;
    public final Integer e;

    /* compiled from: CreateMarketItemReviewResult.kt */
    public static final class a implements Parcelable.Creator<CreateMarketItemReviewResult> {
        @Override // android.os.Parcelable.Creator
        public final CreateMarketItemReviewResult createFromParcel(Parcel parcel) {
            return new CreateMarketItemReviewResult(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CreateMarketItemReviewResult[] newArray(int i) {
            return new CreateMarketItemReviewResult[i];
        }
    }

    public CreateMarketItemReviewResult(Long l, Float f, boolean z, Integer num) {
        this.b = l;
        this.c = f;
        this.d = z;
        this.e = num;
    }

    public final Long d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Float e() {
        return this.c;
    }

    public final Integer f() {
        return this.e;
    }

    public final boolean g() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Float f = this.c;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeInt(this.d ? 1 : 0);
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }
}
