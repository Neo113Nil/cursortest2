package com.vk.im.ui.fragments;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.iq;
import xsna.nr;
import xsna.shy;

/* compiled from: SnackbarParams.kt */
/* loaded from: classes2.dex */
public final class SnackbarParams implements Parcelable {
    public static final Parcelable.Creator<SnackbarParams> CREATOR = new a();
    public final Integer b;
    public final Integer c;
    public final int d;
    public final Long e;

    /* compiled from: SnackbarParams.kt */
    public static final class a implements Parcelable.Creator<SnackbarParams> {
        @Override // android.os.Parcelable.Creator
        public final SnackbarParams createFromParcel(Parcel parcel) {
            return new SnackbarParams(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SnackbarParams[] newArray(int i) {
            return new SnackbarParams[i];
        }
    }

    public SnackbarParams(Integer num, Integer num2, int i, Long l) {
        this.b = num;
        this.c = num2;
        this.d = i;
        this.e = l;
    }

    public final Long d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnackbarParams)) {
            return false;
        }
        SnackbarParams snackbarParams = (SnackbarParams) obj;
        return epx.f(this.b, snackbarParams.b) && epx.f(this.c, snackbarParams.c) && this.d == snackbarParams.d && epx.f(this.e, snackbarParams.e);
    }

    public final Integer f() {
        return this.c;
    }

    public final int g() {
        return this.d;
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.c;
        int a2 = shy.a(this.d, (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        Long l = this.e;
        return a2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnackbarParams(icon=");
        sb.append(this.b);
        sb.append(", iconTint=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", duration=");
        return iq.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeInt(this.d);
        Long l = this.e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l);
        }
    }
}
