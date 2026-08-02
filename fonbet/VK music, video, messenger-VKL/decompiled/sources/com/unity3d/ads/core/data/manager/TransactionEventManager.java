package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import xsna.myc0;
import xsna.yvj;
import xsna.zcl;

/* compiled from: TransactionEventManager.kt */
/* loaded from: classes14.dex */
public final class TransactionEventManager {
    public static final String BILLING_SERVICE_UNAVAILABLE = "Billing client is not available";
    public static final Companion Companion = new Companion(null);
    private static final String INAPP = "inapp";
    private static final String SUBS = "subs";
    private final BillingClientAdapter billingClientAdapter;
    private final GetTransactionData getTransactionData;
    private final GetTransactionRequest getTransactionRequest;
    private final ByteStringDataSource iapTransactionStore;
    private final IsBillingClientAvailable isBillingClientAvailable;
    private final Logger logger;
    private final ProductDetailsFetcher productDetailsFetcher;
    private final yvj scope;
    private final SessionRepository sessionRepository;
    private final TransactionEventRepository transactionEventRepository;

    /* compiled from: TransactionEventManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public TransactionEventManager(yvj yvjVar, BillingClientAdapter billingClientAdapter, GetTransactionData getTransactionData, GetTransactionRequest getTransactionRequest, TransactionEventRepository transactionEventRepository, ByteStringDataSource byteStringDataSource, IsBillingClientAvailable isBillingClientAvailable, SessionRepository sessionRepository, ProductDetailsFetcher productDetailsFetcher, Logger logger) {
        this.scope = yvjVar;
        this.billingClientAdapter = billingClientAdapter;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = byteStringDataSource;
        this.isBillingClientAvailable = isBillingClientAvailable;
        this.sessionRepository = sessionRepository;
        this.productDetailsFetcher = productDetailsFetcher;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchasesReceived(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin) {
        List<? extends PurchaseBridge> list2;
        if (billingResultBridge.getResponseCode() != BillingResultResponseCode.OK || (list2 = list) == null || list2.isEmpty() || this.billingClientAdapter == null) {
            return;
        }
        myc0.h(this.scope, null, null, new TransactionEventManager$onPurchasesReceived$1(list, this, transactionOrigin, null), 3);
    }

    public final void invoke() {
        if (!this.isBillingClientAvailable.invoke() || this.billingClientAdapter == null) {
            Logger.DefaultImpls.trace$default(this.logger, BILLING_SERVICE_UNAVAILABLE, null, 2, null);
        } else {
            myc0.h(this.scope, null, null, new TransactionEventManager$invoke$1(this, null), 3);
        }
    }
}
