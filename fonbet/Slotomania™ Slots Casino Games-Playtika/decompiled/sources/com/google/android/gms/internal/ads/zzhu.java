package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.net.HttpHeaders;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzhu extends zzhb implements zzic {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzib zze;
    private final zzib zzf;
    private zzhn zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzhu(String str, int i, int i2, boolean z, boolean z2, zzib zzibVar, zzgsx zzgsxVar, boolean z3, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i2;
        this.zza = z;
        this.zze = zzibVar;
        this.zzf = new zzib();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpURLConnection zzk(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zze.zza());
        hashMap.putAll(this.zzf.zza());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0) {
            if (j2 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty(HttpHeaders.RANGE, sb);
                }
                str = this.zzd;
                if (str != null) {
                    httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str);
                }
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true == z ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z2);
                httpURLConnection.setDoOutput(false);
                int i2 = zzhn.zzh;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j = 0;
        }
        StringBuilder sb2 = new StringBuilder("bytes=");
        sb2.append(j);
        sb2.append("-");
        if (j2 != -1) {
            sb2.append((j + j2) - 1);
        }
        sb = sb2.toString();
        if (sb != null) {
        }
        str = this.zzd;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true == z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i22 = zzhn.zzh;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzhn zzhnVar) throws zzhy {
        if (str == null) {
            throw new zzhy("Null location redirect", zzhnVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                String.valueOf(protocol);
                throw new zzhy("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhnVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 40 + String.valueOf(protocol).length() + 1);
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzhy(sb.toString(), zzhnVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzhy(e, zzhnVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e) {
                zzef.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws zzhy {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            if (j != -1) {
                long j2 = j - this.zzm;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.zzi;
            String str = zzfk.zza;
            InputStream inputStream2 = inputStream;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzm += read;
            zzh(read);
            return read;
        } catch (IOException e) {
            zzhn zzhnVar = this.zzg;
            String str2 = zzfk.zza;
            throw zzhy.zza(e, zzhnVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c9, code lost:
    
        if (r0 == r18) goto L44;
     */
    @Override // com.google.android.gms.internal.ads.zzhj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhn zzhnVar) throws zzhy {
        zzhu zzhuVar;
        long j;
        int i;
        HttpURLConnection httpURLConnection;
        byte[] bArr;
        long j2;
        zzhu zzhuVar2 = this;
        zzhuVar2.zzg = zzhnVar;
        long j3 = 0;
        zzhuVar2.zzm = 0L;
        zzhuVar2.zzl = 0L;
        zzf(zzhnVar);
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            URL url = new URL(zzhnVar.zza.toString());
            int i2 = zzhnVar.zzb;
            byte[] bArr2 = zzhnVar.zzc;
            long j4 = zzhnVar.zze;
            long j5 = zzhnVar.zzf;
            boolean zza = zzhnVar.zza(1);
            int i3 = 0;
            try {
                if (zzhuVar2.zza) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i3 + 1;
                        if (i3 > 20) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 20);
                            sb.append("Too many redirects: ");
                            sb.append(i5);
                            throw new zzhy(new NoRouteToHostException(sb.toString()), zzhnVar, 2001, 1);
                        }
                        j = j3;
                        i = i4;
                        zzhuVar2 = this;
                        HttpURLConnection zzk = zzhuVar2.zzk(url, 1, null, j4, j5, zza, false, zzhnVar.zzd);
                        URL url2 = url;
                        long j6 = j5;
                        zzhuVar = zzhuVar2;
                        try {
                            int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(zzk);
                            String headerField = zzk.getHeaderField(HttpHeaders.LOCATION);
                            if (httpUrlConnectionGetResponseCode != 300 && httpUrlConnectionGetResponseCode != 301 && httpUrlConnectionGetResponseCode != 302 && httpUrlConnectionGetResponseCode != 303 && httpUrlConnectionGetResponseCode != 307 && httpUrlConnectionGetResponseCode != 308) {
                                httpURLConnection = zzk;
                                break;
                            }
                            AdMobNetworkBridge.httpUrlConnectionDisconnect(zzk);
                            URL zzl = zzhuVar.zzl(url2, headerField, zzhnVar);
                            j5 = j6;
                            url = zzl;
                            i4 = i;
                            i3 = i5;
                            j3 = j;
                        } catch (IOException e) {
                            e = e;
                            zzhuVar.zzm();
                            throw zzhy.zza(e, zzhnVar, 1);
                        }
                    }
                } else {
                    httpURLConnection = zzhuVar2.zzk(url, 1, null, j4, j5, zza, true, zzhnVar.zzd);
                    zzhuVar = this;
                    j = 0;
                    i = 0;
                }
                zzhuVar.zzh = httpURLConnection;
                zzhuVar.zzk = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                String responseMessage = httpURLConnection.getResponseMessage();
                int i6 = zzhuVar.zzk;
                if (i6 < 200 || i6 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    if (zzhuVar.zzk == 416) {
                        if (zzhnVar.zze == zzid.zza(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                            zzhuVar.zzj = true;
                            zzg(zzhnVar);
                            long j7 = zzhnVar.zzf;
                            return j7 != -1 ? j7 : j;
                        }
                    }
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    try {
                        bArr = errorStream != null ? zzgyz.zza(errorStream) : zzfk.zzb;
                    } catch (IOException unused) {
                        bArr = zzfk.zzb;
                    }
                    zzhuVar.zzm();
                    throw new zzia(zzhuVar.zzk, responseMessage, zzhuVar.zzk == 416 ? new zzhk(2008) : null, headerFields, zzhnVar, bArr);
                }
                httpURLConnection.getContentType();
                if (zzhuVar.zzk == 200) {
                    j2 = zzhnVar.zze;
                }
                j2 = j;
                boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
                if (equalsIgnoreCase) {
                    zzhuVar.zzl = zzhnVar.zzf;
                } else {
                    long j8 = zzhnVar.zzf;
                    if (j8 != -1) {
                        zzhuVar.zzl = j8;
                    } else {
                        long zzb = zzid.zzb(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_LENGTH), httpURLConnection.getHeaderField(HttpHeaders.CONTENT_RANGE));
                        zzhuVar.zzl = zzb != -1 ? zzb - j2 : -1L;
                    }
                }
                try {
                    zzhuVar.zzi = AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                    if (equalsIgnoreCase) {
                        zzhuVar.zzi = new GZIPInputStream(zzhuVar.zzi);
                    }
                    zzhuVar.zzj = true;
                    zzg(zzhnVar);
                    if (j2 != j) {
                        try {
                            byte[] bArr3 = new byte[4096];
                            while (j2 > j) {
                                int min = (int) Math.min(j2, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                                InputStream inputStream = zzhuVar.zzi;
                                String str = zzfk.zza;
                                InputStream inputStream2 = inputStream;
                                int read = inputStream.read(bArr3, i, min);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzhy(new InterruptedIOException(), zzhnVar, 2000, 1);
                                }
                                if (read == -1) {
                                    throw new zzhy(zzhnVar, 2008, 1);
                                }
                                j2 -= read;
                                zzhuVar.zzh(read);
                            }
                        } catch (IOException e2) {
                            zzhuVar.zzm();
                            if (e2 instanceof zzhy) {
                                throw ((zzhy) e2);
                            }
                            throw new zzhy(e2, zzhnVar, 2000, 1);
                        }
                    }
                    return zzhuVar.zzl;
                } catch (IOException e3) {
                    zzhuVar.zzm();
                    throw new zzhy(e3, zzhnVar, 2000, 1);
                }
            } catch (IOException e4) {
                e = e4;
                zzhuVar = this;
            }
        } catch (IOException e5) {
            e = e5;
            zzhuVar = zzhuVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzhn zzhnVar = this.zzg;
        if (zzhnVar != null) {
            return zzhnVar.zza;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzd() throws zzhy {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzhn zzhnVar = this.zzg;
                    String str = zzfk.zza;
                    zzhn zzhnVar2 = zzhnVar;
                    throw new zzhy(e, zzhnVar, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhj, com.google.android.gms.internal.ads.zzic
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgwc.zza() : new zzht(httpURLConnection.getHeaderFields());
    }
}
