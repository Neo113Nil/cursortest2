package com.mbridge.msdk.thrid.okhttp.internal.cache;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.internal.cache.b;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.sofascore.model.mvvm.model.PlayerKt;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a implements t {
    public a(c cVar) {
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || PlayerKt.AMERICAN_FOOTBALL_TIGHT_END.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        b c = new b.a(System.currentTimeMillis(), aVar.d(), null).c();
        y yVar = c.a;
        a0 a0Var = c.b;
        if (yVar == null && a0Var == null) {
            return new a0.a().a(aVar.d()).a(w.HTTP_1_1).a(PglCryptUtils.BASE64_FAILED).a("Unsatisfiable Request (only-if-cached)").a(com.mbridge.msdk.thrid.okhttp.internal.c.c).b(-1L).a(System.currentTimeMillis()).a();
        }
        if (yVar == null) {
            return a0Var.p().a(a(a0Var)).a();
        }
        a0 a = aVar.a(yVar);
        if (a0Var != null) {
            if (a.k() == 304) {
                a0Var.p().a(a(a0Var.m(), a.m())).b(a.t()).a(a.r()).a(a(a0Var)).c(a(a)).a();
                a.d().close();
                throw null;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(a0Var.d());
        }
        return a.p().a(a(a0Var)).c(a(a)).a();
    }

    private static a0 a(a0 a0Var) {
        return (a0Var == null || a0Var.d() == null) ? a0Var : a0Var.p().a((b0) null).a();
    }

    private static r a(r rVar, r rVar2) {
        r.a aVar = new r.a();
        int b = rVar.b();
        for (int i = 0; i < b; i++) {
            String a = rVar.a(i);
            String b2 = rVar.b(i);
            if ((!"Warning".equalsIgnoreCase(a) || !b2.startsWith("1")) && (a(a) || !b(a) || rVar2.b(a) == null)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.a.a(aVar, a, b2);
            }
        }
        int b3 = rVar2.b();
        for (int i2 = 0; i2 < b3; i2++) {
            String a2 = rVar2.a(i2);
            if (!a(a2) && b(a2)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.a.a(aVar, a2, rVar2.b(i2));
            }
        }
        return aVar.a();
    }

    public static boolean a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }
}
