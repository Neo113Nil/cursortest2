package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.C4094gc;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.fn0;
import defpackage.ljg;
import defpackage.mz1;
import defpackage.njo;
import defpackage.uoo;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzid extends zzhk implements zzil {
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final zzik i;
    public final zzik j;
    public zzhw k;
    public HttpURLConnection l;
    public InputStream m;
    public boolean n;
    public int o;
    public long p;
    public long q;

    public /* synthetic */ zzid(String str, int i, int i2, boolean z, zzik zzikVar) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.i = zzikVar;
        this.j = new zzik();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c4 A[Catch: IOException -> 0x01ce, TRY_LEAVE, TryCatch #7 {IOException -> 0x01ce, blocks: (B:27:0x01bc, B:29:0x01c4), top: B:26:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    @Override // com.google.android.gms.internal.ads.zzhs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(zzhw zzhwVar) {
        zzid zzidVar;
        HttpURLConnection httpURLConnection;
        long j;
        long parseLong;
        long j2;
        String group;
        zzid zzidVar2 = this;
        zzidVar2.k = zzhwVar;
        zzidVar2.q = 0L;
        zzidVar2.p = 0L;
        k(zzhwVar);
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            Uri uri = zzhwVar.a;
            long j3 = zzhwVar.d;
            long j4 = zzhwVar.c;
            URL url = new URL(uri.toString());
            long j5 = zzhwVar.c;
            long j6 = zzhwVar.d;
            long j7 = j4;
            boolean z = false;
            try {
                if (zzidVar2.e) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (i > 20) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
                            sb.append("Too many redirects: ");
                            sb.append(i2);
                            throw new zzih(2001, 1, new NoRouteToHostException(sb.toString()));
                        }
                        zzidVar = this;
                        HttpURLConnection o = zzidVar.o(url, j5, j6, z, false, zzhwVar.b);
                        int responseCode = o.getResponseCode();
                        String headerField = o.getHeaderField("Location");
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            httpURLConnection = o;
                            break;
                        }
                        o.disconnect();
                        url = zzidVar.p(url, headerField);
                        i = i2;
                        z = false;
                    }
                } else {
                    httpURLConnection = zzidVar2.o(url, j5, j6, false, true, zzhwVar.b);
                    zzidVar = this;
                }
                zzidVar.l = httpURLConnection;
                zzidVar.o = httpURLConnection.getResponseCode();
                httpURLConnection.getResponseMessage();
                int i3 = zzidVar.o;
                if (i3 < 200 || i3 > 299) {
                    httpURLConnection.getHeaderFields();
                    if (zzidVar.o == 416) {
                        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
                        Pattern pattern = zzim.a;
                        if (!TextUtils.isEmpty(headerField2)) {
                            Matcher matcher = zzim.b.matcher(headerField2);
                            if (matcher.matches()) {
                                String group2 = matcher.group(1);
                                group2.getClass();
                                j = Long.parseLong(group2);
                                if (j7 == j) {
                                    zzidVar.n = true;
                                    l(zzhwVar);
                                    if (j3 != -1) {
                                        return j3;
                                    }
                                    return 0L;
                                }
                            }
                        }
                        j = -1;
                        if (j7 == j) {
                        }
                    }
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    try {
                        if (errorStream != null) {
                            zzham.a(errorStream);
                        } else {
                            String str = zzfm.a;
                        }
                    } catch (IOException unused) {
                        String str2 = zzfm.a;
                    }
                    zzidVar.q();
                    throw new zzij(zzidVar.o, zzidVar.o == 416 ? new zzht() : null);
                }
                httpURLConnection.getContentType();
                if (zzidVar.o != 200 || j7 == 0) {
                    j7 = 0;
                }
                boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
                if (equalsIgnoreCase) {
                    zzidVar.p = j3;
                } else if (j3 != -1) {
                    zzidVar.p = j3;
                } else {
                    String headerField3 = httpURLConnection.getHeaderField("Content-Length");
                    String headerField4 = httpURLConnection.getHeaderField("Content-Range");
                    Pattern pattern2 = zzim.a;
                    if (!TextUtils.isEmpty(headerField3)) {
                        try {
                            parseLong = Long.parseLong(headerField3);
                        } catch (NumberFormatException unused2) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 28);
                            sb2.append("Unexpected Content-Length [");
                            sb2.append(headerField3);
                            sb2.append(U3.j.e);
                            zzeh.e(sb2.toString());
                        }
                        if (!TextUtils.isEmpty(headerField4)) {
                            Matcher matcher2 = zzim.a.matcher(headerField4);
                            if (matcher2.matches()) {
                                try {
                                    group = matcher2.group(2);
                                    try {
                                    } catch (NumberFormatException unused3) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(headerField4).length() + 27);
                                        sb3.append("Unexpected Content-Range [");
                                        sb3.append(headerField4);
                                        sb3.append(U3.j.e);
                                        zzeh.e(sb3.toString());
                                        zzidVar.p = parseLong == j2 ? parseLong - j7 : j2;
                                        zzidVar.m = httpURLConnection.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        zzidVar.n = true;
                                        l(zzhwVar);
                                        if (j7 != 0) {
                                        }
                                        return zzidVar.p;
                                    }
                                } catch (NumberFormatException unused4) {
                                    j2 = -1;
                                }
                                if (group == null) {
                                    throw null;
                                }
                                long parseLong2 = Long.parseLong(group);
                                String group3 = matcher2.group(1);
                                if (group3 == null) {
                                    throw null;
                                }
                                j2 = -1;
                                long parseLong3 = (parseLong2 - Long.parseLong(group3)) + 1;
                                if (parseLong < 0) {
                                    parseLong = parseLong3;
                                } else if (parseLong != parseLong3) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField4).length() + 1);
                                    sb4.append("Inconsistent headers [");
                                    sb4.append(headerField3);
                                    sb4.append("] [");
                                    sb4.append(headerField4);
                                    sb4.append(U3.j.e);
                                    zzeh.c(sb4.toString());
                                    parseLong = Math.max(parseLong, parseLong3);
                                }
                                zzidVar.p = parseLong == j2 ? parseLong - j7 : j2;
                            }
                        }
                        j2 = -1;
                        zzidVar.p = parseLong == j2 ? parseLong - j7 : j2;
                    }
                    parseLong = -1;
                    if (!TextUtils.isEmpty(headerField4)) {
                    }
                    j2 = -1;
                    zzidVar.p = parseLong == j2 ? parseLong - j7 : j2;
                }
                try {
                    zzidVar.m = httpURLConnection.getInputStream();
                    if (equalsIgnoreCase) {
                        zzidVar.m = new GZIPInputStream(zzidVar.m);
                    }
                    zzidVar.n = true;
                    l(zzhwVar);
                    if (j7 != 0) {
                        try {
                            byte[] bArr = new byte[4096];
                            long j8 = j7;
                            while (j8 > 0) {
                                int min = (int) Math.min(j8, 4096L);
                                InputStream inputStream = zzidVar.m;
                                String str3 = zzfm.a;
                                int read = inputStream.read(bArr, 0, min);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzih(2000, 1, new InterruptedIOException());
                                }
                                if (read == -1) {
                                    throw new zzih();
                                }
                                j8 -= read;
                                zzidVar.m(read);
                            }
                        } catch (IOException e) {
                            zzidVar.q();
                            if (e instanceof zzih) {
                                throw ((zzih) e);
                            }
                            throw new zzih(2000, 1, e);
                        }
                    }
                    return zzidVar.p;
                } catch (IOException e2) {
                    zzidVar.q();
                    throw new zzih(2000, 1, e2);
                }
            } catch (IOException e3) {
                e = e3;
                zzidVar2 = this;
                zzidVar2.q();
                throw zzih.a(1, e);
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.p;
            if (j != -1) {
                long j2 = j - this.q;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.m;
            String str = zzfm.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.q += read;
                m(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = zzfm.a;
            throw zzih.a(2, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection o(URL url, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.g);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.i.a());
        hashMap.putAll(this.j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0) {
            if (j2 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, sb);
                }
                str = this.h;
                if (str != null) {
                    httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str);
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", true == z ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z2);
                httpURLConnection.setDoOutput(false);
                int i = zzhw.f;
                httpURLConnection.setRequestMethod(C4094gc.a);
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j = 0;
        }
        StringBuilder o = ljg.o("bytes=", j, "-");
        if (j2 != -1) {
            o.append((j + j2) - 1);
        }
        sb = o.toString();
        if (sb != null) {
        }
        str = this.h;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true == z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i2 = zzhw.f;
        httpURLConnection.setRequestMethod(C4094gc.a);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final URL p(URL url, String str) {
        if (str == null) {
            throw new zzih("Null location redirect", 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new zzih("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), 2001, 1);
            }
            if (this.e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(mz1.d(fn0.c(40, protocol2), 1, protocol));
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzih(sb.toString(), 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzih(2001, 1, e);
        }
    }

    public final void q() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzeh.f("Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzhw zzhwVar = this.k;
        if (zzhwVar != null) {
            return zzhwVar.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        try {
            InputStream inputStream = this.m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = zzfm.a;
                    throw new zzih(2000, 3, e);
                }
            }
        } finally {
            this.m = null;
            q();
            if (this.n) {
                this.n = false;
                n();
            }
            this.l = null;
            this.k = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.l;
        return httpURLConnection == null ? njo.g : new uoo(httpURLConnection.getHeaderFields());
    }
}
