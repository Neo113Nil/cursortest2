package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzfya {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzbdh zzd;

    public zzfya(Context context, zzbdh zzbdhVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfyb.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfyb.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzbdhVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int zza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 6);
        sb.append("FBAMTD");
        sb.append(zza);
        return sb.toString();
    }

    private final String zzf() {
        int zza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 6);
        sb.append("LATMTD");
        sb.append(zza);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzbdj zzbdjVar, zzfyg zzfygVar) {
        boolean z;
        zzbdp zzc;
        zzbdp zzc2;
        String zza = zzbdjVar.zza().zza();
        byte[] zzA = zzbdjVar.zzb().zzA();
        byte[] zzA2 = zzbdjVar.zzc().zzA();
        if (!TextUtils.isEmpty(zza) && zzA2 != null && zzA2.length != 0) {
            File file = this.zza;
            zzfyb.zze(file);
            file.mkdirs();
            zzfyb.zzc(zza, file).mkdirs();
            File zza2 = zzfyb.zza(zza, "pcam.jar", file);
            if ((zzA == null || zzA.length <= 0 || zzfyb.zzb(zza2, zzA)) && zzfyb.zzb(zzfyb.zza(zza, "pcbc", file), zzA2)) {
                File zza3 = zzfyb.zza(zzbdjVar.zza().zza(), "pcam.jar", file);
                if (zza3.exists() && zzfygVar != null && !zzfygVar.zza(zza3)) {
                    return false;
                }
                String zza4 = zzbdjVar.zza().zza();
                if (!TextUtils.isEmpty(zza4)) {
                    File zza5 = zzfyb.zza(zza4, "pcam.jar", file);
                    File zza6 = zzfyb.zza(zza4, "pcbc", file);
                    File zza7 = zzfyb.zza(zza4, "pcam.jar", zzd());
                    File zza8 = zzfyb.zza(zza4, "pcbc", zzd());
                    if ((!zza5.exists() || zza5.renameTo(zza7)) && zza6.exists() && zza6.renameTo(zza8)) {
                        zzbdo zzi = zzbdp.zzi();
                        zzi.zza(zzbdjVar.zza().zza());
                        zzi.zzb(zzbdjVar.zza().zzb());
                        zzi.zzd(zzbdjVar.zza().zzd());
                        zzi.zze(zzbdjVar.zza().zze());
                        zzi.zzc(zzbdjVar.zza().zzc());
                        zzbdp zzbdpVar = (zzbdp) zzi.zzbu();
                        zzbdp zzc3 = zzc(1);
                        SharedPreferences.Editor edit = this.zzc.edit();
                        if (zzc3 != null && !zzbdpVar.zza().equals(zzc3.zza())) {
                            edit.putString(zze(), Hex.bytesToStringLowercase(zzc3.zzaN()));
                        }
                        edit.putString(zzf(), Hex.bytesToStringLowercase(zzbdpVar.zzaN()));
                        if (edit.commit()) {
                            z = true;
                            HashSet hashSet = new HashSet();
                            zzc = zzc(1);
                            if (zzc != null) {
                                hashSet.add(zzc.zza());
                            }
                            zzc2 = zzc(2);
                            if (zzc2 != null) {
                                hashSet.add(zzc2.zza());
                            }
                            for (File file2 : zzd().listFiles()) {
                                String name = file2.getName();
                                if (!hashSet.contains(name)) {
                                    zzfyb.zze(zzfyb.zzc(name, zzd()));
                                }
                            }
                            return z;
                        }
                    }
                }
                z = false;
                HashSet hashSet2 = new HashSet();
                zzc = zzc(1);
                if (zzc != null) {
                }
                zzc2 = zzc(2);
                if (zzc2 != null) {
                }
                while (r4 < r1) {
                }
                return z;
            }
        }
        return false;
    }

    public final zzfxz zzb(int i) {
        zzbdp zzc = zzc(1);
        if (zzc == null) {
            return null;
        }
        String zza = zzc.zza();
        File zza2 = zzfyb.zza(zza, "pcam.jar", zzd());
        if (!zza2.exists()) {
            zza2 = zzfyb.zza(zza, "pcam", zzd());
        }
        return new zzfxz(zzc, zza2, zzfyb.zza(zza, "pcbc", zzd()), zzfyb.zza(zza, "pcopt", zzd()));
    }

    final zzbdp zzc(int i) {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzicn zzicnVar = zzicn.zza;
            zzbdp zzg = zzbdp.zzg(zzicn.zzt(stringToBytes, 0, stringToBytes.length));
            String zza = zzg.zza();
            File zza2 = zzfyb.zza(zza, "pcam.jar", zzd());
            if (!zza2.exists()) {
                zza2 = zzfyb.zza(zza, "pcam", zzd());
            }
            File zza3 = zzfyb.zza(zza, "pcbc", zzd());
            if (zza2.exists()) {
                if (zza3.exists()) {
                    return zzg;
                }
            }
        } catch (zzieg unused) {
        }
        return null;
    }
}
