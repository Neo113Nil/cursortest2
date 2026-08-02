package com.vk.ecomm.market.api.marketlinkedcontent.router;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;

/* compiled from: LinkedContentAnalyticsParams.kt */
/* loaded from: classes18.dex */
public final class LinkedContentAnalyticsParams implements Parcelable {
    public static final Parcelable.Creator<LinkedContentAnalyticsParams> CREATOR = new a();
    public final long b;
    public final long c;
    public final CommonMarketStat$TypeRefSource d;
    public final String e;
    public final String f;

    /* compiled from: LinkedContentAnalyticsParams.kt */
    public static final class a implements Parcelable.Creator<LinkedContentAnalyticsParams> {
        @Override // android.os.Parcelable.Creator
        public final LinkedContentAnalyticsParams createFromParcel(Parcel parcel) {
            return new LinkedContentAnalyticsParams(parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : CommonMarketStat$TypeRefSource.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LinkedContentAnalyticsParams[] newArray(int i) {
            return new LinkedContentAnalyticsParams[i];
        }
    }

    public LinkedContentAnalyticsParams(long j, long j2, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str, String str2) {
        this.b = j;
        this.c = j2;
        this.d = commonMarketStat$TypeRefSource;
        this.e = str;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkedContentAnalyticsParams)) {
            return false;
        }
        LinkedContentAnalyticsParams linkedContentAnalyticsParams = (LinkedContentAnalyticsParams) obj;
        return this.b == linkedContentAnalyticsParams.b && this.c == linkedContentAnalyticsParams.c && this.d == linkedContentAnalyticsParams.d && epx.f(this.e, linkedContentAnalyticsParams.e) && epx.f(this.f, linkedContentAnalyticsParams.f);
    }

    public final int hashCode() {
        int a2 = bh10.a(Long.hashCode(this.b) * 31, 31, this.c);
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.d;
        int hashCode = (a2 + (commonMarketStat$TypeRefSource == null ? 0 : commonMarketStat$TypeRefSource.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkedContentAnalyticsParams(goodId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", refSource=");
        sb.append(this.d);
        sb.append(", trackCode=");
        sb.append(this.e);
        sb.append(", sourceUrl=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.d;
        if (commonMarketStat$TypeRefSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(commonMarketStat$TypeRefSource.name());
        }
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
