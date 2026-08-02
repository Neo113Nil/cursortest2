package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.C2392e1;
import com.ironsource.C2429g2;
import com.ironsource.C2432g5;
import com.ironsource.C2440gd;
import com.ironsource.C2441ge;
import com.ironsource.C2482j2;
import com.ironsource.C2521l5;
import com.ironsource.C2556n4;
import com.ironsource.C2608q2;
import com.ironsource.C2736x5;
import com.ironsource.EnumC2754y5;
import com.ironsource.InterfaceC2393e2;
import com.ironsource.Jb;
import com.ironsource.L8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.j;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.demandOnly.n;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class l extends m implements n.b, RewardedVideoSmashListener, InterfaceC2393e2 {
    private C2432g5 n;
    private C2432g5 o;
    private ISDemandOnlyRewardedVideoListener p;
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
            IronLog.INTERNAL.verbose("load timed out state=" + l.this.k());
            l.this.a(new IronSourceError(1055, "load timed out"));
        }
    }

    l(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C2392e1(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.a.REWARDED_VIDEO), abstractAdapter);
        this.s = new p.b();
        this.t = Jb.Y().s();
        this.u = Jb.Q().i();
        this.p = iSDemandOnlyRewardedVideoListener;
        this.f = j;
        this.r = eVar;
        this.a.initRewardedVideoForDemandOnly(str, str2, this.c, this);
    }

    private void c(o oVar) {
        this.n = new C2432g5();
        a(s());
        if (!n()) {
            a(new IronSourceError(j.a.k, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new C2521l5());
            C2608q2 a2 = new a.C0216a(aVar.h()).a(h());
            if (a2 == null) {
                IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                a(EnumC2754y5.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
                a(buildLoadFailedError);
                return;
            }
            String k = a2.k();
            if (k == null) {
                IronLog.INTERNAL.error("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
                return;
            }
            b(k);
            a(aVar.a());
            a(aVar.f());
            a(EnumC2754y5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
            this.q.a(a2.b());
            this.o = new C2432g5();
            this.a.loadRewardedVideoForBidding(this.c, null, k, this);
        } catch (Exception e) {
            C2556n4.d().a(e);
            a(ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm: Exception= " + e.getMessage()));
        }
    }

    private IronSourceError q() {
        return a(m.a.SHOW_IN_PROGRESS) ? new IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing") : a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading") : new IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    private com.ironsource.mediationsdk.h r() {
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
        Map<String, Object> rewardedVideoBiddingData = this.a.getRewardedVideoBiddingData(this.c, IronSourceNetworkBridge.jsonObjectInit());
        if (rewardedVideoBiddingData != null) {
            c2482j2.b(rewardedVideoBiddingData);
        }
        hVar.a(c2482j2);
        return hVar;
    }

    private TimerTask s() {
        return new a();
    }

    private void t() {
        this.o = new C2432g5();
        this.a.loadRewardedVideo(this.c, null, this);
    }

    private void u() {
        if (!this.r.a()) {
            IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(EnumC2754y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        com.ironsource.mediationsdk.h r = r();
        IronLog.INTERNAL.verbose("auction waterfallString = " + r.s());
        a(EnumC2754y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, r.s()}});
        this.r.a(ContextProvider.getInstance().getApplicationContext(), r, this);
    }

    private void v() {
        this.g = null;
        this.h = null;
        this.j = null;
        this.q = new C2429g2();
    }

    private void w() {
        this.n = new C2432g5();
        a(s());
        if (n()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            a(EnumC2754y5.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
            a(buildLoadFailedError);
        } else if (o()) {
            u();
        } else {
            t();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public boolean a() {
        boolean z = false;
        if (!a(m.a.LOADED)) {
            a(EnumC2754y5.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            z = this.a.isRewardedVideoAvailable(this.c);
            a(z ? EnumC2754y5.RV_INSTANCE_READY_TRUE : EnumC2754y5.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return z;
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error("exception=" + e.getMessage());
            return z;
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void b(o oVar) {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a2 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a2 != aVar && a2 != aVar2) {
            a(new IronSourceError(1053, a2 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(EnumC2754y5.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void d() {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(EnumC2754y5.RV_INSTANCE_SHOW, (Object[][]) null);
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            this.a.showRewardedVideo(this.c, this);
        } else {
            onRewardedVideoAdShowFailed(q());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC2754y5.RV_BUSINESS_INSTANCE_CLICKED, new Object[0][]);
        this.p.onRewardedVideoAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC2754y5.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.t.a(this.m))}});
        this.u.b(this.m);
        this.p.onRewardedVideoAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC2754y5.RV_BUSINESS_INSTANCE_OPENED, new Object[0][]);
        a(this.q.a(), IronSourceUtils.a());
        this.p.onRewardedVideoAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        Map<String, Object> j = j();
        if (!TextUtils.isEmpty(com.ironsource.mediationsdk.p.h().g())) {
            j.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, com.ironsource.mediationsdk.p.h().g());
        }
        if (com.ironsource.mediationsdk.p.h().m() != null) {
            for (String str : com.ironsource.mediationsdk.p.h().m().keySet()) {
                j.put(ContentMetadata.KEY_CUSTOM_PREFIX + str, com.ironsource.mediationsdk.p.h().m().get(str));
            }
        }
        C2440gd a2 = com.ironsource.mediationsdk.p.h().e().c().f().a();
        if (a2 != null) {
            j.put("placement", a2.c());
            j.put(IronSourceConstants.EVENTS_REWARD_NAME, a2.f());
            j.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(a2.e()));
        } else {
            IronLog.INTERNAL.error("defaultPlacement is null");
        }
        C2736x5 c2736x5 = new C2736x5(EnumC2754y5.RV_BUSINESS_INSTANCE_REWARDED, new JSONObject(j));
        c2736x5.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.a(c2736x5.d(), h()));
        C2441ge.i().a(c2736x5);
        this.p.onRewardedVideoAdRewarded(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(EnumC2754y5.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.p.onRewardedVideoAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC2754y5.RV_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + h() + " state=" + k());
        a(EnumC2754y5.TROUBLESHOOT_RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C2432g5.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(EnumC2754y5.TROUBLESHOOT_RV_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C2432g5.a(this.o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(EnumC2754y5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C2432g5.a(this.n))}});
            a(this.q.c(), IronSourceUtils.a());
            this.p.onRewardedVideoAdLoadSuccess(l());
        }
    }

    void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, C2432g5.a(this.n));
            a(this.q.b(), IronSourceUtils.a());
            this.p.onRewardedVideoAdLoadFailed(l(), ironSourceError);
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
        C2441ge.i().a(new C2736x5(enumC2754y5, new JSONObject(j)));
    }

    private void a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(EnumC2754y5.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(EnumC2754y5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void c() {
        String str;
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a2 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a2 != aVar && a2 != aVar2) {
            if (a2 == aVar3) {
                str = "load already in progress";
            } else {
                str = "cannot load because show is in progress";
            }
            this.p.onRewardedVideoAdLoadFailed(l(), new IronSourceError(1053, str));
            return;
        }
        v();
        a(EnumC2754y5.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        w();
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
        a(EnumC2754y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        a(EnumC2754y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0216a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0216a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(1058, "There is no available ad to load");
                ironLog.error("rewardedVideo - empty waterfall");
                a(ironSourceError);
                return;
            }
            c(str2);
        }
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
            } else {
                a(EnumC2754y5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.a.loadRewardedVideoForBidding(this.c, null, str, this);
            }
        }
    }

    @Override // com.ironsource.U1
    public void a(List<C2608q2> list, String str, C2608q2 c2608q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.U1
    public void a(int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i + " - " + str);
        this.g = null;
        this.h = null;
        a(EnumC2754y5.TROUBLESHOOT_RV_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(j.a.j, "No available ad to load"));
        }
    }
}
