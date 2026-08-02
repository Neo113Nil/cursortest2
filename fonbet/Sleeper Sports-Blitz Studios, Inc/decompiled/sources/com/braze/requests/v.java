package com.braze.requests;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.storage.b3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes6.dex */
public final class v implements q {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.communication.e f683a;
    public final com.braze.events.e b;
    public final com.braze.events.e c;
    public final b3 d;
    public final com.braze.storage.p e;
    public final com.braze.managers.r f;
    public final com.braze.requests.util.a g;

    public v(com.braze.communication.e httpConnector, com.braze.events.e internalEventPublisher, com.braze.events.e externalEventPublisher, b3 serverConfigStorageProvider, com.braze.storage.p contentCardsStorageProvider, com.braze.managers.r brazeManager, com.braze.requests.util.a endpointMetadataProvider) {
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(contentCardsStorageProvider, "contentCardsStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(endpointMetadataProvider, "endpointMetadataProvider");
        this.f683a = httpConnector;
        this.b = internalEventPublisher;
        this.c = externalEventPublisher;
        this.d = serverConfigStorageProvider;
        this.e = contentCardsStorageProvider;
        this.f = brazeManager;
        this.g = endpointMetadataProvider;
    }

    @Override // com.braze.requests.q
    public final void a(com.braze.requests.framework.h requestInfo, com.braze.requests.framework.c requestDispatchCallback, boolean z) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(requestDispatchCallback, "requestDispatchCallback");
        if (z) {
            new e(requestInfo, this.f683a, this.b, this.c, this.f, this.d, this.e, this.g, requestDispatchCallback).c();
        } else {
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new u(this, requestInfo, requestDispatchCallback, null), 3, null);
        }
    }
}
