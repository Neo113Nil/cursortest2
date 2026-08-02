package androidx.media3.datasource;

import android.net.TrafficStats;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.datasource.a;
import com.google.common.collect.h;
import com.google.common.collect.l;
import com.mbridge.msdk.foundation.download.Command;
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
import ru.ok.android.commons.http.Http;
import xsna.ahn;
import xsna.blv;
import xsna.evk;
import xsna.gc6;
import xsna.ku8;
import xsna.ufl;
import xsna.vfl;
import xsna.w9s;
import xsna.xiv;
import xsna.y2r0;

/* compiled from: DefaultHttpDataSource.java */
/* loaded from: classes12.dex */
public final class e extends gc6 {
    public int A;
    public long B;
    public long C;
    public final int r;
    public final int s;

    @Nullable
    public final String t;

    @Nullable
    public final xiv u;
    public final xiv v;

    @Nullable
    public evk w;

    @Nullable
    public HttpURLConnection x;

    @Nullable
    public InputStream y;
    public boolean z;

    /* compiled from: DefaultHttpDataSource.java */
    public static final class a implements a.InterfaceC0045a {

        @Nullable
        public String b;
        public final xiv a = new xiv();
        public int c = 8000;
        public int d = 8000;

        @Override // androidx.media3.datasource.a.InterfaceC0045a
        public final androidx.media3.datasource.a createDataSource() {
            return new e(this.b, this.c, this.d, this.a);
        }
    }

    /* compiled from: DefaultHttpDataSource.java */
    public static class b extends w9s<String, List<String>> {
        public final Map<String, List<String>> c;

        public b(Map<String, List<String>> map) {
            this.c = map;
        }

        @Override // xsna.w9s, java.util.Map
        public final boolean containsKey(@Nullable Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // xsna.w9s, java.util.Map
        public final boolean containsValue(@Nullable Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // xsna.x9s
        public final Object delegate() {
            return this.c;
        }

        @Override // xsna.w9s, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return l.b(super.entrySet(), new ufl(0));
        }

        @Override // xsna.w9s, java.util.Map
        public final boolean equals(@Nullable Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // xsna.w9s, java.util.Map
        @Nullable
        public final Object get(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // xsna.w9s, java.util.Map
        public final int hashCode() {
            return super.standardHashCode();
        }

        @Override // xsna.w9s, java.util.Map
        public final boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // xsna.w9s, java.util.Map
        public final Set<String> keySet() {
            return l.b(super.keySet(), new vfl());
        }

        @Override // xsna.w9s, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // xsna.w9s, xsna.x9s
        public final Map<String, List<String>> delegate() {
            return this.c;
        }
    }

    public e(String str, int i, int i2, xiv xivVar) {
        super(true);
        this.t = str;
        this.r = i;
        this.s = i2;
        this.u = xivVar;
        this.v = new xiv();
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.x;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                ahn.o("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final HttpURLConnection c(URL url, int i, @Nullable byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.r);
        httpURLConnection.setReadTimeout(this.s);
        HashMap hashMap = new HashMap();
        xiv xivVar = this.u;
        if (xivVar != null) {
            hashMap.putAll(xivVar.a());
        }
        hashMap.putAll(this.v.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a2 = blv.a(j, j2);
        if (a2 != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, a2);
        }
        String str = this.t;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? Http.ContentEncoding.GZIP : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(evk.b(i));
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.datasource.a
    public final void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.y;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    evk evkVar = this.w;
                    String str = y2r0.a;
                    throw new HttpDataSource$HttpDataSourceException(e, evkVar, 2000, 3);
                }
            }
        } finally {
            this.y = null;
            b();
            if (this.z) {
                this.z = false;
                transferEnded();
            }
            this.x = null;
            this.w = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final void d(long j, evk evkVar) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096);
            InputStream inputStream = this.y;
            String str = y2r0.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), evkVar, 2000, 1);
            }
            if (read == -1) {
                throw new HttpDataSource$HttpDataSourceException(evkVar, 2008);
            }
            j -= read;
            bytesTransferred(read);
        }
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.x;
        return httpURLConnection == null ? h.h : new b(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.x;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        evk evkVar = this.w;
        if (evkVar != null) {
            return evkVar.a;
        }
        return null;
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws HttpDataSource$HttpDataSourceException {
        e eVar;
        HttpURLConnection c;
        byte[] bArr;
        this.w = evkVar;
        long j = 0;
        this.C = 0L;
        this.B = 0L;
        transferInitializing(evkVar);
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            c = c(new URL(evkVar.a.toString()), evkVar.c, evkVar.d, evkVar.g, evkVar.h, evkVar.c(1), true, evkVar.e);
            eVar = this;
        } catch (IOException e) {
            e = e;
            eVar = this;
        }
        try {
            long j2 = evkVar.g;
            long j3 = evkVar.h;
            eVar.x = c;
            eVar.A = c.getResponseCode();
            String responseMessage = c.getResponseMessage();
            int i = eVar.A;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = c.getHeaderFields();
                if (eVar.A == 416 && j2 == blv.c(c.getHeaderField(Http.Header.CONTENT_RANGE))) {
                    eVar.z = true;
                    transferStarted(evkVar);
                    if (j3 != -1) {
                        return j3;
                    }
                    return 0L;
                }
                InputStream errorStream = c.getErrorStream();
                try {
                    bArr = errorStream != null ? ku8.b(errorStream) : y2r0.b;
                } catch (IOException unused) {
                    bArr = y2r0.b;
                }
                byte[] bArr2 = bArr;
                eVar.b();
                throw new HttpDataSource$InvalidResponseCodeException(eVar.A, responseMessage, eVar.A == 416 ? new DataSourceException(2008) : null, headerFields, evkVar, bArr2);
            }
            c.getContentType();
            if (eVar.A == 200 && j2 != 0) {
                j = j2;
            }
            boolean equalsIgnoreCase = Http.ContentEncoding.GZIP.equalsIgnoreCase(c.getHeaderField(Http.Header.CONTENT_ENCODING));
            if (equalsIgnoreCase) {
                eVar.B = j3;
            } else if (j3 != -1) {
                eVar.B = j3;
            } else {
                long b2 = blv.b(c.getHeaderField(Http.Header.CONTENT_LENGTH), c.getHeaderField(Http.Header.CONTENT_RANGE));
                eVar.B = b2 != -1 ? b2 - j : -1L;
            }
            try {
                eVar.y = c.getInputStream();
                if (equalsIgnoreCase) {
                    eVar.y = new GZIPInputStream(eVar.y);
                }
                eVar.z = true;
                transferStarted(evkVar);
                try {
                    eVar.d(j, evkVar);
                    return eVar.B;
                } catch (IOException e2) {
                    eVar.b();
                    if (e2 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e2);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e2, evkVar, 2000, 1);
                }
            } catch (IOException e3) {
                eVar.b();
                throw new HttpDataSource$HttpDataSourceException(e3, evkVar, 2000, 1);
            }
        } catch (IOException e4) {
            e = e4;
            eVar.b();
            throw HttpDataSource$HttpDataSourceException.a(e, evkVar, 1);
        }
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.B;
            if (j != -1) {
                long j2 = j - this.C;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.y;
            String str = y2r0.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.C += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            evk evkVar = this.w;
            String str2 = y2r0.a;
            throw HttpDataSource$HttpDataSourceException.a(e, evkVar, 2);
        }
    }
}
