package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.y;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f11529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.k f11530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f11531c;

    public g(i iVar, com.android.billingclient.api.k kVar, List list) {
        this.f11529a = iVar;
        this.f11530b = kVar;
        this.f11531c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f11529a;
        com.android.billingclient.api.k kVar = this.f11530b;
        List<PurchaseHistoryRecord> list = this.f11531c;
        iVar.getClass();
        if (kVar.f4037a != 0 || list == null) {
            iVar.f11540f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                Iterator it = purchaseHistoryRecord.a().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = iVar.f11538d;
                    BillingInfo billingInfo = new BillingInfo(Intrinsics.areEqual(str2, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.b(), purchaseHistoryRecord.f3962c.optLong("purchaseTime"), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f11537c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f11535a, linkedHashMap, iVar.f11537c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f11538d, iVar.f11537c.getBillingInfoManager());
                iVar.f11540f.onUpdateFinished();
            } else {
                List<String> W = CollectionsKt.W(billingInfoToUpdate.keySet());
                n nVar = iVar.f11540f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f11538d;
                com.android.billingclient.api.c cVar = iVar.f11536b;
                UtilsProvider utilsProvider = iVar.f11537c;
                d dVar = iVar.f11539e;
                f fVar = new f(str3, cVar, utilsProvider, hVar, list, dVar, nVar);
                dVar.f11518b.add(fVar);
                if (iVar.f11536b.b()) {
                    com.android.billingclient.api.c cVar2 = iVar.f11536b;
                    y yVar = new y();
                    ArrayList arrayList = new ArrayList(v.k(W, 10));
                    for (String str4 : W) {
                        io.sentry.internal.debugmeta.c cVar3 = new io.sentry.internal.debugmeta.c(3);
                        cVar3.f16517b = str4;
                        cVar3.f16518c = iVar.f11538d;
                        arrayList.add(cVar3.c());
                    }
                    yVar.b(arrayList);
                    cVar2.c(yVar.a(), fVar);
                } else {
                    iVar.f11539e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f11529a;
        iVar2.f11539e.a(iVar2);
    }
}
