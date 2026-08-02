package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import defpackage.e1l;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m extends s0 {
    public static final /* synthetic */ int o = 0;
    public boolean n;

    public static final void g(m mVar) {
        super.cancel();
    }

    @Override // com.facebook.internal.s0
    public final Bundle c(String str) {
        Bundle F = k0.F(Uri.parse(str).getQuery());
        String string = F.getString("bridge_args");
        F.remove("bridge_args");
        if (!k0.A(string)) {
            try {
                F.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", f.a(new JSONObject(string)));
            } catch (JSONException unused) {
                com.facebook.w wVar = com.facebook.w.a;
            }
        }
        String string2 = F.getString("method_results");
        F.remove("method_results");
        if (!k0.A(string2)) {
            try {
                F.putBundle("com.facebook.platform.protocol.RESULT_ARGS", f.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                com.facebook.w wVar2 = com.facebook.w.a;
            }
        }
        F.remove("version");
        F.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", d0.i());
        return F;
    }

    @Override // com.facebook.internal.s0, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        e1l e1lVar = this.d;
        if (!this.k || this.i || e1lVar == null || !e1lVar.isShown()) {
            super.cancel();
        } else {
            if (this.n) {
                return;
            }
            this.n = true;
            e1lVar.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new com.appsflyer.b(this, 8), 1500L);
        }
    }
}
