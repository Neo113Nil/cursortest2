package com.vk.external.miniapp.net.app;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import xsna.e43;
import xsna.qoy;
import xsna.shy;

/* compiled from: WebAdConfig.kt */
/* loaded from: classes18.dex */
public final class WebAdConfig implements Parcelable {
    public static final Parcelable.Creator<WebAdConfig> CREATOR = new a();
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    /* compiled from: WebAdConfig.kt */
    public static final class a implements Parcelable.Creator<WebAdConfig> {
        @Override // android.os.Parcelable.Creator
        public final WebAdConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
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
            if (parcel.readInt() != 0) {
                z = z2;
            }
            return new WebAdConfig(readInt, readInt2, z5, z3, z4, z);
        }

        @Override // android.os.Parcelable.Creator
        public final WebAdConfig[] newArray(int i) {
            return new WebAdConfig[i];
        }
    }

    public WebAdConfig(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final ArrayList d() {
        List l = e43.l(Integer.valueOf(this.c), Integer.valueOf(this.b));
        ArrayList arrayList = new ArrayList();
        for (Object obj : l) {
            if (((Number) obj).intValue() != -1) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final WebAdConfig e() {
        return new WebAdConfig(this.b, -1, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebAdConfig)) {
            return false;
        }
        WebAdConfig webAdConfig = (WebAdConfig) obj;
        return this.b == webAdConfig.b && this.c == webAdConfig.c && this.d == webAdConfig.d && this.e == webAdConfig.e && this.f == webAdConfig.f && this.g == webAdConfig.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(qoy.b(qoy.b(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAdConfig(id=");
        sb.append(this.b);
        sb.append(", externalAdId=");
        sb.append(this.c);
        sb.append(", testMode=");
        sb.append(this.d);
        sb.append(", isMobWebEnabled=");
        sb.append(this.e);
        sb.append(", isSplashAdEnabled=");
        sb.append(this.f);
        sb.append(", isClosingAdEnabled=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
