package ru.ozon.app.android.video.player.fromexoplayer;

import O7.i;
import We.A;
import We.C;
import We.C4864f;
import We.G;
import We.InterfaceC4865g;
import We.InterfaceC4866h;
import We.K;
import We.L;
import We.M;
import android.net.Uri;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.util.concurrent.q;
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
import p3.p;
import p3.s;
import p3.t;
import p3.u;
import p3.z;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoAsset;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;

/* loaded from: classes7.dex */
public class OzOkHttpDataSource extends AbstractC8842b {
    private long bytesRead;
    private long bytesToRead;
    private final C4864f cacheControl;
    private final InterfaceC4865g.a callFactory;
    private boolean connectionEstablished;
    private final i<String> contentTypePredicate;
    private p3.i dataSpec;
    private final t defaultRequestProperties;
    private final Boolean isCronetEnabled;
    private final t requestProperties;
    private L response;
    private InputStream responseByteStream;
    private final String userAgent;
    private final VideoPerfMetricsManager videoPerfMetricsManager;

    public static final class Factory implements p {
        private C4864f cacheControl;
        private final InterfaceC4865g.a callFactory;
        private i<String> contentTypePredicate;
        private final t defaultRequestProperties = new t();
        private final Boolean isCronetEnabled;
        private z transferListener;
        private String userAgent;
        private final VideoPerfMetricsManager videoPerfMetricsManager;

        public Factory(InterfaceC4865g.a aVar, VideoPerfMetricsManager videoPerfMetricsManager, Boolean bool) {
            this.callFactory = aVar;
            this.videoPerfMetricsManager = videoPerfMetricsManager;
            this.isCronetEnabled = bool;
        }

        public Factory setUserAgent(String str) {
            this.userAgent = str;
            return this;
        }

        @Override // p3.InterfaceC8846f.a
        public OzOkHttpDataSource createDataSource() {
            OzOkHttpDataSource ozOkHttpDataSource = new OzOkHttpDataSource(this.callFactory, this.userAgent, this.cacheControl, this.defaultRequestProperties, this.contentTypePredicate, this.videoPerfMetricsManager, this.isCronetEnabled, 0);
            z zVar = this.transferListener;
            if (zVar != null) {
                ozOkHttpDataSource.addTransferListener(zVar);
            }
            return ozOkHttpDataSource;
        }
    }

    static {
        r.a("media3.datasource.okhttp");
    }

    /* synthetic */ OzOkHttpDataSource(InterfaceC4865g.a aVar, String str, C4864f c4864f, t tVar, i iVar, VideoPerfMetricsManager videoPerfMetricsManager, Boolean bool, int i11) {
        this(aVar, str, c4864f, tVar, iVar, videoPerfMetricsManager, bool);
    }

    private void closeConnectionQuietly() {
        L l11 = this.response;
        if (l11 != null) {
            G L11 = l11.L();
            String a11 = L11.j().toString();
            String d11 = L11.d(FormPageDTO.Field.FIELD_TYPE_RANGE);
            if (d11 == null) {
                d11 = "";
            }
            VideoAsset videoAsset = new VideoAsset(a11, d11);
            this.videoPerfMetricsManager.handleMetricActionByUrl(videoAsset, new VideoPerfMetricAction.PutAppMetricAction("decodedSize", Long.valueOf(this.bytesRead)));
            if (!this.isCronetEnabled.booleanValue() && this.response.c() != null) {
                this.videoPerfMetricsManager.handleMetricActionByUrl(videoAsset, new VideoPerfMetricAction.PutAppMetricAction("encodedSize", Long.valueOf(this.response.c().contentLength())));
            }
            M c11 = this.response.c();
            c11.getClass();
            c11.close();
        }
        this.responseByteStream = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private L executeCall(InterfaceC4865g interfaceC4865g) throws IOException {
        final q x11 = q.x();
        interfaceC4865g.E0(new InterfaceC4866h() { // from class: ru.ozon.app.android.video.player.fromexoplayer.OzOkHttpDataSource.1
            @Override // We.InterfaceC4866h
            public void onFailure(InterfaceC4865g interfaceC4865g2, IOException iOException) {
                x11.w(iOException);
            }

            @Override // We.InterfaceC4866h
            public void onResponse(InterfaceC4865g interfaceC4865g2, L l11) {
                x11.v(l11);
            }
        });
        try {
            return (L) x11.get();
        } catch (InterruptedException unused) {
            interfaceC4865g.cancel();
            throw new InterruptedIOException();
        } catch (ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    private G makeRequest(p3.i iVar) throws p3.q {
        long j11 = iVar.f80071f;
        String uri = iVar.f80066a.toString();
        A.f33515l.getClass();
        A e11 = A.b.e(uri);
        if (e11 == null) {
            throw new p3.q("Malformed URL", GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
        G.a aVar = new G.a();
        aVar.j(e11);
        C4864f c4864f = this.cacheControl;
        if (c4864f != null) {
            aVar.c(c4864f);
        }
        HashMap hashMap = new HashMap();
        t tVar = this.defaultRequestProperties;
        if (tVar != null) {
            hashMap.putAll(tVar.a());
        }
        hashMap.putAll(this.requestProperties.a());
        hashMap.putAll(iVar.f80070e);
        for (Map.Entry entry : hashMap.entrySet()) {
            aVar.d((String) entry.getKey(), (String) entry.getValue());
        }
        String a11 = u.a(j11, iVar.f80072g);
        if (a11 != null) {
            aVar.a("Range", a11);
        }
        String str = this.userAgent;
        if (str != null) {
            aVar.a("User-Agent", str);
        }
        if (!iVar.c(1)) {
            aVar.a("Accept-Encoding", "identity");
        }
        int i11 = iVar.f80068c;
        byte[] bArr = iVar.f80069d;
        aVar.f(bArr != null ? K.create(bArr) : i11 == 2 ? K.create(N.f74291c) : null, p3.i.b(i11));
        return aVar.b();
    }

    private int readInternal(byte[] bArr, int i11, int i12) throws IOException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.bytesToRead;
        if (j11 != -1) {
            long j12 = j11 - this.bytesRead;
            if (j12 == 0) {
                return -1;
            }
            i12 = (int) Math.min(i12, j12);
        }
        InputStream inputStream = this.responseByteStream;
        int i13 = N.f74289a;
        int read = inputStream.read(bArr, i11, i12);
        if (read == -1) {
            return -1;
        }
        this.bytesRead += read;
        bytesTransferred(read);
        return read;
    }

    private void skipFully(long j11, p3.i iVar) throws p3.q {
        if (j11 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j11 > 0) {
            try {
                int min = (int) Math.min(j11, 4096);
                InputStream inputStream = this.responseByteStream;
                int i11 = N.f74289a;
                int read = inputStream.read(bArr, 0, min);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read == -1) {
                    throw new p3.q(2008);
                }
                j11 -= read;
                bytesTransferred(read);
            } catch (IOException e11) {
                if (!(e11 instanceof p3.q)) {
                    throw new p3.q(2000);
                }
                throw ((p3.q) e11);
            }
        }
    }

    @Override // p3.InterfaceC8846f
    public void close() {
        if (this.connectionEstablished) {
            this.connectionEstablished = false;
            transferEnded();
            closeConnectionQuietly();
        }
        this.response = null;
        this.dataSpec = null;
    }

    @Override // p3.InterfaceC8846f
    public Map<String, List<String>> getResponseHeaders() {
        L l11 = this.response;
        return l11 == null ? Collections.EMPTY_MAP : l11.r().i();
    }

    @Override // p3.InterfaceC8846f
    public Uri getUri() {
        L l11 = this.response;
        if (l11 != null) {
            return Uri.parse(l11.L().j().toString());
        }
        p3.i iVar = this.dataSpec;
        if (iVar != null) {
            return iVar.f80066a;
        }
        return null;
    }

    @Override // p3.InterfaceC8846f
    public long open(p3.i iVar) throws p3.q {
        this.dataSpec = iVar;
        long j11 = 0;
        this.bytesRead = 0L;
        this.bytesToRead = 0L;
        transferInitializing(iVar);
        try {
            L executeCall = executeCall(this.callFactory.a(makeRequest(iVar)));
            this.response = executeCall;
            M c11 = executeCall.c();
            c11.getClass();
            this.responseByteStream = c11.byteStream();
            int m11 = executeCall.m();
            if (!executeCall.v()) {
                if (m11 == 416) {
                    if (iVar.f80071f == u.c(executeCall.r().c("Content-Range"))) {
                        this.connectionEstablished = true;
                        transferStarted(iVar);
                        long j12 = iVar.f80072g;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0L;
                    }
                }
                try {
                    InputStream inputStream = this.responseByteStream;
                    inputStream.getClass();
                    P7.a.b(inputStream);
                } catch (IOException unused) {
                    int i11 = N.f74289a;
                }
                TreeMap i12 = executeCall.r().i();
                closeConnectionQuietly();
                throw new s(m11, m11 == 416 ? new C8847g(2008) : null, i12);
            }
            C contentType = c11.contentType();
            String c12 = contentType != null ? contentType.toString() : "";
            i<String> iVar2 = this.contentTypePredicate;
            if (iVar2 != null && !iVar2.apply(c12)) {
                closeConnectionQuietly();
                throw new p3.r(c12);
            }
            if (m11 == 200) {
                long j13 = iVar.f80071f;
                if (j13 != 0) {
                    j11 = j13;
                }
            }
            long j14 = iVar.f80072g;
            if (j14 != -1) {
                this.bytesToRead = j14;
            } else {
                long contentLength = c11.contentLength();
                this.bytesToRead = contentLength != -1 ? contentLength - j11 : -1L;
            }
            this.connectionEstablished = true;
            transferStarted(iVar);
            try {
                skipFully(j11, iVar);
                return this.bytesToRead;
            } catch (p3.q e11) {
                closeConnectionQuietly();
                throw e11;
            }
        } catch (IOException e12) {
            throw p3.q.a(1, e12);
        }
    }

    @Override // j3.InterfaceC7268j
    public int read(byte[] bArr, int i11, int i12) throws p3.q {
        try {
            return readInternal(bArr, i11, i12);
        } catch (IOException e11) {
            int i13 = N.f74289a;
            throw p3.q.a(2, e11);
        }
    }

    private OzOkHttpDataSource(InterfaceC4865g.a aVar, String str, C4864f c4864f, t tVar, i<String> iVar, VideoPerfMetricsManager videoPerfMetricsManager, Boolean bool) {
        super(true);
        aVar.getClass();
        this.callFactory = aVar;
        this.userAgent = str;
        this.cacheControl = c4864f;
        this.defaultRequestProperties = tVar;
        this.contentTypePredicate = iVar;
        this.requestProperties = new t();
        this.videoPerfMetricsManager = videoPerfMetricsManager;
        this.isCronetEnabled = bool;
    }
}
