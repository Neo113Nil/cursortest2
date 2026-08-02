package com.unity3d.ads.core.data.manager;

import com.android.billingclient.api.BillingClient;
import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import defpackage.a70;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.hoi;
import defpackage.il4;
import defpackage.kj2;
import defpackage.ku3;
import defpackage.lj2;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.w2g;
import defpackage.y6a;
import defpackage.z9a;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class TransactionEventManager$invoke$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TransactionEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEventManager$invoke$1(TransactionEventManager transactionEventManager, rq3<? super TransactionEventManager$invoke$1> rq3Var) {
        super(2, rq3Var);
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

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new TransactionEventManager$invoke$1(this.this$0, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((TransactionEventManager$invoke$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        BillingClientAdapter billingClientAdapter;
        BillingClientAdapter billingClientAdapter2;
        SessionRepository sessionRepository;
        BillingClientAdapter billingClientAdapter3;
        BillingClientAdapter billingClientAdapter4;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        final int i2 = 1;
        try {
        } catch (Exception e) {
            logger = this.this$0.logger;
            logger.trace(TransactionEventManager.BILLING_SERVICE_UNAVAILABLE, e);
        }
        if (i == 0) {
            y6a.M(obj);
            billingClientAdapter = this.this$0.billingClientAdapter;
            if (!billingClientAdapter.isInitialized()) {
                final TransactionEventManager transactionEventManager = this.this$0;
                this.L$0 = transactionEventManager;
                this.label = 1;
                final lj2 lj2Var = new lj2(1, z9a.b(this));
                lj2Var.t();
                billingClientAdapter2 = transactionEventManager.billingClientAdapter;
                billingClientAdapter2.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                    private final f1d hasBeenResumed = gdi.a(Boolean.FALSE);

                    private final void tryResume() {
                        fdi fdiVar;
                        Object value;
                        Boolean bool;
                        if (kj2.this.isActive()) {
                            f1d f1dVar = this.hasBeenResumed;
                            do {
                                fdiVar = (fdi) f1dVar;
                                value = fdiVar.getValue();
                                bool = (Boolean) value;
                                bool.getClass();
                            } while (!fdiVar.k(value, Boolean.TRUE));
                            if (bool.booleanValue()) {
                                return;
                            }
                            kj2 kj2Var = kj2.this;
                            p2g p2gVar = w2g.b;
                            kj2Var.resumeWith(Unit.a);
                        }
                    }

                    private final void tryResumeWithException(Exception exception) {
                        fdi fdiVar;
                        Object value;
                        Boolean bool;
                        if (kj2.this.isActive()) {
                            f1d f1dVar = this.hasBeenResumed;
                            do {
                                fdiVar = (fdi) f1dVar;
                                value = fdiVar.getValue();
                                bool = (Boolean) value;
                                bool.getClass();
                            } while (!fdiVar.k(value, Boolean.TRUE));
                            if (bool.booleanValue()) {
                                return;
                            }
                            kj2 kj2Var = kj2.this;
                            p2g p2gVar = w2g.b;
                            kj2Var.resumeWith(y6a.x(exception));
                        }
                    }

                    public final f1d getHasBeenResumed() {
                        return this.hasBeenResumed;
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingServiceDisconnected() {
                        tryResumeWithException(new TransactionException("Billing service disconnected"));
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingSetupFinished(BillingResultBridge billingResult) {
                        billingResult.getClass();
                        if (billingResult.getResponseCode() != BillingResultResponseCode.OK) {
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
                    public void onPurchaseUpdated(BillingResultBridge billingResult, List<? extends PurchaseBridge> purchases) {
                        billingResult.getClass();
                        transactionEventManager.onPurchasesReceived(billingResult, purchases, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_LIVE_UPDATE);
                    }
                });
                if (lj2Var.q() == lu3Var) {
                    return lu3Var;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        sessionRepository = this.this$0.sessionRepository;
        if (sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldSendIapHistory()) {
            billingClientAdapter3 = this.this$0.billingClientAdapter;
            final TransactionEventManager transactionEventManager2 = this.this$0;
            final int i3 = 0;
            billingClientAdapter3.queryPurchasesAsync(BillingClient.ProductType.INAPP, new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                    int i4 = i3;
                    TransactionEventManager transactionEventManager3 = transactionEventManager2;
                    switch (i4) {
                        case 0:
                            TransactionEventManager$invoke$1.invokeSuspend$lambda$1(transactionEventManager3, billingResultBridge, list);
                            break;
                        default:
                            TransactionEventManager$invoke$1.invokeSuspend$lambda$2(transactionEventManager3, billingResultBridge, list);
                            break;
                    }
                }
            });
            billingClientAdapter4 = this.this$0.billingClientAdapter;
            final TransactionEventManager transactionEventManager3 = this.this$0;
            billingClientAdapter4.queryPurchasesAsync(BillingClient.ProductType.SUBS, new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                    int i4 = i2;
                    TransactionEventManager transactionEventManager32 = transactionEventManager3;
                    switch (i4) {
                        case 0:
                            TransactionEventManager$invoke$1.invokeSuspend$lambda$1(transactionEventManager32, billingResultBridge, list);
                            break;
                        default:
                            TransactionEventManager$invoke$1.invokeSuspend$lambda$2(transactionEventManager32, billingResultBridge, list);
                            break;
                    }
                }
            });
        }
        return Unit.a;
    }
}
