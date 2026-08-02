package com.vk.channelrestrictions;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.q0;
import xsna.epx;
import xsna.u11;
import xsna.urd0;

/* compiled from: WarningNotification.kt */
/* loaded from: classes16.dex */
public final class WarningNotification implements Parcelable {
    public static final Parcelable.Creator<WarningNotification> CREATOR = new a();
    public final int b;
    public final String c;
    public final CharSequence d;
    public final String e;
    public final String f;
    public final boolean g;

    /* compiled from: WarningNotification.kt */
    public static final class a implements Parcelable.Creator<WarningNotification> {
        @Override // android.os.Parcelable.Creator
        public final WarningNotification createFromParcel(Parcel parcel) {
            return new WarningNotification(parcel.readInt(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final WarningNotification[] newArray(int i) {
            return new WarningNotification[i];
        }
    }

    public WarningNotification(int i, String str, CharSequence charSequence, String str2, String str3, boolean z) {
        this.b = i;
        this.c = str;
        this.d = charSequence;
        this.e = str2;
        this.f = str3;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarningNotification)) {
            return false;
        }
        WarningNotification warningNotification = (WarningNotification) obj;
        return this.b == warningNotification.b && epx.f(this.c, warningNotification.c) && epx.f(this.d, warningNotification.d) && epx.f(this.e, warningNotification.e) && epx.f(this.f, warningNotification.f) && this.g == warningNotification.g;
    }

    public final int hashCode() {
        int a2 = urd0.a(u11.c(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.g) + ((a2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WarningNotification(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append((Object) this.d);
        sb.append(", backButton=");
        sb.append(this.e);
        sb.append(", okButton=");
        sb.append(this.f);
        sb.append(", canClose=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        TextUtils.writeToParcel(this.d, parcel, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
