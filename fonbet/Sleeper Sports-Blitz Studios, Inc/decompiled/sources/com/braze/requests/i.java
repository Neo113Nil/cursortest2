package com.braze.requests;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class i implements q {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.events.e f675a;
    public final com.braze.managers.r b;

    public i(com.braze.events.e internalEventPublisher, com.braze.managers.r brazeManager) {
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f675a = internalEventPublisher;
        this.b = brazeManager;
        new ArrayList();
    }

    @Override // com.braze.requests.q
    public final void a(com.braze.requests.framework.h requestInfo, com.braze.requests.framework.c requestDispatchCallback, boolean z) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(requestDispatchCallback, "requestDispatchCallback");
        final o oVar = requestInfo.f673a;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.i$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.a(o.this);
            }
        }, 7, (Object) null);
        com.braze.models.response.g gVar = new com.braze.models.response.g(oVar, new com.braze.communication.d(201, MapsKt.emptyMap(), 4), this.b);
        com.braze.events.e eVar = this.f675a;
        oVar.a(eVar, eVar, gVar);
        oVar.a(this.f675a);
        requestDispatchCallback.a(gVar);
        ((com.braze.events.d) this.f675a).b(new com.braze.events.internal.g(oVar), com.braze.events.internal.g.class);
    }

    public static final String a(o oVar) {
        return "Short circuiting execution of network request (" + oVar.hashCode() + ") and immediately marking it as succeeded.";
    }
}
