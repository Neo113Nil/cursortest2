package com.mbridge.msdk.tracker.network.toolbox;

import android.os.SystemClock;
import com.ironsource.Fb;
import com.ironsource.Ua;
import com.mbridge.msdk.tracker.network.a0;
import com.mbridge.msdk.tracker.network.b;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.c0;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.x;
import com.mbridge.msdk.tracker.network.y;
import com.mbridge.msdk.tracker.network.z;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
final class k {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class b {
        final String a;
        final b0 b;

        private b(String str, b0 b0Var) {
            this.a = str;
            this.b = b0Var;
        }
    }

    public static b a(t<?> tVar, IOException iOException, long j, g gVar, byte[] bArr) throws b0 {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new z());
        }
        if (iOException instanceof MalformedURLException) {
            throw new com.mbridge.msdk.tracker.network.a("Bad URL " + tVar.t());
        }
        if (gVar == null) {
            if (!tVar.A()) {
                throw new r(iOException);
            }
            return new b("connection", new r());
        }
        int d = gVar.d();
        c0.c("Unexpected response code %d for %s", Integer.valueOf(d), tVar.t());
        if (bArr == null) {
            com.mbridge.msdk.tracker.network.o oVar = new com.mbridge.msdk.tracker.network.o();
            oVar.a(d);
            return new b("network", oVar);
        }
        q qVar = new q(d, bArr, false, SystemClock.elapsedRealtime() - j, gVar.c());
        if (d >= 400 && d <= 499) {
            com.mbridge.msdk.tracker.network.d dVar = new com.mbridge.msdk.tracker.network.d(qVar);
            dVar.a(d);
            throw dVar;
        }
        y yVar = new y(qVar);
        yVar.a(d);
        if (d < 500) {
            throw yVar;
        }
        if (d > 599) {
            throw yVar;
        }
        if (tVar.B()) {
            return new b(Fb.a, yVar);
        }
        throw yVar;
    }

    public static q a(t<?> tVar, long j, List<com.mbridge.msdk.tracker.network.g> list) {
        b.a d = tVar.d();
        if (d == null) {
            return new q(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, null, true, j, list);
        }
        return new q(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, d.a, true, j, f.a(list, d));
    }

    public static byte[] a(InputStream inputStream, int i, c cVar, p pVar) throws IOException {
        byte[] bArr;
        n nVar = new n(cVar, i);
        a(pVar);
        try {
            bArr = cVar.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    nVar.write(bArr, 0, read);
                    a(pVar, read);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            c0.d("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    cVar.a(bArr);
                    nVar.close();
                    throw th;
                }
            }
            byte[] byteArray = nVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                c0.d("Error occurred when closing InputStream", new Object[0]);
            }
            cVar.a(bArr);
            nVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    private static void a(p pVar) {
        if (pVar != null) {
            pVar.c(0L);
        }
    }

    private static void a(p pVar, int i) {
        if (pVar != null) {
            pVar.c(pVar.B() + i);
        }
    }

    public static void a(t<?> tVar, b bVar) throws b0 {
        if (tVar == null) {
            throw new a0("request is null when retrying");
        }
        if (bVar != null) {
            x o = tVar.o();
            b0 b0Var = bVar.b;
            if (o != null) {
                if (!o.a(b0Var)) {
                    throw bVar.b;
                }
                return;
            }
            throw b0Var;
        }
        throw new a0("retry info is null when retrying");
    }

    public static void a(long j, t<?> tVar, byte[] bArr, int i) {
        if (j > Ua.C) {
            c0.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", tVar, Long.valueOf(j), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i), Integer.valueOf(tVar.o().c()));
        }
    }
}
