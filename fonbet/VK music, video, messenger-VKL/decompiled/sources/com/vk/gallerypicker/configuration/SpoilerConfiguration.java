package com.vk.gallerypicker.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.iq;
import xsna.qoy;
import xsna.zcl;

/* compiled from: SpoilerConfiguration.kt */
/* loaded from: classes16.dex */
public final class SpoilerConfiguration implements Parcelable {
    public static final Parcelable.Creator<SpoilerConfiguration> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Long g;

    /* compiled from: SpoilerConfiguration.kt */
    public static final class a implements Parcelable.Creator<SpoilerConfiguration> {
        @Override // android.os.Parcelable.Creator
        public final SpoilerConfiguration createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = false;
            boolean z5 = true;
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
            } else {
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z2 = z3;
            }
            return new SpoilerConfiguration(z6, z4, z5, z, z2, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final SpoilerConfiguration[] newArray(int i) {
            return new SpoilerConfiguration[i];
        }
    }

    public SpoilerConfiguration() {
        this(false, false, false, false, false, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpoilerConfiguration)) {
            return false;
        }
        SpoilerConfiguration spoilerConfiguration = (SpoilerConfiguration) obj;
        return this.b == spoilerConfiguration.b && this.c == spoilerConfiguration.c && this.d == spoilerConfiguration.d && this.e == spoilerConfiguration.e && this.f == spoilerConfiguration.f && epx.f(this.g, spoilerConfiguration.g);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        Long l = this.g;
        return b + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpoilerConfiguration(spoilerToolNeedShow=");
        sb.append(this.b);
        sb.append(", isSpoilerEnabled=");
        sb.append(this.c);
        sb.append(", isDonateEnabled=");
        sb.append(this.d);
        sb.append(", isDonateSystemNeedActivate=");
        sb.append(this.e);
        sb.append(", canShowOnboarding=");
        sb.append(this.f);
        sb.append(", groupId=");
        return iq.b(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        Long l = this.g;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
    }

    public SpoilerConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Long l) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = l;
    }

    public /* synthetic */ SpoilerConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? null : l);
    }
}
