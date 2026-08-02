package org.chromium.net.impl;

import B0.A0;
import android.annotation.SuppressLint;
import internal.org.jni_zero.CalledByNative;
import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class CronetUploadDataStream extends org.chromium.net.h {

    /* renamed from: a, reason: collision with root package name */
    private final Va.a f78722a;

    /* renamed from: b, reason: collision with root package name */
    private final h0 f78723b;

    /* renamed from: c, reason: collision with root package name */
    private final CronetUrlRequest f78724c;

    /* renamed from: d, reason: collision with root package name */
    private long f78725d;

    /* renamed from: e, reason: collision with root package name */
    private long f78726e;

    /* renamed from: f, reason: collision with root package name */
    private long f78727f;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f78730i;

    /* renamed from: k, reason: collision with root package name */
    private long f78732k;

    /* renamed from: m, reason: collision with root package name */
    private boolean f78734m;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f78728g = new AtomicInteger();

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f78729h = new a();

    /* renamed from: j, reason: collision with root package name */
    private final Object f78731j = new Object();

    /* renamed from: l, reason: collision with root package name */
    private int f78733l = 3;

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (CronetUploadDataStream.this.f78731j) {
                try {
                    if (CronetUploadDataStream.this.f78732k == 0) {
                        return;
                    }
                    CronetUploadDataStream.this.n(3);
                    if (CronetUploadDataStream.this.f78730i == null) {
                        throw new IllegalStateException("Unexpected readData call. Buffer is null");
                    }
                    CronetUploadDataStream.this.f78733l = 0;
                    try {
                        CronetUploadDataStream.j(CronetUploadDataStream.this);
                        h0 h0Var = CronetUploadDataStream.this.f78723b;
                        CronetUploadDataStream cronetUploadDataStream = CronetUploadDataStream.this;
                        h0Var.d(cronetUploadDataStream, cronetUploadDataStream.f78730i);
                        CronetUploadDataStream.this.f78728g.incrementAndGet();
                    } catch (Exception e11) {
                        CronetUploadDataStream.this.s(e11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (CronetUploadDataStream.this.f78731j) {
                try {
                    if (CronetUploadDataStream.this.f78732k == 0) {
                        return;
                    }
                    CronetUploadDataStream.this.n(3);
                    CronetUploadDataStream.this.f78733l = 1;
                    try {
                        CronetUploadDataStream.j(CronetUploadDataStream.this);
                        CronetUploadDataStream.this.f78723b.j(CronetUploadDataStream.this);
                    } catch (Exception e11) {
                        CronetUploadDataStream.this.s(e11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CronetUploadDataStream cronetUploadDataStream = CronetUploadDataStream.this;
            try {
                CronetUploadDataStream.j(cronetUploadDataStream);
                cronetUploadDataStream.f78723b.close();
            } catch (Exception e11) {
                org.chromium.base.j.b("CronetUploadDataStream", "Exception thrown when closing", e11);
            }
        }
    }

    public CronetUploadDataStream(org.chromium.net.A a11, Va.a aVar, CronetUrlRequest cronetUrlRequest) {
        this.f78722a = aVar;
        this.f78723b = new h0(a11);
        this.f78724c = cronetUrlRequest;
    }

    static void j(CronetUploadDataStream cronetUploadDataStream) {
        cronetUploadDataStream.f78724c.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i11) {
        if (this.f78733l != i11) {
            throw new IllegalStateException(A0.a(i11, this.f78733l, "Expected ", ", but was "));
        }
    }

    private void o() {
        synchronized (this.f78731j) {
            try {
                if (this.f78733l == 0) {
                    this.f78734m = true;
                } else {
                    if (this.f78732k == 0) {
                        return;
                    }
                    new M();
                    internal.J.N.MMW1G0N1(this.f78732k);
                    this.f78732k = 0L;
                    t(new c(), "destroyAdapter");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void p() {
        synchronized (this.f78731j) {
            try {
                if (this.f78733l == 0) {
                    throw new IllegalStateException("Method should not be called when read has not completed.");
                }
                if (this.f78734m) {
                    o();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(Throwable th2) {
        boolean z11;
        synchronized (this.f78731j) {
            int i11 = this.f78733l;
            if (i11 == 3) {
                throw new IllegalStateException("There is no read or rewind or length check in progress.", th2);
            }
            z11 = i11 == 2;
            this.f78733l = 3;
            this.f78730i = null;
            p();
        }
        if (z11) {
            try {
                this.f78723b.close();
            } catch (Exception e11) {
                org.chromium.base.j.b("CronetUploadDataStream", "Failure closing data provider", e11);
            }
        }
        this.f78724c.z(th2);
    }

    @Override // org.chromium.net.h
    @SuppressLint({"DefaultLocale"})
    public final void a() {
        vf.c.c("CronetUploadDataStream#onReadSucceeded");
        synchronized (this.f78731j) {
            try {
                n(0);
                if (this.f78727f != this.f78730i.limit()) {
                    throw new IllegalStateException("ByteBuffer limit changed");
                }
                int position = this.f78730i.position();
                if (position == 0) {
                    s(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
                    return;
                }
                long j11 = this.f78726e - position;
                this.f78726e = j11;
                if (j11 < 0 && this.f78725d >= 0) {
                    throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", Long.valueOf(this.f78725d - this.f78726e), Long.valueOf(this.f78725d)));
                }
                this.f78730i = null;
                this.f78733l = 3;
                p();
                if (this.f78732k == 0) {
                    return;
                }
                new M();
                internal.J.N.MpWH3VIr(this.f78732k, this, position, false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.chromium.net.h
    public final void b(HttpRetryException httpRetryException) {
        vf.c.c("CronetUploadDataStream#onRewindError");
        synchronized (this.f78731j) {
            n(1);
            s(httpRetryException);
        }
    }

    @Override // org.chromium.net.h
    public final void c() {
        vf.c.c("CronetUploadDataStream#onRewindSucceeded");
        synchronized (this.f78731j) {
            try {
                n(1);
                this.f78733l = 3;
                this.f78726e = this.f78725d;
                if (this.f78732k == 0) {
                    return;
                }
                new M();
                internal.J.N.MFpRjSMv(this.f78732k, this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void m(long j11) {
        vf.c.c("CronetUploadDataStream#attachNativeAdapterToRequest");
        synchronized (this.f78731j) {
            new M();
            this.f78732k = internal.J.N.MA4X1aZa(this, j11, this.f78725d);
        }
    }

    @CalledByNative
    final void onUploadDataStreamDestroyed() {
        o();
    }

    final int q() {
        return this.f78728g.get();
    }

    final void r() {
        vf.c.c("CronetUploadDataStream#initializeWithRequest");
        synchronized (this.f78731j) {
            this.f78733l = 2;
        }
        try {
            this.f78724c.v();
            long c11 = this.f78723b.c();
            this.f78725d = c11;
            this.f78726e = c11;
        } catch (Throwable th2) {
            s(th2);
        }
        synchronized (this.f78731j) {
            this.f78733l = 3;
        }
    }

    @CalledByNative
    final void readData(ByteBuffer byteBuffer) {
        this.f78730i = byteBuffer;
        this.f78727f = byteBuffer.limit();
        t(this.f78729h, "readData");
    }

    @CalledByNative
    final void rewind() {
        t(new b(), "rewind");
    }

    final void t(Runnable runnable, String str) {
        vf.c.c("CronetUploadDataStream#postTaskToExecutor ".concat(str));
        try {
            this.f78722a.execute(new M2.b(1, str, runnable));
        } catch (Throwable th2) {
            this.f78724c.z(th2);
        }
    }
}
