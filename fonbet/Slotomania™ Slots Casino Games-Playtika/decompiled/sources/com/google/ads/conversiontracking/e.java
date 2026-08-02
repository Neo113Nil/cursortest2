package com.google.ads.conversiontracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.conversiontracking.g;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class e {
    private Context c;
    private f f;
    private final Object a = new Object();
    private boolean d = true;
    private boolean e = false;
    private final List<d> b = new LinkedList();

    public e(Context context) {
        this.c = context;
        this.f = new f(context);
        new Thread(new b()).start();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        long b2 = (g.b(context) + 300000) - g.a();
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new a(), b2 > 0 ? b2 : 0L, 300000L, TimeUnit.MILLISECONDS);
    }

    public void a(String str, g.c cVar, boolean z, boolean z2, boolean z3) {
        final d dVar = new d(str, cVar, z, z2);
        synchronized (this.a) {
            if (!z3) {
                a(new Runnable() { // from class: com.google.ads.conversiontracking.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.a(dVar);
                    }
                });
                return;
            }
            this.f.b(dVar);
            if (this.e && g.d(this.c)) {
                this.b.add(dVar);
                this.d = true;
                this.a.notify();
            }
        }
    }

    protected void a(Runnable runnable) {
        new Thread(runnable).start();
    }

    private class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e.this.a) {
                if (e.this.e && g.d(e.this.c) && !e.this.d) {
                    e.this.b.addAll(e.this.f.a(100L));
                    g.c(e.this.c);
                    e.this.d = true;
                    e.this.a.notify();
                }
            }
        }
    }

    public class b implements Runnable {
        protected long a = 0;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            try {
                e.this.e = true;
                while (true) {
                    synchronized (e.this.a) {
                        while (e.this.b.isEmpty()) {
                            e.this.d = false;
                            e.this.a.wait();
                        }
                        e.this.d = true;
                        dVar = (d) e.this.b.remove(0);
                    }
                    if (dVar != null) {
                        if (!g.a(e.this.c, dVar.e, dVar.f, dVar.b)) {
                            e.this.f.a(dVar);
                        } else {
                            int a = e.this.a(dVar);
                            if (a == 2) {
                                e.this.f.a(dVar);
                                this.a = 0L;
                            } else if (a == 0) {
                                e.this.f.c(dVar);
                                a();
                                Thread.sleep(this.a);
                            } else {
                                e.this.f.c(dVar);
                                this.a = 0L;
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Log.w("GoogleConversionReporter", "Dispatch thread is interrupted.");
                e.this.e = false;
            }
        }

        private void a() {
            long j = this.a;
            if (j == 0) {
                this.a = 1000L;
            } else {
                this.a = Math.min(j * 2, 60000L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        android.util.Log.i("GoogleConversionReporter", new java.lang.StringBuilder(33).append("Receive response code ").append(r3).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (200 > r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r3 >= 300) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (r6 != 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        b(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        r0.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected int a(d dVar) {
        HttpURLConnection httpURLConnection;
        String valueOf = String.valueOf(dVar.g);
        Log.i("GoogleConversionReporter", valueOf.length() != 0 ? "Pinging: ".concat(valueOf) : new String("Pinging: "));
        String str = dVar.g;
        HttpURLConnection httpURLConnection2 = null;
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i < 5) {
                try {
                    try {
                        httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(60000);
                    httpURLConnection.setUseCaches(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (300 > responseCode || responseCode >= 400) {
                        break;
                    }
                    String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                    if (TextUtils.isEmpty(headerField)) {
                        Log.i("GoogleConversionReporter", "Unable to follow redirect, no Location header.");
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return 0;
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    i++;
                    httpURLConnection2 = httpURLConnection;
                    str = headerField;
                } catch (IOException e2) {
                    e = e2;
                    httpURLConnection2 = httpURLConnection;
                    Log.e("GoogleConversionReporter", "Error sending ping", e);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            } else {
                Log.e("GoogleConversionReporter", "Ping failed; too many redirects.");
                return 1;
            }
        }
    }

    protected void b(d dVar) {
        if (dVar.b || !dVar.a) {
            return;
        }
        g.a(this.c, dVar.e, dVar.f);
    }
}
