package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbil;
import defpackage.f2n;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbif {
    public final zzbik a;
    public final zzbil.zzt.zza b;
    public final boolean c;

    public zzbif(zzbik zzbikVar) {
        this.b = zzbil.zzt.P();
        this.a = zzbikVar;
        this.c = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.k6)).booleanValue();
    }

    public static zzbif a() {
        return new zzbif();
    }

    public final synchronized void b(zzbie zzbieVar) {
        if (this.c) {
            try {
                zzbieVar.a(this.b);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzh().d("AdMobClearcutLogger.modify", e);
            }
        }
    }

    public final synchronized void c(int i) {
        if (this.c) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.l6)).booleanValue()) {
                e(i);
            } else {
                d(i);
            }
        }
    }

    public final synchronized void d(int i) {
        zzbil.zzt.zza zzaVar = this.b;
        zzaVar.n();
        ((zzbil.zzt) zzaVar.b).K();
        List zzj = com.google.android.gms.ads.internal.util.zzs.zzj();
        zzaVar.n();
        ((zzbil.zzt) zzaVar.b).J(zzj);
        zzbij zzbijVar = new zzbij(this.a, ((zzbil.zzt) zzaVar.o()).d());
        int i2 = i - 1;
        zzbijVar.b = i2;
        synchronized (zzbijVar) {
            zzbijVar.c.c.execute(new f2n(zzbijVar, 18));
        }
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void e(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        int i2 = zzgar.a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                try {
                    fileOutputStream.write(f(i).getBytes());
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    public final synchronized String f(int i) {
        StringBuilder sb;
        zzbil.zzt.zza zzaVar = this.b;
        String O = ((zzbil.zzt) zzaVar.b).O();
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        String encodeToString = Base64.encodeToString(((zzbil.zzt) zzaVar.o()).d(), 3);
        sb = new StringBuilder("id=");
        sb.append(O);
        sb.append(",timestamp=");
        sb.append(elapsedRealtime);
        sb.append(",event=");
        sb.append(i - 1);
        sb.append(",data=");
        sb.append(encodeToString);
        sb.append("\n");
        return sb.toString();
    }

    private zzbif() {
        this.b = zzbil.zzt.P();
        this.c = false;
        this.a = new zzbik();
    }
}
