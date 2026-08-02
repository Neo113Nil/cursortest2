package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import B90.C2618u;
import Kk.c;
import Lm0.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.feature.general.booking.actionHandlers.hotelsBookSuccessValidation.HotelsBookEventFlow;
import ru.ozon.app.android.travel.usecase.RequestTravelCommonActionV2UseCase;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010!\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001c2\n\u0010 \u001a\u00060\u001ej\u0002`\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/usecase/RequestTravelCommonActionV2UseCase;", "requestTravelCommonActionV2UseCase", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchers", "<init>", "(Lru/ozon/app/android/travel/usecase/RequestTravelCommonActionV2UseCase;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isNotEventFlow", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult;", "result", "", "sendResult", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "throwable", "handleOnFailure", "(Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "storage", "setUpStorage", "(Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;)V", "", "actionName", "", "params", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "performApiAction", "(Ljava/lang/String;Ljava/util/Map;LW10/c;)V", "Lru/ozon/app/android/travel/usecase/RequestTravelCommonActionV2UseCase;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lze/h;", "resultChannel", "Lze/h;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "Lxe/B0;", "currentJob", "Lxe/B0;", "LAe/h;", "getResultFlow", "()LAe/h;", "resultFlow", "ActionResult", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3ViewModel extends w0 {
    private B0 currentJob;

    @NotNull
    private final CoroutineDispatcherProvider dispatchers;

    @NotNull
    private final RequestTravelCommonActionV2UseCase requestTravelCommonActionV2UseCase;

    @NotNull
    private final h<ActionResult> resultChannel;
    private TravelPageKeyValueStorage storage;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult;", "", "Success", "Error", "Loading", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult$Error;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult$Loading;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult$Success;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ActionResult {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult$Error;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult;", "<init>", "()V", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Error implements ActionResult {
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult$Loading;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult;", "", "isButtonLoader", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading implements ActionResult {
            private final boolean isButtonLoader;

            public Loading(boolean z11) {
                this.isButtonLoader = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && this.isButtonLoader == ((Loading) other).isButtonLoader;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isButtonLoader);
            }

            /* renamed from: isButtonLoader, reason: from getter */
            public final boolean getIsButtonLoader() {
                return this.isButtonLoader;
            }

            @NotNull
            public String toString() {
                return C2618u.g("Loading(isButtonLoader=", ")", this.isButtonLoader);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult$Success;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel$ActionResult;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements ActionResult {

            @NotNull
            private final AtomAction action;

            public Success(@NotNull AtomAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.action, ((Success) other).action);
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
                return c.e("Success(action=", ")", this.action);
            }
        }
    }

    public HotelsBookTotalV3ViewModel(@NotNull RequestTravelCommonActionV2UseCase requestTravelCommonActionV2UseCase, @NotNull CoroutineDispatcherProvider dispatchers) {
        Intrinsics.checkNotNullParameter(requestTravelCommonActionV2UseCase, "requestTravelCommonActionV2UseCase");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.requestTravelCommonActionV2UseCase = requestTravelCommonActionV2UseCase;
        this.dispatchers = dispatchers;
        this.resultChannel = k.a(-2, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleOnFailure(Throwable th2, d<? super Unit> dVar) {
        a.f17149a.e(th2);
        Object sendResult = sendResult(new ActionResult.Error(), dVar);
        return sendResult == Wc.a.COROUTINE_SUSPENDED ? sendResult : Unit.f71690a;
    }

    private final boolean isNotEventFlow(Object value) {
        return !(value instanceof HotelsBookEventFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendResult(ActionResult actionResult, d<? super Unit> dVar) {
        Object n11 = this.resultChannel.n(actionResult, dVar);
        return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : Unit.f71690a;
    }

    @NotNull
    public final InterfaceC2395h<ActionResult> getResultFlow() {
        return C2399j.H(this.resultChannel);
    }

    public final void performApiAction(@NotNull String actionName, Map<String, String> params, @NotNull W10.c trackingData) {
        Map<String, Object> all;
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        B0 b02 = this.currentJob;
        if (b02 != null) {
            b02.j(null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (params != null) {
            linkedHashMap.putAll(params);
        }
        TravelPageKeyValueStorage travelPageKeyValueStorage = this.storage;
        if (travelPageKeyValueStorage != null && (all = travelPageKeyValueStorage.getAll()) != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : all.entrySet()) {
                if (isNotEventFlow(entry.getValue())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        this.currentJob = C10727i.c(x0.a(this), this.dispatchers.getDefault(), null, new HotelsBookTotalV3ViewModel$performApiAction$4(this, Intrinsics.d(params != null ? params.get("showOnlyButtonLoader") : null, "true"), actionName, linkedHashMap, trackingData, null), 2);
    }

    public final void setUpStorage(@NotNull TravelPageKeyValueStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
    }
}
