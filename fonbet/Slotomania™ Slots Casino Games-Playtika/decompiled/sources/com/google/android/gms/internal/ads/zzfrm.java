package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzfrm implements zzhbf {
    final /* synthetic */ zzfpi zza;
    final /* synthetic */ zzfps zzb;
    final /* synthetic */ zzdeu zzc;
    final /* synthetic */ zzfro zzd;

    zzfrm(zzfro zzfroVar, zzfpi zzfpiVar, zzfps zzfpsVar, zzdeu zzdeuVar) {
        this.zza = zzfpiVar;
        this.zzb = zzfpsVar;
        this.zzc = zzdeuVar;
        Objects.requireNonNull(zzfroVar);
        this.zzd = zzfroVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfpi zzfpiVar = this.zza;
        if (zzfpiVar == null) {
            return;
        }
        zzfpiVar.zzd(false);
        zzfps zzfpsVar = this.zzb;
        if (zzfpsVar != null) {
            zzfpsVar.zza(zzfpiVar);
            zzfpsVar.zzh();
        } else {
            zzfro zzfroVar = this.zzd;
            zzfroVar.zze().zzb(zzfpiVar.zzm());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    @Override // com.google.android.gms.internal.ads.zzhbf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        char c;
        int i;
        int hashCode;
        zzfpi zzfpiVar = this.zza;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfpiVar != null) {
            zzfpiVar.zzd(zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            zzfps zzfpsVar = this.zzb;
            if (zzfpsVar == null) {
                this.zzd.zze().zzb(zzfpiVar.zzm());
            } else {
                zzfpsVar.zza(zzfpiVar);
                zzfpsVar.zzh();
            }
        }
        zzdeu zzdeuVar = this.zzc;
        if (zzdeuVar != null) {
            String zzb = this.zzd.zzd().zzb();
            if (TextUtils.isEmpty(zzb)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(zzb);
                Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                String optString = jSONObject.optString("type");
                String optString2 = jSONObject.optString("precision");
                String optString3 = jSONObject.optString("currency");
                long optLong = jSONObject.optLong("value", 0L);
                int hashCode2 = optString.hashCode();
                char c2 = 65535;
                if (hashCode2 == 66934) {
                    if (optString.equals("CPC")) {
                        c = 1;
                        if (c != 0) {
                        }
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        zzdeuVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, optLong));
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    hashCode = optString2.hashCode();
                    if (hashCode == -2131980260) {
                    }
                    zzdeuVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, optLong));
                }
                if (hashCode2 == 66944) {
                    if (optString.equals("CPM")) {
                        c = 0;
                        if (c != 0) {
                        }
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        zzdeuVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, optLong));
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    hashCode = optString2.hashCode();
                    if (hashCode == -2131980260) {
                    }
                    zzdeuVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, optLong));
                }
                if (hashCode2 == 1349395245 && optString.equals("ONE_PIXEL")) {
                    c = 2;
                    if (c != 0) {
                        i = 1;
                    } else if (c == 1) {
                        i = 2;
                    } else if (c != 2) {
                        i = 0;
                    } else {
                        optLong /= 1000;
                        i = 3;
                    }
                    hashCode = optString2.hashCode();
                    if (hashCode == -2131980260) {
                        if (hashCode != 399232571) {
                            if (hashCode == 1271254246 && optString2.equals("PUBLISHER_PROVIDED")) {
                                c2 = 1;
                            }
                        } else if (optString2.equals("PRECISE")) {
                            c2 = 2;
                        }
                    } else if (optString2.equals("ESTIMATED")) {
                        c2 = 0;
                    }
                    zzdeuVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, optLong));
                }
                c = 65535;
                if (c != 0) {
                }
                hashCode = optString2.hashCode();
                if (hashCode == -2131980260) {
                }
                zzdeuVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, optLong));
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "UrlPinger.pingUrl");
            }
        }
    }
}
