package com.ironsource;

import android.content.Context;
import com.ironsource.X3;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public abstract class R3 implements InterfaceC4562t7 {
    private InterfaceC4544s7 a;

    public R3(JSONObject jSONObject, Context context) {
        InterfaceC4544s7 a = a(jSONObject, context);
        this.a = a;
        Logger.i("R3", "created ConnectivityAdapter with strategy ".concat(a.getClass().getSimpleName()));
    }

    @Override // com.ironsource.InterfaceC4562t7
    public void a() {
    }

    @Override // com.ironsource.InterfaceC4562t7
    public void b(String str, JSONObject jSONObject) {
    }

    public void c(Context context) {
        this.a.a(context);
    }

    @Override // com.ironsource.InterfaceC4562t7
    public void a(String str, JSONObject jSONObject) {
    }

    public void b(Context context) {
        this.a.b(context);
    }

    public JSONObject a(Context context) {
        return this.a.c(context);
    }

    public void b() {
        this.a.a();
    }

    private InterfaceC4544s7 a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(X3.j.g0) == 1) {
            return new BroadcastReceiverStrategy(this);
        }
        if (!E1.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new BroadcastReceiverStrategy(this);
        }
        return new C4371ic(this);
    }
}
