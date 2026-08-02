package com.fyber.inneractive.sdk.ignite;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.a1;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ray0;
import xsna.tay0;
import xsna.z65;

/* loaded from: classes12.dex */
public final class h implements ray0, z65 {
    public Context a;
    public IIgniteServiceAPI b;
    public long k;
    public String l;
    public d m;
    public tay0 n;
    public com.fyber.inneractive.sdk.config.global.r o;
    public l p;
    public final Bundle c = new Bundle();
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public boolean i = false;
    public boolean j = false;
    public final i d = new i(new e(this));

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar) {
        boolean z;
        h hVar;
        this.o = rVar;
        if (!TextUtils.isEmpty(this.l)) {
            IAlog.a("%s : Ignite installed will init IgniteManager", "IgniteAdapter");
            com.fyber.inneractive.sdk.config.global.features.j jVar = (com.fyber.inneractive.sdk.config.global.features.j) rVar.a(com.fyber.inneractive.sdk.config.global.features.j.class);
            IAlog.a("%s : initializing ignite features", "IgniteAdapter");
            Boolean c = jVar.c("odt");
            this.e = c != null ? c.booleanValue() : false;
            Boolean c2 = jVar.c("flow");
            this.f = c2 != null ? c2.booleanValue() : false;
            Boolean c3 = jVar.c(SignalingProtocol.KEY_UPDATES);
            this.g = c3 != null ? c3.booleanValue() : false;
            Context context = this.a;
            if (context != null && ((z = this.e) || this.f)) {
                if (this.p == null) {
                    this.j = false;
                    hVar = this;
                    l lVar = new l(context, new k(), new com.fyber.inneractive.sdk.ignite.events.wrappers.a(), z, this.f, this.g, hVar);
                    hVar.p = lVar;
                    lVar.authenticate();
                } else {
                    hVar = this;
                }
                hVar.k = TimeUnit.SECONDS.toMillis(IAConfigManager.N.v.a.b.a("igniteInstallTimeOutInSeconds", 15, 1));
            }
        }
    }

    public final void m() {
        d dVar = this.m;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar);
            this.m = null;
        }
    }

    public final boolean n() {
        l lVar = this.p;
        return lVar != null && lVar.isConnected() && this.p.isAuthenticated();
    }

    public final boolean o() {
        l lVar = this.p;
        return lVar == null || lVar.a.f();
    }

    @Override // xsna.ray0
    public final void onCredentialsRequestFailed(String str) {
        l lVar = this.p;
        if (lVar != null) {
            lVar.onCredentialsRequestFailed(str);
        }
    }

    @Override // xsna.ray0
    public final void onCredentialsRequestSuccess(String str, String str2) {
        l lVar = this.p;
        if (lVar != null) {
            lVar.onCredentialsRequestSuccess(str, str2);
        }
    }

    @Override // xsna.z65
    public final void onIgniteServiceAuthenticated(String str) {
        this.c.putString("clientToken", str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticated", new Object[0]);
        tay0 tay0Var = this.n;
        if (tay0Var != null) {
            tay0Var.a();
            this.n = null;
        }
    }

    @Override // xsna.z65
    public final void onIgniteServiceAuthenticationFailed(String str) {
        this.b = null;
        a(j.FAILED_TO_AUTHENTICATE, str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticationFailed : error : %s", str);
        tay0 tay0Var = this.n;
        if (tay0Var != null) {
            tay0Var.a(str);
            this.n = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // xsna.z65
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onIgniteServiceConnected(ComponentName componentName, IBinder iBinder) {
        o newBuilder;
        String str;
        Context context;
        IAlog.a("IgniteAdapter: onIgniteServiceConnected", new Object[0]);
        this.l = componentName.getPackageName();
        this.b = IIgniteServiceAPI.Stub.asInterface(iBinder);
        if (this.j) {
            l lVar = this.p;
            if (lVar != null) {
                lVar.authenticate();
                return;
            }
            return;
        }
        this.j = true;
        byte[] bArr = null;
        try {
            newBuilder = IgniteRequestOuterClass$IgniteRequest.newBuilder();
            String str2 = IAConfigManager.N.c;
            newBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setAppId(str2);
            String packageName = com.fyber.inneractive.sdk.util.o.a.getPackageName();
            newBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setBundle(packageName);
            String version = InneractiveAdManager.getVersion();
            newBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setSdkVersion(version);
            String str3 = this.l;
            newBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setIgnitePackageName(str3);
        } catch (Throwable unused) {
            IAlog.a("Failed to build ignite request", new Object[0]);
        }
        if (!TextUtils.isEmpty(this.l) && (context = this.a) != null) {
            try {
                str = context.getPackageManager().getPackageInfo(this.l, 0).versionName;
            } catch (Exception unused2) {
                IAlog.a("Failed to resolve ignite version", new Object[0]);
            }
            newBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setIgniteVersionName(str);
            String a = com.fyber.inneractive.sdk.util.o.a(this.a);
            newBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setAppSignature(a);
            bArr = ((IgniteRequestOuterClass$IgniteRequest) newBuilder.a()).toByteArray();
            if (bArr == null) {
                IAConfigManager.N.r.a(new a1(new b(this), bArr, this.o));
                return;
            }
            return;
        }
        str = null;
        newBuilder.c();
        ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setIgniteVersionName(str);
        String a2 = com.fyber.inneractive.sdk.util.o.a(this.a);
        newBuilder.c();
        ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setAppSignature(a2);
        bArr = ((IgniteRequestOuterClass$IgniteRequest) newBuilder.a()).toByteArray();
        if (bArr == null) {
        }
    }

    @Override // xsna.z65
    public final void onIgniteServiceConnectionFailed(String str) {
        IAlog.a("IgniteAdapter: onIgniteServiceConnectionFailed : error : %s", str);
        a(j.FAILED_TO_BIND_SERVICE, str);
    }

    @Override // xsna.z65
    public final void onOdtUnsupported() {
        l lVar;
        IAlog.f("%s: onOdtUnsupported : unsupported ignite version", "IgniteAdapter");
        if (this.f || (lVar = this.p) == null) {
            return;
        }
        lVar.destroy();
        this.p = null;
    }

    public final void a(j jVar, String str) {
        if (this.i) {
            return;
        }
        this.i = true;
        t tVar = t.IGNITE_FLOW_FAILED_TO_START;
        w wVar = new w((com.fyber.inneractive.sdk.response.e) null);
        wVar.b = tVar;
        wVar.a = null;
        wVar.d = null;
        JSONObject jSONObject = new JSONObject();
        String a = jVar.a();
        try {
            jSONObject.put("error_code", a);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "error_code", a);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("message", str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "message", str);
            }
        }
        wVar.f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void a(tay0 tay0Var) {
        IAlog.a("IgniteAdapter : reconnectIgnite : with callback : " + tay0Var, new Object[0]);
        this.n = tay0Var;
        l lVar = this.p;
        if (lVar != null) {
            lVar.authenticate();
        }
    }

    public final void a(String str, g gVar) {
        String a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.a("Starting install timeout with %d", Long.valueOf(this.k));
        d dVar = new d(this);
        this.m = dVar;
        com.fyber.inneractive.sdk.util.r.b.postDelayed(dVar, this.k);
        if (n() && !o() && this.b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("packageName", str);
                jSONObject.put("data", jSONObject2);
                IIgniteServiceAPI iIgniteServiceAPI = this.b;
                String jSONObject3 = jSONObject.toString();
                Bundle bundle = this.c;
                Bundle bundle2 = new Bundle();
                i iVar = this.d;
                c cVar = new c(this, gVar);
                iVar.getClass();
                iIgniteServiceAPI.install(jSONObject3, bundle, bundle2, new s((e) iVar.a, cVar));
                return;
            } catch (Exception unused) {
                IAlog.a("Failed to install app", new Object[0]);
                return;
            }
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                if (o()) {
                    a = j.SESSION_EXPIRED.a();
                } else {
                    a = j.NOT_CONNECTED.a();
                }
                rVar.a((String) null, a, (String) null);
            }
        }
    }
}
