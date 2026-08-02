package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.lq9;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.vtk0;
import xsna.wzs;
import xsna.xh50;
import xsna.yvj;

/* compiled from: TransactionEventManager.kt */
@b6l(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class TransactionEventManager$invoke$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TransactionEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEventManager$invoke$1(TransactionEventManager transactionEventManager, spj<? super TransactionEventManager$invoke$1> spjVar) {
        super(2, spjVar);
        this.this$0 = transactionEventManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new TransactionEventManager$invoke$1(this.this$0, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        BillingClientAdapter billingClientAdapter;
        BillingClientAdapter billingClientAdapter2;
        SessionRepository sessionRepository;
        BillingClientAdapter billingClientAdapter3;
        BillingClientAdapter billingClientAdapter4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception e) {
            logger = this.this$0.logger;
            logger.trace(TransactionEventManager.BILLING_SERVICE_UNAVAILABLE, e);
        }
        if (i == 0) {
            kotlin.a.a(obj);
            billingClientAdapter = this.this$0.billingClientAdapter;
            if (!billingClientAdapter.isInitialized()) {
                final TransactionEventManager transactionEventManager = this.this$0;
                this.L$0 = transactionEventManager;
                this.label = 1;
                final lq9 lq9Var = new lq9(1, s7s0.c(this));
                lq9Var.o();
                billingClientAdapter2 = transactionEventManager.billingClientAdapter;
                billingClientAdapter2.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                    private final xh50<Boolean> hasBeenResumed = vtk0.a(Boolean.FALSE);

                    private final void tryResume() {
                        Boolean value;
                        Boolean bool;
                        if (lq9Var.isActive()) {
                            xh50<Boolean> xh50Var = this.hasBeenResumed;
                            do {
                                value = xh50Var.getValue();
                                bool = value;
                                bool.getClass();
                            } while (!xh50Var.compareAndSet(value, Boolean.TRUE));
                            if (bool.booleanValue()) {
                                return;
                            }
                            lq9Var.resumeWith(s3q0.a);
                        }
                    }

                    private final void tryResumeWithException(Exception exc) {
                        Boolean value;
                        Boolean bool;
                        if (lq9Var.isActive()) {
                            xh50<Boolean> xh50Var = this.hasBeenResumed;
                            do {
                                value = xh50Var.getValue();
                                bool = value;
                                bool.getClass();
                            } while (!xh50Var.compareAndSet(value, Boolean.TRUE));
                            if (bool.booleanValue()) {
                                return;
                            }
                            lq9Var.resumeWith(new Result.Failure(exc));
                        }
                    }

                    public final xh50<Boolean> getHasBeenResumed() {
                        return this.hasBeenResumed;
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingServiceDisconnected() {
                        tryResumeWithException(new TransactionException("Billing service disconnected"));
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingSetupFinished(BillingResultBridge billingResultBridge) {
                        if (billingResultBridge.getResponseCode() != BillingResultResponseCode.OK) {
                            tryResumeWithException(new TransactionException("Billing setup failed"));
                        } else {
                            tryResume();
                        }
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                    public void onIsAlreadyInitialized() {
                        tryResume();
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                    public void onPurchaseUpdated(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
                        transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_LIVE_UPDATE);
                    }
                });
                if (lq9Var.n() == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        sessionRepository = this.this$0.sessionRepository;
        if (sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldSendIapHistory()) {
            billingClientAdapter3 = this.this$0.billingClientAdapter;
            final TransactionEventManager transactionEventManager2 = this.this$0;
            billingClientAdapter3.queryPurchasesAsync("inapp", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                    TransactionEventManager$invoke$1.invokeSuspend$lambda$1(TransactionEventManager.this, billingResultBridge, list);
                }
            });
            billingClientAdapter4 = this.this$0.billingClientAdapter;
            final TransactionEventManager transactionEventManager3 = this.this$0;
            billingClientAdapter4.queryPurchasesAsync("subs", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.b
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                    TransactionEventManager$invoke$1.invokeSuspend$lambda$2(TransactionEventManager.this, billingResultBridge, list);
                }
            });
        }
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((TransactionEventManager$invoke$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
