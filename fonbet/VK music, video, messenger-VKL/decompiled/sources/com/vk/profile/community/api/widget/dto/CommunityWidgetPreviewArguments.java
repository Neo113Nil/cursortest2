package com.vk.profile.community.api.widget.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: CommunityWidgetPreviewArguments.kt */
/* loaded from: classes5.dex */
public final class CommunityWidgetPreviewArguments implements Parcelable {
    public static final Parcelable.Creator<CommunityWidgetPreviewArguments> CREATOR = new a();
    public final String b;
    public final String c;
    public final UserId d;
    public final String e;
    public final String f;
    public final long g;
    public final String h;
    public final String i;

    /* compiled from: CommunityWidgetPreviewArguments.kt */
    public static final class a implements Parcelable.Creator<CommunityWidgetPreviewArguments> {
        @Override // android.os.Parcelable.Creator
        public final CommunityWidgetPreviewArguments createFromParcel(Parcel parcel) {
            return new CommunityWidgetPreviewArguments(parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(CommunityWidgetPreviewArguments.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityWidgetPreviewArguments[] newArray(int i) {
            return new CommunityWidgetPreviewArguments[i];
        }
    }

    public CommunityWidgetPreviewArguments(String str, String str2, UserId userId, String str3, String str4, long j, String str5, String str6) {
        this.b = str;
        this.c = str2;
        this.d = userId;
        this.e = str3;
        this.f = str4;
        this.g = j;
        this.h = str5;
        this.i = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityWidgetPreviewArguments)) {
            return false;
        }
        CommunityWidgetPreviewArguments communityWidgetPreviewArguments = (CommunityWidgetPreviewArguments) obj;
        return epx.f(this.b, communityWidgetPreviewArguments.b) && epx.f(this.c, communityWidgetPreviewArguments.c) && epx.f(this.d, communityWidgetPreviewArguments.d) && epx.f(this.e, communityWidgetPreviewArguments.e) && epx.f(this.f, communityWidgetPreviewArguments.f) && this.g == communityWidgetPreviewArguments.g && epx.f(this.h, communityWidgetPreviewArguments.h) && epx.f(this.i, communityWidgetPreviewArguments.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + urd0.a(bh10.a(urd0.a(urd0.a(bh10.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d.b), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityWidgetPreviewArguments(widgetDescription=");
        sb.append(this.b);
        sb.append(", groupName=");
        sb.append(this.c);
        sb.append(", groupId=");
        sb.append(this.d);
        sb.append(", appName=");
        sb.append(this.e);
        sb.append(", appIcon=");
        sb.append(this.f);
        sb.append(", appId=");
        sb.append(this.g);
        sb.append(", code=");
        sb.append(this.h);
        sb.append(", type=");
        return ho8.a(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeLong(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
