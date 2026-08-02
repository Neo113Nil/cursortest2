package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.C2392e1;
import com.ironsource.C2556n4;
import com.ironsource.Ff;
import com.ironsource.K8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.ktor.sse.ServerSentEventKt;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class u implements K8.b {
    protected AbstractAdapter a;
    protected C2392e1 b;
    private boolean c;
    protected JSONObject d;
    protected String e;
    protected int f;
    protected Long g = null;

    u(C2392e1 c2392e1, AbstractAdapter abstractAdapter) {
        this.b = c2392e1;
        this.a = abstractAdapter;
        this.d = c2392e1.c();
    }

    public abstract IronSource.a a();

    public void a(boolean z) {
        this.c = z;
    }

    @Override // com.ironsource.K8.b
    public int b() {
        return this.b.e();
    }

    @Override // com.ironsource.K8.b
    public String c() {
        return this.b.f();
    }

    public Long d() {
        return this.g;
    }

    public String e() {
        return String.format("%s %s", h(), Integer.valueOf(hashCode()));
    }

    public int f() {
        return this.b.d();
    }

    public boolean g() {
        return this.c;
    }

    public String h() {
        return this.b.h().isMultipleInstances() ? this.b.h().getProviderTypeForReflection() : this.b.h().getProviderName();
    }

    public String i() {
        return this.b.g();
    }

    public abstract String j();

    public int k() {
        return 1;
    }

    public Map<String, Object> l() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put("spId", this.b.i());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.b.a());
            hashMap.put("instanceType", Integer.valueOf(o() ? 2 : 1));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(k()));
            if (!TextUtils.isEmpty(this.e)) {
                hashMap.put("dynamicDemandSource", this.e);
                return hashMap;
            }
        } catch (Throwable th) {
            C2556n4.d().a(th);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + c() + ")", th);
        }
        return hashMap;
    }

    public int m() {
        return this.f;
    }

    public boolean n() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.a.isUsingActivityBeforeImpression(Ff.a(a()))) {
                return false;
            }
            ironLog.verbose(c() + " - is using activity before impression and activity is null");
            return true;
        } catch (Throwable th) {
            C2556n4.d().a(th);
            b("Exception while calling adapter.isUsingActivityBeforeImpression() - " + th.getLocalizedMessage());
            return true;
        }
    }

    public boolean o() {
        return this.b.j();
    }

    public void p() {
        this.a = null;
    }

    public boolean q() {
        if (n()) {
            return false;
        }
        return o() || r();
    }

    public boolean r() {
        return this.b.k();
    }

    public void a(String str) {
        a(str, 0);
    }

    public void b(String str) {
        a(str, 3);
    }

    public void c(String str) {
        this.e = d.b().c(str);
    }

    private void a(String str, int i) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, j() + ServerSentEventKt.SPACE + c() + " : " + str, i);
    }
}
