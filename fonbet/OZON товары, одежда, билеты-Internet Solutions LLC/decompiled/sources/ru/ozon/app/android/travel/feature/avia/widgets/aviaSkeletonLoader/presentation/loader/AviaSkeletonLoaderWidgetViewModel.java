package ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.presentation.loader;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Kk.c;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.metrics.client.MetricsResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LW10/c;", "trackingData", "", "performAction", "(Lru/ozon/uni/atoms/af/AtomAction;LW10/c;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lxe/B0;", "currentJob", "Lxe/B0;", "LAe/w0;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel$ActionResult;", "_actionFlow", "LAe/w0;", "LAe/B0;", "actionFlow", "LAe/B0;", "getActionFlow", "()LAe/B0;", "Lru/ozon/app/android/metrics/client/MetricsResponse$Metrics;", "_metricsFlow", "metricsFlow", "getMetricsFlow", "ActionResult", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSkeletonLoaderWidgetViewModel extends w0 {

    @NotNull
    private final Ae.w0<ActionResult> _actionFlow;

    @NotNull
    private final Ae.w0<MetricsResponse.Metrics> _metricsFlow;

    @NotNull
    private final B0<ActionResult> actionFlow;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private xe.B0 currentJob;

    @NotNull
    private final B0<MetricsResponse.Metrics> metricsFlow;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel$ActionResult;", "", "Error", "RepeatRequest", "Action", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel$ActionResult$Action;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel$ActionResult$Error;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel$ActionResult$RepeatRequest;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ActionResult {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel$ActionResult$Action;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel$ActionResult;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Action implements ActionResult {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction action;

            public Action(@NotNull AtomAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Action) && Intrinsics.d(this.action, ((Action) other).action);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("Action(action=", ")", this.action);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel$ActionResult$Error;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel$ActionResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements ActionResult {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return -1036858473;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel$ActionResult$RepeatRequest;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel$ActionResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RepeatRequest implements ActionResult {

            @NotNull
            public static final RepeatRequest INSTANCE = new RepeatRequest();

            private RepeatRequest() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RepeatRequest);
            }

            public int hashCode() {
                return 177464067;
            }

            @NotNull
            public String toString() {
                return "RepeatRequest";
            }
        }
    }

    public AviaSkeletonLoaderWidgetViewModel(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        C0 b11 = E0.b(0, 0, null, 7);
        this._actionFlow = b11;
        this.actionFlow = C2399j.a(b11);
        C0 b12 = E0.b(0, 0, null, 7);
        this._metricsFlow = b12;
        this.metricsFlow = C2399j.a(b12);
    }

    @NotNull
    public final B0<ActionResult> getActionFlow() {
        return this.actionFlow;
    }

    @NotNull
    public final B0<MetricsResponse.Metrics> getMetricsFlow() {
        return this.metricsFlow;
    }

    public final void performAction(AtomAction action, @NotNull W10.c trackingData) {
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        if (action instanceof AtomAction.ComposerAction) {
            xe.B0 b02 = this.currentJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.currentJob = C10727i.c(x0.a(this), null, null, new AviaSkeletonLoaderWidgetViewModel$performAction$1(this, action, trackingData, null), 3);
        }
    }
}
