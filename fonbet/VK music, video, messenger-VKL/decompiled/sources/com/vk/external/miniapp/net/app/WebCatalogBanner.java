package com.vk.external.miniapp.net.app;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;

/* compiled from: WebCatalogBanner.kt */
/* loaded from: classes18.dex */
public final class WebCatalogBanner implements Parcelable {
    public static final Parcelable.Creator<WebCatalogBanner> CREATOR = new b();
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    /* compiled from: WebCatalogBanner.kt */
    public static final class a {
        public static int a(String str, JSONObject jSONObject) {
            try {
                return Color.parseColor("#" + jSONObject.getString(str));
            } catch (Throwable unused) {
                return 0;
            }
        }
    }

    /* compiled from: WebCatalogBanner.kt */
    public static final class b implements Parcelable.Creator<WebCatalogBanner> {
        @Override // android.os.Parcelable.Creator
        public final WebCatalogBanner createFromParcel(Parcel parcel) {
            return new WebCatalogBanner(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WebCatalogBanner[] newArray(int i) {
            return new WebCatalogBanner[i];
        }
    }

    public WebCatalogBanner(int i, int i2, int i3, String str, String str2) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebCatalogBanner)) {
            return false;
        }
        WebCatalogBanner webCatalogBanner = (WebCatalogBanner) obj;
        return this.b == webCatalogBanner.b && this.c == webCatalogBanner.c && this.d == webCatalogBanner.d && epx.f(this.e, webCatalogBanner.e) && epx.f(this.f, webCatalogBanner.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31, this.e);
        String str = this.f;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebCatalogBanner(backgroundColor=");
        sb.append(this.b);
        sb.append(", titleColor=");
        sb.append(this.c);
        sb.append(", descriptionColor=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", backgroundImageUrl=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
