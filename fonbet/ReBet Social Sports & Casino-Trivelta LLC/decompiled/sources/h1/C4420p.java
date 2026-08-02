package h1;

import android.net.Uri;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.common.collect.AbstractC3439t;
import com.google.common.collect.g0;
import com.twilio.voice.AudioFormat;
import e1.AbstractC4156x;
import e1.Z;
import h1.C4420p;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import zendesk.core.Constants;

/* renamed from: h1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4420p extends AbstractC4406b implements InterfaceC4411g {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f47587e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f47588f;

    /* renamed from: g, reason: collision with root package name */
    public final int f47589g;

    /* renamed from: h, reason: collision with root package name */
    public final int f47590h;

    /* renamed from: i, reason: collision with root package name */
    public final String f47591i;

    /* renamed from: j, reason: collision with root package name */
    public final C4429y f47592j;

    /* renamed from: k, reason: collision with root package name */
    public final C4429y f47593k;

    /* renamed from: l, reason: collision with root package name */
    public final Ra.o f47594l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f47595m;

    /* renamed from: n, reason: collision with root package name */
    public C4418n f47596n;

    /* renamed from: o, reason: collision with root package name */
    public HttpURLConnection f47597o;

    /* renamed from: p, reason: collision with root package name */
    public InputStream f47598p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f47599q;

    /* renamed from: r, reason: collision with root package name */
    public int f47600r;

    /* renamed from: s, reason: collision with root package name */
    public long f47601s;

    /* renamed from: t, reason: collision with root package name */
    public long f47602t;

    /* renamed from: h1.p$b */
    public static final class b implements InterfaceC4425u {

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC4403F f47604b;

        /* renamed from: c, reason: collision with root package name */
        public Ra.o f47605c;

        /* renamed from: d, reason: collision with root package name */
        public String f47606d;

        /* renamed from: g, reason: collision with root package name */
        public boolean f47609g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f47610h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f47611i;

        /* renamed from: a, reason: collision with root package name */
        public final C4429y f47603a = new C4429y();

        /* renamed from: e, reason: collision with root package name */
        public int f47607e = AudioFormat.AUDIO_SAMPLE_RATE_8000;

        /* renamed from: f, reason: collision with root package name */
        public int f47608f = AudioFormat.AUDIO_SAMPLE_RATE_8000;

        @Override // h1.InterfaceC4411g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4420p a() {
            C4420p c4420p = new C4420p(this.f47606d, this.f47607e, this.f47608f, this.f47609g, this.f47610h, this.f47603a, this.f47605c, this.f47611i);
            InterfaceC4403F interfaceC4403F = this.f47604b;
            if (interfaceC4403F != null) {
                c4420p.c(interfaceC4403F);
            }
            return c4420p;
        }

        public b c(boolean z10) {
            this.f47609g = z10;
            return this;
        }

        public b d(int i10) {
            this.f47607e = i10;
            return this;
        }

        public b e(int i10) {
            this.f47608f = i10;
            return this;
        }

        public b f(String str) {
            this.f47606d = str;
            return this;
        }
    }

    /* renamed from: h1.p$c */
    public static class c extends AbstractC3439t {

        /* renamed from: a, reason: collision with root package name */
        public final Map f47612a;

        public c(Map map) {
            this.f47612a = map;
        }

        public static /* synthetic */ boolean f(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean g(String str) {
            return str != null;
        }

        @Override // com.google.common.collect.AbstractC3440u
        public Map b() {
            return this.f47612a;
        }

        @Override // com.google.common.collect.AbstractC3439t, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.c(obj);
        }

        @Override // com.google.common.collect.AbstractC3439t, java.util.Map
        public Set entrySet() {
            return g0.b(super.entrySet(), new Ra.o() { // from class: h1.q
                @Override // Ra.o
                public final boolean apply(Object obj) {
                    return C4420p.c.f((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.d(obj);
        }

        @Override // com.google.common.collect.AbstractC3439t, java.util.Map
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.e();
        }

        @Override // com.google.common.collect.AbstractC3439t, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // com.google.common.collect.AbstractC3439t, java.util.Map
        public Set keySet() {
            return g0.b(super.keySet(), new Ra.o() { // from class: h1.r
                @Override // Ra.o
                public final boolean apply(Object obj) {
                    return C4420p.c.g((String) obj);
                }
            });
        }

        @Override // com.google.common.collect.AbstractC3439t, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public static boolean u(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        byte[] bArr;
        this.f47596n = c4418n;
        long j10 = 0;
        this.f47602t = 0L;
        this.f47601s = 0L;
        q(c4418n);
        try {
            HttpURLConnection v10 = v(c4418n);
            this.f47597o = v10;
            this.f47600r = v10.getResponseCode();
            String responseMessage = v10.getResponseMessage();
            int i10 = this.f47600r;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = v10.getHeaderFields();
                if (this.f47600r == 416) {
                    if (c4418n.f47559f == AbstractC4430z.c(v10.getHeaderField("Content-Range"))) {
                        this.f47599q = true;
                        r(c4418n);
                        long j11 = c4418n.f47560g;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = v10.getErrorStream();
                try {
                    bArr = errorStream != null ? Sa.a.d(errorStream) : Z.EMPTY_BYTE_ARRAY;
                } catch (IOException unused) {
                    bArr = Z.EMPTY_BYTE_ARRAY;
                }
                byte[] bArr2 = bArr;
                s();
                throw new C4428x(this.f47600r, responseMessage, this.f47600r == 416 ? new C4415k(2008) : null, headerFields, c4418n, bArr2);
            }
            String contentType = v10.getContentType();
            Ra.o oVar = this.f47594l;
            if (oVar != null && !oVar.apply(contentType)) {
                s();
                throw new C4427w(contentType, c4418n);
            }
            if (this.f47600r == 200) {
                long j12 = c4418n.f47559f;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean u10 = u(v10);
            if (u10) {
                this.f47601s = c4418n.f47560g;
            } else {
                long j13 = c4418n.f47560g;
                if (j13 != -1) {
                    this.f47601s = j13;
                } else {
                    long b10 = AbstractC4430z.b(v10.getHeaderField("Content-Length"), v10.getHeaderField("Content-Range"));
                    this.f47601s = b10 != -1 ? b10 - j10 : -1L;
                }
            }
            try {
                this.f47598p = v10.getInputStream();
                if (u10) {
                    this.f47598p = new GZIPInputStream(this.f47598p);
                }
                this.f47599q = true;
                r(c4418n);
                try {
                    z(j10, c4418n);
                    return this.f47601s;
                } catch (IOException e10) {
                    s();
                    if (e10 instanceof C4426v) {
                        throw ((C4426v) e10);
                    }
                    throw new C4426v(e10, c4418n, 2000, 1);
                }
            } catch (IOException e11) {
                s();
                throw new C4426v(e11, c4418n, 2000, 1);
            }
        } catch (IOException e12) {
            s();
            throw C4426v.c(e12, c4418n, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h1.InterfaceC4411g
    public void close() {
        try {
            InputStream inputStream = this.f47598p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new C4426v(e10, (C4418n) Z.i(this.f47596n), 2000, 3);
                }
            }
        } finally {
            this.f47598p = null;
            s();
            if (this.f47599q) {
                this.f47599q = false;
                p();
            }
            this.f47597o = null;
            this.f47596n = null;
        }
    }

    @Override // h1.InterfaceC4411g
    public Map f() {
        HttpURLConnection httpURLConnection = this.f47597o;
        return httpURLConnection == null ? com.google.common.collect.B.m() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f47597o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C4418n c4418n = this.f47596n;
        if (c4418n != null) {
            return c4418n.f47554a;
        }
        return null;
    }

    @Override // b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return y(bArr, i10, i11);
        } catch (IOException e10) {
            throw C4426v.c(e10, (C4418n) Z.i(this.f47596n), 2);
        }
    }

    public final void s() {
        HttpURLConnection httpURLConnection = this.f47597o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                AbstractC4156x.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    public final URL t(URL url, String str, C4418n c4418n) {
        if (str == null) {
            throw new C4426v("Null location redirect", c4418n, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C4426v("Unsupported protocol redirect: " + protocol, c4418n, 2001, 1);
            }
            if (this.f47587e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f47588f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e10) {
                    throw new C4426v(e10, c4418n, 2001, 1);
                }
            }
            throw new C4426v("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c4418n, 2001, 1);
        } catch (MalformedURLException e11) {
            throw new C4426v(e11, c4418n, 2001, 1);
        }
    }

    public final HttpURLConnection v(C4418n c4418n) {
        HttpURLConnection w10;
        URL url = new URL(c4418n.f47554a.toString());
        int i10 = c4418n.f47556c;
        byte[] bArr = c4418n.httpBody;
        long j10 = c4418n.f47559f;
        long j11 = c4418n.f47560g;
        int i11 = 1;
        boolean d10 = c4418n.d(1);
        if (!this.f47587e && !this.f47588f && !this.f47595m) {
            return w(url, i10, bArr, j10, j11, d10, true, c4418n.f47557d);
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new C4426v(new NoRouteToHostException("Too many redirects: " + i13), c4418n, 2001, 1);
            }
            w10 = w(url, i10, bArr, j10, j11, d10, false, c4418n.f47557d);
            int responseCode = w10.getResponseCode();
            String headerField = w10.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                w10.disconnect();
                url = t(url, headerField, c4418n);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                w10.disconnect();
                if (!this.f47595m || responseCode != 302) {
                    bArr = null;
                    i10 = 1;
                }
                url = t(url, headerField, c4418n);
            }
            i12 = i13;
            i11 = 1;
        }
        return w10;
    }

    public final HttpURLConnection w(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) {
        HttpURLConnection x10 = x(url);
        x10.setConnectTimeout(this.f47589g);
        x10.setReadTimeout(this.f47590h);
        HashMap hashMap = new HashMap();
        C4429y c4429y = this.f47592j;
        if (c4429y != null) {
            hashMap.putAll(c4429y.b());
        }
        hashMap.putAll(this.f47593k.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            x10.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a10 = AbstractC4430z.a(j10, j11);
        if (a10 != null) {
            x10.setRequestProperty("Range", a10);
        }
        String str = this.f47591i;
        if (str != null) {
            x10.setRequestProperty(Constants.USER_AGENT_HEADER_KEY, str);
        }
        x10.setRequestProperty("Accept-Encoding", z10 ? "gzip" : InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
        x10.setInstanceFollowRedirects(z11);
        x10.setDoOutput(bArr != null);
        x10.setRequestMethod(C4418n.c(i10));
        if (bArr == null) {
            x10.connect();
            return x10;
        }
        x10.setFixedLengthStreamingMode(bArr.length);
        x10.connect();
        OutputStream outputStream = x10.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return x10;
    }

    public HttpURLConnection x(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final int y(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f47601s;
        if (j10 != -1) {
            long j11 = j10 - this.f47602t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) Z.i(this.f47598p)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f47602t += read;
        o(read);
        return read;
    }

    public final void z(long j10, C4418n c4418n) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int read = ((InputStream) Z.i(this.f47598p)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new C4426v(new InterruptedIOException(), c4418n, 2000, 1);
            }
            if (read == -1) {
                throw new C4426v(c4418n, 2008, 1);
            }
            j10 -= read;
            o(read);
        }
    }

    public C4420p(String str, int i10, int i11, boolean z10, boolean z11, C4429y c4429y, Ra.o oVar, boolean z12) {
        super(true);
        this.f47591i = str;
        this.f47589g = i10;
        this.f47590h = i11;
        this.f47587e = z10;
        this.f47588f = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f47592j = c4429y;
        this.f47594l = oVar;
        this.f47593k = new C4429y();
        this.f47595m = z12;
    }
}
