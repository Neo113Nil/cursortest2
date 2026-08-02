package defpackage;

import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gql extends IIgniteServiceCallback.Stub {
    public final o8m c;

    public gql(o8m o8mVar) {
        this.c = o8mVar;
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        this.c.a(str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        String str2;
        try {
            str2 = new JSONObject(str).getJSONObject("data").getString("token");
        } catch (Exception e) {
            de0.g(p5m.ONE_DT_GENERAL_ERROR, e);
            hpo.h("%s : resolveClientToken : %s", "IgniteAuthenticationCallback", e.toString());
            str2 = null;
        }
        this.c.c(str2);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }
}
