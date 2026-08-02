package com.facebook.login;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.j0;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n implements j0 {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ GetTokenLoginMethodHandler b;
    public final /* synthetic */ LoginClient.Request c;

    public n(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
        this.a = bundle;
        this.b = getTokenLoginMethodHandler;
        this.c = request;
    }

    @Override // com.facebook.internal.j0
    public final void a(JSONObject jSONObject) {
        String string;
        Bundle bundle = this.a;
        GetTokenLoginMethodHandler getTokenLoginMethodHandler = this.b;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e) {
                LoginClient d = getTokenLoginMethodHandler.d();
                LoginClient.Request request = getTokenLoginMethodHandler.d().g;
                String message = e.getMessage();
                ArrayList arrayList = new ArrayList();
                arrayList.add("Caught exception");
                if (message != null) {
                    arrayList.add(message);
                }
                d.c(new LoginClient.Result(request, 3, null, null, TextUtils.join(": ", arrayList), null));
                return;
            }
        } else {
            string = null;
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        getTokenLoginMethodHandler.n(bundle, this.c);
    }

    @Override // com.facebook.internal.j0
    public final void b(com.facebook.q qVar) {
        GetTokenLoginMethodHandler getTokenLoginMethodHandler = this.b;
        LoginClient d = getTokenLoginMethodHandler.d();
        LoginClient.Request request = getTokenLoginMethodHandler.d().g;
        String message = qVar != null ? qVar.getMessage() : null;
        ArrayList arrayList = new ArrayList();
        arrayList.add("Caught exception");
        if (message != null) {
            arrayList.add(message);
        }
        d.c(new LoginClient.Result(request, 3, null, null, TextUtils.join(": ", arrayList), null));
    }
}
