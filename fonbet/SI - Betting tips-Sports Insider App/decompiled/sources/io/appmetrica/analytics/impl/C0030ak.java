package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030ak implements ServiceComponentModuleReporter {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f13359a;

    /* renamed from: b, reason: collision with root package name */
    public final C0512tk f13360b;

    public C0030ak(@NotNull X4 x42, @NotNull C0512tk c0512tk) {
        this.f13359a = x42;
        this.f13360b = c0512tk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(@NotNull ServiceModuleCounterReport serviceModuleCounterReport) {
        this.f13360b.getClass();
        this.f13359a.a(C0512tk.a(serviceModuleCounterReport));
    }

    public /* synthetic */ C0030ak(X4 x42, C0512tk c0512tk, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(x42, (i5 & 2) != 0 ? new C0512tk() : c0512tk);
    }
}
