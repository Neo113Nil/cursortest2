package com.google.firebase.auth.internal;

import E9.b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.internal.p002firebaseauthapi.zzaib;
import kb.H;
import lb.C5424c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzab extends AbstractSafeParcelable implements H {
    public static final Parcelable.Creator<zzab> CREATOR = new C5424c();

    /* renamed from: a, reason: collision with root package name */
    public String f37664a;

    /* renamed from: b, reason: collision with root package name */
    public String f37665b;

    /* renamed from: c, reason: collision with root package name */
    public String f37666c;

    /* renamed from: d, reason: collision with root package name */
    public String f37667d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f37668e;

    /* renamed from: f, reason: collision with root package name */
    public String f37669f;

    /* renamed from: g, reason: collision with root package name */
    public String f37670g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37671h;

    /* renamed from: i, reason: collision with root package name */
    public String f37672i;

    public zzab(zzaib zzaibVar) {
        AbstractC3191o.m(zzaibVar);
        this.f37664a = zzaibVar.zzd();
        this.f37665b = AbstractC3191o.g(zzaibVar.zzf());
        this.f37666c = zzaibVar.zzb();
        Uri zza = zzaibVar.zza();
        if (zza != null) {
            this.f37667d = zza.toString();
            this.f37668e = zza;
        }
        this.f37669f = zzaibVar.zzc();
        this.f37670g = zzaibVar.zze();
        this.f37671h = false;
        this.f37672i = zzaibVar.zzg();
    }

    public static zzab g(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new zzab(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e10) {
            throw new zzaao(e10);
        }
    }

    @Override // kb.H
    public final String a() {
        return this.f37664a;
    }

    @Override // kb.H
    public final String b() {
        return this.f37670g;
    }

    @Override // kb.H
    public final boolean c() {
        return this.f37671h;
    }

    @Override // kb.H
    public final String getDisplayName() {
        return this.f37666c;
    }

    @Override // kb.H
    public final String getEmail() {
        return this.f37669f;
    }

    @Override // kb.H
    public final Uri getPhotoUrl() {
        if (!TextUtils.isEmpty(this.f37667d) && this.f37668e == null) {
            this.f37668e = Uri.parse(this.f37667d);
        }
        return this.f37668e;
    }

    public final String h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f37664a);
            jSONObject.putOpt("providerId", this.f37665b);
            jSONObject.putOpt("displayName", this.f37666c);
            jSONObject.putOpt("photoUrl", this.f37667d);
            jSONObject.putOpt("email", this.f37669f);
            jSONObject.putOpt("phoneNumber", this.f37670g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f37671h));
            jSONObject.putOpt("rawUserInfo", this.f37672i);
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new zzaao(e10);
        }
    }

    @Override // kb.H
    public final String n() {
        return this.f37665b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, a(), false);
        b.F(parcel, 2, n(), false);
        b.F(parcel, 3, getDisplayName(), false);
        b.F(parcel, 4, this.f37667d, false);
        b.F(parcel, 5, getEmail(), false);
        b.F(parcel, 6, b(), false);
        b.g(parcel, 7, c());
        b.F(parcel, 8, this.f37672i, false);
        b.b(parcel, a10);
    }

    public final String zza() {
        return this.f37672i;
    }

    public zzab(zzahk zzahkVar, String str) {
        AbstractC3191o.m(zzahkVar);
        AbstractC3191o.g(str);
        this.f37664a = AbstractC3191o.g(zzahkVar.zzi());
        this.f37665b = str;
        this.f37669f = zzahkVar.zzh();
        this.f37666c = zzahkVar.zzg();
        Uri zzc = zzahkVar.zzc();
        if (zzc != null) {
            this.f37667d = zzc.toString();
            this.f37668e = zzc;
        }
        this.f37671h = zzahkVar.zzm();
        this.f37672i = null;
        this.f37670g = zzahkVar.zzj();
    }

    public zzab(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f37664a = str;
        this.f37665b = str2;
        this.f37669f = str3;
        this.f37670g = str4;
        this.f37666c = str5;
        this.f37667d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f37668e = Uri.parse(this.f37667d);
        }
        this.f37671h = z10;
        this.f37672i = str7;
    }
}
