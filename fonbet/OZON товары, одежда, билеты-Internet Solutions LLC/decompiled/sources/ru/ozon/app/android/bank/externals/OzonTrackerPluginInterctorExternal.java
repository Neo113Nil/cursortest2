package ru.ozon.app.android.bank.externals;

import Ak.C2436a;
import E30.g;
import Qj0.B;
import Qj0.C3882b;
import Qj0.C3884d;
import Qj0.C3885e;
import Qj0.InterfaceC3892l;
import Qj0.U;
import Qj0.t0;
import Sc.o;
import Sg.a;
import android.annotation.SuppressLint;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ei0.InterfaceC6369b;
import fi0.e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import m90.C8110a;
import m90.b;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.analytics.extensions.AnalyticsExtensionsKt;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ObjectTypes;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.tracker.sendEvent.Page;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 92\u00020\u0001:\u00029:B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010$\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u00132\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%JS\u0010-\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u00132\b\u0010(\u001a\u0004\u0018\u00010\u00132\b\u0010)\u001a\u0004\u0018\u00010\u00132\b\u0010*\u001a\u0004\u0018\u00010\u00132\b\u0010+\u001a\u0004\u0018\u00010\u00132\b\u0010,\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u00152\b\u0010/\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b0\u0010\u0017J\u000f\u00101\u001a\u00020\u0015H\u0016¢\u0006\u0004\b1\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u001e\u00107\u001a\n\u0018\u000105j\u0004\u0018\u0001`68\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lru/ozon/app/android/bank/externals/OzonTrackerPluginInterctorExternal;", "Lm90/a;", "Lqj/a;", "networkInfoProvider", "Lei0/b;", "tracker", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "applicationAnalyticsScreenStorage", "<init>", "(Lqj/a;Lei0/b;LSg/a;)V", "Lm90/b;", "Lru/ozon/app/android/bank/externals/OzonTrackerPluginInterctorExternal$FintechPerfMetricType;", "toFintechPerfMetricType", "(Lm90/b;)Lru/ozon/app/android/bank/externals/OzonTrackerPluginInterctorExternal$FintechPerfMetricType;", "Lm90/a$a;", "Lru/ozon/tracker/sendEvent/ActionType;", "toActionType", "(Lm90/a$a;)Lru/ozon/tracker/sendEvent/ActionType;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "setPageView", "(Ljava/lang/String;)V", "sendPageView", "()V", "dispatch", ImagesContract.URL, "pageType", "beginTotalTimeTrace", "(Ljava/lang/String;Ljava/lang/String;)V", "", "isSuccess", "reasonMsg", "", "additionalTrackerMetrics", "endTotalTimeTrace", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "eventEntityObjId", "eventEntityObjType", "eventEntityPropertiesTitle", "eventEntityPropertiesBrandName", "widgetName", "analyticsPageName", "sendEvent", "(Lm90/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "userId", "updateUserId", "sendAllPerfAnalytics", "Lqj/a;", "Lei0/b;", "LSg/a;", "LRg/a;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsScreen;", "currentScreen", "LRg/a;", "Companion", "FintechPerfMetricType", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OzonTrackerPluginInterctorExternal extends C8110a {

    @NotNull
    private final a applicationAnalyticsScreenStorage;
    private volatile Rg.a currentScreen;

    @NotNull
    private final C9067a networkInfoProvider;

    @NotNull
    private final InterfaceC6369b tracker;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0017\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/bank/externals/OzonTrackerPluginInterctorExternal$FintechPerfMetricType;", "LQj0/l;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getValue", "()J", "Ljava/lang/String;", "getName", "metricName", "getMetricName", "isInterval", "Z", "()Z", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FintechPerfMetricType implements InterfaceC3892l {
        private final boolean isInterval;

        @NotNull
        private final String metricName;

        @NotNull
        private final String name;
        private final long value;

        public FintechPerfMetricType(long j11, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.value = j11;
            this.name = name;
            this.metricName = getName();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FintechPerfMetricType)) {
                return false;
            }
            FintechPerfMetricType fintechPerfMetricType = (FintechPerfMetricType) other;
            return this.value == fintechPerfMetricType.value && Intrinsics.d(this.name, fintechPerfMetricType.name);
        }

        @Override // Qj0.InterfaceC3892l
        @NotNull
        public String getMetricName() {
            return this.metricName;
        }

        @Override // Qj0.InterfaceC3892l
        @NotNull
        public String getName() {
            return this.name;
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.name.hashCode() + (Long.hashCode(this.value) * 31);
        }

        @Override // Qj0.InterfaceC3892l
        /* renamed from: isInterval, reason: from getter */
        public boolean getIsInterval() {
            return this.isInterval;
        }

        @NotNull
        public String toString() {
            StringBuilder c11 = C2436a.c(this.value, "FintechPerfMetricType(value=", ", name=", this.name);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C8110a.EnumC1263a.values().length];
            try {
                iArr[C8110a.EnumC1263a.CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C8110a.EnumC1263a.PAGE_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C8110a.EnumC1263a.VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OzonTrackerPluginInterctorExternal(@NotNull C9067a networkInfoProvider, @NotNull InterfaceC6369b tracker, @NotNull a applicationAnalyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        this.networkInfoProvider = networkInfoProvider;
        this.tracker = tracker;
        this.applicationAnalyticsScreenStorage = applicationAnalyticsScreenStorage;
    }

    private final ActionType toActionType(C8110a.EnumC1263a enumC1263a) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[enumC1263a.ordinal()];
        if (i11 == 1) {
            return ActionType.CLICK.INSTANCE;
        }
        if (i11 == 2) {
            return ActionType.PAGE_VIEW.INSTANCE;
        }
        if (i11 == 3) {
            return ActionType.VIEW.INSTANCE;
        }
        throw new o();
    }

    private final FintechPerfMetricType toFintechPerfMetricType(b bVar) {
        return new FintechPerfMetricType(bVar.b(), bVar.a().name());
    }

    @Override // m90.C8110a
    @SuppressLint({"MissingPermission"})
    public void beginTotalTimeTrace(@NotNull String url, @NotNull String pageType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        L80.a.a("OzonTrackerSdk", "webViewPageLoadStarted for " + url);
        U beginTrace = this.tracker.beginTrace(url);
        t0 t0Var = new t0(url);
        int i11 = U.f23535i;
        beginTrace.n(t0Var, true);
        beginTrace.n(new C3885e(url), true);
        beginTrace.n(new C3884d(pageType), true);
        beginTrace.n(new B(ObjectTypes.PAGE), true);
        beginTrace.n(new C3882b(C9067a.g(this.networkInfoProvider)), true);
        U.p(beginTrace, MetricType.TOTAL_TIME_START, 0L, false, 2);
    }

    @Override // m90.C8110a
    public void dispatch() {
        this.tracker.g();
    }

    @Override // m90.C8110a
    public void endTotalTimeTrace(@NotNull String url, boolean isSuccess, String reasonMsg, List<b> additionalTrackerMetrics) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC6369b interfaceC6369b = this.tracker;
        if (!isSuccess) {
            boolean hasTrace = interfaceC6369b.hasTrace(url);
            Boolean valueOf = Boolean.valueOf(hasTrace);
            if (!hasTrace) {
                valueOf = null;
            }
            if (valueOf != null) {
                L80.a.a("OzonTrackerSdk", "webViewPageLoadFinished remove trace for ".concat(url));
                interfaceC6369b.removeTrace(url);
            }
            L80.a.a("OzonTrackerSdk", "webViewPageLoadFinished send error for ".concat(url));
            if (reasonMsg == null) {
                reasonMsg = "";
            }
            interfaceC6369b.sendEvent(new ActionType.Custom("error_loading_webview"), (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? null : new Cell.CustomCell(kotlin.collections.U.j(new Pair("id", "0"), new Pair("type", "error"), new Pair(ImagesContract.URL, url), new Pair("reason", reasonMsg))), (r27 & 16) != 0 ? null : null, AnalyticsExtensionsKt.toPage(this.currentScreen), (r27 & 64) != 0 ? null : null, null, null, null, null, null, null, null, null, null);
            return;
        }
        L80.a.a("OzonTrackerSdk", "webViewPageLoadFinished success for " + url);
        if (interfaceC6369b.hasTrace(url)) {
            U beginTrace = interfaceC6369b.beginTrace(url);
            U.p(beginTrace, MetricType.TOTAL_TIME_END, 0L, false, 6);
            if (additionalTrackerMetrics != null) {
                Iterator<T> it = additionalTrackerMetrics.iterator();
                while (it.hasNext()) {
                    FintechPerfMetricType fintechPerfMetricType = toFintechPerfMetricType((b) it.next());
                    U.p(beginTrace, fintechPerfMetricType, fintechPerfMetricType.getValue(), false, 4);
                }
            }
            interfaceC6369b.endTrace(url);
        }
    }

    @Override // m90.C8110a
    public void sendAllPerfAnalytics() {
        this.tracker.c(null);
    }

    @Override // m90.C8110a
    public void sendEvent(@NotNull C8110a.EnumC1263a actionType, String eventEntityObjId, String eventEntityObjType, String eventEntityPropertiesTitle, String eventEntityPropertiesBrandName, String widgetName, String analyticsPageName) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.tracker.sendEvent(toActionType(actionType), (r27 & 2) != 0 ? null : eventEntityObjId != null ? new EventEntity.Obj(eventEntityObjType, eventEntityObjId, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483644, null) : null, (r27 & 4) != 0 ? null : eventEntityPropertiesTitle != null ? new EventEntity.Properties(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eventEntityPropertiesTitle, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -262145, 16383, null) : null, (r27 & 8) != 0 ? null : null, (r27 & 16) != 0 ? null : widgetName != null ? new EventEntity.Widget(null, widgetName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048573, null) : null, analyticsPageName != null ? new Page(analyticsPageName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142, null) : null, (r27 & 64) != 0 ? null : null, null, null, null, null, null, null, null, null, null);
    }

    @Override // m90.C8110a
    public void sendPageView() {
        g.a(OzonTrackerPluginInterctorExternal$sendPageView$1.INSTANCE, this.currentScreen, this.tracker);
    }

    @Override // m90.C8110a
    public void setPageView(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.currentScreen = new Rg.a(name, null, null, null, null, null, null, null, this.currentScreen, null, null, 3582);
        this.applicationAnalyticsScreenStorage.e(this.currentScreen);
    }

    @Override // m90.C8110a
    public void updateUserId(String userId) {
        e customPropertyTracker = this.tracker.getCustomPropertyTracker();
        if (userId == null) {
            userId = "";
        }
        customPropertyTracker.setUserId(userId);
    }
}
