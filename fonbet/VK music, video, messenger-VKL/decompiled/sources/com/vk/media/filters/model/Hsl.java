package com.vk.media.filters.model;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.xq;
import xsna.zcl;

/* compiled from: Hsl.kt */
/* loaded from: classes3.dex */
public final class Hsl implements Parcelable {
    public static final Parcelable.Creator<Hsl> CREATOR = new a();
    public static final Params k = new Params(0.5f, 0.5f, 0.5f);
    public final Params b;
    public final Params c;
    public final Params d;
    public final Params e;
    public final Params f;
    public final Params g;
    public final Params h;
    public final Params i;
    public final boolean j;

    /* compiled from: Hsl.kt */
    public static final class Params implements Parcelable {
        public static final Parcelable.Creator<Params> CREATOR = new a();
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;

        /* compiled from: Hsl.kt */
        public static final class a implements Parcelable.Creator<Params> {
            @Override // android.os.Parcelable.Creator
            public final Params createFromParcel(Parcel parcel) {
                return new Params(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Params[] newArray(int i) {
                return new Params[i];
            }
        }

        public Params(float f, float f2, float f3) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = (f - 0.5f) * 200.0f;
            this.f = (f2 - 0.5f) * 200.0f;
            this.g = (f3 - 0.5f) * 200.0f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Float.compare(this.b, params.b) == 0 && Float.compare(this.c, params.c) == 0 && Float.compare(this.d, params.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + b.a(this.c, Float.hashCode(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(hue=");
            sb.append(this.b);
            sb.append(", saturation=");
            sb.append(this.c);
            sb.append(", brightness=");
            return xq.c(')', this.d, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeFloat(this.d);
        }
    }

    /* compiled from: Hsl.kt */
    public static final class a implements Parcelable.Creator<Hsl> {
        @Override // android.os.Parcelable.Creator
        public final Hsl createFromParcel(Parcel parcel) {
            Parcelable.Creator<Params> creator = Params.CREATOR;
            return new Hsl(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Hsl[] newArray(int i) {
            return new Hsl[i];
        }
    }

    public Hsl() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hsl)) {
            return false;
        }
        Hsl hsl = (Hsl) obj;
        return epx.f(this.b, hsl.b) && epx.f(this.c, hsl.c) && epx.f(this.d, hsl.d) && epx.f(this.e, hsl.e) && epx.f(this.f, hsl.f) && epx.f(this.g, hsl.g) && epx.f(this.h, hsl.h) && epx.f(this.i, hsl.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Hsl(red=" + this.b + ", orange=" + this.c + ", yellow=" + this.d + ", green=" + this.e + ", cyan=" + this.f + ", blue=" + this.g + ", purple=" + this.h + ", magenta=" + this.i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
        this.f.writeToParcel(parcel, i);
        this.g.writeToParcel(parcel, i);
        this.h.writeToParcel(parcel, i);
        this.i.writeToParcel(parcel, i);
    }

    public Hsl(Params params, Params params2, Params params3, Params params4, Params params5, Params params6, Params params7, Params params8) {
        this.b = params;
        this.c = params2;
        this.d = params3;
        this.e = params4;
        this.f = params5;
        this.g = params6;
        this.h = params7;
        this.i = params8;
        Params params9 = k;
        this.j = (epx.f(params, params9) && epx.f(params2, params9) && epx.f(params3, params9) && epx.f(params4, params9) && epx.f(params5, params9) && epx.f(params7, params9) && epx.f(params8, params9)) ? false : true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Hsl(Params params, Params params2, Params params3, Params params4, Params params5, Params params6, Params params7, Params params8, int i, zcl zclVar) {
        this(r11 != 0 ? r0 : params, (i & 2) != 0 ? r0 : params2, (i & 4) != 0 ? r0 : params3, (i & 8) != 0 ? r0 : params4, (i & 16) != 0 ? r0 : params5, (i & 32) != 0 ? r0 : params6, (i & 64) != 0 ? r0 : params7, (i & 128) != 0 ? r0 : params8);
        int i2 = i & 1;
        Params params9 = k;
    }
}
