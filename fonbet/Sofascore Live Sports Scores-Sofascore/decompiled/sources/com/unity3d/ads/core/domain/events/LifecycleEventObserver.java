package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import defpackage.f1d;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.ida;
import defpackage.kea;
import defpackage.ku3;
import defpackage.pd0;
import defpackage.v98;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;", "", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "Lku3;", "scope", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "getByteStringId", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lku3;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/GetByteStringId;Lcom/unity3d/ads/core/log/Logger;)V", "", "invoke", "()V", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lku3;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "Lcom/unity3d/ads/core/log/Logger;", "Lf1d;", "", "isRunning", "Lf1d;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LifecycleEventObserver {

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetByteStringId getByteStringId;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final f1d isRunning;

    @NotNull
    private final LifecycleDataSource lifecycleDataSource;

    @NotNull
    private final Logger logger;

    @NotNull
    private final ku3 scope;

    public LifecycleEventObserver(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull ku3 ku3Var, @NotNull LifecycleDataSource lifecycleDataSource, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull GatewayClient gatewayClient, @NotNull GetRequestPolicy getRequestPolicy, @NotNull GetByteStringId getByteStringId, @NotNull Logger logger) {
        getUniversalRequestForPayLoad.getClass();
        ku3Var.getClass();
        lifecycleDataSource.getClass();
        deviceInfoRepository.getClass();
        gatewayClient.getClass();
        getRequestPolicy.getClass();
        getByteStringId.getClass();
        logger.getClass();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = ku3Var;
        this.lifecycleDataSource = lifecycleDataSource;
        this.deviceInfoRepository = deviceInfoRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.getByteStringId = getByteStringId;
        this.logger = logger;
        this.isRunning = gdi.a(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(LifecycleEventObserver lifecycleEventObserver, Throwable th) {
        f1d f1dVar = lifecycleEventObserver.isRunning;
        Boolean bool = Boolean.FALSE;
        fdi fdiVar = (fdi) f1dVar;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        return Unit.a;
    }

    public final void invoke() {
        fdi fdiVar;
        Object value;
        Boolean bool;
        f1d f1dVar = this.isRunning;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!fdiVar.k(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        ((kea) fcp.m0(new v98(pd0.n(this.lifecycleDataSource.getAppActive(), 1), new LifecycleEventObserver$invoke$2(this, null), 3), this.scope)).n(new ida(this, 16));
    }
}
