package nc;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReactApplicationContext;
import oc.EnumC5865a;
import oc.EnumC5866b;

/* loaded from: classes4.dex */
public class k extends e {

    /* renamed from: j, reason: collision with root package name */
    public final a f57244j;

    /* renamed from: k, reason: collision with root package name */
    public Network f57245k;

    /* renamed from: l, reason: collision with root package name */
    public NetworkCapabilities f57246l;

    public class a extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            k.this.f57245k = network;
            k.this.q(250);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            k.this.f57245k = network;
            k.this.f57246l = networkCapabilities;
            k.this.s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (k.this.f57245k != null) {
                k.this.f57245k = network;
            }
            k.this.q(250);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i10) {
            k.this.f57245k = network;
            k.this.s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            k.this.f57245k = null;
            k.this.f57246l = null;
            k.this.s();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            k.this.f57245k = null;
            k.this.f57246l = null;
            k.this.s();
        }

        public a() {
        }
    }

    public k(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f57245k = null;
        this.f57246l = null;
        this.f57244j = new a();
    }

    @Override // nc.e
    public void g() {
        try {
            this.f57245k = c().getActiveNetwork();
            q(0);
            c().registerDefaultNetworkCallback(this.f57244j);
        } catch (SecurityException unused) {
        }
    }

    @Override // nc.e
    public void j() {
        try {
            c().unregisterNetworkCallback(this.f57244j);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    public final void q(int i10) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: nc.j
            @Override // java.lang.Runnable
            public final void run() {
                k.this.r();
            }
        }, i10);
    }

    public final /* synthetic */ void r() {
        try {
            this.f57246l = c().getNetworkCapabilities(this.f57245k);
            s();
        } catch (SecurityException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s() {
        NetworkInfo networkInfo;
        EnumC5866b enumC5866b = EnumC5866b.UNKNOWN;
        Network network = this.f57245k;
        NetworkCapabilities networkCapabilities = this.f57246l;
        EnumC5865a enumC5865a = null;
        boolean z10 = false;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                enumC5866b = EnumC5866b.BLUETOOTH;
            } else if (networkCapabilities.hasTransport(0)) {
                enumC5866b = EnumC5866b.CELLULAR;
            } else if (networkCapabilities.hasTransport(3)) {
                enumC5866b = EnumC5866b.ETHERNET;
            } else if (networkCapabilities.hasTransport(1)) {
                enumC5866b = EnumC5866b.WIFI;
            } else if (networkCapabilities.hasTransport(4)) {
                enumC5866b = EnumC5866b.VPN;
            }
            if (network != null) {
                try {
                    networkInfo = c().getNetworkInfo(network);
                } catch (SecurityException unused) {
                }
                boolean z11 = (networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16) || (Build.VERSION.SDK_INT < 28 ? networkCapabilities.hasCapability(21) ^ true : network != null && networkInfo != null && !networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED))) ? false : true;
                if (networkCapabilities.hasTransport(4)) {
                    z10 = z11;
                } else if (z11 && networkCapabilities.getLinkDownstreamBandwidthKbps() != 0) {
                    z10 = true;
                }
                if (network != null && enumC5866b == EnumC5866b.CELLULAR && z10) {
                    enumC5865a = EnumC5865a.b(networkInfo);
                }
            }
            networkInfo = null;
            if (networkCapabilities.hasCapability(12)) {
            }
            if (networkCapabilities.hasTransport(4)) {
            }
            if (network != null) {
                enumC5865a = EnumC5865a.b(networkInfo);
            }
        } else {
            enumC5866b = EnumC5866b.NONE;
        }
        k(enumC5866b, enumC5865a, z10);
    }
}
