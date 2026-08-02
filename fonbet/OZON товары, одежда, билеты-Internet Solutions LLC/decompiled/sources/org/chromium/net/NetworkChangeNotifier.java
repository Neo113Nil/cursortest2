package org.chromium.net;

import android.annotation.SuppressLint;
import internal.J.N;
import internal.org.jni_zero.CalledByNative;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes6.dex */
public final class NetworkChangeNotifier {

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static NetworkChangeNotifier f78630f;

    /* renamed from: c, reason: collision with root package name */
    private NetworkChangeNotifierAutoDetect f78633c;

    /* renamed from: d, reason: collision with root package name */
    private int f78634d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f78635e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Long> f78631a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final org.chromium.base.k<b> f78632b = new org.chromium.base.k<>();

    final class a implements NetworkChangeNotifierAutoDetect.g {
        a() {
        }
    }

    /* loaded from: classes10.dex */
    public interface b {
        void a();
    }

    protected NetworkChangeNotifier() {
    }

    static void a(NetworkChangeNotifier networkChangeNotifier, int i11) {
        networkChangeNotifier.f78634d = i11;
        networkChangeNotifier.d(i11, networkChangeNotifier.getCurrentDefaultNetId());
    }

    private void d(int i11, long j11) {
        Iterator<Long> it = this.f78631a.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            new q();
            int i12 = i11;
            long j12 = j11;
            N.MbPIImnU(next.longValue(), this, i12, j12);
            i11 = i12;
            j11 = j12;
        }
        Iterator<b> it2 = this.f78632b.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }

    @CalledByNative
    public static void fakeConnectionCostChanged(int i11) {
        setAutoDetectConnectivityState(false);
        f78630f.b(i11);
    }

    @CalledByNative
    public static void fakeConnectionSubtypeChanged(int i11) {
        setAutoDetectConnectivityState(false);
        f78630f.c(i11);
    }

    @CalledByNative
    public static void fakeDefaultNetwork(long j11, int i11) {
        setAutoDetectConnectivityState(false);
        f78630f.d(i11, j11);
    }

    @CalledByNative
    public static void fakeNetworkConnected(long j11, int i11) {
        setAutoDetectConnectivityState(false);
        f78630f.e(i11, j11);
    }

    @CalledByNative
    public static void fakeNetworkDisconnected(long j11) {
        setAutoDetectConnectivityState(false);
        f78630f.f(j11);
    }

    @CalledByNative
    public static void fakeNetworkSoonToBeDisconnected(long j11) {
        setAutoDetectConnectivityState(false);
        f78630f.g(j11);
    }

    @CalledByNative
    public static void fakePurgeActiveNetworkList(long[] jArr) {
        setAutoDetectConnectivityState(false);
        f78630f.h(jArr);
    }

    @CalledByNative
    public static void forceConnectivityState(boolean z11) {
        setAutoDetectConnectivityState(false);
        NetworkChangeNotifier networkChangeNotifier = f78630f;
        if ((networkChangeNotifier.f78634d != 6) != z11) {
            int i11 = z11 ? 0 : 6;
            networkChangeNotifier.f78634d = i11;
            networkChangeNotifier.d(i11, networkChangeNotifier.getCurrentDefaultNetId());
            networkChangeNotifier.c(!z11 ? 1 : 0);
        }
    }

    public static void i(w wVar, boolean z11) {
        f78630f.j(true, wVar, z11);
    }

    @CalledByNative
    public static NetworkChangeNotifier init() {
        if (f78630f == null) {
            f78630f = new NetworkChangeNotifier();
        }
        return f78630f;
    }

    private void j(boolean z11, NetworkChangeNotifierAutoDetect.h hVar, boolean z12) {
        vf.c.c("NetworkChangeNotifier.setAutoDetectConnectivityStateInternal");
        if (!z11) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f78633c;
            if (networkChangeNotifierAutoDetect != null) {
                networkChangeNotifierAutoDetect.m();
                this.f78633c = null;
                return;
            }
            return;
        }
        if (this.f78633c == null) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect2 = new NetworkChangeNotifierAutoDetect(new a(), hVar);
            this.f78633c = networkChangeNotifierAutoDetect2;
            if (z12) {
                networkChangeNotifierAutoDetect2.u();
            }
            NetworkChangeNotifierAutoDetect.f o11 = this.f78633c.o();
            int c11 = o11.c();
            this.f78634d = c11;
            d(c11, getCurrentDefaultNetId());
            int a11 = o11.a();
            this.f78635e = a11;
            b(a11);
            c(o11.b());
        }
    }

    @CalledByNative
    public static void setAutoDetectConnectivityState(boolean z11) {
        f78630f.j(z11, new x(), true);
    }

    @CalledByNative
    public final void addNativeObserver(long j11) {
        this.f78631a.add(Long.valueOf(j11));
    }

    final void b(int i11) {
        Iterator<Long> it = this.f78631a.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            new q();
            N.Mg0W7eRL(next.longValue(), this, i11);
        }
    }

    final void c(int i11) {
        Iterator<Long> it = this.f78631a.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            new q();
            N.MCEqyWQ0(next.longValue(), this, i11);
        }
    }

    final void e(int i11, long j11) {
        Iterator<Long> it = this.f78631a.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            new q();
            int i12 = i11;
            long j12 = j11;
            N.MBT1i5cd(next.longValue(), this, j12, i12);
            j11 = j12;
            i11 = i12;
        }
    }

    final void f(long j11) {
        Iterator<Long> it = this.f78631a.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            new q();
            N.MDpuHJTB(next.longValue(), this, j11);
        }
    }

    final void g(long j11) {
        Iterator<Long> it = this.f78631a.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            new q();
            N.MiJIMrTb(next.longValue(), this, j11);
        }
    }

    @CalledByNative
    public final int getCurrentConnectionCost() {
        return this.f78635e;
    }

    @CalledByNative
    public final int getCurrentConnectionSubtype(boolean z11) {
        vf.c.c("NetworkChangeNotifier.getCurrentConnectionSubtype");
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f78633c;
        if (networkChangeNotifierAutoDetect == null) {
            return 0;
        }
        if (z11) {
            networkChangeNotifierAutoDetect.u();
        }
        return this.f78633c.o().b();
    }

    @CalledByNative
    public final int getCurrentConnectionType() {
        return this.f78634d;
    }

    @CalledByNative
    public final long getCurrentDefaultNetId() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f78633c;
        if (networkChangeNotifierAutoDetect == null) {
            return -1L;
        }
        return networkChangeNotifierAutoDetect.p();
    }

    @CalledByNative
    public final long[] getCurrentNetworksAndTypes() {
        vf.c.c("NetworkChangeNotifierAutoDetect.getCurrentNetworksAndTypes");
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f78633c;
        return networkChangeNotifierAutoDetect == null ? new long[0] : networkChangeNotifierAutoDetect.q();
    }

    final void h(long[] jArr) {
        Iterator<Long> it = this.f78631a.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            new q();
            N.MpF$179U(next.longValue(), this, jArr);
        }
    }

    @CalledByNative
    public final boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f78633c;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.s();
    }

    @CalledByNative
    public final void removeNativeObserver(long j11) {
        this.f78631a.remove(Long.valueOf(j11));
    }
}
