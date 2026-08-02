package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data.TravelCarriageSelectV3Mapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.multiFrameBinding.TravelCarriageSelectV3ViewStateBinder;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"ru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/di/TravelCarriageSelectV3Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/di/TravelCarriageSelectV3Component;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "retainComposerPerformanceComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/data/TravelCarriageSelectV3Mapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/multiFrameBinding/TravelCarriageSelectV3ViewStateBinder;", "getTravelCarriageSelectV3ViewStateBinder", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/multiFrameBinding/TravelCarriageSelectV3ViewStateBinder;", "travelCarriageSelectV3ViewStateBinder", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageSelectV3Component$Companion$create$1$1 implements TravelCarriageSelectV3Component {
    private final ContextComponentDependencies contextComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new TravelCarriageSelectV3Component$Companion$create$1$1$mapper$2(this));
    private final RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi;

    TravelCarriageSelectV3Component$Companion$create$1$1(C7475g c7475g) {
        this.contextComponentApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.retainComposerPerformanceComponentApi = (RetainComposerPerformanceComponentApi) c7475g.getComponent(RetainComposerPerformanceComponentApi.class);
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.di.TravelCarriageSelectV3Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.di.TravelCarriageSelectV3Component
    public FrameBinder getFrameBinder() {
        return this.retainComposerPerformanceComponentApi.getFrameBinder();
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.di.TravelCarriageSelectV3Component
    public TravelCarriageSelectV3Mapper getMapper() {
        return (TravelCarriageSelectV3Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.di.TravelCarriageSelectV3Component
    public TravelCarriageSelectV3ViewStateBinder getTravelCarriageSelectV3ViewStateBinder() {
        return new TravelCarriageSelectV3ViewStateBinder();
    }
}
