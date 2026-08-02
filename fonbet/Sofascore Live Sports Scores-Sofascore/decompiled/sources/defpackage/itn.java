package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzcku;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzhk;
import com.google.android.gms.internal.ads.zzht;
import com.google.android.gms.internal.ads.zzhw;
import com.google.android.gms.internal.ads.zzih;
import com.google.android.gms.internal.ads.zzij;
import com.google.android.gms.internal.ads.zzik;
import com.google.android.gms.internal.ads.zzil;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class itn extends zzhk implements zzil {
    public static final Pattern t = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference u = new AtomicReference();
    public final htn e;
    public final int f;
    public final int g;
    public final String h;
    public final zzik i;
    public HttpURLConnection j;
    public InputStream k;
    public boolean l;
    public int m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public final HashSet s;

    public itn(String str, zzcku zzckuVar, int i, int i2, int i3) {
        super(true);
        this.e = new htn(this);
        this.s = new HashSet();
        zzguk.a(true ^ TextUtils.isEmpty(str));
        this.h = str;
        this.i = new zzik();
        this.f = i;
        this.g = i2;
        this.r = i3;
        if (zzckuVar != null) {
            c(zzckuVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x028f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0261 A[Catch: IOException -> 0x003d, TryCatch #3 {IOException -> 0x003d, blocks: (B:3:0x000c, B:4:0x001e, B:6:0x0026, B:8:0x0034, B:9:0x0040, B:10:0x0058, B:12:0x005e, B:19:0x0088, B:21:0x00ab, B:22:0x00d1, B:23:0x00d6, B:37:0x010c, B:93:0x0254, B:95:0x0261, B:97:0x0272, B:103:0x027b, B:104:0x0288, B:107:0x028f, B:108:0x0296, B:113:0x0297, B:114:0x02b4), top: B:2:0x000c }] */
    @Override // com.google.android.gms.internal.ads.zzhs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(zzhw zzhwVar) {
        long j;
        int i;
        int responseCode;
        String headerField;
        int responseCode2;
        long parseLong;
        String headerField2;
        long j2 = 0;
        this.q = 0L;
        this.p = 0L;
        try {
            Uri uri = zzhwVar.a;
            long j3 = zzhwVar.d;
            long j4 = zzhwVar.c;
            URL url = new URL(uri.toString());
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                long j5 = j2;
                if (i2 > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i3);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.e);
                }
                httpURLConnection.setConnectTimeout(this.f);
                httpURLConnection.setReadTimeout(this.g);
                for (Map.Entry entry : this.i.a().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int i4 = (j4 > j5 ? 1 : (j4 == j5 ? 0 : -1));
                if (i4 != 0) {
                    j = j4;
                } else if (j3 != -1) {
                    j = j5;
                } else {
                    i = i4;
                    httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.h);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.j = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.m = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                this.j.getHeaderFields();
                                o();
                                int i5 = this.m;
                                String str = zzfm.a;
                                zzij zzijVar = new zzij(i5, null);
                                if (this.m == 416) {
                                    throw zzijVar;
                                }
                                zzijVar.initCause(new zzht());
                                throw zzijVar;
                            }
                            if (responseCode2 != 200 || i == 0) {
                                j4 = j5;
                            }
                            this.n = j4;
                            if (j3 != -1) {
                                this.o = j3;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.j;
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    try {
                                        parseLong = Long.parseLong(headerField3);
                                    } catch (NumberFormatException unused) {
                                        String m = wt3.m("Unexpected Content-Length [", headerField3, new StringBuilder(String.valueOf(headerField3).length() + 28), U3.j.e);
                                        int i6 = zze.zza;
                                        zzo.zzf(m);
                                    }
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                        Matcher matcher = t.matcher(headerField2);
                                        if (matcher.find()) {
                                            try {
                                                long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (parseLong < j5) {
                                                    parseLong = parseLong2;
                                                } else if (parseLong != parseLong2) {
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField2).length() + 1);
                                                    sb2.append("Inconsistent headers [");
                                                    sb2.append(headerField3);
                                                    sb2.append("] [");
                                                    sb2.append(headerField2);
                                                    sb2.append(U3.j.e);
                                                    String sb3 = sb2.toString();
                                                    int i7 = zze.zza;
                                                    zzo.zzi(sb3);
                                                    parseLong = Math.max(parseLong, parseLong2);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                String m2 = wt3.m("Unexpected Content-Range [", headerField2, new StringBuilder(String.valueOf(headerField2).length() + 27), U3.j.e);
                                                int i8 = zze.zza;
                                                zzo.zzf(m2);
                                            }
                                        }
                                    }
                                    this.o = parseLong != -1 ? parseLong - this.n : -1L;
                                }
                                parseLong = -1;
                                headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField2)) {
                                }
                                this.o = parseLong != -1 ? parseLong - this.n : -1L;
                            }
                            try {
                                this.k = this.j.getInputStream();
                                this.l = true;
                                l(zzhwVar);
                                return this.o;
                            } catch (IOException e) {
                                o();
                                throw new zzih(2000, 1, e);
                            }
                        } catch (IOException e2) {
                            o();
                            throw new zzih("Unable to connect to ".concat(String.valueOf(zzhwVar.a.toString())), e2, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i2 = i3;
                    j2 = j5;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 7);
                sb4.append("bytes=");
                long j6 = j;
                sb4.append(j6);
                sb4.append("-");
                String sb5 = sb4.toString();
                if (j3 != -1) {
                    long j7 = (j6 + j3) - 1;
                    i = i4;
                    StringBuilder sb6 = new StringBuilder(sb5.length() + String.valueOf(j7).length());
                    sb6.append(sb5);
                    sb6.append(j7);
                    sb5 = sb6.toString();
                } else {
                    i = i4;
                }
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, sb5);
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.h);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.j = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.m = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    this.j.getHeaderFields();
                    o();
                    int i52 = this.m;
                    String str2 = zzfm.a;
                    zzij zzijVar2 = new zzij(i52, null);
                    if (this.m == 416) {
                    }
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e3) {
            throw new zzih("Unable to connect to ".concat(String.valueOf(zzhwVar.a.toString())), e3, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        try {
            if (this.p != this.n) {
                AtomicReference atomicReference = u;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.p;
                    long j2 = this.n;
                    if (j == j2) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int read = this.k.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.p += read;
                    m(read);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.o;
            if (j3 != -1) {
                long j4 = j3 - this.q;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int read2 = this.k.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.o != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.q += read2;
            m(read2);
            return read2;
        } catch (IOException e) {
            throw new zzih(2000, 2, e);
        }
    }

    public final void o() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                int i = zze.zza;
                zzo.zzg("Unexpected error while disconnecting", e);
            }
            this.j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        HashSet hashSet = this.s;
        try {
            InputStream inputStream = this.k;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzih(2000, 3, e);
                }
            }
        } finally {
            this.k = null;
            o();
            if (this.l) {
                this.l = false;
                n();
            }
            hashSet.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
