package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzcku;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzhk;
import com.google.android.gms.internal.ads.zzhw;
import com.google.android.gms.internal.ads.zzih;
import com.google.android.gms.internal.ads.zzik;
import com.google.android.gms.internal.ads.zzil;
import com.ironsource.C4094gc;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.Command;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mtn extends zzhk implements zzil {
    public static final Pattern v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final int e;
    public final int f;
    public final String g;
    public final zzik h;
    public zzhw i;
    public HttpURLConnection j;
    public final ArrayDeque k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public final long t;
    public final long u;

    public mtn(String str, zzcku zzckuVar, int i, int i2, long j, long j2) {
        super(true);
        zzguk.a(true ^ TextUtils.isEmpty(str));
        this.g = str;
        this.h = new zzik();
        this.e = i;
        this.f = i2;
        this.k = new ArrayDeque();
        this.t = j;
        this.u = j2;
        if (zzckuVar != null) {
            c(zzckuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long a(zzhw zzhwVar) {
        this.i = zzhwVar;
        this.p = 0L;
        long j = zzhwVar.c;
        long j2 = zzhwVar.d;
        long j3 = this.t;
        if (j2 != -1) {
            j3 = Math.min(j3, j2);
        }
        this.q = j;
        HttpURLConnection o = o(1, j, (j3 + j) - 1);
        this.j = o;
        String headerField = o.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    if (j2 != -1) {
                        this.o = j2;
                        this.r = Math.max(parseLong, (this.q + j2) - 1);
                    } else {
                        this.o = parseLong2 - this.q;
                        this.r = parseLong2 - 1;
                    }
                    this.s = parseLong;
                    this.m = true;
                    l(zzhwVar);
                    return this.o;
                } catch (NumberFormatException unused) {
                    String m = wt3.m("Unexpected Content-Range [", headerField, new StringBuilder(String.valueOf(headerField).length() + 27), U3.j.e);
                    int i = zze.zza;
                    zzo.zzf(m);
                }
            }
        }
        throw new ltn("Invalid content range: ".concat(String.valueOf(headerField)), 2000, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.o;
            long j2 = this.p;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.q + j2;
            long j4 = i2;
            long j5 = j3 + j4 + this.u;
            long j6 = this.s;
            long j7 = j6 + 1;
            if (j5 > j7) {
                long j8 = this.r;
                if (j6 < j8) {
                    long min = Math.min(j8, Math.max(((this.t + j7) - r4) - 1, (-1) + j7 + j4));
                    o(2, j7, min);
                    this.s = min;
                    j6 = min;
                }
            }
            int read = this.l.read(bArr, i, (int) Math.min(j4, ((j6 + 1) - this.q) - this.p));
            if (read == -1) {
                throw new EOFException();
            }
            this.p += read;
            m(read);
            return read;
        } catch (IOException e) {
            throw new zzih(2000, 2, e);
        }
    }

    public final HttpURLConnection o(int i, long j, long j2) {
        String uri = this.i.a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.e);
            httpURLConnection.setReadTimeout(this.f);
            for (Map.Entry entry : this.h.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 7 + String.valueOf(j2).length());
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            sb.append(j2);
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, sb.toString());
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod(C4094gc.a);
            httpURLConnection.connect();
            this.k.add(httpURLConnection);
            String uri2 = this.i.a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    p();
                    int i2 = this.n;
                    throw new ltn(me4.g(i2, "Response code: ", new StringBuilder(String.valueOf(i2).length() + 15)), 2000, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.l != null) {
                        inputStream = new SequenceInputStream(this.l, inputStream);
                    }
                    this.l = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    p();
                    throw new zzih(2000, i, e);
                }
            } catch (IOException e2) {
                p();
                throw new zzih("Unable to connect to ".concat(String.valueOf(uri2)), e2, 2000, i);
            }
        } catch (IOException e3) {
            throw new zzih("Unable to connect to ".concat(String.valueOf(uri)), e3, 2000, i);
        }
    }

    public final void p() {
        while (true) {
            ArrayDeque arrayDeque = this.k;
            if (arrayDeque.isEmpty()) {
                this.j = null;
                return;
            }
            try {
                ((HttpURLConnection) arrayDeque.remove()).disconnect();
            } catch (Exception e) {
                int i = zze.zza;
                zzo.zzg("Unexpected error while disconnecting", e);
            }
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
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzih(2000, 3, e);
                }
            }
        } finally {
            this.l = null;
            p();
            if (this.m) {
                this.m = false;
                n();
            }
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
