package com.unity3d.ads.core.data.manager;

import com.google.protobuf.Timestamp;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import xsna.b6l;
import xsna.c5g;
import xsna.drm0;
import xsna.e43;
import xsna.eoo;
import xsna.n7i;
import xsna.p7i;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zno;
import xsna.zrl;

/* compiled from: TransactionEventManager.kt */
@b6l(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 134, 147, 150}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class TransactionEventManager$onPurchasesReceived$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List<PurchaseBridge> $purchases;
    final /* synthetic */ TransactionEventRequestOuterClass.TransactionOrigin $transactionOrigin;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ TransactionEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransactionEventManager$onPurchasesReceived$1(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, spj<? super TransactionEventManager$onPurchasesReceived$1> spjVar) {
        super(2, spjVar);
        this.$purchases = list;
        this.this$0 = transactionEventManager;
        this.$transactionOrigin = transactionOrigin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new TransactionEventManager$onPurchasesReceived$1(this.$purchases, this.this$0, this.$transactionOrigin, spjVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:35|36|37|38|39|40|41|(1:43)|(2:76|77)(1:45)|46|(1:48)(1:75)|(2:54|(4:56|57|58|(4:60|61|62|(9:64|24|(0)|27|28|29|30|31|(2:87|(1:89)(1:91))(0)))(7:69|27|28|29|30|31|(0)(0))))|72|73|74|30|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x023a, code lost:
    
        if (r2 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b8, code lost:
    
        r14 = r2;
        r2 = r4;
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0212, code lost:
    
        if ((r3.length == 0 ? kotlin.collections.EmptyList.b : new xsna.bu5(r3).a(r18)) == r1) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0190 A[Catch: Exception -> 0x01ca, TryCatch #0 {Exception -> 0x01ca, blocks: (B:22:0x0045, B:24:0x018a, B:26:0x0190, B:27:0x01aa), top: B:21:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0163 A[Catch: Exception -> 0x01a2, TRY_LEAVE, TryCatch #5 {Exception -> 0x01a2, blocks: (B:58:0x0147, B:60:0x0163), top: B:57:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0185 -> B:24:0x018a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01ca -> B:28:0x01b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01a5 -> B:27:0x01aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01c8 -> B:30:0x01d7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<TransactionEventRequestOuterClass.TransactionData> arrayList;
        Iterator it;
        List list;
        TransactionEventManager transactionEventManager;
        int i;
        List<TransactionEventRequestOuterClass.TransactionData> list2;
        int i2;
        int i3;
        List list3;
        TransactionEventManager transactionEventManager2;
        Iterator it2;
        List<TransactionEventRequestOuterClass.TransactionData> list4;
        PurchaseBridge purchaseBridge;
        String str;
        zno znoVar;
        Object obj2;
        long seconds;
        long j;
        ProductDetailsFetcher productDetailsFetcher;
        Object fetchProductDetails;
        zno znoVar2;
        ByteStringDataSource byteStringDataSource;
        GetTransactionData getTransactionData;
        GetTransactionRequest getTransactionRequest;
        BillingClientAdapter billingClientAdapter;
        Object invoke;
        TransactionEventRepository transactionEventRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        int i5 = 1;
        if (i4 == 0) {
            kotlin.a.a(obj);
            arrayList = new ArrayList<>();
            List<PurchaseBridge> list5 = this.$purchases;
            ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
            for (PurchaseBridge purchaseBridge2 : list5) {
                arrayList2.add(p7i.a());
            }
            List<PurchaseBridge> list6 = this.$purchases;
            TransactionEventManager transactionEventManager3 = this.this$0;
            it = list6.iterator();
            list = arrayList2;
            transactionEventManager = transactionEventManager3;
            i = 0;
            if (!it.hasNext()) {
            }
            return coroutineSingletons;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    invoke = obj;
                    transactionEventRepository = this.this$0.transactionEventRepository;
                    transactionEventRepository.addTransactionEvent((TransactionEventRequestOuterClass.TransactionEventRequest) invoke);
                    return s3q0.a;
                }
                arrayList = (List) this.L$0;
                kotlin.a.a(obj);
                if (!arrayList.isEmpty()) {
                    getTransactionRequest = this.this$0.getTransactionRequest;
                    billingClientAdapter = this.this$0.billingClientAdapter;
                    String adapterVersion = billingClientAdapter.getAdapterVersion();
                    TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin = this.$transactionOrigin;
                    this.L$0 = null;
                    this.label = 4;
                    invoke = getTransactionRequest.invoke(arrayList, adapterVersion, transactionOrigin, this);
                }
                return s3q0.a;
            }
            i3 = this.I$1;
            i2 = this.I$0;
            PurchaseBridge purchaseBridge3 = (PurchaseBridge) this.L$4;
            it = (Iterator) this.L$3;
            transactionEventManager = (TransactionEventManager) this.L$2;
            list = (List) this.L$1;
            list2 = (List) this.L$0;
            try {
                kotlin.a.a(obj);
                fetchProductDetails = obj;
            } catch (Exception unused) {
                ((n7i) list.get(i3)).h(s3q0.a);
                arrayList = list2;
                i = i2;
                i5 = 1;
                if (!it.hasNext()) {
                }
                return coroutineSingletons;
            }
            ProductDetailsResult productDetailsResult = (ProductDetailsResult) fetchProductDetails;
            if (productDetailsResult instanceof ProductDetailsResult.Success) {
                getTransactionData = transactionEventManager.getTransactionData;
                list2.add(getTransactionData.invoke(purchaseBridge3, ((ProductDetailsResult.Success) productDetailsResult).getProductDetailsJson()));
            }
            ((n7i) list.get(i3)).h(s3q0.a);
            arrayList = list2;
            i = i2;
            i5 = 1;
            if (!it.hasNext()) {
                Object next = it.next();
                int i6 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                PurchaseBridge purchaseBridge4 = (PurchaseBridge) next;
                Long l = new Long(purchaseBridge4.getOriginalJson().optLong("purchaseTime", -1L));
                if (l.longValue() < 0) {
                    l = null;
                }
                if (l != null) {
                    try {
                    } catch (Exception unused2) {
                        list2 = arrayList;
                        i3 = i;
                        i2 = i6;
                        ((n7i) list.get(i3)).h(s3q0.a);
                        arrayList = list2;
                        i = i2;
                        i5 = 1;
                        if (!it.hasNext()) {
                        }
                        return coroutineSingletons;
                    }
                    zno.a aVar = zno.c;
                    znoVar2 = new zno(eoo.f(l.longValue(), DurationUnit.MILLISECONDS));
                } else {
                    znoVar2 = null;
                }
                String optString = purchaseBridge4.getOriginalJson().optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                if (drm0.N(optString)) {
                    optString = null;
                }
                if (znoVar2 != null && optString != null && !drm0.N(optString)) {
                    byteStringDataSource = transactionEventManager.iapTransactionStore;
                    this.L$0 = arrayList;
                    this.L$1 = list;
                    this.L$2 = transactionEventManager;
                    this.L$3 = it;
                    this.L$4 = purchaseBridge4;
                    this.L$5 = optString;
                    this.L$6 = znoVar2;
                    this.I$0 = i6;
                    this.I$1 = i;
                    this.label = i5;
                    obj2 = byteStringDataSource.get(this);
                    if (obj2 != coroutineSingletons) {
                        int i7 = i;
                        list4 = arrayList;
                        i3 = i7;
                        TransactionEventManager transactionEventManager4 = transactionEventManager;
                        purchaseBridge = purchaseBridge4;
                        i2 = i6;
                        znoVar = znoVar2;
                        transactionEventManager2 = transactionEventManager4;
                        list3 = list;
                        it2 = it;
                        str = optString;
                        try {
                        } catch (Exception unused3) {
                            it = it2;
                            transactionEventManager = transactionEventManager2;
                            list = list3;
                            list2 = list4;
                            ((n7i) list.get(i3)).h(s3q0.a);
                            arrayList = list2;
                            i = i2;
                            i5 = 1;
                            if (!it.hasNext()) {
                            }
                            return coroutineSingletons;
                        }
                        seconds = Timestamp.parseFrom(((ByteStringStoreOuterClass.ByteStringStore) obj2).getData()).getSeconds();
                        j = znoVar.b;
                        zno.a aVar2 = zno.c;
                        if (seconds >= zno.l(j, DurationUnit.SECONDS)) {
                            productDetailsFetcher = transactionEventManager2.productDetailsFetcher;
                            this.L$0 = list4;
                            this.L$1 = list3;
                            this.L$2 = transactionEventManager2;
                            this.L$3 = it2;
                            this.L$4 = purchaseBridge;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.I$0 = i2;
                            this.I$1 = i3;
                            this.label = 2;
                            fetchProductDetails = productDetailsFetcher.fetchProductDetails(str, this);
                            if (fetchProductDetails != coroutineSingletons) {
                                purchaseBridge3 = purchaseBridge;
                                it = it2;
                                transactionEventManager = transactionEventManager2;
                                list = list3;
                                list2 = list4;
                                ProductDetailsResult productDetailsResult2 = (ProductDetailsResult) fetchProductDetails;
                                if (productDetailsResult2 instanceof ProductDetailsResult.Success) {
                                }
                                ((n7i) list.get(i3)).h(s3q0.a);
                                arrayList = list2;
                                i = i2;
                                i5 = 1;
                                if (!it.hasNext()) {
                                    n7i[] n7iVarArr = (n7i[]) list.toArray(new n7i[0]);
                                    zrl[] zrlVarArr = (zrl[]) Arrays.copyOf(n7iVarArr, n7iVarArr.length);
                                    this.L$0 = arrayList;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.label = 3;
                                }
                            }
                        } else {
                            it = it2;
                            transactionEventManager = transactionEventManager2;
                            list = list3;
                            list2 = list4;
                            ((n7i) list.get(i3)).h(s3q0.a);
                            arrayList = list2;
                            i = i2;
                            i5 = 1;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
                ((n7i) list.get(i)).h(s3q0.a);
                i = i6;
                i5 = 1;
                if (!it.hasNext()) {
                }
            }
            return coroutineSingletons;
        }
        i3 = this.I$1;
        i2 = this.I$0;
        znoVar = (zno) this.L$6;
        str = (String) this.L$5;
        purchaseBridge = (PurchaseBridge) this.L$4;
        it2 = (Iterator) this.L$3;
        transactionEventManager2 = (TransactionEventManager) this.L$2;
        list3 = (List) this.L$1;
        list4 = (List) this.L$0;
        try {
            kotlin.a.a(obj);
            obj2 = obj;
        } catch (Exception unused4) {
            it = it2;
            transactionEventManager = transactionEventManager2;
            list = list3;
            list2 = list4;
            ((n7i) list.get(i3)).h(s3q0.a);
            arrayList = list2;
            i = i2;
            i5 = 1;
            if (!it.hasNext()) {
            }
            return coroutineSingletons;
        }
        seconds = Timestamp.parseFrom(((ByteStringStoreOuterClass.ByteStringStore) obj2).getData()).getSeconds();
        j = znoVar.b;
        zno.a aVar22 = zno.c;
        if (seconds >= zno.l(j, DurationUnit.SECONDS)) {
        }
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((TransactionEventManager$onPurchasesReceived$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
