package ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.di;

import DD.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.data.NightsRangeSelectorV3Mapper;
import ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation.NightsRangeSelectorV3ViewModel;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/di/NightsRangeSelectorV3Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/data/NightsRangeSelectorV3Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/data/NightsRangeSelectorV3Mapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3ViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/presentation/NightsRangeSelectorV3ViewModel;", "viewModel", "Companion", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NightsRangeSelectorV3Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/di/NightsRangeSelectorV3Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/tours/widgets/nightsRangeSelector/v3/di/NightsRangeSelectorV3Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NightsRangeSelectorV3Component create$lambda$0(final C7475g c7475g) {
            return new NightsRangeSelectorV3Component(c7475g) { // from class: ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.di.NightsRangeSelectorV3Component$Companion$create$1$1
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(NightsRangeSelectorV3Component$Companion$create$1$1$mapper$2.INSTANCE);

                {
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.di.NightsRangeSelectorV3Component
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.di.NightsRangeSelectorV3Component
                public NightsRangeSelectorV3Mapper getMapper() {
                    return (NightsRangeSelectorV3Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.di.NightsRangeSelectorV3Component
                public NightsRangeSelectorV3ViewModel getViewModel() {
                    return new NightsRangeSelectorV3ViewModel();
                }
            };
        }

        @NotNull
        public final C7473e<NightsRangeSelectorV3Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(NightsRangeSelectorV3Component.class), new a(storage, 14));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    NightsRangeSelectorV3Mapper getMapper();

    @NotNull
    NightsRangeSelectorV3ViewModel getViewModel();
}
