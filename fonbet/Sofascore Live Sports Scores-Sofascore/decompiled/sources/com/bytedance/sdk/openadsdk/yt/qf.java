package com.bytedance.sdk.openadsdk.yt;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf implements wh {
    Handler pcc = null;
    private wh sf;

    public qf(wh whVar) {
        this.sf = whVar;
    }

    private Context vy() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object invoke = method.invoke(null, null);
            return (Application) invoke.getClass().getMethod("getApplication", null).invoke(invoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public String gm() {
        wh whVar = this.sf;
        return (whVar == null || TextUtils.isEmpty(whVar.gm())) ? "null" : this.sf.gm();
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public boolean kj() {
        wh whVar = this.sf;
        if (whVar != null) {
            return whVar.kj();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public Handler oo() {
        wh whVar = this.sf;
        if (whVar != null && whVar.qf() != null) {
            return this.sf.oo();
        }
        Handler handler = new Handler(pcc("pag_strategy", -1).getLooper());
        this.pcc = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public ExecutorService pcc() {
        wh whVar = this.sf;
        return (whVar == null || whVar.pcc() == null) ? Executors.newCachedThreadPool() : this.sf.pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public Map<String, String> qf() {
        wh whVar = this.sf;
        return (whVar == null || whVar.qf() == null) ? new HashMap() : this.sf.qf();
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public Context sf() {
        wh whVar = this.sf;
        return (whVar == null || whVar.sf() == null) ? vy() : this.sf.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public String vj() {
        wh whVar = this.sf;
        if (whVar != null) {
            return whVar.vj();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public JSONObject wh() {
        wh whVar = this.sf;
        if (whVar != null) {
            return whVar.wh();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public JSONObject pcc(JSONObject jSONObject) {
        wh whVar = this.sf;
        return whVar != null ? whVar.pcc(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.wh
    public HandlerThread pcc(String str, int i) {
        HandlerThread pcc;
        wh whVar = this.sf;
        if (whVar != null && (pcc = whVar.pcc(str, i)) != null) {
            return pcc;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }
}
