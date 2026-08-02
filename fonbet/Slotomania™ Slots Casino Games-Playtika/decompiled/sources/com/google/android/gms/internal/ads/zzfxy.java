package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C2669ta;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzfxy implements zzfwt {
    private final Object zza;
    private final zzfxz zzb;
    private final zzfyk zzc;
    private final zzfwq zzd;
    private final boolean zze;

    zzfxy(Object obj, zzfxz zzfxzVar, zzfyk zzfykVar, zzfwq zzfwqVar, boolean z) {
        this.zza = obj;
        this.zzb = zzfxzVar;
        this.zzc = zzfykVar;
        this.zzd = zzfwqVar;
        this.zze = z;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzayx zza = zzayy.zza();
        zza.zzd(5);
        zza.zza(zzicn.zzt(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzayy) zza.zzbu()).zzaN(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfwt
    public final synchronized String zza(Context context, String str) {
        byte[] zzj;
        Map zzb = this.zzc.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put(C2669ta.b, null);
        zzj = zzj(null, zzb);
        if (this.zze) {
            zzb.clear();
        }
        return zzi(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwt
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        byte[] zzj;
        Map zzc = this.zzc.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put(C2669ta.b, null);
        zzc.put(ViewHierarchyConstants.VIEW_KEY, view);
        zzc.put("act", activity);
        zzj = zzj(null, zzc);
        if (this.zze) {
            zzc.clear();
        }
        return zzi(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwt
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        byte[] zzj;
        Map zzd = this.zzc.zzd();
        zzd.put("f", "c");
        zzd.put("ctx", context);
        zzd.put("cs", str2);
        zzd.put(C2669ta.b, null);
        zzd.put(ViewHierarchyConstants.VIEW_KEY, view);
        zzd.put("act", activity);
        zzj = zzj(null, zzd);
        if (this.zze) {
            zzd.clear();
        }
        return zzi(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwt
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfyi {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Map zze = this.zzc.zze();
            zze.put(C2669ta.b, null);
            zze.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, zze);
            this.zzd.zzb(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfyi(2005, e);
        }
    }

    final zzfxz zze() {
        return this.zzb;
    }

    final synchronized boolean zzf() throws zzfyi {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzfyi(2001, e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", new Class[0]).invoke(obj, new Object[0])).booleanValue();
    }

    public final synchronized void zzg() throws zzfyi {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("close", new Class[0]).invoke(obj, new Object[0]);
            this.zzd.zzb(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfyi(2003, e);
        }
    }

    public final synchronized int zzh() throws zzfyi {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzfyi(2006, e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(obj, new Object[0])).intValue();
    }
}
