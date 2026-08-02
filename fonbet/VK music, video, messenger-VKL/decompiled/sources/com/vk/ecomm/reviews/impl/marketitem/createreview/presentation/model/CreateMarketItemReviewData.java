package com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.ecomm.reviews.api.model.communityreviews.ReviewSavedData;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CreateMarketItemReviewData.kt */
/* loaded from: classes18.dex */
public final class CreateMarketItemReviewData implements ReviewSavedData {
    public static final Parcelable.Creator<CreateMarketItemReviewData> CREATOR = new a();
    public final Float b;
    public final String c;
    public final String d;
    public final String e;
    public final List<UploadImageModel> f;
    public final Integer g;

    /* compiled from: CreateMarketItemReviewData.kt */
    public static final class a implements Parcelable.Creator<CreateMarketItemReviewData> {
        @Override // android.os.Parcelable.Creator
        public final CreateMarketItemReviewData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(CreateMarketItemReviewData.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new CreateMarketItemReviewData(valueOf, readString, readString2, readString3, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CreateMarketItemReviewData[] newArray(int i) {
            return new CreateMarketItemReviewData[i];
        }
    }

    public CreateMarketItemReviewData() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateMarketItemReviewData)) {
            return false;
        }
        CreateMarketItemReviewData createMarketItemReviewData = (CreateMarketItemReviewData) obj;
        return epx.f(this.b, createMarketItemReviewData.b) && epx.f(this.c, createMarketItemReviewData.c) && epx.f(this.d, createMarketItemReviewData.d) && epx.f(this.e, createMarketItemReviewData.e) && epx.f(this.f, createMarketItemReviewData.f) && epx.f(this.g, createMarketItemReviewData.g);
    }

    public final int hashCode() {
        Float f = this.b;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<UploadImageModel> list = this.f;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.g;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateMarketItemReviewData(mark=");
        sb.append(this.b);
        sb.append(", comment=");
        sb.append(this.c);
        sb.append(", pros=");
        sb.append(this.d);
        sb.append(", cons=");
        sb.append(this.e);
        sb.append(", reviewImages=");
        sb.append(this.f);
        sb.append(", id=");
        return uqi.b(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.b;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        List<UploadImageModel> list = this.f;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        Integer num = this.g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public CreateMarketItemReviewData(Float f, String str, String str2, String str3, List<UploadImageModel> list, Integer num) {
        this.b = f;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = list;
        this.g = num;
    }

    public /* synthetic */ CreateMarketItemReviewData(Float f, String str, String str2, String str3, List list, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : num);
    }
}
