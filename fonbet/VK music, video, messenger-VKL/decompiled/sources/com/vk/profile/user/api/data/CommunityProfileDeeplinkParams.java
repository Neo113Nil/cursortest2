package com.vk.profile.user.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.nr;
import xsna.zcl;

/* compiled from: CommunityProfileDeeplinkParams.kt */
/* loaded from: classes5.dex */
public final class CommunityProfileDeeplinkParams implements Parcelable {
    public static final Parcelable.Creator<CommunityProfileDeeplinkParams> CREATOR = new a();
    public final boolean b;
    public final String c;
    public final Integer d;
    public final boolean e;

    /* compiled from: CommunityProfileDeeplinkParams.kt */
    public static final class a implements Parcelable.Creator<CommunityProfileDeeplinkParams> {
        @Override // android.os.Parcelable.Creator
        public final CommunityProfileDeeplinkParams createFromParcel(Parcel parcel) {
            return new CommunityProfileDeeplinkParams(parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityProfileDeeplinkParams[] newArray(int i) {
            return new CommunityProfileDeeplinkParams[i];
        }
    }

    public CommunityProfileDeeplinkParams(boolean z, String str, Integer num, boolean z2) {
        this.b = z;
        this.c = str;
        this.d = num;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityProfileDeeplinkParams)) {
            return false;
        }
        CommunityProfileDeeplinkParams communityProfileDeeplinkParams = (CommunityProfileDeeplinkParams) obj;
        return this.b == communityProfileDeeplinkParams.b && epx.f(this.c, communityProfileDeeplinkParams.c) && epx.f(this.d, communityProfileDeeplinkParams.d) && this.e == communityProfileDeeplinkParams.e;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityProfileDeeplinkParams(showCreateReviewBottomSheet=");
        sb.append(this.b);
        sb.append(", utm=");
        sb.append(this.c);
        sb.append(", editReviewId=");
        sb.append(this.d);
        sb.append(", showNotifySettings=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ CommunityProfileDeeplinkParams(boolean z, String str, Integer num, boolean z2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z2);
    }
}
