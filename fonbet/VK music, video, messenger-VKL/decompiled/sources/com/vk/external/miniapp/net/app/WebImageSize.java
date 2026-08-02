package com.vk.external.miniapp.net.app;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.drm0;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.tn;
import xsna.zcl;

/* compiled from: WebImageSize.kt */
/* loaded from: classes18.dex */
public final class WebImageSize implements Parcelable {
    public static final a CREATOR = new a();
    public static final WebImageSize h = new WebImageSize("", 1, 1, 'm', false, null, 32, null);
    public final String b;
    public final int c;
    public final int d;
    public final char e;
    public final boolean f;
    public final Boolean g;

    /* compiled from: WebImageSize.kt */
    public static final class a implements Parcelable.Creator<WebImageSize> {
        public static WebImageSize a(Integer num, String str) {
            String str2;
            if (num != null) {
                WebImageSize.CREATOR.getClass();
                String str3 = str + (drm0.E(str, '?') ? (drm0.G(str, '?') || drm0.G(str, '&')) ? "" : "&" : "?") + "cs=" + num + "x0";
                if (str3 != null) {
                    str2 = str3;
                    return new WebImageSize(str2, 480, 480, (char) 0, false, Boolean.TRUE, 24, null);
                }
            }
            str2 = str;
            return new WebImageSize(str2, 480, 480, (char) 0, false, Boolean.TRUE, 24, null);
        }

        public static WebImageSize b(JSONObject jSONObject) throws JSONException {
            StringBuilder sb = new StringBuilder("");
            sb.append(jSONObject.getString(jSONObject.has("url") ? "url" : "src"));
            String sb2 = sb.toString();
            int optInt = jSONObject.optInt("width", 135);
            int optInt2 = jSONObject.optInt("height", 100);
            return new WebImageSize(sb2, optInt2 > 0 ? optInt2 : 100, optInt > 0 ? optInt : 135, (char) 0, false, null, 56, null);
        }

        @Override // android.os.Parcelable.Creator
        public final WebImageSize createFromParcel(Parcel parcel) {
            return new WebImageSize(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebImageSize[] newArray(int i) {
            return new WebImageSize[i];
        }
    }

    public WebImageSize(String str, int i, int i2, char c, boolean z, Boolean bool) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = c;
        this.f = z;
        this.g = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebImageSize)) {
            return false;
        }
        WebImageSize webImageSize = (WebImageSize) obj;
        return epx.f(this.b, webImageSize.b) && this.c == webImageSize.c && this.d == webImageSize.d && this.e == webImageSize.e && this.f == webImageSize.f && epx.f(this.g, webImageSize.g);
    }

    public final String getUrl() {
        return this.b;
    }

    public final int hashCode() {
        int b = qoy.b((Character.hashCode(this.e) + shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31)) * 31, 31, this.f);
        Boolean bool = this.g;
        return b + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebImageSize(url=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", withPadding=");
        sb.append(this.f);
        sb.append(", isBase=");
        return tn.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(epx.f(this.g, Boolean.TRUE) ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebImageSize(String str, int i, int i2, char c, boolean z, Boolean bool, int i3, zcl zclVar) {
        this(str, i, i2, c, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? Boolean.FALSE : bool);
        if ((i3 & 8) != 0) {
            CREATOR.getClass();
            int max = Math.max(i2, i);
            c = max == 0 ? 'o' : max <= 75 ? 's' : max <= 130 ? 'm' : max <= 200 ? 'p' : max <= 320 ? 'q' : max <= 510 ? 'r' : max <= 604 ? 'x' : max <= 807 ? 'y' : max <= 1080 ? 'z' : 'w';
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebImageSize(Parcel parcel) {
        this(r1, r2, r3, r4, r5, Boolean.valueOf(parcel.readByte() != 0 ? true : r0));
        boolean z;
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        char readInt3 = (char) parcel.readInt();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = false;
            z2 = true;
        } else {
            z = false;
        }
    }
}
