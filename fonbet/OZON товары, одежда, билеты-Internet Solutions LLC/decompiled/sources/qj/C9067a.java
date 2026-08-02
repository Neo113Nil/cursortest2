package qj;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.r;
import Sc.s;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.ProxyInfo;
import android.telephony.TelephonyManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.android.networkinfo.models.NetworkConnectionType;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import ru.ozon.android.networkinfo.models.NetworkInfoKt;

/* renamed from: qj.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9067a {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Object f82185g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private static volatile C9067a f82186h;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f82187a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f82188b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f82189c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f82190d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f82191e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f82192f;

    /* renamed from: qj.a$a, reason: collision with other inner class name */
    static final class C1395a extends AbstractC7737t implements Function0<x0<ConnectionType>> {
        C1395a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final x0<ConnectionType> invoke() {
            return O0.a(C9067a.g(C9067a.this));
        }
    }

    /* renamed from: qj.a$b */
    static final class b extends AbstractC7737t implements Function0<x0<NetworkInfo>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final x0<NetworkInfo> invoke() {
            return O0.a(C9067a.this.h(C9070d.f82206b));
        }
    }

    /* renamed from: qj.a$c */
    static final class c extends AbstractC7737t implements Function0<M0<? extends ConnectionType>> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final M0<? extends ConnectionType> invoke() {
            return C2399j.b(C9067a.c(C9067a.this));
        }
    }

    /* renamed from: qj.a$d */
    static final class d extends AbstractC7737t implements Function0<ConnectivityManager> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f82196b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C9067a f82197c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, C9067a c9067a) {
            super(0);
            this.f82196b = context;
            this.f82197c = c9067a;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ConnectivityManager invoke() {
            ConnectivityManager connectivityManager = (ConnectivityManager) androidx.core.content.a.getSystemService(this.f82196b, ConnectivityManager.class);
            if (connectivityManager == null) {
                return null;
            }
            C9067a c9067a = this.f82197c;
            c9067a.getClass();
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), new C9068b(c9067a));
            return connectivityManager;
        }
    }

    /* renamed from: qj.a$e */
    public static final class e extends NetworkInfo.Available {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f82198a;

        /* renamed from: b, reason: collision with root package name */
        private final NetworkConnectionType f82199b;

        /* renamed from: c, reason: collision with root package name */
        private final NetworkCapabilities f82200c;

        /* renamed from: d, reason: collision with root package name */
        private final LinkProperties f82201d;

        e(boolean z11, NetworkConnectionType networkConnectionType, NetworkCapabilities networkCapabilities, LinkProperties linkProperties) {
            this.f82198a = z11;
            this.f82199b = networkConnectionType;
            this.f82200c = networkCapabilities;
            this.f82201d = linkProperties;
        }

        @Override // ru.ozon.android.networkinfo.models.NetworkInfo.Available
        public final NetworkCapabilities getCapabilities() {
            return this.f82200c;
        }

        @Override // ru.ozon.android.networkinfo.models.NetworkInfo.Available
        public final LinkProperties getLinkProperties() {
            return this.f82201d;
        }

        @Override // ru.ozon.android.networkinfo.models.NetworkInfo.Available
        public final NetworkConnectionType getNetworkConnectionType() {
            return this.f82199b;
        }

        @Override // ru.ozon.android.networkinfo.models.NetworkInfo.Available
        public final boolean isValidated() {
            return this.f82198a;
        }
    }

    /* renamed from: qj.a$f */
    static final class f extends AbstractC7737t implements Function0<M0<? extends NetworkInfo>> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final M0<? extends NetworkInfo> invoke() {
            return C2399j.b(C9067a.d(C9067a.this));
        }
    }

    /* renamed from: qj.a$g */
    static final class g extends AbstractC7737t implements Function0<TelephonyManager> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f82203b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context) {
            super(0);
            this.f82203b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TelephonyManager invoke() {
            return (TelephonyManager) androidx.core.content.a.getSystemService(this.f82203b, TelephonyManager.class);
        }
    }

    @InterfaceC3999a
    public C9067a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82187a = k.b(new b());
        this.f82188b = k.b(new f());
        this.f82189c = k.b(new C1395a());
        this.f82190d = k.b(new c());
        this.f82191e = k.b(new d(context, this));
        this.f82192f = k.b(new g(context));
    }

    public static final x0 c(C9067a c9067a) {
        return (x0) c9067a.f82189c.getValue();
    }

    public static final x0 d(C9067a c9067a) {
        return (x0) c9067a.f82187a.getValue();
    }

    public static final void e(C9067a c9067a) {
        c9067a.getClass();
        NetworkInfo h11 = c9067a.h(C9070d.f82206b);
        ((x0) c9067a.f82187a.getValue()).setValue(h11);
        ((x0) c9067a.f82189c.getValue()).setValue(NetworkInfoKt.toConnectionType(h11));
    }

    public static ConnectionType g(C9067a c9067a) {
        c9067a.getClass();
        C9069c onUnknown = C9069c.f82205b;
        Intrinsics.checkNotNullParameter(onUnknown, "onUnknown");
        return NetworkInfoKt.toConnectionType(c9067a.h(onUnknown));
    }

    private static NetworkConnectionType o(String str, Function1 function1) {
        function1.invoke("Connection type is unknown because ".concat(str));
        return NetworkConnectionType.CONNECTION_TYPE_UNKNOWN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ru.ozon.android.networkinfo.models.NetworkConnectionType] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16, types: [ru.ozon.android.networkinfo.models.NetworkConnectionType] */
    /* JADX WARN: Type inference failed for: r7v17, types: [ru.ozon.android.networkinfo.models.NetworkConnectionType] */
    /* JADX WARN: Type inference failed for: r7v18, types: [ru.ozon.android.networkinfo.models.NetworkConnectionType] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v3, types: [ru.ozon.android.networkinfo.models.NetworkConnectionType] */
    /* JADX WARN: Type inference failed for: r7v5, types: [ru.ozon.android.networkinfo.models.NetworkConnectionType] */
    /* JADX WARN: Type inference failed for: r7v6, types: [ru.ozon.android.networkinfo.models.NetworkConnectionType] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ru.ozon.android.networkinfo.models.NetworkConnectionType] */
    /* JADX WARN: Type inference failed for: r7v8, types: [ru.ozon.android.networkinfo.models.NetworkConnectionType] */
    /* JADX WARN: Type inference failed for: r7v9, types: [ru.ozon.android.networkinfo.models.NetworkConnectionType] */
    @NotNull
    public final NetworkInfo h(@NotNull Function1<? super String, Unit> onUnknown) {
        Object a11;
        Object a12;
        android.net.NetworkInfo activeNetworkInfo;
        Intrinsics.checkNotNullParameter(onUnknown, "onUnknown");
        InterfaceC4008j interfaceC4008j = this.f82191e;
        ConnectivityManager connectivityManager = (ConnectivityManager) interfaceC4008j.getValue();
        if (connectivityManager == null) {
            return NetworkInfo.Unknown.INSTANCE;
        }
        try {
            r.Companion companion = r.INSTANCE;
            a11 = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        NetworkCapabilities networkCapabilities = (NetworkCapabilities) a11;
        if (networkCapabilities == null) {
            return NetworkInfo.Unknown.INSTANCE;
        }
        if (!networkCapabilities.hasCapability(12)) {
            return NetworkInfo.NotAvailable.INSTANCE;
        }
        boolean hasCapability = networkCapabilities.hasCapability(16);
        try {
            a12 = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
        } catch (Throwable th3) {
            r.Companion companion3 = r.INSTANCE;
            a12 = s.a(th3);
        }
        LinkProperties linkProperties = (LinkProperties) (a12 instanceof r.b ? null : a12);
        if (networkCapabilities.hasTransport(1)) {
            onUnknown = NetworkConnectionType.WIFI;
        } else if (networkCapabilities.hasTransport(0)) {
            TelephonyManager telephonyManager = (TelephonyManager) this.f82192f.getValue();
            if (telephonyManager != null) {
                try {
                    switch (telephonyManager.getDataNetworkType()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            onUnknown = NetworkConnectionType.CELLULAR_2G;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            onUnknown = NetworkConnectionType.CELLULAR_3G;
                            break;
                        case 13:
                        case 18:
                        case 19:
                            onUnknown = NetworkConnectionType.CELLULAR_4G;
                            break;
                        case 20:
                            onUnknown = NetworkConnectionType.CELLULAR_5G;
                            break;
                        default:
                            onUnknown = NetworkConnectionType.CELLULAR_UNSPECIFIED;
                            break;
                    }
                } catch (SecurityException unused) {
                    ConnectivityManager connectivityManager2 = (ConnectivityManager) interfaceC4008j.getValue();
                    if (connectivityManager2 != null && (activeNetworkInfo = connectivityManager2.getActiveNetworkInfo()) != null) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                onUnknown = NetworkConnectionType.CELLULAR_2G;
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                onUnknown = NetworkConnectionType.CELLULAR_3G;
                                break;
                            case 13:
                            case 18:
                            case 19:
                                onUnknown = NetworkConnectionType.CELLULAR_4G;
                                break;
                            case 20:
                                onUnknown = NetworkConnectionType.CELLULAR_5G;
                                break;
                            default:
                                onUnknown = NetworkConnectionType.CELLULAR_UNSPECIFIED;
                                break;
                        }
                    } else {
                        onUnknown = o("ActiveNetworkInfo is null.", onUnknown);
                    }
                }
            } else {
                onUnknown = o("TelephonyManager is null", onUnknown);
            }
        } else {
            onUnknown = o("NetworkCapabilities hasn't TRANSPORT_WIFI or TRANSPORT_CELLULAR.", onUnknown);
        }
        return new e(hasCapability, onUnknown, networkCapabilities, linkProperties);
    }

    @NotNull
    public final M0<NetworkInfo> j() {
        return (M0) this.f82188b.getValue();
    }

    public final boolean k() {
        LinkProperties linkProperties;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f82191e.getValue();
        ProxyInfo proxyInfo = null;
        if (connectivityManager != null) {
            if (connectivityManager.getDefaultProxy() != null) {
                proxyInfo = connectivityManager.getDefaultProxy();
            } else {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                    proxyInfo = linkProperties.getHttpProxy();
                }
            }
        }
        return proxyInfo != null;
    }

    public final Boolean l() {
        try {
            return Boolean.valueOf(k());
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean m() {
        Network activeNetwork;
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        InterfaceC4008j interfaceC4008j = this.f82191e;
        ConnectivityManager connectivityManager2 = (ConnectivityManager) interfaceC4008j.getValue();
        if (connectivityManager2 == null || (activeNetwork = connectivityManager2.getActiveNetwork()) == null || (connectivityManager = (ConnectivityManager) interfaceC4008j.getValue()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(4);
    }

    public final Boolean n() {
        try {
            return Boolean.valueOf(m());
        } catch (Exception unused) {
            return null;
        }
    }
}
