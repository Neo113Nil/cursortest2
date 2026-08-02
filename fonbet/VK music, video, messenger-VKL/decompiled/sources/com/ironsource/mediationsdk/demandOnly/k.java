package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C4301ee;
import com.ironsource.C4399k5;
import com.ironsource.C4452n4;
import com.ironsource.EnumC4650y5;
import com.ironsource.J9;
import com.ironsource.P4;
import com.ironsource.X7;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public class k implements i.c {
    private final P4 a;
    private final ConcurrentHashMap<String, l> b;
    private final X7<ISDemandOnlyRewardedVideoListener> c;

    public k(List<NetworkSettings> list, C4301ee c4301ee, com.ironsource.mediationsdk.c cVar, X7<ISDemandOnlyRewardedVideoListener> x7, String str, String str2, P4 p4) {
        String d = IronSourceUtils.d();
        boolean d2 = c4301ee.d();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(c4301ee.k(), d);
        this.b = new ConcurrentHashMap<>();
        this.a = p4;
        this.c = x7;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter a = cVar.a(networkSettings, networkSettings.getRewardedVideoSettings(), true);
                if (a != null) {
                    l lVar = new l(str, str2, networkSettings, this.c.a(networkSettings.getSubProviderId()), c4301ee.i(), a, new com.ironsource.mediationsdk.e(fVar));
                    lVar.a(d2);
                    this.b.put(networkSettings.getSubProviderId(), lVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void a(h.d dVar) {
        String e = dVar.e();
        try {
            l lVar = this.b.get(e);
            if (lVar == null) {
                this.a.a(EnumC4650y5.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_LOAD, e);
                IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.c.a(e).onRewardedVideoAdLoadFailed(e, buildNonExistentInstanceError);
                return;
            }
            if (dVar.c()) {
                lVar.b(new o.a(J9.b(C4399k5.b().c(), dVar.b())));
            } else {
                lVar.c();
            }
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo exception " + e2.getMessage());
            IronLog.API.error(buildLoadFailedError.getErrorMessage());
            this.c.a(e).onRewardedVideoAdLoadFailed(e, buildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void b(String str) {
        try {
            l lVar = this.b.get(str);
            if (lVar != null) {
                lVar.d();
                return;
            }
            this.a.a(EnumC4650y5.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_SHOW, str);
            IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
            this.c.a(str).onRewardedVideoAdShowFailed(str, buildNonExistentInstanceError);
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronSourceError buildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "showRewardedVideo exception " + e.getMessage());
            IronLog.API.error(buildShowFailedError.getErrorMessage());
            this.c.a(str).onRewardedVideoAdShowFailed(str, buildShowFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public boolean a(String str) {
        l lVar = this.b.get(str);
        if (lVar == null) {
            this.a.a(EnumC4650y5.RV_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
            return false;
        }
        return lVar.a();
    }

    public ConcurrentHashMap<String, l> a() {
        return this.b;
    }
}
