package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0568w1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f14809a;

    public RunnableC0568w1(Context context) {
        this.f14809a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Qj qj = AbstractC0387oj.f14425a;
        Context context = this.f14809a;
        synchronized (qj) {
            try {
                if (qj.f12782b == null) {
                    qj.f12782b = AbstractC0361ni.f14365a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    Iterator it = qj.f12781a.iterator();
                    while (it.hasNext()) {
                        ((Qa) it.next()).a(qj.f12782b);
                    }
                    qj.f12781a.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
