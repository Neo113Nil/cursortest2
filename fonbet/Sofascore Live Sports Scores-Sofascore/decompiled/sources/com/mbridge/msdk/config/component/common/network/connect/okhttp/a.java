package com.mbridge.msdk.config.component.common.network.connect.okhttp;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.config.component.common.network.listener.EventListenerOKHttp;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.d;
import com.mbridge.msdk.thrid.okhttp.e;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.m;
import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import defpackage.a70;
import defpackage.is8;
import defpackage.w1l;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private static volatile v h;
    private com.mbridge.msdk.config.component.nori.model.a a;
    private com.mbridge.msdk.config.component.common.network.result.a b;
    private com.mbridge.msdk.config.component.common.network.a c;
    private com.mbridge.msdk.config.component.common.network.retry.a d;
    private com.mbridge.msdk.config.component.nori.monitor.a e;
    private String f;
    private d g;

    public a(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.e = aVar2.b();
    }

    private static void b(y.a aVar, com.mbridge.msdk.config.component.nori.model.a aVar2) throws IOException {
        String e = aVar2.e();
        if (e == null) {
            is8.e("Request method cannot be null");
            return;
        }
        String upperCase = e.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "OPTIONS":
                aVar.a("OPTIONS", (z) null);
                break;
            case "GET":
                aVar.c();
                break;
            case "PUT":
                Map<String, Object> a = aVar2.a();
                if (a != null && !a.isEmpty()) {
                    p.a aVar3 = new p.a();
                    for (Map.Entry<String, Object> entry : a.entrySet()) {
                        aVar3.a(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                    aVar.d(aVar3.a());
                    break;
                }
                break;
            case "HEAD":
                aVar.d();
                break;
            case "POST":
                Map<String, Object> a2 = aVar2.a();
                p.a aVar4 = new p.a();
                if (a2 != null && !a2.isEmpty()) {
                    for (Map.Entry<String, Object> entry2 : a2.entrySet()) {
                        aVar4.a(entry2.getKey(), String.valueOf(entry2.getValue()));
                    }
                }
                aVar.c(aVar4.a());
                break;
            case "PATCH":
                Map<String, Object> a3 = aVar2.a();
                if (a3 != null && !a3.isEmpty()) {
                    p.a aVar5 = new p.a();
                    for (Map.Entry<String, Object> entry3 : a3.entrySet()) {
                        aVar5.a(entry3.getKey(), String.valueOf(entry3.getValue()));
                    }
                    aVar.b(aVar5.a());
                    break;
                }
                break;
            case "TRACE":
                aVar.a("TRACE", (z) null);
                break;
            case "DELETE":
                aVar.b();
                break;
            default:
                a70.r("Unknown method type: ".concat(e));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.c == null) {
            return;
        }
        if (c.a(this.b.g())) {
            this.c.b(this.b);
            return;
        }
        if (this.b.g() == 200) {
            this.c.c(this.b);
            com.mbridge.msdk.config.component.common.network.retry.a aVar = this.d;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        com.mbridge.msdk.config.component.common.network.retry.a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.b();
        } else if (this.a.g() <= 0) {
            this.c.d(this.b);
        } else {
            this.e.a(true);
            new com.mbridge.msdk.config.component.common.network.retry.c(this.f, this.a, this.c, this.b).c();
        }
    }

    public com.mbridge.msdk.config.component.common.network.result.a a(String str) {
        this.f = str;
        com.mbridge.msdk.config.component.nori.monitor.a aVar = this.e;
        if (aVar != null) {
            aVar.m();
        }
        d b = b(str, this.a);
        this.g = b;
        if (b != null) {
            b.a(new C1232a());
            return this.b;
        }
        q0.b("OkHttpClientConnection", "");
        this.b.c(1002);
        this.b.a(1002);
        this.b.a("create Call fail");
        c();
        return this.b;
    }

    public void a() {
        if (this.g != null) {
            q0.b("OkHttpClientConnection", "取消当前重试任务");
            this.g.cancel();
        }
    }

    private static y a(String str, com.mbridge.msdk.config.component.nori.model.a aVar) {
        y.a b = new y.a().b(str);
        a(b, aVar);
        try {
            b(b, aVar);
        } catch (IOException e) {
            q0.b("OkHttpClientConnection", "Failed to set connection parameters: " + e.getMessage());
        }
        return b.a();
    }

    private static void a(y.a aVar, com.mbridge.msdk.config.component.nori.model.a aVar2) {
        Map<String, Object> b = aVar2.b();
        if (b != null && !b.isEmpty()) {
            for (Map.Entry<String, Object> entry : b.entrySet()) {
                aVar.b(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        aVar.a("Connection", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.d = aVar;
    }

    private void a(v vVar) {
        if (this.e == null || vVar == null) {
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) vVar.j().a();
        this.e.a(threadPoolExecutor.getPoolSize(), threadPoolExecutor.getActiveCount(), threadPoolExecutor.getQueue().size());
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.config.component.common.network.connect.okhttp.a$a, reason: collision with other inner class name */
    public class C1232a implements e {
        public C1232a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.e
        public void a(d dVar, IOException iOException) {
            if (dVar.h()) {
                a.this.b.a("Request was cancelled");
            } else if (iOException instanceof SocketTimeoutException) {
                a.this.b.c(1001);
                a.this.b.a(1001);
                a.this.b.a("Connection timeout: " + iOException.getMessage());
            } else if (iOException instanceof UnknownHostException) {
                a.this.b.c(1011);
                a.this.b.a(1011);
                a.this.b.a("Host unreachable: " + iOException.getMessage());
            } else {
                boolean z = iOException instanceof ConnectException;
                a aVar = a.this;
                if (z) {
                    aVar.b.c(1002);
                    a.this.b.a(1002);
                    a.this.b.a("Connection refused: " + iOException.getMessage());
                } else {
                    aVar.b.c(1003);
                    a.this.b.a(1003);
                    a.this.b.a("Network error: " + iOException.getMessage());
                }
            }
            a.this.b.b(0);
            a.this.c();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.e
        public void a(d dVar, a0 a0Var) throws IOException {
            a.this.b.c(a0Var.k());
            a.this.b.a(a0Var.o());
            if (c.a(a0Var.k())) {
                String b = a0Var.b("Location");
                if (b != null && !b.isEmpty()) {
                    a.this.b.b(b);
                    a.this.b.b(1);
                }
            } else if (a0Var.d() == null) {
                a.this.b.b(0);
                a.this.b.a("Response body is null");
            } else {
                a.this.b.b(a0Var.d().n());
                a.this.b.b(1);
            }
            a0Var.close();
            a.this.c();
        }
    }

    private static v b() {
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        ThreadFactory a = com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m mVar = new m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, a));
        mVar.b(50);
        mVar.a(NotificationCompat.FLAG_LOCAL_ONLY);
        ArrayList arrayList = new ArrayList();
        arrayList.add(w.HTTP_1_1);
        arrayList.add(w.HTTP_2);
        return new v.b().a(arrayList).a(new i(32, 5L, TimeUnit.MINUTES)).a(mVar).b(30L, timeUnit).d(30L, timeUnit).e(30L, timeUnit).a();
    }

    private d b(String str, com.mbridge.msdk.config.component.nori.model.a aVar) {
        try {
            if (h == null) {
                h = b();
            }
            v a = h.s().a(new EventListenerOKHttp(this.e)).a(new MBridgeHostnameVerifier(str)).a(Math.max(aVar.k(), 30L), TimeUnit.SECONDS).a(false).a();
            a(a);
            return a.a(a(str, aVar));
        } catch (Exception e) {
            w1l.v(e, new StringBuilder("Failed to create request: "), "OkHttpClientConnection");
            return null;
        }
    }
}
