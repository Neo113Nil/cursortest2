package com.vk.ecomm.reviews.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.nr;
import xsna.zcl;

/* compiled from: ReviewsModalBottomSheetArguments.kt */
/* loaded from: classes18.dex */
public final class ReviewsModalBottomSheetArguments implements Parcelable {
    public static final Parcelable.Creator<ReviewsModalBottomSheetArguments> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final boolean h;

    /* compiled from: ReviewsModalBottomSheetArguments.kt */
    public static final class a implements Parcelable.Creator<ReviewsModalBottomSheetArguments> {
        @Override // android.os.Parcelable.Creator
        public final ReviewsModalBottomSheetArguments createFromParcel(Parcel parcel) {
            return new ReviewsModalBottomSheetArguments(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewsModalBottomSheetArguments[] newArray(int i) {
            return new ReviewsModalBottomSheetArguments[i];
        }
    }

    public ReviewsModalBottomSheetArguments(int i, String str, String str2, String str3, Integer num, Integer num2, boolean z) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = num;
        this.g = num2;
        this.h = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeInt(this.h ? 1 : 0);
    }

    public /* synthetic */ ReviewsModalBottomSheetArguments(int i, String str, String str2, String str3, Integer num, Integer num2, boolean z, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? false : z);
    }
}
