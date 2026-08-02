package com.vk.ecomm.reviews.impl.marketitem.createreview.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.pm0;

/* compiled from: CreateMarketItemReviewRequest.kt */
/* loaded from: classes18.dex */
public final class CreateMarketItemReviewRequest implements Parcelable {
    public static final Parcelable.Creator<CreateMarketItemReviewRequest> CREATOR = new a();
    public final UserId b;
    public final long c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final List<Integer> h;

    /* compiled from: CreateMarketItemReviewRequest.kt */
    public static final class a implements Parcelable.Creator<CreateMarketItemReviewRequest> {
        @Override // android.os.Parcelable.Creator
        public final CreateMarketItemReviewRequest createFromParcel(Parcel parcel) {
            UserId userId = (UserId) parcel.readParcelable(CreateMarketItemReviewRequest.class.getClassLoader());
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new CreateMarketItemReviewRequest(userId, readLong, readInt, readString, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CreateMarketItemReviewRequest[] newArray(int i) {
            return new CreateMarketItemReviewRequest[i];
        }
    }

    public CreateMarketItemReviewRequest(UserId userId, long j, int i, String str, String str2, String str3, List<Integer> list) {
        this.b = userId;
        this.c = j;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        Iterator a2 = ao.a(parcel, this.h);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
    }
}
