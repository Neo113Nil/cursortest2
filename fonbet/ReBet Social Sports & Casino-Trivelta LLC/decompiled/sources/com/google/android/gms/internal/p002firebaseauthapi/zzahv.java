package com.google.android.gms.internal.p002firebaseauthapi;

import E9.b;
import K9.h;
import K9.r;
import ai.verisoul.sdk.Core;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzahv extends AbstractSafeParcelable implements zzaez<zzahv> {
    public static final Parcelable.Creator<zzahv> CREATOR = new zzahu();
    private static final String zza = "zzahv";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzahv() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahv zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = r.a(jSONObject.optString("refresh_token"));
            this.zzc = r.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = r.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzajk.zza(e10, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 2, this.zzb, false);
        b.F(parcel, 3, this.zzc, false);
        b.A(parcel, 4, Long.valueOf(zza()), false);
        b.F(parcel, 5, this.zze, false);
        Long l10 = this.zzf;
        l10.longValue();
        b.A(parcel, 6, l10, false);
        b.b(parcel, a10);
    }

    public final long zza() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new zzaao(e10);
        }
    }

    public final boolean zzg() {
        return h.c().a() + Core.sensorDataTimeout < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }

    public static zzahv zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzahv zzahvVar = new zzahv();
            zzahvVar.zzb = jSONObject.optString("refresh_token", null);
            zzahvVar.zzc = jSONObject.optString("access_token", null);
            zzahvVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzahvVar.zze = jSONObject.optString("token_type", null);
            zzahvVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzahvVar;
        } catch (JSONException e10) {
            throw new zzaao(e10);
        }
    }

    public final void zzc(String str) {
        this.zzb = AbstractC3191o.g(str);
    }

    public zzahv(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public zzahv(String str, String str2, Long l10, String str3, Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }

    public final String zzd() {
        return this.zzb;
    }
}
