package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.nativead.g;
import com.fyber.inneractive.sdk.flow.nativead.s;
import com.fyber.inneractive.sdk.flow.nativead.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.u0;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.nativead.j;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.qlb0;

/* loaded from: classes12.dex */
public final class b implements d, s {
    public static final String h = IAlog.a(b.class);
    public com.fyber.inneractive.sdk.response.nativead.f a;
    public c b;
    public u0 c;
    public com.fyber.inneractive.sdk.flow.nativead.b d = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;
    public j e;
    public r f;
    public long g;

    public b(com.fyber.inneractive.sdk.response.nativead.f fVar, com.fyber.inneractive.sdk.flow.nativead.f fVar2, j jVar, r rVar) {
        this.a = fVar;
        this.b = fVar2;
        this.e = jVar;
        this.f = rVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(g gVar, Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) {
        String str;
        if (this.d == com.fyber.inneractive.sdk.flow.nativead.b.LOADED) {
            return;
        }
        if (gVar == null) {
            this.d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
            i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
            if (exc != null) {
                str = exc.getMessage();
            } else {
                str = "Failed to download main media image: " + iVar.name();
            }
            IAlog.f("%s : %s", h, str);
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
            c cVar = this.b;
            if (cVar != null) {
                ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError, str);
                return;
            }
            return;
        }
        if (this.e != null && this.f != null) {
            u uVar = u.EVENT_READY_ON_CLIENT;
            j jVar = this.e;
            JSONArray b = this.f.b();
            w wVar = new w(jVar);
            wVar.c = uVar;
            wVar.a = null;
            wVar.d = b;
            long currentTimeMillis = System.currentTimeMillis() - this.g;
            IAlog.a(qlb0.a(currentTimeMillis, "%sMain image load took: ", " msec"), IAlog.a(this));
            JSONObject jSONObject = new JSONObject();
            String str2 = this.a.d.a;
            try {
                jSONObject.put("url", str2);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "url", str2);
            }
            String b2 = com.fyber.inneractive.sdk.util.u.b(gVar.b);
            try {
                jSONObject.put("mime", b2);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "mime", b2);
            }
            Long valueOf = Long.valueOf(currentTimeMillis);
            try {
                jSONObject.put("load_time", valueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "load_time", valueOf);
            }
            wVar.f.put(jSONObject);
            wVar.a((String) null);
        }
        this.d = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
        c cVar2 = this.b;
        if (cVar2 != null) {
            com.fyber.inneractive.sdk.flow.nativead.f fVar2 = (com.fyber.inneractive.sdk.flow.nativead.f) cVar2;
            fVar2.d.add(gVar);
            fVar2.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.a;
        if (fVar != null && (cVar = fVar.d) != null && (str = cVar.a) != null && !str.trim().isEmpty()) {
            this.g = System.currentTimeMillis();
            this.d = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
            t tVar = new t(this.a, this);
            IAConfigManager iAConfigManager = IAConfigManager.N;
            u0 u0Var = new u0(tVar, iAConfigManager.u.a, new com.fyber.inneractive.sdk.cache.d(this.a.d.a));
            this.c = u0Var;
            iAConfigManager.r.a(u0Var);
            return;
        }
        a aVar = new a("Main media image is not loadable");
        this.d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
        String message = aVar.getMessage();
        IAlog.f("%s : %s", h, message);
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
        c cVar2 = this.b;
        if (cVar2 != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar2).a(inneractiveInfrastructureError, message);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        u0 u0Var = this.c;
        if (u0Var != null) {
            u0Var.c();
            this.c = null;
        }
        this.e = null;
        this.f = null;
        this.a = null;
        this.b = null;
        this.d = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.d == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }
}
