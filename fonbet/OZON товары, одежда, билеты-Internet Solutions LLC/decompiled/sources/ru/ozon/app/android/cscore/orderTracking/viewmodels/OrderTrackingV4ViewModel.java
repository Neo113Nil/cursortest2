package ru.ozon.app.android.cscore.orderTracking.viewmodels;

import Ae.C2399j;
import Ae.C2408n0;
import android.os.Parcelable;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.csma.orderTracking.data.BarcodeTimerManager;
import ru.ozon.app.android.csma.orderTracking.data.BarcodeTimerManagerImpl;
import ru.ozon.app.android.csma.orderTracking.data.OrderTrackingV4DTO;
import ru.ozon.app.android.csma.orderTracking.data.UpdateAction;
import ru.ozon.app.android.csma.orderTracking.utils.ProcessLifecyclePublisher;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001/B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher;", "processLifecycleObserver", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher;)V", "Lxe/B0;", "startProcessWatcher", "()Lxe/B0;", "", "onCleared", "()V", "restartTimer", "", "updateActionName", "updateOrderTracking", "(Ljava/lang/String;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel$OrderTrackingV4ViewModelAction;", "actionObserver", "Landroidx/lifecycle/V;", "getActionObserver", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/csma/orderTracking/data/OrderTrackingV4DTO;", "_updateOrderTrackingObserver", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroid/os/Parcelable;", "screenScrollState", "Landroid/os/Parcelable;", "getScreenScrollState", "()Landroid/os/Parcelable;", "setScreenScrollState", "(Landroid/os/Parcelable;)V", "Lru/ozon/app/android/csma/orderTracking/data/BarcodeTimerManager;", "barcodeTimerManager", "Lru/ozon/app/android/csma/orderTracking/data/BarcodeTimerManager;", "getBarcodeTimerManager", "()Lru/ozon/app/android/csma/orderTracking/data/BarcodeTimerManager;", "Landroidx/lifecycle/P;", "getUpdateOrderTrackingObserver", "()Landroidx/lifecycle/P;", "updateOrderTrackingObserver", "OrderTrackingV4ViewModelAction", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderTrackingV4ViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<OrderTrackingV4DTO> _updateOrderTrackingObserver;

    @NotNull
    private final V<OrderTrackingV4ViewModelAction> actionObserver;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final BarcodeTimerManager barcodeTimerManager;

    @NotNull
    private final ProcessLifecyclePublisher processLifecycleObserver;
    private Parcelable screenScrollState;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel$OrderTrackingV4ViewModelAction;", "", "<init>", "()V", "EnableConfigurator", "LoadNewItems", "SetUpUpdateAction", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel$OrderTrackingV4ViewModelAction$EnableConfigurator;", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel$OrderTrackingV4ViewModelAction$LoadNewItems;", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel$OrderTrackingV4ViewModelAction$SetUpUpdateAction;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static abstract class OrderTrackingV4ViewModelAction {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel$OrderTrackingV4ViewModelAction$EnableConfigurator;", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel$OrderTrackingV4ViewModelAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EnableConfigurator extends OrderTrackingV4ViewModelAction {

            @NotNull
            public static final EnableConfigurator INSTANCE = new EnableConfigurator();

            private EnableConfigurator() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof EnableConfigurator);
            }

            public int hashCode() {
                return 1035998750;
            }

            @NotNull
            public String toString() {
                return "EnableConfigurator";
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel$OrderTrackingV4ViewModelAction$LoadNewItems;", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel$OrderTrackingV4ViewModelAction;", "action", "Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "<init>", "(Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;)V", "getAction", "()Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class LoadNewItems extends OrderTrackingV4ViewModelAction {

            @NotNull
            private final UpdateAction action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadNewItems(@NotNull UpdateAction action) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            @NotNull
            public final UpdateAction getAction() {
                return this.action;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel$OrderTrackingV4ViewModelAction$SetUpUpdateAction;", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel$OrderTrackingV4ViewModelAction;", "action", "Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "<init>", "(Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;)V", "getAction", "()Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SetUpUpdateAction extends OrderTrackingV4ViewModelAction {

            @NotNull
            private final UpdateAction action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetUpUpdateAction(@NotNull UpdateAction action) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            @NotNull
            public final UpdateAction getAction() {
                return this.action;
            }
        }

        public /* synthetic */ OrderTrackingV4ViewModelAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OrderTrackingV4ViewModelAction() {
        }
    }

    public OrderTrackingV4ViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull ProcessLifecyclePublisher processLifecycleObserver) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(processLifecycleObserver, "processLifecycleObserver");
        this.actionV2Repository = actionV2Repository;
        this.processLifecycleObserver = processLifecycleObserver;
        this.actionObserver = new V<>();
        this._updateOrderTrackingObserver = new SingleLiveEvent<>();
        this.barcodeTimerManager = new BarcodeTimerManagerImpl(x0.a(this));
        startProcessWatcher();
    }

    private final B0 startProcessWatcher() {
        return C2399j.C(new C2408n0(this.processLifecycleObserver.getProcessPublisher(), new OrderTrackingV4ViewModel$startProcessWatcher$1$1(this, null)), x0.a(this));
    }

    @NotNull
    public final V<OrderTrackingV4ViewModelAction> getActionObserver() {
        return this.actionObserver;
    }

    @NotNull
    public final BarcodeTimerManager getBarcodeTimerManager() {
        return this.barcodeTimerManager;
    }

    public final Parcelable getScreenScrollState() {
        return this.screenScrollState;
    }

    @NotNull
    public final P<OrderTrackingV4DTO> getUpdateOrderTrackingObserver() {
        return this._updateOrderTrackingObserver;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.processLifecycleObserver.clearListeners();
    }

    public final void restartTimer() {
        this.barcodeTimerManager.restartTimer(true);
    }

    public final void setScreenScrollState(Parcelable parcelable) {
        this.screenScrollState = parcelable;
    }

    public final void updateOrderTracking(@NotNull String updateActionName) {
        Intrinsics.checkNotNullParameter(updateActionName, "updateActionName");
        C10727i.c(x0.a(this), null, null, new OrderTrackingV4ViewModel$updateOrderTracking$1(this, updateActionName, null), 3);
    }
}
