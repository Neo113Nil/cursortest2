package com.vk.profile.community.creationonboarding.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bh10;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;

/* compiled from: CreationOnboardingArguments.kt */
/* loaded from: classes5.dex */
public final class CreationOnboardingArguments implements Parcelable {
    public static final Parcelable.Creator<CreationOnboardingArguments> CREATOR = new a();
    public static final CreationOnboardingArguments i = new CreationOnboardingArguments("", "", "", "", "", UserId.d, EmptyList.b);
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final UserId g;
    public final List<OnBoardingTask> h;

    /* compiled from: CreationOnboardingArguments.kt */
    public static final class a implements Parcelable.Creator<CreationOnboardingArguments> {
        @Override // android.os.Parcelable.Creator
        public final CreationOnboardingArguments createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(CreationOnboardingArguments.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(OnBoardingTask.CREATOR, parcel, arrayList, i, 1);
            }
            return new CreationOnboardingArguments(readString, readString2, readString3, readString4, readString5, userId, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CreationOnboardingArguments[] newArray(int i) {
            return new CreationOnboardingArguments[i];
        }
    }

    public CreationOnboardingArguments(String str, String str2, String str3, String str4, String str5, UserId userId, List<OnBoardingTask> list) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = userId;
        this.h = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationOnboardingArguments)) {
            return false;
        }
        CreationOnboardingArguments creationOnboardingArguments = (CreationOnboardingArguments) obj;
        return epx.f(this.b, creationOnboardingArguments.b) && epx.f(this.c, creationOnboardingArguments.c) && epx.f(this.d, creationOnboardingArguments.d) && epx.f(this.e, creationOnboardingArguments.e) && epx.f(this.f, creationOnboardingArguments.f) && epx.f(this.g, creationOnboardingArguments.g) && epx.f(this.h, creationOnboardingArguments.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + bh10.a(urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationOnboardingArguments(imageUrl=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", communityUrl=");
        sb.append(this.e);
        sb.append(", communityName=");
        sb.append(this.f);
        sb.append(", communityId=");
        sb.append(this.g);
        sb.append(", tasks=");
        return ms9.a(')', sb, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i2);
        Iterator a2 = ao.a(parcel, this.h);
        while (a2.hasNext()) {
            ((OnBoardingTask) a2.next()).writeToParcel(parcel, i2);
        }
    }
}
