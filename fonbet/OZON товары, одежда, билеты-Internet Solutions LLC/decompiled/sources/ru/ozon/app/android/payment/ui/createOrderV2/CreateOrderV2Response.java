package ru.ozon.app.android.payment.ui.createOrderV2;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/payment/ui/createOrderV2/CreateOrderV2Response;", "", "createOrderResponse", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO;", "poolingDetails", "Lru/ozon/app/android/payment/ui/createOrderV2/CreateOrderV2Response$Pooling;", "<init>", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO;Lru/ozon/app/android/payment/ui/createOrderV2/CreateOrderV2Response$Pooling;)V", "getCreateOrderResponse", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO;", "getPoolingDetails", "()Lru/ozon/app/android/payment/ui/createOrderV2/CreateOrderV2Response$Pooling;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Pooling", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CreateOrderV2Response {
    private final OrderDTO createOrderResponse;
    private final Pooling poolingDetails;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/payment/ui/createOrderV2/CreateOrderV2Response$Pooling;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "delay", "", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;J)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDelay", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pooling {

        @NotNull
        private final AtomActionDTO action;
        private final long delay;

        public Pooling(@NotNull AtomActionDTO action, long j11) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.delay = j11;
        }

        public static /* synthetic */ Pooling copy$default(Pooling pooling, AtomActionDTO atomActionDTO, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = pooling.action;
            }
            if ((i11 & 2) != 0) {
                j11 = pooling.delay;
            }
            return pooling.copy(atomActionDTO, j11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final long getDelay() {
            return this.delay;
        }

        @NotNull
        public final Pooling copy(@NotNull AtomActionDTO action, long delay) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new Pooling(action, delay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pooling)) {
                return false;
            }
            Pooling pooling = (Pooling) other;
            return Intrinsics.d(this.action, pooling.action) && this.delay == pooling.delay;
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final long getDelay() {
            return this.delay;
        }

        public int hashCode() {
            return Long.hashCode(this.delay) + (this.action.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Pooling(action=" + this.action + ", delay=" + this.delay + ")";
        }
    }

    public CreateOrderV2Response(OrderDTO orderDTO, Pooling pooling) {
        this.createOrderResponse = orderDTO;
        this.poolingDetails = pooling;
    }

    public static /* synthetic */ CreateOrderV2Response copy$default(CreateOrderV2Response createOrderV2Response, OrderDTO orderDTO, Pooling pooling, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orderDTO = createOrderV2Response.createOrderResponse;
        }
        if ((i11 & 2) != 0) {
            pooling = createOrderV2Response.poolingDetails;
        }
        return createOrderV2Response.copy(orderDTO, pooling);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderDTO getCreateOrderResponse() {
        return this.createOrderResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final Pooling getPoolingDetails() {
        return this.poolingDetails;
    }

    @NotNull
    public final CreateOrderV2Response copy(OrderDTO createOrderResponse, Pooling poolingDetails) {
        return new CreateOrderV2Response(createOrderResponse, poolingDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrderV2Response)) {
            return false;
        }
        CreateOrderV2Response createOrderV2Response = (CreateOrderV2Response) other;
        return Intrinsics.d(this.createOrderResponse, createOrderV2Response.createOrderResponse) && Intrinsics.d(this.poolingDetails, createOrderV2Response.poolingDetails);
    }

    public final OrderDTO getCreateOrderResponse() {
        return this.createOrderResponse;
    }

    public final Pooling getPoolingDetails() {
        return this.poolingDetails;
    }

    public int hashCode() {
        OrderDTO orderDTO = this.createOrderResponse;
        int hashCode = (orderDTO == null ? 0 : orderDTO.hashCode()) * 31;
        Pooling pooling = this.poolingDetails;
        return hashCode + (pooling != null ? pooling.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CreateOrderV2Response(createOrderResponse=" + this.createOrderResponse + ", poolingDetails=" + this.poolingDetails + ")";
    }
}
