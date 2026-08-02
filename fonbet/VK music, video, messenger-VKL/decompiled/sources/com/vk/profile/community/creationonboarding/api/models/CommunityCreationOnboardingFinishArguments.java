package com.vk.profile.community.creationonboarding.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.urd0;

/* compiled from: CommunityCreationOnboardingFinishArguments.kt */
/* loaded from: classes5.dex */
public final class CommunityCreationOnboardingFinishArguments implements Parcelable {
    public static final Parcelable.Creator<CommunityCreationOnboardingFinishArguments> CREATOR = new a();
    public static final CommunityCreationOnboardingFinishArguments g = new CommunityCreationOnboardingFinishArguments("", "", "", EmptyList.b, "");
    public final String b;
    public final String c;
    public final String d;
    public final List<CommunityData> e;
    public final String f;

    /* compiled from: CommunityCreationOnboardingFinishArguments.kt */
    public static final class a implements Parcelable.Creator<CommunityCreationOnboardingFinishArguments> {
        @Override // android.os.Parcelable.Creator
        public final CommunityCreationOnboardingFinishArguments createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(CommunityData.CREATOR, parcel, arrayList, i, 1);
            }
            return new CommunityCreationOnboardingFinishArguments(readString, readString2, readString3, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityCreationOnboardingFinishArguments[] newArray(int i) {
            return new CommunityCreationOnboardingFinishArguments[i];
        }
    }

    public CommunityCreationOnboardingFinishArguments(String str, String str2, String str3, List<CommunityData> list, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityCreationOnboardingFinishArguments)) {
            return false;
        }
        CommunityCreationOnboardingFinishArguments communityCreationOnboardingFinishArguments = (CommunityCreationOnboardingFinishArguments) obj;
        return epx.f(this.b, communityCreationOnboardingFinishArguments.b) && epx.f(this.c, communityCreationOnboardingFinishArguments.c) && epx.f(this.d, communityCreationOnboardingFinishArguments.d) && epx.f(this.e, communityCreationOnboardingFinishArguments.e) && epx.f(this.f, communityCreationOnboardingFinishArguments.f);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityCreationOnboardingFinishArguments(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", imageUrl=");
        sb.append(this.d);
        sb.append(", communities=");
        sb.append(this.e);
        sb.append(", buttonText=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Iterator a2 = ao.a(parcel, this.e);
        while (a2.hasNext()) {
            ((CommunityData) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f);
    }
}
