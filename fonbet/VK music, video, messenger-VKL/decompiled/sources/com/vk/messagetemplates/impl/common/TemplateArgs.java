package com.vk.messagetemplates.impl.common;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;

/* compiled from: TemplateArgs.kt */
/* loaded from: classes3.dex */
public final class TemplateArgs implements Parcelable {
    public static final Parcelable.Creator<TemplateArgs> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: TemplateArgs.kt */
    public static final class a implements Parcelable.Creator<TemplateArgs> {
        @Override // android.os.Parcelable.Creator
        public final TemplateArgs createFromParcel(Parcel parcel) {
            return new TemplateArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateArgs[] newArray(int i) {
            return new TemplateArgs[i];
        }
    }

    public TemplateArgs() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateArgs)) {
            return false;
        }
        TemplateArgs templateArgs = (TemplateArgs) obj;
        return epx.f(this.b, templateArgs.b) && epx.f(this.c, templateArgs.c) && epx.f(this.d, templateArgs.d) && epx.f(this.e, templateArgs.e) && epx.f(this.f, templateArgs.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TemplateArgs(adminName=");
        sb.append(this.b);
        sb.append(", adminSurname=");
        sb.append(this.c);
        sb.append(", userName=");
        sb.append(this.d);
        sb.append(", userSurname=");
        sb.append(this.e);
        sb.append(", communityName=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public TemplateArgs(String str, String str2, String str3, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public /* synthetic */ TemplateArgs(String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
