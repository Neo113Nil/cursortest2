package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C4123i5;
import com.ironsource.C4157k4;
import com.ironsource.D9;
import com.ironsource.EnumC4373w5;
import com.ironsource.I9;
import com.ironsource.M4;
import com.ironsource.U7;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class f implements i.b {
    private final M4 a;
    private final ConcurrentHashMap<String, g> b;
    private final U7<ISDemandOnlyInterstitialListener> c;

    public f(List<NetworkSettings> list, D9 d9, com.ironsource.mediationsdk.c cVar, U7<ISDemandOnlyInterstitialListener> u7, String str, String str2, M4 m4) {
        String d = IronSourceUtils.d();
        boolean j = d9.j();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(d9.g(), d);
        this.b = new ConcurrentHashMap<>();
        this.a = m4;
        this.c = u7;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter a = cVar.a(networkSettings, networkSettings.getInterstitialSettings(), true);
                if (a != null) {
                    g gVar = new g(str, str2, networkSettings, this.c.a(networkSettings.getSubProviderId()), d9.e(), a, new com.ironsource.mediationsdk.e(fVar));
                    gVar.a(j);
                    this.b.put(networkSettings.getSubProviderId(), gVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(@NotNull h.d dVar) {
        String e = dVar.e();
        String b = dVar.b();
        try {
            g gVar = this.b.get(e);
            if (gVar == null) {
                this.a.a(EnumC4373w5.IS_DO_INSTANCE_NOT_FOUND_IN_LOAD, e);
                IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.c.a(e).onInterstitialAdLoadFailed(e, buildNonExistentInstanceError);
                return;
            }
            if (TextUtils.isEmpty(b)) {
                gVar.b();
            } else {
                gVar.a(new o.a(I9.b(C4123i5.b().c(), b)));
            }
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e2.getMessage());
            IronLog.API.error(buildLoadFailedError.getErrorMessage());
            this.c.a(e).onInterstitialAdLoadFailed(e, buildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public boolean b(String str) {
        g gVar = this.b.get(str);
        if (gVar != null) {
            return gVar.a();
        }
        this.a.a(EnumC4373w5.IS_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
        return false;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(String str) {
        try {
            g gVar = this.b.get(str);
            if (gVar == null) {
                this.a.a(EnumC4373w5.IS_DO_INSTANCE_NOT_FOUND_IN_SHOW, str);
                IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.c.a(str).onInterstitialAdShowFailed(str, buildNonExistentInstanceError);
                return;
            }
            gVar.e();
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronSourceError buildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial exception " + e.getMessage());
            IronLog.API.error(buildShowFailedError.getErrorMessage());
            this.c.a(str).onInterstitialAdShowFailed(str, buildShowFailedError);
        }
    }

    public ConcurrentHashMap<String, g> a() {
        return this.b;
    }
}
