package com.mbridge.msdk.tracker.network.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.C4094gc;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b implements com.mbridge.msdk.tracker.network.m {
    private final a a;
    protected final c b;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    private static p b(t<?> tVar) {
        if (tVar == null) {
            return null;
        }
        try {
            if (!tVar.a() || TextUtils.isEmpty(tVar.t())) {
                return null;
            }
            p pVar = new p(tVar.p(), tVar.g() == 0 ? C4094gc.a : C4094gc.b);
            pVar.d("queue");
            pVar.e(tVar.d("local_id"));
            pVar.a(tVar.d("ad_type"));
            pVar.i(tVar.r());
            tVar.a(pVar);
            return pVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    @Override // com.mbridge.msdk.tracker.network.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q a(t<?> tVar) throws b0 {
        g gVar;
        byte[] bArr;
        IOException iOException;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        p b = b(tVar);
        while (true) {
            try {
                gVar = this.a.a(tVar, f.a(tVar.d()));
            } catch (IOException e) {
                e = e;
                gVar = null;
                bArr = null;
            }
            try {
                int d = gVar.d();
                a(b, d);
                List<com.mbridge.msdk.tracker.network.g> c = gVar.c();
                if (d == 304) {
                    return k.a(tVar, SystemClock.elapsedRealtime() - elapsedRealtime, c);
                }
                InputStream a = gVar.a();
                byte[] a2 = a != null ? k.a(a, gVar.b(), this.b, b) : new byte[0];
                try {
                    k.a(SystemClock.elapsedRealtime() - elapsedRealtime, tVar, a2, d);
                    if (d < 200 || d > 299) {
                        throw new IOException();
                    }
                    a(b, 1, null);
                    return new q(d, a2, false, SystemClock.elapsedRealtime() - elapsedRealtime, c);
                } catch (IOException e2) {
                    iOException = e2;
                    bArr = a2;
                    a(b, !TextUtils.equals(iOException.getMessage(), "timeout") ? 3 : 2, iOException);
                    k.a(tVar, k.a(tVar, iOException, elapsedRealtime, gVar, bArr));
                }
            } catch (IOException e3) {
                e = e3;
                bArr = null;
                iOException = e;
                a(b, !TextUtils.equals(iOException.getMessage(), "timeout") ? 3 : 2, iOException);
                k.a(tVar, k.a(tVar, iOException, elapsedRealtime, gVar, bArr));
            }
            a(b, !TextUtils.equals(iOException.getMessage(), "timeout") ? 3 : 2, iOException);
            k.a(tVar, k.a(tVar, iOException, elapsedRealtime, gVar, bArr));
        }
    }

    public b(a aVar, c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    private static void a(p pVar, int i, Exception exc) {
        if (pVar != null) {
            try {
                pVar.a(exc);
                pVar.a(i);
            } catch (Exception unused) {
            }
        }
    }

    private static void a(p pVar, int i) {
        if (pVar != null) {
            try {
                pVar.b(i);
            } catch (Exception unused) {
            }
        }
    }
}
