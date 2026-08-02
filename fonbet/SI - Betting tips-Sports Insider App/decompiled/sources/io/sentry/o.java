package io.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f16682b;

    public o(q qVar, ArrayList arrayList) {
        this.f16682b = qVar;
        this.f16681a = arrayList;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        q qVar = this.f16682b;
        if (currentTimeMillis - qVar.f16971i <= 10) {
            return;
        }
        ArrayList arrayList = this.f16681a;
        arrayList.clear();
        qVar.f16971i = currentTimeMillis;
        d3 d3Var = new d3(qVar.f16969g.getDateProvider().a().d());
        Iterator it = qVar.f16966d.iterator();
        while (it.hasNext()) {
            ((x0) it.next()).a(d3Var);
        }
        for (p pVar : qVar.f16965c.values()) {
            ArrayList arrayList2 = pVar.f16714a;
            k1 k1Var = pVar.f16715b;
            arrayList2.add(d3Var);
            if (k1Var != null) {
                if (pVar.f16717d.f16969g.getDateProvider().a().d() > TimeUnit.MILLISECONDS.toNanos(30000L) + pVar.f16716c) {
                    arrayList.add(k1Var);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            qVar.f((k1) it2.next());
        }
    }
}
