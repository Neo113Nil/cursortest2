package com.vk.coowners.presentation.util;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: PostInfoData.kt */
/* loaded from: classes17.dex */
public final class PostInfoData implements Parcelable {
    public static final Parcelable.Creator<PostInfoData> CREATOR = new a();
    public final Long b;
    public final Long c;
    public final String d;
    public final Long e;
    public final Long f;
    public final String g;

    /* compiled from: PostInfoData.kt */
    public static final class a implements Parcelable.Creator<PostInfoData> {
        @Override // android.os.Parcelable.Creator
        public final PostInfoData createFromParcel(Parcel parcel) {
            return new PostInfoData(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostInfoData[] newArray(int i) {
            return new PostInfoData[i];
        }
    }

    public PostInfoData(Long l, Long l2, String str, Long l3, Long l4, String str2) {
        this.b = l;
        this.c = l2;
        this.d = str;
        this.e = l3;
        this.f = l4;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostInfoData)) {
            return false;
        }
        PostInfoData postInfoData = (PostInfoData) obj;
        return epx.f(this.b, postInfoData.b) && epx.f(this.c, postInfoData.c) && epx.f(this.d, postInfoData.d) && epx.f(this.e, postInfoData.e) && epx.f(this.f, postInfoData.f) && epx.f(this.g, postInfoData.g);
    }

    public final int hashCode() {
        Long l = this.b;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.c;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.e;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.g;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostInfoData(postId=");
        sb.append(this.b);
        sb.append(", sourceId=");
        sb.append(this.c);
        sb.append(", trackCode=");
        sb.append(this.d);
        sb.append(", rootPostId=");
        sb.append(this.e);
        sb.append(", rootOwnerId=");
        sb.append(this.f);
        sb.append(", rootTrackCode=");
        return ho8.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Long l2 = this.c;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l2);
        }
        parcel.writeString(this.d);
        Long l3 = this.e;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l3);
        }
        Long l4 = this.f;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l4);
        }
        parcel.writeString(this.g);
    }

    public /* synthetic */ PostInfoData(Long l, Long l2, String str, Long l3, Long l4, String str2, int i, zcl zclVar) {
        this(l, l2, str, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : l4, (i & 32) != 0 ? null : str2);
    }
}
