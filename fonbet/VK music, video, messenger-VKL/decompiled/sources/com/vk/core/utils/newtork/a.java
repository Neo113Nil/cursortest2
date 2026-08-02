package com.vk.core.utils.newtork;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.telephony.TelephonyManager;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.core.utils.newtork.a;
import com.vk.core.utils.newtork.d;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.collections.EmptySet;
import xsna.bpn0;
import xsna.d460;
import xsna.epx;
import xsna.f0q;
import xsna.gz80;
import xsna.gzs;
import xsna.j5g;
import xsna.zhy0;

/* compiled from: AndroidNetworkManager.kt */
/* loaded from: classes.dex */
public final class a {
    public final com.vk.core.utils.newtork.c a;
    public final ConnectivityManager b;
    public final TelephonyManager c;
    public final bpn0 d;

    /* compiled from: AndroidNetworkManager.kt */
    /* renamed from: com.vk.core.utils.newtork.a$a, reason: collision with other inner class name */
    public static final class C0796a {
        public final Context a;
        public final TelephonyManager b;
        public final ConnectivityManager c;

        public C0796a(Context context, TelephonyManager telephonyManager, ConnectivityManager connectivityManager) {
            this.a = context;
            this.b = telephonyManager;
            this.c = connectivityManager;
        }

        public final int a() {
            Object failure;
            if (!gz80.a(24) || this.a.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                NetworkInfo activeNetworkInfo = this.c.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.getSubtype();
                }
                return -1;
            }
            try {
                failure = Integer.valueOf(this.b.getDataNetworkType());
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (Result.a(failure) != null) {
                failure = 0;
            }
            return ((Number) failure).intValue();
        }

        public final String b() {
            String simOperatorName = this.b.getSimOperatorName();
            if (simOperatorName == null || simOperatorName.length() == 0) {
                return null;
            }
            return simOperatorName.toUpperCase(Locale.ROOT);
        }

        public final boolean c() {
            if (gz80.a(24) && this.a.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                return this.b.isNetworkRoaming();
            }
            NetworkInfo activeNetworkInfo = this.c.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isRoaming();
            }
            return false;
        }
    }

    /* compiled from: AndroidNetworkManager.kt */
    public static abstract class b extends ConnectivityManager.NetworkCallback {
        public abstract boolean a(d460 d460Var);

        public abstract boolean b();
    }

    /* compiled from: AndroidNetworkManager.kt */
    /* loaded from: classes17.dex */
    public static final class c extends b {
        public final ConnectivityManager a;
        public final C0796a b;
        public final ConcurrentHashMap<Network, C0797a> c = new ConcurrentHashMap<>();
        public final AtomicReference<Network> d = new AtomicReference<>();
        public final AtomicReference<C0797a> e = new AtomicReference<>();
        public final AtomicReference<NetworkState> f = new AtomicReference<>();
        public final AtomicReference<d460> g = new AtomicReference<>();

        /* compiled from: AndroidNetworkManager.kt */
        /* renamed from: com.vk.core.utils.newtork.a$c$a, reason: collision with other inner class name */
        public static final class C0797a {
            public NetworkCapabilities a;
            public LinkProperties b;
            public boolean c;

            public C0797a() {
                this(false, 7);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0797a)) {
                    return false;
                }
                C0797a c0797a = (C0797a) obj;
                return epx.f(this.a, c0797a.a) && epx.f(this.b, c0797a.b) && this.c == c0797a.c;
            }

            public final int hashCode() {
                NetworkCapabilities networkCapabilities = this.a;
                int hashCode = (networkCapabilities == null ? 0 : networkCapabilities.hashCode()) * 31;
                LinkProperties linkProperties = this.b;
                return Boolean.hashCode(this.c) + ((hashCode + (linkProperties != null ? linkProperties.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NetworkProperties(capabilities=");
                sb.append(this.a);
                sb.append(", linkProperties=");
                sb.append(this.b);
                sb.append(", isAvailable=");
                return q0.a(sb, this.c, ')');
            }

            public C0797a(NetworkCapabilities networkCapabilities, LinkProperties linkProperties, boolean z) {
                this.a = networkCapabilities;
                this.b = linkProperties;
                this.c = z;
            }

            public /* synthetic */ C0797a(boolean z, int i) {
                this(null, null, (i & 4) != 0 ? true : z);
            }
        }

        public c(ConnectivityManager connectivityManager, C0796a c0796a) {
            this.a = connectivityManager;
            this.b = c0796a;
        }

        @Override // com.vk.core.utils.newtork.a.b
        public final boolean a(d460 d460Var) {
            return this.g.getAndSet(d460Var) == null;
        }

        @Override // com.vk.core.utils.newtork.a.b
        public final boolean b() {
            AtomicReference<Network> atomicReference;
            ConnectivityManager connectivityManager = this.a;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            do {
                atomicReference = this.d;
                if (atomicReference.compareAndSet(null, activeNetwork)) {
                    break;
                }
            } while (atomicReference.get() == null);
            if (activeNetwork == null) {
                return false;
            }
            ConcurrentHashMap<Network, C0797a> concurrentHashMap = this.c;
            C0797a c0797a = concurrentHashMap.get(activeNetwork);
            if (c0797a == null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                c0797a = new C0797a(activeNetworkInfo != null ? activeNetworkInfo.isConnectedOrConnecting() : true, 3);
                C0797a putIfAbsent = concurrentHashMap.putIfAbsent(activeNetwork, c0797a);
                if (putIfAbsent != null) {
                    c0797a = putIfAbsent;
                }
            }
            return c0797a.c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        
            if (r4 != null) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(Network network, C0797a c0797a) {
            Set<Integer> set;
            String str;
            String str2;
            NetworkState networkState;
            Lazy lazy;
            Set set2;
            if (!epx.f(this.d.get(), network)) {
                return;
            }
            AtomicReference<C0797a> atomicReference = this.e;
            C0797a c0797a2 = atomicReference.get();
            AtomicReference<NetworkState> atomicReference2 = this.f;
            NetworkState networkState2 = atomicReference2.get();
            NetworkCapabilities networkCapabilities = c0797a.a;
            ConnectivityManager connectivityManager = this.a;
            if (networkCapabilities == null) {
                networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                c0797a.a = networkCapabilities;
            }
            if (epx.f(networkCapabilities, c0797a2 != null ? c0797a2.a : null)) {
                set = networkState2 != null ? networkState2.b : null;
                if (set == null) {
                    set = EmptySet.b;
                }
            } else {
                if (networkCapabilities != null) {
                    NetworkType.Companion.getClass();
                    set2 = NetworkType.TRANSPORT;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : set2) {
                        if (networkCapabilities.hasTransport(((Number) obj).intValue())) {
                            arrayList.add(obj);
                        }
                    }
                    set = j5g.S0(arrayList);
                }
                NetworkType.Companion.getClass();
                lazy = NetworkType.EMPTY_TRANSPORT$delegate;
                set = (Set) lazy.getValue();
            }
            Set<Integer> set3 = set;
            LinkProperties linkProperties = c0797a.b;
            if (linkProperties == null) {
                linkProperties = connectivityManager.getLinkProperties(network);
                c0797a.b = linkProperties;
            }
            boolean f = epx.f(linkProperties, c0797a2 != null ? c0797a2.b : null);
            C0796a c0796a = this.b;
            if (f) {
                String str3 = networkState2 != null ? networkState2.a : null;
                if (str3 != null) {
                    str = str3;
                    networkState = new NetworkState(str, set3, c0796a.a(), c0797a.c, new NetworkState.a(c0796a.b(), !gz80.a(24) ? connectivityManager.getRestrictBackgroundStatus() : -1, c0796a.c(), connectivityManager.isActiveNetworkMetered()));
                    atomicReference.set(new C0797a(c0797a.a, c0797a.b, c0797a.c));
                    if (epx.f(networkState2, networkState)) {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.d, new Object[]{"New network state providing: " + networkState});
                        }
                        atomicReference2.set(networkState);
                        this.g.get().a(networkState);
                        return;
                    }
                    return;
                }
                str2 = "";
            } else {
                NetworkType.Companion.getClass();
                if (NetworkType.WIFI.n(set3)) {
                    StringBuilder sb = new StringBuilder("net=");
                    sb.append(linkProperties != null ? f0q.a(linkProperties) : null);
                    str2 = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder("net=");
                    sb2.append(linkProperties != null ? f0q.a(linkProperties) : null);
                    sb2.append("&mobile=");
                    sb2.append(c0796a.b() + ':' + c0796a.b.getNetworkOperator());
                    str2 = sb2.toString();
                }
            }
            str = str2;
            networkState = new NetworkState(str, set3, c0796a.a(), c0797a.c, new NetworkState.a(c0796a.b(), !gz80.a(24) ? connectivityManager.getRestrictBackgroundStatus() : -1, c0796a.c(), connectivityManager.isActiveNetworkMetered()));
            atomicReference.set(new C0797a(c0797a.a, c0797a.b, c0797a.c));
            if (epx.f(networkState2, networkState)) {
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            C0797a putIfAbsent;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"Selected best network. Available called for network:" + network});
            }
            this.d.set(network);
            this.g.get().b(d.a.a);
            ConcurrentHashMap<Network, C0797a> concurrentHashMap = this.c;
            C0797a c0797a = concurrentHashMap.get(network);
            if (c0797a == null && (putIfAbsent = concurrentHashMap.putIfAbsent(network, (c0797a = new C0797a(false, 7)))) != null) {
                c0797a = putIfAbsent;
            }
            C0797a c0797a2 = c0797a;
            c0797a2.c = true;
            c(network, c0797a2);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z) {
            C0797a putIfAbsent;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"Blocked status changed for network:" + network + " blocked:" + z});
            }
            if (epx.f(this.d.get(), network)) {
                AtomicReference<d460> atomicReference = this.g;
                if (z) {
                    atomicReference.get().b(d.b.a);
                } else {
                    atomicReference.get().b(d.a.a);
                }
            }
            ConcurrentHashMap<Network, C0797a> concurrentHashMap = this.c;
            C0797a c0797a = concurrentHashMap.get(network);
            if (c0797a == null && (putIfAbsent = concurrentHashMap.putIfAbsent(network, (c0797a = new C0797a(false, 7)))) != null) {
                c0797a = putIfAbsent;
            }
            C0797a c0797a2 = c0797a;
            c0797a2.c = !z;
            c(network, c0797a2);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C0797a putIfAbsent;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"Capabilities changed network:" + network});
            }
            ConcurrentHashMap<Network, C0797a> concurrentHashMap = this.c;
            C0797a c0797a = concurrentHashMap.get(network);
            if (c0797a == null && (putIfAbsent = concurrentHashMap.putIfAbsent(network, (c0797a = new C0797a(false, 7)))) != null) {
                c0797a = putIfAbsent;
            }
            C0797a c0797a2 = c0797a;
            c0797a2.a = networkCapabilities;
            c(network, c0797a2);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            C0797a putIfAbsent;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"Link properties changed network:" + network});
            }
            ConcurrentHashMap<Network, C0797a> concurrentHashMap = this.c;
            C0797a c0797a = concurrentHashMap.get(network);
            if (c0797a == null && (putIfAbsent = concurrentHashMap.putIfAbsent(network, (c0797a = new C0797a(false, 7)))) != null) {
                c0797a = putIfAbsent;
            }
            C0797a c0797a2 = c0797a;
            c0797a2.b = linkProperties;
            c(network, c0797a2);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            L l = L.a;
            l.getClass();
            LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
            if (!L.m(loggerOutputTarget)) {
                L.u(l, L.LogType.d, new Object[]{"Lost called for network:" + network});
            }
            this.c.remove(network);
            AtomicReference<Network> atomicReference = this.d;
            if (epx.f(atomicReference.get(), network)) {
                atomicReference.set(null);
                l.getClass();
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"Best network is lost " + network});
                }
                AtomicReference<d460> atomicReference2 = this.g;
                atomicReference2.get().b(d.b.a);
                this.e.set(null);
                NetworkState networkState = (NetworkState) NetworkState.g.getValue();
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"New network state providing: " + networkState});
                }
                this.f.set(networkState);
                atomicReference2.get().a(networkState);
            }
        }
    }

    /* compiled from: AndroidNetworkManager.kt */
    public static final class d extends b {
        public final ConnectivityManager a;
        public final C0796a b;
        public final com.vk.core.utils.newtork.c c;
        public final AtomicReference<C0798a> d = new AtomicReference<>();
        public final AtomicReference<NetworkState> e = new AtomicReference<>();
        public final AtomicReference<d460> f = new AtomicReference<>();

        /* compiled from: AndroidNetworkManager.kt */
        /* renamed from: com.vk.core.utils.newtork.a$d$a, reason: collision with other inner class name */
        public static final class C0798a {
            public final Network a;
            public final NetworkCapabilities b;
            public final LinkProperties c;

            public C0798a(Network network, NetworkCapabilities networkCapabilities, LinkProperties linkProperties) {
                this.a = network;
                this.b = networkCapabilities;
                this.c = linkProperties;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0798a)) {
                    return false;
                }
                C0798a c0798a = (C0798a) obj;
                return epx.f(this.a, c0798a.a) && epx.f(this.b, c0798a.b) && epx.f(this.c, c0798a.c);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                NetworkCapabilities networkCapabilities = this.b;
                int hashCode2 = (hashCode + (networkCapabilities == null ? 0 : networkCapabilities.hashCode())) * 31;
                LinkProperties linkProperties = this.c;
                return hashCode2 + (linkProperties != null ? linkProperties.hashCode() : 0);
            }

            public final String toString() {
                return "InnerState(network=" + this.a + ", capabilities=" + this.b + ", linkProperties=" + this.c + ')';
            }
        }

        public d(ConnectivityManager connectivityManager, C0796a c0796a, com.vk.core.utils.newtork.c cVar) {
            this.a = connectivityManager;
            this.b = c0796a;
            this.c = cVar;
        }

        @Override // com.vk.core.utils.newtork.a.b
        public final boolean a(d460 d460Var) {
            return this.f.getAndSet(d460Var) == null;
        }

        @Override // com.vk.core.utils.newtork.a.b
        public final boolean b() {
            boolean a = gz80.a(23);
            ConnectivityManager connectivityManager = this.a;
            if (a) {
                return connectivityManager.getActiveNetwork() != null;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        
            if (r9 != null) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(Network network, NetworkCapabilities networkCapabilities) {
            Lazy lazy;
            Set<Integer> set;
            String sb;
            Set set2;
            ConnectivityManager connectivityManager = this.a;
            C0798a c0798a = new C0798a(network, connectivityManager.getNetworkCapabilities(network), connectivityManager.getLinkProperties(network));
            AtomicReference<C0798a> atomicReference = this.d;
            C0798a c0798a2 = atomicReference.get();
            while (!atomicReference.compareAndSet(c0798a2, c0798a)) {
                if (atomicReference.get() != c0798a2) {
                    return;
                }
            }
            NetworkCapabilities networkCapabilities2 = c0798a.b;
            if (networkCapabilities2 != null) {
                NetworkType.Companion.getClass();
                set2 = NetworkType.TRANSPORT;
                ArrayList arrayList = new ArrayList();
                for (Object obj : set2) {
                    if (networkCapabilities2.hasTransport(((Number) obj).intValue())) {
                        arrayList.add(obj);
                    }
                }
                set = j5g.S0(arrayList);
            }
            NetworkType.Companion.getClass();
            lazy = NetworkType.EMPTY_TRANSPORT$delegate;
            set = (Set) lazy.getValue();
            Set<Integer> set3 = set;
            C0796a c0796a = this.b;
            int a = c0796a.a();
            if (networkCapabilities != null) {
                this.c.getClass();
            }
            boolean b = b();
            NetworkType.Companion.getClass();
            boolean n = NetworkType.WIFI.n(set3);
            LinkProperties linkProperties = c0798a.c;
            if (n) {
                StringBuilder sb2 = new StringBuilder("net=");
                sb2.append(linkProperties != null ? f0q.a(linkProperties) : null);
                sb = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder("net=");
                sb3.append(linkProperties != null ? f0q.a(linkProperties) : null);
                sb3.append("&mobile=");
                sb3.append(c0796a.b() + ':' + c0796a.b.getNetworkOperator());
                sb = sb3.toString();
            }
            NetworkState networkState = new NetworkState(sb, set3, a, b, new NetworkState.a(c0796a.b(), gz80.a(24) ? connectivityManager.getRestrictBackgroundStatus() : -1, c0796a.c(), connectivityManager.isActiveNetworkMetered()));
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"On state changed; new network state providing = " + networkState});
            }
            AtomicReference<NetworkState> atomicReference2 = this.e;
            if (epx.f(atomicReference2.get(), networkState)) {
                return;
            }
            atomicReference2.set(networkState);
            this.f.get().a(networkState);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            L.e("Delegating available status to listener");
            this.f.get().b(d.a.a);
            c(network, null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            c(network, networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            c(network, null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            L.e("Delegating lost status to listener");
            AtomicReference<d460> atomicReference = this.f;
            atomicReference.get().b(d.b.a);
            atomicReference.get().a((NetworkState) NetworkState.g.getValue());
            c(network, null);
        }
    }

    public a(final Context context, com.vk.core.utils.newtork.c cVar) {
        this.a = cVar;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.c = (TelephonyManager) context.getSystemService("phone");
        this.d = new bpn0(new gzs() { // from class: xsna.ta2
            @Override // xsna.gzs
            public final Object invoke() {
                com.vk.core.utils.newtork.a aVar = com.vk.core.utils.newtork.a.this;
                com.vk.core.utils.newtork.c cVar2 = aVar.a;
                TelephonyManager telephonyManager = aVar.c;
                ConnectivityManager connectivityManager = aVar.b;
                boolean booleanValue = cVar2.a.invoke().booleanValue();
                Context context2 = context;
                return booleanValue ? new a.c(connectivityManager, new a.C0796a(context2, telephonyManager, connectivityManager)) : new a.d(connectivityManager, new a.C0796a(context2, telephonyManager, connectivityManager), cVar2);
            }
        });
    }

    public final void a(d460 d460Var) {
        bpn0 bpn0Var = this.d;
        L.e("Registering network callback");
        try {
            if (((b) bpn0Var.getValue()).a(d460Var)) {
                L.e("Listener successfully set");
                boolean a = gz80.a(26);
                ConnectivityManager connectivityManager = this.b;
                if (a) {
                    connectivityManager.registerDefaultNetworkCallback((b) bpn0Var.getValue());
                    return;
                }
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                com.vk.core.utils.newtork.c cVar = this.a;
                cVar.getClass();
                if (cVar.a.invoke().booleanValue()) {
                    builder.addCapability(12);
                    if (gz80.a(23)) {
                        builder.addCapability(16);
                    }
                    if (gz80.a(28)) {
                        builder.addCapability(19);
                    }
                }
                connectivityManager.registerNetworkCallback(builder.build(), (b) bpn0Var.getValue());
            }
        } catch (SecurityException e) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.e, new Object[]{new PackageDoesNotBelongException(e)});
        }
    }

    public final com.vk.core.utils.newtork.d b() {
        boolean b2 = ((b) this.d.getValue()).b();
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{zhy0.a("Android network connection check = ", b2)});
        }
        com.vk.core.utils.newtork.d dVar = b2 ? d.a.a : d.b.a;
        l.getClass();
        if (L.m(loggerOutputTarget)) {
            return dVar;
        }
        L.u(l, L.LogType.d, new Object[]{"AndroidNetworkManager reporting status = ".concat(dVar.getClass().getSimpleName())});
        return dVar;
    }
}
