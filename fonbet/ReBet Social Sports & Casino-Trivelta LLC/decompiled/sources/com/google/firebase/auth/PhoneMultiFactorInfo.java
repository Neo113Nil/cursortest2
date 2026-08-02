package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import kb.X;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PhoneMultiFactorInfo extends MultiFactorInfo {

    @NonNull
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new X();

    /* renamed from: a, reason: collision with root package name */
    public final String f37594a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37595b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37596c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37597d;

    public PhoneMultiFactorInfo(String str, String str2, long j10, String str3) {
        this.f37594a = AbstractC3191o.g(str);
        this.f37595b = str2;
        this.f37596c = j10;
        this.f37597d = AbstractC3191o.g(str3);
    }

    public static PhoneMultiFactorInfo j(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new PhoneMultiFactorInfo(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String a() {
        return this.f37594a;
    }

    public String b() {
        return this.f37597d;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public long g() {
        return this.f37596c;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String getDisplayName() {
        return this.f37595b;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String h() {
        return "phone";
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f37594a);
            jSONObject.putOpt("displayName", this.f37595b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f37596c));
            jSONObject.putOpt("phoneNumber", this.f37597d);
            return jSONObject;
        } catch (JSONException e10) {
            throw new zzaao(e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, a(), false);
        E9.b.F(parcel, 2, getDisplayName(), false);
        E9.b.y(parcel, 3, g());
        E9.b.F(parcel, 4, b(), false);
        E9.b.b(parcel, a10);
    }
}
