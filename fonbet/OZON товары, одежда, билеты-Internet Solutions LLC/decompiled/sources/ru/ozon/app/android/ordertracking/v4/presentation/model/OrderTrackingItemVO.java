package ru.ozon.app.android.ordertracking.v4.presentation.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingItemVO;", "", "id", "", "<init>", "(J)V", "getId", "()J", "Lru/ozon/app/android/ordertracking/v4/presentation/model/AllOrdersVO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/BarcodeVO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class OrderTrackingItemVO {
    private final long id;

    public /* synthetic */ OrderTrackingItemVO(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    public long getId() {
        return this.id;
    }

    private OrderTrackingItemVO(long j11) {
        this.id = j11;
    }
}
