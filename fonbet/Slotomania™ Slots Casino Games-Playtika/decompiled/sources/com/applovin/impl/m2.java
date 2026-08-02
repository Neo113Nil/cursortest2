package com.applovin.impl;

import com.applovin.impl.f6;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class m2 {
    private static boolean a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.l lVar) {
        if (a) {
            return;
        }
        lVar.E().a(f2.b1, "no_ads_loaded");
    }

    public static void b(final com.applovin.impl.sdk.l lVar) {
        Long l = (Long) lVar.a(t3.z8);
        if (l.longValue() <= 0) {
            return;
        }
        lVar.s0().a(new u6(lVar, true, "submitIntegrationErrorReport", new Runnable() { // from class: com.applovin.impl.m2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                m2.a(com.applovin.impl.sdk.l.this);
            }
        }), f6.b.OTHER, TimeUnit.SECONDS.toMillis(l.longValue()));
    }

    public static void a() {
        a = true;
    }
}
