package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final e f36401a;

    /* renamed from: b, reason: collision with root package name */
    public final e f36402b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36403c;

    /* renamed from: d, reason: collision with root package name */
    public int f36404d;

    /* renamed from: e, reason: collision with root package name */
    public int f36405e;

    /* renamed from: f, reason: collision with root package name */
    public int f36406f;

    /* renamed from: g, reason: collision with root package name */
    public int f36407g;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int g(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    public int c() {
        return this.f36403c == 1 ? ia.k.f48532j : ia.k.f48534l;
    }

    public int d() {
        if (this.f36403c == 1) {
            return this.f36404d % 24;
        }
        int i10 = this.f36404d;
        if (i10 % 12 == 0) {
            return 12;
        }
        return this.f36407g == 1 ? i10 - 12 : i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public e e() {
        return this.f36402b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f36404d == timeModel.f36404d && this.f36405e == timeModel.f36405e && this.f36403c == timeModel.f36403c && this.f36406f == timeModel.f36406f;
    }

    public e f() {
        return this.f36401a;
    }

    public void h(int i10) {
        if (this.f36403c == 1) {
            this.f36404d = i10;
        } else {
            this.f36404d = (i10 % 12) + (this.f36407g != 1 ? 0 : 12);
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36403c), Integer.valueOf(this.f36404d), Integer.valueOf(this.f36405e), Integer.valueOf(this.f36406f)});
    }

    public void i(int i10) {
        this.f36407g = g(i10);
        this.f36404d = i10;
    }

    public void j(int i10) {
        this.f36405e = i10 % 60;
    }

    public void k(int i10) {
        if (i10 != this.f36407g) {
            this.f36407g = i10;
            int i11 = this.f36404d;
            if (i11 < 12 && i10 == 1) {
                this.f36404d = i11 + 12;
            } else {
                if (i11 < 12 || i10 != 0) {
                    return;
                }
                this.f36404d = i11 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f36404d);
        parcel.writeInt(this.f36405e);
        parcel.writeInt(this.f36406f);
        parcel.writeInt(this.f36403c);
    }

    public TimeModel(int i10) {
        this(0, 0, 10, i10);
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f36404d = i10;
        this.f36405e = i11;
        this.f36406f = i12;
        this.f36403c = i13;
        this.f36407g = g(i10);
        this.f36401a = new e(59);
        this.f36402b = new e(i13 == 1 ? 23 : 12);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
