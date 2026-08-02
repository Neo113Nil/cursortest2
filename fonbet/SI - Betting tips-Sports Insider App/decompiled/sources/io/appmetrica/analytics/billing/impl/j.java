package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements BillingInfoSender {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceComponentModuleReporter f11426a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f11427b;

    /* renamed from: c, reason: collision with root package name */
    public final o f11428c;

    public j(@NotNull ServiceComponentModuleReporter serviceComponentModuleReporter, @NotNull Executor executor, @NotNull o oVar) {
        this.f11426a = serviceComponentModuleReporter;
        this.f11427b = executor;
        this.f11428c = oVar;
    }

    public static final void a(j jVar, ProductInfo productInfo) {
        ServiceComponentModuleReporter serviceComponentModuleReporter = jVar.f11426a;
        ServiceModuleCounterReport.Builder withType = ServiceModuleCounterReport.INSTANCE.newBuilder().withType(40976);
        jVar.f11428c.getClass();
        serviceComponentModuleReporter.handleReport(withType.withValueBytes(o.a(productInfo)).build());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(@NotNull List<? extends ProductInfo> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f11427b.execute(new androidx.appcompat.app.t(1, this, (ProductInfo) it.next()));
        }
    }

    public /* synthetic */ j(ServiceComponentModuleReporter serviceComponentModuleReporter, Executor executor, o oVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(serviceComponentModuleReporter, executor, (i5 & 4) != 0 ? new o() : oVar);
    }
}
