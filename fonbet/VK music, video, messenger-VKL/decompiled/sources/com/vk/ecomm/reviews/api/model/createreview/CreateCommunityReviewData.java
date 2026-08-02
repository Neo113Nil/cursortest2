package com.vk.ecomm.reviews.api.model.createreview;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.ecomm.reviews.api.model.communityreviews.ReviewSavedData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CreateCommunityReviewData.kt */
/* loaded from: classes18.dex */
public final class CreateCommunityReviewData implements ReviewSavedData {
    public static final Parcelable.Creator<CreateCommunityReviewData> CREATOR = new a();
    public final Integer b;
    public final String c;
    public final List<UploadImageModel> d;
    public final Integer e;

    /* compiled from: CreateCommunityReviewData.kt */
    public static final class a implements Parcelable.Creator<CreateCommunityReviewData> {
        @Override // android.os.Parcelable.Creator
        public final CreateCommunityReviewData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(UploadImageModel.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new CreateCommunityReviewData(valueOf, readString, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CreateCommunityReviewData[] newArray(int i) {
            return new CreateCommunityReviewData[i];
        }
    }

    public CreateCommunityReviewData() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCommunityReviewData)) {
            return false;
        }
        CreateCommunityReviewData createCommunityReviewData = (CreateCommunityReviewData) obj;
        return epx.f(this.b, createCommunityReviewData.b) && epx.f(this.c, createCommunityReviewData.c) && epx.f(this.d, createCommunityReviewData.d) && epx.f(this.e, createCommunityReviewData.e);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UploadImageModel> list = this.d;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.e;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateCommunityReviewData(mark=");
        sb.append(this.b);
        sb.append(", comment=");
        sb.append(this.c);
        sb.append(", reviewImages=");
        sb.append(this.d);
        sb.append(", id=");
        return uqi.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.c);
        List<UploadImageModel> list = this.d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((UploadImageModel) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.e;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public CreateCommunityReviewData(Integer num, String str, List<UploadImageModel> list, Integer num2) {
        this.b = num;
        this.c = str;
        this.d = list;
        this.e = num2;
    }

    public /* synthetic */ CreateCommunityReviewData(Integer num, String str, List list, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num2);
    }
}
