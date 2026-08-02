package com.vk.music.bottomsheets.domain.model.mixsettings;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.urd0;

/* compiled from: MixOption.kt */
/* loaded from: classes3.dex */
public final class MixOption implements Parcelable {
    public static final Parcelable.Creator<MixOption> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public boolean f;

    /* compiled from: MixOption.kt */
    public static final class a implements Parcelable.Creator<MixOption> {
        @Override // android.os.Parcelable.Creator
        public final MixOption createFromParcel(Parcel parcel) {
            return new MixOption(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MixOption[] newArray(int i) {
            return new MixOption[i];
        }
    }

    public MixOption(String str, String str2, String str3, String str4, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public static MixOption a(MixOption mixOption, int i) {
        String str = mixOption.b;
        String str2 = mixOption.c;
        String str3 = mixOption.d;
        String str4 = mixOption.e;
        boolean z = (i & 16) != 0 ? mixOption.f : false;
        mixOption.getClass();
        return new MixOption(str, str2, str3, str4, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixOption)) {
            return false;
        }
        MixOption mixOption = (MixOption) obj;
        return epx.f(this.b, mixOption.b) && epx.f(this.c, mixOption.c) && epx.f(this.d, mixOption.d) && epx.f(this.e, mixOption.e) && this.f == mixOption.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixOption(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", badgeIconUrl=");
        sb.append(this.e);
        sb.append(", isSelected=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
