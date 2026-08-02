package com.moloco.sdk.acm.db;

import defpackage.fc6;
import defpackage.mni;
import defpackage.pea;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i implements Callable {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ j b;

    public i(j jVar, ArrayList arrayList) {
        this.b = jVar;
        this.a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        StringBuilder q = fc6.q("DELETE FROM events WHERE id IN (");
        ArrayList arrayList = this.a;
        pea.m(arrayList.size(), q);
        q.append(")");
        String sb = q.toString();
        MetricsDb_Impl metricsDb_Impl = this.b.a;
        mni compileStatement = metricsDb_Impl.compileStatement(sb);
        Iterator it = arrayList.iterator();
        int i = 1;
        while (it.hasNext()) {
            compileStatement.q(i, ((Long) it.next()).longValue());
            i++;
        }
        metricsDb_Impl.beginTransaction();
        try {
            compileStatement.F();
            metricsDb_Impl.setTransactionSuccessful();
            return Unit.a;
        } finally {
            metricsDb_Impl.endTransaction();
        }
    }
}
