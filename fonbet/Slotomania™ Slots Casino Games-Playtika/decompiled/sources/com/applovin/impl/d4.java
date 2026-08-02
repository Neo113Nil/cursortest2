package com.applovin.impl;

import android.os.Process;
import android.os.SystemClock;
import androidx.core.util.Consumer;
import com.applovin.impl.d4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class d4 {
    private final PriorityBlockingQueue a = new PriorityBlockingQueue();
    private final com.applovin.impl.sdk.l b;

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends Thread {
        private final BlockingQueue a;
        private final com.applovin.impl.sdk.l b;

        private void a() {
            b((c) this.a.take());
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x00f2 A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #0 {all -> 0x01a2, blocks: (B:55:0x00da, B:57:0x00f2, B:72:0x0133), top: B:54:0x00da }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void b(final c cVar) {
            int i;
            HttpURLConnection httpURLConnection;
            byte[] bArr;
            Throwable th;
            long j;
            byte[] bArr2;
            Throwable th2;
            byte[] bArr3;
            HttpURLConnection httpURLConnection2;
            long j2;
            byte[] bArr4;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = 0;
            try {
                httpURLConnection2 = a(cVar);
                try {
                    if (cVar.d != null && cVar.d.length > 0) {
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setFixedLengthStreamingMode(cVar.d.length);
                        try {
                            OutputStream urlConnectionGetOutputStream = AppLovinNetworkBridge.urlConnectionGetOutputStream(httpURLConnection2);
                            try {
                                urlConnectionGetOutputStream.write(cVar.d);
                                urlConnectionGetOutputStream.close();
                            } finally {
                            }
                        } catch (Throwable th3) {
                            HashMap hashMap = new HashMap();
                            CollectionUtils.putStringIfValid("details", "outputStream", hashMap);
                            CollectionUtils.putStringIfValid("url", cVar.a, hashMap);
                            CollectionUtils.putStringIfValid("code", Integer.toString(0), hashMap);
                            this.b.E().a("NetworkCommunicationThread", "processRequest", th3, hashMap);
                            throw th3;
                        }
                    }
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    i2 = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection2);
                    j2 = SystemClock.elapsedRealtime();
                    if (i2 > 0) {
                        try {
                            InputStream urlConnectionGetInputStream = AppLovinNetworkBridge.urlConnectionGetInputStream(httpURLConnection2);
                            try {
                                bArr = s0.a(urlConnectionGetInputStream, this.b);
                                if (urlConnectionGetInputStream != null) {
                                    try {
                                        urlConnectionGetInputStream.close();
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            HashMap hashMap2 = new HashMap();
                                            CollectionUtils.putStringIfValid("details", "responseDataInputStream", hashMap2);
                                            CollectionUtils.putStringIfValid("url", cVar.a, hashMap2);
                                            CollectionUtils.putStringIfValid("code", Integer.toString(i2), hashMap2);
                                            this.b.E().a("NetworkCommunicationThread", "processRequest", th, hashMap2);
                                            throw th;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            httpURLConnection = httpURLConnection2;
                                            i = i2;
                                            long j3 = elapsedRealtime;
                                            th = th;
                                            try {
                                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                                this.b.Q().a("NetworkCommunicationThread", th);
                                                this.b.Q();
                                                if (com.applovin.impl.sdk.p.a()) {
                                                    this.b.Q().d("NetworkCommunicationThread", "Failed to make HTTP request", th);
                                                }
                                                if (httpURLConnection == null) {
                                                    try {
                                                        InputStream errorStream = httpURLConnection.getErrorStream();
                                                        try {
                                                            byte[] a = s0.a(errorStream, this.b);
                                                            if (errorStream != null) {
                                                                try {
                                                                    errorStream.close();
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    j = j3;
                                                                    bArr2 = a;
                                                                    this.b.Q().a("NetworkCommunicationThread", th);
                                                                    HashMap hashMap3 = new HashMap();
                                                                    CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", hashMap3);
                                                                    CollectionUtils.putStringIfValid("url", cVar.a, hashMap3);
                                                                    CollectionUtils.putStringIfValid("code", Integer.toString(i), hashMap3);
                                                                    this.b.E().a("NetworkCommunicationThread", "processRequest", th, hashMap3);
                                                                    th2 = th;
                                                                    bArr3 = bArr2;
                                                                    i2 = i;
                                                                    httpURLConnection2 = httpURLConnection;
                                                                    j2 = elapsedRealtime2;
                                                                    bArr4 = bArr;
                                                                    elapsedRealtime = j;
                                                                    q7.a(httpURLConnection2, this.b);
                                                                    final d a2 = d.a().a(i2).a(bArr4).b(bArr3).a(j2 - elapsedRealtime).a(th2).a();
                                                                    cVar.g.execute(new Runnable() { // from class: com.applovin.impl.d4$b$$ExternalSyntheticLambda0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            d4.b.a(d4.c.this, a2);
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                            th2 = th;
                                                            elapsedRealtime = j3;
                                                            i2 = i;
                                                            httpURLConnection2 = httpURLConnection;
                                                            j2 = elapsedRealtime2;
                                                            bArr4 = bArr;
                                                            bArr3 = a;
                                                        } catch (Throwable th7) {
                                                            j = j3;
                                                            if (errorStream == null) {
                                                                throw th7;
                                                            }
                                                            try {
                                                                try {
                                                                    errorStream.close();
                                                                    throw th7;
                                                                } catch (Throwable th8) {
                                                                    th7.addSuppressed(th8);
                                                                    throw th7;
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                bArr2 = null;
                                                                this.b.Q().a("NetworkCommunicationThread", th);
                                                                HashMap hashMap32 = new HashMap();
                                                                CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", hashMap32);
                                                                CollectionUtils.putStringIfValid("url", cVar.a, hashMap32);
                                                                CollectionUtils.putStringIfValid("code", Integer.toString(i), hashMap32);
                                                                this.b.E().a("NetworkCommunicationThread", "processRequest", th, hashMap32);
                                                                th2 = th;
                                                                bArr3 = bArr2;
                                                                i2 = i;
                                                                httpURLConnection2 = httpURLConnection;
                                                                j2 = elapsedRealtime2;
                                                                bArr4 = bArr;
                                                                elapsedRealtime = j;
                                                                q7.a(httpURLConnection2, this.b);
                                                                final d a22 = d.a().a(i2).a(bArr4).b(bArr3).a(j2 - elapsedRealtime).a(th2).a();
                                                                cVar.g.execute(new Runnable() { // from class: com.applovin.impl.d4$b$$ExternalSyntheticLambda0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        d4.b.a(d4.c.this, a22);
                                                                    }
                                                                });
                                                            }
                                                        }
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        j = j3;
                                                    }
                                                } else {
                                                    th2 = th;
                                                    i2 = i;
                                                    httpURLConnection2 = httpURLConnection;
                                                    j2 = elapsedRealtime2;
                                                    bArr4 = bArr;
                                                    elapsedRealtime = j3;
                                                    bArr3 = null;
                                                }
                                                q7.a(httpURLConnection2, this.b);
                                                final d a222 = d.a().a(i2).a(bArr4).b(bArr3).a(j2 - elapsedRealtime).a(th2).a();
                                                cVar.g.execute(new Runnable() { // from class: com.applovin.impl.d4$b$$ExternalSyntheticLambda0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        d4.b.a(d4.c.this, a222);
                                                    }
                                                });
                                            } catch (Throwable th11) {
                                                q7.a(httpURLConnection, this.b);
                                                throw th11;
                                            }
                                        }
                                    }
                                }
                                bArr4 = bArr;
                                bArr3 = null;
                                th2 = null;
                            } finally {
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            bArr = null;
                        }
                    } else {
                        bArr3 = null;
                        th2 = null;
                        bArr4 = null;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    httpURLConnection = httpURLConnection2;
                    bArr = null;
                    i = i2;
                    long j32 = elapsedRealtime;
                    th = th;
                    long elapsedRealtime22 = SystemClock.elapsedRealtime();
                    this.b.Q().a("NetworkCommunicationThread", th);
                    this.b.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                    }
                    if (httpURLConnection == null) {
                    }
                    q7.a(httpURLConnection2, this.b);
                    final d a2222 = d.a().a(i2).a(bArr4).b(bArr3).a(j2 - elapsedRealtime).a(th2).a();
                    cVar.g.execute(new Runnable() { // from class: com.applovin.impl.d4$b$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            d4.b.a(d4.c.this, a2222);
                        }
                    });
                }
            } catch (Throwable th14) {
                th = th14;
                i = 0;
                httpURLConnection = null;
                bArr = null;
            }
            q7.a(httpURLConnection2, this.b);
            final d a22222 = d.a().a(i2).a(bArr4).b(bArr3).a(j2 - elapsedRealtime).a(th2).a();
            cVar.g.execute(new Runnable() { // from class: com.applovin.impl.d4$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    d4.b.a(d4.c.this, a22222);
                }
            });
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private b(BlockingQueue blockingQueue, int i, com.applovin.impl.sdk.l lVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (lVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.a = blockingQueue;
            this.b = lVar;
            setPriority(((Integer) lVar.a(z4.S)).intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.a).openConnection();
            httpURLConnection.setRequestMethod(cVar.b);
            httpURLConnection.setConnectTimeout(cVar.e);
            httpURLConnection.setReadTimeout(cVar.e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.c.isEmpty()) {
                for (Map.Entry entry : cVar.c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    public static class c implements Comparable {
        private static final AtomicInteger i = new AtomicInteger();
        private final String a;
        private final String b;
        private final Map c;
        private final byte[] d;
        private final int e;
        private final Consumer f;
        private final Executor g;
        private final int h;

        public static class a {
            private String a;
            private String b;
            private Map c = new HashMap();
            private byte[] d;
            private int e;
            private Consumer f;
            private Executor g;

            public a a(String str) {
                this.a = str;
                return this;
            }

            public a b(String str) {
                this.b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.d = bArr;
                return this;
            }

            public a a(int i) {
                this.e = i;
                return this;
            }

            public a a(Consumer consumer) {
                this.f = consumer;
                return this;
            }

            public a a(Executor executor) {
                this.g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.h - cVar.h;
        }

        private c(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c != null ? aVar.c : Collections.emptyMap();
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = i.incrementAndGet();
        }
    }

    public static class d {
        private final int a;
        private final byte[] b;
        private final byte[] c;
        private final long d;
        private final Throwable e;

        public static class a {
            private int a;
            private byte[] b;
            private byte[] c;
            private long d;
            private Throwable e;

            public a a(int i) {
                this.a = i;
                return this;
            }

            public a b(byte[] bArr) {
                this.c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.b = bArr;
                return this;
            }

            public a a(Throwable th) {
                this.e = th;
                return this;
            }

            public a a(long j) {
                this.d = j;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.a;
        }

        public int c() {
            Throwable th = this.e;
            if (th == null) {
                return this.a;
            }
            throw th;
        }

        public byte[] d() {
            Throwable th = this.e;
            if (th == null) {
                return this.b;
            }
            throw th;
        }

        public long e() {
            return this.d;
        }

        public byte[] f() {
            return this.c;
        }

        private d(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
        }
    }

    public d4(com.applovin.impl.sdk.l lVar) {
        this.b = lVar;
    }

    public void a() {
        for (int i = 0; i < ((Integer) this.b.a(z4.R)).intValue(); i++) {
            new b(this.a, i, this.b).start();
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
