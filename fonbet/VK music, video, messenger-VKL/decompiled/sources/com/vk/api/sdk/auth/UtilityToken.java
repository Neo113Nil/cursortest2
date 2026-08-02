package com.vk.api.sdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import xsna.epx;
import xsna.ss9;

/* compiled from: UtilityToken.kt */
/* loaded from: classes15.dex */
public final class UtilityToken implements Parcelable {
    public static final a CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: UtilityToken.kt */
    public static final class a implements Parcelable.Creator<UtilityToken> {
        public static UtilityToken a(JSONObject jSONObject) {
            return new UtilityToken(jSONObject.optString("target_key"), jSONObject.optString("token"));
        }

        @Override // android.os.Parcelable.Creator
        public final UtilityToken createFromParcel(Parcel parcel) {
            return new UtilityToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UtilityToken[] newArray(int i) {
            return new UtilityToken[i];
        }
    }

    public UtilityToken(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilityToken)) {
            return false;
        }
        UtilityToken utilityToken = (UtilityToken) obj;
        return epx.f(this.b, utilityToken.b) && epx.f(this.c, utilityToken.c);
    }

    public final JSONObject f() {
        return new JSONObject().put("target_key", this.b).put("token", this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("UtilityToken(targetKey=", this.b, ", token=", this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UtilityToken(Parcel parcel) {
        this(r0, r3 != null ? r3 : "");
        String readString = parcel.readString();
        readString = readString == null ? "" : readString;
        String readString2 = parcel.readString();
    }
}
