package com.moloco.sdk.internal.ilrd.provider;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import com.moloco.sdk.internal.ilrd.m;
import com.moloco.sdk.internal.ilrd.p;
import com.moloco.sdk.internal.ilrd.q;
import com.moloco.sdk.internal.ilrd.r;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.beh;
import defpackage.ddi;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.mqi;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.un0;
import defpackage.w2g;
import defpackage.xdh;
import defpackage.ypa;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c implements m {
    public final Context a;
    public final mqi c;
    public final mqi d;
    public final com.moloco.sdk.internal.ilrd.model.a b = com.moloco.sdk.internal.ilrd.model.a.a;
    public final fdi e = gdi.a(r.a);
    public final aeh f = beh.b(0, 0, null, 7);

    public c(Context context, ad2 ad2Var) {
        this.a = context;
        final int i = 0;
        this.c = ypa.b(new Function0(this) { // from class: com.moloco.sdk.internal.ilrd.provider.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                c cVar = this.b;
                switch (i2) {
                    case 0:
                        return un0.u(cVar.e);
                    default:
                        return un0.t(cVar.f);
                }
            }
        });
        final int i2 = 1;
        this.d = ypa.b(new Function0(this) { // from class: com.moloco.sdk.internal.ilrd.provider.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                c cVar = this.b;
                switch (i22) {
                    case 0:
                        return un0.u(cVar.e);
                    default:
                        return un0.t(cVar.f);
                }
            }
        });
    }

    @Override // com.moloco.sdk.internal.ilrd.m
    public final com.moloco.sdk.internal.ilrd.model.a a() {
        return this.b;
    }

    @Override // com.moloco.sdk.internal.ilrd.m
    public final synchronized Object b() {
        Object d;
        try {
            d = d();
            Throwable a = w2g.a(d);
            if (a != null) {
                fdi fdiVar = this.e;
                p pVar = new p(a.toString());
                fdiVar.getClass();
                fdiVar.m(null, pVar);
            }
            if (!(d instanceof u2g)) {
                fdi fdiVar2 = this.e;
                q qVar = q.a;
                fdiVar2.getClass();
                fdiVar2.m(null, qVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    @Override // com.moloco.sdk.internal.ilrd.m
    public final xdh c() {
        return (xdh) this.d.getValue();
    }

    public final Object d() {
        AppLovinCommunicator u2gVar;
        try {
            p2g p2gVar = w2g.b;
            Class.forName("com.applovin.communicator.AppLovinCommunicator");
            Class.forName("com.applovin.communicator.AppLovinCommunicatorMessage");
            try {
                u2gVar = AppLovinCommunicator.getInstance();
            } catch (Throwable unused) {
                u2gVar = AppLovinCommunicator.getInstance(this.a);
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            return new u2g(a);
        }
        u2gVar.subscribe(new b(), "max_revenue_events");
        return Unit.a;
    }

    @Override // com.moloco.sdk.internal.ilrd.m
    public final ddi getState() {
        return (ddi) this.c.getValue();
    }
}
