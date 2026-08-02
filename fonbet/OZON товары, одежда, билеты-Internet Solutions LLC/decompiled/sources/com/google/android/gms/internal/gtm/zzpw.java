package com.google.android.gms.internal.gtm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes9.dex */
final class zzpw implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ byte[] zzb;
    final /* synthetic */ zzpx zzc;

    zzpw(zzpx zzpxVar, String str, byte[] bArr) {
        this.zzc = zzpxVar;
        this.zza = str;
        this.zzb = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpx zzpxVar = this.zzc;
        String str = this.zza;
        byte[] bArr = this.zzb;
        File zzb = zzpxVar.zzb(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(zzb);
            try {
                try {
                    fileOutputStream.write(bArr);
                } catch (IOException unused) {
                    zzhl.zza("Error writing resource to disk. Removing resource from disk");
                    zzb.delete();
                    try {
                        fileOutputStream.close();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24);
                        sb2.append("Resource ");
                        sb2.append(str);
                        sb2.append(" saved on Disk.");
                        zzhl.zzd(sb2.toString());
                    } catch (IOException unused2) {
                        zzhl.zza("Error closing stream for writing resource to disk");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 24);
                    sb3.append("Resource ");
                    sb3.append(str);
                    sb3.append(" saved on Disk.");
                    zzhl.zzd(sb3.toString());
                } catch (IOException unused3) {
                    zzhl.zza("Error closing stream for writing resource to disk");
                }
            }
        } catch (FileNotFoundException unused4) {
            zzhl.zza("Error opening resource file for writing");
        }
    }
}
