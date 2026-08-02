package ru.ozon.app.android.pdp.widgets.sellerPoints.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pdp.widgets.sellerPoints.core.SellerPointsMapper;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"ru/ozon/app/android/pdp/widgets/sellerPoints/di/PdpSellerPointsWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/sellerPoints/di/PdpSellerPointsWidgetComponent;", "Lru/ozon/app/android/pdp/widgets/sellerPoints/core/SellerPointsMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/sellerPoints/core/SellerPointsMapper;", "mapper", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpSellerPointsWidgetComponent$Companion$create$1$1 implements PdpSellerPointsWidgetComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new PdpSellerPointsWidgetComponent$Companion$create$1$1$mapper$2(this));

    PdpSellerPointsWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContextComponentDependencies getContextComponentDependencies() {
        return (ContextComponentDependencies) this.$storage.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.sellerPoints.di.PdpSellerPointsWidgetComponent
    public SellerPointsMapper getMapper() {
        return (SellerPointsMapper) this.mapper.getValue();
    }
}
