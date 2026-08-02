package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lql extends BroadcastReceiver {
    public g7h a;
    public boolean b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g7h g7hVar;
        if ("com.dt.ignite.service.action.PROPERTY_CHANGED".equals(intent.getAction())) {
            hpo.a("%s : broadcast received", "PropertyChangeReceiver");
            String stringExtra = intent.getStringExtra("PROPERTIES_CHANGED");
            if (stringExtra == null || (g7hVar = this.a) == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(stringExtra);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if ("DTID".equalsIgnoreCase(jSONArray.getString(i))) {
                        hpo.a("%s : onPropertiesChanged", "OneDTPropertyWatchdog");
                        if (!((vgm) g7hVar.d).a.c()) {
                            vgm vgmVar = (vgm) g7hVar.e;
                            if (vgmVar != null) {
                                vgmVar.l();
                                return;
                            }
                            return;
                        }
                        hpo.a("%s : onPropertiesChanged: will reconnect", "OneDTPropertyWatchdog");
                        vgm vgmVar2 = (vgm) g7hVar.e;
                        if (vgmVar2 != null) {
                            hpo.a("%s : one dt refresh required", "OneDTAuthenticator");
                            vgmVar2.k.set(true);
                        }
                        ((vgm) g7hVar.d).b();
                        return;
                    }
                }
            } catch (JSONException e) {
                de0.g(p5m.ONE_DT_BROADCAST_ERROR, e);
            }
        }
    }
}
