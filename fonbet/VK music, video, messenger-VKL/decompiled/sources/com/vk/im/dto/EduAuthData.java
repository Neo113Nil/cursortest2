package com.vk.im.dto;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.auth.AuthPayload;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.urd0;

/* compiled from: EduAuthData.kt */
/* loaded from: classes2.dex */
public final class EduAuthData implements Parcelable {
    public static final a CREATOR = new a();
    public final String b;
    public final String c;
    public final AuthPayload d;
    public final com.vk.api.sdk.auth.a e;

    /* compiled from: EduAuthData.kt */
    public static final class a implements Parcelable.Creator<EduAuthData> {
        @Override // android.os.Parcelable.Creator
        public final EduAuthData createFromParcel(Parcel parcel) {
            return new EduAuthData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EduAuthData[] newArray(int i) {
            return new EduAuthData[i];
        }
    }

    public EduAuthData(String str, String str2, AuthPayload authPayload, com.vk.api.sdk.auth.a aVar) {
        this.b = str;
        this.c = str2;
        this.d = authPayload;
        this.e = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EduAuthData)) {
            return false;
        }
        EduAuthData eduAuthData = (EduAuthData) obj;
        return epx.f(this.b, eduAuthData.b) && epx.f(this.c, eduAuthData.c) && epx.f(this.d, eduAuthData.d) && epx.f(this.e, eduAuthData.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        AuthPayload authPayload = this.d;
        int hashCode = (a2 + (authPayload == null ? 0 : authPayload.hashCode())) * 31;
        com.vk.api.sdk.auth.a aVar = this.e;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "EduAuthData(url=" + this.b + ", redirectUrl=" + this.c + ", authPayload=" + this.d + ", accessToken=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        Bundle bundle = new Bundle();
        com.vk.api.sdk.auth.a aVar = this.e;
        if (aVar != null) {
            Bundle bundle2 = new Bundle();
            HashMap hashMap = new HashMap();
            hashMap.put(SharedKt.PARAM_ACCESS_TOKEN, aVar.b);
            hashMap.put("secret", aVar.c);
            hashMap.put("https_required", aVar.i ? "1" : "0");
            hashMap.put("created", String.valueOf(aVar.d));
            hashMap.put(SharedKt.PARAM_EXPIRES_IN, String.valueOf(aVar.h));
            hashMap.put("user_id", String.valueOf(aVar.a.b));
            hashMap.put("email", aVar.e);
            hashMap.put("phone", aVar.f);
            hashMap.put("phone_access_key", aVar.g);
            hashMap.put("utility_tokens", aVar.j.d().toString());
            for (Map.Entry entry : hashMap.entrySet()) {
                bundle2.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putBundle("vk_access_token", bundle2);
        }
        parcel.writeParcelable(bundle, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EduAuthData(Parcel parcel) {
        this(r0, r1, r2, r3);
        Bundle bundle;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        AuthPayload authPayload = (AuthPayload) parcel.readParcelable(AuthPayload.class.getClassLoader());
        List<String> list = com.vk.api.sdk.auth.a.k;
        Bundle bundle2 = (Bundle) parcel.readParcelable(Bundle.class.getClassLoader());
        com.vk.api.sdk.auth.a aVar = null;
        if (bundle2 != null && (bundle = bundle2.getBundle("vk_access_token")) != null) {
            HashMap hashMap = new HashMap();
            for (String str : bundle.keySet()) {
                hashMap.put(str, bundle.getString(str));
            }
            aVar = new com.vk.api.sdk.auth.a(hashMap);
        }
    }
}
