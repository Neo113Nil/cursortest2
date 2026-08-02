package ru.ozon.app.android.analytics.performance;

import Qj0.InterfaceC3896p;
import Qj0.U;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "LQj0/p;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/Function1;", "LQj0/U;", "", "block", "runTrace", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "beginTrace", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)LQj0/U;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PerformanceTrackerDelegate extends InterfaceC3896p {
    @NotNull
    U beginTrace(@NotNull String name, Function1<? super U, Unit> block);

    void runTrace(@NotNull String name, Function1<? super U, Unit> block);
}
