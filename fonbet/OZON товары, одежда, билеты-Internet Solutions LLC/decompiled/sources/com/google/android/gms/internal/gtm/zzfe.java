package com.google.android.gms.internal.gtm;

import C.o0;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes9.dex */
final class zzfe extends zzbs {
    private static final byte[] zza = "\n".getBytes();
    private final String zzb;
    private final zzfo zzc;

    zzfe(zzbv zzbvVar) {
        super(zzbvVar);
        String str = zzbt.zza;
        String str2 = Build.VERSION.RELEASE;
        String zzd = zzfs.zzd(Locale.getDefault());
        String str3 = Build.MODEL;
        String str4 = Build.ID;
        StringBuilder d11 = C3660k.d("GoogleAnalytics/", str, " (Linux; U; Android ", str2, "; ");
        a.h(d11, zzd, "; ", str3, " Build/");
        this.zzb = o0.c(d11, str4, ")");
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzg(URL url, byte[] bArr) {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        IOException e11;
        OutputStream outputStream;
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        zzH("POST bytes, url", Integer.valueOf(length), url);
        if (zzbr.zzV()) {
            zzP("Post payload\n", new String(bArr));
        }
        OutputStream outputStream2 = null;
        outputStream2 = null;
        outputStream2 = null;
        HttpURLConnection httpURLConnection2 = null;
        try {
            zzo().getPackageName();
            httpURLConnection = zzb(url);
        } catch (IOException e12) {
            e11 = e12;
            outputStream = null;
        } catch (Throwable th3) {
            th2 = th3;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.connect();
            outputStream2 = httpURLConnection.getOutputStream();
            outputStream2.write(bArr);
            zzk(httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                zzs().zzi();
                responseCode = 200;
            }
            zzG("POST status", Integer.valueOf(responseCode));
            try {
                outputStream2.close();
            } catch (IOException e13) {
                zzK("Error closing http post connection output stream", e13);
            }
            httpURLConnection.disconnect();
            return responseCode;
        } catch (IOException e14) {
            e11 = e14;
            OutputStream outputStream3 = outputStream2;
            httpURLConnection2 = httpURLConnection;
            outputStream = outputStream3;
            try {
                zzS("Network POST connection error", e11);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e15) {
                        zzK("Error closing http post connection output stream", e15);
                    }
                }
                if (httpURLConnection2 == null) {
                    return 0;
                }
                httpURLConnection2.disconnect();
                return 0;
            } catch (Throwable th4) {
                th2 = th4;
                HttpURLConnection httpURLConnection3 = httpURLConnection2;
                outputStream2 = outputStream;
                httpURLConnection = httpURLConnection3;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException e16) {
                        zzK("Error closing http post connection output stream", e16);
                    }
                }
                if (httpURLConnection != null) {
                    throw th2;
                }
                httpURLConnection.disconnect();
                throw th2;
            }
        } catch (Throwable th5) {
            th2 = th5;
            if (outputStream2 != null) {
            }
            if (httpURLConnection != null) {
            }
        }
    }

    private final URL zzh() {
        zzw();
        String zzi = zzct.zzi();
        zzw();
        String zzb = zzeu.zzt.zzb();
        try {
            return new URL(zzb.length() != 0 ? zzi.concat(zzb) : new String(zzi));
        } catch (MalformedURLException e11) {
            zzK("Error trying to parse the hardcoded host url", e11);
            return null;
        }
    }

    private final URL zzi(zzex zzexVar) {
        String str;
        String concat;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            if (zzj.length() != 0) {
                concat = zzi.concat(zzj);
            } else {
                str = new String(zzi);
                concat = str;
            }
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            if (zzj2.length() != 0) {
                concat = zzk.concat(zzj2);
            } else {
                str = new String(zzk);
                concat = str;
            }
        }
        try {
            return new URL(concat);
        } catch (MalformedURLException e11) {
            zzK("Error trying to parse the hardcoded host url", e11);
            return null;
        }
    }

    private final URL zzj(zzex zzexVar, String str) {
        String c11;
        if (zzexVar.zzh()) {
            zzw();
            String zzi = zzct.zzi();
            zzw();
            String zzj = zzct.zzj();
            int length = zzi.length();
            c11 = C3173b.c(new StringBuilder(length + 1 + zzj.length() + str.length()), zzi, zzj, "?", str);
        } else {
            zzw();
            String zzk = zzct.zzk();
            zzw();
            String zzj2 = zzct.zzj();
            int length2 = zzk.length();
            c11 = C3173b.c(new StringBuilder(length2 + 1 + zzj2.length() + str.length()), zzk, zzj2, "?", str);
        }
        try {
            return new URL(c11);
        } catch (MalformedURLException e11) {
            zzK("Error trying to parse the hardcoded host url", e11);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0015, code lost:
    
        zzK("Error closing http connection input stream", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0018, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzk(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                do {
                } while (inputStream.read(new byte[UserVerificationMethods.USER_VERIFY_ALL]) > 0);
                inputStream.close();
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        zzK("Error closing http connection input stream", e11);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    private static final void zzl(StringBuilder sb2, String str, String str2) throws UnsupportedEncodingException {
        if (sb2.length() != 0) {
            sb2.append('&');
        }
        sb2.append(URLEncoder.encode(str, "UTF-8"));
        sb2.append('=');
        sb2.append(URLEncoder.encode(str2, "UTF-8"));
    }

    @VisibleForTesting
    final String zza(zzex zzexVar, boolean z11) {
        Preconditions.checkNotNull(zzexVar);
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : zzexVar.zzg().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key) && !"z".equals(key) && !"_gmsv".equals(key)) {
                    zzl(sb2, key, entry.getValue());
                }
            }
            zzl(sb2, "ht", String.valueOf(zzexVar.zzd()));
            zzl(sb2, "qt", String.valueOf(zzC().currentTimeMillis() - zzexVar.zzd()));
            zzw();
            if (z11) {
                long zzc = zzexVar.zzc();
                zzl(sb2, "z", zzc != 0 ? String.valueOf(zzc) : String.valueOf(zzexVar.zzb()));
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e11) {
            zzK("Failed to encode name or value", e11);
            return null;
        }
    }

    @VisibleForTesting
    final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDefaultUseCaches(false);
        zzw();
        httpURLConnection.setConnectTimeout(zzeu.zzE.zzb().intValue());
        zzw();
        httpURLConnection.setReadTimeout(zzeu.zzF.zzb().intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", this.zzb);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0328 A[EDGE_INSN: B:116:0x0328->B:117:0x0328 BREAK  A[LOOP:1: B:108:0x0234->B:118:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[LOOP:1: B:108:0x0234->B:118:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Long> zzc(List<zzex> list) {
        boolean z11;
        boolean z12;
        HttpURLConnection httpURLConnection;
        HttpURLConnection zzb;
        int size;
        int zzg;
        Throwable th2;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3;
        OutputStream outputStream2;
        Throwable th3;
        byte[] byteArray;
        int length;
        HttpURLConnection zzb2;
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        Preconditions.checkNotNull(list);
        if (!zzw().zza().isEmpty()) {
            zzfo zzfoVar = this.zzc;
            zzw();
            if (zzfoVar.zzc(zzeu.zzC.zzb().intValue() * 1000)) {
                zzw();
                String zzb3 = zzeu.zzv.zzb();
                z11 = "BATCH_BY_SESSION".equalsIgnoreCase(zzb3) || "BATCH_BY_TIME".equalsIgnoreCase(zzb3) || "BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(zzb3) || "BATCH_BY_COUNT".equalsIgnoreCase(zzb3) || "BATCH_BY_SIZE".equalsIgnoreCase(zzb3);
                zzw();
                if (true == "GZIP".equalsIgnoreCase(zzeu.zzw.zzb())) {
                    z12 = true;
                    if (!z11) {
                        ArrayList arrayList = new ArrayList(list.size());
                        for (zzex zzexVar : list) {
                            Preconditions.checkNotNull(zzexVar);
                            String zza2 = zza(zzexVar, !zzexVar.zzh());
                            if (zza2 != null) {
                                int length2 = zza2.length();
                                zzw();
                                if (length2 > zzeu.zzu.zzb().intValue()) {
                                    String zza3 = zza(zzexVar, false);
                                    if (zza3 != null) {
                                        byte[] bytes = zza3.getBytes();
                                        int length3 = bytes.length;
                                        zzw();
                                        if (length3 <= zzeu.zzz.zzb().intValue()) {
                                            URL zzi = zzi(zzexVar);
                                            if (zzi == null) {
                                                zzJ("Failed to build collect POST endpoint url");
                                                return arrayList;
                                            }
                                            if (zzg(zzi, bytes) != 200) {
                                                break;
                                            }
                                        } else {
                                            zzz().zzb(zzexVar, "Hit payload exceeds size limit");
                                        }
                                    } else {
                                        zzz().zzb(zzexVar, "Error formatting hit for POST upload");
                                    }
                                    arrayList.add(Long.valueOf(zzexVar.zzb()));
                                    size = arrayList.size();
                                    zzw();
                                    if (size < zzct.zzh()) {
                                        break;
                                    }
                                } else {
                                    URL zzj = zzj(zzexVar, zza2);
                                    if (zzj == null) {
                                        zzJ("Failed to build collect GET endpoint url");
                                        return arrayList;
                                    }
                                    Preconditions.checkNotNull(zzj);
                                    zzG("GET request", zzj);
                                    try {
                                        zzb = zzb(zzj);
                                    } catch (IOException e11) {
                                        e = e11;
                                        httpURLConnection = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        httpURLConnection = null;
                                    }
                                    try {
                                        zzb.connect();
                                        zzk(zzb);
                                        int responseCode = zzb.getResponseCode();
                                        if (responseCode == 200) {
                                            zzs().zzi();
                                            responseCode = 200;
                                        }
                                        zzG("GET status", Integer.valueOf(responseCode));
                                        zzb.disconnect();
                                        if (responseCode != 200) {
                                            break;
                                        }
                                    } catch (IOException e12) {
                                        e = e12;
                                        httpURLConnection = zzb;
                                        try {
                                            zzS("Network GET connection error", e);
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                            return arrayList;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        httpURLConnection = zzb;
                                        if (httpURLConnection != null) {
                                        }
                                        throw th;
                                    }
                                }
                            } else {
                                zzz().zzb(zzexVar, "Error formatting hit for upload");
                            }
                            arrayList.add(Long.valueOf(zzexVar.zzb()));
                            size = arrayList.size();
                            zzw();
                            if (size < zzct.zzh()) {
                            }
                        }
                        return arrayList;
                    }
                    Preconditions.checkArgument(!list.isEmpty());
                    zzQ("Uploading batched hits. compression, count", Boolean.valueOf(z12), Integer.valueOf(list.size()));
                    zzfd zzfdVar = new zzfd(this);
                    ArrayList arrayList2 = new ArrayList();
                    for (zzex zzexVar2 : list) {
                        if (!zzfdVar.zzb(zzexVar2)) {
                            break;
                        }
                        arrayList2.add(Long.valueOf(zzexVar2.zzb()));
                    }
                    if (zzfdVar.zza() == 0) {
                        return arrayList2;
                    }
                    URL zzh = zzh();
                    if (zzh == null) {
                        zzJ("Failed to build batching endpoint url");
                        return Collections.EMPTY_LIST;
                    }
                    if (z12) {
                        byte[] zzc = zzfdVar.zzc();
                        Preconditions.checkNotNull(zzh);
                        Preconditions.checkNotNull(zzc);
                        try {
                            zzo().getPackageName();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(zzc);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            length = byteArray.length;
                            Integer valueOf = Integer.valueOf(length);
                            int length4 = zzc.length;
                            zzI("POST compressed size, ratio %, url", valueOf, Long.valueOf((length * 100) / length4), zzh);
                            if (length > length4) {
                                zzT("Compressed payload is larger then uncompressed. compressed, uncompressed", valueOf, Integer.valueOf(length4));
                            }
                            if (zzbr.zzV()) {
                                String str = new String(zzc);
                                zzP("Post payload", str.length() != 0 ? "\n".concat(str) : new String("\n"));
                            }
                            zzb2 = zzb(zzh);
                        } catch (IOException e13) {
                            e = e13;
                            httpURLConnection3 = null;
                        } catch (Throwable th7) {
                            th2 = th7;
                            outputStream = null;
                            httpURLConnection2 = null;
                            if (outputStream != null) {
                            }
                            if (httpURLConnection2 == null) {
                            }
                        }
                        try {
                            zzb2.setDoOutput(true);
                            zzb2.addRequestProperty("Content-Encoding", "gzip");
                            zzb2.setFixedLengthStreamingMode(length);
                            zzb2.connect();
                            OutputStream outputStream3 = zzb2.getOutputStream();
                            try {
                                outputStream3.write(byteArray);
                                outputStream3.close();
                                zzk(zzb2);
                                int responseCode2 = zzb2.getResponseCode();
                                if (responseCode2 == 200) {
                                    zzs().zzi();
                                    responseCode2 = 200;
                                }
                                zzG("POST status", Integer.valueOf(responseCode2));
                                zzb2.disconnect();
                                zzg = responseCode2;
                            } catch (IOException e14) {
                                e = e14;
                                httpURLConnection3 = zzb2;
                                outputStream2 = outputStream3;
                                try {
                                    zzS("Network compressed POST connection error", e);
                                    if (outputStream2 != null) {
                                        try {
                                            outputStream2.close();
                                        } catch (IOException e15) {
                                            zzK("Error closing http compressed post connection output stream", e15);
                                        }
                                    }
                                    if (httpURLConnection3 != null) {
                                        httpURLConnection3.disconnect();
                                    }
                                    zzg = 0;
                                    if (zzg == 200) {
                                    }
                                } catch (Throwable th8) {
                                    th3 = th8;
                                    OutputStream outputStream4 = outputStream2;
                                    httpURLConnection2 = httpURLConnection3;
                                    outputStream = outputStream4;
                                    th2 = th3;
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (IOException e16) {
                                            zzK("Error closing http compressed post connection output stream", e16);
                                        }
                                    }
                                    if (httpURLConnection2 == null) {
                                        throw th2;
                                    }
                                    httpURLConnection2.disconnect();
                                    throw th2;
                                }
                            } catch (Throwable th9) {
                                th3 = th9;
                                httpURLConnection2 = zzb2;
                                outputStream = outputStream3;
                                th2 = th3;
                                if (outputStream != null) {
                                }
                                if (httpURLConnection2 == null) {
                                }
                            }
                        } catch (IOException e17) {
                            e = e17;
                            httpURLConnection3 = zzb2;
                            outputStream2 = null;
                            zzS("Network compressed POST connection error", e);
                            if (outputStream2 != null) {
                            }
                            if (httpURLConnection3 != null) {
                            }
                            zzg = 0;
                            if (zzg == 200) {
                            }
                        } catch (Throwable th10) {
                            th3 = th10;
                            httpURLConnection2 = zzb2;
                            outputStream = null;
                        }
                    } else {
                        zzg = zzg(zzh, zzfdVar.zzc());
                    }
                    if (zzg == 200) {
                        zzP("Batched upload completed. Hits batched", Integer.valueOf(zzfdVar.zza()));
                        return arrayList2;
                    }
                    Integer valueOf2 = Integer.valueOf(zzg);
                    zzP("Network error uploading hits. status code", valueOf2);
                    if (zzw().zza().contains(valueOf2)) {
                        zzR("Server instructed the client to stop batching");
                        this.zzc.zzb();
                    }
                    return Collections.EMPTY_LIST;
                }
                z12 = false;
                if (!z11) {
                }
            }
        }
        z11 = false;
        z12 = false;
        if (!z11) {
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        zzP("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo networkInfo;
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        try {
            networkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        zzO("No network connectivity");
        return false;
    }
}
