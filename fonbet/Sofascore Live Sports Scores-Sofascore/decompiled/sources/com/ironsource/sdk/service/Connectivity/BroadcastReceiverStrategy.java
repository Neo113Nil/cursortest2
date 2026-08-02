package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ironsource.C4157k4;
import com.ironsource.InterfaceC4232o7;
import com.ironsource.InterfaceC4250p7;
import com.ironsource.R3;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class BroadcastReceiverStrategy implements InterfaceC4232o7 {
    private final InterfaceC4250p7 a;
    private BroadcastReceiver b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String b = R3.b(context);
            boolean equals = b.equals("none");
            BroadcastReceiverStrategy broadcastReceiverStrategy = BroadcastReceiverStrategy.this;
            if (equals) {
                broadcastReceiverStrategy.a.a();
            } else {
                broadcastReceiverStrategy.a.a(b, new JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(InterfaceC4250p7 interfaceC4250p7) {
        this.a = interfaceC4250p7;
    }

    @Override // com.ironsource.InterfaceC4232o7
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.b);
        } catch (IllegalArgumentException e) {
            C4157k4.d().a(e);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            e2.toString();
        }
    }

    @Override // com.ironsource.InterfaceC4232o7
    public void b(Context context) {
        try {
            context.registerReceiver(this.b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC4232o7
    public JSONObject c(Context context) {
        return new JSONObject();
    }

    @Override // com.ironsource.InterfaceC4232o7
    public void a() {
        this.b = null;
    }
}
