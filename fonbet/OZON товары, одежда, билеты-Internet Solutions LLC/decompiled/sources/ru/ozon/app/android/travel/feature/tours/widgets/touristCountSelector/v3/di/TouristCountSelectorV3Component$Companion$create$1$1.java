package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3ConfigMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3FooterMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3RoomsMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ViewModel;

@Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010%\u001a\u00060!j\u0002`\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"ru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/di/TouristCountSelectorV3Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/di/TouristCountSelectorV3Component;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3RoomsMapper;", "roomsMapper$delegate", "LSc/j;", "getRoomsMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3RoomsMapper;", "roomsMapper", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3ConfigMapper;", "configMapper$delegate", "getConfigMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3ConfigMapper;", "configMapper", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3FooterMapper;", "footerMapper$delegate", "getFooterMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3FooterMapper;", "footerMapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel;", "viewModelProvider$delegate", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouristCountSelectorV3Component$Companion$create$1$1 implements TouristCountSelectorV3Component {
    private final ActionComponentApi actionComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: roomsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j roomsMapper = k.b(TouristCountSelectorV3Component$Companion$create$1$1$roomsMapper$2.INSTANCE);

    /* renamed from: configMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j configMapper = k.b(TouristCountSelectorV3Component$Companion$create$1$1$configMapper$2.INSTANCE);

    /* renamed from: footerMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j footerMapper = k.b(TouristCountSelectorV3Component$Companion$create$1$1$footerMapper$2.INSTANCE);

    /* renamed from: viewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModelProvider = k.b(new TouristCountSelectorV3Component$Companion$create$1$1$viewModelProvider$2(this));

    TouristCountSelectorV3Component$Companion$create$1$1(C7475g c7475g) {
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.di.TouristCountSelectorV3Component
    public TouristCountSelectorV3ConfigMapper getConfigMapper() {
        return (TouristCountSelectorV3ConfigMapper) this.configMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.di.TouristCountSelectorV3Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.di.TouristCountSelectorV3Component
    public TouristCountSelectorV3FooterMapper getFooterMapper() {
        return (TouristCountSelectorV3FooterMapper) this.footerMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.di.TouristCountSelectorV3Component
    public TouristCountSelectorV3RoomsMapper getRoomsMapper() {
        return (TouristCountSelectorV3RoomsMapper) this.roomsMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.di.TouristCountSelectorV3Component
    public Pc.a<TouristCountSelectorV3ViewModel> getViewModelProvider() {
        return (Pc.a) this.viewModelProvider.getValue();
    }
}
