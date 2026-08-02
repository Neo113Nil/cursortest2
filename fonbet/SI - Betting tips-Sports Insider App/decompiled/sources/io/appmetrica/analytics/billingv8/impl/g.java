package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.Purchase;
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
    public final /* synthetic */ i f11582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.k f11583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f11584c;

    public g(i iVar, com.android.billingclient.api.k kVar, List list) {
        this.f11582a = iVar;
        this.f11583b = kVar;
        this.f11584c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f11582a;
        com.android.billingclient.api.k kVar = this.f11583b;
        List<Purchase> list = this.f11584c;
        iVar.getClass();
        if (kVar.f4037a != 0) {
            iVar.f11593f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it = purchase.a().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = iVar.f11591d;
                    BillingInfo billingInfo = new BillingInfo(Intrinsics.areEqual(str2, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchase.c(), purchase.b(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f11590c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f11588a, linkedHashMap, iVar.f11590c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f11591d, iVar.f11590c.getBillingInfoManager());
                iVar.f11593f.onUpdateFinished();
            } else {
                List<String> W = CollectionsKt.W(billingInfoToUpdate.keySet());
                n nVar = iVar.f11593f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f11591d;
                com.android.billingclient.api.c cVar = iVar.f11589b;
                UtilsProvider utilsProvider = iVar.f11590c;
                d dVar = iVar.f11592e;
                f fVar = new f(str3, cVar, utilsProvider, hVar, list, dVar, nVar);
                dVar.f11571b.add(fVar);
                if (iVar.f11589b.b()) {
                    com.android.billingclient.api.c cVar2 = iVar.f11589b;
                    y yVar = new y();
                    ArrayList arrayList = new ArrayList(v.k(W, 10));
                    for (String str4 : W) {
                        io.sentry.internal.debugmeta.c cVar3 = new io.sentry.internal.debugmeta.c(3);
                        cVar3.f16517b = str4;
                        cVar3.f16518c = iVar.f11591d;
                        arrayList.add(cVar3.c());
                    }
                    yVar.b(arrayList);
                    cVar2.c(yVar.a(), fVar);
                } else {
                    iVar.f11592e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f11582a;
        iVar2.f11592e.a(iVar2);
    }
}
