package ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusEnumVO;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_STATUS_CREATED", "ORDER_STATUS_PACKAGING", "ORDER_STATUS_ON_THE_WAY", "ORDER_STATUS_RECEIVED", "ORDER_STATUS_CANCELED", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderStatusEnumVO {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OrderStatusEnumVO[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final Map<String, OrderStatusEnumVO> values;
    public static final OrderStatusEnumVO ORDER_STATUS_CREATED = new OrderStatusEnumVO("ORDER_STATUS_CREATED", 0);
    public static final OrderStatusEnumVO ORDER_STATUS_PACKAGING = new OrderStatusEnumVO("ORDER_STATUS_PACKAGING", 1);
    public static final OrderStatusEnumVO ORDER_STATUS_ON_THE_WAY = new OrderStatusEnumVO("ORDER_STATUS_ON_THE_WAY", 2);
    public static final OrderStatusEnumVO ORDER_STATUS_RECEIVED = new OrderStatusEnumVO("ORDER_STATUS_RECEIVED", 3);
    public static final OrderStatusEnumVO ORDER_STATUS_CANCELED = new OrderStatusEnumVO("ORDER_STATUS_CANCELED", 4);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusEnumVO$Companion;", "", "<init>", "()V", "values", "", "", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusEnumVO;", "fromValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OrderStatusEnumVO fromValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            OrderStatusEnumVO orderStatusEnumVO = (OrderStatusEnumVO) OrderStatusEnumVO.values.get(value);
            return orderStatusEnumVO == null ? OrderStatusEnumVO.ORDER_STATUS_CREATED : orderStatusEnumVO;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ OrderStatusEnumVO[] $values() {
        return new OrderStatusEnumVO[]{ORDER_STATUS_CREATED, ORDER_STATUS_PACKAGING, ORDER_STATUS_ON_THE_WAY, ORDER_STATUS_RECEIVED, ORDER_STATUS_CANCELED};
    }

    static {
        OrderStatusEnumVO[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        OrderStatusEnumVO[] values2 = values();
        int h11 = U.h(values2.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
        for (OrderStatusEnumVO orderStatusEnumVO : values2) {
            linkedHashMap.put(orderStatusEnumVO.name(), orderStatusEnumVO);
        }
        values = linkedHashMap;
    }

    private OrderStatusEnumVO(String str, int i11) {
    }

    public static OrderStatusEnumVO valueOf(String str) {
        return (OrderStatusEnumVO) Enum.valueOf(OrderStatusEnumVO.class, str);
    }

    public static OrderStatusEnumVO[] values() {
        return (OrderStatusEnumVO[]) $VALUES.clone();
    }
}
