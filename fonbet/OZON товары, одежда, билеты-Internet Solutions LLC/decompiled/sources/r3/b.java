package r3;

import We.A;
import We.E;
import We.G;
import We.InterfaceC4865g;
import We.K;
import We.L;
import We.M;
import android.net.Uri;
import com.google.android.gms.location.GeofenceStatusCodes;
import j3.r;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import m3.N;
import p3.AbstractC8842b;
import p3.C8847g;
import p3.i;
import p3.p;
import p3.q;
import p3.s;
import p3.t;
import p3.u;

/* loaded from: classes8.dex */
public final class b extends AbstractC8842b {

    /* renamed from: a, reason: collision with root package name */
    private final E f82874a;

    /* renamed from: b, reason: collision with root package name */
    private final t f82875b;

    /* renamed from: c, reason: collision with root package name */
    private final t f82876c;

    /* renamed from: d, reason: collision with root package name */
    private i f82877d;

    /* renamed from: e, reason: collision with root package name */
    private L f82878e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f82879f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f82880g;

    /* renamed from: h, reason: collision with root package name */
    private long f82881h;

    /* renamed from: i, reason: collision with root package name */
    private long f82882i;

    public static final class a implements p {

        /* renamed from: a, reason: collision with root package name */
        private final t f82883a = new t();

        /* renamed from: b, reason: collision with root package name */
        private final E f82884b;

        public a(E e11) {
            this.f82884b = e11;
        }

        @Override // p3.InterfaceC8846f.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createDataSource() {
            return new b(this.f82884b, this.f82883a);
        }
    }

    static {
        r.a("media3.datasource.okhttp");
    }

    b(E e11, t tVar) {
        super(true);
        e11.getClass();
        this.f82874a = e11;
        this.f82876c = tVar;
        this.f82875b = new t();
    }

    private void closeConnectionQuietly() {
        L l11 = this.f82878e;
        if (l11 != null) {
            M c11 = l11.c();
            c11.getClass();
            c11.close();
        }
        this.f82879f = null;
    }

    private void i(long j11) throws q {
        if (j11 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j11 > 0) {
            try {
                int min = (int) Math.min(j11, 4096);
                InputStream inputStream = this.f82879f;
                int i11 = N.f74289a;
                int read = inputStream.read(bArr, 0, min);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read == -1) {
                    throw new q(2008);
                }
                j11 -= read;
                bytesTransferred(read);
            } catch (IOException e11) {
                if (!(e11 instanceof q)) {
                    throw new q(2000);
                }
                throw ((q) e11);
            }
        }
    }

    @Override // p3.InterfaceC8846f
    public final void close() {
        if (this.f82880g) {
            this.f82880g = false;
            transferEnded();
            closeConnectionQuietly();
        }
        this.f82878e = null;
        this.f82877d = null;
    }

    @Override // p3.InterfaceC8846f
    public final Map<String, List<String>> getResponseHeaders() {
        L l11 = this.f82878e;
        return l11 == null ? Collections.EMPTY_MAP : l11.r().i();
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        L l11 = this.f82878e;
        if (l11 != null) {
            return Uri.parse(l11.L().j().toString());
        }
        i iVar = this.f82877d;
        if (iVar != null) {
            return iVar.f80066a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.InterfaceC8846f
    public final long open(i iVar) throws q {
        this.f82877d = iVar;
        this.f82882i = 0L;
        this.f82881h = 0L;
        transferInitializing(iVar);
        long j11 = iVar.f80071f;
        String uri = iVar.f80066a.toString();
        A.f33515l.getClass();
        A e11 = A.b.e(uri);
        if (e11 == null) {
            throw new q("Malformed URL", GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
        G.a aVar = new G.a();
        aVar.j(e11);
        HashMap hashMap = new HashMap();
        t tVar = this.f82876c;
        if (tVar != null) {
            hashMap.putAll(tVar.a());
        }
        hashMap.putAll(this.f82875b.a());
        hashMap.putAll(iVar.f80070e);
        for (Map.Entry entry : hashMap.entrySet()) {
            aVar.d((String) entry.getKey(), (String) entry.getValue());
        }
        long j12 = iVar.f80072g;
        String a11 = u.a(j11, j12);
        if (a11 != null) {
            aVar.a("Range", a11);
        }
        if (!iVar.c(1)) {
            aVar.a("Accept-Encoding", "identity");
        }
        int i11 = iVar.f80068c;
        byte[] bArr = iVar.f80069d;
        aVar.f(bArr != null ? K.create(bArr) : i11 == 2 ? K.create(N.f74291c) : null, i.b(i11));
        InterfaceC4865g a12 = this.f82874a.a(aVar.b());
        try {
            com.google.common.util.concurrent.q x11 = com.google.common.util.concurrent.q.x();
            a12.E0(new C9168a(x11));
            try {
                try {
                    L l11 = (L) x11.get();
                    this.f82878e = l11;
                    M c11 = l11.c();
                    c11.getClass();
                    this.f82879f = c11.byteStream();
                    int m11 = l11.m();
                    boolean v11 = l11.v();
                    long j13 = iVar.f80071f;
                    if (v11) {
                        c11.contentType();
                        long j14 = (m11 != 200 || j13 == 0) ? 0L : j13;
                        if (j12 != -1) {
                            this.f82881h = j12;
                        } else {
                            long contentLength = c11.contentLength();
                            this.f82881h = contentLength != -1 ? contentLength - j14 : -1L;
                        }
                        this.f82880g = true;
                        transferStarted(iVar);
                        try {
                            i(j14);
                            return this.f82881h;
                        } catch (q e12) {
                            closeConnectionQuietly();
                            throw e12;
                        }
                    }
                    if (m11 == 416 && j13 == u.c(l11.r().c("Content-Range"))) {
                        this.f82880g = true;
                        transferStarted(iVar);
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0L;
                    }
                    try {
                        InputStream inputStream = this.f82879f;
                        inputStream.getClass();
                        P7.a.b(inputStream);
                    } catch (IOException unused) {
                        int i12 = N.f74289a;
                    }
                    TreeMap i13 = l11.r().i();
                    closeConnectionQuietly();
                    throw new s(m11, m11 == 416 ? new C8847g(2008) : null, i13);
                } catch (InterruptedException unused2) {
                    a12.cancel();
                    throw new InterruptedIOException();
                }
            } catch (ExecutionException e13) {
                throw new IOException(e13);
            }
        } catch (IOException e14) {
            throw q.a(1, e14);
        }
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws q {
        if (i12 == 0) {
            return 0;
        }
        try {
            long j11 = this.f82881h;
            if (j11 != -1) {
                long j12 = j11 - this.f82882i;
                if (j12 == 0) {
                    return -1;
                }
                i12 = (int) Math.min(i12, j12);
            }
            InputStream inputStream = this.f82879f;
            int i13 = N.f74289a;
            int read = inputStream.read(bArr, i11, i12);
            if (read != -1) {
                this.f82882i += read;
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
