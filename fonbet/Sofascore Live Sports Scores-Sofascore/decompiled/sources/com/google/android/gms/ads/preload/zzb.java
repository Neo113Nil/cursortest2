package com.google.android.gms.ads.preload;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzb {
    public final zzch a;
    public final AdFormat b;
    public final Context c;

    public zzb(Context context, AdFormat adFormat) {
        this.a = com.google.android.gms.ads.zzb.zza(context);
        this.c = context.getApplicationContext();
        this.b = adFormat;
    }

    public final boolean zzb(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        if (str == null) {
            return false;
        }
        try {
            return this.a.zzm(str, zzf.zzu(this.c, preloadConfiguration, this.b), preloadCallbackV2 == null ? null : new zza(this, preloadCallbackV2));
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(str.length() + 37);
            sb.append("Failed to preload ad for preload ID ");
            sb.append(str);
            sb.append(".");
            zzo.zzj(sb.toString(), e);
            return false;
        }
    }

    public final boolean zzc(String str, PreloadConfiguration preloadConfiguration) {
        if (str == null) {
            return false;
        }
        try {
            return this.a.zzm(str, zzf.zzu(this.c, preloadConfiguration, this.b), null);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(str.length() + 37);
            sb.append("Failed to preload ad for preload ID ");
            sb.append(str);
            sb.append(".");
            zzo.zzj(sb.toString(), e);
            return false;
        }
    }

    public final boolean zzd(String str) {
        try {
            return this.a.zzn(this.b.getValue(), str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final int zze(String str) {
        try {
            return this.a.zzt(this.b.getValue(), str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return 0;
        }
    }

    public final boolean zzf(String str) {
        try {
            return this.a.zzu(this.b.getValue(), str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final void zzg() {
        try {
            this.a.zzv(this.b.getValue());
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final Map zzh() {
        PreloadConfiguration zzs;
        try {
            Bundle zzs2 = this.a.zzs(this.b.getValue());
            HashMap hashMap = new HashMap();
            for (String str : zzs2.keySet()) {
                byte[] byteArray = zzs2.getByteArray(str);
                if (byteArray != null && (zzs = zzf.zzs((zzfp) SafeParcelableSerializer.a(byteArray, zzfp.CREATOR))) != null) {
                    hashMap.put(str, zzs);
                }
            }
            return hashMap;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return new HashMap();
        }
    }

    @Nullable
    public final PreloadConfiguration zzi(String str) {
        try {
            zzfp zzr = this.a.zzr(this.b.getValue(), str);
            if (zzr == null) {
                return null;
            }
            return zzf.zzs(zzr);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
