package com.vk.newsfeed.posting.additional_settings.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: AdditionalSettingsConfiguration.kt */
/* loaded from: classes4.dex */
public final class AdditionalSettingsConfiguration implements Parcelable {
    public static final Parcelable.Creator<AdditionalSettingsConfiguration> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final AdvertisingOrd e;
    public final boolean f;

    /* compiled from: AdditionalSettingsConfiguration.kt */
    public static final class a implements Parcelable.Creator<AdditionalSettingsConfiguration> {
        @Override // android.os.Parcelable.Creator
        public final AdditionalSettingsConfiguration createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            boolean z4 = true;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            AdvertisingOrd createFromParcel = AdvertisingOrd.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new AdditionalSettingsConfiguration(z5, z3, z4, createFromParcel, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalSettingsConfiguration[] newArray(int i) {
            return new AdditionalSettingsConfiguration[i];
        }
    }

    public AdditionalSettingsConfiguration() {
        this(false, false, false, null, false, 31, null);
    }

    public static AdditionalSettingsConfiguration a(AdditionalSettingsConfiguration additionalSettingsConfiguration, boolean z, boolean z2, boolean z3, AdvertisingOrd advertisingOrd, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = additionalSettingsConfiguration.b;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = additionalSettingsConfiguration.c;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = additionalSettingsConfiguration.d;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            advertisingOrd = additionalSettingsConfiguration.e;
        }
        AdvertisingOrd advertisingOrd2 = advertisingOrd;
        if ((i & 16) != 0) {
            z4 = additionalSettingsConfiguration.f;
        }
        additionalSettingsConfiguration.getClass();
        return new AdditionalSettingsConfiguration(z5, z6, z7, advertisingOrd2, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalSettingsConfiguration)) {
            return false;
        }
        AdditionalSettingsConfiguration additionalSettingsConfiguration = (AdditionalSettingsConfiguration) obj;
        return this.b == additionalSettingsConfiguration.b && this.c == additionalSettingsConfiguration.c && this.d == additionalSettingsConfiguration.d && epx.f(this.e, additionalSettingsConfiguration.e) && this.f == additionalSettingsConfiguration.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdditionalSettingsConfiguration(isCommentEnabled=");
        sb.append(this.b);
        sb.append(", isSignEnabled=");
        sb.append(this.c);
        sb.append(", isNotificationEnabled=");
        sb.append(this.d);
        sb.append(", advertisingOrd=");
        sb.append(this.e);
        sb.append(", isUserAllowedSignature=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        this.e.writeToParcel(parcel, i);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public AdditionalSettingsConfiguration(boolean z, boolean z2, boolean z3, AdvertisingOrd advertisingOrd, boolean z4) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = advertisingOrd;
        this.f = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdditionalSettingsConfiguration(boolean z, boolean z2, boolean z3, AdvertisingOrd advertisingOrd, boolean z4, int i, zcl zclVar) {
        this(z, z2, z3, advertisingOrd, (i & 16) != 0 ? false : z4);
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? true : z3;
        if ((i & 8) != 0) {
            Parcelable.Creator<AdvertisingOrd> creator = AdvertisingOrd.CREATOR;
            advertisingOrd = AdvertisingOrd.f;
        }
    }
}
