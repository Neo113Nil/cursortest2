package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.hb;
import xsna.rsr;
import xsna.s3q0;
import xsna.vtk0;
import xsna.xh50;
import xsna.yvj;

/* compiled from: AdRevenueObserver.kt */
/* loaded from: classes14.dex */
public final class AdRevenueObserver {
    private final AdRevenueRepository adRevenueRepository;
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final xh50<Boolean> isRunning = vtk0.a(Boolean.FALSE);
    private final Logger logger;
    private final yvj scope;

    public AdRevenueObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, yvj yvjVar, AdRevenueRepository adRevenueRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, Logger logger) {
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = yvjVar;
        this.adRevenueRepository = adRevenueRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 invoke$lambda$1(AdRevenueObserver adRevenueObserver, Throwable th) {
        adRevenueObserver.isRunning.setValue(Boolean.FALSE);
        return s3q0.a;
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        xh50<Boolean> xh50Var = this.isRunning;
        do {
            value = xh50Var.getValue();
            bool = value;
            bool.getClass();
        } while (!xh50Var.compareAndSet(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.adRevenueRepository.getAdRevenueEvents(), new AdRevenueObserver$invoke$2(this, null)), this.scope).E(new hb(this, 1));
    }
}
