package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.bzw;
import xsna.etr;
import xsna.rsr;
import xsna.s3q0;
import xsna.vtk0;
import xsna.xh50;
import xsna.yvj;

/* compiled from: LifecycleEventObserver.kt */
/* loaded from: classes14.dex */
public final class LifecycleEventObserver {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GatewayClient gatewayClient;
    private final GetByteStringId getByteStringId;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final xh50<Boolean> isRunning = vtk0.a(Boolean.FALSE);
    private final LifecycleDataSource lifecycleDataSource;
    private final Logger logger;
    private final yvj scope;

    public LifecycleEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, yvj yvjVar, LifecycleDataSource lifecycleDataSource, DeviceInfoRepository deviceInfoRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, GetByteStringId getByteStringId, Logger logger) {
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = yvjVar;
        this.lifecycleDataSource = lifecycleDataSource;
        this.deviceInfoRepository = deviceInfoRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.getByteStringId = getByteStringId;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 invoke$lambda$1(LifecycleEventObserver lifecycleEventObserver, Throwable th) {
        lifecycleEventObserver.isRunning.setValue(Boolean.FALSE);
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
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new etr(this.lifecycleDataSource.getAppActive()), new LifecycleEventObserver$invoke$2(this, null)), this.scope).E(new bzw(this, 3));
    }
}
