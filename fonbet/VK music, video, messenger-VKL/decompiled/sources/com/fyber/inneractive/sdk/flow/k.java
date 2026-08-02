package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.h5s;
import xsna.rqi;

/* loaded from: classes12.dex */
public abstract class k implements com.fyber.inneractive.sdk.interfaces.c, com.fyber.inneractive.sdk.interfaces.b {
    public InneractiveAdRequest a;
    public com.fyber.inneractive.sdk.response.e b;
    public x c;
    public com.fyber.inneractive.sdk.interfaces.a d;
    public com.fyber.inneractive.sdk.interfaces.b e;
    public com.fyber.inneractive.sdk.config.r0 f;
    public com.fyber.inneractive.sdk.config.global.r g;
    public com.fyber.inneractive.sdk.network.timeouts.content.a j;
    public boolean h = false;
    public int i = 0;
    public final j l = new j(this);
    public d k = new d(this);

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.interfaces.a aVar, com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.a = inneractiveAdRequest;
        this.b = eVar;
        this.d = aVar;
        this.e = bVar;
        this.k = new d(this);
        this.g = rVar;
        UnitDisplayType unitDisplayType = eVar.n;
        this.j = new com.fyber.inneractive.sdk.network.timeouts.content.a((unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(Locale.US) : UnitDisplayType.BANNER.name().toLowerCase(Locale.US), com.fyber.inneractive.sdk.response.a.a(eVar.g) == com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST ? "video" : "display", (int) eVar.H, eVar.A, IAConfigManager.N.l, this.g);
        if (this.a == null) {
            this.f = com.fyber.inneractive.sdk.config.a.a(eVar.m);
        }
        try {
            h();
        } catch (Throwable th) {
            IAlog.f("Failed to start ContentLoader", IAlog.a(this));
            com.fyber.inneractive.sdk.network.z.a(th, inneractiveAdRequest, eVar);
            this.k.a();
            b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.CONTENT_LOADER_START_FAILED));
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void b() {
        String a = IAlog.a(this);
        Integer valueOf = Integer.valueOf(this.i - 1);
        int i = this.i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.j;
        if (aVar != null) {
            if (aVar.g) {
                i = aVar.a - i;
            }
            r4 = rqi.a(aVar.b, i, aVar.d, i == aVar.a ? aVar.h : 0);
        }
        IAlog.a("%s : IAAdContentLoaderImpl : onRetry() attempt: %d timeout: %d", a, valueOf, Integer.valueOf(r4));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.e;
        if (bVar != null) {
            bVar.b();
        }
        h();
    }

    public void c() {
        f();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public abstract void cancel();

    public InneractiveInfrastructureError d() {
        i iVar = i.WEBVIEW_LOAD_TIMEOUT;
        com.fyber.inneractive.sdk.response.e eVar = this.b;
        if ("video".equalsIgnoreCase((eVar == null || com.fyber.inneractive.sdk.response.a.a(eVar.g) != com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST) ? "display" : "video")) {
            iVar = i.VIDEO_AD_LOAD_TIMEOUT;
        }
        return new InneractiveInfrastructureError(InneractiveErrorCode.LOAD_TIMEOUT, iVar);
    }

    public abstract String e();

    public final void f() {
        String str;
        this.k.a();
        InneractiveAdRequest inneractiveAdRequest = this.a;
        if (inneractiveAdRequest != null) {
            str = inneractiveAdRequest.b;
        } else {
            com.fyber.inneractive.sdk.response.e eVar = this.b;
            if (eVar == null || (str = eVar.y) == null) {
                str = null;
            }
        }
        com.fyber.inneractive.sdk.metrics.d.d.a(str).i();
        x xVar = this.c;
        if (xVar != null) {
            xVar.a(str);
        }
        com.fyber.inneractive.sdk.interfaces.a aVar = this.d;
        if (aVar != null) {
            aVar.a(this.a);
        }
    }

    public abstract void g();

    public final void h() {
        int i = this.i;
        this.i = i + 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.j;
        if (aVar != null) {
            if (aVar.g) {
                i = aVar.a - i;
            }
            r2 = rqi.a(aVar.b, i, aVar.d, i == aVar.a ? aVar.h : 0);
        }
        IAlog.a("%s : IAAdContentLoaderImpl : Start timeout: %d, attempt number: %d", IAlog.a(this), Integer.valueOf(r2), Integer.valueOf(this.i - 1));
        d dVar = this.k;
        if (dVar.a == null) {
            dVar.a = new Handler(h5s.a("TimeoutHandlerThread").getLooper());
        }
        dVar.a.postDelayed(dVar.d, r2);
        g();
    }

    public final void b(InneractiveInfrastructureError inneractiveInfrastructureError) {
        String sb;
        IAlog.a("%s : IAAdContentLoaderImpl : Handle Retry for error: %s", IAlog.a(this), inneractiveInfrastructureError.getErrorCode().toString());
        d dVar = this.k;
        dVar.getClass();
        IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(dVar));
        Handler handler = dVar.a;
        if (handler != null) {
            handler.removeCallbacks(dVar.d);
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.j;
        boolean z = this.i <= (aVar != null ? aVar.a : 0);
        IAlog.a("%s : IAAdContentLoaderImpl : should retry: %s", IAlog.a(this), Boolean.valueOf(z));
        if (z) {
            x xVar = this.c;
            if (xVar != null) {
                xVar.destroy();
                this.c = null;
            }
            com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.j;
            int i = aVar2 != null ? aVar2.e : 0;
            IAlog.a("%s : IAAdContentLoaderImpl : retryLoad : post load ad content retry task with delay: %d", IAlog.a(this), Integer.valueOf(i));
            com.fyber.inneractive.sdk.util.r.b.postDelayed(this.l, i);
            return;
        }
        com.fyber.inneractive.sdk.interfaces.a aVar3 = this.d;
        if (aVar3 != null) {
            aVar3.a(inneractiveInfrastructureError);
        }
        InneractiveAdRequest inneractiveAdRequest = this.a;
        com.fyber.inneractive.sdk.response.e eVar = this.b;
        com.fyber.inneractive.sdk.config.global.r rVar = this.g;
        JSONArray b = rVar == null ? null : rVar.b();
        if (inneractiveInfrastructureError.getErrorCode() == InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD) {
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.NATIVE_ERROR_FAILED_TO_LOAD_AD;
            if (!inneractiveInfrastructureError.isErrorAlreadyReported(tVar)) {
                IAlog.a("Firing Event 402 - NativeAdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                JSONObject jSONObject = new JSONObject();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                wVar.b = tVar;
                wVar.a = inneractiveAdRequest;
                wVar.d = b;
                if (inneractiveInfrastructureError.getCause() != null) {
                    sb = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    for (int i2 = 7; i2 >= 0 && i2 < 13 && i2 < stackTrace.length; i2++) {
                        sb2.append(stackTrace[i2].toString());
                        sb2.append(StringUtils.COMMA);
                    }
                    sb = sb2.toString();
                }
                String obj = inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason().toString();
                try {
                    jSONObject.put("message", obj);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "message", obj);
                }
                try {
                    jSONObject.put("description", sb);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "description", sb);
                }
                String description = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put("extra_description", description);
                } catch (Exception unused3) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "extra_description", description);
                }
                wVar.f.put(jSONObject);
                wVar.a((String) null);
                inneractiveInfrastructureError.addReportedError(tVar);
            }
        } else {
            a.a(inneractiveAdRequest, inneractiveInfrastructureError, this.c, eVar, b);
        }
        cancel();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a() {
        int i;
        InneractiveInfrastructureError inneractiveInfrastructureError;
        String a = IAlog.a(this);
        Integer valueOf = Integer.valueOf(this.i - 1);
        int i2 = this.i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.j;
        if (aVar != null) {
            if (aVar.g) {
                i2 = aVar.a - i2;
            }
            i = rqi.a(aVar.b, i2, aVar.d, i2 == aVar.a ? aVar.h : 0);
        } else {
            i = 0;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : onTimeout() attempt: %d timeout: %d", a, valueOf, Integer.valueOf(i));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.e;
        if (bVar != null) {
            bVar.a();
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.j;
        if (this.i <= (aVar2 != null ? aVar2.a : 0)) {
            inneractiveInfrastructureError = d();
        } else {
            inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.IN_FLIGHT_TIMEOUT, i.NO_TIME_TO_LOAD_AD_CONTENT);
        }
        com.fyber.inneractive.sdk.util.r.a.execute(new e(new f(this.b, this.a, e(), this.g.b()), inneractiveInfrastructureError));
        b(inneractiveInfrastructureError);
    }
}
