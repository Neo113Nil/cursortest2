package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import io.sentry.android.core.h0;
import io.sentry.n0;
import io.sentry.o0;
import io.sentry.r;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f15694b;

    public /* synthetic */ a(c cVar, int i5) {
        this.f15693a = i5;
        this.f15694b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r a7;
        r a10;
        switch (this.f15693a) {
            case 0:
                c cVar = this.f15694b;
                cVar.K(true);
                a7 = c.f15698n.a();
                try {
                    c.f15699o.clear();
                    a7.close();
                    a10 = c.f15696l.a();
                    try {
                        c.f15697m = null;
                        a10.close();
                        h0.f15617e.r(cVar);
                        return;
                    } finally {
                        try {
                            a10.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                } finally {
                    try {
                        a7.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            case 1:
                this.f15694b.r();
                return;
            case 2:
                this.f15694b.K(false);
                return;
            default:
                c cVar2 = this.f15694b;
                cVar2.N(null);
                n0 t3 = cVar2.t();
                if (t3 == n0.DISCONNECTED) {
                    cVar2.f15710k.set(false);
                    a7 = c.f15698n.a();
                    try {
                        Iterator it = c.f15699o.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                        }
                        a7.close();
                    } finally {
                    }
                }
                a10 = cVar2.f15706f.a();
                try {
                    Iterator it2 = cVar2.f15705e.iterator();
                    while (it2.hasNext()) {
                        ((o0) it2.next()).r(t3);
                    }
                    a10.close();
                    cVar2.r();
                    return;
                } finally {
                }
        }
    }
}
