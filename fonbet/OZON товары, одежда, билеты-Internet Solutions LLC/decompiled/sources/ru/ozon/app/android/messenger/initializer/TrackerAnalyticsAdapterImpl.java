package ru.ozon.app.android.messenger.initializer;

import Qj0.B;
import Qj0.C3882b;
import Qj0.C3884d;
import Qj0.C3885e;
import Qj0.Q;
import Qj0.U;
import Qj0.t0;
import Sg.a;
import androidx.recyclerview.widget.m;
import ei0.InterfaceC6369b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.analytics.d;
import ru.ozon.android.messenger.framework.analytics.e;
import ru.ozon.android.messenger.framework.analytics.f;
import ru.ozon.android.messenger.framework.analytics.g;
import ru.ozon.android.messenger.framework.analytics.i;
import ru.ozon.app.android.analytics.extensions.AnalyticsExtensionsKt;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ObjectTypes;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Page;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\f\b\u0001\u0010\t\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0018\u0010\t\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/messenger/initializer/TrackerAnalyticsAdapterImpl;", "Lru/ozon/android/messenger/framework/analytics/i;", "Lqj/a;", "networkInfoProvider", "Lei0/b;", "ozonTracker", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "applicationAnalyticsScreenStorage", "<init>", "(Lqj/a;Lei0/b;LSg/a;LSg/a;)V", "Lru/ozon/android/messenger/framework/analytics/g;", "tokensPerPage", "", "appendPageState", "(Lru/ozon/android/messenger/framework/analytics/g;)V", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "trackingInfo", "processEvents", "(Ljava/util/Map;)V", "Lru/ozon/android/messenger/framework/analytics/e;", "page", "sendPageView", "(Lru/ozon/android/messenger/framework/analytics/e;)V", "Lru/ozon/android/messenger/framework/analytics/f;", "metrics", "sendMetrics", "(Lru/ozon/android/messenger/framework/analytics/f;)V", "Lru/ozon/android/messenger/framework/analytics/d;", "customEvent", "sendCustomEvent", "(Lru/ozon/android/messenger/framework/analytics/d;)V", "Lqj/a;", "Lei0/b;", "LSg/a;", "Lru/ozon/android/messenger/framework/analytics/g;", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrackerAnalyticsAdapterImpl implements i {

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final a applicationAnalyticsScreenStorage;

    @NotNull
    private final C9067a networkInfoProvider;

    @NotNull
    private final InterfaceC6369b ozonTracker;
    private g tokensPerPage;

    public TrackerAnalyticsAdapterImpl(@NotNull C9067a networkInfoProvider, @NotNull InterfaceC6369b ozonTracker, @NotNull a analyticsScreenStorage, @NotNull a applicationAnalyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        this.networkInfoProvider = networkInfoProvider;
        this.ozonTracker = ozonTracker;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.applicationAnalyticsScreenStorage = applicationAnalyticsScreenStorage;
    }

    @Override // ru.ozon.android.messenger.framework.analytics.i
    public void appendPageState(@NotNull g tokensPerPage) {
        Intrinsics.checkNotNullParameter(tokensPerPage, "tokensPerPage");
        this.tokensPerPage = tokensPerPage;
    }

    @Override // ru.ozon.android.messenger.framework.analytics.i
    public void processEvents(@NotNull Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        for (Map.Entry<String, MessengerTrackingInfo> entry : trackingInfo.entrySet()) {
            InterfaceC6369b interfaceC6369b = this.ozonTracker;
            ActionType.Custom custom = new ActionType.Custom(entry.getValue().getActionType());
            String key = entry.getValue().getKey();
            g gVar = this.tokensPerPage;
            String str = null;
            String c11 = gVar != null ? gVar.c() : null;
            g gVar2 = this.tokensPerPage;
            String a11 = gVar2 != null ? gVar2.a() : null;
            Page page = AnalyticsExtensionsKt.toPage(this.analyticsScreenStorage.a());
            g gVar3 = this.tokensPerPage;
            if (gVar3 != null) {
                str = gVar3.b();
            }
            InterfaceC6369b.C0979b.b(interfaceC6369b, custom, null, page, a11, c11, null, key, str, null, Long.valueOf(entry.getValue().getPageTimestamp()), 1314);
        }
    }

    @Override // ru.ozon.android.messenger.framework.analytics.i
    public void sendCustomEvent(@NotNull d customEvent) {
        Intrinsics.checkNotNullParameter(customEvent, "customEvent");
        this.ozonTracker.f(customEvent.a(), customEvent.c(), customEvent.d(), customEvent.b());
    }

    @Override // ru.ozon.android.messenger.framework.analytics.i
    public void sendMetrics(@NotNull f metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        String b11 = metrics.b();
        if (b11 == null) {
            return;
        }
        U beginTrace = this.ozonTracker.beginTrace(b11);
        B b12 = new B(ObjectTypes.PAGE);
        int i11 = U.f23535i;
        beginTrace.n(b12, true);
        String d11 = metrics.d();
        if (d11 != null) {
            beginTrace.n(new t0(d11), true);
        }
        beginTrace.n(new C3882b(C9067a.g(this.networkInfoProvider)), true);
        beginTrace.n(new Q(m.e.DEFAULT_DRAG_ANIMATION_DURATION), true);
        U.p(beginTrace, MetricType.TOTAL_TIME_START, metrics.e(), false, 4);
        U.p(beginTrace, MetricType.TOTAL_TIME_END, metrics.a(), false, 4);
        String c11 = metrics.c();
        if (c11 != null) {
            beginTrace.n(new C3884d(c11), true);
        }
        String d12 = metrics.d();
        if (d12 != null) {
            beginTrace.n(new C3885e(d12), true);
        }
        this.ozonTracker.endTrace(b11);
    }

    @Override // ru.ozon.android.messenger.framework.analytics.i
    public void sendPageView(@NotNull e page) {
        Intrinsics.checkNotNullParameter(page, "page");
        Rg.a a11 = this.applicationAnalyticsScreenStorage.a();
        Rg.a aVar = new Rg.a(page.a(), page.b(), null, null, null, null, null, null, a11 != null ? Rg.a.a(a11, null, null, 3583) : null, null, null, 3580);
        this.analyticsScreenStorage.e(aVar);
        this.ozonTracker.sendPageView(AnalyticsExtensionsKt.toPage(aVar));
    }
}
