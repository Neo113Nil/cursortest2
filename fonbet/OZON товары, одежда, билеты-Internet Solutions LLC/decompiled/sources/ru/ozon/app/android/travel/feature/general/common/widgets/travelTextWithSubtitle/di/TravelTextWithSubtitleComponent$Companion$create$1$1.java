package ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.data.TravelTextWithSubtitleMapper;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"ru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/di/TravelTextWithSubtitleComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/di/TravelTextWithSubtitleComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextApi", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/data/TravelTextWithSubtitleMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/data/TravelTextWithSubtitleMapper;", "mapper", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTextWithSubtitleComponent$Companion$create$1$1 implements TravelTextWithSubtitleComponent {
    private final ContextComponentDependencies contextApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new TravelTextWithSubtitleComponent$Companion$create$1$1$mapper$2(this));

    TravelTextWithSubtitleComponent$Companion$create$1$1(C7475g c7475g) {
        this.contextApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    public final ContextComponentDependencies getContextApi() {
        return this.contextApi;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.di.TravelTextWithSubtitleComponent
    public TravelTextWithSubtitleMapper getMapper() {
        return (TravelTextWithSubtitleMapper) this.mapper.getValue();
    }
}
