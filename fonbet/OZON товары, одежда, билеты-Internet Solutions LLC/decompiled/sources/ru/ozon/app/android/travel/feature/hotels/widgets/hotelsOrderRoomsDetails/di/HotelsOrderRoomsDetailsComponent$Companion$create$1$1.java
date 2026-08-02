package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.data.HotelsOrderRoomsDetailsMapper;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"ru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/di/HotelsOrderRoomsDetailsComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/di/HotelsOrderRoomsDetailsComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponent", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsOrderRoomsDetails/data/HotelsOrderRoomsDetailsMapper;", "mapper", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsOrderRoomsDetailsComponent$Companion$create$1$1 implements HotelsOrderRoomsDetailsComponent {
    private final ContextComponentDependencies contextComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new HotelsOrderRoomsDetailsComponent$Companion$create$1$1$mapper$2(this));
    private final RetainComposerComponentApi retainComposerComponent;

    HotelsOrderRoomsDetailsComponent$Companion$create$1$1(C7475g c7475g) {
        this.retainComposerComponent = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.contextComponentApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.di.HotelsOrderRoomsDetailsComponent
    public HotelsOrderRoomsDetailsMapper getMapper() {
        return (HotelsOrderRoomsDetailsMapper) this.mapper.getValue();
    }
}
