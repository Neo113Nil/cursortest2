package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes9.dex */
public final class zzqc implements Runnable {
    private final Context zza;
    private final zzph zzb;
    private final zzqb zzc;
    private final zzpq zzd;
    private final zzpy zze;

    public zzqc(Context context, zzpq zzpqVar, zzph zzphVar) {
        zzqb zzqbVar = new zzqb();
        zzpy zzpyVar = new zzpy();
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzb = (zzph) Preconditions.checkNotNull(zzphVar);
        this.zzd = zzpqVar;
        this.zzc = zzqbVar;
        this.zze = zzpyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputStream inputStream;
        if (!zza("android.permission.INTERNET")) {
            zzhl.zza("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
        } else if (zza("android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zza.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                zzhl.zzd("Starting to load resource from Network.");
                zzpz zzpzVar = new zzpz();
                try {
                    String zza = this.zze.zza(this.zzd.zza());
                    String valueOf = String.valueOf(zza);
                    zzhl.zzd(valueOf.length() != 0 ? "Loading resource from ".concat(valueOf) : new String("Loading resource from "));
                    try {
                        try {
                            try {
                                inputStream = zzpzVar.zza(zza);
                            } catch (FileNotFoundException unused) {
                                String valueOf2 = String.valueOf(zza);
                                zzhl.zza(valueOf2.length() != 0 ? "NetworkLoader: No data was retrieved from the given url: ".concat(valueOf2) : new String("NetworkLoader: No data was retrieved from the given url: "));
                                this.zzb.zzb(2, 0);
                                zzpzVar.zzb();
                                return;
                            }
                        } catch (zzqe unused2) {
                            String valueOf3 = String.valueOf(zza);
                            zzhl.zza(valueOf3.length() != 0 ? "NetworkLoader: Error when loading resource for url: ".concat(valueOf3) : new String("NetworkLoader: Error when loading resource for url: "));
                            this.zzb.zzb(3, 0);
                            inputStream = null;
                        }
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            IOUtils.copyStream(inputStream, byteArrayOutputStream);
                            this.zzb.zzc(byteArrayOutputStream.toByteArray());
                            zzpzVar.zzb();
                            return;
                        } catch (IOException e11) {
                            String message = e11.getMessage();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(zza).length() + 66 + String.valueOf(message).length());
                            sb2.append("NetworkLoader: Error when parsing downloaded resources from url: ");
                            sb2.append(zza);
                            sb2.append(" ");
                            sb2.append(message);
                            zzhl.zzb(sb2.toString(), e11);
                            this.zzb.zzb(2, 0);
                            zzpzVar.zzb();
                            return;
                        }
                    } catch (IOException e12) {
                        String message2 = e12.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(zza).length() + 54 + String.valueOf(message2).length());
                        sb3.append("NetworkLoader: Error when loading resource from url: ");
                        sb3.append(zza);
                        sb3.append(" ");
                        sb3.append(message2);
                        zzhl.zzb(sb3.toString(), e12);
                        this.zzb.zzb(1, 0);
                        zzpzVar.zzb();
                        return;
                    }
                } catch (Throwable th2) {
                    zzpzVar.zzb();
                    throw th2;
                }
            }
            zzhl.zze("No network connectivity - Offline");
        } else {
            zzhl.zza("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
        }
        this.zzb.zzb(0, 0);
    }

    @VisibleForTesting
    final boolean zza(String str) {
        return this.zza.getPackageManager().checkPermission(str, this.zza.getPackageName()) == 0;
    }
}
