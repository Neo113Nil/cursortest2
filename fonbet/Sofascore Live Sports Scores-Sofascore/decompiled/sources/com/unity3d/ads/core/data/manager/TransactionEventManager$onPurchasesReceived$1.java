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
import defpackage.a70;
import defpackage.be5;
import defpackage.fc6;
import defpackage.hoi;
import defpackage.il4;
import defpackage.k13;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.pa3;
import defpackage.qa3;
import defpackage.qx9;
import defpackage.rq3;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.y6a;
import defpackage.zu4;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 134, 147, 150}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class TransactionEventManager$onPurchasesReceived$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
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
    public TransactionEventManager$onPurchasesReceived$1(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, rq3<? super TransactionEventManager$onPurchasesReceived$1> rq3Var) {
        super(2, rq3Var);
        this.$purchases = list;
        this.this$0 = transactionEventManager;
        this.$transactionOrigin = transactionOrigin;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new TransactionEventManager$onPurchasesReceived$1(this.$purchases, this.this$0, this.$transactionOrigin, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((TransactionEventManager$onPurchasesReceived$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:35|36|37|38|39|40|41|(1:43)|(2:76|77)(1:45)|46|(1:48)(1:75)|(2:54|(4:56|57|58|(4:60|61|62|(9:64|24|(0)|27|28|29|30|31|(2:87|(1:89)(1:91))(0)))(7:69|27|28|29|30|31|(0)(0))))|72|73|74|30|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0236, code lost:
    
        if (r2 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b4, code lost:
    
        r14 = r2;
        r2 = r4;
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0211, code lost:
    
        if ((r3.length == 0 ? defpackage.km5.a : new defpackage.lw0(r3).a(r18)) == r1) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018a A[Catch: Exception -> 0x01c8, TryCatch #2 {Exception -> 0x01c8, blocks: (B:22:0x0044, B:24:0x0184, B:26:0x018a, B:27:0x01a4), top: B:21:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015d A[Catch: Exception -> 0x019c, TRY_LEAVE, TryCatch #1 {Exception -> 0x019c, blocks: (B:58:0x0141, B:60:0x015d), top: B:57:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x017f -> B:24:0x0184). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01c8 -> B:28:0x01b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x019f -> B:27:0x01a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01c6 -> B:30:0x01d7). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<TransactionEventRequestOuterClass.TransactionData> u;
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
        xd5 xd5Var;
        Object obj2;
        long seconds;
        long j;
        ProductDetailsFetcher productDetailsFetcher;
        Object fetchProductDetails;
        Object obj3;
        ByteStringDataSource byteStringDataSource;
        GetTransactionData getTransactionData;
        GetTransactionRequest getTransactionRequest;
        BillingClientAdapter billingClientAdapter;
        Object invoke;
        TransactionEventRepository transactionEventRepository;
        lu3 lu3Var = lu3.a;
        int i4 = this.label;
        int i5 = 1;
        String str2 = null;
        if (i4 == 0) {
            u = fc6.u(obj);
            List<PurchaseBridge> list5 = this.$purchases;
            ArrayList arrayList = new ArrayList(k13.r(list5, 10));
            for (PurchaseBridge purchaseBridge2 : list5) {
                arrayList.add(qx9.c());
            }
            List<PurchaseBridge> list6 = this.$purchases;
            TransactionEventManager transactionEventManager3 = this.this$0;
            it = list6.iterator();
            list = arrayList;
            transactionEventManager = transactionEventManager3;
            i = 0;
            if (!it.hasNext()) {
            }
            return lu3Var;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    invoke = obj;
                    transactionEventRepository = this.this$0.transactionEventRepository;
                    transactionEventRepository.addTransactionEvent((TransactionEventRequestOuterClass.TransactionEventRequest) invoke);
                    return Unit.a;
                }
                u = (List) this.L$0;
                y6a.M(obj);
                if (!u.isEmpty()) {
                    getTransactionRequest = this.this$0.getTransactionRequest;
                    billingClientAdapter = this.this$0.billingClientAdapter;
                    String adapterVersion = billingClientAdapter.getAdapterVersion();
                    TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin = this.$transactionOrigin;
                    this.L$0 = null;
                    this.label = 4;
                    invoke = getTransactionRequest.invoke(u, adapterVersion, transactionOrigin, this);
                }
                return Unit.a;
            }
            i3 = this.I$1;
            i2 = this.I$0;
            PurchaseBridge purchaseBridge3 = (PurchaseBridge) this.L$4;
            it = (Iterator) this.L$3;
            transactionEventManager = (TransactionEventManager) this.L$2;
            list = (List) this.L$1;
            list2 = (List) this.L$0;
            try {
                y6a.M(obj);
                fetchProductDetails = obj;
            } catch (Exception unused) {
                ((qa3) ((pa3) list.get(i3))).V(Unit.a);
                u = list2;
                i = i2;
                i5 = 1;
                str2 = null;
                if (!it.hasNext()) {
                }
                return lu3Var;
            }
            ProductDetailsResult productDetailsResult = (ProductDetailsResult) fetchProductDetails;
            if (productDetailsResult instanceof ProductDetailsResult.Success) {
                getTransactionData = transactionEventManager.getTransactionData;
                list2.add(getTransactionData.invoke(purchaseBridge3, ((ProductDetailsResult.Success) productDetailsResult).getProductDetailsJson()));
            }
            ((qa3) ((pa3) list.get(i3))).V(Unit.a);
            u = list2;
            i = i2;
            i5 = 1;
            str2 = null;
            if (!it.hasNext()) {
                Object next = it.next();
                int i6 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                PurchaseBridge purchaseBridge4 = (PurchaseBridge) next;
                Long l = new Long(purchaseBridge4.getOriginalJson().optLong("purchaseTime", -1L));
                long longValue = l.longValue();
                Long l2 = l;
                if (longValue < 0) {
                    l2 = str2;
                }
                if (l2 != 0) {
                    try {
                    } catch (Exception unused2) {
                        list2 = u;
                        i3 = i;
                        i2 = i6;
                        ((qa3) ((pa3) list.get(i3))).V(Unit.a);
                        u = list2;
                        i = i2;
                        i5 = 1;
                        str2 = null;
                        if (!it.hasNext()) {
                        }
                        return lu3Var;
                    }
                    wd5 wd5Var = xd5.b;
                    obj3 = new xd5(wkn.S(l2.longValue(), be5.MILLISECONDS));
                } else {
                    obj3 = str2;
                }
                String optString = purchaseBridge4.getOriginalJson().optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                optString.getClass();
                if (StringsKt.R(optString)) {
                    optString = str2;
                }
                if (obj3 != null && optString != null && !StringsKt.R(optString)) {
                    byteStringDataSource = transactionEventManager.iapTransactionStore;
                    this.L$0 = u;
                    this.L$1 = list;
                    this.L$2 = transactionEventManager;
                    this.L$3 = it;
                    this.L$4 = purchaseBridge4;
                    this.L$5 = optString;
                    this.L$6 = obj3;
                    this.I$0 = i6;
                    this.I$1 = i;
                    this.label = i5;
                    obj2 = byteStringDataSource.get(this);
                    if (obj2 != lu3Var) {
                        int i7 = i;
                        list4 = u;
                        i3 = i7;
                        TransactionEventManager transactionEventManager4 = transactionEventManager;
                        purchaseBridge = purchaseBridge4;
                        i2 = i6;
                        xd5Var = obj3;
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
                            ((qa3) ((pa3) list.get(i3))).V(Unit.a);
                            u = list2;
                            i = i2;
                            i5 = 1;
                            str2 = null;
                            if (!it.hasNext()) {
                            }
                            return lu3Var;
                        }
                        seconds = Timestamp.parseFrom(((ByteStringStoreOuterClass.ByteStringStore) obj2).getData()).getSeconds();
                        j = xd5Var.a;
                        wd5 wd5Var2 = xd5.b;
                        if (seconds >= xd5.k(j, be5.SECONDS)) {
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
                            if (fetchProductDetails != lu3Var) {
                                purchaseBridge3 = purchaseBridge;
                                it = it2;
                                transactionEventManager = transactionEventManager2;
                                list = list3;
                                list2 = list4;
                                ProductDetailsResult productDetailsResult2 = (ProductDetailsResult) fetchProductDetails;
                                if (productDetailsResult2 instanceof ProductDetailsResult.Success) {
                                }
                                ((qa3) ((pa3) list.get(i3))).V(Unit.a);
                                u = list2;
                                i = i2;
                                i5 = 1;
                                str2 = null;
                                if (!it.hasNext()) {
                                    String str3 = str2;
                                    pa3[] pa3VarArr = (pa3[]) list.toArray(new pa3[0]);
                                    zu4[] zu4VarArr = (zu4[]) Arrays.copyOf(pa3VarArr, pa3VarArr.length);
                                    this.L$0 = u;
                                    this.L$1 = str3;
                                    this.L$2 = str3;
                                    this.L$3 = str3;
                                    this.L$4 = str3;
                                    this.L$5 = str3;
                                    this.L$6 = str3;
                                    this.label = 3;
                                }
                            }
                        } else {
                            it = it2;
                            transactionEventManager = transactionEventManager2;
                            list = list3;
                            list2 = list4;
                            ((qa3) ((pa3) list.get(i3))).V(Unit.a);
                            u = list2;
                            i = i2;
                            i5 = 1;
                            str2 = null;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
                ((qa3) ((pa3) list.get(i))).V(Unit.a);
                i = i6;
                i5 = 1;
                str2 = null;
                if (!it.hasNext()) {
                }
            }
            return lu3Var;
        }
        i3 = this.I$1;
        i2 = this.I$0;
        xd5Var = (xd5) this.L$6;
        str = (String) this.L$5;
        purchaseBridge = (PurchaseBridge) this.L$4;
        it2 = (Iterator) this.L$3;
        transactionEventManager2 = (TransactionEventManager) this.L$2;
        list3 = (List) this.L$1;
        list4 = (List) this.L$0;
        try {
            y6a.M(obj);
            obj2 = obj;
        } catch (Exception unused4) {
            it = it2;
            transactionEventManager = transactionEventManager2;
            list = list3;
            list2 = list4;
            ((qa3) ((pa3) list.get(i3))).V(Unit.a);
            u = list2;
            i = i2;
            i5 = 1;
            str2 = null;
            if (!it.hasNext()) {
            }
            return lu3Var;
        }
        seconds = Timestamp.parseFrom(((ByteStringStoreOuterClass.ByteStringStore) obj2).getData()).getSeconds();
        j = xd5Var.a;
        wd5 wd5Var22 = xd5.b;
        if (seconds >= xd5.k(j, be5.SECONDS)) {
        }
    }
}
