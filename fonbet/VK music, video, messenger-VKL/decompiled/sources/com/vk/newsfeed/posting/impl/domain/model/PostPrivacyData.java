package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;

/* compiled from: PostPrivacyData.kt */
/* loaded from: classes4.dex */
public final class PostPrivacyData implements Parcelable {
    public static final Parcelable.Creator<PostPrivacyData> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final PrivacyPostType d;
    public final List<PrivacyPostType> e;
    public final List<DonutLevel> f;
    public final Date g;
    public final String h;
    public final boolean i;

    /* compiled from: PostPrivacyData.kt */
    public static final class a implements Parcelable.Creator<PostPrivacyData> {
        @Override // android.os.Parcelable.Creator
        public final PostPrivacyData createFromParcel(Parcel parcel) {
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            PrivacyPostType privacyPostType = (PrivacyPostType) parcel.readParcelable(PostPrivacyData.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(PostPrivacyData.class, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(DonutLevel.CREATOR, parcel, arrayList2, i2, 1);
            }
            return new PostPrivacyData(z, z2, privacyPostType, arrayList, arrayList2, (Date) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PostPrivacyData[] newArray(int i) {
            return new PostPrivacyData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostPrivacyData(boolean z, boolean z2, PrivacyPostType privacyPostType, List<? extends PrivacyPostType> list, List<DonutLevel> list2, Date date, String str, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = privacyPostType;
        this.e = list;
        this.f = list2;
        this.g = date;
        this.h = str;
        this.i = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PostPrivacyData a(PostPrivacyData postPrivacyData, PrivacyPostType privacyPostType, ArrayList arrayList, Date date, String str, boolean z, int i) {
        boolean z2 = postPrivacyData.b;
        boolean z3 = postPrivacyData.c;
        if ((i & 4) != 0) {
            privacyPostType = postPrivacyData.d;
        }
        PrivacyPostType privacyPostType2 = privacyPostType;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = postPrivacyData.e;
        }
        List list2 = list;
        List<DonutLevel> list3 = postPrivacyData.f;
        if ((i & 32) != 0) {
            date = postPrivacyData.g;
        }
        Date date2 = date;
        if ((i & 64) != 0) {
            str = postPrivacyData.h;
        }
        String str2 = str;
        if ((i & 128) != 0) {
            z = postPrivacyData.i;
        }
        postPrivacyData.getClass();
        return new PostPrivacyData(z2, z3, privacyPostType2, list2, list3, date2, str2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostPrivacyData)) {
            return false;
        }
        PostPrivacyData postPrivacyData = (PostPrivacyData) obj;
        return this.b == postPrivacyData.b && this.c == postPrivacyData.c && epx.f(this.d, postPrivacyData.d) && epx.f(this.e, postPrivacyData.e) && epx.f(this.f, postPrivacyData.f) && epx.f(this.g, postPrivacyData.g) && epx.f(this.h, postPrivacyData.h) && this.i == postPrivacyData.i;
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a((this.d.hashCode() + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f);
        Date date = this.g;
        int hashCode = (a2 + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.h;
        return Boolean.hashCode(this.i) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostPrivacyData(isCommunity=");
        sb.append(this.b);
        sb.append(", canAllDons=");
        sb.append(this.c);
        sb.append(", selectedType=");
        sb.append(this.d);
        sb.append(", availableTypes=");
        sb.append(this.e);
        sb.append(", availableDonutLevels=");
        sb.append(this.f);
        sb.append(", openForAllDate=");
        sb.append(this.g);
        sb.append(", donutTeaserText=");
        sb.append(this.h);
        sb.append(", showDonutTeaserHint=");
        return q0.a(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeParcelable(this.d, i);
        Iterator a2 = ao.a(parcel, this.e);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.f);
        while (a3.hasNext()) {
            ((DonutLevel) a3.next()).writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
