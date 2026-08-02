package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final class zzpx {
    private final Context zza;
    private final ExecutorService zzb;
    private final zzpt zzc;

    public zzpx(Context context) {
        ExecutorService zza = zzfz.zza().zza(2);
        zzpt zzptVar = new zzpt(context);
        this.zza = context;
        this.zzb = zza;
        this.zzc = zzptVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[]] */
    private static final byte[] zzh(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                IOUtils.copyStream(inputStream, byteArrayOutputStream);
            } catch (IOException unused) {
                zzhl.zze("Failed to read the resource from disk");
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    zzhl.zze("Error closing stream for reading resource from disk");
                    return null;
                }
            }
            try {
                inputStream.close();
                inputStream = byteArrayOutputStream.toByteArray();
                return inputStream;
            } catch (IOException unused3) {
                zzhl.zze("Error closing stream for reading resource from disk");
                return null;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
                throw th2;
            } catch (IOException unused4) {
                zzhl.zze("Error closing stream for reading resource from disk");
                return null;
            }
        }
    }

    private static final String zzi(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "resource_".concat(valueOf) : new String("resource_");
    }

    public final long zza(String str) {
        File zzb = zzb(str);
        if (zzb.exists()) {
            return zzb.lastModified();
        }
        return 0L;
    }

    @VisibleForTesting
    final File zzb(String str) {
        return new File(this.zza.getDir("google_tagmanager", 0), zzi(str));
    }

    public final void zzc(String str, String str2, zzph zzphVar) {
        this.zzb.execute(new zzpv(this, str, str2, zzphVar));
    }

    @VisibleForTesting
    final void zzd(String str, String str2, zzph zzphVar) {
        zzhl.zzd("Starting to load a default asset file from Disk.");
        if (str2 == null) {
            zzhl.zzd("Default asset file is not specified. Not proceeding with the loading");
            zzphVar.zzb(0, 2);
            return;
        }
        try {
            InputStream open = this.zzc.zza.getAssets().open(str2);
            if (open != null) {
                zzphVar.zzc(zzh(open));
            } else {
                zzphVar.zzb(0, 2);
            }
        } catch (IOException unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 42 + str2.length());
            sb2.append("Default asset file not found. ");
            sb2.append(str);
            sb2.append(". Filename: ");
            sb2.append(str2);
            zzhl.zza(sb2.toString());
            zzphVar.zzb(0, 2);
        }
    }

    public final void zze(String str, zzph zzphVar) {
        this.zzb.execute(new zzpu(this, str, zzphVar));
    }

    @VisibleForTesting
    final void zzf(String str, zzph zzphVar) {
        zzhl.zzd("Starting to load a saved resource file from Disk.");
        try {
            zzphVar.zzc(zzh(new FileInputStream(zzb(str))));
        } catch (FileNotFoundException unused) {
            String valueOf = String.valueOf(zzi(str));
            zzhl.zza(valueOf.length() != 0 ? "Saved resource not found: ".concat(valueOf) : new String("Saved resource not found: "));
            zzphVar.zzb(0, 1);
        }
    }

    public final void zzg(String str, byte[] bArr) {
        this.zzb.execute(new zzpw(this, str, bArr));
    }
}
