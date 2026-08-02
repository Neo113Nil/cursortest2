package com.braze.requests.framework.queue;

import com.braze.models.outgoing.k;
import com.braze.requests.n;
import com.braze.requests.o;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class c extends com.braze.requests.framework.b {
    public static final String k = BrazeLogger.getBrazeLogTag((Class<?>) c.class);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.braze.dispatch.h dispatchDataProvider) {
        super(n.f, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
    }

    public final void a(final long j, final com.braze.requests.framework.h hVar, List list) {
        com.braze.models.b bVar;
        com.braze.models.b bVar2;
        o oVar = hVar != null ? hVar.f673a : null;
        com.braze.requests.g gVar = oVar instanceof com.braze.requests.g ? (com.braze.requests.g) oVar : null;
        if (gVar == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.braze.requests.framework.h hVar2 = (com.braze.requests.framework.h) it.next();
            o oVar2 = hVar2.f673a;
            final com.braze.requests.g gVar2 = oVar2 instanceof com.braze.requests.g ? (com.braze.requests.g) oVar2 : null;
            if (gVar2 != null && ((gVar.m == null || gVar2.m == null) && (((bVar = gVar.n) == null || bVar.b) && ((bVar2 = gVar2.n) == null || bVar2.b)))) {
                k kVar = gVar2.k;
                Boolean bool = (gVar.k.c() || kVar.c()) ? Boolean.TRUE : null;
                com.braze.models.outgoing.i outboundConfigParams = gVar.k.c;
                if (outboundConfigParams != null) {
                    Intrinsics.checkNotNullParameter(outboundConfigParams, "outboundConfigParams");
                } else {
                    outboundConfigParams = null;
                }
                com.braze.models.outgoing.i outboundConfigParams2 = kVar.c;
                if (outboundConfigParams2 != null) {
                    Intrinsics.checkNotNullParameter(outboundConfigParams2, "outboundConfigParams");
                    outboundConfigParams = outboundConfigParams2;
                }
                String str = gVar.k.f645a;
                if (str == null) {
                    str = null;
                }
                String str2 = kVar.f645a;
                if (str2 != null) {
                    str = str2;
                }
                gVar.k = new k(str, bool, outboundConfigParams);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, k, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.queue.c$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.a(com.braze.requests.framework.h.this, j, hVar);
                    }
                }, 14, (Object) null);
                hVar2.a(j, com.braze.requests.framework.i.d);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.queue.c$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.a(com.braze.requests.g.this, hVar);
                    }
                }, 7, (Object) null);
            }
        }
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j) {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((com.braze.requests.framework.h) next).d.a()) {
                arrayList2.add(next);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList2, new b());
        int size = sortedWith.size();
        if (size < 2) {
            return;
        }
        a(j, (com.braze.requests.framework.h) CollectionsKt.first(sortedWith), sortedWith.subList(1, size));
    }

    public static final String a(com.braze.requests.framework.h hVar, long j, com.braze.requests.framework.h hVar2) {
        return "Batched request " + hVar.a(j) + " and combined into " + hVar2.a(j);
    }

    public static final String a(com.braze.requests.g gVar, com.braze.requests.framework.h hVar) {
        return "Could not merge other request: " + gVar + " into parent: " + hVar;
    }
}
