package ru.ozon.app.android.orders.cml.parcelTimeline.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.orders.cml.parcelTimeline.core.ParcelTimelineParser;
import ru.ozon.app.android.orders.cml.parcelTimeline.data.ParcelTimelineMapper;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"ru/ozon/app/android/orders/cml/parcelTimeline/di/ParcelTimelineWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/orders/cml/parcelTimeline/di/ParcelTimelineWidgetComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "getNetworkComponentApi", "()Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/orders/cml/parcelTimeline/core/ParcelTimelineParser;", "parser$delegate", "LSc/j;", "getParser", "()Lru/ozon/app/android/orders/cml/parcelTimeline/core/ParcelTimelineParser;", "parser", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineMapper;", "mapper", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ParcelTimelineWidgetComponent$Companion$create$1$1 implements ParcelTimelineWidgetComponent {
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: parser$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j parser = k.b(new ParcelTimelineWidgetComponent$Companion$create$1$1$parser$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(ParcelTimelineWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);

    ParcelTimelineWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    @Override // ru.ozon.app.android.orders.cml.parcelTimeline.di.ParcelTimelineWidgetComponent
    public ParcelTimelineMapper getMapper() {
        return (ParcelTimelineMapper) this.mapper.getValue();
    }

    public final NetworkComponentApi getNetworkComponentApi() {
        return this.networkComponentApi;
    }

    @Override // ru.ozon.app.android.orders.cml.parcelTimeline.di.ParcelTimelineWidgetComponent
    public ParcelTimelineParser getParser() {
        return (ParcelTimelineParser) this.parser.getValue();
    }
}
