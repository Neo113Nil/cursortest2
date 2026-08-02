package com.vungle.ads.internal.network;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import defpackage.ah2;
import defpackage.b2g;
import defpackage.d2g;
import defpackage.h2g;
import defpackage.i2g;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.x52;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m {
    public final ah2 a;
    public final com.vungle.ads.internal.network.converters.a b;

    static {
        new h();
    }

    public m(ah2 ah2Var, com.vungle.ads.internal.network.converters.a aVar) {
        ah2Var.getClass();
        aVar.getClass();
        this.a = ah2Var;
        this.b = aVar;
    }

    public final o a(d2g d2gVar) {
        i2g i2gVar = d2gVar.g;
        if (i2gVar == null) {
            return null;
        }
        b2g k = d2gVar.k();
        k.g = new k(i2gVar.contentType(), i2gVar.contentLength());
        d2g a = k.a();
        int i = a.d;
        if (i >= 200 && i < 300) {
            if (i == 204 || i == 205) {
                i2gVar.close();
                return n.a(null, a);
            }
            j jVar = new j(i2gVar);
            try {
                return n.a(this.b.a(jVar), a);
            } catch (Throwable th) {
                jVar.a();
                throw th;
            }
        }
        try {
            i2gVar.source().y0(new x52());
            h2g h2gVar = i2g.Companion;
            i2gVar.contentType();
            i2gVar.contentLength();
            h2gVar.getClass();
            o a2 = n.a(a);
            i2gVar.close();
            return a2;
        } finally {
        }
    }

    public final void a(a aVar) {
        ah2 ah2Var;
        aVar.getClass();
        synchronized (this) {
            ah2Var = this.a;
            Unit unit = Unit.a;
        }
        FirebasePerfOkHttpClient.enqueue(ah2Var, new l(this, aVar));
    }

    public final o a() {
        ah2 ah2Var;
        Object u2gVar;
        synchronized (this) {
            ah2Var = this.a;
            Unit unit = Unit.a;
        }
        try {
            p2g p2gVar = w2g.b;
            u2gVar = a(FirebasePerfOkHttpClient.execute(ah2Var));
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("[execute] Failed to parse response:  ");
            a2.append(a.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("OkHttpCall", a2.toString());
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        return (o) u2gVar;
    }
}
