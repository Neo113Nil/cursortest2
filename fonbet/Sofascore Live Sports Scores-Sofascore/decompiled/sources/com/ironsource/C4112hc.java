package com.ironsource;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import com.sofascore.model.mvvm.model.PlayerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.hc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4112hc implements InterfaceC4232o7 {
    private String a = PlayerKt.E_SPORTS_HARD_CARRY;
    private int b = 23;
    private final InterfaceC4250p7 c;
    private ConnectivityManager.NetworkCallback d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.hc$a */
    public class a extends ConnectivityManager.NetworkCallback {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C4112hc c4112hc = C4112hc.this;
            if (network != null) {
                c4112hc.c.a(R3.a(network, this.a), R3.a(this.a, network));
                return;
            }
            InterfaceC4250p7 interfaceC4250p7 = c4112hc.c;
            String b = R3.b(this.a);
            Context context = this.a;
            interfaceC4250p7.a(b, R3.a(context, R3.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C4112hc.this.c.b(R3.a(network, this.a), R3.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C4112hc.this.c.b(R3.a(network, this.a), R3.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (R3.b(this.a).equals("none")) {
                C4112hc.this.c.a();
            }
        }
    }

    public C4112hc(InterfaceC4250p7 interfaceC4250p7) {
        this.c = interfaceC4250p7;
    }

    @Override // com.ironsource.InterfaceC4232o7
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.b || this.d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (Exception e) {
            C4157k4.d().a(e);
        }
    }

    @Override // com.ironsource.InterfaceC4232o7
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.b) {
            a(context);
            if (R3.b(context).equals("none")) {
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
                C4157k4.d().a(e);
            }
        }
    }

    @Override // com.ironsource.InterfaceC4232o7
    public JSONObject c(Context context) {
        return R3.a(context, R3.a(context));
    }

    @Override // com.ironsource.InterfaceC4232o7
    public void a() {
        this.d = null;
    }
}
