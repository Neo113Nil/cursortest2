package ru.ozon.app.android.network.dependency;

import Qj0.C3897q;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.network.security.antibot.AntibotPerfAnalyticService;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/network/dependency/AntibotPerfAnalyticServiceImpl;", "Lru/ozon/app/android/network/security/antibot/AntibotPerfAnalyticService;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "traceKey", "", "removePerfAnalytic", "(Ljava/lang/String;)V", "trackAntibot", "Landroid/content/Context;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate$delegate", "LSc/j;", "getPerformanceTrackerDelegate", "()Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AntibotPerfAnalyticServiceImpl implements AntibotPerfAnalyticService {

    @NotNull
    private final Context context;

    /* renamed from: performanceTrackerDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j performanceTrackerDelegate;

    public AntibotPerfAnalyticServiceImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.performanceTrackerDelegate = k.b(new AntibotPerfAnalyticServiceImpl$performanceTrackerDelegate$2(this));
    }

    private final PerformanceTrackerDelegate getPerformanceTrackerDelegate() {
        return (PerformanceTrackerDelegate) this.performanceTrackerDelegate.getValue();
    }

    @Override // ru.ozon.app.android.network.security.antibot.AntibotPerfAnalyticService
    public void removePerfAnalytic(@NotNull String traceKey) {
        Intrinsics.checkNotNullParameter(traceKey, "traceKey");
        if (getPerformanceTrackerDelegate().removeTrace(traceKey) != null) {
            PerformanceTrackerDelegate performanceTrackerDelegate = getPerformanceTrackerDelegate();
            Intrinsics.checkNotNullParameter(traceKey, "key");
            performanceTrackerDelegate.beginTrace(new C3897q(traceKey));
        }
    }

    @Override // ru.ozon.app.android.network.security.antibot.AntibotPerfAnalyticService
    public void trackAntibot(@NotNull String traceKey) {
        Intrinsics.checkNotNullParameter(traceKey, "traceKey");
        getPerformanceTrackerDelegate().beginTrace(traceKey, AntibotPerfAnalyticServiceImpl$trackAntibot$1.INSTANCE);
    }
}
