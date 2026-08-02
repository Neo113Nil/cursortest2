package com.digitalturbine.ignite.authenticator.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.digitalturbine.ignite.authenticator.events.d;
import org.json.JSONArray;
import org.json.JSONException;
import xsna.djy0;
import xsna.ofy0;
import xsna.vay0;
import xsna.yyy0;

/* loaded from: classes12.dex */
public final class a extends BroadcastReceiver {
    public djy0 a;
    public boolean b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        djy0 djy0Var;
        if ("com.dt.ignite.service.action.PROPERTY_CHANGED".equals(intent.getAction())) {
            vay0.a("%s : broadcast received", "PropertyChangeReceiver");
            String stringExtra = intent.getStringExtra("PROPERTIES_CHANGED");
            if (stringExtra == null || (djy0Var = this.a) == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(stringExtra);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if ("DTID".equalsIgnoreCase(jSONArray.getString(i))) {
                        vay0.a("%s : onPropertiesChanged", "OneDTPropertyWatchdog");
                        if (!djy0Var.c.b.c()) {
                            yyy0 yyy0Var = djy0Var.d;
                            if (yyy0Var != null) {
                                yyy0Var.l();
                                return;
                            }
                            return;
                        }
                        vay0.a("%s : onPropertiesChanged: will reconnect", "OneDTPropertyWatchdog");
                        yyy0 yyy0Var2 = djy0Var.d;
                        if (yyy0Var2 != null) {
                            vay0.a("%s : one dt refresh required", "OneDTAuthenticator");
                            yyy0Var2.l.set(true);
                        }
                        djy0Var.c.b();
                        return;
                    }
                }
            } catch (JSONException e) {
                ofy0.f(d.ONE_DT_BROADCAST_ERROR, e);
            }
        }
    }
}
