package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C2392e1;
import com.ironsource.C2429g2;
import com.ironsource.C2432g5;
import com.ironsource.C2482j2;
import com.ironsource.C2521l5;
import com.ironsource.C2556n4;
import com.ironsource.C2608q2;
import com.ironsource.C2736x5;
import com.ironsource.EnumC2754y5;
import com.ironsource.F9;
import com.ironsource.InterfaceC2393e2;
import com.ironsource.Jb;
import com.ironsource.L8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.demandOnly.n;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class g extends m implements n.a, InterstitialSmashListener, InterfaceC2393e2 {
    private C2432g5 n;
    private C2432g5 o;
    private ISDemandOnlyInterstitialListener p;
    private C2429g2 q;
    private com.ironsource.mediationsdk.e r;
    private p s;
    private final L8 t;
    private final L8.a u;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    public g(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener, long j, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C2392e1(networkSettings, networkSettings.getInterstitialSettings(), IronSource.a.INTERSTITIAL), abstractAdapter);
        this.s = new p.b();
        this.t = Jb.Y().s();
        this.u = Jb.Q().i();
        this.p = iSDemandOnlyInterstitialListener;
        this.f = j;
        this.r = eVar;
        this.a.initInterstitial(str, str2, this.c, this);
    }

    private void c(o oVar) {
        this.n = new C2432g5();
        a(new a());
        if (!n()) {
            a(new IronSourceError(e.a.k, "loadInterstitialWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new C2521l5());
            C2608q2 a2 = new a.C0216a(aVar.h()).a(h());
            if (a2 == null) {
                IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                a(EnumC2754y5.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
                a(buildLoadFailedError);
                return;
            }
            String k = a2.k();
            if (k == null) {
                IronLog.INTERNAL.error("serverData is null");
                a(new IronSourceError(e.a.i, "No available ad to load"));
                return;
            }
            b(k);
            a(aVar.a());
            a(aVar.f());
            a(EnumC2754y5.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
            this.q.a(a2.b());
            this.o = new C2432g5();
            this.a.loadInterstitialForBidding(this.c, null, k, this);
        } catch (Exception e) {
            C2556n4.d().a(e);
            a(ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm: Exception= " + e.getMessage()));
        }
    }

    private com.ironsource.mediationsdk.h q() {
        String str = i() + h();
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.m);
        hVar.b(IronSourceUtils.g());
        hVar.a(true);
        hVar.c(true);
        hVar.e(str);
        hVar.c(l());
        hVar.a(this.t.a(this.m));
        C2482j2 c2482j2 = new C2482j2(h(), false);
        c2482j2.a(this.s.value());
        Map<String, Object> interstitialBiddingData = this.a.getInterstitialBiddingData(this.c, IronSourceNetworkBridge.jsonObjectInit());
        if (interstitialBiddingData != null) {
            c2482j2.b(interstitialBiddingData);
        }
        hVar.a(c2482j2);
        return hVar;
    }

    private void r() {
        this.o = new C2432g5();
        this.a.loadInterstitial(this.c, null, this);
    }

    private void s() {
        if (!this.r.a()) {
            IronLog.INTERNAL.verbose("can't load the interstitial the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(EnumC2754y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        com.ironsource.mediationsdk.h q = q();
        IronLog.INTERNAL.verbose("auction waterfallString = " + q.s());
        a(EnumC2754y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, q.s()}});
        this.r.a(ContextProvider.getInstance().getApplicationContext(), q, this);
    }

    private void t() {
        this.g = null;
        this.h = null;
        this.j = null;
        this.q = new C2429g2();
    }

    private void u() {
        this.n = new C2432g5();
        a(new b());
        if (n()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial must be called by non bidder instances");
            a(EnumC2754y5.IS_INSTANCE_LOAD_FAILED, (Object[][]) null);
            a(buildLoadFailedError);
        } else if (o()) {
            s();
        } else {
            r();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void a(o oVar) {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a2 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a2 != aVar && a2 != aVar2) {
            a(new IronSourceError(1050, a2 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(EnumC2754y5.IS_INSTANCE_LOAD, (Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void b() {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a2 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a2 != aVar && a2 != aVar2) {
            this.p.onInterstitialAdLoadFailed(l(), new IronSourceError(1050, a2 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(EnumC2754y5.IS_INSTANCE_LOAD, (Object[][]) null);
        u();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void e() {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(EnumC2754y5.IS_INSTANCE_SHOW, (Object[][]) null);
        m.a aVar = m.a.LOADED;
        m.a aVar2 = m.a.SHOW_IN_PROGRESS;
        if (a(aVar, aVar2)) {
            this.a.showInterstitial(this.c, this);
        } else {
            onInterstitialAdShowFailed(a(aVar2) ? new IronSourceError(1064, "showInterstitial error: can't show ad while an ad is already showing") : a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1065, "showInterstitial error: can't show ad while an ad is loading") : new IronSourceError(1066, "showInterstitial error: no available ads to show"));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC2754y5.IS_INSTANCE_CLICKED, new Object[0][]);
        this.p.onInterstitialAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC2754y5.IS_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.t.a(this.m))}});
        this.u.b(this.m);
        this.p.onInterstitialAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + " instance name= " + h() + " state=" + k());
        a(EnumC2754y5.TROUBLESHOOTING_IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C2432g5.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC2754y5.IS_INSTANCE_OPENED, new Object[0][]);
        a(this.q.a(), IronSourceUtils.a());
        this.p.onInterstitialAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(EnumC2754y5.TROUBLESHOOTING_IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C2432g5.a(this.o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(EnumC2754y5.IS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C2432g5.a(this.n))}});
            a(this.q.c(), IronSourceUtils.a());
            this.p.onInterstitialAdReady(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(EnumC2754y5.IS_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.p.onInterstitialAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC2754y5.IS_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public boolean a() {
        EnumC2754y5 enumC2754y5;
        boolean z = false;
        if (!a(m.a.LOADED)) {
            a(EnumC2754y5.IS_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            z = this.a.isInterstitialReady(this.c);
            if (z) {
                enumC2754y5 = EnumC2754y5.IS_INSTANCE_READY_TRUE;
            } else {
                enumC2754y5 = EnumC2754y5.IS_INSTANCE_READY_FALSE;
            }
            a(enumC2754y5, (Object[][]) null);
            return z;
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error("exception=" + e.getMessage());
            return z;
        }
    }

    void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, C2432g5.a(this.n));
            a(this.q.b(), IronSourceUtils.a());
            this.p.onInterstitialAdLoadFailed(l(), ironSourceError);
        }
    }

    private void a(EnumC2754y5 enumC2754y5, Object[][] objArr) {
        Map<String, Object> j = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    j.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C2556n4.d().a(e);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e));
            }
        }
        F9.i().a(new C2736x5(enumC2754y5, new JSONObject(j)));
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(e.a.i, "No available ad to load"));
            } else {
                a(EnumC2754y5.TROUBLESHOOTING_IS_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.a.loadInterstitialForBidding(this.c, null, str, this);
            }
        }
    }

    private void a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1158) {
            a(EnumC2754y5.IS_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(EnumC2754y5.IS_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.j, str);
    }

    @Override // com.ironsource.InterfaceC2393e2
    public void a(d.a aVar, int i, long j, int i2, String str) {
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.g = aVar.a();
        this.h = aVar.f();
        this.s = aVar.a(l());
        a.C0216a c0216a = new a.C0216a(aVar.h());
        if (c0216a.isEmpty()) {
            str2 = "";
        } else {
            C2608q2 c2608q2 = c0216a.get(0);
            this.q.a(c2608q2.b());
            this.q.c(c2608q2.h());
            this.q.b(c2608q2.g());
            str2 = c2608q2.k();
            b(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            a(EnumC2754y5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str}});
        }
        a(EnumC2754y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        a(EnumC2754y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0216a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0216a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(1158, "There is no available ad to load");
                ironLog.error("interstitial - empty waterfall");
                a(ironSourceError);
                return;
            }
            c(str2);
        }
    }

    @Override // com.ironsource.U1
    public void a(List<C2608q2> list, String str, C2608q2 c2608q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.U1
    public void a(int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose("error " + i + " - " + str);
        this.g = null;
        this.h = null;
        a(EnumC2754y5.TROUBLESHOOTING_IS_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(e.a.j, "No available ad to load"));
        }
    }
}
