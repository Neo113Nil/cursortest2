package ru.ozon.app.android.payment.ui.createservice;

import Lm0.a;
import W10.c;
import android.net.Uri;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.payment.ui.createservice.CreateServiceDO;
import ru.ozon.app.android.payment.ui.createservice.CreateServiceEvent;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10727i;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJC\u0010#\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010!¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020'0*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/payment/ui/createservice/CreateServiceViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceRepository;", "repository", "<init>", "(Lru/ozon/app/android/payment/ui/createservice/CreateServiceRepository;)V", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO;", "response", "", "widgetId", "", "processCreateService", "(Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO;Ljava/lang/Long;)V", "", "error", "sendCriticalError", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceRedirect;", "sendRedirect", "(Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceRedirect;)V", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError;", "sendError", "(Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError;Ljava/lang/Long;)V", "sendShowLoader", "()V", "sendHideLoader", "", "getRedirectLink", "(Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceRedirect;)Ljava/lang/String;", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "body", "updateOrder", "(Ljava/lang/String;LW10/c;Ljava/lang/Long;Ljava/util/Map;)V", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceRepository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceEvent;", "updateOrderEvents", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "getEvents", "()Landroidx/lifecycle/P;", "events", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreateServiceViewModel extends w0 {

    @NotNull
    private final CreateServiceRepository repository;

    @NotNull
    private final SingleLiveEvent<CreateServiceEvent> updateOrderEvents;

    public CreateServiceViewModel(@NotNull CreateServiceRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.updateOrderEvents = new SingleLiveEvent<>();
    }

    private final String getRedirectLink(CreateServiceDO.CreateServiceRedirect createServiceRedirect) {
        String cancelLink = createServiceRedirect.getCancelLink();
        if (cancelLink == null || h.K(cancelLink)) {
            return createServiceRedirect.getRedirectLink();
        }
        Uri parse = Uri.parse(createServiceRedirect.getRedirectLink());
        if (!Intrinsics.d(parse.getAuthority(), "payment")) {
            return createServiceRedirect.getRedirectLink();
        }
        String uri = parse.buildUpon().appendQueryParameter("cancelLink", createServiceRedirect.getCancelLink()).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processCreateService(CreateServiceDO response, Long widgetId) {
        if (response instanceof CreateServiceDO.CreateServiceRedirect) {
            sendRedirect((CreateServiceDO.CreateServiceRedirect) response);
        } else if (response instanceof CreateServiceDO.CreateServiceError) {
            sendError((CreateServiceDO.CreateServiceError) response, widgetId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCriticalError(Throwable error) {
        a.f17149a.e(error);
        this.updateOrderEvents.setValue(new CreateServiceEvent.CriticalError(error));
    }

    private final void sendError(CreateServiceDO.CreateServiceError error, Long widgetId) {
        this.updateOrderEvents.setValue(new CreateServiceEvent.Error(widgetId, error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendHideLoader() {
        this.updateOrderEvents.setValue(CreateServiceEvent.HideLoader.INSTANCE);
    }

    private final void sendRedirect(CreateServiceDO.CreateServiceRedirect response) {
        this.updateOrderEvents.setValue(new CreateServiceEvent.Redirect(getRedirectLink(response)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendShowLoader() {
        this.updateOrderEvents.setValue(CreateServiceEvent.ShowLoader.INSTANCE);
    }

    @NotNull
    public final P<CreateServiceEvent> getEvents() {
        return this.updateOrderEvents;
    }

    public final void updateOrder(@NotNull String actionName, @NotNull c trackingData, Long widgetId, Map<String, String> body) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        C10727i.c(x0.a(this), null, null, new CreateServiceViewModel$updateOrder$1(this, actionName, trackingData, body, widgetId, null), 3);
    }
}
