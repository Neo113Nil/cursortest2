package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import io.sentry.b5;
import io.sentry.n0;
import io.sentry.o0;
import io.sentry.r;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f15695a;

    public b(c cVar) {
        this.f15695a = cVar;
    }

    public final void a() {
        this.f15695a.f15710k.set(false);
        r a7 = this.f15695a.f15706f.a();
        try {
            this.f15695a.f15708h = null;
            this.f15695a.f15709i = null;
            c cVar = this.f15695a;
            cVar.f15704d.getClass();
            cVar.j = SystemClock.uptimeMillis();
            this.f15695a.f15702b.getLogger().h(b5.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
            Iterator it = this.f15695a.f15705e.iterator();
            while (it.hasNext()) {
                ((o0) it.next()).r(n0.DISCONNECTED);
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f15695a.f15709i = network;
        if (this.f15695a.f15710k.getAndSet(true)) {
            return;
        }
        r a7 = c.f15698n.a();
        try {
            Iterator it = c.f15699o.iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009a A[Catch: all -> 0x00a4, LOOP:0: B:16:0x0094->B:18:0x009a, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:15:0x008e, B:16:0x0094, B:18:0x009a), top: B:14:0x008e }] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        n0 t3;
        r a7;
        Iterator it;
        if (!network.equals(this.f15695a.f15709i)) {
            return;
        }
        NetworkCapabilities networkCapabilities2 = this.f15695a.f15708h;
        try {
            try {
                if ((networkCapabilities2 == null) == (networkCapabilities == null)) {
                    if (networkCapabilities2 != null || networkCapabilities != null) {
                        int[] iArr = c.q;
                        int length = iArr.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                int i10 = iArr[i5];
                                if (i10 != 0 && networkCapabilities2.hasCapability(i10) != networkCapabilities.hasCapability(i10)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else {
                                for (int i11 : c.f15700p) {
                                    if (networkCapabilities2.hasTransport(i11) == networkCapabilities.hasTransport(i11)) {
                                    }
                                }
                            }
                        }
                    }
                    a7 = c.f15698n.a();
                    it = c.f15699o.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onCapabilitiesChanged(network, networkCapabilities);
                    }
                    a7.close();
                    return;
                }
                it = c.f15699o.iterator();
                while (it.hasNext()) {
                }
                a7.close();
                return;
            } finally {
            }
            Iterator it2 = this.f15695a.f15705e.iterator();
            while (it2.hasNext()) {
                ((o0) it2.next()).r(t3);
            }
            a7.close();
            a7 = c.f15698n.a();
        } finally {
        }
        this.f15695a.N(networkCapabilities);
        t3 = this.f15695a.t();
        a7 = this.f15695a.f15706f.a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        if (network.equals(this.f15695a.f15709i)) {
            a();
            r a7 = c.f15698n.a();
            try {
                Iterator it = c.f15699o.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                }
                a7.close();
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        a();
        r a7 = c.f15698n.a();
        try {
            Iterator it = c.f15699o.iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
