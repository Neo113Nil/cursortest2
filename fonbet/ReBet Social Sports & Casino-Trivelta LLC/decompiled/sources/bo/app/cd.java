package bo.app;

import Ph.AbstractC1459k;
import com.braze.coroutine.BrazeCoroutineScope;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cd implements s9 {

    /* renamed from: a, reason: collision with root package name */
    public final ta f25356a;

    /* renamed from: b, reason: collision with root package name */
    public final r7 f25357b;

    /* renamed from: c, reason: collision with root package name */
    public final m9 f25358c;

    /* renamed from: d, reason: collision with root package name */
    public final ue f25359d;

    /* renamed from: e, reason: collision with root package name */
    public final x3 f25360e;

    /* renamed from: f, reason: collision with root package name */
    public final e2 f25361f;

    /* renamed from: g, reason: collision with root package name */
    public final a7 f25362g;

    public cd(ta httpConnector, r7 internalEventPublisher, m9 externalEventPublisher, ue serverConfigStorageProvider, x3 contentCardsStorageProvider, e2 brazeManager, a7 endpointMetadataProvider) {
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(contentCardsStorageProvider, "contentCardsStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(endpointMetadataProvider, "endpointMetadataProvider");
        this.f25356a = httpConnector;
        this.f25357b = internalEventPublisher;
        this.f25358c = externalEventPublisher;
        this.f25359d = serverConfigStorageProvider;
        this.f25360e = contentCardsStorageProvider;
        this.f25361f = brazeManager;
        this.f25362g = endpointMetadataProvider;
    }

    @Override // bo.app.s9
    public final void a(id requestInfo, dd requestDispatchCallback) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(requestDispatchCallback, "requestDispatchCallback");
        AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new bd(this, requestInfo, requestDispatchCallback, null), 3, null);
    }
}
