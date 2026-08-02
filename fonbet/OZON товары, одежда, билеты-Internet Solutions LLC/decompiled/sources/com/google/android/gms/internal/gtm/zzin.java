package com.google.android.gms.internal.gtm;

import I0.C3173b;
import N3.C3660k;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzin implements zzgw {
    private final String zza;
    private final Context zzb;
    private final zzim zzc;
    private final zzil zzd = new zzil();

    @VisibleForTesting
    zzin(Context context, zzim zzimVar) {
        this.zzb = context.getApplicationContext();
        this.zzc = zzimVar;
        String str = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        String str2 = null;
        if (locale != null && locale.getLanguage() != null && locale.getLanguage().length() != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(locale.getLanguage().toLowerCase());
            if (locale.getCountry() != null && locale.getCountry().length() != 0) {
                sb2.append("-");
                sb2.append(locale.getCountry().toLowerCase());
            }
            str2 = sb2.toString();
        }
        this.zza = C3173b.c(C3660k.d("GoogleTagManager/5.06 (Linux; U; Android ", str, "; ", str2, "; "), Build.MODEL, " Build/", Build.ID, ")");
    }

    @VisibleForTesting
    static final URL zzc(zzgz zzgzVar) {
        try {
            return new URL(zzgzVar.zze());
        } catch (MalformedURLException unused) {
            zzhl.zza("Error trying to parse the GTM url.");
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(7:30|31|(3:33|(2:36|34)|37)|(1:39)(3:47|48|(18:57|58|59|63|(2:(1:121)|122)(1:(2:117|(1:119)))|69|(7:74|75|(2:83|84)|77|78|79|8)|87|88|89|(2:91|(3:92|93|(1:95)(4:96|97|(1:99)(1:104)|100)))(1:113)|(1:102)|103|(0)|77|78|79|8)(1:56))|40|41|42) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0245 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzgw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(List<zzgz> list) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        char c11;
        StringBuilder sb2;
        BufferedReader bufferedReader;
        int min = Math.min(list.size(), 40);
        boolean z11 = true;
        for (int i11 = 0; i11 < min; i11++) {
            zzgz zzgzVar = list.get(i11);
            URL zzc = zzc(zzgzVar);
            String zzd = zzgzVar.zzd();
            Map<String, String> zzf = zzgzVar.zzf();
            String zzc2 = zzgzVar.zzc();
            if (zzc == null) {
                zzhl.zze("No destination: discarding hit.");
                this.zzc.zza(zzgzVar);
            } else {
                try {
                    httpURLConnection = (HttpURLConnection) zzc.openConnection();
                    inputStream = null;
                    if (z11) {
                        try {
                            zzhm.zza(this.zzb);
                        } catch (Throwable th2) {
                            th = th2;
                            z11 = true;
                            if (0 != 0) {
                                try {
                                    inputStream.close();
                                } catch (IOException e11) {
                                    e = e11;
                                    String valueOf = String.valueOf(zzc);
                                    String simpleName = e.getClass().getSimpleName();
                                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 27 + simpleName.length());
                                    sb3.append("Exception sending hit to ");
                                    sb3.append(valueOf);
                                    sb3.append(": ");
                                    sb3.append(simpleName);
                                    zzhl.zze(sb3.toString());
                                    zzhl.zze(e.getMessage());
                                    this.zzc.zzb(zzgzVar);
                                }
                            }
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    }
                } catch (IOException e12) {
                    e = e12;
                }
                try {
                    httpURLConnection.setRequestProperty("User-Agent", this.zza);
                    if (zzf != null) {
                        for (Map.Entry<String, String> entry : zzf.entrySet()) {
                            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    if (zzd == null) {
                        zzhl.zze(String.format("Hit %d retrieved from the store has null HTTP method.", Long.valueOf(zzgzVar.zzb())));
                        this.zzc.zza(zzgzVar);
                    } else if (zzd.equals("GET") || zzd.equals("HEAD") || zzd.equals("POST") || zzd.equals("PUT")) {
                        switch (zzd.hashCode()) {
                            case 70454:
                                if (zzd.equals("GET")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 79599:
                                if (zzd.equals("PUT")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2213344:
                                if (zzd.equals("HEAD")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2461856:
                                if (zzd.equals("POST")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        if (c11 == 0 || c11 == 1) {
                            if (zzc2 != null) {
                                zzhl.zze("Body of " + zzd + " hit is ignored: " + zzc2 + ".");
                            }
                            httpURLConnection.setRequestMethod(zzd);
                        } else if (c11 == 2 || c11 == 3) {
                            httpURLConnection.setRequestMethod(zzd);
                            if (zzc2 != null) {
                                httpURLConnection.setDoOutput(true);
                                byte[] bytes = zzc2.getBytes(Charset.forName("UTF-8"));
                                httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                bufferedOutputStream.write(bytes);
                                bufferedOutputStream.flush();
                                bufferedOutputStream.close();
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        StringBuilder sb4 = new StringBuilder(27);
                        sb4.append("Response code = ");
                        sb4.append(responseCode);
                        zzhl.zzd(sb4.toString());
                        try {
                            if (responseCode >= 200 && responseCode < 300) {
                                try {
                                    inputStream = httpURLConnection.getInputStream();
                                    String valueOf2 = String.valueOf(zzc);
                                    StringBuilder sb5 = new StringBuilder(valueOf2.length() + 23 + zzd.length());
                                    sb5.append("Hit sent to ");
                                    sb5.append(valueOf2);
                                    sb5.append("(method = ");
                                    sb5.append(zzd);
                                    sb5.append(")");
                                    zzhl.zzd(sb5.toString());
                                    ((zzhn) this.zzc).zza.zzo(zzgzVar.zzb());
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e13) {
                                            e = e13;
                                            z11 = false;
                                            String valueOf3 = String.valueOf(zzc);
                                            String simpleName2 = e.getClass().getSimpleName();
                                            StringBuilder sb32 = new StringBuilder(valueOf3.length() + 27 + simpleName2.length());
                                            sb32.append("Exception sending hit to ");
                                            sb32.append(valueOf3);
                                            sb32.append(": ");
                                            sb32.append(simpleName2);
                                            zzhl.zze(sb32.toString());
                                            zzhl.zze(e.getMessage());
                                            this.zzc.zzb(zzgzVar);
                                        }
                                    }
                                    httpURLConnection.disconnect();
                                    z11 = false;
                                } catch (Throwable th3) {
                                    th = th3;
                                    z11 = false;
                                    if (0 != 0) {
                                    }
                                    httpURLConnection.disconnect();
                                    throw th;
                                }
                            }
                            InputStream errorStream = httpURLConnection.getErrorStream();
                            if (errorStream != null) {
                                bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                while (true) {
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine != null) {
                                            sb2.append(readLine);
                                        } else {
                                            String valueOf4 = String.valueOf(sb2.toString());
                                            zzhl.zze(valueOf4.length() != 0 ? "Error Message: ".concat(valueOf4) : new String("Error Message: "));
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                        throw th;
                                    }
                                }
                            } else {
                                bufferedReader = null;
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            this.zzc.zzb(zzgzVar);
                            if (inputStream != null) {
                            }
                            httpURLConnection.disconnect();
                            z11 = false;
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedReader = null;
                        }
                        String valueOf5 = String.valueOf(zzc);
                        StringBuilder sb6 = new StringBuilder(valueOf5.length() + 39);
                        sb6.append("Bad response received for ");
                        sb6.append(valueOf5);
                        sb6.append(": ");
                        sb6.append(responseCode);
                        zzhl.zze(sb6.toString());
                        sb2 = new StringBuilder();
                    } else {
                        zzhl.zze("Unrecongnized HTTP method " + zzd + ". Supported methods are GET, HEAD, PUT and/or POST");
                        this.zzc.zza(zzgzVar);
                    }
                    httpURLConnection.disconnect();
                    z11 = false;
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzgw
    public final boolean zzb() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzb.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzhl.zzd("...no network connectivity");
        return false;
    }
}
