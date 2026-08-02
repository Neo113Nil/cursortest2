package com.moloco.sdk.acm.db;

import defpackage.mni;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h implements Callable {
    public final /* synthetic */ j a;

    public h(j jVar) {
        this.a = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        j jVar = this.a;
        g gVar = jVar.d;
        mni a = gVar.a();
        MetricsDb_Impl metricsDb_Impl = jVar.a;
        metricsDb_Impl.beginTransaction();
        try {
            a.F();
            metricsDb_Impl.setTransactionSuccessful();
            return Unit.a;
        } finally {
            metricsDb_Impl.endTransaction();
            gVar.m(a);
        }
    }
}
