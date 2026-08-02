package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import com.google.android.gms.internal.p002firebaseauthapi.zzak;
import kb.U;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new U();

    /* renamed from: a, reason: collision with root package name */
    public final String f37719a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37720b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37721c;

    public zzan(String str, String str2, String str3) {
        this.f37719a = str;
        this.f37720b = str2;
        this.f37721c = str3;
    }

    public static zzah g(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzah.zzg();
        }
        zzak zzf = zzah.zzf();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            zzf.zza(new zzan(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzf.zza();
    }

    public static final zzan h(JSONObject jSONObject) {
        return new zzan(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    public static final JSONObject i(zzan zzanVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credentialId", zzanVar.f37719a);
        jSONObject.put("name", zzanVar.f37720b);
        jSONObject.put("displayName", zzanVar.f37721c);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, this.f37719a, false);
        E9.b.F(parcel, 2, this.f37720b, false);
        E9.b.F(parcel, 3, this.f37721c, false);
        E9.b.b(parcel, a10);
    }
}
