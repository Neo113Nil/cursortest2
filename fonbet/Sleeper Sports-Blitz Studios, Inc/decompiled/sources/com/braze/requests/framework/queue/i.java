package com.braze.requests.framework.queue;

import com.braze.requests.n;
import com.braze.requests.o;
import com.braze.requests.y;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class i extends com.braze.requests.framework.b {
    public final com.braze.requests.util.b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.braze.dispatch.h dispatchDataProvider) {
        super(n.g, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        int k = dispatchDataProvider.f500a.o.k();
        this.k = new com.braze.requests.util.b((int) TimeUnit.MINUTES.toMillis(1L), com.braze.requests.util.b.g, k, dispatchDataProvider.f500a.o.l());
    }

    public static final String b(com.braze.requests.framework.h hVar, long j) {
        return "Template request will not be retried. Marking as complete. " + hVar.a(j);
    }

    public static final String c(com.braze.requests.framework.h hVar, long j) {
        return "Template request will expire before send time and is not eligible for a request retry. Not retrying or performing any fallback triggers. " + hVar.a(j);
    }

    @Override // com.braze.requests.framework.b
    public final com.braze.requests.util.b a() {
        return this.k;
    }

    @Override // com.braze.requests.framework.b
    public final void a(final long j) {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((com.braze.requests.framework.h) next).d == com.braze.requests.framework.i.b) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            final com.braze.requests.framework.h hVar = (com.braze.requests.framework.h) it2.next();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.queue.i$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.b(com.braze.requests.framework.h.this, j);
                }
            }, 7, (Object) null);
            hVar.a(j, com.braze.requests.framework.i.e);
        }
        ArrayList arrayList3 = this.e;
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (((com.braze.requests.framework.h) next2).d == com.braze.requests.framework.i.f674a) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Object next3 = it4.next();
            com.braze.requests.framework.h hVar2 = (com.braze.requests.framework.h) next3;
            o oVar = hVar2.f673a;
            y yVar = oVar instanceof y ? (y) oVar : null;
            if ((yVar != null ? ((com.braze.triggers.events.i) yVar.l).b + yVar.o : -1L) < hVar2.b) {
                arrayList5.add(next3);
            }
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            final com.braze.requests.framework.h hVar3 = (com.braze.requests.framework.h) it5.next();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.queue.i$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.c(com.braze.requests.framework.h.this, j);
                }
            }, 7, (Object) null);
            hVar3.a(j, com.braze.requests.framework.i.e);
        }
    }
}
