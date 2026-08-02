package com.vk.ecomm.reviews.api.model.communityreviews;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.uqi;

/* compiled from: CreateCommunityReviewArgs.kt */
/* loaded from: classes18.dex */
public final class CreateCommunityReviewArgs implements Parcelable {
    public static final Parcelable.Creator<CreateCommunityReviewArgs> CREATOR = new a();
    public final UserId b;
    public final ReviewSavedData c;
    public final String d;
    public final Float e;
    public final Integer f;

    /* compiled from: CreateCommunityReviewArgs.kt */
    public static final class a implements Parcelable.Creator<CreateCommunityReviewArgs> {
        @Override // android.os.Parcelable.Creator
        public final CreateCommunityReviewArgs createFromParcel(Parcel parcel) {
            return new CreateCommunityReviewArgs((UserId) parcel.readParcelable(CreateCommunityReviewArgs.class.getClassLoader()), (ReviewSavedData) parcel.readParcelable(CreateCommunityReviewArgs.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CreateCommunityReviewArgs[] newArray(int i) {
            return new CreateCommunityReviewArgs[i];
        }
    }

    public CreateCommunityReviewArgs() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCommunityReviewArgs)) {
            return false;
        }
        CreateCommunityReviewArgs createCommunityReviewArgs = (CreateCommunityReviewArgs) obj;
        return epx.f(this.b, createCommunityReviewArgs.b) && epx.f(this.c, createCommunityReviewArgs.c) && epx.f(this.d, createCommunityReviewArgs.d) && epx.f(this.e, createCommunityReviewArgs.e) && epx.f(this.f, createCommunityReviewArgs.f);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        ReviewSavedData reviewSavedData = this.c;
        int hashCode2 = (hashCode + (reviewSavedData == null ? 0 : reviewSavedData.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.e;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.f;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateCommunityReviewArgs(communityId=");
        sb.append(this.b);
        sb.append(", presetData=");
        sb.append(this.c);
        sb.append(", utm=");
        sb.append(this.d);
        sb.append(", communityRating=");
        sb.append(this.e);
        sb.append(", reviewsCount=");
        return uqi.b(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        Float f = this.e;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public CreateCommunityReviewArgs(UserId userId, ReviewSavedData reviewSavedData, String str, Float f, Integer num) {
        this.b = userId;
        this.c = reviewSavedData;
        this.d = str;
        this.e = f;
        this.f = num;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CreateCommunityReviewArgs(com.vk.dto.common.id.UserId r2, com.vk.ecomm.reviews.api.model.communityreviews.ReviewSavedData r3, java.lang.String r4, java.lang.Float r5, java.lang.Integer r6, int r7, xsna.zcl r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            com.vk.dto.common.id.UserId r2 = com.vk.dto.common.id.UserId.d
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewArgs.<init>(com.vk.dto.common.id.UserId, com.vk.ecomm.reviews.api.model.communityreviews.ReviewSavedData, java.lang.String, java.lang.Float, java.lang.Integer, int, xsna.zcl):void");
    }
}
