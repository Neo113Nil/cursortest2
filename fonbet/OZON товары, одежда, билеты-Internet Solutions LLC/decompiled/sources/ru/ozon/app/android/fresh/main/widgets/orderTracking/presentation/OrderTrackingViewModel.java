package ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation;

import DM.i;
import GH.b;
import Lm0.a;
import Nc.C3669c;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h20.InterfaceC6786a;
import io.reactivex.p;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.api.OrderTrackingApi;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.data.OrderTrackingDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001)B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u000fJ\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u000fJ\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR.\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/api/OrderTrackingApi;", "orderTrackingApi", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/orderTracking/api/OrderTrackingApi;)V", "", "period", "initialDelay", "", "startUpdateTimer", "(JJ)V", "getOrderTracking", "()V", "onCleared", "updatePeriod", "bindWidget", "(J)V", "onStart", "onRefresh", "onStop", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/api/OrderTrackingApi;", "timerPeriod", "J", "", "immediatelyRefreshWidget", "Z", "Lnc/b;", "timerDisposable", "Lnc/b;", "LNc/c;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO;", "state", "LNc/c;", "getState", "()LNc/c;", "setState", "(LNc/c;)V", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderTrackingViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private boolean immediatelyRefreshWidget;

    @NotNull
    private final OrderTrackingApi orderTrackingApi;

    @NotNull
    private C3669c<ActionV2Response<OrderTrackingDTO>> state;
    private InterfaceC8487b timerDisposable;
    private long timerPeriod;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/presentation/OrderTrackingViewModel$Companion;", "", "<init>", "()V", "DEFAULT_PERIOD", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OrderTrackingViewModel(@NotNull OrderTrackingApi orderTrackingApi) {
        Intrinsics.checkNotNullParameter(orderTrackingApi, "orderTrackingApi");
        this.orderTrackingApi = orderTrackingApi;
        this.timerPeriod = 60L;
        C3669c<ActionV2Response<OrderTrackingDTO>> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.state = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getOrderTracking() {
        C10727i.c(x0.a(this), null, null, new OrderTrackingViewModel$getOrderTracking$1(this, null), 3);
    }

    private final void startUpdateTimer(long period, long initialDelay) {
        this.timerPeriod = period;
        InterfaceC8487b interfaceC8487b = this.timerDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        this.timerDisposable = p.interval(initialDelay, this.timerPeriod, TimeUnit.SECONDS).observeOn(C8125a.a()).subscribe(new i(new OrderTrackingViewModel$startUpdateTimer$1(this), 18), new b(new OrderTrackingViewModel$startUpdateTimer$2(a.f17149a), 13));
    }

    public final void bindWidget(long updatePeriod) {
        if (this.immediatelyRefreshWidget) {
            startUpdateTimer(updatePeriod, 0L);
        } else {
            this.immediatelyRefreshWidget = true;
            startUpdateTimer(updatePeriod, updatePeriod);
        }
    }

    @NotNull
    public final C3669c<ActionV2Response<OrderTrackingDTO>> getState() {
        return this.state;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        InterfaceC8487b interfaceC8487b = this.timerDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    public final void onRefresh() {
        this.immediatelyRefreshWidget = false;
    }

    public final void onStart() {
        InterfaceC8487b interfaceC8487b = this.timerDisposable;
        if (interfaceC8487b == null || !interfaceC8487b.isDisposed()) {
            return;
        }
        startUpdateTimer(this.timerPeriod, 0L);
    }

    public final void onStop() {
        InterfaceC8487b interfaceC8487b = this.timerDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }
}
