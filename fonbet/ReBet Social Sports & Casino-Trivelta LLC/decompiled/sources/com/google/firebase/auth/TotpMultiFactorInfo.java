package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;
import kb.Z;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TotpMultiFactorInfo extends MultiFactorInfo {

    @NonNull
    public static final Parcelable.Creator<TotpMultiFactorInfo> CREATOR = new Z();

    /* renamed from: a, reason: collision with root package name */
    public final String f37599a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37600b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37601c;

    /* renamed from: d, reason: collision with root package name */
    public final zzaiz f37602d;

    public TotpMultiFactorInfo(String str, String str2, long j10, zzaiz zzaizVar) {
        this.f37599a = AbstractC3191o.g(str);
        this.f37600b = str2;
        this.f37601c = j10;
        this.f37602d = (zzaiz) AbstractC3191o.n(zzaizVar, "totpInfo cannot be null.");
    }

    public static TotpMultiFactorInfo j(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long optLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new TotpMultiFactorInfo(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new zzaiz());
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String a() {
        return this.f37599a;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public long g() {
        return this.f37601c;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String getDisplayName() {
        return this.f37600b;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public String h() {
        return "totp";
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f37599a);
            jSONObject.putOpt("displayName", this.f37600b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f37601c));
            jSONObject.putOpt("totpInfo", this.f37602d);
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
        E9.b.D(parcel, 4, this.f37602d, i10, false);
        E9.b.b(parcel, a10);
    }
}
