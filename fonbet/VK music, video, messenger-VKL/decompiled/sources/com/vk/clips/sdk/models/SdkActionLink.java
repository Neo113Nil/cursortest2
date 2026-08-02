package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;

/* compiled from: SdkActionLink.kt */
/* loaded from: classes17.dex */
public final class SdkActionLink implements Parcelable {
    public static final Parcelable.Creator<SdkActionLink> CREATOR = new a();
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final ActionLinkSnippet g;
    public final String h;
    public final String i;
    public final Integer j;

    /* compiled from: SdkActionLink.kt */
    public static final class a implements Parcelable.Creator<SdkActionLink> {
        @Override // android.os.Parcelable.Creator
        public final SdkActionLink createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ActionLinkSnippet createFromParcel = parcel.readInt() == 0 ? null : ActionLinkSnippet.CREATOR.createFromParcel(parcel);
            String readString5 = parcel.readString();
            Integer num = null;
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new SdkActionLink(readString, readInt, readString2, readString3, readString4, createFromParcel, readString5, readString6, num);
        }

        @Override // android.os.Parcelable.Creator
        public final SdkActionLink[] newArray(int i) {
            return new SdkActionLink[i];
        }
    }

    public SdkActionLink(String str, int i, String str2, String str3, String str4, ActionLinkSnippet actionLinkSnippet, String str5, String str6, Integer num) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = actionLinkSnippet;
        this.h = str5;
        this.i = str6;
        this.j = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkActionLink)) {
            return false;
        }
        SdkActionLink sdkActionLink = (SdkActionLink) obj;
        return epx.f(this.b, sdkActionLink.b) && this.c == sdkActionLink.c && epx.f(this.d, sdkActionLink.d) && epx.f(this.e, sdkActionLink.e) && epx.f(this.f, sdkActionLink.f) && epx.f(this.g, sdkActionLink.g) && epx.f(this.h, sdkActionLink.h) && epx.f(this.i, sdkActionLink.i) && epx.f(this.j, sdkActionLink.j);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e), 31, this.f);
        ActionLinkSnippet actionLinkSnippet = this.g;
        int hashCode = (a2 + (actionLinkSnippet == null ? 0 : actionLinkSnippet.hashCode())) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.j;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkActionLink(id=");
        sb.append(this.b);
        sb.append(", linkId=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", url=");
        sb.append(this.f);
        sb.append(", snippet=");
        sb.append(this.g);
        sb.append(", deeplink=");
        sb.append(this.h);
        sb.append(", appPackage=");
        sb.append(this.i);
        sb.append(", urlTarget=");
        return uqi.b(sb, this.j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        ActionLinkSnippet actionLinkSnippet = this.g;
        if (actionLinkSnippet == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionLinkSnippet.writeToParcel(parcel, i);
        }
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        Integer num = this.j;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }
}
