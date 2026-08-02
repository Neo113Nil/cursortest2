package ru.ozon.app.android.analytics.performance;

import Qj0.I;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/analytics/performance/TravelPerformanceTrackerInterceptor;", "LQj0/I;", "<init>", "()V", "LQj0/I$b;", "pages", "()LQj0/I$b;", "LQj0/I$a;", "chain", "", "intercept", "(LQj0/I$a;)Z", "pageTypes$delegate", "LSc/j;", "getPageTypes", "pageTypes", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TravelPerformanceTrackerInterceptor extends I {

    /* renamed from: pageTypes$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j pageTypes = k.a(n.PUBLICATION, TravelPerformanceTrackerInterceptor$pageTypes$2.INSTANCE);

    private final I.b getPageTypes() {
        return (I.b) this.pageTypes.getValue();
    }

    @Override // Qj0.I
    public boolean intercept(@NotNull I.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return true;
    }

    @Override // Qj0.I
    @NotNull
    public I.b pages() {
        return getPageTypes();
    }
}
