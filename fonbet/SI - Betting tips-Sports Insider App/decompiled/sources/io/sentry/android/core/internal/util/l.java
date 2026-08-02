package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import io.sentry.b5;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f15738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Window f15739c;

    public /* synthetic */ l(p pVar, Window window, int i5) {
        this.f15737a = i5;
        this.f15738b = pVar;
        this.f15739c = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15737a) {
            case 0:
                p pVar = this.f15738b;
                CopyOnWriteArraySet copyOnWriteArraySet = pVar.f15747b;
                Window window = this.f15739c;
                if (copyOnWriteArraySet.add(window)) {
                    try {
                        d dVar = pVar.f15753h;
                        n nVar = pVar.f15754i;
                        Handler handler = pVar.f15749d;
                        dVar.getClass();
                        com.appsflyer.internal.h.a(window, nVar, handler);
                        break;
                    } catch (Throwable th2) {
                        pVar.f15748c.e(b5.ERROR, "Failed to add frameMetricsAvailableListener", th2);
                        return;
                    }
                }
                break;
            default:
                p pVar2 = this.f15738b;
                Window window2 = this.f15739c;
                try {
                    if (pVar2.f15747b.remove(window2)) {
                        d dVar2 = pVar2.f15753h;
                        n nVar2 = pVar2.f15754i;
                        dVar2.getClass();
                        com.appsflyer.internal.h.b(window2, nVar2);
                        break;
                    }
                } catch (Throwable th3) {
                    pVar2.f15748c.e(b5.ERROR, "Failed to remove frameMetricsAvailableListener", th3);
                }
                break;
        }
    }
}
