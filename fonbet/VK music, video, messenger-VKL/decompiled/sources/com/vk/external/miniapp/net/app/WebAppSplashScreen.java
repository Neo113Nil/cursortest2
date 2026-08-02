package com.vk.external.miniapp.net.app;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.urd0;

/* compiled from: WebAppSplashScreen.kt */
/* loaded from: classes18.dex */
public final class WebAppSplashScreen implements Parcelable {
    public static final Parcelable.Creator<WebAppSplashScreen> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;

    /* compiled from: WebAppSplashScreen.kt */
    public static final class a implements Parcelable.Creator<WebAppSplashScreen> {
        @Override // android.os.Parcelable.Creator
        public final WebAppSplashScreen createFromParcel(Parcel parcel) {
            return new WebAppSplashScreen(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final WebAppSplashScreen[] newArray(int i) {
            return new WebAppSplashScreen[i];
        }
    }

    public WebAppSplashScreen(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
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
        if (!(obj instanceof WebAppSplashScreen)) {
            return false;
        }
        WebAppSplashScreen webAppSplashScreen = (WebAppSplashScreen) obj;
        return epx.f(this.b, webAppSplashScreen.b) && epx.f(this.c, webAppSplashScreen.c) && this.d == webAppSplashScreen.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppSplashScreen(url=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", isAnimated=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
