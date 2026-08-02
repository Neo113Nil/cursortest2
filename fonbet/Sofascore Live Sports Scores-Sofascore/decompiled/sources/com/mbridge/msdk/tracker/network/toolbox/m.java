package com.mbridge.msdk.tracker.network.toolbox;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.t;
import defpackage.a70;
import defpackage.is8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class m extends a {
    private final v a = a();

    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    public g a(t<?> tVar, Map<String, String> map) throws IOException {
        p h = tVar.h();
        if (this.a == null) {
            is8.e("okhttp client is null");
            return null;
        }
        int q = tVar.q() <= 0 ? 30000 : tVar.q();
        long r = tVar.r();
        String a = tVar.g() == 0 ? d.a(tVar.t(), tVar) : tVar.t();
        if (h != null) {
            h.f(a);
            long j = q;
            h.e(j);
            h.f(j);
            h.j(j);
            h.a(tVar.n());
        }
        a(tVar, h);
        ArrayList arrayList = new ArrayList();
        arrayList.add(w.HTTP_1_1);
        arrayList.add(w.HTTP_2);
        v.b a2 = this.a.s().a(arrayList).a(new MBridgeHostnameVerifier(a));
        long j2 = q;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        v.b a3 = a2.d(j2, timeUnit).b(j2, timeUnit).a(h == null ? com.mbridge.msdk.thrid.okhttp.n.a : new j(h.H(), h.b(), h)).e(j2, timeUnit).a(Math.max(r, 0L), timeUnit);
        a(h, a3);
        y.a aVar = new y.a();
        for (Map.Entry<String, String> entry : tVar.f().entrySet()) {
            aVar.a(entry.getKey(), entry.getValue());
        }
        aVar.a("Connection", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        a(aVar, tVar);
        a0 d = a3.a().a(aVar.b(a).a()).d();
        r m = d.m();
        ArrayList arrayList2 = new ArrayList();
        int b = m.b();
        for (int i = 0; i < b; i++) {
            String a4 = m.a(i);
            String b2 = m.b(i);
            if (a4 != null) {
                arrayList2.add(new com.mbridge.msdk.tracker.network.g(a4, b2));
            }
        }
        b0 d2 = d.d();
        return d2 == null ? new g(d.k(), arrayList2) : new g(d.k(), arrayList2, a(d2), d2.d());
    }

    private static z a(t tVar) {
        byte[] b;
        if (tVar == null || (b = tVar.b()) == null) {
            return null;
        }
        return z.a(null, b);
    }

    private static void a(p pVar, v.b bVar) {
        if (pVar == null || bVar == null) {
            return;
        }
        try {
            bVar.a(new OKHTTPEventListener(pVar));
        } catch (Exception unused) {
        }
    }

    private static void a(t<?> tVar, p pVar) {
        if (pVar == null || tVar == null) {
            return;
        }
        try {
            pVar.g(tVar.m());
        } catch (Exception unused) {
        }
    }

    private int a(b0 b0Var) {
        if (b0Var == null) {
            return 0;
        }
        if (b0Var.k() > 2147483647L) {
            return -1;
        }
        return (int) b0Var.k();
    }

    private v a() {
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        ThreadFactory a = com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        com.mbridge.msdk.thrid.okhttp.m mVar = new com.mbridge.msdk.thrid.okhttp.m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, a));
        mVar.b(50);
        mVar.a(NotificationCompat.FLAG_LOCAL_ONLY);
        v.b bVar = new v.b();
        bVar.d(30L, timeUnit);
        bVar.b(30L, timeUnit);
        bVar.e(30L, timeUnit);
        bVar.b(true);
        bVar.a(new com.mbridge.msdk.thrid.okhttp.i(32, 5L, TimeUnit.MINUTES));
        bVar.a(mVar);
        return bVar.a();
    }

    private static void a(y.a aVar, t<?> tVar) throws IOException {
        switch (tVar.g()) {
            case 0:
                aVar.c();
                break;
            case 1:
                z a = a(tVar);
                if (a != null) {
                    aVar.c(a);
                    break;
                } else {
                    is8.e("can't create request body for post");
                    break;
                }
            case 2:
                z a2 = a(tVar);
                if (a2 != null) {
                    aVar.d(a2);
                    break;
                } else {
                    is8.e("can't create request body for put");
                    break;
                }
            case 3:
                aVar.b();
                break;
            case 4:
                aVar.d();
                break;
            case 5:
                aVar.a("OPTIONS", (z) null);
                break;
            case 6:
                aVar.a("TRACE", (z) null);
                break;
            case 7:
                z a3 = a(tVar);
                if (a3 != null) {
                    aVar.b(a3);
                    break;
                } else {
                    is8.e("can't create request body for patch");
                    break;
                }
            default:
                a70.r("Unknown method type.");
                break;
        }
    }
}
