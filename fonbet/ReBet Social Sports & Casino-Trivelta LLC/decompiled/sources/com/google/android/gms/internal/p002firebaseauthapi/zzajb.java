package com.google.android.gms.internal.p002firebaseauthapi;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.s0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzajb extends AbstractSafeParcelable implements zzafa {
    public static final Parcelable.Creator<zzajb> CREATOR = new zzaja();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzajb() {
        this.zzi = true;
        this.zzj = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 2, this.zza, false);
        b.F(parcel, 3, this.zzb, false);
        b.F(parcel, 4, this.zzc, false);
        b.F(parcel, 5, this.zzd, false);
        b.F(parcel, 6, this.zze, false);
        b.F(parcel, 7, this.zzf, false);
        b.F(parcel, 8, this.zzg, false);
        b.F(parcel, 9, this.zzh, false);
        b.g(parcel, 10, this.zzi);
        b.g(parcel, 11, this.zzj);
        b.F(parcel, 12, this.zzk, false);
        b.F(parcel, 13, this.zzl, false);
        b.F(parcel, 14, this.zzm, false);
        b.F(parcel, 15, this.zzn, false);
        b.g(parcel, 16, this.zzo);
        b.F(parcel, 17, this.zzp, false);
        b.b(parcel, a10);
    }

    public final zzajb zza(boolean z10) {
        this.zzj = false;
        return this;
    }

    public final zzajb zzb(boolean z10) {
        this.zzo = true;
        return this;
    }

    public final zzajb zzc(boolean z10) {
        this.zzi = true;
        return this;
    }

    public final zzajb zza(String str) {
        this.zzb = AbstractC3191o.g(str);
        return this;
    }

    public final zzajb zzb(String str) {
        this.zzn = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzg;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.zzn;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzp;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            jSONObject.put("sessionId", this.zzl);
        }
        if (!TextUtils.isEmpty(this.zzm)) {
            jSONObject.put("requestUri", this.zzm);
        } else {
            String str5 = this.zza;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.zzo);
        return jSONObject.toString();
    }

    public zzajb(s0 s0Var, String str) {
        AbstractC3191o.m(s0Var);
        this.zzl = AbstractC3191o.g(s0Var.d());
        this.zzm = AbstractC3191o.g(str);
        this.zze = AbstractC3191o.g(s0Var.c());
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }

    public zzajb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.zzd) && TextUtils.isEmpty(this.zzk)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        this.zze = AbstractC3191o.g(str3);
        this.zzf = null;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.zzc)) {
            sb2.append("id_token=");
            sb2.append(this.zzc);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            sb2.append("access_token=");
            sb2.append(this.zzd);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            sb2.append("identifier=");
            sb2.append(this.zzf);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            sb2.append("oauth_token_secret=");
            sb2.append(this.zzh);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzk)) {
            sb2.append("code=");
            sb2.append(this.zzk);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb2.append("nonce=");
            sb2.append(str9);
            sb2.append("&");
        }
        sb2.append("providerId=");
        sb2.append(this.zze);
        this.zzg = sb2.toString();
        this.zzj = true;
    }

    public zzajb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z12;
        this.zzp = str13;
    }
}
