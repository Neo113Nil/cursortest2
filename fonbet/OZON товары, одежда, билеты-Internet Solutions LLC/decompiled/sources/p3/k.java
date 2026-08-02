package p3;

import android.net.Uri;
import com.google.common.collect.AbstractC5875t;
import com.google.common.collect.AbstractC5881z;
import com.google.common.collect.b0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import m3.N;

/* loaded from: classes8.dex */
public final class k extends AbstractC8842b {

    /* renamed from: a, reason: collision with root package name */
    private final int f80098a;

    /* renamed from: b, reason: collision with root package name */
    private final int f80099b;

    /* renamed from: c, reason: collision with root package name */
    private final t f80100c;

    /* renamed from: d, reason: collision with root package name */
    private final t f80101d;

    /* renamed from: e, reason: collision with root package name */
    private i f80102e;

    /* renamed from: f, reason: collision with root package name */
    private HttpURLConnection f80103f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f80104g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f80105h;

    /* renamed from: i, reason: collision with root package name */
    private int f80106i;

    /* renamed from: j, reason: collision with root package name */
    private long f80107j;

    /* renamed from: k, reason: collision with root package name */
    private long f80108k;

    /* loaded from: classes.dex */
    public static final class a implements p {

        /* renamed from: a, reason: collision with root package name */
        private final t f80109a = new t();

        /* renamed from: b, reason: collision with root package name */
        private int f80110b = 8000;

        /* renamed from: c, reason: collision with root package name */
        private int f80111c = 8000;

        @Override // p3.InterfaceC8846f.a
        public final InterfaceC8846f createDataSource() {
            return new k(this.f80110b, this.f80111c, this.f80109a);
        }
    }

    private static class b extends AbstractC5875t<String, List<String>> {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, List<String>> f80112a;

        public b(Map<String, List<String>> map) {
            this.f80112a = map;
        }

        @Override // com.google.common.collect.AbstractC5875t, java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC5875t, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return b0.b(super.entrySet(), new l());
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && j(obj);
        }

        @Override // com.google.common.collect.AbstractC5875t, java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.AbstractC5876u
        protected final Object h() {
            return this.f80112a;
        }

        @Override // java.util.Map
        public final int hashCode() {
            return l();
        }

        @Override // com.google.common.collect.AbstractC5875t
        protected final Map<String, List<String>> i() {
            return this.f80112a;
        }

        @Override // com.google.common.collect.AbstractC5875t, java.util.Map
        public final boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // com.google.common.collect.AbstractC5875t, java.util.Map
        public final Set<String> keySet() {
            return b0.b(super.keySet(), new m());
        }

        @Override // com.google.common.collect.AbstractC5875t, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    k(int i11, int i12, t tVar) {
        super(true);
        this.f80098a = i11;
        this.f80099b = i12;
        this.f80100c = tVar;
        this.f80101d = new t();
    }

    private void closeConnectionQuietly() {
        HttpURLConnection httpURLConnection = this.f80103f;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e11) {
                m3.s.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e11);
            }
        }
    }

    private HttpURLConnection i(URL url, int i11, byte[] bArr, long j11, long j12, boolean z11, boolean z12, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f80098a);
        httpURLConnection.setReadTimeout(this.f80099b);
        HashMap hashMap = new HashMap();
        t tVar = this.f80100c;
        if (tVar != null) {
            hashMap.putAll(tVar.a());
        }
        hashMap.putAll(this.f80101d.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a11 = u.a(j11, j12);
        if (a11 != null) {
            httpURLConnection.setRequestProperty("Range", a11);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z11 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z12);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(i.b(i11));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    private void j(long j11) throws IOException {
        if (j11 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j11 > 0) {
            int min = (int) Math.min(j11, 4096);
            InputStream inputStream = this.f80104g;
            int i11 = N.f74289a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new q(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new q(2008);
            }
            j11 -= read;
            bytesTransferred(read);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.InterfaceC8846f
    public final void close() throws q {
        try {
            InputStream inputStream = this.f80104g;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    int i11 = N.f74289a;
                    throw new q(e11, 2000, 3);
                }
            }
        } finally {
            this.f80104g = null;
            closeConnectionQuietly();
            if (this.f80105h) {
                this.f80105h = false;
                transferEnded();
            }
            this.f80103f = null;
            this.f80102e = null;
        }
    }

    @Override // p3.InterfaceC8846f
    public final Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f80103f;
        return httpURLConnection == null ? AbstractC5881z.p() : new b(httpURLConnection.getHeaderFields());
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f80103f;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        i iVar = this.f80102e;
        if (iVar != null) {
            return iVar.f80066a;
        }
        return null;
    }

    @Override // p3.InterfaceC8846f
    public final long open(i iVar) throws q {
        this.f80102e = iVar;
        long j11 = 0;
        this.f80108k = 0L;
        this.f80107j = 0L;
        transferInitializing(iVar);
        try {
            HttpURLConnection i11 = i(new URL(iVar.f80066a.toString()), iVar.f80068c, iVar.f80069d, iVar.f80071f, iVar.f80072g, iVar.c(1), true, iVar.f80070e);
            this.f80103f = i11;
            this.f80106i = i11.getResponseCode();
            i11.getResponseMessage();
            int i12 = this.f80106i;
            long j12 = iVar.f80071f;
            long j13 = iVar.f80072g;
            if (i12 < 200 || i12 > 299) {
                Map<String, List<String>> headerFields = i11.getHeaderFields();
                if (this.f80106i == 416 && j12 == u.c(i11.getHeaderField("Content-Range"))) {
                    this.f80105h = true;
                    transferStarted(iVar);
                    if (j13 != -1) {
                        return j13;
                    }
                    return 0L;
                }
                InputStream errorStream = i11.getErrorStream();
                try {
                    if (errorStream != null) {
                        P7.a.b(errorStream);
                    } else {
                        int i13 = N.f74289a;
                    }
                } catch (IOException unused) {
                    int i14 = N.f74289a;
                }
                closeConnectionQuietly();
                throw new s(this.f80106i, this.f80106i == 416 ? new C8847g(2008) : null, headerFields);
            }
            i11.getContentType();
            if (this.f80106i == 200 && j12 != 0) {
                j11 = j12;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(i11.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                this.f80107j = j13;
            } else if (j13 != -1) {
                this.f80107j = j13;
            } else {
                long b11 = u.b(i11.getHeaderField("Content-Length"), i11.getHeaderField("Content-Range"));
                this.f80107j = b11 != -1 ? b11 - j11 : -1L;
            }
            try {
                this.f80104g = i11.getInputStream();
                if (equalsIgnoreCase) {
                    this.f80104g = new GZIPInputStream(this.f80104g);
                }
                this.f80105h = true;
                transferStarted(iVar);
                try {
                    j(j11);
                    return this.f80107j;
                } catch (IOException e11) {
                    closeConnectionQuietly();
                    if (e11 instanceof q) {
                        throw ((q) e11);
                    }
                    throw new q(e11, 2000, 1);
                }
            } catch (IOException e12) {
                closeConnectionQuietly();
                throw new q(e12, 2000, 1);
            }
        } catch (IOException e13) {
            closeConnectionQuietly();
            throw q.a(1, e13);
        }
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws q {
        if (i12 == 0) {
            return 0;
        }
        try {
            long j11 = this.f80107j;
            if (j11 != -1) {
                long j12 = j11 - this.f80108k;
                if (j12 == 0) {
                    return -1;
                }
                i12 = (int) Math.min(i12, j12);
            }
            InputStream inputStream = this.f80104g;
            int i13 = N.f74289a;
            int read = inputStream.read(bArr, i11, i12);
            if (read != -1) {
                this.f80108k += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e11) {
            int i14 = N.f74289a;
            throw q.a(2, e11);
        }
    }
}
