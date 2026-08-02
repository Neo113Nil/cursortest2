package com.ironsource;

import android.content.Context;
import com.ironsource.U3;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class O3 implements InterfaceC4250p7 {
    private InterfaceC4232o7 a;

    public O3(JSONObject jSONObject, Context context) {
        InterfaceC4232o7 a = a(jSONObject, context);
        this.a = a;
        Logger.i("O3", "created ConnectivityAdapter with strategy ".concat(a.getClass().getSimpleName()));
    }

    private InterfaceC4232o7 a(JSONObject jSONObject, Context context) {
        return jSONObject.optInt(U3.j.g0) == 1 ? new BroadcastReceiverStrategy(this) : !C1.c(context, "android.permission.ACCESS_NETWORK_STATE") ? new BroadcastReceiverStrategy(this) : new C4112hc(this);
    }

    public void b(Context context) {
        this.a.b(context);
    }

    public void c(Context context) {
        this.a.a(context);
    }

    @Override // com.ironsource.InterfaceC4250p7
    public void b(String str, JSONObject jSONObject) {
    }

    public void b() {
        this.a.a();
    }

    @Override // com.ironsource.InterfaceC4250p7
    public void a(String str, JSONObject jSONObject) {
    }

    public JSONObject a(Context context) {
        return this.a.c(context);
    }

    @Override // com.ironsource.InterfaceC4250p7
    public void a() {
    }
}
