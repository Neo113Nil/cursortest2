package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* renamed from: com.ironsource.ic, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4371ic implements InterfaceC4544s7 {
    private String a = "ic";
    private int b = 23;
    private final InterfaceC4562t7 c;
    private ConnectivityManager.NetworkCallback d;

    /* renamed from: com.ironsource.ic$a */
    public class a extends ConnectivityManager.NetworkCallback {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                C4371ic.this.c.a(U3.a(network, this.a), U3.a(this.a, network));
                return;
            }
            InterfaceC4562t7 interfaceC4562t7 = C4371ic.this.c;
            String b = U3.b(this.a);
            Context context = this.a;
            interfaceC4562t7.a(b, U3.a(context, U3.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C4371ic.this.c.b(U3.a(network, this.a), U3.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C4371ic.this.c.b(U3.a(network, this.a), U3.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (U3.b(this.a).equals("none")) {
                C4371ic.this.c.a();
            }
        }
    }

    public C4371ic(InterfaceC4562t7 interfaceC4562t7) {
        this.c = interfaceC4562t7;
    }

    @Override // com.ironsource.InterfaceC4544s7
    @SuppressLint({"NewApi", "MissingPermission"})
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
                C4452n4.d().a(e);
                Log.e(this.a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.InterfaceC4544s7
    public JSONObject c(Context context) {
        return U3.a(context, U3.a(context));
    }

    @Override // com.ironsource.InterfaceC4544s7
    @SuppressLint({"NewApi"})
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.b || this.d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (Exception e) {
            C4452n4.d().a(e);
            Log.e(this.a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.InterfaceC4544s7
    public void a() {
        this.d = null;
    }
}
