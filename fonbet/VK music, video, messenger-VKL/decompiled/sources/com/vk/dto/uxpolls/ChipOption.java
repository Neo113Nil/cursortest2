package com.vk.dto.uxpolls;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.urd0;

/* compiled from: ChipOption.kt */
/* loaded from: classes18.dex */
public final class ChipOption implements Parcelable {
    public static final Parcelable.Creator<ChipOption> CREATOR = new a();
    public final int b;
    public final String c;
    public final boolean d;

    /* compiled from: ChipOption.kt */
    public static final class a implements Parcelable.Creator<ChipOption> {
        @Override // android.os.Parcelable.Creator
        public final ChipOption createFromParcel(Parcel parcel) {
            return new ChipOption(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ChipOption[] newArray(int i) {
            return new ChipOption[i];
        }
    }

    public ChipOption(int i, String str, boolean z) {
        this.b = i;
        this.c = str;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipOption)) {
            return false;
        }
        ChipOption chipOption = (ChipOption) obj;
        return this.b == chipOption.b && epx.f(this.c, chipOption.c) && this.d == chipOption.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChipOption(index=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", isOpen=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
