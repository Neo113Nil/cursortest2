package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v1.data.ButtonWidgetMapper;

@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"ru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v1/di/ButtonWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v1/di/ButtonWidgetComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v1/data/ButtonWidgetMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v1/data/ButtonWidgetMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonWidgetComponent$Companion$create$1$1 implements ButtonWidgetComponent {
    private final ContextComponentDependencies contextComponentDependencies;
    private final CustomActionHandlersComponentApi customActionComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new ButtonWidgetComponent$Companion$create$1$1$mapper$2(this));

    ButtonWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.customActionComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v1.di.ButtonWidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v1.di.ButtonWidgetComponent
    public ButtonWidgetMapper getMapper() {
        return (ButtonWidgetMapper) this.mapper.getValue();
    }
}
