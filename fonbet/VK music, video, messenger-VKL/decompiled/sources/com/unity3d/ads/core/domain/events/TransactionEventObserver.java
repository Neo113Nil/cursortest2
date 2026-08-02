package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.rsr;
import xsna.vtk0;
import xsna.xh50;
import xsna.yvj;

/* compiled from: TransactionEventObserver.kt */
/* loaded from: classes14.dex */
public final class TransactionEventObserver {
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ByteStringDataSource iapTransactionStore;
    private final xh50<Boolean> isRunning = vtk0.a(Boolean.FALSE);
    private final yvj scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final TransactionEventRepository transactionEventRepository;

    public TransactionEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, yvj yvjVar, TransactionEventRepository transactionEventRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, ByteStringDataSource byteStringDataSource, SendDiagnosticEvent sendDiagnosticEvent) {
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = yvjVar;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = byteStringDataSource;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
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
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.transactionEventRepository.getTransactionEvents(), new TransactionEventObserver$invoke$2(this, null)), this.scope);
    }
}
