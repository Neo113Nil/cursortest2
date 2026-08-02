package com.vk.ads.easypromote.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.shy;

/* compiled from: EasyPromoteSettings.kt */
/* loaded from: classes14.dex */
public final class EasyPromoteSettings implements Parcelable {
    public static final Parcelable.Creator<EasyPromoteSettings> CREATOR = new a();
    public final int b;
    public final int c;
    public final Long d;
    public final boolean e;

    /* compiled from: EasyPromoteSettings.kt */
    public static final class a implements Parcelable.Creator<EasyPromoteSettings> {
        @Override // android.os.Parcelable.Creator
        public final EasyPromoteSettings createFromParcel(Parcel parcel) {
            return new EasyPromoteSettings(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final EasyPromoteSettings[] newArray(int i) {
            return new EasyPromoteSettings[i];
        }
    }

    public EasyPromoteSettings(int i, int i2, Long l, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = l;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EasyPromoteSettings)) {
            return false;
        }
        EasyPromoteSettings easyPromoteSettings = (EasyPromoteSettings) obj;
        return this.b == easyPromoteSettings.b && this.c == easyPromoteSettings.c && epx.f(this.d, easyPromoteSettings.d) && this.e == easyPromoteSettings.e;
    }

    public final int hashCode() {
        int a2 = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        Long l = this.d;
        return Boolean.hashCode(this.e) + ((a2 + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EasyPromoteSettings(durationDays=");
        sb.append(this.b);
        sb.append(", budgetRub=");
        sb.append(this.c);
        sb.append(", customDate=");
        sb.append(this.d);
        sb.append(", enabled=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        Long l = this.d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }
}
