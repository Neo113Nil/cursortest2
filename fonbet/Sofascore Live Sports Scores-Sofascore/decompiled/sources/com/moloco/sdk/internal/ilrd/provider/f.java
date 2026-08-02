package com.moloco.sdk.internal.ilrd.provider;

import android.content.Context;
import com.moloco.sdk.internal.ilrd.m;
import com.moloco.sdk.internal.ilrd.p;
import com.moloco.sdk.internal.ilrd.q;
import com.moloco.sdk.internal.ilrd.r;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
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
public final class f implements m {
    public final Context a;
    public final ad2 b;
    public final mqi d;
    public final mqi e;
    public final com.moloco.sdk.internal.ilrd.model.a c = com.moloco.sdk.internal.ilrd.model.a.b;
    public final fdi f = gdi.a(r.a);
    public final aeh g = beh.b(0, 0, null, 7);

    public f(Context context, ad2 ad2Var) {
        this.a = context;
        this.b = ad2Var;
        final int i = 0;
        this.d = ypa.b(new Function0(this) { // from class: com.moloco.sdk.internal.ilrd.provider.d
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                f fVar = this.b;
                switch (i2) {
                    case 0:
                        return un0.u(fVar.f);
                    default:
                        return un0.t(fVar.g);
                }
            }
        });
        final int i2 = 1;
        this.e = ypa.b(new Function0(this) { // from class: com.moloco.sdk.internal.ilrd.provider.d
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        return un0.u(fVar.f);
                    default:
                        return un0.t(fVar.g);
                }
            }
        });
    }

    @Override // com.moloco.sdk.internal.ilrd.m
    public final com.moloco.sdk.internal.ilrd.model.a a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #1 {all -> 0x0043, blocks: (B:4:0x001b, B:6:0x0021, B:7:0x002a, B:9:0x0031, B:10:0x0045, B:12:0x0049, B:17:0x0024, B:20:0x0013, B:3:0x0001), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:4:0x001b, B:6:0x0021, B:7:0x002a, B:9:0x0031, B:10:0x0045, B:12:0x0049, B:17:0x0024, B:20:0x0013, B:3:0x0001), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:4:0x001b, B:6:0x0021, B:7:0x002a, B:9:0x0031, B:10:0x0045, B:12:0x0049, B:17:0x0024, B:20:0x0013, B:3:0x0001), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:4:0x001b, B:6:0x0021, B:7:0x002a, B:9:0x0031, B:10:0x0045, B:12:0x0049, B:17:0x0024, B:20:0x0013, B:3:0x0001), top: B:2:0x0001, inners: #0 }] */
    @Override // com.moloco.sdk.internal.ilrd.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Object b() {
        Object obj;
        Object u2gVar;
        Throwable a;
        try {
            try {
                p2g p2gVar = w2g.b;
                LevelPlay levelPlay = LevelPlay.INSTANCE;
                LevelPlayImpressionData.a aVar = LevelPlayImpressionData.Companion;
                LevelPlay.addImpressionDataListener(new e(this));
                obj = Unit.a;
            } finally {
                Throwable a2 = w2g.a(obj);
                if (a2 != null) {
                }
                a = w2g.a(u2gVar);
                if (a != null) {
                }
                if (!(u2gVar instanceof u2g)) {
                }
                return u2gVar;
            }
            Throwable a22 = w2g.a(obj);
            u2gVar = a22 != null ? Unit.a : new u2g(a22);
            a = w2g.a(u2gVar);
            if (a != null) {
                fdi fdiVar = this.f;
                p pVar = new p(a.toString());
                fdiVar.getClass();
                fdiVar.m(null, pVar);
            }
            if (!(u2gVar instanceof u2g)) {
                fdi fdiVar2 = this.f;
                q qVar = q.a;
                fdiVar2.getClass();
                fdiVar2.m(null, qVar);
            }
        } catch (Throwable th) {
        }
        return u2gVar;
    }

    @Override // com.moloco.sdk.internal.ilrd.m
    public final xdh c() {
        return (xdh) this.e.getValue();
    }

    @Override // com.moloco.sdk.internal.ilrd.m
    public final ddi getState() {
        return (ddi) this.d.getValue();
    }
}
