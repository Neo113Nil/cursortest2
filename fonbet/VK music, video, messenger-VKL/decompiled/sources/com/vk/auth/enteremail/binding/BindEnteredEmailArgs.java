package com.vk.auth.enteremail.binding;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.nr;

/* compiled from: BindEnteredEmailArgs.kt */
/* loaded from: classes15.dex */
public final class BindEnteredEmailArgs implements Parcelable {
    public static final Parcelable.Creator<BindEnteredEmailArgs> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;
    public final Integer e;
    public final Integer f;

    /* compiled from: BindEnteredEmailArgs.kt */
    public static final class a implements Parcelable.Creator<BindEnteredEmailArgs> {
        @Override // android.os.Parcelable.Creator
        public final BindEnteredEmailArgs createFromParcel(Parcel parcel) {
            return new BindEnteredEmailArgs(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BindEnteredEmailArgs[] newArray(int i) {
            return new BindEnteredEmailArgs[i];
        }
    }

    public BindEnteredEmailArgs(String str, String str2, boolean z, Integer num, Integer num2) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = num;
        this.f = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }
}
