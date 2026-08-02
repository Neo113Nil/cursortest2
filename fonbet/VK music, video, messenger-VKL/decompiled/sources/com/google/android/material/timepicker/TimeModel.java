package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import xsna.do10;

/* loaded from: classes13.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();
    public final do10 b;
    public final do10 c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public class a implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        public final TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0);
    }

    @Nullable
    public static String a(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final int d() {
        if (this.d == 1) {
            return this.e % 24;
        }
        int i = this.e;
        if (i % 12 == 0) {
            return 12;
        }
        return this.h == 1 ? i - 12 : i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i) {
        if (this.d == 1) {
            this.e = i;
        } else {
            this.e = (i % 12) + (this.h != 1 ? 0 : 12);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.e == timeModel.e && this.f == timeModel.f && this.d == timeModel.d && this.g == timeModel.g;
    }

    public final void f(int i) {
        this.f = i % 60;
    }

    public final void g(int i) {
        if (i != this.h) {
            this.h = i;
            int i2 = this.e;
            if (i2 < 12 && i == 1) {
                this.e = i2 + 12;
            } else {
                if (i2 < 12 || i != 0) {
                    return;
                }
                this.e = i2 - 12;
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.d);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.d = i4;
        this.h = i >= 12 ? 1 : 0;
        this.b = new do10(59);
        this.c = new do10(i4 == 1 ? 23 : 12);
    }
}
