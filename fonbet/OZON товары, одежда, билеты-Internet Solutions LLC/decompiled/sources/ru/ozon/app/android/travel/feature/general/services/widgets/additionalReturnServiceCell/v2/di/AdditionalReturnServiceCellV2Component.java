package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.data.AdditionalReturnServiceCellV2Mapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.presentation.AdditionalReturnServiceCellV2ViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R)\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\"\u001a\u00060\u001ej\u0002`\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/di/AdditionalReturnServiceCellV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "asyncApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/data/AdditionalReturnServiceCellV2Mapper;", "additionalReturnServiceCellMapper$delegate", "LSc/j;", "getAdditionalReturnServiceCellMapper", "()Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/data/AdditionalReturnServiceCellV2Mapper;", "additionalReturnServiceCellMapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2ViewModel;", "kotlin.jvm.PlatformType", "widgetViewModelProvider$delegate", "getWidgetViewModelProvider", "()LPc/a;", "widgetViewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdditionalReturnServiceCellV2Component implements InterfaceC6958a {

    /* renamed from: additionalReturnServiceCellMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j additionalReturnServiceCellMapper;

    @NotNull
    private final ComposerWidgetAsyncComponentApi asyncApi;

    @NotNull
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;

    @NotNull
    private final CustomActionHandlersComponentApi customActionComponentApi;

    /* renamed from: widgetViewModelProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widgetViewModelProvider;

    public AdditionalReturnServiceCellV2Component(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.customActionComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
        this.asyncApi = (ComposerWidgetAsyncComponentApi) storage.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) storage.getComponent(CoroutineDispatchersComponentApi.class);
        this.additionalReturnServiceCellMapper = k.b(AdditionalReturnServiceCellV2Component$additionalReturnServiceCellMapper$2.INSTANCE);
        this.widgetViewModelProvider = k.b(new AdditionalReturnServiceCellV2Component$widgetViewModelProvider$2(this));
    }

    @NotNull
    public final AdditionalReturnServiceCellV2Mapper getAdditionalReturnServiceCellMapper() {
        return (AdditionalReturnServiceCellV2Mapper) this.additionalReturnServiceCellMapper.getValue();
    }

    @NotNull
    public final d getCustomActionHandlersStoreFactory() {
        return this.customActionComponentApi.getCustomActionHandlersStoreFactory();
    }

    @NotNull
    public final Pc.a<AdditionalReturnServiceCellV2ViewModel> getWidgetViewModelProvider() {
        return (Pc.a) this.widgetViewModelProvider.getValue();
    }
}
