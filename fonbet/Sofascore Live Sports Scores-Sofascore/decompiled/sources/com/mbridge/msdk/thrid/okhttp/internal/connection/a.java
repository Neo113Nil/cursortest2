package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.ironsource.C4094gc;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a implements t {
    public final v a;

    public a(v vVar) {
        this.a = vVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.http.g gVar = (com.mbridge.msdk.thrid.okhttp.internal.http.g) aVar;
        y d = gVar.d();
        g i = gVar.i();
        return gVar.a(d, i, i.a(this.a, aVar, !d.e().equals(C4094gc.a)), i.c());
    }
}
