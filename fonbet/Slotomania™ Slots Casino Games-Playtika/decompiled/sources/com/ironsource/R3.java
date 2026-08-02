package com.ironsource;

import android.content.Context;
import com.ironsource.X3;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class R3 implements InterfaceC2648s7 {
    private InterfaceC2630r7 a;

    protected R3(JSONObject jSONObject, Context context) {
        this.a = a(jSONObject, context);
        Logger.i("R3", "created ConnectivityAdapter with strategy " + this.a.getClass().getSimpleName());
    }

    public JSONObject a(Context context) {
        return this.a.c(context);
    }

    @Override // com.ironsource.InterfaceC2648s7
    public void a() {
    }

    @Override // com.ironsource.InterfaceC2648s7
    public void a(String str, JSONObject jSONObject) {
    }

    public void b(Context context) {
        this.a.b(context);
    }

    @Override // com.ironsource.InterfaceC2648s7
    public void b(String str, JSONObject jSONObject) {
    }

    public void c(Context context) {
        this.a.a(context);
    }

    public void b() {
        this.a.a();
    }

    private InterfaceC2630r7 a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(X3.j.g0) == 1) {
            return new BroadcastReceiverStrategy(this);
        }
        if (E1.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new C2457hc(this);
        }
        return new BroadcastReceiverStrategy(this);
    }
}
