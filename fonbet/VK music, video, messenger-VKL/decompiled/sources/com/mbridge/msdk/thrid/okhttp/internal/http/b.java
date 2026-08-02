package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.l;
import com.mbridge.msdk.thrid.okio.r;
import java.io.IOException;
import java.net.ProtocolException;
import xsna.ji;

/* compiled from: CallServerInterceptor.java */
/* loaded from: classes14.dex */
public final class b implements t {
    private final boolean a;

    /* compiled from: CallServerInterceptor.java */
    public static final class a extends com.mbridge.msdk.thrid.okio.g {
        long b;

        public a(r rVar) {
            super(rVar);
        }

        @Override // com.mbridge.msdk.thrid.okio.g, com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            super.a(cVar, j);
            this.b += j;
        }
    }

    public b(boolean z) {
        this.a = z;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        g gVar = (g) aVar;
        c h = gVar.h();
        com.mbridge.msdk.thrid.okhttp.internal.connection.g i = gVar.i();
        com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar = (com.mbridge.msdk.thrid.okhttp.internal.connection.c) gVar.f();
        y d = gVar.d();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.g().requestHeadersStart(gVar.e());
        h.a(d);
        gVar.g().requestHeadersEnd(gVar.e(), d);
        a0.a aVar2 = null;
        if (f.a(d.e()) && d.a() != null) {
            if ("100-continue".equalsIgnoreCase(d.a("Expect"))) {
                h.b();
                gVar.g().responseHeadersStart(gVar.e());
                aVar2 = h.a(true);
            }
            if (aVar2 == null) {
                gVar.g().requestBodyStart(gVar.e());
                a aVar3 = new a(h.a(d, d.a().a()));
                com.mbridge.msdk.thrid.okio.d a2 = l.a(aVar3);
                d.a().a(a2);
                a2.close();
                gVar.g().requestBodyEnd(gVar.e(), aVar3.b);
            } else if (!cVar.f()) {
                i.e();
            }
        }
        h.a();
        if (aVar2 == null) {
            gVar.g().responseHeadersStart(gVar.e());
            aVar2 = h.a(false);
        }
        a0 a3 = aVar2.a(d).a(i.c().b()).b(currentTimeMillis).a(System.currentTimeMillis()).a();
        int k = a3.k();
        if (k == 100) {
            a3 = h.a(false).a(d).a(i.c().b()).b(currentTimeMillis).a(System.currentTimeMillis()).a();
            k = a3.k();
        }
        gVar.g().responseHeadersEnd(gVar.e(), a3);
        a0 a4 = (this.a && k == 101) ? a3.p().a(com.mbridge.msdk.thrid.okhttp.internal.c.c).a() : a3.p().a(h.a(a3)).a();
        if (CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(a4.s().a("Connection")) || CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(a4.b("Connection"))) {
            i.e();
        }
        if ((k != 204 && k != 205) || a4.d().k() <= 0) {
            return a4;
        }
        StringBuilder b = ji.b(k, "HTTP ", " had non-zero Content-Length: ");
        b.append(a4.d().k());
        throw new ProtocolException(b.toString());
    }
}
