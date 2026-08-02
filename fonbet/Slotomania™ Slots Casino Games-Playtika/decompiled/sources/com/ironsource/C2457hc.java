package com.ironsource;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* renamed from: com.ironsource.hc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2457hc implements InterfaceC2630r7 {
    private String a = "hc";
    private int b = 23;
    private final InterfaceC2648s7 c;
    private ConnectivityManager.NetworkCallback d;

    /* renamed from: com.ironsource.hc$a */
    class a extends ConnectivityManager.NetworkCallback {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                C2457hc.this.c.a(U3.a(network, this.a), U3.a(this.a, network));
                return;
            }
            InterfaceC2648s7 interfaceC2648s7 = C2457hc.this.c;
            String b = U3.b(this.a);
            Context context = this.a;
            interfaceC2648s7.a(b, U3.a(context, U3.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C2457hc.this.c.b(U3.a(network, this.a), U3.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C2457hc.this.c.b(U3.a(network, this.a), U3.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (U3.b(this.a).equals("none")) {
                C2457hc.this.c.a();
            }
        }
    }

    public C2457hc(InterfaceC2648s7 interfaceC2648s7) {
        this.c = interfaceC2648s7;
    }

    @Override // com.ironsource.InterfaceC2630r7
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.b || this.d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (Exception e) {
            C2556n4.d().a(e);
            Log.e(this.a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.InterfaceC2630r7
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.b) {
            a(context);
            if (U3.b(context).equals("none")) {
                this.c.a();
            }
            if (this.d == null) {
                this.d = new a(context);
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.d);
                }
            } catch (Exception e) {
                C2556n4.d().a(e);
                Log.e(this.a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.InterfaceC2630r7
    public JSONObject c(Context context) {
        return U3.a(context, U3.a(context));
    }

    @Override // com.ironsource.InterfaceC2630r7
    public void a() {
        this.d = null;
    }
}
