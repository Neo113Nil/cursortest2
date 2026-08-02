package com.vk.video.growth.impl.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.lm50;
import xsna.nr;
import xsna.uqi;
import xsna.urd0;

/* compiled from: TrapViewState.kt */
/* loaded from: classes6.dex */
public final class TrapViewState implements lm50, Parcelable {
    public static final Parcelable.Creator<TrapViewState> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;

    /* compiled from: TrapViewState.kt */
    public static final class a implements Parcelable.Creator<TrapViewState> {
        @Override // android.os.Parcelable.Creator
        public final TrapViewState createFromParcel(Parcel parcel) {
            return new TrapViewState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final TrapViewState[] newArray(int i) {
            return new TrapViewState[i];
        }
    }

    public TrapViewState(String str, String str2, String str3, String str4, Integer num) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrapViewState)) {
            return false;
        }
        TrapViewState trapViewState = (TrapViewState) obj;
        return epx.f(this.b, trapViewState.b) && epx.f(this.c, trapViewState.c) && epx.f(this.d, trapViewState.d) && epx.f(this.e, trapViewState.e) && epx.f(this.f, trapViewState.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrapViewState(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", imageUrl=");
        sb.append(this.d);
        sb.append(", buttonTitle=");
        sb.append(this.e);
        sb.append(", buttonIconRes=");
        return uqi.b(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }
}
