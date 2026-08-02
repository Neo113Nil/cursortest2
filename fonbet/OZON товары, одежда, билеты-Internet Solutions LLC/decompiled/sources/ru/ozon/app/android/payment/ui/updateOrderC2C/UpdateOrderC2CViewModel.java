package ru.ozon.app.android.payment.ui.updateOrderC2C;

import Lm0.a;
import W10.c;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderC2CEvent;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderDO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10727i;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0019J+\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020#0&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CRepository;", "repository", "<init>", "(Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CRepository;)V", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO;", "response", "", "widgetId", "", "processUpdateOrder", "(Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO;Ljava/lang/Long;)V", "", "error", "sendCriticalError", "(Ljava/lang/Throwable;)V", "", "redirectLink", "sendRedirect", "(Ljava/lang/String;)V", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO$UpdateOrderError;", "sendError", "(Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO$UpdateOrderError;Ljava/lang/Long;)V", "sendShowLoader", "()V", "sendHideLoader", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "updateOrder", "(Ljava/lang/String;LW10/c;Ljava/lang/Long;)V", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CRepository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent;", "updateOrderEvents", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "getEvents", "()Landroidx/lifecycle/P;", "events", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdateOrderC2CViewModel extends w0 {

    @NotNull
    private final UpdateOrderC2CRepository repository;

    @NotNull
    private final SingleLiveEvent<UpdateOrderC2CEvent> updateOrderEvents;

    public UpdateOrderC2CViewModel(@NotNull UpdateOrderC2CRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.updateOrderEvents = new SingleLiveEvent<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processUpdateOrder(UpdateOrderDO response, Long widgetId) {
        if (response instanceof UpdateOrderDO.UpdateOrderRedirect) {
            sendRedirect(((UpdateOrderDO.UpdateOrderRedirect) response).getRedirectLink());
        } else if (response instanceof UpdateOrderDO.UpdateOrderError) {
            sendError((UpdateOrderDO.UpdateOrderError) response, widgetId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCriticalError(Throwable error) {
        a.f17149a.e(error);
        this.updateOrderEvents.setValue(new UpdateOrderC2CEvent.CriticalError(error));
    }

    private final void sendError(UpdateOrderDO.UpdateOrderError error, Long widgetId) {
        this.updateOrderEvents.setValue(new UpdateOrderC2CEvent.Error(widgetId, error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendHideLoader() {
        this.updateOrderEvents.setValue(UpdateOrderC2CEvent.HideLoader.INSTANCE);
    }

    private final void sendRedirect(String redirectLink) {
        this.updateOrderEvents.setValue(new UpdateOrderC2CEvent.Redirect(redirectLink));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendShowLoader() {
        this.updateOrderEvents.setValue(UpdateOrderC2CEvent.ShowLoader.INSTANCE);
    }

    @NotNull
    public final P<UpdateOrderC2CEvent> getEvents() {
        return this.updateOrderEvents;
    }

    public final void updateOrder(@NotNull String actionName, @NotNull c trackingData, Long widgetId) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        C10727i.c(x0.a(this), null, null, new UpdateOrderC2CViewModel$updateOrder$1(this, actionName, trackingData, widgetId, null), 3);
    }
}
