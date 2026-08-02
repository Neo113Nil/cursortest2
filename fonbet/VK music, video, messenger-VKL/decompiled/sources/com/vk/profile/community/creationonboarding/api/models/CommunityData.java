package com.vk.profile.community.creationonboarding.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.urd0;

/* compiled from: CommunityCreationOnboardingFinishArguments.kt */
/* loaded from: classes5.dex */
public final class CommunityData implements Parcelable {
    public static final Parcelable.Creator<CommunityData> CREATOR = new a();
    public final String b;
    public final String c;
    public final UserId d;

    /* compiled from: CommunityCreationOnboardingFinishArguments.kt */
    public static final class a implements Parcelable.Creator<CommunityData> {
        @Override // android.os.Parcelable.Creator
        public final CommunityData createFromParcel(Parcel parcel) {
            return new CommunityData(parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(CommunityData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityData[] newArray(int i) {
            return new CommunityData[i];
        }
    }

    public CommunityData(String str, String str2, UserId userId) {
        this.b = str;
        this.c = str2;
        this.d = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityData)) {
            return false;
        }
        CommunityData communityData = (CommunityData) obj;
        return epx.f(this.b, communityData.b) && epx.f(this.c, communityData.c) && epx.f(this.d, communityData.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d.b) + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityData(title=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        sb.append(this.c);
        sb.append(", groupId=");
        return gp.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
