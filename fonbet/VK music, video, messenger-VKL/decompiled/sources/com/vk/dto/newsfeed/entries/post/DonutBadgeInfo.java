package com.vk.dto.newsfeed.entries.post;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: DonutBadgeInfo.kt */
/* loaded from: classes18.dex */
public final class DonutBadgeInfo implements Serializer.StreamParcelable {
    public static final Serializer.c<DonutBadgeInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DonutBadgeInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DonutBadgeInfo a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            if (H2 == null) {
                H2 = "";
            }
            String H3 = serializer.H();
            return new DonutBadgeInfo(H, H2, H3 != null ? H3 : "");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DonutBadgeInfo[i];
        }
    }

    public DonutBadgeInfo(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    public final String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutBadgeInfo)) {
            return false;
        }
        DonutBadgeInfo donutBadgeInfo = (DonutBadgeInfo) obj;
        return epx.f(this.b, donutBadgeInfo.b) && epx.f(this.c, donutBadgeInfo.c) && epx.f(this.d, donutBadgeInfo.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutBadgeInfo(amount=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", commentText=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
