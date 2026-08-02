package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async;

import B4.V;
import D40.a;
import HY.b;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h3.C6788a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTO;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncDTOMapper;", "deliveryV6AsyncDTOMapper", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncDTOMapper;)V", "", "asyncData", "stateId", "", "fetchWidget", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncDTOMapper;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel$Event;", "_events", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "events", "Landroidx/lifecycle/P;", "getEvents", "()Landroidx/lifecycle/P;", "Event", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6AsyncPlaceholderViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Event> _events;

    @NotNull
    private final DeliveryV6AsyncDTOMapper deliveryV6AsyncDTOMapper;

    @NotNull
    private final P<Event> events;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel$Event;", "", "<init>", "()V", "OnWidgetFetched", "OnWidgetFetchingFailed", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel$Event$OnWidgetFetched;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel$Event$OnWidgetFetchingFailed;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Event {

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010\u0012R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b'\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel$Event$OnWidgetFetched;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel$Event;", "", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO;", "listOfDeliveryVO", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$CartButtonTexts;", "cartButtonTexts", "", "isHidden", "", "tabGroupId", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "dateTrackingInfo", "trackingPayloads", "<init>", "(Ljava/util/List;Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$CartButtonTexts;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getListOfDeliveryVO", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$CartButtonTexts;", "getCartButtonTexts", "()Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$CartButtonTexts;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getTabGroupId", "Ljava/util/Map;", "getDateTrackingInfo", "()Ljava/util/Map;", "getTrackingPayloads", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnWidgetFetched extends Event {
            private final DeliveryDTO.CartButtonTexts cartButtonTexts;
            private final Map<String, TokenizedTrackingInfo> dateTrackingInfo;
            private final Boolean isHidden;

            @NotNull
            private final List<DeliveryV6VO<?>> listOfDeliveryVO;
            private final String tabGroupId;
            private final Map<String, String> trackingPayloads;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OnWidgetFetched(@NotNull List<? extends DeliveryV6VO<?>> listOfDeliveryVO, DeliveryDTO.CartButtonTexts cartButtonTexts, Boolean bool, String str, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2) {
                super(null);
                Intrinsics.checkNotNullParameter(listOfDeliveryVO, "listOfDeliveryVO");
                this.listOfDeliveryVO = listOfDeliveryVO;
                this.cartButtonTexts = cartButtonTexts;
                this.isHidden = bool;
                this.tabGroupId = str;
                this.dateTrackingInfo = map;
                this.trackingPayloads = map2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnWidgetFetched)) {
                    return false;
                }
                OnWidgetFetched onWidgetFetched = (OnWidgetFetched) other;
                return Intrinsics.d(this.listOfDeliveryVO, onWidgetFetched.listOfDeliveryVO) && Intrinsics.d(this.cartButtonTexts, onWidgetFetched.cartButtonTexts) && Intrinsics.d(this.isHidden, onWidgetFetched.isHidden) && Intrinsics.d(this.tabGroupId, onWidgetFetched.tabGroupId) && Intrinsics.d(this.dateTrackingInfo, onWidgetFetched.dateTrackingInfo) && Intrinsics.d(this.trackingPayloads, onWidgetFetched.trackingPayloads);
            }

            public final DeliveryDTO.CartButtonTexts getCartButtonTexts() {
                return this.cartButtonTexts;
            }

            public final Map<String, TokenizedTrackingInfo> getDateTrackingInfo() {
                return this.dateTrackingInfo;
            }

            @NotNull
            public final List<DeliveryV6VO<?>> getListOfDeliveryVO() {
                return this.listOfDeliveryVO;
            }

            public final String getTabGroupId() {
                return this.tabGroupId;
            }

            public final Map<String, String> getTrackingPayloads() {
                return this.trackingPayloads;
            }

            public int hashCode() {
                int hashCode = this.listOfDeliveryVO.hashCode() * 31;
                DeliveryDTO.CartButtonTexts cartButtonTexts = this.cartButtonTexts;
                int hashCode2 = (hashCode + (cartButtonTexts == null ? 0 : cartButtonTexts.hashCode())) * 31;
                Boolean bool = this.isHidden;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str = this.tabGroupId;
                int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.dateTrackingInfo;
                int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
                Map<String, String> map2 = this.trackingPayloads;
                return hashCode5 + (map2 != null ? map2.hashCode() : 0);
            }

            /* renamed from: isHidden, reason: from getter */
            public final Boolean getIsHidden() {
                return this.isHidden;
            }

            @NotNull
            public String toString() {
                List<DeliveryV6VO<?>> list = this.listOfDeliveryVO;
                DeliveryDTO.CartButtonTexts cartButtonTexts = this.cartButtonTexts;
                Boolean bool = this.isHidden;
                String str = this.tabGroupId;
                Map<String, TokenizedTrackingInfo> map = this.dateTrackingInfo;
                Map<String, String> map2 = this.trackingPayloads;
                StringBuilder sb2 = new StringBuilder("OnWidgetFetched(listOfDeliveryVO=");
                sb2.append(list);
                sb2.append(", cartButtonTexts=");
                sb2.append(cartButtonTexts);
                sb2.append(", isHidden=");
                b.c(bool, ", tabGroupId=", str, ", dateTrackingInfo=", sb2);
                return V.c(sb2, map, ", trackingPayloads=", map2, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel$Event$OnWidgetFetchingFailed;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel$Event;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnWidgetFetchingFailed extends Event {

            @NotNull
            private final Throwable error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnWidgetFetchingFailed(@NotNull Throwable error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnWidgetFetchingFailed) && Intrinsics.d(this.error, ((OnWidgetFetchingFailed) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @NotNull
            public String toString() {
                return a.c("OnWidgetFetchingFailed(error=", ")", this.error);
            }
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Event() {
        }
    }

    public DeliveryV6AsyncPlaceholderViewModel(@NotNull ComposerAsyncWidgetRepository repository, @NotNull DeliveryV6AsyncDTOMapper deliveryV6AsyncDTOMapper) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(deliveryV6AsyncDTOMapper, "deliveryV6AsyncDTOMapper");
        this.repository = repository;
        this.deliveryV6AsyncDTOMapper = deliveryV6AsyncDTOMapper;
        SingleLiveEvent<Event> singleLiveEvent = new SingleLiveEvent<>();
        this._events = singleLiveEvent;
        this.events = singleLiveEvent;
    }

    public final void fetchWidget(@NotNull String asyncData, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new DeliveryV6AsyncPlaceholderViewModel$fetchWidget$1(this, asyncData, stateId, null), 2);
    }

    @NotNull
    public final P<Event> getEvents() {
        return this.events;
    }
}
