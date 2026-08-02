package org.chromium.net;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.TraceEvent;

@SuppressLint({"NewApi"})
/* loaded from: classes6.dex */
public final class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f78637o = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Looper f78638a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f78639b;

    /* renamed from: c, reason: collision with root package name */
    private final NetworkConnectivityIntentFilter f78640c;

    /* renamed from: d, reason: collision with root package name */
    private final g f78641d;

    /* renamed from: e, reason: collision with root package name */
    private final h f78642e;

    /* renamed from: f, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f78643f;

    /* renamed from: g, reason: collision with root package name */
    private c f78644g;

    /* renamed from: h, reason: collision with root package name */
    private e f78645h;

    /* renamed from: i, reason: collision with root package name */
    private final NetworkRequest f78646i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f78647j;

    /* renamed from: k, reason: collision with root package name */
    private f f78648k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f78649l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f78650m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f78651n;

    private static class NetworkConnectivityIntentFilter extends IntentFilter {
        NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    /* loaded from: classes10.dex */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
            if (networkChangeNotifierAutoDetect.f78649l) {
                networkChangeNotifierAutoDetect.f78649l = false;
            } else {
                NetworkChangeNotifierAutoDetect.g(networkChangeNotifierAutoDetect);
            }
        }
    }

    private class b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        LinkProperties f78653a;

        /* renamed from: b, reason: collision with root package name */
        p f78654b;

        b() {
        }

        private f a(Network network) {
            int i11;
            int i12;
            boolean isPrivateDnsActive;
            String privateDnsServerName;
            int type;
            if (!this.f78654b.b(1) && !this.f78654b.b(5)) {
                boolean b11 = this.f78654b.b(0);
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
                if (b11) {
                    NetworkInfo g10 = networkChangeNotifierAutoDetect.f78644g.g(network);
                    i12 = g10 != null ? g10.getSubtype() : -1;
                    i11 = 0;
                } else {
                    if (this.f78654b.b(3)) {
                        type = 9;
                    } else if (this.f78654b.b(2)) {
                        type = 7;
                    } else if (this.f78654b.b(4)) {
                        NetworkInfo e11 = networkChangeNotifierAutoDetect.f78644g.e(network);
                        type = e11 != null ? e11.getType() : 17;
                    } else {
                        i11 = -1;
                        i12 = -1;
                    }
                    i11 = type;
                }
                boolean z11 = !this.f78654b.a(11);
                String valueOf = String.valueOf(network.getNetworkHandle());
                isPrivateDnsActive = this.f78653a.isPrivateDnsActive();
                privateDnsServerName = this.f78653a.getPrivateDnsServerName();
                return new f(true, i11, i12, z11, valueOf, isPrivateDnsActive, privateDnsServerName);
            }
            i11 = 1;
            i12 = -1;
            boolean z112 = !this.f78654b.a(11);
            String valueOf2 = String.valueOf(network.getNetworkHandle());
            isPrivateDnsActive = this.f78653a.isPrivateDnsActive();
            privateDnsServerName = this.f78653a.getPrivateDnsServerName();
            return new f(true, i11, i12, z112, valueOf2, isPrivateDnsActive, privateDnsServerName);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            this.f78653a = null;
            this.f78654b = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            this.f78654b = new p(networkCapabilities);
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
            if (!networkChangeNotifierAutoDetect.f78647j || this.f78653a == null || this.f78654b == null) {
                return;
            }
            networkChangeNotifierAutoDetect.l(a(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            this.f78653a = linkProperties;
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
            if (!networkChangeNotifierAutoDetect.f78647j || this.f78653a == null || this.f78654b == null) {
                return;
            }
            networkChangeNotifierAutoDetect.l(a(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            this.f78653a = null;
            this.f78654b = null;
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
            if (networkChangeNotifierAutoDetect.f78647j) {
                networkChangeNotifierAutoDetect.l(new f(false, -1, -1, false, null, false, ""));
            }
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        private final ConnectivityManager f78656a;

        c(Context context) {
            this.f78656a = (ConnectivityManager) context.getSystemService("connectivity");
        }

        protected static boolean k(Network network) {
            Socket socket = new Socket();
            try {
                org.chromium.base.o c11 = org.chromium.base.o.c();
                try {
                    try {
                        network.bindSocket(socket);
                        c11.close();
                        try {
                            socket.close();
                            return true;
                        } catch (IOException unused) {
                            return true;
                        }
                    } catch (IOException unused2) {
                        return false;
                    }
                } finally {
                }
            } catch (IOException unused3) {
                socket.close();
                return false;
            } catch (Throwable th2) {
                try {
                    socket.close();
                } catch (IOException unused4) {
                }
                throw th2;
            }
        }

        protected final Network[] a() {
            Network[] allNetworks = this.f78656a.getAllNetworks();
            return allNetworks == null ? new Network[0] : allNetworks;
        }

        final int b(Network network) {
            NetworkInfo e11 = e(network);
            if (e11 == null || !e11.isConnected()) {
                return 6;
            }
            return NetworkChangeNotifierAutoDetect.j(e11.getType(), e11.getSubtype());
        }

        final Network c() {
            ConnectivityManager connectivityManager = this.f78656a;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null) {
                return activeNetwork;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            for (Network network : NetworkChangeNotifierAutoDetect.n(this, null)) {
                NetworkInfo g10 = g(network);
                if (g10 != null && (g10.getType() == activeNetworkInfo.getType() || g10.getType() == 17)) {
                    if (activeNetwork != null && Build.VERSION.SDK_INT >= 29) {
                        NetworkInfo.DetailedState detailedState = g10.getDetailedState();
                        NetworkInfo.DetailedState detailedState2 = NetworkInfo.DetailedState.CONNECTING;
                        if (detailedState != detailedState2) {
                            NetworkInfo g11 = g(activeNetwork);
                            if (g11 != null && g11.getDetailedState() == detailedState2) {
                                activeNetwork = null;
                            }
                        }
                    }
                    if (activeNetwork != null) {
                        int i11 = NetworkChangeNotifierAutoDetect.f78637o;
                        org.chromium.base.j.a("NetworkChangeNotifierAutoDetect", "There should not be multiple connected networks of the same type. At least as of Android Marshmallow this is not supported. If this becomes supported this assertion may trigger.");
                    }
                    activeNetwork = network;
                }
            }
            return activeNetwork;
        }

        protected final p d(Network network) {
            for (int i11 = 0; i11 < 2; i11++) {
                try {
                    return new p(this.f78656a.getNetworkCapabilities(network));
                } catch (SecurityException unused) {
                }
            }
            return null;
        }

        final NetworkInfo e(Network network) {
            NetworkInfo g10 = g(network);
            return (g10 == null || g10.getType() != 17) ? g10 : this.f78656a.getActiveNetworkInfo();
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final f f() {
            Network c11 = c();
            NetworkInfo e11 = e(c11);
            if (e11 != null) {
                if (!e11.isConnected()) {
                    if (e11.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) {
                        ApplicationStatus.getStateForApplication();
                    }
                }
                if (e11 != null) {
                    return new f(false, -1, -1, false, null, false, "");
                }
                if (c11 != null) {
                    p d11 = d(c11);
                    boolean z11 = (d11 == null || d11.a(11)) ? false : true;
                    DnsStatus a11 = AndroidNetworkLibrary.a(c11);
                    return a11 == null ? new f(true, e11.getType(), e11.getSubtype(), z11, String.valueOf(c11.getNetworkHandle()), false, "") : new f(true, e11.getType(), e11.getSubtype(), z11, String.valueOf(c11.getNetworkHandle()), a11.getPrivateDnsActive(), a11.getPrivateDnsServerName());
                }
                if (e11.getType() != 1) {
                    return new f(true, e11.getType(), e11.getSubtype(), false, null, false, "");
                }
                if (e11.getExtraInfo() != null && !"".equals(e11.getExtraInfo())) {
                    return new f(true, e11.getType(), e11.getSubtype(), false, e11.getExtraInfo(), false, "");
                }
                e11.getType();
                e11.getSubtype();
                throw null;
            }
            e11 = null;
            if (e11 != null) {
            }
        }

        final NetworkInfo g(Network network) {
            ConnectivityManager connectivityManager = this.f78656a;
            try {
                try {
                    return connectivityManager.getNetworkInfo(network);
                } catch (NullPointerException unused) {
                    return null;
                }
            } catch (NullPointerException unused2) {
                return connectivityManager.getNetworkInfo(network);
            }
        }

        final void h(ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
            this.f78656a.registerDefaultNetworkCallback(networkCallback, handler);
        }

        final void i(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
            org.chromium.base.o d11 = org.chromium.base.o.d();
            try {
                this.f78656a.registerNetworkCallback(networkRequest, networkCallback, handler);
                d11.close();
            } catch (Throwable th2) {
                try {
                    d11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        final void j(ConnectivityManager.NetworkCallback networkCallback) {
            this.f78656a.unregisterNetworkCallback(networkCallback);
        }
    }

    private class d extends ConnectivityManager.NetworkCallback {
        d() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
            if (networkChangeNotifierAutoDetect.f78647j) {
                NetworkChangeNotifierAutoDetect.g(networkChangeNotifierAutoDetect);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            onAvailable(null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            onAvailable(null);
        }
    }

    private class e extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        private Network f78658a;

        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f78660a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f78661b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f78662c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f78663d;

            a(e eVar, long j11, int i11, boolean z11) {
                this.f78660a = j11;
                this.f78661b = i11;
                this.f78662c = z11;
                this.f78663d = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
                NetworkChangeNotifier networkChangeNotifier = NetworkChangeNotifier.this;
                long j11 = this.f78660a;
                int i11 = this.f78661b;
                networkChangeNotifier.e(i11, j11);
                if (this.f78662c) {
                    NetworkChangeNotifier.a(NetworkChangeNotifier.this, i11);
                    NetworkChangeNotifier.this.h(new long[]{j11});
                }
            }
        }

        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f78664a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f78665b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f78666c;

            b(e eVar, long j11, int i11) {
                this.f78664a = j11;
                this.f78665b = i11;
                this.f78666c = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                NetworkChangeNotifier.this.e(this.f78665b, this.f78664a);
            }
        }

        /* loaded from: classes10.dex */
        final class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f78667a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f78668b;

            c(e eVar, long j11) {
                this.f78667a = j11;
                this.f78668b = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                NetworkChangeNotifier.this.g(this.f78667a);
            }
        }

        /* loaded from: classes10.dex */
        final class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Network f78669a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f78670b;

            d(e eVar, Network network) {
                this.f78669a = network;
                this.f78670b = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g gVar = NetworkChangeNotifierAutoDetect.this.f78641d;
                NetworkChangeNotifier.this.f(this.f78669a.getNetworkHandle());
            }
        }

        /* renamed from: org.chromium.net.NetworkChangeNotifierAutoDetect$e$e, reason: collision with other inner class name */
        /* loaded from: classes10.dex */
        final class RunnableC1335e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f78671a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f78672b;

            RunnableC1335e(e eVar, int i11) {
                this.f78671a = i11;
                this.f78672b = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                NetworkChangeNotifier.a(NetworkChangeNotifier.this, this.f78671a);
            }
        }

        e() {
        }

        private boolean a(Network network, p pVar) {
            Network network2 = this.f78658a;
            if ((network2 != null && !network2.equals(network)) || pVar == null) {
                return true;
            }
            if (!pVar.b(4)) {
                return false;
            }
            NetworkChangeNotifierAutoDetect.this.f78644g.getClass();
            return !c.k(network);
        }

        final void b() {
            p d11;
            vf.c.c("NetworkChangeNotifierAutoDetect.initializeVpnInPlace");
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
            Network[] n11 = NetworkChangeNotifierAutoDetect.n(networkChangeNotifierAutoDetect.f78644g, null);
            this.f78658a = null;
            if (n11.length == 1 && (d11 = networkChangeNotifierAutoDetect.f78644g.d(n11[0])) != null && d11.b(4)) {
                this.f78658a = n11[0];
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0038 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0008, B:11:0x001d, B:13:0x0023, B:15:0x0027, B:21:0x0038, B:22:0x003a), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // android.net.ConnectivityManager.NetworkCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onAvailable(Network network) {
            boolean z11;
            boolean z12;
            Network network2;
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
            TraceEvent r11 = TraceEvent.r("NetworkChangeNotifierCallback::onAvailable");
            try {
                p d11 = networkChangeNotifierAutoDetect.f78644g.d(network);
                if (a(network, d11)) {
                    if (r11 != null) {
                        r11.close();
                        return;
                    }
                    return;
                }
                if (!d11.b(4) || ((network2 = this.f78658a) != null && network.equals(network2))) {
                    z11 = false;
                    z12 = z11;
                    if (z12) {
                        this.f78658a = network;
                    }
                    NetworkChangeNotifierAutoDetect.i(networkChangeNotifierAutoDetect, new a(this, network.getNetworkHandle(), networkChangeNotifierAutoDetect.f78644g.b(network), z12));
                    if (r11 == null) {
                        r11.close();
                        return;
                    }
                    return;
                }
                z11 = true;
                z12 = z11;
                if (z12) {
                }
                NetworkChangeNotifierAutoDetect.i(networkChangeNotifierAutoDetect, new a(this, network.getNetworkHandle(), networkChangeNotifierAutoDetect.f78644g.b(network), z12));
                if (r11 == null) {
                }
            } catch (Throwable th2) {
                if (r11 == null) {
                    throw th2;
                }
                try {
                    r11.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
            TraceEvent r11 = TraceEvent.r("NetworkChangeNotifierCallback::onCapabilitiesChanged");
            try {
                if (a(network, new p(networkCapabilities))) {
                    if (r11 != null) {
                        r11.close();
                    }
                } else {
                    NetworkChangeNotifierAutoDetect.i(networkChangeNotifierAutoDetect, new b(this, network.getNetworkHandle(), networkChangeNotifierAutoDetect.f78644g.b(network)));
                    if (r11 != null) {
                        r11.close();
                    }
                }
            } catch (Throwable th2) {
                if (r11 != null) {
                    try {
                        r11.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLosing(Network network, int i11) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
            TraceEvent r11 = TraceEvent.r("NetworkChangeNotifierCallback::onLosing");
            try {
                if (a(network, networkChangeNotifierAutoDetect.f78644g.d(network))) {
                    if (r11 != null) {
                        r11.close();
                    }
                } else {
                    NetworkChangeNotifierAutoDetect.i(networkChangeNotifierAutoDetect, new c(this, network.getNetworkHandle()));
                    if (r11 != null) {
                        r11.close();
                    }
                }
            } catch (Throwable th2) {
                if (r11 != null) {
                    try {
                        r11.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
            TraceEvent r11 = TraceEvent.r("NetworkChangeNotifierCallback::onLost");
            try {
                Network network2 = this.f78658a;
                if ((network2 == null || network2.equals(network)) ? false : true) {
                    if (r11 != null) {
                        r11.close();
                        return;
                    }
                    return;
                }
                NetworkChangeNotifierAutoDetect.i(networkChangeNotifierAutoDetect, new d(this, network));
                if (this.f78658a != null) {
                    this.f78658a = null;
                    for (Network network3 : NetworkChangeNotifierAutoDetect.n(networkChangeNotifierAutoDetect.f78644g, network)) {
                        onAvailable(network3);
                    }
                    networkChangeNotifierAutoDetect.u();
                    NetworkChangeNotifierAutoDetect.i(networkChangeNotifierAutoDetect, new RunnableC1335e(this, networkChangeNotifierAutoDetect.o().c()));
                }
                if (r11 != null) {
                    r11.close();
                }
            } catch (Throwable th2) {
                if (r11 != null) {
                    try {
                        r11.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f78673a;

        /* renamed from: b, reason: collision with root package name */
        private final int f78674b;

        /* renamed from: c, reason: collision with root package name */
        private final int f78675c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f78676d;

        /* renamed from: e, reason: collision with root package name */
        private final String f78677e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f78678f;

        /* renamed from: g, reason: collision with root package name */
        private final String f78679g;

        public f(boolean z11, int i11, int i12, boolean z12, String str, boolean z13, String str2) {
            this.f78673a = z11;
            this.f78674b = i11;
            this.f78675c = i12;
            this.f78676d = z12;
            this.f78677e = str == null ? "" : str;
            this.f78678f = z13;
            this.f78679g = str2 == null ? "" : str2;
        }

        public final int a() {
            return this.f78676d ? 2 : 1;
        }

        public final int b() {
            if (!this.f78673a) {
                return 1;
            }
            int i11 = this.f78674b;
            if (i11 != 0 && i11 != 4 && i11 != 5) {
                return 0;
            }
            switch (this.f78675c) {
                case 1:
                    return 7;
                case 2:
                    return 8;
                case 3:
                    return 9;
                case 4:
                    return 5;
                case 5:
                    return 10;
                case 6:
                    return 11;
                case 7:
                    return 6;
                case 8:
                    return 14;
                case 9:
                    return 15;
                case 10:
                    return 12;
                case 11:
                    return 4;
                case 12:
                    return 13;
                case 13:
                    return 18;
                case 14:
                    return 16;
                case 15:
                    return 17;
                default:
                    return 0;
            }
        }

        public final int c() {
            if (this.f78673a) {
                return NetworkChangeNotifierAutoDetect.j(this.f78674b, this.f78675c);
            }
            return 6;
        }

        public final String d() {
            return this.f78677e;
        }

        public final String e() {
            return this.f78679g;
        }

        public final boolean f() {
            return this.f78678f;
        }
    }

    public interface g {
    }

    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        private NetworkChangeNotifierAutoDetect f78680a;

        protected abstract void a();

        protected void b(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.f78680a = networkChangeNotifierAutoDetect;
        }

        protected final void c() {
            this.f78680a.r();
        }

        protected final void d() {
            this.f78680a.t();
        }
    }

    public NetworkChangeNotifierAutoDetect(g gVar, h hVar) {
        vf.c.c("NetworkChangeNotifierAutoDetect.constructor");
        Looper myLooper = Looper.myLooper();
        this.f78638a = myLooper;
        this.f78639b = new Handler(myLooper);
        this.f78641d = gVar;
        this.f78644g = new c(org.chromium.base.e.b());
        int i11 = Build.VERSION.SDK_INT;
        this.f78645h = new e();
        this.f78646i = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        if (i11 >= 30) {
            this.f78643f = new b();
        } else {
            this.f78643f = i11 >= 28 ? new d() : null;
        }
        u();
        this.f78640c = new NetworkConnectivityIntentFilter();
        this.f78649l = false;
        this.f78650m = false;
        this.f78642e = hVar;
        hVar.b(this);
        this.f78650m = true;
    }

    public static /* synthetic */ void a(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, Runnable runnable) {
        if (networkChangeNotifierAutoDetect.f78647j) {
            runnable.run();
        }
    }

    static void g(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        networkChangeNotifierAutoDetect.getClass();
        vf.c.c("NetworkChangeNotifierAutoDetect.connectionTypeChanged");
        networkChangeNotifierAutoDetect.l(networkChangeNotifierAutoDetect.f78644g.f());
    }

    static void i(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, Runnable runnable) {
        if (networkChangeNotifierAutoDetect.f78638a == Looper.myLooper()) {
            runnable.run();
        } else {
            networkChangeNotifierAutoDetect.f78639b.post(new io.sentry.android.ndk.b(2, networkChangeNotifierAutoDetect, runnable));
        }
    }

    static int j(int i11, int i12) {
        if (i11 != 0) {
            if (i11 == 1) {
                return 2;
            }
            if (i11 != 4 && i11 != 5) {
                if (i11 != 6) {
                    if (i11 != 7) {
                        return i11 != 9 ? 0 : 1;
                    }
                    return 7;
                }
                return 5;
            }
        }
        if (i12 == 20) {
            return 8;
        }
        switch (i12) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(f fVar) {
        int c11 = fVar.c();
        int c12 = this.f78648k.c();
        g gVar = this.f78641d;
        if (c11 != c12 || !fVar.d().equals(this.f78648k.d()) || fVar.f() != this.f78648k.f() || !fVar.e().equals(this.f78648k.e())) {
            NetworkChangeNotifier.a(NetworkChangeNotifier.this, fVar.c());
        }
        if (fVar.c() != this.f78648k.c() || fVar.b() != this.f78648k.b()) {
            NetworkChangeNotifier.this.c(fVar.b());
        }
        if (fVar.a() != this.f78648k.a()) {
            NetworkChangeNotifier.this.b(fVar.a());
        }
        this.f78648k = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Network[] n(c cVar, Network network) {
        p d11;
        Network[] a11 = cVar.a();
        int i11 = 0;
        for (Network network2 : a11) {
            if (!network2.equals(network) && (d11 = cVar.d(network2)) != null && d11.a(12)) {
                if (!d11.b(4)) {
                    a11[i11] = network2;
                    i11++;
                } else if (c.k(network2)) {
                    return new Network[]{network2};
                }
            }
        }
        return (Network[]) Arrays.copyOf(a11, i11);
    }

    public final void m() {
        this.f78642e.a();
        t();
    }

    public final f o() {
        vf.c.c("NetworkChangeNotifierAutoDetect.getCurrentNetworkState");
        return this.f78648k;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a aVar = new a();
        if (this.f78638a == Looper.myLooper()) {
            aVar.run();
        } else {
            this.f78639b.post(new io.sentry.android.ndk.b(2, this, aVar));
        }
    }

    public final long p() {
        Network c11 = this.f78644g.c();
        if (c11 == null) {
            return -1L;
        }
        return c11.getNetworkHandle();
    }

    public final long[] q() {
        c cVar = this.f78644g;
        vf.c.c("NetworkChangeNotifierAutoDetect.getNetworksAndTypes");
        Network[] n11 = n(cVar, null);
        long[] jArr = new long[n11.length * 2];
        int i11 = 0;
        for (Network network : n11) {
            int i12 = i11 + 1;
            jArr[i11] = network.getNetworkHandle();
            i11 += 2;
            jArr[i12] = cVar.b(r6);
        }
        return jArr;
    }

    public final void r() {
        vf.c.c("NetworkChangeNotifierAutoDetect.register");
        if (this.f78647j) {
            vf.c.c("NetworkChangeNotifierAutoDetect.connectionTypeChanged");
            l(this.f78644g.f());
            return;
        }
        boolean z11 = this.f78650m;
        if (z11) {
            vf.c.c("NetworkChangeNotifierAutoDetect.connectionTypeChanged");
            l(this.f78644g.f());
        }
        ConnectivityManager.NetworkCallback networkCallback = this.f78643f;
        Handler handler = this.f78639b;
        c cVar = this.f78644g;
        if (networkCallback != null) {
            try {
                cVar.h(networkCallback, handler);
            } catch (RuntimeException unused) {
                this.f78643f = null;
            }
        }
        if (this.f78643f == null) {
            this.f78649l = org.chromium.base.e.d(org.chromium.base.e.b(), this, this.f78640c) != null;
        }
        this.f78647j = true;
        e eVar = this.f78645h;
        if (eVar != null) {
            eVar.b();
            try {
                cVar.i(this.f78646i, this.f78645h, handler);
            } catch (RuntimeException unused2) {
                this.f78651n = true;
                this.f78645h = null;
            }
            if (this.f78651n || !z11) {
                return;
            }
            Network[] n11 = n(cVar, null);
            long[] jArr = new long[n11.length];
            for (int i11 = 0; i11 < n11.length; i11++) {
                jArr[i11] = n11[i11].getNetworkHandle();
            }
            NetworkChangeNotifier.this.h(jArr);
        }
    }

    public final boolean s() {
        return this.f78651n;
    }

    public final void t() {
        if (this.f78647j) {
            this.f78647j = false;
            e eVar = this.f78645h;
            c cVar = this.f78644g;
            if (eVar != null) {
                cVar.j(eVar);
            }
            ConnectivityManager.NetworkCallback networkCallback = this.f78643f;
            if (networkCallback != null) {
                cVar.j(networkCallback);
            } else {
                org.chromium.base.e.b().unregisterReceiver(this);
            }
        }
    }

    public final void u() {
        vf.c.c("NetworkChangeNotifierAutoDetect.updateCurrentNetworkState");
        this.f78648k = this.f78644g.f();
    }
}
