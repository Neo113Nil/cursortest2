package com.vk.ecomm.reviews.impl.communities.reviews.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CommunityReviewsArgs.kt */
/* loaded from: classes18.dex */
public final class CommunityReviewsArgs implements Parcelable {
    public static final Parcelable.Creator<CommunityReviewsArgs> CREATOR = new a();
    public final UserId b;
    public final Float c;
    public final Integer d;

    /* compiled from: CommunityReviewsArgs.kt */
    public static final class a implements Parcelable.Creator<CommunityReviewsArgs> {
        @Override // android.os.Parcelable.Creator
        public final CommunityReviewsArgs createFromParcel(Parcel parcel) {
            return new CommunityReviewsArgs((UserId) parcel.readParcelable(CommunityReviewsArgs.class.getClassLoader()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityReviewsArgs[] newArray(int i) {
            return new CommunityReviewsArgs[i];
        }
    }

    public CommunityReviewsArgs() {
        this(null, null, null, 7, null);
    }

    public final UserId d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityReviewsArgs)) {
            return false;
        }
        CommunityReviewsArgs communityReviewsArgs = (CommunityReviewsArgs) obj;
        return epx.f(this.b, communityReviewsArgs.b) && epx.f(this.c, communityReviewsArgs.c) && epx.f(this.d, communityReviewsArgs.d);
    }

    public final Float f() {
        return this.c;
    }

    public final int hashCode() {
        UserId userId = this.b;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Float f = this.c;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.d;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityReviewsArgs(communityId=");
        sb.append(this.b);
        sb.append(", rateValue=");
        sb.append(this.c);
        sb.append(", rateCount=");
        return uqi.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        Float f = this.c;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public CommunityReviewsArgs(UserId userId, Float f, Integer num) {
        this.b = userId;
        this.c = f;
        this.d = num;
    }

    public /* synthetic */ CommunityReviewsArgs(UserId userId, Float f, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : num);
    }
}
